package com.example.eureaserver;

import com.example.eureaserver.entity.UserEO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FoggnserverApplicationTests {

    @Test
    public void contextLoads() {
        try {
            //1：创建对象的方式，反射
            //UserEO userEO = UserEO.class.newInstance();
            Class<?> c = Class.forName("com.example.eureaserver.entity.UserEO");
            Object o = c.newInstance();
            System.out.println(o);
            //2: 使用关键字new
            UserEO u = new UserEO();
            //3:使用clone方法
            UserEO u1 = new UserEO();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
