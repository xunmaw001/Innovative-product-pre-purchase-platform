<template>
	<div>

	<div class="container" :style='{"minHeight":"100vh","alignItems":"center","backgroundImage":"url(http://codegen.caihongy.cn/20221024/23b37078fa41495b866fda764fd3ea28.png)","display":"flex","width":"100%","backgroundSize":"100% 100%","backgroundPosition":"center center","backgroundRepeat":"no-repeat","justifyContent":"center"}'>
		<el-form class='rgs-form' v-if="pageFlag=='register'" :style='{"width":"750px","padding":"20px","margin":"40px 0","borderRadius":"10px","background":"#fff","height":"auto"}' ref="registerForm" :model="registerForm" :rules="rules">
			<div v-if="false" :style='{"margin":"0 0 10px 0","color":"rgba(64, 158, 255, 1)","textAlign":"center","width":"100%","lineHeight":"44px","fontSize":"20px","textShadow":"4px 4px 2px rgba(64, 158, 255, .5)"}'>USER / REGISTER</div>
			<div v-if="true" :style='{"width":"100%","margin":"20px 0 20px 0","lineHeight":"44px","fontSize":"36px","color":"#000","textAlign":"center"}'>创新型产品提前购平台注册</p></div>
			<el-form-item :style='{"width":"70%","margin":"0 auto 24px","position":"relative"}' v-if="tableName=='geti'" prop="yonghuming">
				<div v-if="true" :style='{"color":"#333","left":"-120px","textAlign":"right","width":"120px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>用户名：</div>
				<el-input v-model="registerForm.yonghuming"  placeholder="请输入用户名" />
			</el-form-item>
			<el-form-item :style='{"width":"70%","margin":"0 auto 24px","position":"relative"}' v-if="tableName=='geti'" prop="mima">
				<div v-if="true" :style='{"color":"#333","left":"-120px","textAlign":"right","width":"120px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>密码：</div>
				<el-input v-model="registerForm.mima" type="password" placeholder="请输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"70%","margin":"0 auto 24px","position":"relative"}' v-if="tableName=='geti'" prop="mima">
				<div v-if="true" :style='{"color":"#333","left":"-120px","textAlign":"right","width":"120px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>确认密码：</div>
				<el-input v-model="registerForm.mima2" type="password" placeholder="请再次输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"70%","margin":"0 auto 24px","position":"relative"}' v-if="tableName=='geti'" prop="xingming">
				<div v-if="true" :style='{"color":"#333","left":"-120px","textAlign":"right","width":"120px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>姓名：</div>
				<el-input v-model="registerForm.xingming"  placeholder="请输入姓名" />
			</el-form-item>
			<el-form-item :style='{"width":"70%","margin":"0 auto 24px","position":"relative"}' v-if="tableName=='geti'" prop="touxiang">
				<div v-if="true" :style='{"color":"#333","left":"-120px","textAlign":"right","width":"120px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>头像：</div>
                <file-upload
					tip="点击上传头像"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.touxiang?registerForm.touxiang:''"
					@change="getitouxiangUploadChange"
				></file-upload>
			</el-form-item>
			<el-form-item :style='{"width":"70%","margin":"0 auto 24px","position":"relative"}' v-if="tableName=='geti'" prop="xingbie">
				<div v-if="true" :style='{"color":"#333","left":"-120px","textAlign":"right","width":"120px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>性别：</div>
                <el-select v-model="registerForm.xingbie" placeholder="请选择性别" >
                  <el-option
                      v-for="(item,index) in getixingbieOptions"
                      :key="index"
                      :label="item"
                      :value="item">
                  </el-option>
                </el-select>
			</el-form-item>
			<el-form-item :style='{"width":"70%","margin":"0 auto 24px","position":"relative"}' v-if="tableName=='geti'" prop="nianling">
				<div v-if="true" :style='{"color":"#333","left":"-120px","textAlign":"right","width":"120px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>年龄：</div>
				<el-input v-model="registerForm.nianling"  placeholder="请输入年龄" />
			</el-form-item>
			<el-form-item :style='{"width":"70%","margin":"0 auto 24px","position":"relative"}' v-if="tableName=='geti'" prop="shouji">
				<div v-if="true" :style='{"color":"#333","left":"-120px","textAlign":"right","width":"120px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>手机：</div>
				<el-input v-model="registerForm.shouji"  placeholder="请输入手机" />
			</el-form-item>
			<el-form-item :style='{"width":"70%","margin":"0 auto 24px","position":"relative"}' v-if="tableName=='geti'" prop="renzhengziliao">
				<div v-if="true" :style='{"color":"#333","left":"-120px","textAlign":"right","width":"120px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>认证资料：</div>
                <file-upload
					tip="点击上传认证资料"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.renzhengziliao?registerForm.renzhengziliao:''"
					@change="getirenzhengziliaoUploadChange"
				></file-upload>
			</el-form-item>
			<el-form-item :style='{"width":"70%","margin":"0 auto 24px","position":"relative"}' v-if="tableName=='geti'" prop="shouhuodizhi">
				<div v-if="true" :style='{"color":"#333","left":"-120px","textAlign":"right","width":"120px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>收货地址：</div>
				<el-input v-model="registerForm.shouhuodizhi"  placeholder="请输入收货地址" />
			</el-form-item>
			<el-form-item :style='{"width":"70%","margin":"0 auto 24px","position":"relative"}' v-if="tableName=='fabuqiye'" prop="qiyemingcheng">
				<div v-if="true" :style='{"color":"#333","left":"-120px","textAlign":"right","width":"120px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>企业名称：</div>
				<el-input v-model="registerForm.qiyemingcheng"  placeholder="请输入企业名称" />
			</el-form-item>
			<el-form-item :style='{"width":"70%","margin":"0 auto 24px","position":"relative"}' v-if="tableName=='fabuqiye'" prop="mima">
				<div v-if="true" :style='{"color":"#333","left":"-120px","textAlign":"right","width":"120px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>密码：</div>
				<el-input v-model="registerForm.mima" type="password" placeholder="请输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"70%","margin":"0 auto 24px","position":"relative"}' v-if="tableName=='fabuqiye'" prop="mima">
				<div v-if="true" :style='{"color":"#333","left":"-120px","textAlign":"right","width":"120px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>确认密码：</div>
				<el-input v-model="registerForm.mima2" type="password" placeholder="请再次输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"70%","margin":"0 auto 24px","position":"relative"}' v-if="tableName=='fabuqiye'" prop="qiyetupian">
				<div v-if="true" :style='{"color":"#333","left":"-120px","textAlign":"right","width":"120px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>企业图片：</div>
                <file-upload
					tip="点击上传企业图片"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.qiyetupian?registerForm.qiyetupian:''"
					@change="fabuqiyeqiyetupianUploadChange"
				></file-upload>
			</el-form-item>
			<el-form-item :style='{"width":"70%","margin":"0 auto 24px","position":"relative"}' v-if="tableName=='fabuqiye'" prop="lianxiren">
				<div v-if="true" :style='{"color":"#333","left":"-120px","textAlign":"right","width":"120px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>联系人：</div>
				<el-input v-model="registerForm.lianxiren"  placeholder="请输入联系人" />
			</el-form-item>
			<el-form-item :style='{"width":"70%","margin":"0 auto 24px","position":"relative"}' v-if="tableName=='fabuqiye'" prop="lianxidianhua">
				<div v-if="true" :style='{"color":"#333","left":"-120px","textAlign":"right","width":"120px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>联系电话：</div>
				<el-input v-model="registerForm.lianxidianhua"  placeholder="请输入联系电话" />
			</el-form-item>
			<el-form-item :style='{"width":"70%","margin":"0 auto 24px","position":"relative"}' v-if="tableName=='fabuqiye'" prop="renzhengziliao">
				<div v-if="true" :style='{"color":"#333","left":"-120px","textAlign":"right","width":"120px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>认证资料：</div>
                <file-upload
					tip="点击上传认证资料"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.renzhengziliao?registerForm.renzhengziliao:''"
					@change="fabuqiyerenzhengziliaoUploadChange"
				></file-upload>
			</el-form-item>
			<el-form-item :style='{"width":"70%","margin":"0 auto 24px","position":"relative"}' v-if="tableName=='touziqiye'" prop="touzizhanghao">
				<div v-if="true" :style='{"color":"#333","left":"-120px","textAlign":"right","width":"120px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>投资账号：</div>
				<el-input v-model="registerForm.touzizhanghao"  placeholder="请输入投资账号" />
			</el-form-item>
			<el-form-item :style='{"width":"70%","margin":"0 auto 24px","position":"relative"}' v-if="tableName=='touziqiye'" prop="mima">
				<div v-if="true" :style='{"color":"#333","left":"-120px","textAlign":"right","width":"120px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>密码：</div>
				<el-input v-model="registerForm.mima" type="password" placeholder="请输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"70%","margin":"0 auto 24px","position":"relative"}' v-if="tableName=='touziqiye'" prop="mima">
				<div v-if="true" :style='{"color":"#333","left":"-120px","textAlign":"right","width":"120px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>确认密码：</div>
				<el-input v-model="registerForm.mima2" type="password" placeholder="请再次输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"70%","margin":"0 auto 24px","position":"relative"}' v-if="tableName=='touziqiye'" prop="qiyemingcheng">
				<div v-if="true" :style='{"color":"#333","left":"-120px","textAlign":"right","width":"120px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>企业名称：</div>
				<el-input v-model="registerForm.qiyemingcheng"  placeholder="请输入企业名称" />
			</el-form-item>
			<el-form-item :style='{"width":"70%","margin":"0 auto 24px","position":"relative"}' v-if="tableName=='touziqiye'" prop="touxiang">
				<div v-if="true" :style='{"color":"#333","left":"-120px","textAlign":"right","width":"120px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>头像：</div>
                <file-upload
					tip="点击上传头像"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.touxiang?registerForm.touxiang:''"
					@change="touziqiyetouxiangUploadChange"
				></file-upload>
			</el-form-item>
			<el-form-item :style='{"width":"70%","margin":"0 auto 24px","position":"relative"}' v-if="tableName=='touziqiye'" prop="lianxiren">
				<div v-if="true" :style='{"color":"#333","left":"-120px","textAlign":"right","width":"120px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>联系人：</div>
				<el-input v-model="registerForm.lianxiren"  placeholder="请输入联系人" />
			</el-form-item>
			<el-form-item :style='{"width":"70%","margin":"0 auto 24px","position":"relative"}' v-if="tableName=='touziqiye'" prop="lianxidianhua">
				<div v-if="true" :style='{"color":"#333","left":"-120px","textAlign":"right","width":"120px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>联系电话：</div>
				<el-input v-model="registerForm.lianxidianhua"  placeholder="请输入联系电话" />
			</el-form-item>
			<el-form-item :style='{"width":"70%","margin":"0 auto 24px","position":"relative"}' v-if="tableName=='touziqiye'" prop="renzhengziliao">
				<div v-if="true" :style='{"color":"#333","left":"-120px","textAlign":"right","width":"120px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>认证资料：</div>
                <file-upload
					tip="点击上传认证资料"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.renzhengziliao?registerForm.renzhengziliao:''"
					@change="touziqiyerenzhengziliaoUploadChange"
				></file-upload>
			</el-form-item>
			<el-form-item :style='{"width":"70%","margin":"0 auto 24px","position":"relative"}' v-if="tableName=='touziqiye'" prop="shouhuodizhi">
				<div v-if="true" :style='{"color":"#333","left":"-120px","textAlign":"right","width":"120px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>收货地址：</div>
				<el-input v-model="registerForm.shouhuodizhi"  placeholder="请输入收货地址" />
			</el-form-item>
			<el-button :style='{"border":"none","cursor":"pointer","padding":"0 10px","margin":"20px auto 5px","outline":"none","color":"#fff","borderRadius":"8px","background":"rgba(0, 0, 0, 1)","display":"block","width":"70%","fontSize":"16px","height":"40px"}' type="primary" @click="submitForm('registerForm')">注册</el-button>
			<el-button :style='{"cursor":"pointer","border":"1px solid rgba(204, 204, 204, 1)","padding":"0 10px","margin":"20px auto 5px","outline":"none","color":"#000","borderRadius":"8px","background":"none","display":"block","width":"70%","fontSize":"16px","height":"40px"}' @click="resetForm('registerForm')">重置</el-button>
			<router-link :style='{"cursor":"pointer","padding":"0 15%","color":"rgba(40, 40, 40, 1)","display":"inline-block","lineHeight":"2","fontSize":"12px","textDecoration":"none"}' to="/login">已有账户登录</router-link>
		</el-form>
    </div>
  </div>
