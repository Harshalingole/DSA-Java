package Kunal_Kushwah.MathForDsa;

public class RaphsonSQRT {
    public static void main(String[] args){
        // dou n = 40;
        System.out.println(sqrt(40));
    }

    // Finding Square root of Number By Newtons Raphson Method
    /*
    --------------Logic----------------
    1)We will try to minimize error in order to get real root by keep changing value of X. [error = root - X]
     Formula => [Math.sqrt(N) = (X + N / X ) / 2 ]
        Where, X =  Sqrt you have assume/guess , root = actual sqrt
    
    **) Why the formula Works?
        --Lets say ur guess was correct then sqrt(N) = (sqrt(N) + N / sqrt(N))/2 = 2sqrt(N)/2 = sqrt(N)
          i.e if guess == actual ans then equation satisfied
        --For Ex: You will find ur ans when error < 1;
          
    ----------Steps To Solve -----------
    1)Assign X to N
    2)You will find ur ans when error < num; where num is minimum error. you can decide the value
    3)Update the value of X = root
    
    Time Complexity: O((log N) F(N))
     */

     public static double sqrt(double n){
        double x = n;

        double root;
        // infinite loop till meet condition then break
        while(true){
            root = 0.5 *(x + (n/x)); // here 1/2 = 0.5 replacing whole divisor 2
            int minerror = 1;
            if (Math.abs(root - x) < minerror) {
                break;
            }
            x = root;

        }

        return root;
     }

}
