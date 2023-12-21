package com.aegisep.api.common.constant;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component("EnvironmentConstant")
@Slf4j
public class EnvironmentConstant {
    // 앱 프로퍼티들
    public static String ENV;
    public static String LOG_LEVEL;
    public static String LOG_CONFIG_FILE;
    public static String TELEGRAM_TOKEN;
    public static final String AWS_SEOUL_REGION = "ap-northeast-2";

    public static String DB_CONNECTION;
    public static String LOCAL_DB_URL;
    public static String LOCAL_DB_USER;
    public static String LOCAL_DB_PASSWORD;
    public static String LOCAL_DB_DRIVER;


    public static String COGNITO_CLIENT_ID;

}
