package com.hc.service.impl;

import com.hc.domain.City;
import com.hc.domain.Country;
import com.hc.domain.Province;
import com.hc.domain.ReceiveAddr;
import com.hc.domain.vo.ReceiveAddrVO;
import com.hc.mapper.CityMapper;
import com.hc.mapper.CountryMapper;
import com.hc.mapper.ProvinceMapper;
import com.hc.mapper.ReceiveAddrMapper;
import com.hc.service.ReceiveAddrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReceiveAddrServiceImpl implements ReceiveAddrService{

    @Resource
    private ReceiveAddrMapper receiveAddrMapper;
    @Resource
    private ProvinceMapper provinceMapper;
    @Resource
    private CityMapper cityMapper;
    @Resource
    private CountryMapper countryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return receiveAddrMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ReceiveAddr record) {
        return receiveAddrMapper.insert(record);
    }

    @Override
    public int insertSelective(ReceiveAddr record) {
        return receiveAddrMapper.insertSelective(record);
    }

    @Override
    public ReceiveAddr selectByPrimaryKey(Long id) {
        return receiveAddrMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ReceiveAddrVO> selectByUserId(Long userId) {
        List<ReceiveAddrVO> res = new ArrayList<>();

        List<ReceiveAddr> receiveAddrList = receiveAddrMapper.selectByUserId(userId);
        for (ReceiveAddr receiveAddr : receiveAddrList) {
            final ReceiveAddrVO receiveAddrVO = ReceiveAddrVO.doamin2VO(receiveAddr);

            final Integer countryId = receiveAddr.getCountryId();
            final Country country = countryMapper.selectByPrimaryKey(countryId);
            receiveAddrVO.setCountry(country.getName());
            final City city = cityMapper.selectByPrimaryKey(country.getCityId());
            receiveAddrVO.setCity(city.getName());
            final Province province = provinceMapper.selectByPrimaryKey(city.getProvinceId());
            receiveAddrVO.setProvince(province.getName());
            res.add(receiveAddrVO);
        }
        return res;
    }

    @Override
    public int updateByPrimaryKeySelective(ReceiveAddr record) {
        return receiveAddrMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ReceiveAddr record) {
        return receiveAddrMapper.updateByPrimaryKey(record);
    }

}
