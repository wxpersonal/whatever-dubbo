package com.wx.whatever.common;

/**
 * 常量定义
 * @createdate 2016年5月30日 上午10:20:01
 */
public interface CONST {
	
	/**
	 * 通用常量
	 * 调用方式为CONST.COMMON.USERTOKEN
	 */
	interface COMMON {
		String USERINFO = "userinfo";
		String USERMAP = "userMap";
		String TMP_FILE_FLORD = "tempattachments";//临时文件夹，用于存放上传的照片
		String FILE_FLORD = "attachments";//正式文件夹，当用户发布动态后会从临时文件夹拷贝照片
		String FILE = "file";//文件统一存放至attachments/file下， 图片存放至attachments下
		String HEADPHOTO="headphoto";//用户头像文件夹
		String PERSONAL_FLORD = "peopleattachments";//用户个人设置存放的附件位置
		String EMAIL_FLORD = "emailattachments";//邮件附件存放位置
//		String NEWS_ATTACHMENTS = "newsattachments";//公告存放的附件位置
		String OPT = System.getProperty("file.separator");
		String WXDEMAND_ATTACHMENTS = FILE_FLORD+OPT+FILE;//无线需求单存放的附件位置
		int NOTEFFECTIVE_USER = 0;//人员无效状态
		int EFFECTIVE_USER = 1;//人员启用状态
		int UNEFFECTIVE_USER = 2;//人员未启用状态
		String EFFECTIVE_HELP = "1";//问题有效
		String UNEFFECTIVE_HELP = "0";//问题无效
		Integer EFFECTIVE_NEWS = 1;//公告有效
		Integer UNEFFECTIVE_NEWS = 0;//公告无
		String EFFECTIVE_ADVICE = "1";//意见反馈有效
		String UNEFFECTIVE_ADVICE = "0";//意见反馈无效
		String PHOTOSTYLE_DYNAMIC = "1";//照片类型为实时拍照
		String PHOTOSTYLE_ADD = "2";//照片类型为补录照片
		int CHECK_PENDING_DYNAMIC = -1;//待审核
		int EFFECTIVE_DYNAMIC = 0;//有效状态
		int DELETED_DYNAMIC = 1;//删除状态
		int INVALID_DYNAMIC = 2;//审核不通过
		String SG_DYNAMICTYPE = "1";//工程动态为施工
		String JL_DYNAMICTYPE = "2";//工程动态为监理
		String SJ_DYNAMICTYPE = "3";//工程动态为设计
		String DX_DYNAMICTYPE = "4";//工程动态为电信
		
	}
	
	/**
	 * 异常常量
	 * 调用方式为CONST.CODE.SUCCESS_SELECT
	 */
	interface CODE {
		int SUCCESS_SELECT = 10000;//查询成功
		int FAIL_SELECT = 20000;//查询失败
		int SUCCESS_INSERT = 10001;//插入成功
		int FAIL_INSERT = 20001;//插入失败
		int SUCCESS_UPDATE = 10002;//更新成功
		int FAIL_UPDATE = 20002;//更新失败
		int SUCCESS_DELETE = 10003;//删除成功
		int FAIL_DELETE = 20003;//删除失败
		
		
		int NO_USER = 20004;//用户不存在
		int SUCCESS_LOGIN = 10005;//登录成功
		int FAIL_LGOIN = 20005;//登录失败
		int ERROR_PASSWORD = 20006;//密码错误
		int SUCCESS_GETCODE = 10007;//成功获取验证码
		int FAIL_GETCODE = 20007;//获取验证码失败
		int ERROR_VERIFYCODE = 20008;//验证码错误
		int FIRST_LOGIN = 10008;//第一次登录
		
		
		int NO_POSTINFO = 20009;//用户角色不存在
		int NO_AUTHORITY = 20010;//用户无权限
		
		int SUCCESS_PUSLISH = 10011;//动态发布成功
		int FAIL_PUBLISH = 20011;//动态发布失败
		
		int SUCCESS_UPLOAD = 10012;//附件上传成功
		int FAIL_UPLOAD = 20012;//附件上传失败
		
