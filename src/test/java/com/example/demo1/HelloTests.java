package com.example.demo1;

import com.example.demo1.Repository.UserDao1;
import com.example.demo1.entity.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloTests {
    private MockMvc mvc;

    @Autowired
    private WebApplicationContext wac;

    @Before
    public void setUp() throws Exception {
        //mvc = MockMvcBuilders.standaloneSetup(new a()).build();
        mvc = MockMvcBuilders.webAppContextSetup(this.wac).build();   //构造MockMvc
    }

    @Test
    public void getHello() throws Exception
    {
//        mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(content().string(equalTo("a")));
//mvc.perform(MockMvcRequestBuilders.get("/jdbc"));
        System.out.println("------------------");
        mvc.perform(MockMvcRequestBuilders.get("/jdbc")) //执行请求
                .andExpect(model().attributeExists("users")) //验证存储模型数据
                .andExpect(view().name("jdbc")) //验证viewName
                .andExpect(forwardedUrl(null))//验证视图渲染时forward到的jsp
                .andExpect(status().isOk())//验证状态码
                .andDo(print()); //输出MvcResult到控制台
    }



    @Autowired
    private UserDao1 userDao1;

    @Test
    public void 测试UserDao1()
    {
        List<User> Users = userDao1.getAllUser();
        Assert.assertNotNull(Users);
        System.out.println("User表总记录数" + Users.size());




    }
}
