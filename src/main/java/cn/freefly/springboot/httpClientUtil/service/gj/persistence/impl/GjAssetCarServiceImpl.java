package cn.freefly.springboot.httpClientUtil.service.gj.persistence.impl;

import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjAssetCar;
import cn.freefly.springboot.httpClientUtil.entity.gj.CacmpGjAssetCarCriteria;
import cn.freefly.springboot.httpClientUtil.mapper.gj.CacmpGjAssetCarMapper;
import cn.freefly.springboot.httpClientUtil.service.gj.persistence.GjAssetCarService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassNmae GjAssetCarServiceImpl
 * @Description 资产汽车业务类
 * @Author houjianhui
 * @Date 2020/3/25 14:11
 * @Version 1.0
 **/
@Service
@Slf4j
public class GjAssetCarServiceImpl implements GjAssetCarService {

    @Autowired
    private CacmpGjAssetCarMapper assetCarMapper;

    @Override
    public void modifyAssetCar(CacmpGjAssetCar assetCar) {
        assetCarMapper.updateByPrimaryKeySelective(assetCar);
    }

    @Override
    public void insertGjAssetCar(CacmpGjAssetCar assetCar) {
        assetCarMapper.insertSelective(assetCar);
    }

    @Override
    public CacmpGjAssetCar getAssetCarInfoByOrderId(String orderId) {
        CacmpGjAssetCarCriteria example = new CacmpGjAssetCarCriteria();
        CacmpGjAssetCarCriteria.Criteria criteria = example.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        List<CacmpGjAssetCar> cacmpGjAssetCars = assetCarMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(cacmpGjAssetCars)) {
            return cacmpGjAssetCars.get(0);
        }
        return null;
    }
}
