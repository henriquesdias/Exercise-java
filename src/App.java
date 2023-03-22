public class App {
    public static void main(String[] args) {
        RespondeAi platform = new RespondeAi();
        Subject mySubject = platform.getSubject("math");
        System.out.println(mySubject.getName());
        System.out.println(mySubject.getDifficulty());
    }
}
