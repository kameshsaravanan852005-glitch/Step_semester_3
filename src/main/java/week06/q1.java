package main.java.week06;
class q1 {
    String studentName;
    String company;
    double packageLpa;

    q1(String studentName, String company, double packageLpa) {
        this.studentName = studentName;
        this.company = company;
        this.packageLpa = packageLpa;
    }

    void printRecord() {
        System.out.println(studentName + " -> " + company + " @ " + packageLpa + " LPA");
    }

    public static void main(String[] args) {
        q1[] records = {
            new q1("Ravi", "TCS", 4.5),
            new q1("Anitha", "Zoho", 6.2),
            new q1("Karthik", "Infosys", 4.0)
        };

        for (q1 r : records) {
            r.printRecord();
        }
    }
}
