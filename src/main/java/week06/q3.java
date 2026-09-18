package main.java.week06;
class q3 {
    String code;
    String title;
    int credits;
    int labCredits;

    q3(String code, String title, int credits, int labCredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    q3(String code, String title, int credits) {
        this(code, title, credits, 0);
    }

    int totalCredits() {
        return credits + labCredits;
    }

    public static void main(String[] args) {
        q3 c1 = new q3("21CSC201J", "Data Structures", 4);
        q3 c2 = new q3("21CSC205L", "DSA Lab", 3, 1);

        System.out.println(c1.code + " total credits: " + c1.totalCredits());
        System.out.println(c2.code + " total credits: " + c2.totalCredits());
    }
}