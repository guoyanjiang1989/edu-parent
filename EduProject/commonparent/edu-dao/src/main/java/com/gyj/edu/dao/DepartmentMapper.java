package com.gyj.edu.dao;

import com.gyj.edu.bean.Department;
import java.util.List;

public interface DepartmentMapper {
    int deleteByPrimaryKey(String id);

    int insert(Department record);

    Department selectByPrimaryKey(String id);

    List<Department> selectAll();

    int updateByPrimaryKey(Department record);
}