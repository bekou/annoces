package com.dart.annonces.web;
import com.dart.annonces.domain.Users;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/userses")
@Controller
@RooWebScaffold(path = "userses", formBackingObject = Users.class)
public class UsersController {
}
