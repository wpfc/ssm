package cn.edu.ntu.controller;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/verify")
public class VerifyCodeController extends BaseController {

	@RequestMapping("/showImageByStream")
	public String showImageByStream(HttpServletRequest request, HttpServletResponse response){
		//������֤�����
        response.setDateHeader("Expires", 0);
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        response.setHeader("Pragma", "no-cache");
        response.setContentType("image/jpeg");
       
        try {          
            BufferedImage image = ImageIO.read(new File("C:\\Users\\Administrator\\Desktop\\" + request.getParameter("src")));
          //���ڴ��е�ͼƬͨ��������ʽ������ͻ���
            ImageIO.write(image, "JPEG", response.getOutputStream());
        } catch (Exception e) {    
            e.printStackTrace();
        }  
       
        return null;
	}
	
}
