package com.hc.mapper;

import com.hc.domain.ReceiveAddr;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReceiveAddrMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ReceiveAddr record);

    int insertSelective(ReceiveAddr record);

    ReceiveAddr selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ReceiveAddr record);

    int updateByPrimaryKey(ReceiveAddr record);

    /**
     * 查找指定用户的地址
     * @param userId
     * @return
     */
    List<ReceiveAddr> selectByUserId(Long userId);
}