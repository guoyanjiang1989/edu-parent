package com.gyj.edu.dao;

import com.gyj.edu.bean.SalaryDetail;
import java.util.List;

public interface SalaryDetailMapper {
    int deleteByPrimaryKey(String id);

    int insert(SalaryDetail record);

    SalaryDetail selectByPrimaryKey(String id);

    List<SalaryDetail> selectAll();

    int updateByPrimaryKey(SalaryDetail record);
}