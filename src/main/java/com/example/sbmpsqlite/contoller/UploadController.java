package com.example.sbmpsqlite.contoller;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@CrossOrigin
@RestController
@RequestMapping("/upload")
public class UploadController {

    @PostMapping(value = "/user/image")
    @ResponseBody
    public void imageUpload(@RequestParam("file")MultipartFile file,@RequestParam String uid){
        String fileName = file.getOriginalFilename();
        String staticPath = "C:/Users/asus/Desktop/uniapp/demo2/src/main/resources/static/userinfo";
        System.out.println(fileName);
        File tmp = new File(staticPath);
        if(!tmp.exists()){
            tmp.mkdirs();
        }
        int index = fileName.indexOf(".");
        String name = uid + "." + fileName.substring(index + 1);
        String resourcePath = staticPath + "/" + name;
        File upFile = new File(resourcePath);
        try {
            file.transferTo(upFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
