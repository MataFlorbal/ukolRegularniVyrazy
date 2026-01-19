package cviceni;

public class cviceni3 {
    public static void main(String[] args) {
        String regex = "[A-Z]\\s\\d{4}(\\s[A-Z])?";     //znacky ve formatu X NNNN nebo X NNNN X; X=pismeno, N=cislo
        String spz = "A 8502";
        if (spz.matches(regex)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
