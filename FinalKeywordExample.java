class College {
    void displayCollege() {
        System.out.println("Welcome to ABC College");
    }
}

class Student {
    final int rollNo = 101;

    final void displayRollNo() {
        System.out.println("Roll Number: " + rollNo);
    }
}

class Result extends Student {
    void displayMarks() {
        System.out.println("Marks: 95");
    }
}

public class FinalKeywordExample {
    public static void main(String[] args) {

        Result r = new Result();

        r.displayRollNo();
        r.displayMarks();

        College c = new College();
        c.displayCollege();
    }
}