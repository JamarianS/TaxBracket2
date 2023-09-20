class MarriedSeparatelyTaxBracket extends TaxBracket {
    public MarriedSeparatelyTaxBracket() {
        super(new double[]{11_000, 44_725, 95_375, 182_100, 231_250, 346_875},
                new double[]{0.10, 0.12, 0.22, 0.24, 0.32, 0.35, 0.37});
    }
}