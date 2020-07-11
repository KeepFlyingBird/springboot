package cn.freefly.springboot.httpClientUtil.service.gj.persistence.impl;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjBusinessFinance;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjBusinessFinanceCriteria;
import cn.freefly.springboot.httpClientUtil.mapper.gj.CacmpGjBusinessFinanceMapper;
import cn.freefly.springboot.httpClientUtil.service.gj.persistence.GjBusinessFinaceService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassNmae GjBusinessFinaceServiceImpl
 * @Author xiao.yunfei
 * @Date 2020/3/28 21:21
 * @Desc
 */
@Service
public class GjBusinessFinaceServiceImpl implements GjBusinessFinaceService {
    @Autowired
    private CacmpGjBusinessFinanceMapper businessFinanceMapper;
    @Override
    public void insertGjBusinessFinance(CacmpGjBusinessFinance businessFinance) {
        businessFinanceMapper.insertSelective(businessFinance);
    }

    @Override
    public void modifyGjBusinessFinance(CacmpGjBusinessFinance businessFinance) {
        businessFinanceMapper.updateByPrimaryKeySelective(businessFinance);
    }

    @Override
    public CacmpGjBusinessFinance getCacmpGjBusinessFinanceByOrderId(String orderId) {
        CacmpGjBusinessFinanceCriteria example = new CacmpGjBusinessFinanceCriteria();
        CacmpGjBusinessFinanceCriteria.Criteria criteria = example.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        List<CacmpGjBusinessFinance> businessFinanceList = businessFinanceMapper.selectByExample(example);
        if(CollectionUtils.isNotEmpty(businessFinanceList)){
            return businessFinanceList.get(0);
        }
        return null;
    }
}
