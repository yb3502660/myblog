package com.bingo.utils;

import org.apache.commons.lang3.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateUtil {
	public static final String DATE_PATTERN = "yyyy-MM-dd";
	public static final String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
	public static final String TIME_PATTERN = "HH:mm:ss";
	/**
	 * 时间模式：yyyy-MM
	 */
	public static final String MONTH_PATTERN = "yyyy-MM";

	/**毫秒计算
	 */
	public static String format(long millis, String pattern) {
		return format(new Date(millis), pattern);
	}

	public static String format(Date date, String pattern) {
		DateFormat formatter = new SimpleDateFormat(pattern);
		return formatter.format(date);
	}
	
	public static String formartDate(Date date) {
		return format(date, DATE_PATTERN);
	}

	public static String formartTime(Date date) {
		return format(date, TIME_PATTERN);
	}

	public static String formartDateTime(Date date) {
		return format(date, DATE_TIME_PATTERN);
	}

	public static String formatCurrent(String pattern) {
		return format(new Date(), pattern);
	}
	
	public static String formartCurrentMonth() {
		return format(new Date(), "yyyy-MM");
	}

	public static String formartCurrentDate() {
		return format(new Date(), DATE_PATTERN);
	}

	public static String formartCurrentTime() {
		return format(new Date(), TIME_PATTERN);
	}

	public static String formartCurrentDateTime() {
		return format(new Date(), DATE_TIME_PATTERN);
	}

	public static String formartCurrentYear4() {
		return format(new Date(), "yyyy");
	}

	public static String formartCurrentDate8() {
		return format(new Date(), "yyyyMMdd");
	}

	public static String formartCurrentTime6() {
		return format(new Date(), "HHmmss");
	}

	public static String formartCurrentDateTime14() {
		return format(new Date(), "yyyyMMddHHmmss");
	}
	
	/** 
     * 获取当月的 天数 
     * */  
    public static int getCurrentMonthDay() {  
        Calendar a = Calendar.getInstance();  
        a.set(Calendar.DATE, 1);  
        a.roll(Calendar.DATE, -1);  
        int maxDate = a.get(Calendar.DATE);  
        return maxDate;  
    }
	
	public static String dayOfWeek(){
		SimpleDateFormat formatter = new SimpleDateFormat(DATE_PATTERN,Locale.CHINA);  
		Calendar cal = Calendar.getInstance(Locale.CHINA);   
		//其余的行不变只加入这一行即可，设定每周的起始日。  
		cal.setFirstDayOfWeek(Calendar.MONDAY); 
		//以周1为首日  
		cal.setTimeInMillis(System.currentTimeMillis());
		//当前时间 
//		System.out.println("当前时间:"+formatter.format(cal.getTime()));   
		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY); 
		return formatter.format(cal.getTime()); 
	}

	/**
	 * 获取当前时间的前某个月的时间
	 * @date 2017年2月7日 下午12:02:06 
	 * @author Qin Dachang
	 * @param num 前几个月
	 * @return
	 */
	public static String getMonthAgo(int num){
	    Calendar calendar = Calendar.getInstance(); 
	    calendar.add(Calendar.MONTH, - num);    //得到前一个月 
	    return formartDateTime(calendar.getTime());
	}
	public static void main(String[] args) throws Exception{
//		String timeLimit = "1535126400000";
//		Date date = new Date(Long.parseLong(timeLimit));
////		SimpleDateFormat format = new SimpleDateFormat();
////		String dateStrs = format.format(date);
//		System.err.println(DateUtil.formartDate(date));
//		System.out.println(getHourAgo(17));
//		System.out.println(getDateBefore(1));

		System.out.println(DateUtil.format(DateUtil.getStartTime(), DATE_TIME_PATTERN));
		//System.out.println(DateUtil.formartCurrentDateTime(,DATE_TIME_PATTERN));
		System.out.println(DateUtil.format(DateUtil.getnowEndTime(), DATE_TIME_PATTERN));
	}

	public static Date getCurrentDate() {
		Calendar cal = Calendar.getInstance();
		cal.set(11, 0);
		cal.set(12, 0);
		cal.set(13, 0);
		cal.set(14, 0);
		return cal.getTime();
	}
	
	public static Date getNow() {
		return new Date();
	}

	public static Date getTheDate(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(11, 0);
		cal.set(12, 0);
		cal.set(13, 0);
		cal.set(14, 0);
		return cal.getTime();
	}

	/**
	 * 比较两个时间：如果start比end小，那么返回-1，相等返回0，大于返回1
	 */
	public static int compareDate(String start,String end ,String pattern){
		if(StringUtils.isBlank(pattern)){
			pattern = DATE_TIME_PATTERN;
		}
		if ((start == null) || (end == null)){
			return -1;
		}
		Date sdate = getTheDate(parse(start, pattern));
		Date edate = getTheDate(parse(end, pattern));
		return sdate.compareTo(edate);
	}
	
	/**
	 * 比较两个时间：如果start比end小，那么返回-1，相等返回0，大于返回1
	 */
	public static int compareDate(String start, String end) {
		return compareDate(start, end, DATE_TIME_PATTERN);
	}
	
	public static int compareDate(Date start, Date end) {
		if ((start == null) && (end == null))
			return 0;
		if (end == null)
			return 1;
		if (start == null) {
			start = new Date();
		}
		start = getTheDate(start);
		end = getTheDate(end);
		return start.compareTo(end);
	}

	public static Date parse(String dateString, String pattern) {
		if (pattern.contains(":start")) {
			pattern = pattern.replace(":start", TIME_PATTERN);
			dateString = dateString + " 00:00:00";
		}
		if (pattern.contains(":end")) {
			pattern = pattern.replace(":end", TIME_PATTERN);
			dateString = dateString + " 23:59:59";
		}
		DateFormat formatter = new SimpleDateFormat(pattern);
		try {
			return formatter.parse(dateString);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	public static Date addYears(Date date, int amount) {
		return add(date, 1, amount);
	}

	public static Date addMonths(Date date, int amount) {
		return add(date, 2, amount);
	}

	public static Date addWeeks(Date date, int amount) {
		return add(date, 3, amount);
	}

	public static Date addDays(Date date, int amount) {
		return add(date, 5, amount);
	}

	public static Date addHours(Date date, int amount) {
		return add(date, 11, amount);
	}

	public static Date addMinutes(Date date, int amount) {
		return add(date, 12, amount);
	}

	public static Date addSeconds(Date date, int amount) {
		return add(date, 13, amount);
	}

	public static Date addMilliseconds(Date date, int amount) {
		return add(date, 14, amount);
	}

	private static Date add(Date date, int calendarField, int amount) {
		if (date == null) {
			throw new IllegalArgumentException("日期对象不允许为null!");
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(calendarField, amount);
		return c.getTime();
	}
	
	@SuppressWarnings("deprecation")
	public static String getCostDate(long time) {
		Date now = new Date();
		Date pass = new Date(time);
		long temp = now.getTime() - time;

		if (now.getYear() == pass.getYear()) {
			// 同一年
			if (now.getMonth() == pass.getMonth()) {
				// 同一月

				if (now.getDate() == pass.getDate()) {
					// 同一天

					if (temp < 1000 * 60 * 60 * 6) {
						// 6小时内
						if (temp < 1000 * 60 * 60) {

							if (temp < 1000 * 60) {
								return "刚刚";
							} else {
								// 1小时内
								return (temp / 1000 / 60) + "分钟前";
							}

						} else {
							// 1小时到6小时间
							return (temp / 1000 / 60 / 60) + "小时前";
						}

					} else {
						return new SimpleDateFormat("HH:mm", Locale.CHINA).format(time);
					}

				} else if (now.getDate() - 1 == pass.getDate()) {
					// 前一天
					return new SimpleDateFormat("昨天 HH:mm", Locale.CHINA).format(time);
				} else if (now.getDate() - 2 == pass.getDate()) {
					return new SimpleDateFormat("前天 HH:mm", Locale.CHINA).format(time);
				} else {
					return (pass.getMonth() + 1) + "月" + pass.getDate() + "日 "
							+ new SimpleDateFormat("HH:mm", Locale.CHINA).format(time);
				}
			} else {
				return (pass.getMonth() + 1) + "月" + pass.getDate() + "日 "
						+ new SimpleDateFormat("HH:mm", Locale.CHINA).format(time);
			}

		} else {
			return (pass.getYear() + 1900) + "年" + (pass.getMonth() + 1) + "月" + pass.getDate() + "日 "
					+ new SimpleDateFormat("HH:mm", Locale.CHINA).format(time);
		}

	}
	
	/**
	 * 获取某天之前的时间
	 * @date 2017年11月30日 下午7:03:33 
	 * @author Qin Dachang
	 * @return
	 */
	public static String someDateBefore(int num){
	  	Calendar calendar = Calendar.getInstance();  
	  	int day = calendar.get(Calendar.DATE);  
	  	calendar.set(Calendar.DATE, day - num);  
        return formartDateTime(calendar.getTime());
	}
	
	/** 
	 * 根据输入时间，获得上一个月时间
	 * @date 2017年8月8日 上午10:38:18 
	 * @author Chen Qixiang
	 * @param time
	 * @param pattern 时间模式：null时默认使用"yyyy-MM-dd HH:mm:ss"
	 * @return
	 * @throws ParseException 
	 */
	public static String getLastMonth(String time,String pattern) throws ParseException{
		if(pattern==null || "".equals(pattern)){
			pattern = DATE_TIME_PATTERN;
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = simpleDateFormat.parse(time);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, -1);
		String result = simpleDateFormat.format(calendar.getTime());
		return result;
	}

	/**
	 * 根据当前时间获得获得上一个月时间
	 * @date 2017年11月7日 下午2:45:00 
	 * @author Chen Qixiang
	 * @param pattern 时间模式：null时默认使用"yyyy-MM-dd HH:mm:ss"
	 * @return
	 * @throws ParseException
	 */
	public static String getLastMonth(String pattern) throws ParseException{
		return getLastMonth(formartCurrentDateTime(),pattern);
	}

	/**
	 * 根据月份期间获得当月起始时间
	 * @date 2017年11月9日 上午10:43:49 
	 * @author Chen Qixiang
	 * @param period 月份期间，如2017-01
	 * @return 2017-01-01 00:00:00
	 */
	public static String getCurrentMonthBeginDate(String period) {
		try {
			SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			period = period+"-01 00:00:00";
			Date date;
			date = format.parse(period);
			Calendar c = Calendar.getInstance();
			c.setTime(date);
	        c.add(Calendar.MONTH, 1);
	        c.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天 
	        c.set(Calendar.HOUR_OF_DAY, 00);
		    c.set(Calendar.MINUTE, 00);
		    c.set(Calendar.SECOND, 00);
		    c.set(Calendar.MILLISECOND, 000);
		    String first = format.format(c.getTime());
		    return first; 
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 根据月份期间获得当月结束时间
	 * @date 2017年11月9日 上午10:45:20 
	 * @author Chen Qixiang
	 * @param period 如2017-01
	 * @return 2017-01-31 00:00:00
	 */
	public static String getCurrentMonthEndDate(String period) {
		try {
			SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			  //获取当前月最后一天
			period = period+"-01 00:00:00";
			Date date;
			date = format.parse(period);
			Calendar ca = Calendar.getInstance();
			ca.setTime(date);
			ca.add(Calendar.MONTH, 1);
		    ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));  
		    ca.set(Calendar.HOUR_OF_DAY, 23);
		    ca.set(Calendar.MINUTE, 59);
		    ca.set(Calendar.SECOND, 59);
		    ca.set(Calendar.MILLISECOND, 999);
		    String last = format.format(ca.getTime());
		    return last;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 根据当前月份期间生成下个月月份期间
	 * @date 2017年11月9日 上午11:38:23 
	 * @author Chen Qixiang
	 * @param period 月份期间，如2017-01
	 * @return  如2017-02
	 */
	public static String getNextMonthPriod(String period) {
		try {
			//规定返回日期格式
			SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM");
			Date date;
			date = sf.parse(period);
			Calendar ca = Calendar.getInstance();
			ca.setTime(date);
			ca.add(Calendar.MONTH, 1);
			String day_first = sf.format(ca.getTime());
			return day_first;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 获得当前时间的前某个小时时间
	 * @date 2018年6月6日 下午4:29:57 
	 * @author Chen Qixiang
	 * @param num
	 * @return
	 */
	public static String getHourAgo(int num){
		if(num>0){
			Calendar calendar = Calendar.getInstance();  
		  	int hour = calendar.get(Calendar.HOUR_OF_DAY);  
		  	calendar.set(Calendar.HOUR_OF_DAY, hour - num);  
	        return formartDateTime(calendar.getTime());
		}else{
			return formartCurrentDateTime();
		}
	}
	
	/**
	 * 根据格式返回距离当前时间的Date字符串，如2017-07-30 00:00:00 
	 * @date 2018年7月30日 下午2:36:04 
	 * @author Chen Qixiang
	 * @param num
	 * @param pattern
	 * @return
	 */
	public static String formatDateBefore(int num,String pattern){
		if(StringUtils.isBlank(pattern)){
			pattern = DATE_TIME_PATTERN;
		}
		return format(getDateBefore(num), pattern);
	}
	
	/**
	 * 返回距离当前时间的Date
	 * @date 2018年7月30日 下午2:37:26 
	 * @author Chen Qixiang
	 * @param num
	 * @return
	 */
	public static Date getDateBefore(int num){
		Calendar calendar = Calendar.getInstance();  
	  	int day = calendar.get(Calendar.DAY_OF_MONTH);  
	  	calendar.set(Calendar.DAY_OF_MONTH, day - num);  
	  	return calendar.getTime();
	}

	/**
	 * 将长时间格式字符串转换为时间 yyyy-MM-dd HH:mm:ss
	 *
	 * @param strDate
	 * @return
	 */
	public static Date strToDateLong(String strDate) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		ParsePosition pos = new ParsePosition(0);
		Date strtodate = formatter.parse(strDate, pos);
		return strtodate;
	}
	
	
	/**
	 * 比较两个时间：如果当前时间比end小，那么返回false，其他返回true
	 */
	public static boolean  compareDateTwo(Date start,String end) {
	       boolean falg=false;
		   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 try {
			Date endDate= sdf.parse(end);
			if(start.getTime()>=endDate.getTime()){
				falg= true;
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			falg= false;
		}
		 return  falg;
	}


	/**
	 * 获取当天结束时间
	 * @return
	 */
	public static Date getnowEndTime() {
		Calendar todayEnd = Calendar.getInstance();
		todayEnd.set(Calendar.HOUR_OF_DAY, 23);
		todayEnd.set(Calendar.MINUTE, 59);
		todayEnd.set(Calendar.SECOND, 59);
		todayEnd.set(Calendar.MILLISECOND, 999);
		return todayEnd.getTime();
	}

	/***
	 * 获取当天开始时间
	 * @return
	 */
	public static Date getStartTime() {
		Calendar todayStart = Calendar.getInstance();
		todayStart.set(Calendar.HOUR_OF_DAY, 0);
		todayStart.set(Calendar.MINUTE, 0);
		todayStart.set(Calendar.SECOND, 0);
		todayStart.set(Calendar.MILLISECOND, 0);
		return todayStart.getTime();
	}
}
