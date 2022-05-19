package com.hc.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hc.domain.City;
import com.hc.mapper.CityMapper;
import com.hc.service.CityService;
@Service
public class CityServiceImpl implements CityService{

    @Resource
    private CityMapper cityMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return cityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(City record) {
        return cityMapper.insert(record);
    }

    @Override
    public int insertSelective(City record) {
        return cityMapper.insertSelective(record);
    }

    @Override
    public City selectByPrimaryKey(Integer id) {
        return cityMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(City record) {
        return cityMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(City record) {
        return cityMapper.updateByPrimaryKey(record);
    }

}
