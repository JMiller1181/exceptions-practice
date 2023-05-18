public class Calculator {
    public Calculator(){

    }
    public int factorial(int num){
        try {
            if(num < 0){
                throw  new IllegalArgumentException("The number must be greater than 0");
            }
            int factor = num;
            while (factor > 1) {
                factor -= 1;
                num *= factor;
            }
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }
            return num;
    }
    public int binomialCoefficient(int n, int k){
        int coefficient = 0;
        try {
            if(n < 0 || k < 0){
                throw new IllegalArgumentException("Input values must be positive.");
            }
            if(k > n){
                throw new IllegalArgumentException("Subset cannot be larger than main set");
            }
            coefficient = (factorial(n) / (factorial(k) * factorial(n-k)));
        } catch (IllegalArgumentException e){
            System.out.println(e);
            return k;
        }
            return coefficient;
    }
}
