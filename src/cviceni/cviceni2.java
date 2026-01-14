package cviceni;

public class cviceni2 {
    public static void main(String[] args) {
        String regex = "\\d{6}/\\d{4}";
        String rodneCislo = "121208/5260";
        if (rodneCislo.matches(regex)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
