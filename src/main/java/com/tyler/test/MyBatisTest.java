package com.tyler.test;

import com.tyler.mapper.TeacherMapper;
import com.tyler.pojo.Teacher;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * Created by tyler on 2016/12/20.
 */
public class MyBatisTest {
    private static SqlSession sqlSession;
    @Test
    public void query(){
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
            Teacher teacher = teacherMapper.selectTeacher(new Teacher(1,"a","asd",12,"a"));
            System.out.println(teacher.toString());
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
    }
    @Test
    public void test_if(){
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
            List<Map<String,Object>> list = teacherMapper.test_if(new Teacher("c","",12,"a"));
            for(int i = 0;i<list.size();i++){
                Map map = list.get(i);
                Set set = map.keySet();
                Iterator iterator = set.iterator();
                while(iterator.hasNext()){
                    String key = iterator.next().toString();
                    String value = map.get(key).toString();
                    System.out.println(key+"---"+value);
                }
            }


            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
    }
    @Test
    public void test_choose_when_otherwise(){
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
            List<Map<String,Object>> list = teacherMapper.test_choose_when_otherwise(new Teacher("c","",12,"a"));
            for(int i = 0;i<list.size();i++){
                Map map = list.get(i);
                Set set = map.keySet();
                Iterator iterator = set.iterator();
                while(iterator.hasNext()){
                    String key = iterator.next().toString();
                    String value = map.get(key).toString();
                    System.out.println(key+"---"+value);
                }
            }


            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
    }
    @Test
    public void test_where(){
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
            List<Map<String,Object>> list = teacherMapper.test_where(new Teacher("c","f",12,"a"));
            for(int i = 0;i<list.size();i++){
                Map map = list.get(i);
                Set set = map.keySet();
                Iterator iterator = set.iterator();
                while(iterator.hasNext()){
                    String key = iterator.next().toString();
                    String value = map.get(key).toString();
                    System.out.println(key+"---"+value);
                }
            }
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
    }
    @Test
    public void test_trim(){
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
            List<Map<String,Object>> list = teacherMapper.test_trim(new Teacher("c","s",12,"a"));
            for(int i = 0;i<list.size();i++){
                Map map = list.get(i);
                Set set = map.keySet();
                Iterator iterator = set.iterator();
                while(iterator.hasNext()){
                    String key = iterator.next().toString();
                    String value = map.get(key).toString();
                    System.out.println(key+"---"+value);
                }
            }
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
    }
    @Test
    public void test_set(){
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
            int i = teacherMapper.test_set(new Teacher(1,"你好","aaa",12,"a"));
            sqlSession.commit();
            System.out.println(i+"成功");
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            if(sqlSession!=null)
                sqlSession.close();
        }

    }
    @Test
    public void test_foreach(){
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
            Teacher teacher = new Teacher("小明","m",20,"很好");
            Teacher teacher1 = new Teacher("小红","f",22,"很棒");
            Teacher teacher2 = new Teacher("小花","f",21,"很美");
            Teacher teacher3 = new Teacher("小刚","m",23,"很次");
            Teacher teacher4 = new Teacher("小美","f",22,"很胖");
            List<Teacher> list = new ArrayList<Teacher>();
            list.add(teacher);
            list.add(teacher1);
            list.add(teacher2);
            list.add(teacher3);
            list.add(teacher4);
            int i = teacherMapper.test_foreach(list);
            sqlSession.commit();
            System.out.println("添加了"+i+"行 "+"成功了");
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            if(sqlSession!=null)
                sqlSession.close();
        }
    }
    @Test
    public void test_bind(){
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
            Teacher teacher = new Teacher();
            teacher.setName("小");
            List<Map<String,Object>> list = teacherMapper.test_bind(teacher);
            for(int i = 0;i<list.size();i++){
                Map map = list.get(i);
                Set set = map.keySet();
                Iterator iterator = set.iterator();
                while(iterator.hasNext()){
                    String key = iterator.next().toString();
                    String value = map.get(key).toString();
                    System.out.println(key+"---"+value);
                }
            }
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
    }
    @Test
    public void test_bind_more(){
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);

            List<Map<String,Object>> list = teacherMapper.test_bind_more("小","f");
            for(int i = 0;i<list.size();i++){
                Map map = list.get(i);
                Set set = map.keySet();
                Iterator iterator = set.iterator();
                while(iterator.hasNext()){
                    String key = iterator.next().toString();
                    String value = map.get(key).toString();
                    System.out.println(key+"---"+value);
                }
            }
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
    }
}
