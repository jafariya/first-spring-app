package tr.jafariya.first_spring_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    enum DayOfWeek {
        MONDAY("Today is Monday"),
        TUESDAY("Today is Tuesday"),
        WEDNESDAY("Today is Wednesday"),
        THURSDAY("Today is Thursday"),
        FRIDAY("Today is Friday"),
        SATURDAY("Today is Saturday"),
        SUNDAY("Today is Sunday");

        private final String message;

        DayOfWeek(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public static String getDayMessage(String name) {
            for (DayOfWeek day : DayOfWeek.values()) {
                if (day.name().equalsIgnoreCase(name)) {
                    return day.getMessage();
                }
            }
            return "Invalid day of the week.";
        }
    }

    @GetMapping("/dayOfWeek")
    public String dayOfWeek(@RequestParam(value = "name", defaultValue = "Monday") String name) {
        return DayOfWeek.getDayMessage(name);
    }
}



