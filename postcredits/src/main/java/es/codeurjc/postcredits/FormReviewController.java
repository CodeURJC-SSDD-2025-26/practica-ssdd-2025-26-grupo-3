package es.codeurjc.postcredits;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class FormReviewController {
    @GetMapping("/form_review")
    public String formReview(Model model){
        return "form_review";
    }

}
