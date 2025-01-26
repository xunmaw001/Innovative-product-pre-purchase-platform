export function isAuth(tableName, key) {
  let role = localStorage.getItem("UserTableName");
  let menus = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["新增","查看","修改","删除","审核"],"menu":"个体","menuJump":"列表","tableName":"geti"}],"menu":"个体管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["新增","查看","修改","删除","审核"],"menu":"发布企业","menuJump":"列表","tableName":"fabuqiye"}],"menu":"发布企业管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["新增","查看","修改","删除","审核"],"menu":"投资企业","menuJump":"列表","tableName":"touziqiye"}],"menu":"投资企业管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["新增","查看","修改","删除"],"menu":"项目分类","menuJump":"列表","tableName":"xiangmufenlei"}],"menu":"项目分类管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看","修改","删除","审核"],"menu":"产品项目","menuJump":"列表","tableName":"chanpinxiangmu"}],"menu":"产品项目管理"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看","修改","删除"],"menu":"个体投资","menuJump":"列表","tableName":"getitouzi"}],"menu":"个体投资管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","修改","删除"],"menu":"企业投资","menuJump":"列表","tableName":"qiyetouzi"}],"menu":"企业投资管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看","修改","删除"],"menu":"个体订单","menuJump":"列表","tableName":"getidingdan"}],"menu":"个体订单管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["查看","修改","删除"],"menu":"企业订单","menuJump":"列表","tableName":"qiyedingdan"}],"menu":"企业订单管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","修改"],"menu":"关于我们","tableName":"aboutus"},{"appFrontIcon":"cuIcon-clothes","buttons":["查看","修改"],"menu":"系统简介","tableName":"systemintro"},{"appFrontIcon":"cuIcon-camera","buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告资讯","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看","个体投资","企业投资"],"menu":"产品项目列表","menuJump":"列表","tableName":"chanpinxiangmu"}],"menu":"产品项目模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看","支付"],"menu":"个体投资","menuJump":"列表","tableName":"getitouzi"}],"menu":"个体投资管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看"],"menu":"个体订单","menuJump":"列表","tableName":"getidingdan"}],"menu":"个体订单管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看","个体投资","企业投资"],"menu":"产品项目列表","menuJump":"列表","tableName":"chanpinxiangmu"}],"menu":"产品项目模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"个体","tableName":"geti"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-present","buttons":["查看"],"menu":"项目分类","menuJump":"列表","tableName":"xiangmufenlei"}],"menu":"项目分类管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["新增","查看","修改","删除","查看评论"],"menu":"产品项目","menuJump":"列表","tableName":"chanpinxiangmu"}],"menu":"产品项目管理"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看","审核","订单配送"],"menu":"个体投资","menuJump":"列表","tableName":"getitouzi"}],"menu":"个体投资管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","审核","添加配送"],"menu":"企业投资","menuJump":"列表","tableName":"qiyetouzi"}],"menu":"企业投资管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看","修改"],"menu":"个体订单","menuJump":"列表","tableName":"getidingdan"}],"menu":"个体订单管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["查看","修改"],"menu":"企业订单","menuJump":"列表","tableName":"qiyedingdan"}],"menu":"企业订单管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看","个体投资","企业投资"],"menu":"产品项目列表","menuJump":"列表","tableName":"chanpinxiangmu"}],"menu":"产品项目模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"发布企业","tableName":"fabuqiye"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","支付"],"menu":"企业投资","menuJump":"列表","tableName":"qiyetouzi"}],"menu":"企业投资管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["查看"],"menu":"企业订单","menuJump":"列表","tableName":"qiyedingdan"}],"menu":"企业订单管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看","个体投资","企业投资"],"menu":"产品项目列表","menuJump":"列表","tableName":"chanpinxiangmu"}],"menu":"产品项目模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"投资企业","tableName":"touziqiye"}];
  for(let i=0;i<menus.length;i++){
    if(menus[i].tableName==role){
      for(let j=0;j<menus[i].frontMenu.length;j++){
          for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
            if(tableName==menus[i].frontMenu[j].child[k].tableName){
              let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
              return buttons.indexOf(key) !== -1 || false
            }
          }
      }
    }
  }
  return false;
}

/**
 *  * 获取当前时间（yyyy-MM-dd hh:mm:ss）
 *   */
export function getCurDateTime() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate(),
    hour = currentTime.getHours(),
    minute = currentTime.getMinutes(),
    second = currentTime.getSeconds();
    return year + "-" + month + "-" + day + " " +hour +":" +minute+":"+second;
}

/**
 *  * 获取当前日期（yyyy-MM-dd）
 *   */
export function getCurDate() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate();
    return year + "-" + month + "-" + day;
}
