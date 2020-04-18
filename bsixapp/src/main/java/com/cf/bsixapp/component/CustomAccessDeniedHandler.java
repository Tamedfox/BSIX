//package com.cf.bsixapp.component;
//
//import com.cf.bsixapp.common.api.Result;
//import com.cf.bsixapp.common.api.ResultCode;
//import org.springframework.security.access.AccessDeniedException;
//import org.springframework.security.web.access.AccessDeniedHandler;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * 自定义无权限访问结果
// */
//@Component
//public class CustomAccessDeniedHandler implements AccessDeniedHandler {
//    @Override
//    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/javascript;charset=utf-8");
//        Result result = Result.failed(ResultCode.FORBIDDEN);
//        response.getWriter().println(result.toString());
//        response.getWriter().flush();
//    }
//}