		int APPLYMENT_EXIST_USER=20013;//用户已存在
		int APPLYMENT_EXIST_APPLY=20014;//用户已注册
		int APPEAR_EXCEPTION=20015;//出现异常
		int NO_OBJECT = 20016;//对象不存在
		int INVALID_OBJECT = 20017;//对象已失效
		int MULTI_USER = 20018;//存在多个用户
	}
	
	
	/**
	 * 公众号账号状态
	 * @author lnn
	 *
	 */
	interface MPUSERSTATUS{
		int MPUSER_STATUS_UNSUBSCRIBE=0;//取消关注
		int MPUSER_STATUS_SUBSCRIBE=1;//已关注
		int MPUSER_STATUS_REL=2;//已关联系统账号
		int MPUSER_STATUS_INVALID=-1;//非法无效账号
	}
	
	
	/**
	 * 系统通用状态
	 * 0：无效，否……
	 * 1：有效，是……
	 * @author lnn
	 *
	 */
	interface SYSTEMSTATUS{
		int NO = 0;
		int YES = 1;
	}
	
	
	
	/**
	 * 工程动态类型
	 * @author lnn
	 *
	 */
	interface DYNAMICTYPE{
		String SG_XCPZ = "1";//施工人员现场拍照
		String XCJL = "2";//现场监理
		String SJ_SJCK = "3";//设计查勘
		String DX_XCPZ = "4";//电信人员现场拍照
		String SGBL = "7";//施工人员补录照片
		String JLBL = "8";//监理人员补录照片
		String DXBL = "9";//电信人员补录照片
		String CKBL = "10";//设计人员补录照片
		String ZLJCY_XCPZ = "11";//质量检查员现场拍照
		String ZLJCYBL = "12";//质量检查员补录照片
		String WTZG = "13";//问题整改
		String XCQD = "14";//现场签到
		String XCJC="16";//现场检查
		String JL_JLQD="21";//监理日志
		String ZYCJ = "22";//资源采集
		
	}
	
	/**
	 * 委托类型
	 * @author lnn
	 *
	 */
	interface ENTRUSTTYPE{
		String SJ_TYPE = "1";//设计委托
		String SG_TYPE = "3";//施工委托
		String JL_TYPE = "4";//监理委托
	}
	
	/**
	 * 供应商类型
	 * @author lnn
	 *
	 */
	interface PROVIDERTYPE{
		String GHPROVIDER = "1";//供货
		String SGROVIDER = "2";//施工
		String SJROVIDER = "3";//设计
		String JLROVIDER = "4";//监理
		String TOWERPROVIDER = "5";//铁塔
		String DDPROVIDER = "6"; //督导单位
	}
	
	
	
	/**
	 * 客户端类型
	 * @author cww
	 */
	interface CLIENTTYPE {
		int WEB = 1;//WEB端
		int YIXIN = 2;//易信公众号
		int APP = 3;//app端
	}
	
	/**
	 * 人员分支
	 * @author lnn
	 *
	 */
	interface EMPLOYEEBRANCH {
		int COMPANYMAN = 1;//电信人员
		int PROVIDERMAN = 8;//合作单位人员
		
		
		String SG_NAME="施工人员";
		String JL_NAME="监理人员";
		String SJ_NAME = "设计人员";
		
		String ITEM_MANAGER_NAME = "工程管理员";
		String PROJECT_MANAGER_NAME = "主项工程管理员";
		String PROVINCE_MANAGER_NAME = "立项管理员";
		String ZLJCY_NAME = "质量检查员";
	}
	

	/**
	 * 人员角色 
	 * @author lnn
	 *
	 */
	interface EMPLOYEEPOST{
		String ZJL = "1";//总经理
		String FZJL = "2";//副总经理
		String JSZGLD = "3";//建设主管领导
		String LX_MANAGER = "4";//立项管理员
		String SW_MANAGER = "5";//商务管理员
		String ITEM_MANAGER = "6";//工程管理员
		String DOCUMENT_MANAGER = "7";//文档管理员
		String SYSTEM_MANAGER = "8";//系统管理员
		String ZX_MANAGER = "9";//主项管理员
		String AUDIT_MAN = "13";//审计人员
		String DEPARTMENT_LEADER = "33";//部门领导
		String SUPPER_MANAGER = "65";//系统超级管理员
		String ZLJCY = "100";//质量检查员
		String PROVIDER_MANAGER = "600";//外协系统管理员
		String SJ_MAN = "601";//设计人员
		String SG_MAN = "602";//施工人员
		String JL_MAN = "603";//监理人员
		String ENTRUST_MAN = "604";//委托管理员
		String PROVIDER_MAN = "605";//外协人员
		String AREAONWER_MAN = "606";//区域负责人
		String DD_MAN = "607"; //督导人员
		/*--------无线网新增角色---------*/
		String WX_KTMAN = "205";//无线网开通人员
		String WX_REQ_MAN="200";//无线网需求发起人
		String WX_EXAM_MAN="201";//无线网需求审批人
		String WX_MANAGER="202";//无线网项目经理
		
		
		
		
	}
	
