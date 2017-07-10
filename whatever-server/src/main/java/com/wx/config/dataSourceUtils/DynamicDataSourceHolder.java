package com.wx.util.dataSourceUtils;

/**
 * Created by wxper on 2017/4/3.
 */
public class DynamicDataSourceHolder {

    private static final ThreadLocal<String> holder = new ThreadLocal<String>();

    private DynamicDataSourceHolder() {
    }

    public static void putDataSource(String dataSourceName){
        holder.set(dataSourceName);
    }

    public static String getDataSource(){
        return holder.get();
    }

    public static void clearDataSource() {
        holder.remove();
    }
}
