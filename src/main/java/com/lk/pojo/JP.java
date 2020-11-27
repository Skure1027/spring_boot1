package com.lk.pojo;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.jdbc")
public class JP {

    D3 datasource;
    String type;

    @Override
    public String toString() {
        return "JP{" +
                "datasource=" + datasource +
                ", type='" + type + '\'' +
                '}';
    }

    public D3 getDatasource() {
        return datasource;
    }

    public void setDatasource(D3 datasource) {
        this.datasource = datasource;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



}
