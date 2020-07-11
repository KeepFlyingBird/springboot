package cn.freefly.springboot.httpClientUtil.service.gj.persistence.impl;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjSubjectContacts;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjSubjectContactsCriteria;
import cn.freefly.springboot.httpClientUtil.mapper.gj.CacmpGjSubjectContactsMapper;
import cn.freefly.springboot.httpClientUtil.service.gj.persistence.GjSubjectContactsService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassNmae GjSubjectContactsServiceImpl
 * @Author xiao.yunfei
 * @Date 2020/3/28 21:21
 * @Desc
 */
@Service
public class GjSubjectContactsServiceImpl implements GjSubjectContactsService {
    @Autowired
    private CacmpGjSubjectContactsMapper subjectContactsMapper;

    @Override
    public void insertGjSubjectContacts(CacmpGjSubjectContacts subjectContacts) {
        subjectContactsMapper.insertSelective(subjectContacts);
    }

    @Override
    public void modifyGjSubjectContacts(CacmpGjSubjectContacts subjectContacts) {
        subjectContactsMapper.updateByPrimaryKeySelective(subjectContacts);
    }

    @Override
    public List<CacmpGjSubjectContacts> getCacmpGjSubjectContactsByOrderId(String orderId) {
        CacmpGjSubjectContactsCriteria example = new CacmpGjSubjectContactsCriteria();
        CacmpGjSubjectContactsCriteria.Criteria criteria = example.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        List<CacmpGjSubjectContacts> subjectContactsList = subjectContactsMapper.selectByExample(example);
        if(CollectionUtils.isNotEmpty(subjectContactsList)){
            return subjectContactsList;
        }
        return null;
    }

    @Override
    public void deleteGjSubjectContacts(String orderId) {
        CacmpGjSubjectContactsCriteria example = new CacmpGjSubjectContactsCriteria();
        CacmpGjSubjectContactsCriteria.Criteria criteria = example.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        subjectContactsMapper.deleteByExample(example);
    }
}
