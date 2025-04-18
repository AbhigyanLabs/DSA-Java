public class Class {

    public static class Student
    {
        public String name;
        int rno;
        double percent;
    }

    static void print(Student s)
    {
        System.out.println(s.name + " " + s.rno + " " + s.percent);
    }

    static void change(Student s)
    {
        s.name="Abhi";
    }

    public static void main(String[] args) 
    {
        Student s=new Student();
        s.name="Abhigyan";
        s.percent=90;
        s.rno=7090619;

        print(s);
        change(s);
        print(s);    //If the name changes then classes are pass by reference
    }
}