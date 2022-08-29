//안씀
// package com.example.crs.controller;
//
//import com.example.crs.dao.ClassRepo;
//import com.example.crs.model.Class;
//import com.example.crs.search.SearchBuilder;
//import com.example.crs.search.SearchOperationType;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//
//@RestController
//@RequiredArgsConstructor
//public class SearchController {
//
//    private final ClassRepo classRepo;
//
//    @GetMapping("/getSearchList")
//    @ResponseBody
//    public List<Class> getSearchList(
//            @RequestParam(name = "className", required = false) String className) {
//        SearchBuilder<Class> searchBuilder = SearchBuilder.builder();
//
//        if (className != null) {
//            searchBuilder.with("className", SearchOperationType.CONTAINS, className);
//        }
//        return classRepo.findAll(searchBuilder.build());
//    }
//}
