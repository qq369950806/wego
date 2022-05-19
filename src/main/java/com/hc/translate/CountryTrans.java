package com.hc.translate;

import com.hc.domain.Country;
import com.hc.domain.vo.CountryVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CountryTrans {
    CountryTrans mapper = Mappers.getMapper(CountryTrans.class);

    List<CountryVO> countryList2CountryVOList(List<Country> countryList);
}
