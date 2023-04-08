package mentor;

public class Converter {
    public static void main(String[] args) {
        int euros = 1000;
        int euros1 = 1200;
        printInDollars(euros);
        printInDollars(euros1);

        double dollars = getInDollars(euros);
        System.out.println("dollars " + dollars);
        System.out.println("dollars " + getInDollars(euros1));
    }

    public static void  printInDollars(int a ) {
        double dollars = 0.98 * a;
        System.out.println("dollars " + dollars );

    }

    public static double getInDollars( int a){
        double dollars = 0.98 * a;
        return dollars;


    }


}
