package solid.project_20_hill.Repasitory.Controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@Controller
public class MainController{
    private final TwentyQuestionService twentyQuestionService;
    private List<TwentyQuestionTable> usedQuestions = new ArrayList<>();


    public MainController(TwentyQuestionService twentyQuestionService) {
        this.twentyQuestionService = twentyQuestionService;
    }

    @RequestMapping("/success")
    public String successPage() {
        return "/page3";
    }

    @RequestMapping("/halloffame")
    public String halloffamePage() {
        return "/page4";
    }

    @RequestMapping("/gameover")
    public String gameoverPage() {
        return "/page5";
    }

    @GetMapping("/page2")
    public String getPage2(Model model) {
        List<TwentyQuestionTable> allQuestions = twentyQuestionService.gettwentyQuestionTableList();

        // 무작위로 4개의 질문 선택
        List<TwentyQuestionTable> selectedQuestions = getRandomQuestions(allQuestions, 4);

        // 선택한 질문을 사용한 질문 목록에 추가
        usedQuestions.addAll(selectedQuestions);

        // 모델에 선택한 질문을 추가
        model.addAttribute("questions", selectedQuestions);

        return "/page2";
    }

    private List<TwentyQuestionTable> getRandomQuestions(List<TwentyQuestionTable> questions, int count) {
        List<TwentyQuestionTable> randomQuestions = new ArrayList<>();
        Random random = new Random();

        while (randomQuestions.size() < count && !questions.isEmpty()) {
            int index = random.nextInt(questions.size());
            TwentyQuestionTable question = questions.remove(index);
            randomQuestions.add(question);
        }

        return randomQuestions;
    }

}
