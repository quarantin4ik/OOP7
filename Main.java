public class Main {
    public static void main(String[] args){
        ComplexCalculator calculator = new ComplexCalculator();
        calculator.addLogger(new ConsoleLogger());

        ComplexNumber a = new DefaultComplexNumber(2, 3);
        ComplexNumber b = new DefaultComplexNumber(4, 5);

        ComplexNumber sum = calculator.add(a, b);
        ComplexNumber difference = calculator.subtract(a, b);
        ComplexNumber product = calculator.multiply(a, b);
        ComplexNumber quotient = calculator.divide(a, b);

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(quotient);
    }

    
}
