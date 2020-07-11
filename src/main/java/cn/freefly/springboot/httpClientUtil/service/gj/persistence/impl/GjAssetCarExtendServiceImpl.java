package cn.freefly.springboot.httpClientUtil.service.gj.persistence.impl;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjAssetCarExtend;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjAssetCarExtendCriteria;
import cn.freefly.springboot.httpClientUtil.mapper.gj.CacmpGjAssetCarExtendMapper;
import cn.freefly.springboot.httpClientUtil.service.gj.persistence.GjAssetCarExtendService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassNmae GjAssetCarExtendServiceImpl
 * @Description 资产汽车扩展信息业务类
 * @Author houjianhui
 * @Date 2020/3/25 14:35
 * @Version 1.0
 **/
@Service
@Slf4j
public class GjAssetCarExtendServiceImpl implements GjAssetCarExtendService {

    @Autowired
    private CacmpGjAssetCarExtendMapper gjAssetCarExtendMapper;

    @Override
    public void modifyAssetCarExtend(CacmpGjAssetCarExtend assetCarExtend) {
        gjAssetCarExtendMapper.updateByPrimaryKeySelective(assetCarExtend);
    }

    @Override
    public void insertGjAssetCarExtend(CacmpGjAssetCarExtend assetCarExtend) {
        gjAssetCarExtendMapper.insertSelective(assetCarExtend);
    }

    @Override
    public CacmpGjAssetCarExtend getAssetCarExtendByOrderId(String assetId) {
        CacmpGjAssetCarExtendCriteria example = new CacmpGjAssetCarExtendCriteria();
        CacmpGjAssetCarExtendCriteria.Criteria criteria = example.createCriteria();
        criteria.andOrderIdEqualTo(assetId);
        List<CacmpGjAssetCarExtend> cacmpGjAssetCarExtends = gjAssetCarExtendMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(cacmpGjAssetCarExtends)) {
            return cacmpGjAssetCarExtends.get(0);
        }
        return null;
    }
}
