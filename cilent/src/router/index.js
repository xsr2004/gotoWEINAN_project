import Vue from 'vue'
import VueRouter from 'vue-router'
Vue.use(VueRouter)
import MainView from "@/components/MainView";
import index from "@/components/index"
import history from "@/components/history";
import culture from "@/components/culture";
import sightseeing from "@/components/sightseeing";
import foods from "@/components/foods";
import detail from "@/components/detail";
//3. 创建路由的实例对象
const router = new VueRouter({
    routes:[
        {
            path: '/',
            component: MainView,
            redirect: '/index',
            children:[
                {
                    path:'/index',
                    component:index,
                    name:'首页',
                },
                {
                    path:'/history',
                    component:history,
                    name:'历史'
                },
                {
                    path:'/culture',
                    component:culture,
                    name:'culture',
                },
                {
                    path:'sightseeing',
                    component:sightseeing,
                    name:'旅游景点',
                },
                {
                    path:'/foods',
                    component:foods,
                    name:'foods',
                },
                {
                    path:'/detail',
                    component:detail,
                    name:'detail',
                    props:{
                        src:"",
                        title:"标题"
                    }
                }
            ]
        },

    ]
})

//4. 向外共享路由的实例对象
export default router