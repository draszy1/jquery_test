package org.kibel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by draszy1 on 23.10.2016.
 */
@RestController
public class IndexController {

    @RequestMapping("/greeting")
    public String greeting() {
        return "some response";
    }
}
