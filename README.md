## 第一次提交：
项目基本搭建：

- springboot项目构建，名为gotoWEINAN_project。项目jdk：1.8，springboot版本2.7.13稳定版。配置application.yml文件，添加port为8084
- 前端vue项目构建，嵌套在springboot项目下面，名为gotoWEINAN_client
- 设计前端架构
初步设计为：首页，文化与历史，旅游景点，美食餐饮

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
2. time：大约30min

## 第三次提交
 
添加功能：
1. 点击图片可以跳转detail，detail可以获取到src和title，ajax请求渲染
这里采用$route.params获取上一级传来的src和title，ajax获取数据
安装axios，直接axios调api，后端地址localhost:8084，添加mysql8.0.28依赖，配置application.yml，数据库名为app_ershou，建表
测试springboot和数据库的连接，添加mybatis-plus（直接用接口算了）
2. 可以重复点击路由不报错。
解决办法：对于高版本的vue-router添加一个回调函数即可
3. time：47min

## 第四次提交
添加功能：
1. 后端跨域配置CorsConfig，架构包构建，前后端连接测试，后端与数据库连接测试，ok，基本完善功能
2. 完善detail.vue，在mounted中发ajax，动态构建，测试ok
time：1h20min

## 第五次提交
1. 全局图片圆角调整
2. 完善foods，culture逻辑，已经可交作业
3. 数据基本录入mysql数据库
4. time：1h

