class HeadOfHouseholdTaxBracket extends TaxBracket {
    public HeadOfHouseholdTaxBracket() {
        super(new double[]{15_700, 59_850, 95_350, 182_100, 231_250, 578_100},
                new double[]{0.10, 0.12, 0.22, 0.24, 0.32, 0.35, 0.37});
    }
}
