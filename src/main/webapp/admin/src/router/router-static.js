import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import aboutus from '@/views/modules/aboutus/list'
    import geti from '@/views/modules/geti/list'
    import xiangmufenlei from '@/views/modules/xiangmufenlei/list'
    import getitouzi from '@/views/modules/getitouzi/list'
    import touziqiye from '@/views/modules/touziqiye/list'
    import chanpinxiangmu from '@/views/modules/chanpinxiangmu/list'
    import fabuqiye from '@/views/modules/fabuqiye/list'
    import discusschanpinxiangmu from '@/views/modules/discusschanpinxiangmu/list'
    import qiyedingdan from '@/views/modules/qiyedingdan/list'
    import systemintro from '@/views/modules/systemintro/list'
    import getidingdan from '@/views/modules/getidingdan/list'
    import qiyetouzi from '@/views/modules/qiyetouzi/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '公告资讯',
        component: news
      }
      ,{
	path: '/aboutus',
        name: '关于我们',
        component: aboutus
      }
      ,{
	path: '/geti',
        name: '个体',
        component: geti
      }
      ,{
	path: '/xiangmufenlei',
        name: '项目分类',
        component: xiangmufenlei
      }
      ,{
	path: '/getitouzi',
        name: '个体投资',
        component: getitouzi
      }
      ,{
	path: '/touziqiye',
        name: '投资企业',
        component: touziqiye
      }
      ,{
	path: '/chanpinxiangmu',
        name: '产品项目',
        component: chanpinxiangmu
      }
      ,{
	path: '/fabuqiye',
        name: '发布企业',
        component: fabuqiye
      }
      ,{
	path: '/discusschanpinxiangmu',
        name: '产品项目评论',
        component: discusschanpinxiangmu
      }
      ,{
	path: '/qiyedingdan',
        name: '企业订单',
        component: qiyedingdan
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/getidingdan',
        name: '个体订单',
        component: getidingdan
      }
      ,{
	path: '/qiyetouzi',
        name: '企业投资',
        component: qiyetouzi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '系统首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
