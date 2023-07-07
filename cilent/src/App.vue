<template>
  <div id="app">
    <router-view></router-view>
  </div>
</template>

<script>
import MainView from "@/components/MainView";

export default {
  name: 'App',
  components: {
    MainView
  },

}
</script>

<style lang="less" scoped>
  #app {
    font-family: Avenir, Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    width: 80%;
    margin: 0 auto;

  }

</style>
