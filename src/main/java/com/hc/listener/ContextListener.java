package com.hc.listener;

import com.hc.constant.WeGoConst;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {

    public ContextListener() {
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //初始化图片服务器的路径
        sce.getServletContext().setAttribute("imgServer", WeGoConst.IMG_SERVER);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }

}