	/**
	 * 人员性别
	 * @author lnn
	 *
	 */
	interface SEX{
		String MAN = "1";//男性
		String WOMAN = "0";//女性
	}
	
	/**
	 * 项目干系人类型
	 * @author lnn
	 *
	 */
	interface ITEMREFEMPTYPE{
		String PROCESS_TYPE = "3";//关联施工人员
		String DESIGN_TYPE = "1";//设计人员
		String KEYAN_TYPE = "2";//可研人员
		String JIANLI_TYPE = "4";//监理人员
		String CAIWU_TYPE = "5";//财务人员
		String SHENJI_TYPE = "6";//审计人员
		String SUIGONG_TYPE = "7";//随工人员
		String ANJIAN_TYPE = "8";//安检人员
		String SUBPROJECTMAN_TYPE = "9";//工程管理员
		String PROJECTMAN_TYPE = "10";//主项工程管理员
		String PROVINCEMAN_TYPE = "11";//立项管理员
		String MAJORMAN_TYPE = "12";//专业管理员
		String PROCESSMANAGER_TYPE = "13";//施工负责人
		String DESIGN_CHARGE_TYPE = "14"; //设计负责人
		String JIANLI_CHARGE_TYPE="15";//监理负责人
		String SAFE_TYPE = "16";//安全员
		String PM_TYPE = "17";//项目经理
	}
	
	/**
	 * 工程关注状态 
	 * @author lnn
	 *
	 */
	interface MYITEMSTATUS{
		String FOCUS = "1";//以关注
		String UNFOCUS = "2";//未关注
	}
	/**
	 * 工程关注类型 
	 * @author zxs
	 *
	 */
	interface MYITEMTYPES{
		Integer ITEMTYPE = 1;//湖南移动基站
	}
	interface  ITEMTYPE{
		String ITEMTYPE="1";//工程动态表里面的类型
	}
	interface TABLENAME {
		String ITEMDYNAMIC="itemdynamic";
		String HASSTATUS="hasstatus";
	}
	
	/**
	 * iteminfo表的tabname字段
	 * @author lnn
	 *
	 */
	interface TABNAME{
		String KQDYNAMIC = "kqdynamic";
		String DYNAMIC = "dynamic";
	}
	
	interface TABLEFIELD {
		String DYNAMICTYPE="dynamictype";
		String HASSTATUS="hasstatus";
	}
	
	/**
	 * 
	 * 附件类型
	 * @author lnn
	 *
	 */
	interface DOCTYPE{
		String DTFB = "1219";//动态发布的图片
		String GRSZ = "1000";//个人设置上传的附件
		String EMAIL = "1001";//邮件附件
		String NEWS = "1002";//公告附件
		String BUILDDEMANDCONFIRM = "1003";//建设需求确认附件
		String BUILDSTARTWORKAPP="1004";//建设待开工申请附件
		String WXOPEN="1005";//上传开通单验报告附件
	}
	
	/**
	 * 附件状态
	 * @author lnn
	 *
	 */
	interface DOCSTATUS{
		String EFFECTIVE = "1";//附件有效
		String UNEFFECTIVE = "0";//附件无效
	}
	
	
	interface PIC_SUFFIX{
		String JPG = ".jpg";
		String JPEG = ".jpeg";
		String GIF = ".gif";
		String PNG = ".png";
		String BMP = ".bmp";
	}
	
	
	
	/**
	 * 邮箱类型
	 * @author lnn
	 *
	 */
	interface EMAILBOXTYPE{
		int RECIEVEBOX = 1;//收件箱
	    int SENDBOX = 2;//发件箱
	    int DRAFTBOX = 3;//草稿箱
	}
	
