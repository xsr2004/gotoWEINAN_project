package com.example.gotoweinan_project;

import com.example.gotoweinan_project.entity.imgInfo;
import com.example.gotoweinan_project.service.imgInfoService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class GotoWeinanProjectApplicationTests {
    @Autowired
    private imgInfoService imgInfoService;
    @Test
    void contextLoads() {
    }
    @Test
    void test1(){
        imgInfo imgInfo = imgInfoService.getImgInfoBySrc("https://img1.baidu.com/it/u=2449690862,4217636808&fm=253&fmt=auto&app=138&f=JPEG?w=667&h=500");
        System.out.println(imgInfo.getAuthor());
        //ok
    }
}
