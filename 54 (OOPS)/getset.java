public class getset {  // Renamed class to follow Java naming conventions

    public static class Student {
        private String name;
        private int rno;
        private double percent;

        // Getter for rno
        public int getRno() {
            return rno;
        }

        // Setter for rno
        public void setRno(int rno) {
            this.rno = rno;
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Setter for name
        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Abhi");
        s.setRno(101);

        System.out.println("Name: " + s.getName());
        System.out.println("Roll No: " + s.getRno());
    }
}