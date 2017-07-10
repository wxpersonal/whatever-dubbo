package com.wx.util.dataSourceUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by wxper on 2017/4/3.
 * 动态数据源
 */
public class DynamicDataSource extends AbstractRoutingDataSource{

    private Logger log = LoggerFactory.getLogger(DynamicDataSource.class);

    @Override
    protected Object determineCurrentLookupKey() {

        String result;
        String dataSourceName = DynamicDataSourceHolder.getDataSource();

        if(dataSourceName == null ||
                dataSourceName == DynamicDataSourceGlobal.WRITE.name()){
            result =  DynamicDataSourceGlobal.WRITE.name();
        }

        result =  DynamicDataSourceGlobal.READ.name();
        return result;
    }

}
