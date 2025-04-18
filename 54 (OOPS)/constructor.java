public class constructor {  // Class name should start with uppercase

    public static class Student {
        String name;
        int rno;
        double percent;

        // Correct constructor inside Student class
        public Student(String nam, int roll, double per) {
            this.name = nam;
            this.rno = roll;
            this.percent = per;
        }

        // Method to print student details
        public void display() {
            System.out.println(name + " " + rno + " " + percent);
        }
    }

    public static void main(String[] args) {
        Student s = new Student("Abhi", 101, 92.5);  // Constructor call
        s.display();  // Print student details
    }
}