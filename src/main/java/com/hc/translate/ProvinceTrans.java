package com.hc.translate;

import com.hc.domain.Province;
import com.hc.domain.vo.ProvinceVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProvinceTrans {
    ProvinceTrans mapper = Mappers.getMapper(ProvinceTrans.class);

    List<ProvinceVO> provinceList2ProvinceVOList(List<Province> provinceList);

}
