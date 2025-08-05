package in.ashokit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

    private Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);

    public WelcomeRestController() {
        logger.info("***** WelcomeRestController :: Constructor *****");
    }

    @GetMapping("/")   // Correct root mapping
    public String welcomeMsg() {
        logger.info("***** welcomeMsg() execution start *****");
        String msg = "Hi this is Akhil Chinnamsetti";
        logger.info("***** welcomeMsg() execution end *****");
        return msg;
    }
    
    @GetMapping("/greet")   // Different endpoint
    public String greetMsg() {
        logger.info("***** greetMsg() execution start *****");
        String msg = "Good Morning, Welcome to Ashok IT";
        logger.info("***** greetMsg() execution end *****");
        return msg;
    }
}
