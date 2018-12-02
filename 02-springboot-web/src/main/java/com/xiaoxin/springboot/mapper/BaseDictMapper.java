package com.xiaoxin.springboot.mapper;

import com.xiaoxin.springboot.model.BaseDict;

import java.util.List;

public interface BaseDictMapper {
    //查询
    public List<BaseDict> selectBaseDictListByCode(String code);



}
