<template>
    <div class="culture">
      <div class="image-wrapper"
           v-for="(item,index) in srcList"
           :key="index">
        <el-image
            :src="item.src"
            fit="fill"
            @mouseenter="displayOverlay(index)"
            @mouseleave="hideOverlay(index)"
            @click="clickImg(item,index)">
        </el-image>
        <div class="image-overlay" :class="{ 'show-overlay': showOverlay === index }">
          <h3>{{item.title}}</h3>
        </div>
      </div>
    </div>
</template>

<script>
export default {
  name: "culture.vue",
  data(){
    return{
      srcList:[
        {
          src:"https://photo.tuchong.com/311799/f/5031789.jpg",
          title:"陕北秧歌",
        },
        {
          src:"https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.alicdn.com%2Fi4%2F3025607148%2FTB2CkJdkCcqBKNjSZFgXXX_kXXa_%21%213025607148.jpg&refer=http%3A%2F%2Fimg.alicdn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1691564623&t=83081f23ea21e66e3412270195e07ea0",
          title:"拴娃狮",
        },
        {
          src:"https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimage109.360doc.com%2FDownloadImg%2F2018%2F02%2F1421%2F124718529_1_20180214094406110&refer=http%3A%2F%2Fimage109.360doc.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1691564670&t=89d42ba8726c7250b52e638a0614db48",
          title:"绥德定仙焉娘娘庙花会",
        },
        {
          src:"https://img2.baidu.com/it/u=2149666000,1159326418&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=411",
          title:"踢场子",
        },
        {
          src:"https://img2.baidu.com/it/u=2903785156,2229547052&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=334",
          title:"绥米唢呐",
        },
        {
          src:"https://img2.baidu.com/it/u=1201519738,1580046567&fm=253&fmt=auto&app=138&f=JPEG?w=735&h=500",
          title:"腰鼓",
        },
        {
          src:"https://img0.baidu.com/it/u=2780745559,3380261458&fm=253&fmt=auto&app=138&f=JPEG?w=755&h=500",
          title:"逛庙会",
        },
        {
          src:"https://img1.baidu.com/it/u=2976020296,3820873022&fm=253&fmt=auto&app=120&f=JPEG?w=800&h=452",
          title:"正月十五转火塔",
        },
        {
          src:"https://img0.baidu.com/it/u=2173380429,3201041233&fm=253&fmt=auto&app=138&f=JPEG?w=750&h=500",
          title:"闹灯花",
        },
        {
          src:"https://img1.baidu.com/it/u=2449690862,4217636808&fm=253&fmt=auto&app=138&f=JPEG?w=667&h=500",
          title:"窑洞",
        },

      ],
      showOverlay:false,
    }
  },
  methods:{
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
          title:item.title,
        }
      })
    }
  }
}
</script>

<style scoped lang="less">
    .culture{
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