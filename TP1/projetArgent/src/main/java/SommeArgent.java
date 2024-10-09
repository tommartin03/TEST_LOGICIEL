public class SommeArgent {
    private int quantite;
    private String unite;
    public SommeArgent(int amount, String currency) {
        quantite = amount;
        unite = currency;
    }
    public int getQuantite() {
        return quantite;
    }
    public String getUnite() {
        return unite;
    }
    public SommeArgent add(SommeArgent m) {
        return new SommeArgent(getQuantite()+m.getQuantite(), getUnite());
    }
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(obj instanceof SommeArgent){
            SommeArgent aMoney = (SommeArgent) obj;
            return aMoney.getUnite().equals(this.getUnite()) && this.getQuantite() == aMoney.getQuantite();
        }
        return false;
    }
}