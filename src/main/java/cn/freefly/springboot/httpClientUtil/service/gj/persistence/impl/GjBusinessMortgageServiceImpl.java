package cn.freefly.springboot.httpClientUtil.service.gj.persistence.impl;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjBusinessMortgage;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjBusinessMortgageCriteria;
import cn.freefly.springboot.httpClientUtil.mapper.gj.CacmpGjBusinessMortgageMapper;
import cn.freefly.springboot.httpClientUtil.service.gj.persistence.GjBusinessMortgageService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassNmae GjBusinessMortgageServiceImpl
 * @Description 抵押办理业务类
 * @Author houjianhui
 * @Date 2020/3/25 14:45
 * @Version 1.0
 **/
@Service
@Slf4j
public class GjBusinessMortgageServiceImpl implements GjBusinessMortgageService {

    @Autowired
    private CacmpGjBusinessMortgageMapper businessMortgageMapper;

    @Override
    public void insertBusinessMortgage(CacmpGjBusinessMortgage businessMortgage) {
        businessMortgageMapper.insertSelective(businessMortgage);
    }

    @Override
    public void modifyBusinessMortgage(CacmpGjBusinessMortgage businessMortgage) {
        businessMortgageMapper.updateByPrimaryKeySelective(businessMortgage);
    }

    @Override
    public CacmpGjBusinessMortgage getCacmpGjBusinessMortgageByOrderId(String orderId) {
        CacmpGjBusinessMortgageCriteria example = new CacmpGjBusinessMortgageCriteria();
        CacmpGjBusinessMortgageCriteria.Criteria criteria = example.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        List<CacmpGjBusinessMortgage> cacmpGjBusinessMortgages = businessMortgageMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(cacmpGjBusinessMortgages)) {
            return cacmpGjBusinessMortgages.get(0);
        }
        return null;
    }
}
