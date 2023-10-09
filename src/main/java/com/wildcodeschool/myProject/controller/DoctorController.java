package com.wildcodeschool.myProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String index() {
        return "William Hartnell <br><img src='https://resizing.flixster.com/I4v71qTABZwRdfIcRDoTq4Qs5xE=/218x280/v2/https://flxt.tmsimg.com/assets/76723_v9_ba.jpg'/>";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String index10() {
        return "David Tennant <br><img src='https://upload.wikimedia.org/wikipedia/en/2/29/Fourteenth_Doctor_%28Doctor_Who%29.jpg'/>";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String index13() {
        return "Jodie Whittaker <br><img src='https://upload.wikimedia.org/wikipedia/en/a/a2/Thirteenth_Doctor_%28Doctor_Who%29.jpg'/>";
    }

}
