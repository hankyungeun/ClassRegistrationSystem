package com.example.crs.controller;

import com.example.crs.model.Class;
import com.example.crs.service.ClassService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ClassController {
    private final ClassService classService;

    @GetMapping("/class")
    public String showClass(Model model) {
        List<Class> classes = classService.findClass();
        model.addAttribute("classes", classes);
        return "class/classList";
    }

}
