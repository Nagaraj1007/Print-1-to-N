// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void oneToN(int number){
        if (number == 1){
            System.out.print(1 + " ");
            return;
        }
        oneToN(number - 1);
        System.out.print(number + " ");
    }

    public static void main(String[] args) {
        oneToN(10);
    }
}