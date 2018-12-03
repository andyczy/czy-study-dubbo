package com.github.andyczy.consumer;



/**
 * Author: Chen zheng you
 * CreateTime: 2018-12-03 9:07
 * Description:
 */
@RestController
public class DemoConsumerController {

    @Reference(version = "1.0.0",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:12345")
    private DemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return demoService.sayHello(name);
    }


}
