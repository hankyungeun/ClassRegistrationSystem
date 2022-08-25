package com.example.crs.controller;

import com.example.crs.dao.ClassRepo;
import com.example.crs.model.Class;
import com.example.crs.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ClassController {
    private ClassService classService;

    @GetMapping("/class")
    public String showClass(Model model){
        List<Class> classes = classService.findClass();
        model.addAttribute("classes", classes);
        return "class/classList";
    }



}
