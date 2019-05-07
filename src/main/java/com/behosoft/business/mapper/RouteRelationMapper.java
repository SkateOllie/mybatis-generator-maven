package com.behosoft.business.mapper;

import com.behosoft.lis.model.bo.RouteRelation;

public interface RouteRelationMapper {
    int deleteByPrimaryKey(String id);

    int insert(RouteRelation record);

    int insertSelective(RouteRelation record);

    RouteRelation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RouteRelation record);

    int updateByPrimaryKey(RouteRelation record);
}