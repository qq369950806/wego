package com.hc.service;

import com.hc.domain.City;
import com.hc.domain.vo.CityVO;

import java.util.List;

public interface CityService{


    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);

    /**
     * 查找指定省份下的城市
     * @param provinceId
     * @return
     */
    List<CityVO> selectByProvinceId(Integer provinceId);
}
