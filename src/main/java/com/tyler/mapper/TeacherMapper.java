package com.tyler.mapper;

import com.tyler.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by tyler on 2016/12/20.
 */
public interface TeacherMapper {
    public Teacher selectTeacher(Teacher teacher);
    public List<Map<String,Object>> test_if(Teacher teacher);
    public List<Map<String,Object>> test_choose_when_otherwise(Teacher teacher);
    public List<Map<String,Object>> test_where(Teacher teacher);
    public List<Map<String,Object>> test_trim(Teacher teacher);
    public int test_set(Teacher teacher);
    public int test_foreach(List<Teacher> list);
    public List<Map<String,Object>> test_bind(Teacher teacher);
    public List<Map<String,Object>> test_bind_more(@Param("name") String name,@Param("sex") String sex);
}
