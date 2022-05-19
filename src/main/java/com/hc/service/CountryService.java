package com.hc.service;

import com.hc.domain.Country;
import com.hc.domain.vo.CountryVO;

import java.util.List;

public interface CountryService{

    int deleteByPrimaryKey(Integer id);

    int insert(Country record);

    int insertSelective(Country record);

    Country selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Country record);

    int updateByPrimaryKey(Country record);

    /**
     * 查询指定城市编号下的县区
     * @param cityId
     * @return
     */
    List<CountryVO> selectByCityId(Integer cityId);
}
