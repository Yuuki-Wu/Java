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

    @PostMapping(value = "/user/movementImg")
    @ResponseBody
    public void movementImgUpload(@RequestParam("file") MultipartFile file, String uid, String movementName, String position){
        String fileName = file.getOriginalFilename();
        String po;
        po = getString(position);
        String staticPath = "C:/Users/asus/Desktop/uniapp/demo2/src/main/resources/static/movement/" + po;
        File tmp = new File(staticPath);
        if(!tmp.exists()){
            tmp.mkdirs();
        }
        int index = fileName.indexOf(".");
        String name = uid + "_" + movementName + "." + fileName.substring(index + 1);
        String resourcePath = staticPath + "/" + name;
        File upFile = new File(resourcePath);
        try {
            file.transferTo(upFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static String getString(String position) {
        String po;
        if(position.equals("腿")){
            po = "leg";
        } else if(position.equals("胸")){
            po = "chest";
        } else if(position.equals("二头")){
            po = "biceps";
        } else if(position.equals("三头")){
            po = "triceps";
        } else if (position.equals("腹部")) {
            po = "abs";
        } else {
            po = "back";
        }
        return po;
    }
}
