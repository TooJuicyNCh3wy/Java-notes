class TestStudent {
  public static void main(String[] args) {
    Student student = new Student();

    System.out.println("Name? " + student.name);
    System.out.println("age? " + student.age);
    System.out.println("isScienceMajor? " + student.isScienceMajor);
    System.out.println("gender? " + student.gender);

  }
}

class Student {
  String name;            // name has the default name null
  int age;                // age has the default value 0
  boolean isScienceMajor; // isScience major has default value false
  char gender;            // gender has default value '\u0000'
}


