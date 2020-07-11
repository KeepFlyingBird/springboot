package cn.freefly.springboot.devUtils;

import cn.freefly.springboot.mybatis.mapper.CacmpGenerateIdMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassNmae GenerateNoUtils
 * @Author xiao.yunfei
 * @Date 2020/3/12 21:04
 * @Desc
 */
@Service
@Slf4j
public class GenerateNoUtils {
    @Autowired
    private CacmpGenerateIdMapper cacmpGenerateIdMapper;

    private static AtomicInteger NO_SEQUENCE = new AtomicInteger(0);

    private static String STR_FORMAT = "000000";


    @Transactional
    public String generateApplyNo(String organization, String applyType, String channelNumber) {
        if (Objects.isNull(organization) || Objects.isNull(applyType) || Objects.isNull(channelNumber))
            return null;
        StringBuffer sb = new StringBuffer();
        sb.append(organization).append(applyType).append(channelNumber);
        String currentDate = DateUtil.dateToYmdStr(new Date());
        sb.append(currentDate);
        cacmpGenerateIdMapper.generateNextId();
        Integer nextId = cacmpGenerateIdMapper.getMaxId();
        String newId = leftPad(nextId, STR_FORMAT);
        sb.append(newId);
        log.info("生成邮储申请编号为：{}", sb.toString());
        return sb.toString();
    }

    public static String generateSequence() {
        String formlessStr = DateUtil.dateToFormlessYmdHmsStr(new Date());
        int num = NO_SEQUENCE.incrementAndGet();
        String seq = leftPad(num,STR_FORMAT);
        formlessStr = formlessStr.concat(seq);
        log.info("生产邮储请求流水号：{}", formlessStr);
        return formlessStr;
    }

    public static String leftPad(int num,String strFormat){
        DecimalFormat df = new DecimalFormat(strFormat);
        return df.format(num);
    }
}