</div>
</template>

<script>

export default {
    //数据集合
    data() {
		return {
            pageFlag : '',
			tableName: '',
			registerForm: {
                xingbie: '',
            },
			rules: {},
            getixingbieOptions: [],
		}
    },
	mounted() {
	},
    created() {
      this.pageFlag = this.$route.query.pageFlag;
      this.tableName = this.$route.query.role;
      if ('geti' == this.tableName) {
        this.rules.yonghuming = [{ required: true, message: '请输入用户名', trigger: 'blur' }];
      }
      if ('geti' == this.tableName) {
        this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }];
      }
      if ('geti' == this.tableName) {
        this.rules.xingming = [{ required: true, message: '请输入姓名', trigger: 'blur' }];
      }
        this.getixingbieOptions = "男,女".split(',');
      if ('geti' == this.tableName) {
        this.rules.nianling = [{ required: true, validator: this.$validate.isIntNumer, trigger: 'blur' }];
      }
      if ('geti' == this.tableName) {
        this.rules.shouji = [{ required: true, validator: this.$validate.isMobile, trigger: 'blur' }];
      }
      if ('fabuqiye' == this.tableName) {
        this.rules.qiyemingcheng = [{ required: true, message: '请输入企业名称', trigger: 'blur' }];
      }
      if ('fabuqiye' == this.tableName) {
        this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }];
      }
      if ('fabuqiye' == this.tableName) {
        this.rules.lianxidianhua = [{ required: true, validator: this.$validate.isMobile, trigger: 'blur' }];
      }
      if ('touziqiye' == this.tableName) {
        this.rules.touzizhanghao = [{ required: true, message: '请输入投资账号', trigger: 'blur' }];
      }
      if ('touziqiye' == this.tableName) {
        this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }];
      }
      if ('touziqiye' == this.tableName) {
        this.rules.lianxidianhua = [{ required: true, validator: this.$validate.isMobile, trigger: 'blur' }];
      }
    },
    //方法集合
    methods: {
      // 获取uuid
      getUUID () {
        return new Date().getTime();
      },
        // 下二随
      getitouxiangUploadChange(fileUrls) {
          this.registerForm.touxiang = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },
      getirenzhengziliaoUploadChange(fileUrls) {
          this.registerForm.renzhengziliao = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },
      fabuqiyeqiyetupianUploadChange(fileUrls) {
          this.registerForm.qiyetupian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },
      fabuqiyerenzhengziliaoUploadChange(fileUrls) {
          this.registerForm.renzhengziliao = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },
      touziqiyetouxiangUploadChange(fileUrls) {
          this.registerForm.touxiang = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },
      touziqiyerenzhengziliaoUploadChange(fileUrls) {
          this.registerForm.renzhengziliao = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },

        // 多级联动参数


      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            var url=this.tableName+"/register";
               if(`geti` == this.tableName && this.registerForm.mima!=this.registerForm.mima2) {
                this.$message.error(`两次密码输入不一致`);
                return
               }
               if(`fabuqiye` == this.tableName && this.registerForm.mima!=this.registerForm.mima2) {
                this.$message.error(`两次密码输入不一致`);
                return
               }
               if(`touziqiye` == this.tableName && this.registerForm.mima!=this.registerForm.mima2) {
                this.$message.error(`两次密码输入不一致`);
                return
               }
            this.$http.post(url, this.registerForm).then(res => {
              if (res.data.code === 0) {
                this.$message({
                  message: '注册成功',
                  type: 'success',
                  duration: 1500,
                  onClose: () => {
                    this.$router.push('/login');
                  }
                });
              } else {
                this.$message.error(res.data.msg);
              }
            });
          } else {
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.container {
		position: relative;

		.el-date-editor.el-input {
			width: 100%;
		}
		
		.rgs-form .el-input /deep/ .el-input__inner {
						border: 1px solid rgba(204, 204, 204, 1);
						border-radius: 8px;
						padding: 0 10px;
						outline: none;
						color: rgba(153, 153, 153, 1);
						width: 100%;
						font-size: 14px;
						height: 40px;
					}
		
		.rgs-form .el-select /deep/ .el-input__inner {
						border: 1px solid rgba(204, 204, 204, 1);
						border-radius: 8px;
						padding: 0 10px;
						outline: none;
						color:  rgba(153, 153, 153, 1);
						width: 288px;
						font-size: 14px;
						height: 40px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 1px solid rgba(204, 204, 204, 1);
						border-radius: 8px;
						padding: 0 10px 0 30px;
						outline: none;
						color: rgba(153, 153, 153, 1);
						width: 288px;
						font-size: 14px;
						height: 40px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 1px solid rgba(204, 204, 204, 1);
						border-radius: 8px;
						padding: 0 10px 0 30px;
						outline: none;
						color: rgba(153, 153, 153, 1);
						width: 288px;
						font-size: 14px;
						height: 40px;
					}
		
		.rgs-form /deep/ .el-upload--picture-card {
			background: transparent;
			border: 0;
			border-radius: 0;
			width: auto;
			height: auto;
			line-height: initial;
			vertical-align: middle;
		}
		
		.rgs-form /deep/ .upload .upload-img {
		  		  border: 1px solid rgba(204, 204, 204, 1);
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: rgba(153, 153, 153, 1);
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 100px;
		  		  text-align: center;
		  		  height: 100px;
		  		}
		
		.rgs-form /deep/ .el-upload-list .el-upload-list__item {
		  		  border: 1px solid rgba(204, 204, 204, 1);
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: rgba(153, 153, 153, 1);
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 100px;
		  		  text-align: center;
		  		  height: 100px;
		  		}
		
		.rgs-form /deep/ .el-upload .el-icon-plus {
		  		  border: 1px solid rgba(204, 204, 204, 1);
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: rgba(153, 153, 153, 1);
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 100px;
		  		  text-align: center;
		  		  height: 100px;
		  		}
	}
</style>
