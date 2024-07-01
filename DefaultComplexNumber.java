public class DefaultComplexNumber implements ComplexNumber {

    private final double realPart;
    private final double imaginaryPart;

    public DefaultComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public double getRealPart() {
        return realPart;
    }

    @Override
    public double getImaginaryPart() {
        return imaginaryPart;
    }

    @Override
    public ComplexNumber add(ComplexNumber other) {
        return new DefaultComplexNumber(
            this.realPart + other.getRealPart(),
            this.imaginaryPart + other.getImaginaryPart()
        );
    }

    @Override
    public ComplexNumber subtract(ComplexNumber other) {
        return new DefaultComplexNumber(
            this.realPart - other.getRealPart(),
            this.imaginaryPart - other.getImaginaryPart()
        );
    }

    @Override
    public ComplexNumber multiply(ComplexNumber other) {
        return new DefaultComplexNumber(
            this.realPart * other.getRealPart() - this.imaginaryPart * other.getImaginaryPart(),
            this.realPart * other.getImaginaryPart() + this.imaginaryPart * other.getRealPart()
        );
    }

    @Override
    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.getRealPart() * other.getRealPart() + other.getImaginaryPart() * other.getImaginaryPart();
        return new DefaultComplexNumber(
            (this.realPart * other.getRealPart() + this.imaginaryPart * other.getImaginaryPart()) / denominator,
            (this.imaginaryPart * other.getRealPart() - this.realPart * other.getImaginaryPart()) / denominator
        );
    }

    @Override
    public String toString() {
        new String();
        return String.format("( %s, %si )", realPart, imaginaryPart);
    }
    
}
