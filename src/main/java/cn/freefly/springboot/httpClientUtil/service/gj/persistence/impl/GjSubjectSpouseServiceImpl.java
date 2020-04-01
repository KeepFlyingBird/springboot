package cn.freefly.springboot.httpClientUtil.service.gj.persistence.impl;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjSubjectSpouse;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjSubjectSpouseCriteria;
import cn.freefly.springboot.httpClientUtil.mapper.gj.CacmpGjSubjectSpouseMapper;
import cn.freefly.springboot.httpClientUtil.service.gj.persistence.GjSubjectSpouseService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassNmae GjSubjectSpouseServiceImpl
 * @Author xiao.yunfei
 * @Date 2020/3/28 21:21
 * @Desc
 */
@Service
public class GjSubjectSpouseServiceImpl implements GjSubjectSpouseService {
    @Autowired
    private CacmpGjSubjectSpouseMapper subjectSpouseMapper;
    @Override
    public void insertGjSubjectSpouse(CacmpGjSubjectSpouse subjectSpouse) {
        subjectSpouseMapper.insertSelective(subjectSpouse);
    }

    @Override
    public void modifyGjSubjectSpouse(CacmpGjSubjectSpouse subjectSpouse) {
        subjectSpouseMapper.updateByPrimaryKeySelective(subjectSpouse);
    }

    @Override
    public CacmpGjSubjectSpouse getCacmpGjSubjectSpouseByOrderId(String orderId) {
        CacmpGjSubjectSpouseCriteria example = new CacmpGjSubjectSpouseCriteria();
        CacmpGjSubjectSpouseCriteria.Criteria criteria = example.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        List<CacmpGjSubjectSpouse> subjectSpouseList = subjectSpouseMapper.selectByExample(example);
        if(CollectionUtils.isNotEmpty(subjectSpouseList)){
            return subjectSpouseList.get(0);
        }
        return null;
    }
}
