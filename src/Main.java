import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        task4_1();
        task4_2();
        System.out.println("");
        task4_3();

    }

    public static void task4_1() {
        double[] courses = new double[15];

        Random random = new Random();

        for (int i = 0; i < courses.length; i++) {
            courses[i] = 27 + random.nextDouble() * 3;
        }

        double minValue = courses[0];
        int index = 0;
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] < courses[index]) {
                index = i;
            }
        }


        System.out.println("Выгодный обмен в банке под номером " + index + ". Там курс = " + courses[index]);

        System.out.println(Arrays.toString(courses));
    }

    public static void task4_2() {
        int[] numbers = new int[50];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(numbers));

        for (int i = 1; i < numbers.length; i*=2) {
            System.out.print(numbers[i] + " ") ;
        }
    }

    public static void task4_3() {
        int[] numbers = new int[50];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ") ;
            }

        }
    }
}
