package solid.project_20_hill.Repasitory.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {


     @RequestMapping("/process")
     public String mainPage() {
         // 이 부분에 database에 username을 save하는 부분을 넣는다.
         //User user = new User(name);
         //userRepository.save(user);
         return "page2.html";
     }

    @RequestMapping("/success")
    public String successPage() {
        return "page3.html";
    }

    @RequestMapping("/halloffame")
    public String halloffamePage() {
        return "page4.html";
    }

    @RequestMapping("/gameover")
    public String gameoverPage() {
        return "page5.html";
    }

}
