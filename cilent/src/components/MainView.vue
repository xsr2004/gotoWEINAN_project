<template>
  <el-container>
    <el-header class="el-header">
      <el-menu :default-active="activeIndex" class="el-menu" mode="horizontal" @select="handleSelect">
        <el-menu-item index="index">首页</el-menu-item>
        <el-submenu index="2">
          <template slot="title">文化与历史</template>
          <el-menu-item index="culture">文化</el-menu-item>
          <el-menu-item index="history">历史</el-menu-item>
        </el-submenu>
        <el-menu-item index="sightseeing">旅游景点</el-menu-item>
        <el-menu-item index="foods">吃喝在绥德</el-menu-item>
      </el-menu>
      <div class="button_group">
        <el-button icon="el-icon-search" circle></el-button>
      </div>

    </el-header>
    <el-main>
      <router-view></router-view>
    </el-main>
  </el-container>
</template>

<script>
import index from "./index"
export default {
  name: "MainView.vue",
  components:{
    index
  },
  data(){
    return{
      activeIndex: 'index',
    }
  },
  methods: {
    handleSelect(key, keyPath) {
      this.$router.push(`/${key}`,()=>{})
    }
  }
}
</script>

<style scoped lang="less">
    .el-header{
      color: #333;
      text-align: center;
      line-height: 30px;
      padding: 0px 0px;
      display: flex;
      //border-bottom: 1px solid #e6e6e6;
      justify-content: space-between;
    }
    .el-main {
      //background-color: #E9EEF3;
      color: #333;
      text-align: center;
      line-height: 30px;
      padding:0;
    }
</style>