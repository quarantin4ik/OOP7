public class AdditionStrategy implements OperationStrategy{
    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        return a.add(b);
    }
}
