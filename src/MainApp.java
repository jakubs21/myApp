import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainApp {

    public static void main(String[] args){
//        System.out.println(getMyAge());
//        System.out.println(getMyName());
//        calculator(4,2);
//        System.out.println(parzysta(10));
//        System.out.println(parzysta(11));
//        System.out.println(trzysilnia(3));
//        System.out.println(trzysilnia(4));
//        System.out.println(pierwiastek(3));
//        System.out.println(trojkat(4,5,3));
        Human Jakub= new Human(28,71,171,"Jakub",true);
        System.out.println(Jakub.getBMI());
        Prostokat prostokat = new Prostokat(4,3);
        System.out.println(prostokat.obwod());
        System.out.println(prostokat.przekatna());
        System.out.println(prostokat.pole());

    }
    private static int getMyAge(){
        return 28;
    }
    private static String getMyName(){
        return "Jakub";
    }
    private static void calculator(int a, int b){
        int suma = a+b;
        int roznica = a-b;
        int iloczyn= a*b;
        int iloraz= a/b;
        System.out.println(suma);
        System.out.println(roznica);
        System.out.println(iloczyn);
        System.out.println(iloraz);
    }
    private static boolean parzysta(int a){
        if(a%2==0)
            return true;
        else return false;
    }
    private static int trzysilnia(int a){
        return a*a*a;
    }
    private static double pierwiastek(double a){
        return Math.sqrt(a);
    }
    private static boolean trojkat(int a, int b, int c){
        if(a>c){
            int temp=a;
            a=c;
            c=temp;
        }
        if(b>c){
            int temp=b;
            b=c;
            c=temp;
        }
        return a*a+b*b==c*c;
    }
}
