package main.java.gpt.expractice;

public class Main {
    public static void main(String[] args) {
        // User 클래스 객체 생성
        User user = new User("민수", 26);


        user.introduce();
        user.changeName("수민");
        user.introduce();
    }
}
