package com.wx.whatever.common.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by wxper on 2017/4/3.
 * 动态数据源
 */
public class DynamicDataSource extends AbstractRoutingDataSource{

    @Override
    protected Object determineCurrentLookupKey() {

        String dataSourceName = DynamicDataSourceHolder.getDataSource();

        if(dataSourceName == null ||
                dataSourceName == DynamicDataSourceGlobal.WRITE.name()){
            return DynamicDataSourceGlobal.WRITE.name();
        }
        return DynamicDataSourceGlobal.READ.name();
    }

}
