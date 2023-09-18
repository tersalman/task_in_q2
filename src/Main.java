
import java.util.Arrays;

public class Main {

    public static boolean revStrokeOnpolindrom(String a) {
        boolean b = false;
        int index = a.length()-1;
        for (int i = 0; i < a.length()/2; i++) {
            if (a.charAt(i) != a.charAt(index)) {
                b=false;
                break;
            } else if (a.charAt(i)==a.charAt(index)) {
                b= true;
            }
            index--;
        }
        return b;
    }



    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        if (a > b) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        int c = a>b? a/b: a*b;

        System.out.println(c);

        int yearsChapter = 1;
        switch (yearsChapter) {
            case 1:
                System.out.println("this is a winter");
                break;
            case 2:
                System.out.println("this is a spring");
                break;
            case 3:
                System.out.println("this is a summer");
                break;
            case 4:
                System.out.println("this is a autumn");
                break;
            default:
                System.out.println("we dont have a this chapter");
        }

        int[] z = new int[2];
        z[0]= 2;
        z[1]= 3;
        int[] z1 = {3, 4};
        System.out.println(Arrays.toString(z1));
        for (int i = 0; i < z.length; i++) {
            System.out.println(z[i]);
        }

        HumanName salman = new HumanName("Salman", "Tereschenko");

        salman.setFirstName("Sasha");

        System.out.println(salman.getFirstName());

//        task 2:

        String str = "acddsa";
        System.out.println(revStrokeOnpolindrom(str));


    }
}