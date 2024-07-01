public class DivisionStrategy implements OperationStrategy{
    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        return a.divide(b);
    }
}
