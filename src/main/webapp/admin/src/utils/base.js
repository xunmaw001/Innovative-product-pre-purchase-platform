const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm938re/",
            name: "ssm938re",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm938re/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "创新型产品提前购平台"
        } 
    }
}
export default base
