package com.aegisep.api.common.constant;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component("Constant")
@Slf4j
public class BaseConstant {
    public static String APP_NAME;
    public static String APP_VERSION;

    //Telegram

    public static final String CHANNEL_CODE_PIPE_LINE = "-990542713";
    //Aegis AWS 채널
    public static final String CHANNEL_AEGIS_AWS = "-850669348";
    public static final String AEGISAPI_XPERP = "-4090577080";
    public static final String AEGIS_KBANK_API = "-1002140437628";
    public static final String AEGISAPI_KEVINLAB = "-1002078122472";
    public static final String AEGIS_APTI_API = "-4029859044";
}

