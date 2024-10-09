public class CalculImpot {

    public Double calculerImpot(Double revenu) throws ExceptionRevenuNegatif {
        if (revenu < 0) {
            throw new ExceptionRevenuNegatif("revenu négatif");
        }

        Double impots = 0.0;

        if (revenu <= 20000) {
            impots = revenu * 0.10;
        } else if (revenu <= 100000) {
            impots = 20000 * 0.10 + (revenu - 20000) * 0.20;
        } else {
            impots = 20000 * 0.10 + 80000 * 0.20 + (revenu - 100000) * 0.30;
        }

        return impots;
    }
}