	/**
	 * 邮件类型
	 * @author lnn
	 *
	 */
	interface EMAILTYPE{
        int NEWEMAIL = 1;//新邮件
        int FORWARDEMAIL = 2;//转发邮件
        int REPLYEMAIL = 3;//回复邮件
        int DRAFTEMAIL = 4;//草稿邮件
	}
	
	
	/**
	 * 更改邮件的状态
	 * @author lnn
	 *
	 */
	interface EMAILSTATUS{
		int ALREADYREADSTATUS = 1;//置为已读状态
		int FORWARDSTATUS = 2;//置为转发状态
		int REPLYSTATUS = 3;//置为回复状态
		int DRAFTSTATUS = 4;//置为草稿状态
	}
	
	
	interface MPIFLOG {
		public static final String IFCODE_JOIN = "JOIN";//接口编码：公众接入
		  public static final String IFCODE_MSG = "MSG";//接口编码：消息
		  
		  public static final String IFCODE_MSG_text_REL_MOBILE = "MSG_text_REL_MOBILE";//关联系统帐号的手机号码，并由系统发送了验证码
		  
		  public static final String IFCODE_MSG_text_REL_MOBILE_NONE = "MSG_text_REL_MOBILE_NONE";//关联系统帐号的手机号码，此手机号码不存在
		  
		  public static final String IFCODE_MSG_text_REL_MOBILE_SUCCESS = "MSG_text_REL_MOBILE_SUCCESS";//关联系统帐号的验证码，关联成功
		  
		  public static final String IFCODE_MSG_text_REL_CHECKCODE_INVALID = "MSG_text_REL_CHECKCODE_INVALID";//关联系统帐号的验证码，错误的验证码
		  
		  public static final String IFCODE_MSG_text_REL_MOBILE_FAIL = "MSG_text_REL_MOBILE_FAIL";//关联系统帐号的验证码，关联失败

		  public static final String IFCODE_MSG_text_REL_MOBILE_INVALID = "MSG_text_REL_MOBILE_INVALID";//无效手机号码
		  
		  public static final String IFCODE_OAUTH = "OAUTH";//授权认证

		  public static final int DR_NONE = 0;//处理结果：0表示未处理
		  public static final int DR_SUCCESS = 1;//处理结果：1表示成功
			public static final int DR_FAIL = 2;//处理结果：2处理过，但是处理失败

			public static final String IFCODE_MSG_text_REL_MOBILE_CUR_USER = "MSG_text_REL_MOBILE_CUR_USER";//此手机号码已经存在关联当前帐号，则提示已经关联过，不需要再关联了
			public static final String IFCODE_MSG_text_REL_MOBILE_OTHER_USER = "MSG_text_REL_MOBILE_OTHER_USER";//此手机号码已经存在其他于其他帐号
	}
	
	
	/**
	 * 基本的操作类型
	 * @author lnn
	 *
	 */
	interface OPERATETYPE{
		int ADD=1;  //增加
		int MODIFY=2;//修改
		int DELETE=3;//删除
	}
	
	
	/**
	 * 工程查询的模式
	 * @author lnn
	 *
	 */
	interface SEARCHITEMINFOMODEL{
		int SIMPLEMODEL=0;
	    int COMPLEXMODEL=1;
				
	}
	
	/**
	 * excel导入方法
	 */
	interface IMPORTTYPE{
		int PROVIDERCOMPANY = 1;//供应商导入
		int EMPLOYEE = 2;//人员导入
		int COMMONCOMPANY = 3;//通用版供应商导入
	}
	
	/**
	 * 水印文字长度
	 */
	interface PICTURE{
		int LENGTH = 23;
	}
	
	/**
	 * 发送消息的类型
	 * @author lnn
	 *
	 */
	interface SENDMESSAGETYPE{
		String XJSMS="211";//新疆发送短信
		String ADDPHOTO="300";//补录照片消息推送
		String OATODO = "222";//OA待办
		String SUPPLYCHAIN_PROJECT="999";//供应链，翼工程项目基本信息及附属物料信息下发接口业务id
		String SUPPLYCHAIN_RM="666";//供应链，领料需求接口业务id
		String SUPPLYCHAIN_TM="333";//供应链，调拨需求接口业务id
		String TTDEMAND="555";//对应于铁塔方接口
		String XJITEMREMIND="444";//新疆工程提醒
	}

	/**
	 * app端异常码
	 * @author lnn
	 *
	 */
	interface APPEXCEPTIONCODE{
		int INVALID_TOKEN = 400;//非法的token
	}
	
