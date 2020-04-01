package cn.freefly.springboot.httpClientUtil.service.gj.persistence.impl;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjSubjectPerson;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjSubjectPersonCriteria;
import cn.freefly.springboot.httpClientUtil.mapper.gj.CacmpGjSubjectPersonMapper;
import cn.freefly.springboot.httpClientUtil.service.gj.persistence.GjSubjectPersonService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassNmae GjSubjectPersonServiceImpl
 * @Description 主体自然人业务类
 * @Author houjianhui
 * @Date 2020/3/25 16:28
 * @Version 1.0
 **/
@Service
@Slf4j
public class GjSubjectPersonServiceImpl implements GjSubjectPersonService {

    @Autowired
    private CacmpGjSubjectPersonMapper subjectPersonMapper;

    @Override
    public void modifyGjSubjectPerson(CacmpGjSubjectPerson subjectPerson) {
        subjectPersonMapper.updateByPrimaryKeySelective(subjectPerson);
    }

    @Override
    public void insertGjSubjectPerson(CacmpGjSubjectPerson subjectPerson) {
        subjectPersonMapper.insertSelective(subjectPerson);
    }

    @Override
    public CacmpGjSubjectPerson getCacmpGjSubjectPersonByOrderId(String orderId) {
        CacmpGjSubjectPersonCriteria example = new CacmpGjSubjectPersonCriteria();
        CacmpGjSubjectPersonCriteria.Criteria criteria = example.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        List<CacmpGjSubjectPerson> cacmpGjSubjectPeople = subjectPersonMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(cacmpGjSubjectPeople)) {
            return cacmpGjSubjectPeople.get(0);
        }
        return null;
    }
}
