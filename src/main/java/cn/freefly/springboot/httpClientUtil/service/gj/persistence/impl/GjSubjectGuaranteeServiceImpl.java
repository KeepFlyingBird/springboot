package cn.freefly.springboot.httpClientUtil.service.gj.persistence.impl;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjSubjectGuarantee;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjSubjectGuaranteeCriteria;
import cn.freefly.springboot.httpClientUtil.mapper.gj.CacmpGjSubjectGuaranteeMapper;
import cn.freefly.springboot.httpClientUtil.service.gj.persistence.GjSubjectGuaranteeService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassNmae GjSubjectGuaranteeServiceImpl
 * @Author xiao.yunfei
 * @Date 2020/3/28 21:21
 * @Desc
 */
@Service
public class GjSubjectGuaranteeServiceImpl implements GjSubjectGuaranteeService {
    @Autowired
    private CacmpGjSubjectGuaranteeMapper subjectGuaranteeMapper;

    @Override
    public void insertGjSubjectGuarantee(CacmpGjSubjectGuarantee subjectGuarantee) {
        subjectGuaranteeMapper.insertSelective(subjectGuarantee);
    }

    @Override
    public void modifyGjSubjectGuarantee(CacmpGjSubjectGuarantee subjectGuarantee) {
        subjectGuaranteeMapper.updateByPrimaryKeySelective(subjectGuarantee);
    }

    @Override
    public List<CacmpGjSubjectGuarantee> getCacmpGjSubjectGuaranteeByOrderId(String orderId) {
        CacmpGjSubjectGuaranteeCriteria example = new CacmpGjSubjectGuaranteeCriteria();
        CacmpGjSubjectGuaranteeCriteria.Criteria criteria = example.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        List<CacmpGjSubjectGuarantee> subjectGuaranteeList = subjectGuaranteeMapper.selectByExample(example);
        if(CollectionUtils.isNotEmpty(subjectGuaranteeList)){
            return subjectGuaranteeList;
        }
        return null;
    }

    @Override
    public void deleteGjSubjectGuarantee(String orderId) {
        CacmpGjSubjectGuaranteeCriteria example = new CacmpGjSubjectGuaranteeCriteria();
        CacmpGjSubjectGuaranteeCriteria.Criteria criteria = example.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        subjectGuaranteeMapper.deleteByExample(example);
    }
}
