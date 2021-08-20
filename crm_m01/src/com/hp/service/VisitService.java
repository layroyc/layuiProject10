package com.hp.service;

import com.hp.bean.Visit;
import com.hp.dao.VisitDao;

import java.util.HashMap;
import java.util.Map;

public class VisitService {
    //新增
    public Map insertVisit(Visit visit){
        Map map = new HashMap();
        System.out.println("map = " + map);
        VisitDao visitDao=new VisitDao();
        int i = visitDao.insertVisit(visit);
        if(i==1){
            map.put("code",0);
            map.put("msg","添加成功");
        }else{
            map.put("code",400);
            map.put("msg","添加不成功");
        }
        return map;
    }
}
