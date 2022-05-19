package com.hc.handler;

import com.hc.ex.WeGoArgumentException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Component
@ControllerAdvice
public class WeGoArgumentExceptionHandler {

    @ResponseBody
    @ExceptionHandler(WeGoArgumentException.class)
    public Map<String, String> process(WeGoArgumentException ex) {
        Map<String, String> map = ex.getMap();
        return map;
    }

}
