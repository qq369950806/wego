package com.hc.service.impl;

import com.hc.domain.Province;
import com.hc.mapper.ProvinceMapper;
import com.hc.service.ProvinceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("provinceService")
public class ProvinceServiceImpl implements ProvinceService{

    @Resource
    private ProvinceMapper provinceMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return provinceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Province record) {
        return provinceMapper.insert(record);
    }

    @Override
    public int insertSelective(Province record) {
        return provinceMapper.insertSelective(record);
    }

    @Override
    public Province selectByPrimaryKey(Integer id) {
        return provinceMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Province record) {
        return provinceMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Province record) {
        return provinceMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Province> selectList() {
        List<Province> list = provinceMapper.selectList();
        return list;
    }

}
