package com.example.gotoweinan_project.controller;

import com.example.gotoweinan_project.entity.imgInfo;
import com.example.gotoweinan_project.service.imgInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：xsr
 * @name：imgInfoController
 * @Date：2023/7/10 9:04
 * @Filename：imgInfoController
 */
@RestController
@RequestMapping("/img")
public class imgInfoController {
    @Autowired
    private imgInfoService service;
    @GetMapping
    imgInfo getImgInfo(@RequestParam String src){
        return service.getImgInfoBySrc(src);
    }
}
