package com.example.gotoweinan_project.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author：xsr
 * @name：imgIofo
 * @Date：2023/7/10 8:41
 * @Filename：imgIofo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("imgInfo")
public class imgInfo {
    @TableId
    private String src;//图片地址
    private String title;//图片标题
    private String description;//描述
    private String author;//作者
    @TableField("createTime")
    private String createTime;//创作日期
    private String size;//图片尺寸
}
