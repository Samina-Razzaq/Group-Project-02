package group.project;
/*We have to calculate the average of marks obtained in three subjects by student A and by student B.
Create   class   'Marks'   with   an   abstract   method 'getPercentage' that will be returning the average
percentage   of   marks.   Provide   implementation   of abstract   method   in   classes   'A'   and   'B'.   The
constructor of student A takes the marks in three subjects as its parameters and the marks in four
subjects as its parameters for student B. Test your code*/

public abstract class Marks {
     abstract void getPercentage();
}
class StudentA extends   Marks{
    double subject1;
    double subject2;
    double subject3;

    public StudentA(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    void getPercentage(){
        double average=(subject1+subject2+subject3)/300*100;
        System.out.println("Average Percentage of 3 subjects of StudentA is "+average+" %");
    }
}
class StudentB extends Marks{
    double subject1;
    double subject2;
    double subject3;
    double subject4;

    public StudentB(double subject1, double subject2, double subject3, double subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    void getPercentage() {
        double average=(subject1+subject2+subject3+subject4)/400*100;
        System.out.println("Average Percentage of 4 subjects of StudentB is "+average+" %");
    }
}
class PercentageTester{
    public static void main(String[] args) {
        Marks a=new StudentA(78, 89, 66.5);
        a.getPercentage();
        Marks b=new StudentB(75.7, 78.5, 88, 95);
        b.getPercentage();

    }
}