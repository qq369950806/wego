package com.hc.translate;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReceiveAddrTrans {
    ReceiveAddrTrans mapper = Mappers.getMapper(ReceiveAddrTrans.class);
}
