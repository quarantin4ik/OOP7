public class SubtractionStrategy implements OperationStrategy{
    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        return a.subtract(b);
    }
}
