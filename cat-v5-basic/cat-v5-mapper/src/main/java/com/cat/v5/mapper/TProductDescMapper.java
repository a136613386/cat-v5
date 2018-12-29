package com.cat.v5.mapper;

import com.cat.v5.entity.TProductDesc;

public interface TProductDescMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TProductDesc record);

    int insertSelective(TProductDesc record);

    TProductDesc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TProductDesc record);

    int updateByPrimaryKey(TProductDesc record);
}