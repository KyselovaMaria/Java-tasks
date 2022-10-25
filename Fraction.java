

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction add(Fraction fraction){
        if(denominator == fraction.denominator)
        {
            numerator += fraction.numerator;
        }
        else
        {
            numerator*= fraction.denominator;
            fraction.numerator *= denominator;
            numerator += fraction.numerator;
            denominator *= fraction.denominator;
        }
        return this;
    }

    @Override
    public String toString(){
        return numerator + "/" + denominator;
    }
}