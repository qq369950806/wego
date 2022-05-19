package com.hc.mapper;

import com.hc.domain.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CityMapper {
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
    List<City> selectByProvinceId(Integer provinceId);
}