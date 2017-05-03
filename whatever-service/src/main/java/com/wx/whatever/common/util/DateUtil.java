package com.wx.whatever.common.util;


import org.apache.commons.lang.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 * 日期工具类
 * @Description
 * @Company 江苏欣网科技股份有限公司
 * @author cww
 * @createdate 2016年5月30日 上午10:19:51
 */
public class DateUtil {
	private Calendar calendar = null;//日历类

	
	/**
	 * 构造函数初始化，日历类默认当前时间
	 */
	public DateUtil() {
		calendar = Calendar.getInstance();
		calendar.setTime(new Date());
	}

	/**
	 * 获取当前时间的年
	 * @return 返回年
	 */
	public int getYear()
	{
		return calendar.get(Calendar.YEAR);
	}

	/**
	 * 获取当前时间的月
	 * @return 返回月
	 */
	public int getMonth()
	{
		return 1 + calendar.get(Calendar.MONTH);
	}

	/**
	 * 获取当前时间的日/天
	 * @return 返回日
	 */
	public int getDay()
	{
		return calendar.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * 获取当前时间的小时
	 * @return 返回小时
	 */
	public int getHour()
	{
		return calendar.get(Calendar.HOUR_OF_DAY);
	}

	/**
	 * 获取当前时间的分钟
	 * @return 返回分钟
	 */
	public int getMinute()
	{
		return calendar.get(Calendar.MINUTE);
	}

	/**
	 * 获取当时时间的秒数
	 * @return 返回秒数
	 */
	public int getSecond()
	{
		return calendar.get(Calendar.SECOND);
	}

	/**
	 * 获取当前日期，并且格式化为yyyy-MM-dd(yyyy-M-d|2016-1-1)
	 * @return 返回日期字符串
	 */
	public String getDate()
	{
		return getYear() + "-" + getMonth() + "-" + getDay();
	}

	/**
	 * 获取当前时间，并且格式化为HH:mm:ss(1:1:1)
	 * @return 返回时间的字符串
	 */
	public String getTime()
	{
		return getHour() + ":" + getMinute() + ":" + getSecond();
	}

	/**
	 * 获取年月日，并且格式化为yyyyMMdd
	 * @return 年月日字符串
	 */
	public String getYearMonthDayNull()
	{
		String yyyy = "0000", mm = "00", dd = "00";
		yyyy = yyyy + getYear();
		mm = mm + getMonth();
		dd = dd + getDay();
		yyyy = yyyy.substring(yyyy.length() - 4);
		mm = mm.substring(mm.length() - 2);
		dd = dd.substring(dd.length() - 2);
		return yyyy + "" + mm + "" + dd;
	}

	/**
	 * 获取年月，并且格式化为yyyyMM
	 * @return 年月字符串
	 */
	public String getYearMonthNull()
	{
		String yyyy = "0000", mm = "00";
		yyyy = yyyy + getYear();
		mm = mm + getMonth();
		yyyy = yyyy.substring(yyyy.length() - 4);
		mm = mm.substring(mm.length() - 2);
		return yyyy + "" + mm;
	}

	/**
	 * 获取年月日，并且格式化为yyyy-MM-dd(2016-01-01)
	 * @return 年月日字符串
	 */
	public String getYearMonthDay()
	{
		String yyyy = "0000", mm = "00", dd = "00";
		yyyy = yyyy + getYear();
		mm = mm + getMonth();
		dd = dd + getDay();
		yyyy = yyyy.substring(yyyy.length() - 4);
		mm = mm.substring(mm.length() - 2);
		dd = dd.substring(dd.length() - 2);
		return yyyy + "-" + mm + "-" + dd;
	}

	/**
	 * 获取时分秒，并且格式化为HH:mm:ss(01:01:01)
	 * @return 时分秒字符串
	 */
	public String getHourMinuteSecond()
	{
		String hh = "00", mm = "00", ss = "00";
		hh = hh + getHour();
		mm = mm + getMinute();
		ss = ss + getSecond();
		hh = hh.substring(hh.length() - 2, hh.length());
		mm = mm.substring(mm.length() - 2, mm.length());
		ss = ss.substring(ss.length() - 2, ss.length());
		return hh + ":" + mm + ":" + ss;
	}

	/**
	 * 获取时分秒，并且格式化为010101
	 * @return 时分秒字符串
	 */
	public String getHourMinuteSecondNull()
	{
		String hh = "00", mm = "00", ss = "00";
		hh = hh + getHour();
		mm = mm + getMinute();
		ss = ss + getSecond();
		hh = hh.substring(hh.length() - 2, hh.length());
		mm = mm.substring(mm.length() - 2, mm.length());
		ss = ss.substring(ss.length() - 2, ss.length());
		return hh + mm + ss;
	}


	/**
	 * 获取两个时间的差值
	 * 
	 * @param date1
	 *            yyyymmdd 较小的日期
	 * @param date2
	 *            yyyymmdd 较大的日期
	 * @return 返回差值
	 */
	public static int getDiff(String date1, String date2) throws Exception {
		int days = 0;
		Date d1 = new GregorianCalendar(Integer.parseInt(date1.substring(0, 4)), Integer.parseInt(date1.substring(4, 6)), Integer.parseInt(date1.substring(6, 8))).getTime();
		Date d2 = new GregorianCalendar(Integer.parseInt(date2.substring(0, 4)), Integer.parseInt(date2.substring(4, 6)), Integer.parseInt(date2.substring(6, 8))).getTime();
		long diff = d2.getTime() - d1.getTime();
		days = (int) (diff / (1000 * 60 * 60 * 24));
		return days;
	}
	
	/**
	 * 比较两个时间大小
	 * 
	 * @param date1 日期
	 * @param date2 日期
	 * @return 返回布尔值 true 表示第二个日期大，false表示第一个日期大
	 */
	public static boolean compareDate(Date date1, Date date2) throws Exception {
		boolean flag = true;
		if (date2.getTime() < date1.getTime()) {
			flag = false;
		}
		return flag;
	}

	/**
	 * 把日期字符串20010101格式化为日期字符串2001-01-01
	 * @param datetime 字符串型的日期，并且固定格式20010101
	 * @return 返回日期字符串2001-01-01，如果datatime为空字符串，则返回""
	 */
	public static String getYear_Month_Day(String datetime)
	{
		if (StringUtils.isNotBlank(datetime)) {
			String yyyy = "0000", mm = "00", dd = "00";
			yyyy = datetime.substring(0, 4);
			mm = datetime.substring(4, 6);
			dd = datetime.substring(6, 8);
			return yyyy + "-" + mm + "-" + dd;
		} else {
			return "";
		}
	}
	
	/**
	 * 把时间字符串130130格式化为日期字符串13:01:30
	 * @param datetime 字符串型的日期，并且固定格式130130
	 * @return 返回日期字符串13:01:30，如果datatime为空字符串，则返回""
	 */
	public static String getHour_Min_Sec(String datetime)
	{
		if (StringUtils.isNotBlank(datetime)) {
			String hour = "00", minute = "00", second = "00";
			hour = datetime.substring(0, 2);
			minute = datetime.substring(2, 4);
			second = datetime.substring(4, 6);
			return hour + ":" + minute + ":" + second;
		} else {
			return "";
		}
	}

	/**
	 * 把日期字符串2001-01-01格式化为日期字符串20010101
	 * @param datetime 字符串型的日期，并且固定格式2001-01-01
	 * @return 返回日期字符串20010101，如果datatime为空字符串，则返回"NULL"
	 */
	public String getYear_Month_DayNew(String datetime)
	{
		if (StringUtils.isNotBlank(datetime) && datetime != null && !"NULL".equals(datetime)) {
			String yyyy = "0000", mm = "00", dd = "00";
			yyyy = datetime.substring(0, 4);
			mm = datetime.substring(5, 7);
			dd = datetime.substring(8, 10);
			return yyyy + mm + dd;
		} else {
			return "NULL";
		}
	}

	/**
	 * 把日期转化成为字符串，并且格式化为yyyyMMddHHmmss(20010101113030)
	 * @param d
	 * @return 返回时间字符串
	 */
	public static String getTimeString(Date d) {
		String yyyy = "0000", mm = "00", dd = "00", hh = "00", mi = "00", ss = "00";
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(d);
		yyyy = yyyy + calendar.get(Calendar.YEAR);
		mm = mm + (calendar.get(Calendar.MONTH) + 1);
		dd = dd + calendar.get(Calendar.DAY_OF_MONTH);
		hh = hh + calendar.get(Calendar.HOUR_OF_DAY);
		mi = mi + calendar.get(Calendar.MINUTE);
		ss = ss + calendar.get(Calendar.SECOND);
		yyyy = yyyy.substring(yyyy.length() - 4);
		mm = mm.substring(mm.length() - 2);
		dd = dd.substring(dd.length() - 2);
		hh = hh.substring(hh.length() - 2, hh.length());
		mi = mi.substring(mi.length() - 2, mi.length());
		ss = ss.substring(ss.length() - 2, ss.length());
		return yyyy + mm + dd + hh + mi + ss;
	}
	
	/**
	 * 把日期转化成为字符串，并且格式化为yyyyMMdd(20010101)
	 * @param d
	 * @return 返回时间字符串
	 */
	public static String getTimeString8(Date d) {
		String yyyy = "0000", mm = "00", dd = "00";
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(d);
		yyyy = yyyy + calendar.get(Calendar.YEAR);
		mm = mm + (calendar.get(Calendar.MONTH) + 1);
		dd = dd + calendar.get(Calendar.DAY_OF_MONTH);
		yyyy = yyyy.substring(yyyy.length() - 4);
		mm = mm.substring(mm.length() - 2);
		dd = dd.substring(dd.length() - 2);
		return yyyy + mm + dd;
	}
	
	
	
	/**
	 * 把日期转化成为字符串，并且格式化为yyyyMMddHHmmssSSS(20010101113030333)
	 * @param d
	 * @return 返回时间字符串
	 */
	public static String getTimeMilliSecondString(Date d) {
		String yyyy = "0000", mm = "00", dd = "00", hh = "00", mi = "00", ss = "00", sss="000";
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(d);
		yyyy = yyyy + calendar.get(Calendar.YEAR);
		mm = mm + (calendar.get(Calendar.MONTH) + 1);
		dd = dd + calendar.get(Calendar.DAY_OF_MONTH);
		hh = hh + calendar.get(Calendar.HOUR_OF_DAY);
		mi = mi + calendar.get(Calendar.MINUTE);
		ss = ss + calendar.get(Calendar.SECOND);
		sss = sss + calendar.get(Calendar.MILLISECOND);
		yyyy = yyyy.substring(yyyy.length() - 4);
		mm = mm.substring(mm.length() - 2);
		dd = dd.substring(dd.length() - 2);
		hh = hh.substring(hh.length() - 2, hh.length());
		mi = mi.substring(mi.length() - 2, mi.length());
		ss = ss.substring(ss.length() - 2, ss.length());
		sss = sss.substring(sss.length()-3,sss.length());
		return yyyy + mm + dd + hh + mi + ss + sss;
	}
	
	
	

	/**
	 * 获取当前时间的毫秒
	 * @return 返回毫秒
	 */
	public  int getMilliSecond() // 获得毫秒
	{
		return calendar.get(Calendar.MILLISECOND);
	}

	/**
	 * 获取整个时间值，精确到毫秒yyyy-MM-dd HH:mm:ss.ms
	 * @return 返回时间字符串
	 */
	public String getAllToMilliSecond() {
		return this.getYearMonthDay() + " " + this.getHourMinuteSecond() + "." + this.getMilliSecond();
	}

	/**
	 * 获取整个时间值，精确到秒yyyy-MM-dd HH:mm:ss
	 * @return 返回时间字符串
	 */
	public String getAllToSecond() {
		return this.getYearMonthDay() + " " + this.getHourMinuteSecond();
	}
	
	
	/**
	 * 获取整个时间值，精确到分yyyy-MM-dd HH:mm
	 * @return 返回时间字符串
	 */
	public static String getAllToMinute(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");//设置日期格式
		return df.format(date);
	}
	
	

	/**
	 * 获取14位的时间值yyyyMMddHHmmss
	 * @return 返回时间字符串
	 */
	public String getChar14Time()
	{
		return this.getYearMonthDayNull() + this.getHourMinuteSecondNull();
	}
	

	/**
	 * 日期加减 java中对日期的加减操作 gc.add(1,-1)表示年份减一. gc.add(2,-1)表示月份减一.
	 * gc.add(3.-1)表示周减一. gc.add(5,-1)表示天减一.
	 * @param date
	 * @param field，1表示年份，2表示月份，3表示周，4表示天
	 * @param days，负数表示减，正数表示加
	 * @return 返回日期字符串yyyyMMdd
	 * @throws Exception
	 */
	public static String dateAddOrSub(String date, int field, int days) throws Exception {

		GregorianCalendar gc = new GregorianCalendar();
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
		Date dt = sf.parse(date);
		gc.setTime(dt);
		gc.add(field, days);
		gc.set(gc.get(Calendar.YEAR), gc.get(Calendar.MONTH), gc.get(Calendar.DATE));

		return sf.format(gc.getTime());

	}
	
	/**
	 * 日期加减 java中对日期的加减操作 gc.add(1,-1)表示年份减一. gc.add(2,-1)表示月份减一.
	 * gc.add(3.-1)表示周减一. gc.add(5,-1)表示天减一.
	 * @param date
	 * @param field，1表示年份，2表示月份，3表示周，4表示天
	 * @param days，负数表示减，正数表示加
	 * @return 返回日期类型
	 * @throws Exception
	 */
	public static Date dateAddOrSub(Date date, int field, int days) throws Exception {

		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(date);
		gc.add(field, days);
		gc.set(gc.get(Calendar.YEAR), gc.get(Calendar.MONTH), gc.get(Calendar.DATE));
		return gc.getTime();

	}

	/**
	 * 计算时间增加多少秒之后的值 返回时间格式yyyy-MM-dd HH:mm:ss
	 * @param date，格式yyyy-MM-dd HH:mm:ss
	 * @param addSecond 负数表示减时间
	 * @return 返回时间字符串 yyyy-MM-dd HH:mm:ss
	 * @throws Exception
	 */
	public static String addSecond(String date, int addSecond) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Calendar strDate = Calendar.getInstance(); // java.util包,设置当前时间
			strDate.setTime(sdf.parse(date));
			strDate.add(Calendar.SECOND, addSecond); // 日期减 如果不够减会将月变动 //生成
														// (年-月-日)
			return sdf.format(strDate.getTime());
		} catch (ParseException e) {
			throw new RuntimeException("时间增加出现异常！", e);
		}
	}

	/**
	 * 获取前一个月前一天日期 如当天日期为20150525 返回日期为20150424
	 * @return 返回时间字符串，并且格式化为2015-04-24
	 */
	public static String getBeforeMohth() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, -1); // 得到前一天
		calendar.add(Calendar.MONTH, -1); // 得到前一个月
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DATE);
		String stringmonth = month + "";
		String stringday = day + "";
		if (month < 10) {
			stringmonth = "0" + month;
		}
		if (day < 10) {
			stringday = "0" + day;
		}
		return year + "-" + stringmonth + "-" + stringday;
	}


	/**
	 * 格式化时间成字符串yyyy-MM-dd HH:mm:ss 
	 * @param date
	 * @return 2016-03-18 16:28:21
	 */
	public static String getStringDateFormat (Date date) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = df.format(date);
		return dateString;
	}
	
	/**
	 * long型转string（yyyy-MM-dd HH:mm:ss）
	 * @param timelong
	 * @return
	 */
	public static String getStringDateFromLong (long timelong) {
		Date date = new Date(timelong);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = df.format(date);
		return dateString;
	}
	
	
	/**
	 * 转换字符串日期格式的日期为中文日期
	 * @param datestring  如20160708172710
	 * @param format  如yyyyMMddHHmmss
	 * @return
	 * @throws ParseException
	 */
	public static String stringToChineseFormat(String datestring,String format) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse(datestring);
		return getChineseFormat(date);
	}
	
	
	/**
	 * 转换date为中文日期，如2016年7月28日17时25分
	 * @param date
	 * @return
	 */
	public static String getChineseFormat(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		String year = String.valueOf(calendar.get(Calendar.YEAR));
		String month = String.valueOf(1+calendar.get(Calendar.MONTH));
		String day = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
		String hour = String.valueOf(calendar.get(Calendar.HOUR_OF_DAY));
		String minute = String.valueOf(calendar.get(Calendar.MINUTE));
		
		return year+"年 "+month+"月 "+day+"日 "+hour+"时 "+minute+"分";
	}
	
	
	 /**
	  * 返回一个解析后的date
	  * @return
	  */
	 public static Date praseString(String string){
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 try {
			 if(string!=null&&string!="")
				 return sdf.parse(string); 
			 
		} catch (ParseException e) {

			return null;
		}
		return null;
	 }

	 /**
	  * 获取当前时间的date类型
	  * @return
	  */
	 public static Date getNowTime(){
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 try{
			String date  = sdf.format(new Date());
			return sdf.parse(date);
		 }catch(Exception e){
			 return null;
		 }
	 }
	/**

	 /**
	 * 获取年月日这样的时间格式
	 * @param date
	 * @return
	 */
	public static String getYearMonthDay(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		return sdf.format(date);
	}
	
	/**
	 * 获取中文格式的日期
	 * @param datestring
	 * @param format
	 * @return
	 * @throws Exception
	 */
	public static String getYearMonthDay(String datestring,String format) throws Exception{
		Date date = new SimpleDateFormat(format).parse(datestring);
		return getYearMonthDay(date);
	}
	
	/**
	 * 根据excel获取时间 格式为yyyy/mm/dd
	 */
	public static Date getExcelTime(String time){
		time=time.replace("-", "/");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		try{
			if(null!=time){
				date = sdf.parse(time);
			}
		}catch(Exception e){
			 date = null;
		}
		return date;
	}
	
	/**
	 * 获取当前时间yyyy/MM/dd日期格式
	 * @throws ParseException 
	 */
	public static Date getYyyyMMdd() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		return sdf.parse(sdf.format(new Date())+"-1");
	}
	
	/**
	 * 比较两个时间大小
	 * 
	 * @param date1 日期
	 * @param date2 日期
	 * @return 返回布尔值 
	 */
	public static boolean compareNowDate(Date date1, Date date2) throws Exception {
		boolean flag = false;
		if (date2.getTime() <= date1.getTime()) {
			flag = true;
		}
		return flag;
	}
	
	/**
	 * 将yyyy-MM-dd转为yyyy/MM/dd格式
	 * @param time
	 * @return
	 */
	public static Date getYearFormat(String time){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		String time2 = null;
		Date date=null;
		try {
			//如果是yyyy/mm/dd的格式  不用转换
			if(time!=null&&!"".equals(time) && time.contains("/")){
				date = sdf2.parse(time);
			}else if(null!=time && !"".equals(time)){
				time2 = sdf2.format(sdf.parse(time));
				date = sdf2.parse(time2);
			}
		} catch (ParseException e) {
			throw new RuntimeException("日期转换格式出现异常："+e.getMessage());
		}
			
		return date;
	}

	/**
	 * 获取当前年份
	 * @return
	 */
	public static int getNowYear(){
		Calendar c = Calendar.getInstance();
		return c.get(Calendar.YEAR);
	}
	
	/**
	 * 获取当前月份
	 * @return
	 */
	public static String getNowMonth(){
		Calendar c = Calendar.getInstance();
		int a = c.get(Calendar.MONTH)+1;
		if(a<10){
			String b = String.valueOf(a);
			String d = "0"+b;
			return d;
		}else{
			return String.valueOf(a);
		}
	}
	
	//获取年/月/日的时间格式
	public static String getYYYYdd(Date date){
		if(date!=null){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		return sdf.format(date);
		}else{
			return null;
		}
	}
	
	//获取年-月-日这样的时间格式
	public static String getYYYY_MM(Date date){
		if(date!=null){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			return sdf.format(date);
		}else{
			return null;
		}
	}
	
	//插入数据库date格式
	public static Date getSqlDate(String time){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    Date d1;
		try {
			d1 = sdf.parse(time);
			java.sql.Date d2 = new java.sql.Date(d1.getTime());
			return d2;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	//获取字符串当前时间
	public static String getStringNowTime()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(new Date());
	}
	//测试
	public static void main(String[] args) throws ParseException {
		DateUtil du = new DateUtil();
		System.out.println(du.getChar14Time());
		
	}
}
