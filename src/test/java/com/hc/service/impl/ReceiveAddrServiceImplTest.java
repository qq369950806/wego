package com.hc.service.impl;

import com.hc.domain.vo.ReceiveAddrVO;
import com.hc.service.ReceiveAddrService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration({"/spring.xml", "/mybatis.xml"})
class ReceiveAddrServiceImplTest {

    @Resource
    private ReceiveAddrService receiveAddrService;

    @Test
    void deleteByPrimaryKey() {

    }

    @Test
    void insert() {
    }

    @Test
    void insertSelective() {
    }

    @Test
    void selectByPrimaryKey() {
    }

    @Test
    void selectByUserId() {
        final List<ReceiveAddrVO> res = receiveAddrService.selectByUserId(192L);
        res.forEach(System.out::println);
    }

    @Test
    void updateByPrimaryKeySelective() {
    }

    @Test
    void updateByPrimaryKey() {
    }
}