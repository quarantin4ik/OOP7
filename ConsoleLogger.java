public class ConsoleLogger implements OperationLogger{
    @Override
    public void log(String operation, ComplexNumber a, ComplexNumber b, ComplexNumber result) {
        System.out.printf("%s: (%f + %fi) %s (%f + %fi) = (%f + %fi)%n",
            operation, a.getRealPart(), a.getImaginaryPart(),
            operation.toLowerCase(), b.getRealPart(), b.getImaginaryPart(),
            result.getRealPart(), result.getImaginaryPart());
    }
}
