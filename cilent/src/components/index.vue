<template>
    <div class="index">
      <h2>Color burst</h2>
      <h3>Explore a rainbow of art</h3>
      <el-carousel :interval="4000" type="card" height="500px" class="el-carousel">
        <el-carousel-item v-for="item in 4" :key="item">
          <div class="image-wrapper">
            <el-image :src="srcList[item-1]" fit="fill" style="width: 100%;height: 100%"></el-image>
          </div>
        </el-carousel-item>
      </el-carousel>
      <el-button>color explorer</el-button>
      <el-button>color explorer</el-button>
      <el-button>color explorer</el-button>
    </div>
</template>

<script>
import "../style/common.less"
export default {
  name: "index.vue",
  data(){
    return{
      srcList:[
        "https://img1.baidu.com/it/u=2449690862,4217636808&fm=253&fmt=auto&app=138&f=JPEG?w=667&h=500",
        "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fss2.meipian.me%2Fusers%2F6596122%2F2cc2b472a9e74e7ebb280d48dc524fcb.jpeg%3Fmeipian-raw%2Fbucket%2Fivwen%2Fkey%2FdXNlcnMvNjU5NjEyMi8yY2MyYjQ3MmE5ZTc0ZTdlYmIyODBkNDhkYzUyNGZjYi5qcGVn%2Fsign%2F642ef70d5ee973d6de818819f2bd14de.jpg&refer=http%3A%2F%2Fss2.meipian.me&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1691305299&t=223e32967080de3c36283b3d139a331e",
        "https://img2.baidu.com/it/u=2823371836,3782431765&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=750",
        "https://img2.baidu.com/it/u=443814581,4250074137&fm=253&fmt=auto&app=138&f=JPEG?w=375&h=500",
      ]
    }
  }
}
</script>

<style scoped lang="less">
    .index{
      .el-carousel{
        margin-top: 30px;
        .el-carousel__item{
          .image-wrapper {
            position: relative;
            overflow: hidden;
            width: 100%;
            height: 100%;
            transition: transform 0.5s cubic-bezier(0.30, 0, 0.70, 1);
          }

          .image-wrapper:hover {
            transform: scale(1.2);
          }
        }

      }




    }
</style>