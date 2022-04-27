package com.imooc.oa.utils;

import org.junit.Test;

public class MybatisUtilsTestor {
    @Test
    public void testcase1(){
        String result = (String) MybatisUtils.executeQuery(sqlSession -> {
            String out = sqlSession.selectOne("test.sample");
            return out;
        });
        System.out.println(result);
    }
}
