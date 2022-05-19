package com.hc.mapper;

import com.hc.domain.Country;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CountryMapper {
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
    List<Country> selectByCityId(Integer cityId);
}