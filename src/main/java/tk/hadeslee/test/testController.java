package tk.hadeslee.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project: wcl
 * FileName: testController
 * Date: 2016-01-20
 * Time: 오전 10:31
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class testController {

    @RequestMapping("/test")
    public String test(){
        return "hello spring boot!";
    }
}
