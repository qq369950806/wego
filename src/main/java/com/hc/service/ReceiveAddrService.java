package com.hc.service;

import com.hc.domain.ReceiveAddr;
import com.hc.domain.vo.ReceiveAddrVO;

import java.util.List;

public interface ReceiveAddrService{

    int deleteByPrimaryKey(Long id);

    int insert(ReceiveAddr record);

    int insertSelective(ReceiveAddr record);

    ReceiveAddr selectByPrimaryKey(Long id);

    /**
     * 查询指定用户的所有的地址
     * @param userId
     * @return
     */
    List<ReceiveAddrVO> selectByUserId(Long userId);

    int updateByPrimaryKeySelective(ReceiveAddr record);

    int updateByPrimaryKey(ReceiveAddr record);

}
