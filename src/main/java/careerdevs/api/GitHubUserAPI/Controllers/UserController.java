package careerdevs.api.GitHubUserAPI.Controllers;

import careerdevs.api.GitHubUserAPI.Model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private String URL = "https://api.github.com/users";

    @GetMapping("/test")
    public String test(){
        return "Check one two! Hey HEY! Hello GitHub!";
    }

    @GetMapping("/")
    public User[] allUsers(RestTemplate restTemplate){
        return restTemplate.getForObject(URL, User[].class);
    }

    @GetMapping("/{id}")
    public User[] selectUser(RestTemplate restTemplate, @PathVariable Long id){
        try {
            String newURL = URL + "?id=" + id;
            return restTemplate.getForObject(newURL, User[].class);
        }catch (Exception e){
            e.getMessage();
            System.out.println(e.getMessage());
            return null;
        }
    }
}
