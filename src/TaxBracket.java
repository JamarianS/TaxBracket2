import java.util.Scanner;

class TaxBracket {
    protected double[] incomeRanges;
    protected double[] taxRates;

    public TaxBracket(double[] incomeRanges, double[] taxRates) {
        this.incomeRanges = incomeRanges;
        this.taxRates = taxRates;
    }

    public double calculateTax(double income) {
        double taxOwed = 0.0;
        int i = 0;

        while (i < incomeRanges.length && income > incomeRanges[i]) {
            if (i == incomeRanges.length - 1 || income <= incomeRanges[i + 1]) {
                taxOwed += (income - incomeRanges[i]) * taxRates[i];
            } else {
                taxOwed += (incomeRanges[i + 1] - incomeRanges[i]) * taxRates[i];
            }
            i++;
        }

        return taxOwed;
    }
}
