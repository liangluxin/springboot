package com.xiaoxin.springboot.service;

import com.xiaoxin.springboot.model.BaseDict;

import java.util.List;


public interface BaseDictService {

    public List<BaseDict> selectBaseDictList(String code);
}
