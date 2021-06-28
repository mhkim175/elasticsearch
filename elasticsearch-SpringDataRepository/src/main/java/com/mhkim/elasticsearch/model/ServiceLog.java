package com.mhkim.elasticsearch.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

@Data
@Document(indexName = "service-log")
@Setting(settingPath = "elastic-setting.json")
public class ServiceLog {

    /* 로그  */
    @Id
    @Field(type = FieldType.Long)
    private String serviceLogId;

    /* 서비스구분 */
    @Field(type = FieldType.Keyword)
    private String type;

    /* 로그 데이터 */
    @Field(type = FieldType.Text)
    private String logData;

    /* 로그 날짜 */
    @Field(type = FieldType.Date)
    private String logDate;

    @Builder
    public ServiceLog(String serviceLogId, String type, String logData, String logDate) {
        this.serviceLogId = serviceLogId;
        this.type = type;
        this.logData = logData;
        this.logDate = logDate;
    }
}
