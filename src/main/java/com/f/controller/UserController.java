package com.f.controller;

import com.f.pojo.Employee;
import com.f.services.impl.GenericCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@CrossOrigin
@RequestMapping(value = "/users")
public class UserController extends BaseController<Employee, Integer> {
    @Autowired
    public UserController(@Qualifier("userService") GenericCrudService genericCrudService) {
        super(genericCrudService);
    }

    @GetMapping(value = "/")
    public void rootIndex(HttpServletResponse response) throws IOException {
        response.sendRedirect("/users/index");
    }


}