	/**
	 * 使用环境,用以区分测试库和正式库
	 *
	 */
	interface ENVRIONMENT{
		String TEST="test";//测试环境
		String OFFICIAL="offical";//正式环境
	}
	
	/**
	 * 待办状态  0待办 1已办  -1 取消
	 */
	interface MATTERSTATUS{
		Long TODO = 0L;
		Long DONE = 1L;
		Long CANCEL = -1L;
	}
	
	/**
	 * 通知状态  0未读 1已读  
	 */
	interface READSTATUS{
		Integer TODO = 0;
		Integer DONE = 1;
	}
	
	interface CODESTYLE{
		String STATIONCODE = "stationcode";
		String DEMANDCODE = "demandcode"; 
		String HNSTATIONCODE = "hnstationcode";
	}
	
	
	/**
	 * 开通状态
	 */
	interface OPENSTATUS{
		Integer SHOWOPEN=1800;//显示待开通
		Integer STARTOPEN=1801;//待开通状态
		Integer OPENSITE=1802;//站点开通（设备厂商）
		Integer OPENREPLY=1803;//站点开通反馈（设备厂商）
		Integer UPLOAD_REPORT=1804;//上传开通单验报告（设备厂商）
		Integer REOPEN=1805;//站点回退
		Integer OPEN_STOP=1899;//开通作废
	}
	
	/**
	 * 验收状态
	 */
	interface WXCOMPLETESTATUS{
		Integer TOCOMPLETE=1901;//待竣工状态
		Integer COMPLETEMODIFY=1902;//验收退回待修改
		Integer PERFORMANCEUPLOAD=1903;//待上传性能指标
		Integer TOEXAMINE=1904;//验收材料待审核
		Integer EXAMINEAPPROVE=1905;//验收材料审核通过
		Integer EXAMINEBACK=1906;//验收材料审核不通过
		Integer COMPLETE_STOP=1999;//验收作废
	}
	
	/**
	 * 需求状态
	 */
	interface WXDEMANDSTATUS{
		Integer DEMANDTOSIGN=1201;//需求待签收（铁塔）
		Integer DEMANDTOCONFIRM=1202;//需求待确认（铁塔）
		Integer DEMANDTOUPLOAD=1203;//待上传需求订单（铁塔）
		Integer FIRSTPARTYCOMFIRM=1204;//需求订单待确认(甲方)
		Integer DEMANDTOMAJOR=1205;//需求待专业委托
		Integer DEMAND_STOP=1206;//建设需求已完结
		Integer DEMANDORDERSIGN=1207;//订单确认待签收（铁塔）
	}
	
	/**
	 * 需求状态
	 */
	interface WXSTATIONSTATUS{
		Integer NEWWXSTATION=1100;//零散需求站点新建
		Integer WXSTATIONSTART=1101;//零散需求站点新建待审核
		Integer WXSTATIONBACK=1102;//回退待处理
		Integer TOASSESSMENT=1103;//零散需求站点资源待评估
		Integer TOMAKEUP=1104;//评估待补录
		Integer WXSTATIONSTORE=1105;//储备库站点
		Integer WXSTATIONPLAN=1106;//规划库站点
		Integer TOTOWERSTATION=1107;//待提交铁塔站点
		Integer TOWERSTATION=1108;//铁塔站点
//		Integer WXBUILMANAGER = 1109;//提交给无线网建设需求管理员
		Integer TEMPWXSTATION=1110;//右侧
		Integer WXSTATION_STOP=1199;//站点终止
	}
	
	/**
	 * 立项状态
	 */
	interface WXENTRUSTSTATUS{
		Integer TOTHIRD=1301;//待三方委托
		Integer MAJOREND=1302;//委托待签收(专业委托完结)
		Integer THIRDTOSIGN=1401;//三方委托待签收
		Integer TOITEMUPLOAD=1402;//项目建议任务待上传
		Integer THIRD_STOP=1403;//三方委托完结
		Integer WXITEMSTART=1501;//项目建议已新建
		Integer WXITEMUPLOAD=1502;//项目设计待上传
		Integer PROJECTBEGIN=1503;//项目建议待立项
		Integer WXITEMBACK=1504;//项目建议退回待修改
		Integer WXITEM_STOP=1599;//项目建议已退回作废
	}
	

