package com.hc.service.impl;

import com.hc.domain.Country;
import com.hc.domain.vo.CountryVO;
import com.hc.mapper.CountryMapper;
import com.hc.service.CountryService;
import com.hc.translate.CountryTrans;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("countryService")
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

    @Override
    public List<CountryVO> selectByCityId(Integer cityId) {
        List<Country> countryList = countryMapper.selectByCityId(cityId);
        List<CountryVO> countryVOList = CountryTrans.mapper.countryList2CountryVOList(countryList);
        return countryVOList;
    }

}
