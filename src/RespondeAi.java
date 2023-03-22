import java.util.ArrayList;
import java.util.List;

public class RespondeAi {
  private String website = "https://www.respondeai.com.br/";
  private List<String> users = new ArrayList<>();
  Subject math = new Subject();
  Subject physics = new Subject();

  public RespondeAi() {
    math.setName("Math");
    math.setDifficulty("Medium");
    math.setDuration("30 hours");
    physics.setName("physics");
    physics.setDifficulty("High");
    physics.setDuration("60 hours");
  }

  Subject getSubject(String subject) {
    if (subject == "math") {
      return this.math;
    }
    if (subject == "physics") {
      return this.physics;
    }
    return this.math;
  }

  String getWebsite() {
    return this.website;
  }

  void setNewUser(String name) {
    this.users.add(name);
  }

  List<String> getUsers() {
    return this.users;
  }
}
