package farhan.experiments;

public class PrintAttribute {

    public int printASCII(char a) {
        return (int) a;
    }

    public String checkChar(char a) {
        if ((int) a >= 65 && (int) a <= 90) {
            return "capital letter";
        } else if ((int) a >= 97 && (int) a <= 122) {
            return "small letter";
        } else {
            return "number or symbol";
        }
    }
}
