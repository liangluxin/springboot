package com.xiaoxin.springboot.service.impl;

import com.xiaoxin.springboot.mapper.BaseDictMapper;
import com.xiaoxin.springboot.model.BaseDict;
import com.xiaoxin.springboot.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseDictServiceImpl implements BaseDictService {

    @Autowired
    private BaseDictMapper baseDictMapper;
    @Override
    public List<BaseDict> selectBaseDictList(String code) {
        return baseDictMapper.selectBaseDictListByCode(code);
    }


/*  @Autowired
  private BaseDictDao baseDictDao;
    @Override
    public List<BaseDict> selectBaseDictListByCode(String code) {
        return baseDictDao.selectBaseDictListByCode(code);
    }*/

}
