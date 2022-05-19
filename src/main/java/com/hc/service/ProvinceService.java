package com.hc.service;

import com.hc.domain.Province;

import java.util.List;

public interface ProvinceService{


    int deleteByPrimaryKey(Integer id);

    int insert(Province record);

    int insertSelective(Province record);

    Province selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Province record);

    int updateByPrimaryKey(Province record);

    /**
     * 查所有的省份
     * @return
     */
    List<Province> selectList();
}
