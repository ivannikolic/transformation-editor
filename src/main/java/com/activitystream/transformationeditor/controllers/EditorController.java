package com.activitystream.transformationeditor.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class EditorController {

    @RequestMapping("/")
    public String greeting(Model model) {
        model.addAttribute("name", "name");
        return "home";
    }

    @RequestMapping(value = "run", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<String> post(Model model, @RequestParam(value = "script", required = false) String script,
                                       @RequestParam(value = "input", required = false) String input) {
        model.addAttribute("name", "name");
        return ResponseEntity.ok("{'success:': 'true'}");
    }

}