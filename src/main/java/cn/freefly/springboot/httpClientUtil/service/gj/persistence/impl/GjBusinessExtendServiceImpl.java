package cn.freefly.springboot.httpClientUtil.service.gj.persistence.impl;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjBusinessInfoExtend;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjBusinessInfoExtendCriteria;
import cn.freefly.springboot.httpClientUtil.mapper.gj.CacmpGjBusinessInfoExtendMapper;
import cn.freefly.springboot.httpClientUtil.service.gj.persistence.GjBusinessExtendService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassNmae GjBusinessExtendServiceImpl
 * @Description 业务信息扩展信息业务类
 * @Author houjianhui
 * @Date 2020/3/25 17:20
 * @Version 1.0
 **/
@Service
@Slf4j
public class GjBusinessExtendServiceImpl implements GjBusinessExtendService {

    @Autowired
    private CacmpGjBusinessInfoExtendMapper businessInfoExtendMapper;

    @Override
    public void insertBusiExtend(CacmpGjBusinessInfoExtend businessInfoExtend) {
        businessInfoExtendMapper.insertSelective(businessInfoExtend);
    }

    @Override
    public void modifyBusiExtend(CacmpGjBusinessInfoExtend businessInfoExtend) {
        businessInfoExtendMapper.updateByPrimaryKeySelective(businessInfoExtend);
    }

    @Override
    public CacmpGjBusinessInfoExtend getBusinessInfoExtendByOrderId(String orderId) {
        CacmpGjBusinessInfoExtendCriteria example = new CacmpGjBusinessInfoExtendCriteria();
        CacmpGjBusinessInfoExtendCriteria.Criteria criteria = example.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        List<CacmpGjBusinessInfoExtend> cacmpGjBusinessInfoExtends = businessInfoExtendMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(cacmpGjBusinessInfoExtends)) {
            return cacmpGjBusinessInfoExtends.get(0);
        }
        return null;
    }
}
