package cn.freefly.springboot.httpClientUtil.service.gj.persistence.impl;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjAssetCarAssessment;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjAssetCarAssessmentCriteria;
import cn.freefly.springboot.httpClientUtil.mapper.gj.CacmpGjAssetCarAssessmentMapper;
import cn.freefly.springboot.httpClientUtil.service.gj.persistence.GjAssetCarAssessmentService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassNmae GjAssetCarAssessmentServiceImpl
 * @Author xiao.yunfei
 * @Date 2020/3/28 16:44
 * @Desc
 */
@Service
public class GjAssetCarAssessmentServiceImpl implements GjAssetCarAssessmentService {
    @Autowired
    private CacmpGjAssetCarAssessmentMapper assetCarAssessmentMapper;

    @Override
    public void insertGjAssetCarAssessment(CacmpGjAssetCarAssessment assetCarAssessment) {
        assetCarAssessmentMapper.insertSelective(assetCarAssessment);
    }

    @Override
    public void modifyGjAssetCarAssessment(CacmpGjAssetCarAssessment assetCarAssessment) {
        assetCarAssessmentMapper.updateByPrimaryKeySelective(assetCarAssessment);
    }

    @Override
    public CacmpGjAssetCarAssessment getCacmpGjAssetCarAssessmentByOrderId(String orderId) {
        CacmpGjAssetCarAssessmentCriteria example = new CacmpGjAssetCarAssessmentCriteria();
        CacmpGjAssetCarAssessmentCriteria.Criteria criteria = example.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        List<CacmpGjAssetCarAssessment> assetCarAssessmentList = assetCarAssessmentMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(assetCarAssessmentList)) {
            return assetCarAssessmentList.get(0);
        }
        return null;
    }
}
