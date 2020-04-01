package cn.freefly.springboot.httpClientUtil.service.gj.persistence.impl;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjBusinessInfo;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjBusinessInfoCriteria;
import cn.freefly.springboot.httpClientUtil.mapper.gj.CacmpGjBusinessInfoMapper;
import cn.freefly.springboot.httpClientUtil.service.gj.persistence.GjBusinessService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassNmae GjBusinessServiceImpl
 * @Author xiao.yunfei
 * @Date 2020/3/28 21:20
 * @Desc
 */
@Service
public class GjBusinessServiceImpl implements GjBusinessService {
    @Autowired
    private CacmpGjBusinessInfoMapper businessInfoMapper;

    @Override
    public void insertGjBusinessInfo(CacmpGjBusinessInfo businessInfo) {
        businessInfoMapper.insertSelective(businessInfo);
    }

    @Override
    public void modifyGjBusinessInfo(CacmpGjBusinessInfo businessInfo) {
        businessInfoMapper.updateByPrimaryKeySelective(businessInfo);
    }

    @Override
    public CacmpGjBusinessInfo getCacmpGjBusinessInfoByOrderId(String orderId) {
        CacmpGjBusinessInfoCriteria example = new CacmpGjBusinessInfoCriteria();
        CacmpGjBusinessInfoCriteria.Criteria criteria = example.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        List<CacmpGjBusinessInfo> businessInfoList = businessInfoMapper.selectByExample(example);
        if(CollectionUtils.isNotEmpty(businessInfoList)){
            return businessInfoList.get(0);
        }
        return null;
    }
}
