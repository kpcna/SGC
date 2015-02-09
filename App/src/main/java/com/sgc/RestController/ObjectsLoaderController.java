package com.sgc.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sgc.Model.NavigationRoot;

@RestController
public class ObjectsLoaderController 
{

    @RequestMapping("/objectloadercontroller")
    public NavigationRoot objectsloader() {
        return new NavigationRoot(1,"Web Application");
    }
}
