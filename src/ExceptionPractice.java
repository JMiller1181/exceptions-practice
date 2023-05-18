public class ExceptionPractice {
    public static void main(String[] args){

/*
        //Throws illegal argument exception for name length
        Person ted = new Person("", 12);

        //Throw illegal argument exception for age size
        Person jim = new Person("Jim", 130);
*/
        Person ron = new Person("Ron", 13);
        System.out.println(ron);
        Calculator calculator = new Calculator();
/*
        //Throws illegal argument exception for negative number
        System.out.println(calculator.factorial(-4));
*/
        System.out.println(calculator.factorial(4));
/*
        //Throws illegal argument exception for having a larger subset than main set
        System.out.println(calculator.binomialCoefficient(4,8));

        //Throws illegal argument exception for having a negative input
        System.out.println(calculator.binomialCoefficient(4,-1));
*/
        System.out.println(calculator.binomialCoefficient(4,2));

    }
}
