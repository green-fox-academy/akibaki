public class Student extends Person implements Cloneable{

  private String previousOrganization;  // the name of the student’s previous company / school
  private int skippedDays;              // the number of days skipped from the course

  @Override
  public void getGoal(){
    System.out.println("Be a junior software developer.");
  }

  @Override
  public void introduce(){
    System.out.println(
            "Hi, I'm " + name +", a " + age +" year old "+ gender +" from " + previousOrganization +
            ", who skipped " + skippedDays + " days from the course already.");
  }

  public void skipDays(int numberOfDays){
    skippedDays += numberOfDays;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super.name = name;
    super.age = age;
    super.gender = gender;
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  @Override
  protected Student clone() throws CloneNotSupportedException {
    Student student = new Student(this.name, this.age, this.gender, this.previousOrganization);
   return student;
  }



  public Student(){
    super();
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
    }

}
