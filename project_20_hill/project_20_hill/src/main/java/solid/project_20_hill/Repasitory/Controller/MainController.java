package solid.project_20_hill.Repasitory.Controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class MainController{
    private final TwentyQuestionService twentyQuestionService;
    private List<TwentyQuestionTable> usedQuestions = new ArrayList<>();
    private final Gian84Service gian84Service;
    private final ItsupService itsupService;
    private final UkmanService ukmanService;

    public MainController(TwentyQuestionService twentyQuestionService, Gian84Service gian84Service, ItsupService itsupService, UkmanService ukmanService) {
        this.twentyQuestionService = twentyQuestionService;
        this.gian84Service = gian84Service;
        this.itsupService = itsupService;
        this.ukmanService = ukmanService;
    }

//    @GetMapping("/gian84")
//    @ResponseBody
//    public List<Gian84Table> getGian84(){
//        return gian84Service.findByAnswer("아니오");
//    }
//
//
//    @GetMapping("/itsup")
//    @ResponseBody
//    public Optional<ItsupTable> getItsup(){
//        return itsupService.findById(4L);
//    }
//
//
//    @GetMapping("/ukman")
//    @ResponseBody
//    public Optional<UkmanTable> getUkman(){
//        return ukmanService.findById(5L);
//    }

    @RequestMapping("/success")
//    @PostMapping("/success")
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


    @PostMapping(value = "/page2", consumes = "application/x-www-form-urlencoded")
    public String viewButton(Dto dto, Model model) {
        model.addAttribute("name", dto.question);

        List<TwentyQuestionTable> allQuestions = twentyQuestionService.gettwentyQuestionTableList();
        List<TwentyQuestionTable> questions = getRandomQuestions(allQuestions, 4);
        List<TwentyQuestionTable> getQuestion = twentyQuestionService.findByQuestion(dto.getQuestion());

        // 매일 바꿀 부분
        List<Gian84Table> getGianTable;

        String question = "";
        Long id = 0L;
        String extractedString = "";
        String YorN = "";

        // question에서 id추출
        Pattern pattern = Pattern.compile("id=(\\d+)");

        if(!getQuestion.isEmpty())
            question = getQuestion.get(0).toString();

        Matcher matcher = pattern.matcher(question);

        if (matcher.find()) {
            id = Long.parseLong(matcher.group(1));
        }

        // 매일 바꿀 부분
        extractedString = gian84Service.findById(id).toString();

        int startIndex = extractedString.indexOf("answer=") + "answer=".length();
        int endIndex = extractedString.indexOf(")]");

        if (startIndex >= 0 && endIndex >= 0) {
            YorN = extractedString.substring(startIndex, endIndex);
        }

        model.addAttribute("questions", questions);
        model.addAttribute("count", dto.count+1);
        model.addAttribute("YorN", YorN);

        return"/page2";
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
