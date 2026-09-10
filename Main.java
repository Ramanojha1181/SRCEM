public class Main{

    static int digitSum(int num){
        int Digitsum = 0;
        while(num>0){
            int lastDigit = num%10;
            num = num/10;
            Digitsum += lastDigit;
        }
        System.out.println(Digitsum);
        return Digitsum;
    }

    static int factorial(int num){
        int fact = 1;
        for(int i = num; i>0;i--){
            fact *= i;
        }
        System.out.println("The Factorial of: "+ num +" is " + fact);
        return fact;
    }
    
    static boolean isprimeNumber(int num){
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if(num % i ==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(num+" is Prime number");
            }else{
                System.out.println(num+" Not Prime number");
            }
            return false;
    } 
    
    static int primeNumberList(int num){
            for(int j=2;j<=num;j++){
            int count = 0;
            for (int i = 1; i <= j; i++) {
                if(j % i ==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(j+" is Prime number");
            }
        }
            return 0;
    } 
    
    static int fibonacci(int num){
            int num1 = 0;
            int num2 = 1;
            System.out.print(0+" ");
        for (int i = 0; i <= num; i++) {
            System.out.print(num2 + " ");
            int num3 = num1+num2;
            num1 = num2;
            num2 = num3;
        }
        return 0;
    }

    static int binaryConvert(int num){
        int sum = 0;
        int pow = 1 ;
        while (num > 0) {
            int rem = num%2;
            num = num/2;
            sum += rem * pow;
            pow = pow * 10;
        }
        System.out.println(sum);
        return 0;
    }

    static int binaryToDec(int num){
        int dec = 0 , pow = 1;
        while(num>0){
            int rem = num%10;
            num = num/10;
            dec += pow * rem;
            pow *= 2;
        }
        System.out.println("The Decimal value of this Binary is: "+dec);
        return 0;
    }

    static int powOfTwo(int num){
        int bit = num & (num-1);
        if(bit==0){
            System.out.println("The number is power of two");
        }else{
            System.out.println("The Number is not power of two");
        }
        return 0;
    }

    public static void main(String[]args){

        // digitSum(12546);
        // factorial(5);
        // isprimeNumber(7)
        // primeNumberList(100);
        // fibonacci(10);
        // binaryConvert(9);
        // binaryToDec(1001101);
        powOfTwo(16);
        System.out.println("Gellow");




        // Bit wise operators
        // int a = 3 , b = 7;
        // System.out.println(a ^ b); // Bitwise ExOr
        // System.out.println(a & b); // Bitwise And
        // System.out.println(a | b); // Bitwise Or
        // System.out.println(a << b); // Bitwise Leftshift
        // System.out.println(a >> b); // Bitwise Rightshift
    }
}