	/**
	 * 配置的状态信息
	 * @author lnn
	 *
	 */
	interface OBJECTSTATUS{
		Long FIX_STATUS = 200L;//问题整改业务标识
		Long STATUSID1 = 20000L;//待受理
		String STATUSNAME1 = "待受理";
		Long STATUSID2 = 20001L;//已受理
		String STATUSNAME2 = "已受理";
		Long STATUSID3 = 20002L;//已提交整改措施
		String STATUSNAME3 = "已提交整改措施";
		Long STATUSID4 = 20003L;//整改完成待复查
		String STATUSNAME4 = "整改完成待复查";
		Long STATUSID5 = 20004L;//整改完成
		String STATUSNAME5 = "整改完成";
		Long STATUSID6 = 20005L;//复查未通过
		String STATUSNAME6 = "复查未通过";
		
		Long CHECK_STATUS = 300l;//补录审核业务标识
	}
	
	interface WXDEMANDLISTSTATUS{
		Integer CREATESTATUS=2001;//已创建需求
		Integer DEMANDSTATUS=2002;//需求已确认
		Integer ORDERSTATUS=2003;//订单已签约
		Integer STARTSTATUS=2004;//订单已开工
		Integer STOPSTATUS=2005;//订单已完工
		Integer PAYSTATUS=2006;//订单已交付
		Integer DEMANDCANCL=2007;//需求已取消
		Integer ORDERCANCL=2008;//订单已取消
	}
	
	/**
	 * 设计所有状态
	 */
	interface WXDESIGN{
		Integer STARTDESIGN = 1601;//设计开始
		Integer DESIGNBACK = 1699;//设计被退回作废
		Integer THIRDENTRUSTSTATUS = 1;//设计方设计后更改三方站点为1
		Integer DESIGNAPRO = 1603;//项目管理员通过后为1603
		Integer SCENESUBMIT = 1603;//交底完成
		Integer DESIGNDISAPR = 1602;//需重新上传设计文档
	}
	/**
	 * 建设所有状态
	 */
	interface WXBUILD{
		Integer STARTBUILD = 1701;//开始建设
	}
	
	/**
	 * 是否为内置人员
	 *
	 */
	interface ISINTERNAL{
		Long INTERNAL = 1L;
		Long NOTINTERNAL = 0L;
	}
	
	/**
	 * 通用查询导出字段类型
	 */
	interface JASEXPORTTYPE{
		String STRING = "1";
		String NUMBER = "2";
		String DOUBLE = "3";
		String DATE = "4";
		String DATETIME = "5";
	}
	
	
	/**
	 * 推送主类型
	 * 
	 *
	 */
	interface PUSHMAINTYPE{
		String DYNAMICTYPE="100";//动态消息
		String MATTERTYPE="101";//待办消息
		String NEWSTYPE="102";//公告消息
		String WEEKLYREPORTTYPE="103";//周报消息
	}
	
	/**
	 * 拍照要求类型
	 */
	interface PICREQUESTTYPE{
		String CHECK = "1";    //检查内容
		String KQCLIST = "2";      //关键工序
		String WEATHER = "3";  //特殊天气
		String AREA = "4";     //特殊地段
	}
	
	/**
	 * 
	 * <p>Title:NOTICETYPE</p>
	 * <p>Description:通知类型配置</p>
	 * @author 94496
	 * @date 2017年1月24日
	 */
	interface NOTICETYPE{
		int dynamictype = 200;
	}
	
	/**
	 * 是否选择账号登录
	 * @author hasee
	 */
	interface ISCHOOSELOGIN{
		String yes ="1";
		String no ="0";
	}
	
	/**
	 * 关键工序等级，1为初始化的关键工序 2为细化的二级工序
	 * <p>Title:KQCLISTLEVEL </p>
	 * <p>Company:江苏欣网科技股份有限公司 </p>
	 * @author:biqiang
	 * @date:2017年3月15日
	 */
	interface KQCLISTLEVEL{
		/**关键工序*/
		Short KEY_KQC=1;
		/**二级工序*/
		Short SECOND_KQC=2;
	}
	
	/**
	 * 采集单位
	 */
	interface QCCOLLECT{
		Short JS_COMPANY=1; //建设单位
		Short SJ_COMPANY = 2;//设计单位
		Short JL_COMPANY =  3;//监理单位
		Short SG_COMPANY = 4;//施工单位
		Short YS_COMPANY = 5;//验收单位
	}
}
