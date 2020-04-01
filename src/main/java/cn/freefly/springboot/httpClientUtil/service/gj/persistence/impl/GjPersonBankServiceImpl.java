package cn.freefly.springboot.httpClientUtil.service.gj.persistence.impl;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjPersonBank;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjPersonBankCriteria;
import cn.freefly.springboot.httpClientUtil.mapper.gj.CacmpGjPersonBankMapper;
import cn.freefly.springboot.httpClientUtil.service.gj.persistence.GjPersonBankService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassNmae GjPersonBankServiceImpl
 * @Author xiao.yunfei
 * @Date 2020/3/29 15:47
 * @Desc
 */
@Service
public class GjPersonBankServiceImpl implements GjPersonBankService {
    @Autowired
    private CacmpGjPersonBankMapper personBankMapper;

    @Override
    public void insertGjPersonBank(CacmpGjPersonBank personBank) {
        personBankMapper.insertSelective(personBank);
    }

    @Override
    public void modifyGjPersonBank(CacmpGjPersonBank personBank) {
        personBankMapper.updateByPrimaryKeySelective(personBank);
    }

    @Override
    public CacmpGjPersonBank getCacmpGjPersonBankByOrderId(String orderId,String bankAccount) {
        CacmpGjPersonBankCriteria example = new CacmpGjPersonBankCriteria();
        CacmpGjPersonBankCriteria.Criteria criteria = example.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        criteria.andBankAccountEqualTo(bankAccount);
        List<CacmpGjPersonBank> personBankList = personBankMapper.selectByExample(example);
        if(CollectionUtils.isNotEmpty(personBankList)){
            return personBankList.get(0);
        }
        return null;
    }
}
