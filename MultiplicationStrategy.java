public class MultiplicationStrategy implements OperationStrategy{
    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        return a.multiply(b);
    }    
}
