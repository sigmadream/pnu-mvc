package com.sangkon.mvc.controller;

import com.sangkon.mvc.annotation.Controller;
import com.sangkon.mvc.annotation.RequestMapping;
import com.sangkon.mvc.repository.UserRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("users", UserRepository.findAll());
        return "home";
    }
}