package com.dart.annonces.web;
import com.dart.annonces.domain.Annonces;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/annonceses")
@Controller
@RooWebScaffold(path = "annonceses", formBackingObject = Annonces.class)
public class AnnoncesController {
}
