package xin.yangda.k8s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangdaxin@lcservis.com
 * @version 创建时间 2018/11/29 16:15
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{id}")
    public String getUserName(@PathVariable("id") String id) {
        return "杨大鑫";
    }
}
