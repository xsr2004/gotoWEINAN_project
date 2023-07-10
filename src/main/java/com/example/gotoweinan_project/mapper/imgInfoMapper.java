package com.example.gotoweinan_project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.gotoweinan_project.entity.imgInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author：xsr
 * @name：ImgInfoService
 * @Date：2023/7/10 8:46
 * @Filename：ImgInfoService
 */
@Repository
@Mapper
public interface imgInfoMapper extends BaseMapper<imgInfo> {

}
