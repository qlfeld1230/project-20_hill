package solid.project_20_hill.Repasitory.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {
    private final TwentyQuestionService twentyQuestionService;


    public MainController(TwentyQuestionService twentyQuestionService) {
        this.twentyQuestionService = twentyQuestionService;
    }

    @RequestMapping("/process")
     public String mainPage() {
         // 이 부분에 database에 username을 save하는 부분을 넣는다.
         //User user = new User(name);
         //userRepository.save(user);

         return "page2.html";
     }

    @RequestMapping("/gameover")
    public String gameoverPage() {
        return "page3.html";
    }

    @RequestMapping("/halloffame")
    public String halloffamePage() {
        return "page4.html";
    }

    @GetMapping("qqq")
    @ResponseBody
    public List<TwentyQuestionTable> gettwentyQuestionTableList() {
        return twentyQuestionService.gettwentyQuestionTableList();
    }

    @GetMapping("qq")
    @ResponseBody
    public TwentyQuestionTable get() {
        return twentyQuestionService.findById(1L).get();
    }
}
