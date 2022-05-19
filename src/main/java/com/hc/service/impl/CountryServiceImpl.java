package com.hc.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hc.domain.Country;
import com.hc.mapper.CountryMapper;
import com.hc.service.CountryService;
@Service
public class CountryServiceImpl implements CountryService{

    @Resource
    private CountryMapper countryMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return countryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Country record) {
        return countryMapper.insert(record);
    }

    @Override
    public int insertSelective(Country record) {
        return countryMapper.insertSelective(record);
    }

    @Override
    public Country selectByPrimaryKey(Integer id) {
        return countryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Country record) {
        return countryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Country record) {
        return countryMapper.updateByPrimaryKey(record);
    }

}
