package com.example.pracktwo.controllers;

import com.example.pracktwo.CRUDFunctionsClass;
import com.example.pracktwo.dao.PencilDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PencilController {

    PencilDao pencilDao;
    CRUDFunctionsClass crudFunctionsClass;

    @Autowired
    public PencilController(PencilDao pencilDao){
        this.pencilDao = pencilDao;
        crudFunctionsClass = new CRUDFunctionsClass(pencilDao);
    }


}
