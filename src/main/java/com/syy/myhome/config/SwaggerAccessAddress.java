package com.syy.myhome.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import java.net.*;
import java.util.Enumeration;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

@Component
@Slf4j
public class SwaggerAccessAddress implements ApplicationListener<WebServerInitializedEvent> {



    @Value("${server.port}")
    private String serverPort;


    @Value("${server.servlet.context-path}")
    private String contextPath;



    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {

        String hostAddress = "localhost";
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface networkInterface = interfaces.nextElement();
                Enumeration<InetAddress> addresses = networkInterface.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    InetAddress address = addresses.nextElement();
                    if (!address.isLoopbackAddress() && address instanceof Inet4Address) {
                        hostAddress = address.getHostAddress();
                    }
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }

        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
//            hostAddress = inetAddress.getHostAddress();
            this.serverPort = String.valueOf(event.getWebServer().getPort());
            log.info("项目启动成功....");
            log.info("swagger接口文档地址：http://"+hostAddress+":"+serverPort+contextPath+"/swagger-ui.html");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
