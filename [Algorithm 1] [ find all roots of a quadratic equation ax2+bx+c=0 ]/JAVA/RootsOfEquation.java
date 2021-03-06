import java.util.Scanner;

class RootsOfEquation{
    float a, b, c, realpart, imaginarypart, discriminant, root1, root2;
    final Scanner sc = new Scanner(System.in);
    public static void main(final String[] args) {        
        RootsOfEquation root = new RootsOfEquation();

        root.a = root.sc.nextFloat();
        root.b = root.sc.nextFloat();
        root.c = root.sc.nextFloat();
        
        root.rootsOfEquation(root.a, root.b, root.c);
        
    }
    private void rootsOfEquation(float a, float b, float c){
        discriminant = (b * b) - (4 * a * c);
        
        if(discriminant >= 0){            

            root1 = (float) ((-b + Math.sqrt(discriminant))/(2*a));
            root2 = (float) ((-b - Math.sqrt(discriminant))/(2*a));
            System.out.println(root1 + " & " + root2 + " are roots.");

        }else{

            realpart = b/(2*a);
            imaginarypart = (float) ((Math.sqrt(-discriminant))/(2*a));
            
            System.out.println("Roots are complex and different.");
            System.out.println("x1 = " + realpart + " + " + imaginarypart + "i");
            System.out.println("x1 = " + realpart + " - " + imaginarypart + "i");

        }
    }
}