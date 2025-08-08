package farhan.exeperiments;

public class Lab1007 {
    public static void main(String[] args) {
        MultiConstructor m1 = new MultiConstructor("farhan");
        m1.display();
        MultiConstructor m2 = new MultiConstructor("pushkar", 12);
        m2.display();
        MultiConstructor m3 = new MultiConstructor("vema", 14, "azure cloud");
        m3.display();
    }
}
