package org.example.sprintboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("${api.base-path}/${api.version}/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers(){
        return  List.of(
                new SoftwareEngineer(1,"James",List.of("js, node, react")),
                new SoftwareEngineer(1,"Abdulrahman Alsuhaibi",List.of("laravel , php,spring boot, nuxt.js,js, ts, react"))

        );
    }
}
