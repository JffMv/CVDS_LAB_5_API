    package com.example.servingwebcontent;

    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestParam;
    import org.springframework.web.client.RestTemplate;
    import org.springframework.web.servlet.ModelAndView;

    @Controller
    public class UserController {
        @GetMapping("/user")
        public String user(@RequestParam(name = "id", required = false, defaultValue = "1") Integer id, Model model) {

                String uri = "https://jsonplaceholder.typicode.com/todos/" + id;
                RestTemplate restTemplate = new RestTemplate();

                User user = restTemplate.getForObject(uri, User.class);

                model.addAttribute("Id", id);
                model.addAttribute("userId", user.getUserId());
                model.addAttribute("title", user.getTitle());
                model.addAttribute("completed", user.isCompleted());

                System.out.println("User: " + user);
                System.out.println("ID: " + user.getId());
                System.out.println("UserId: " + user.getUserId());
                System.out.println("title: " + user.getTitle());
                System.out.println("Completed: " + user.isCompleted());
            return "user";
        }
    }

