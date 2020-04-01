package cn.freefly.springboot.httpClientUtil.service.gj.persistence.impl;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjAssetRealEstate;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjAssetRealEstateCriteria;
import cn.freefly.springboot.httpClientUtil.mapper.gj.CacmpGjAssetRealEstateMapper;
import cn.freefly.springboot.httpClientUtil.service.gj.persistence.GjAssetRealEstatesService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassNmae GjAssetRealEstatesServiceImpl
 * @Author xiao.yunfei
 * @Date 2020/3/28 21:20
 * @Desc
 */
@Service
public class GjAssetRealEstatesServiceImpl implements GjAssetRealEstatesService {
    @Autowired
    private CacmpGjAssetRealEstateMapper assetRealEstateMapper;
    @Override
    public void insertGjAssetRealEstates(CacmpGjAssetRealEstate assetRealEstate) {
        assetRealEstateMapper.insertSelective(assetRealEstate);
    }

    @Override
    public void modifyGjAssetRealEstates(CacmpGjAssetRealEstate assetRealEstate) {
        assetRealEstateMapper.updateByPrimaryKeySelective(assetRealEstate);
    }

    @Override
    public CacmpGjAssetRealEstate getCacmpGjAssetRealEstateByOrderId(String orderId) {
        CacmpGjAssetRealEstateCriteria example = new CacmpGjAssetRealEstateCriteria();
        CacmpGjAssetRealEstateCriteria.Criteria criteria = example.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        List<CacmpGjAssetRealEstate> assetRealEstateList = assetRealEstateMapper.selectByExample(example);
        if(CollectionUtils.isNotEmpty(assetRealEstateList)){
            return assetRealEstateList.get(0);
        }
        return null;
    }
}
