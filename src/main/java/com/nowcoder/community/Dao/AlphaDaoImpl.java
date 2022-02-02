package com.nowcoder.community.Dao;

import org.springframework.stereotype.Repository;

@Repository("alphahiberta")
public class AlphaDaoImpl implements AlphaDao{
    @Override
    public String select(){
        return "hibernate";
    }
}
