package com.hc.translate;

import com.hc.domain.City;
import com.hc.domain.vo.CityVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CityTrans {
    CityTrans mapper = Mappers.getMapper(CityTrans.class);

    List<CityVO> provinceList2provinceVOList(List<City> cityList);
}
