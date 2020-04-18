//package com.cf.bsixapp.component;
//
//import com.cf.bsixapp.common.api.Result;
//import com.cf.bsixapp.common.api.ResultCode;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.AuthenticationEntryPoint;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * 匿名用户访问无权限资源结果
// */
//@Component
//public class CustomAuthenticationEntryPoint implements AuthenticationEntryPoint {
//    @Override
//    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/javascript;charset=utf-8");
//        Result result = Result.failed(ResultCode.NOLOGIN);
//        response.getWriter().println(result.toString());
//        response.getWriter().flush();
//    }
//}
