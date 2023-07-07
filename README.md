## 第一次提交：
项目基本搭建：

- springboot项目构建，名为gotoWEINAN_project。项目jdk：1.8，springboot版本2.7.13稳定版。配置application.yml文件，添加port为8084
- 前端vue项目构建，嵌套在springboot项目下面，名为gotoWEINAN_client
- 设计前端架构

初步设计为：首页，文化与历史，旅游景点，美食餐饮，留言箱

添加功能：

1. 引入element-ui，关闭eslint语法检查，安装less，
2. 初步配置vue-router，编写index.js配置路由规则。
3. MainView重定向到index.vue，目前有culture文化页面，foods美食页面，history历史页面，sightseeing页面
   App.vue包MainView，MainView里面分为header，main，footer，其中main为其他路由的出口。
4. 模仿Google culture&history风格，简单完成index页面
5. 完成旅游景点sightseeing页面，图片样式，遮罩层，相关js方法等。

time：大约2.5h

## 第二次提交：

添加功能：
1. 添加detail组件，用于点击每个图片后跳转的详情页面。详情页面中有图片，背景介绍，标题，作者等信息
这些将通过上一个组件传入一个item，然后在detail的挂载钩子中向后端发ajax请求，获取item的各项值并赋值给自己的dataList进行渲染
time：大约30min



