package com.hc.mapper;

import com.hc.domain.City;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;
import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration({"/spring.xml", "/mybatis.xml"})
class CityMapperTest {

    @Resource
    private CityMapper cityMapper;

    @Test
    void fun(){
        System.out.println(cityMapper);
    }

    @Test
    void selectByProvinceId() {
        List<City> cityList = cityMapper.selectByProvinceId(8);
        cityList.forEach(System.out::println);
    }
}