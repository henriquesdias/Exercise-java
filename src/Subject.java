public class Subject {
  private String name;
  private String difficulty;
  private String duration;

  void setName(String name) {
    this.name = name;
  }

  void setDifficulty(String difficulty) {
    this.difficulty = difficulty;
  }

  void setDuration(String duration) {
    this.duration = duration;
  }

  String getName() {
    return this.name;
  }

  String getDifficulty() {
    return this.difficulty;
  }

  String getDuration() {
    return this.duration;
  }
}
