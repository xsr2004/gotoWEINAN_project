<template>
  <div class="sightseeing">
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
  name: "sightseeing.vue",
  data(){
    return{
      srcList:[
        {
          src:"https://img1.baidu.com/it/u=2449690862,4217636808&fm=253&fmt=auto&app=138&f=JPEG?w=667&h=500",
          title:"窑洞",
        },
        {
          src:"https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fss2.meipian.me%2Fusers%2F6596122%2F2cc2b472a9e74e7ebb280d48dc524fcb.jpeg%3Fmeipian-raw%2Fbucket%2Fivwen%2Fkey%2FdXNlcnMvNjU5NjEyMi8yY2MyYjQ3MmE5ZTc0ZTdlYmIyODBkNDhkYzUyNGZjYi5qcGVn%2Fsign%2F642ef70d5ee973d6de818819f2bd14de.jpg&refer=http%3A%2F%2Fss2.meipian.me&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1691305299&t=223e32967080de3c36283b3d139a331e",
          title:"天下第一狮",
        },
        {
          src:"https://img2.baidu.com/it/u=443814581,4250074137&fm=253&fmt=auto&app=138&f=JPEG?w=375&h=500",
          title:"石牌楼",
        },
        {
          src:"https://img1.baidu.com/it/u=2449690862,4217636808&fm=253&fmt=auto&app=138&f=JPEG?w=667&h=500",
          title:"窑洞",
        },
        {
          src:"https://img1.baidu.com/it/u=2449690862,4217636808&fm=253&fmt=auto&app=138&f=JPEG?w=667&h=500",
          title:"窑洞",
        },
        {
          src:"https://img1.baidu.com/it/u=2449690862,4217636808&fm=253&fmt=auto&app=138&f=JPEG?w=667&h=500",
          title:"窑洞",
        },
        {
          src:"https://img1.baidu.com/it/u=2449690862,4217636808&fm=253&fmt=auto&app=138&f=JPEG?w=667&h=500",
          title:"窑洞",
        },
        {
          src:"https://img1.baidu.com/it/u=2449690862,4217636808&fm=253&fmt=auto&app=138&f=JPEG?w=667&h=500",
          title:"窑洞",
        },
        {
          src:"https://img1.baidu.com/it/u=2449690862,4217636808&fm=253&fmt=auto&app=138&f=JPEG?w=667&h=500",
          title:"窑洞",
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
        }
      })
    }
  }
}
</script>

<style scoped lang="less">
  .sightseeing{
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