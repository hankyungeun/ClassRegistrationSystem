package com.example.crs.controller;

import com.example.crs.dao.ClassRepo;
import com.example.crs.model.Class;
import com.example.crs.search.SearchBuilder;
import com.example.crs.search.SearchOperationType;
import com.example.crs.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ClassController {
    private final ClassService classService;
    private final ClassRepo classRepo;

    @GetMapping("/class")
//    public String showClass(Model model) {
//        List<Class> classes = classService.findClass();
//        model.addAttribute("classes", classes);
//        return "class/classList";
//    }

    public String showClass(Model model, @RequestParam(name = "className", required = false) String className){
        SearchBuilder<Class> searchBuilder = SearchBuilder.builder();

        if (className != null) {
            searchBuilder.with("className", SearchOperationType.CONTAINS, className);
        }

        model.addAttribute("classes", classRepo.findAll(searchBuilder.build()));
        return "class/classList";
    }
}
