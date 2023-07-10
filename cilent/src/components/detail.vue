<template>
    <div class="detail">
      <div class="img_container" v-loading="loading">
        <el-image
          :src="dataList.src"
          >
        </el-image>
      </div>
      <div class="content_container" v-show="showContent">
          <div class="content_title">
            <div class="left">
              <h3>{{dataList.title}}</h3>
              <h4>{{ dataList.author }}</h4>
            </div>
            <div class="right">
              <el-button type="primary" icon="el-icon-edit" circle></el-button>
              <el-button type="info" icon="el-icon-message" circle></el-button>
              <el-button type="warning" icon="el-icon-star-off" circle></el-button>
            </div>
          </div>
          <div class="content_description">
            <div class="left">
                {{splitDescription.left}}
            </div>
            <div class="right">
              {{splitDescription.right}}
            </div>

          </div>
          <div class="content_arguments">
            <h3>作品介绍</h3>
            <span>标题:  &nbsp;</span><span>{{dataList.title}}</span><br>
            <span>创作者:  &nbsp;</span><span>{{dataList.author}}</span><br>
            <span>创作日期:  &nbsp;</span><span>{{dataList.createTime}}</span><br>
            <span>实际尺寸： &nbsp;</span><span>{{dataList.size}}</span><br>
            <span>图片源地址： &nbsp;</span><span><a :href="dataList.src">{{dataList.src}}</a></span><br>
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
  },
  data(){
    return{
      dataList:{
        src:"",
        title:"天下第一狮",
        author:"Vincent van Gogh",
        description:"This landscape of 'Les Vessenots,' on the outskirts of Auvers, shows a group of old country cottages placed just below a raised horizon; further down, wheat fields stretch to the bottom of the canvas, broken only by a few swaying trees. The narrow colour range—mainly bright greens and yellows—and the nervous, agitated brushstrokes following a repetitive, undulating rhythm, are characteristic of the artist's work in his final period.\n" +
            "Van Gogh painted a large number of landscapes in the weeks before his death, always working outdoors. By that time, he was prey to all manner of conflicting moods: the vast expanses of fertile cropland gave him a sense of freedom, but at the same time intensified the feeling of melancholy and loneliness which would eventually lead to his suicide.",
        createTime:"1890",
        size:"w650 x h550 mm",
      },
      loading:true,
      showContent:false,
    }
  },
  methods:{
    handleError(){
      this.$message.error("加载失败~~")
    }
  },
  computed: {
    splitDescription() {
      const maxLength = Math.ceil(this.dataList.description.length / 2);
      const leftDescription = this.dataList.description.substring(0, maxLength);
      const rightDescription = this.dataList.description.substring(maxLength);
      return {
        left: leftDescription,
        right: rightDescription
      };
    }
  },
  mounted() {
    //这里应该拿到组件传的值，然后发一个ajax从后端获取该item对应的那个对象
    //获取到后更新数组
    console.log(this.$route.params.src)
    //发ajax请求到后端
    axios({
      method: 'get',
      headers: {'X-Requested-With': 'XMLHttpRequest'},
      params: {
        src: this.$route.params.src,
      },
      timeout: 5000,
      responseType: 'json', // 默认值
      url: 'http://localhost:8084/img',
    }).then((res)=>{
      this.loading=false
      if(res.data.length===0){
        this.$message.error("图片加载失败~~~")
        return;
      }
      this.showContent=true
      this.dataList.src=res.data.src
      this.dataList.title=res.data.title
      this.dataList.author=res.data.author
      this.dataList.createDate=res.data.createTime
      this.dataList.description=res.data.description
      this.dataList.size=res.data.size
    }).catch((error)=>{
      this.$message.error("服务器异常~~~");
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