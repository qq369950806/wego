package com.hc.mapper;

import com.hc.domain.ReceiveAddr;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;
import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration({"/spring.xml", "/mybatis.xml"})
class ReceiveAddrMapperTest {

    @Resource
    private ReceiveAddrMapper receiveAddrMapper;

    @Test
    void selectByUserId() {
        final List<ReceiveAddr> res = receiveAddrMapper.selectByUserId(192L);
        res.forEach(System.out::println);
    }
}