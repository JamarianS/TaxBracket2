class SingleTaxBracket extends TaxBracket {
    public SingleTaxBracket() {
        super(new double[]{11_000, 44_725, 95_375, 182_100, 231_250, 578_125},
                new double[]{0.10, 0.12, 0.22, 0.24, 0.32, 0.35, 0.37});
    }
}