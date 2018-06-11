package com.roberto.hasfuel.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

@Service
@Transactional
public class HttpService {
    private final Logger log = LoggerFactory.getLogger(HttpService.class);

    public HttpService() {}

    private String AddRequestParameters(Map<String, String> params) throws Exception {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            return "";
        } catch (Exception ex) {
            throw new Exception(ex);
        }
    }

    public HttpURLConnection createRequest(String paramUrl, String requestMethod) throws Exception {
        try {
            URL url = new URL(paramUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(requestMethod);
            return connection;
        } catch (Exception ex) {
            throw new Exception(ex);
        }
    }
}
