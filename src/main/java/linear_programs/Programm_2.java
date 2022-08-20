package linear_programs;

public class Programm_2 {
//    Math.sqrt (a * a);
// Math.pow(a1, b1)

    public static void main(String[] args) {

        int a = 8;
        int b = 3;
        int c = 14;
        double z;

        z = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);



        System.out.println(z);


    }
}
