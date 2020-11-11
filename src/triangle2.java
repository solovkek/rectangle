public class triangle2 {


    public static void main(String[] args) {

        int size = 15;

        for (int i = 1; i <= size; i++) {

            for (int j = size; j > i; j--)
                System.out.print(" ");

            for (int j = 1; j < 2 * i; j++)
                System.out.print("*");

            System.out.print("\n");
        }

    }
}