package com.example.gotoweinan_project.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.gotoweinan_project.entity.imgInfo;
import com.example.gotoweinan_project.mapper.imgInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author：xsr
 * @name：imgInfoService
 * @Date：2023/7/10 8:48
 * @Filename：imgInfoService
 */
@Service
public class imgInfoService extends ServiceImpl<imgInfoMapper, imgInfo> {
    @Autowired
    private imgInfoMapper mapper;
    public imgInfo getImgInfoBySrc(String src){
        return mapper.selectById(src);
    }
}
