package solid.project_20_hill.Repasitory.Controller;

public class Dto {
    String question;
    int count;
    String userName;

    public Dto(String question, int count, String userName) {
        this.question = question;
        this.count = count;
        this.userName = userName;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getCount() {
        return count;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
