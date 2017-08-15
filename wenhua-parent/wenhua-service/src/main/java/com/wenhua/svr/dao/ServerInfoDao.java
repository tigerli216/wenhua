package com.wenhua.svr.dao;

import java.util.List;
import java.util.Map;

import com.wenhua.svr.domain.ServerInfo;

public interface ServerInfoDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ServerInfo record);

    int insertSelective(ServerInfo record);

    ServerInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ServerInfo record);

    int updateByPrimaryKey(ServerInfo record);
    
    ServerInfo selectByBarId(String barId);
    
    List<Map<String, Object>> selectAllServerInfoMap();
}