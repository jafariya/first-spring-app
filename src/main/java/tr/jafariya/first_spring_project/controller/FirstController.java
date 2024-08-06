package tr.jafariya.first_spring_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FirstController {

    @GetMapping("/dayOfWeek")
    public String dayOfWeek(@RequestParam(value = "name", defaultValue = "Monday") String name) {
        if (name.equalsIgnoreCase("Monday")) {
            return "Today is Monday";
        } else if (name.equalsIgnoreCase("Tuesday")) {
            return "Today is Tuesday";
        } else if (name.equalsIgnoreCase("Wednesday")) {
            return "Today is Wednesday";
        } else if (name.equalsIgnoreCase("Thursday")) {
            return "Today is Thursday";
        } else if (name.equalsIgnoreCase("Friday")) {
            return "Today is Friday";
        } else if (name.equalsIgnoreCase("Saturday")) {
            return "Today is Saturday";
        } else if (name.equalsIgnoreCase("Sunday")) {
            return "Today is Sunday";
        }
        return "Invalid day of the week.";
    }
}


