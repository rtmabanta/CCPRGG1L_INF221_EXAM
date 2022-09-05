public class Student {
   
    String firstName;
    char middleInitial;
    String surname;
    String dateOfBirth;
    int studentNumber;
    String emailAddress;
    boolean iAmAwesome;


    public void sayMyStudentNumber() {
        System.out.println("My student number " + studentNumber);
    }
    public void sayMyEmailAddress() {
        System.out.println("My email address " + emailAddress);
    }
    public void sayamIAwesome() {
        System.out.println("am I Awesome: " + iAmAwesome);
    }
}
