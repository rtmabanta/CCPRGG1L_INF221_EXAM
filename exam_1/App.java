public class App {
    public static void main(String[] args) throws Exception {
        Student Student = new Student();

        Student.firstName = "Ristian";
        Student.middleInitial = 'T';
        Student.surname = "Mabanta";
        Student.dateOfBirth = "11/16/1979";
        Student.studentNumber = 2022102602;
        Student.emailAddress = "mabantart@students.national-u.edu.ph";
        Student.iAmAwesome = true;

        Student.sayMyStudentNumber();
        Student.sayMyEmailAddress();
        Student.sayamIAwesome();  
    }
}
