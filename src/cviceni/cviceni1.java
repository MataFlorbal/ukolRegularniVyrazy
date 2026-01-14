package cviceni;

public class cviceni1 {
    public static void main(String[] args) {
        String regex = "\\d{3}\\s\\d{2}";
        String psc = "312 00";
        if (psc.matches(regex)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
