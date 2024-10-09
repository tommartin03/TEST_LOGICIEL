public class UniteDistincteException extends Exception{
    public SommeArgent somme1,somme2;

    public UniteDistincteException(SommeArgent sa1, SommeArgent sa2){
        somme1 = sa1;
        somme2 = sa2;
    }

    public String toString(){
        return "unite distincte : " + somme1.getUnite() + "!= "+ somme2.getUnite();
    }
}
