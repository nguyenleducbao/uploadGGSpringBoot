package com.example.demo;

import com.google.api.client.http.FileContent;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.File;

@RestController
public class DemoController {
    @GetMapping({"/", "/hello"})
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        String myNameIs = "Do Quoc Viet";
        model.addAttribute("name", myNameIs);

        return "hello";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.GET, produces = {MediaType.IMAGE_JPEG_VALUE})
    public String uploadGG() throws Exception {
        DriveQuickstart a = new DriveQuickstart();

        a.upload();
        return "hello";
    }
}




