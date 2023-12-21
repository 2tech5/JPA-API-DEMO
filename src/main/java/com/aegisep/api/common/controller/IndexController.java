package com.aegisep.api.common.controller;

import com.querydsl.core.util.StringUtils;
import lombok.RequiredArgsConstructor;
import org.example.jpaapidemo.common.dto.response.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequiredArgsConstructor
//@RequestMapping("/api")
public class IndexController {

    @GetMapping("/v1")
    public ApiResponse v1(
            @RequestParam(value = "aptCd") String aptCd
    ) {
        if(StringUtils.isNullOrEmpty(aptCd)){
            aptCd = "99999";
        }
        return ApiResponse.success(aptCd);
    }

    //@Operation(summary = "health 체크", description = "서버 상태를 위해 서버 IP와 시간을 리턴해준다.")
    @GetMapping(value = "/", produces = "application/json; charset=UTF-8")
    public ResponseEntity<HashMap<String, String>> health() {
        HashMap<String, String> response = new HashMap<>();
        /*
        response.put("environment", EnvironmentConstant.ENV);
        //response.put("time", TimeUtils.getCurrentTime());
        response.put("DB_SECRET", EnvironmentConstant.DB_CONNECTION);
        response.put("version", BaseConstant.APP_VERSION);
        response.put("app", BaseConstant.APP_NAME);

         */
        return ResponseEntity.ok(response);
    }
}
