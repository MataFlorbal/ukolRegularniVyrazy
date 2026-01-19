package cviceni;

public class cviceni4 {
    public static void main(String[] args) {
        String regex = "[A-Z][a-z]{2,}";
        String jmeno = "Hugo";
        if (jmeno.matches(regex)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
