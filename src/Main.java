
public class Main {
    public static void main(String[] args) {
        System.out.println("Билет_№3");

        String s = "1234567890";
        int m = s.length()/2;
        System.out.println("Первая часть: " + s.substring(0,m));
        System.out.println("Вторая часть: " + s.substring(m));

        System.out.println("-----------------------------------------");
    }
}