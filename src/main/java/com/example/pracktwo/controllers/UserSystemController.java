package com.example.pracktwo.controllers;

import com.example.pracktwo.CRUDFunctionsClass;
import com.example.pracktwo.dao.UserSystemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserSystemController {
    UserSystemDao userSystemDao;

    CRUDFunctionsClass crudFunctionsClass;

    @Autowired
    public UserSystemController(UserSystemDao userSystemDao){
        this.userSystemDao = userSystemDao;
        crudFunctionsClass = new CRUDFunctionsClass(userSystemDao);
    }


}
