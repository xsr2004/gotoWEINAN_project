<template>
    <div class="detail">
      <div class="img_container">
        <el-image
          :src="dataList.src">
        </el-image>
      </div>
      <div class="content_container">
          <div class="content_title">
            <div class="left">
              <h3>"Les Vessenots" in Auvers</h3>
              <h4>文森特·梵高1890</h4>
            </div>
            <div class="right">
              <el-button type="primary" icon="el-icon-edit" circle></el-button>
              <el-button type="info" icon="el-icon-message" circle></el-button>
              <el-button type="warning" icon="el-icon-star-off" circle></el-button>
            </div>
          </div>
          <div class="content_description">
            <div class="left">
              This landscape of 'Les Vessenots,' on the outskirts of Auvers,
              shows a group of old country cottages placed just below a raised horizon;
              further down, wheat fields stretch to the bottom of the canvas,
              broken only by a few swaying trees.
              The narrow colour range—mainly bright greens and yellows—and the nervous,
              agitated brushstrokes following a repetitive, undulating rhythm,
              are characteristic of the artist's work in his final period.
            </div>
            <div class="right">
              Van Gogh painted a large number of landscapes in the weeks before his death,
              always working outdoors. By that time, he was prey to all manner of conflicting moods:
              the vast expanses of fertile cropland gave him a sense of freedom,
              but at the same time intensified the feeling of melancholy and loneliness which would
              eventually lead to his suicide.
            </div>

          </div>
          <div class="content_arguments">
            <h3>作品介绍</h3>
            <span>标题:  &nbsp;</span><span>"Les Vessenots" in Auvers</span><br>
            <span>创作者:  &nbsp;</span><span>Vincent van Gogh</span><br>
            <span>创作日期:  &nbsp;</span><span>1890</span><br>
            <span>实际尺寸： &nbsp;</span><span>w650 x h550 mm</span><br>
            <span>图片源地址： &nbsp;</span><span><a :href="dataList.src">Museo Thyssen-Bornemisza - Fact Sheet</a></span><br>
          </div>
      </div>
    </div>
</template>

<script>
import "../style/common.less"
import axios from "axios";
export default {
  name: "detail.vue",
  props:{
    src:{
      type:String,
      default:""
    },
    title: {
      type:String,
      default:"标题"
    }
  },
  data(){
    return{
      dataList:{
        src:"https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fss2.meipian.me%2Fusers%2F6596122%2F2cc2b472a9e74e7ebb280d48dc524fcb.jpeg%3Fmeipian-raw%2Fbucket%2Fivwen%2Fkey%2FdXNlcnMvNjU5NjEyMi8yY2MyYjQ3MmE5ZTc0ZTdlYmIyODBkNDhkYzUyNGZjYi5qcGVn%2Fsign%2F642ef70d5ee973d6de818819f2bd14de.jpg&refer=http%3A%2F%2Fss2.meipian.me&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1691305299&t=223e32967080de3c36283b3d139a331e",
        title:"天下第一狮",
        author:"Vincent van Gogh",
        createDate:"1890",
        size:"w650 x h550 mm",
      }
    }
  },
  mounted() {
    //这里应该拿到组件传的值，然后发一个ajax从后端获取该item对应的那个对象
    //获取到后更新数组
    console.log(this.$route.params.src)
    console.log(this.$route.params.title)
    //发ajax请求到后端
    axios({
      method: 'get',
      headers: {'X-Requested-With': 'XMLHttpRequest'},
      params: {
        src: this.$route.params.src,
        title:this.$route.params.title
      },
      timeout: 5000,
      responseType: 'json', // 默认值
      url: 'http://localhost:8084',

    })
  }

}
</script>

<style scoped lang="less">
    .detail{
      width: 100%;
      .img_container{
        padding: 30px 0px;
        border-bottom: 1px solid #e6e6e6;
        .el-image{
          width: 70%;
          margin: auto;
        }
      }
      .content_container{
        width: 90%;
        margin: auto;
        margin-top: 20px;
        .content_title{
          display: flex;
          justify-content: space-between;
          margin-bottom: 20px;
          .left{
            h3{
              color: #333333;
              font-size: 22px;
              font-weight: bolder;
            }
          }
          .right{
            text-align: right;
          }
        }

        .content_description{
          display: flex;
          justify-content: space-between;
          .left{
            width: 46%;
            text-align: left;
            margin-left: 0;
          }
          .right{
            width: 46%;
            text-align: left;
            margin-right: 0;
          }

        }
        .content_arguments{
          margin-top: 20px;
          margin-left: 0;
          text-align: left;
        }
      }
    }
</style>