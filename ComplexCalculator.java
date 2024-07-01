import java.util.ArrayList;
import java.util.List;

public class ComplexCalculator {
    
    private final AdditionStrategy additionStrategy;
    private final SubtractionStrategy subtractionStrategy;
    private final MultiplicationStrategy multiplicationStrategy;
    private final DivisionStrategy divisionStrategy;
    private final List<OperationLogger> loggers;

    public ComplexCalculator() {
        this.additionStrategy = new AdditionStrategy();
        this.subtractionStrategy = new SubtractionStrategy();
        this.multiplicationStrategy = new MultiplicationStrategy();
        this.divisionStrategy = new DivisionStrategy();
        this.loggers = new ArrayList<>();
    }

    public void addLogger(OperationLogger logger) {
        this.loggers.add(logger);
    }

    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = additionStrategy.execute(a, b);
        logOperation("Addition", a, b, result);
        return result;
    }

    public ComplexNumber subtract(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = subtractionStrategy.execute(a, b);
        logOperation("Subtraction", a, b, result);
        return result;
    }

    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = multiplicationStrategy.execute(a, b);
        logOperation("Multiplication", a, b, result);
        return result;
    }

    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = divisionStrategy.execute(a, b);
        logOperation("Division", a, b, result);
        return result;
    }

    private void logOperation(String operation, ComplexNumber a, ComplexNumber b, ComplexNumber result) {
        for (OperationLogger logger : loggers) {
            logger.log(operation, a, b, result);
        }
    }

}
