package com.shuframework.admin.controller;

import com.shuframework.admin.model.SysUser;
import com.shuframework.admin.query.SysUserDTO;
import com.shuframework.commontools.json.JsonUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * 测试例子，详情链接：http://jinnianshilongnian.iteye.com/blog/2004660
 * @author shu
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserControllerTest {

    //模拟mvc
    private MockMvc mockMvc;
    @Autowired
    private WebApplicationContext wac;

//    @Autowired
//    private SysUserController userController;

    //MockMvcBuilders构建MockMvc对象，本测试类是测试单个controller，不用注入所有项目
    @Before
    public void setUp() throws Exception {
        //注入WebApplicationContext，创建所有项目对象（集成Web环境测试，项目拦截器有效）
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();

//    	//采用@Autowired创建controller里面的注解对象都被创建 （单个类测试，拦截器无效）,
//    	//度取不到application.properties文件
//    	mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
//    	//采用new 创建controller里面的注解对象都是null，如userService
//    	mockMvc = MockMvcBuilders.standaloneSetup(new SysUserController()).build();
    }


    @Test
    public void list_get() throws Exception {
        //get请求参数直接跟在URL后面
        String requestURL = "/admin/sysUser/selectPage";
        SysUserDTO user = new SysUserDTO();
        user.setPageIndex(2);
        user.setLoginName("aa");
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get(requestURL)
                //该种参数传递，controller用@RequestBody接收
                .content(JsonUtil.obj2JsonStr(user))
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
        int status = mvcResult.getResponse().getStatus();
        String content = mvcResult.getResponse().getContentAsString();
        System.out.println("Response-status：" + status);
        System.out.println("Response-content：" + content);
    }


}