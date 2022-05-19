package com.hc.mapper;

import com.hc.domain.Province;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration({"/spring.xml", "/mybatis.xml"})
class ProvinceMapperTest {

    @Resource
    private ProvinceMapper provinceMapper;

    @Test
    void selectList() {
        List<Province> provinceList = provinceMapper.selectList();
        provinceList.forEach(System.out::println);
    }
}