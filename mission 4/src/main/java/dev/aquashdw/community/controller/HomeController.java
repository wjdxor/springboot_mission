package dev.aquashdw.community.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
//    private final AuthenticationFacade authFacade;
    @GetMapping
    public String home(){
//        logger.info("connected user: {}",
//                authFacade.getUserName());
//        logger.info(authFacade.getAuthentication().getClass().toString());
//    } catch (NullPointerException e) {
//        logger.info("no user logged in");
//    }
        return "index";
    }
}
