package com.hc.utils;

import com.hc.constant.WeGoConst;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.UUID;

public class WeGoUtil {
    public static String uploadLogo(HttpServletRequest request, String fileInputName) throws IOException, ServletException {
        final Part part = request.getPart(fileInputName);
        //获取请求头
        String header = part.getHeader("content-disposition");
        //获取文件名
        String originalFileName = getFileName(header);
        final String suffix = originalFileName.substring(originalFileName.lastIndexOf("."));
        final String fileName = UUID.randomUUID() + suffix;

        String filenameWithPath = WeGoConst.BRAND_LOGO_PATH + fileName;
        try {
            part.write(filenameWithPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fileName;
    }

    /**
     * 根据请求头解析出文件名
     *
     * @param header 请求头
     * @return 文件名
     */
    private static String getFileName(String header) {
        String[] temp = header.split(";")[2].split("=");
        //获取文件名，兼容各种浏览器的写法
        String fileName = temp[1].substring(temp[1].lastIndexOf("\\") + 1).replaceAll("\"", "");
        return fileName;
    }
}
