import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import getiList from '../pages/geti/list'
import getiDetail from '../pages/geti/detail'
import getiAdd from '../pages/geti/add'
import fabuqiyeList from '../pages/fabuqiye/list'
import fabuqiyeDetail from '../pages/fabuqiye/detail'
import fabuqiyeAdd from '../pages/fabuqiye/add'
import touziqiyeList from '../pages/touziqiye/list'
import touziqiyeDetail from '../pages/touziqiye/detail'
import touziqiyeAdd from '../pages/touziqiye/add'
import xiangmufenleiList from '../pages/xiangmufenlei/list'
import xiangmufenleiDetail from '../pages/xiangmufenlei/detail'
import xiangmufenleiAdd from '../pages/xiangmufenlei/add'
import chanpinxiangmuList from '../pages/chanpinxiangmu/list'
import chanpinxiangmuDetail from '../pages/chanpinxiangmu/detail'
import chanpinxiangmuAdd from '../pages/chanpinxiangmu/add'
import getitouziList from '../pages/getitouzi/list'
import getitouziDetail from '../pages/getitouzi/detail'
import getitouziAdd from '../pages/getitouzi/add'
import qiyetouziList from '../pages/qiyetouzi/list'
import qiyetouziDetail from '../pages/qiyetouzi/detail'
import qiyetouziAdd from '../pages/qiyetouzi/add'
import getidingdanList from '../pages/getidingdan/list'
import getidingdanDetail from '../pages/getidingdan/detail'
import getidingdanAdd from '../pages/getidingdan/add'
import qiyedingdanList from '../pages/qiyedingdan/list'
import qiyedingdanDetail from '../pages/qiyedingdan/detail'
import qiyedingdanAdd from '../pages/qiyedingdan/add'
import aboutusList from '../pages/aboutus/list'
import aboutusDetail from '../pages/aboutus/detail'
import aboutusAdd from '../pages/aboutus/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'geti',
					component: getiList
				},
				{
					path: 'getiDetail',
					component: getiDetail
				},
				{
					path: 'getiAdd',
					component: getiAdd
				},
				{
					path: 'fabuqiye',
					component: fabuqiyeList
				},
				{
					path: 'fabuqiyeDetail',
					component: fabuqiyeDetail
				},
				{
					path: 'fabuqiyeAdd',
					component: fabuqiyeAdd
				},
				{
					path: 'touziqiye',
					component: touziqiyeList
				},
				{
					path: 'touziqiyeDetail',
					component: touziqiyeDetail
				},
				{
					path: 'touziqiyeAdd',
					component: touziqiyeAdd
				},
				{
					path: 'xiangmufenlei',
					component: xiangmufenleiList
				},
				{
					path: 'xiangmufenleiDetail',
					component: xiangmufenleiDetail
				},
				{
					path: 'xiangmufenleiAdd',
					component: xiangmufenleiAdd
				},
				{
					path: 'chanpinxiangmu',
					component: chanpinxiangmuList
				},
				{
					path: 'chanpinxiangmuDetail',
					component: chanpinxiangmuDetail
				},
				{
					path: 'chanpinxiangmuAdd',
					component: chanpinxiangmuAdd
				},
				{
					path: 'getitouzi',
					component: getitouziList
				},
				{
					path: 'getitouziDetail',
					component: getitouziDetail
				},
				{
					path: 'getitouziAdd',
					component: getitouziAdd
				},
				{
					path: 'qiyetouzi',
					component: qiyetouziList
				},
				{
					path: 'qiyetouziDetail',
					component: qiyetouziDetail
				},
				{
					path: 'qiyetouziAdd',
					component: qiyetouziAdd
				},
				{
					path: 'getidingdan',
					component: getidingdanList
				},
				{
					path: 'getidingdanDetail',
					component: getidingdanDetail
				},
				{
					path: 'getidingdanAdd',
					component: getidingdanAdd
				},
				{
					path: 'qiyedingdan',
					component: qiyedingdanList
				},
				{
					path: 'qiyedingdanDetail',
					component: qiyedingdanDetail
				},
				{
					path: 'qiyedingdanAdd',
					component: qiyedingdanAdd
				},
				{
					path: 'aboutus',
					component: aboutusList
				},
				{
					path: 'aboutusDetail',
					component: aboutusDetail
				},
				{
					path: 'aboutusAdd',
					component: aboutusAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
