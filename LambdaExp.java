interface ForLambdaExp {
    boolean check(int param);
}

public class LambdaExp {

    //One that returns true if a number passed to it is odd and false if it’s even.
    public static ForLambdaExp isOdd() {
        return (param) -> (param % 2 == 0) ? false : true;
    }

    //One that returns true if a number is prime and false if it’s not.
    public static ForLambdaExp isPrime() {
        return (param) -> {
            for (int i = 2; i <= param / 2; i++) {
                if (param % i == 0)
                    return false;
            }
            return true;
        };
    }

    //One that returns true if the parameter is a palindrome and false if it’s not.
    public static ForLambdaExp isPalindrome() {
        return (param) -> {
            int rev = 0;
            int r = 0;
            int n = param;
            while (n != 0) {
                r = n % 10;
                rev = rev * 10 + r;
                n /= 10;
            }
            return (rev == param);
        };
    }

    public static void main(String[] args){

        ForLambdaExp checkOdd = isOdd();
        System.out.println(checkOdd.check(15));
        System.out.println(checkOdd.check(20));

        ForLambdaExp checkPrime = isPrime();
        System.out.println(checkPrime.check(35));
        System.out.println(checkPrime.check(1));

        ForLambdaExp checkPalindrome = isPalindrome();
        System.out.println(checkPalindrome.check(52125));
        System.out.println(checkPalindrome.check(7521250));


    }
}
