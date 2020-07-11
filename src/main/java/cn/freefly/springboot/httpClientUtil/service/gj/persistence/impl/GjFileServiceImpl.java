package cn.freefly.springboot.httpClientUtil.service.gj.persistence.impl;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjFile;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjFileCriteria;
import cn.freefly.springboot.httpClientUtil.mapper.gj.CacmpGjFileMapper;
import cn.freefly.springboot.httpClientUtil.service.gj.persistence.GjFileService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * @ClassNmae GjFileServiceImpl
 * @Description 文件业务处理类
 * @Author houjianhui
 * @Date 2020/3/23 15:17
 * @Version 1.0
 **/
@Service
@Slf4j
public class GjFileServiceImpl implements GjFileService {

    @Autowired
    private CacmpGjFileMapper cacmpGjFileMapper;

    @Override
    public List<CacmpGjFile> listGjFileByStage(String orderId, String stage) {
        log.info("根据订单ID、阶段查询文件数据参数：{}，{}", orderId, stage);
        if (Objects.isNull(orderId) || Objects.isNull(stage)) {
            log.info("根据阶段查询文件数据参数为空");
            return null;
        }
        CacmpGjFileCriteria example = new CacmpGjFileCriteria();
        CacmpGjFileCriteria.Criteria criteria = example.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        criteria.andFileStageTypeEqualTo(stage);
        List<CacmpGjFile> cacmpGjFiles = cacmpGjFileMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(cacmpGjFiles)) {
            return cacmpGjFiles;
        }
        return null;
    }

    @Override
    public CacmpGjFile findGjFileByOrderIdAndStageAndFileName(String orderId, String stage, String fileName) {
        log.info("通过订单号、阶段、文件名称查询文件地址信息参数：{}，{}，{}", orderId, stage, fileName);
        if (Objects.isNull(orderId) || Objects.isNull(stage) || Objects.isNull(fileName)) {
            log.info("通过订单号、阶段、文件名称查询文件地址信息参数为空");
            return null;
        }
        CacmpGjFileCriteria example = new CacmpGjFileCriteria();
        CacmpGjFileCriteria.Criteria criteria = example.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        criteria.andFileStageTypeEqualTo(stage);
        criteria.andFileNameEqualTo(fileName);
        List<CacmpGjFile> cacmpGjFiles = cacmpGjFileMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(cacmpGjFiles)) {
            return cacmpGjFiles.get(0);
        }
        return null;
    }
}
