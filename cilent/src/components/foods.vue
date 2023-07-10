<template>
      <div class="foods">
        <div class="image-wrapper"
             v-for="(item,index) in srcList"
             :key="index">
          <el-image
              :src="item.src"
              fit="fill"
              @mouseenter="displayOverlay(index)"
              @mouseleave="hideOverlay(index)"
              @click="clickImg(item)">
          </el-image>
          <div class="image-overlay" :class="{ 'show-overlay': showOverlay === index }">
            <h3>{{item.title}}</h3>
          </div>
        </div>
      </div>
</template>

<script>
export default {
  name: "foods.vue",
  data() {
    return {
      srcList: [
        {
          src:"https://img1.baidu.com/it/u=1539141709,1932676084&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=333",
          title: "绥德黑粉",
        },
        {
          src:"https://youimg1.c-ctrip.com/target/100v0s000000i7cj3F198_C_480_375.jpg",
          title: "活捉鱼",
        },
        {
          src: "https://nimg.ws.126.net/?url=http%3A%2F%2Fdingyue.ws.126.net%2F2021%2F0630%2F3e250cebj00qvhch20019c000dw00hdc.jpg&thumbnail=660x2147483647&quality=80&type=jpg",
          title: "绥德油旋",
        },
        {
          src: "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fstatic2.ivwen.com%2Fusers%2F5111177%2Fc3fcc1610e4644af82e862fc80ee9100.jpg%3Fmeipian-raw%2Fbucket%2Fivwen%2Fkey%2FdXNlcnMvNTExMTE3Ny9jM2ZjYzE2MTBlNDY0NGFmODJlODYyZmM4MGVlOTEwMC5qcGc%3D%2Fsign%2F2e7e91264ba4b32ea1d26cfbcc094d2c.jpg&refer=http%3A%2F%2Fstatic2.ivwen.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1691565534&t=c0ea7e61da041b3540b4e313ad2389f2",
          title: "绥德羊杂碎",
        },
        {
          src: "http://t13.baidu.com/it/u=1956979926,3205861940&fm=224&app=112&f=JPEG?w=500&h=500",
          title: "绥德土豆芡凉粉",
        },
        {
          src: "https://img2.baidu.com/it/u=3707048216,2086312544&fm=253&fmt=auto&app=138&f=JPEG?w=889&h=500",
          title: "绥德麻辣肝子碗托",
        },
        {
          src: "https://inews.gtimg.com/newsapp_bt/0/13887789854/1000.jpg",
          title: "绥德义合刀刀碗托",
        },
        {
          src: "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fg-search1.alicdn.com%2Fimg%2Fbao%2Fuploaded%2Fi4%2F2212819789902%2FO1CN01ajFGgr2N1AYr9jYP7_%21%212212819789902.jpg_300x300.jpg&refer=http%3A%2F%2Fg-search1.alicdn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1691565642&t=83b3a2b85abe1368535b94322babf081",
          title: "绥德黄酒",
        },
        {
          src: "https://p3.ssl.qhimgs3.com/t01e1084ff18cbb24dc.jpg",
          title: "绥德四十里铺羊肉面",
        },
        {
          src: "https://5b0988e595225.cdn.sohucs.com/images/20181207/795f450540c44c269e7e522572bbcb29.jpeg",
          title: "八碗",
        },

      ],
      showOverlay: false,
    }
  },
  methods: {
    displayOverlay(index) {
      this.showOverlay = index;
    },
    hideOverlay(index) {
      this.showOverlay = false;
    },
    //点击图片进行跳转，传item和index
    clickImg(item,index){
      this.$router.push({
        name:'detail',
        params:{
          src:item.src,
        }
      })
    }
  }
}
</script>

<style scoped lang="less">
.foods{
  display: flex;
  flex-wrap: wrap;
  justify-content: flex-start;
  width: 100%;
  margin-right: -20px; /* 负值用于抵消间隔 */

  .image-wrapper{
    flex-basis: calc(25% - 20px); /* 每行容纳4个el-image，减去间隔的宽度 */
    margin: 10px;
    height: 350px;
    cursor:pointer;
    position: relative;
    overflow: hidden;
    transition: transform 0.5s cubic-bezier(0.30, 0, 0.70, 1);
    .el-image{
      width: 100%;
      height: 100%;
      border-radius: 5%;
    }
    .image-overlay {
      position: absolute;
      z-index: 999;
      height: 100%;
      top: 290px;
      left: 0;
      right: 0;
      padding: 20px;
      color: white;
      background:rgba(0,0,0,0.3);
      text-align: center;
      opacity: 0;
      transition: opacity 0.3s;
      h3{
        color: white;
        margin:0;

      }
    }
    .image-overlay.show-overlay {
      opacity: 1;
    }
  }
  .image-wrapper:hover{
    transform: scale(1.05);
  }

}
</style>