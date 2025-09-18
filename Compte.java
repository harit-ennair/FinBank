import java.util.HashSet;

public class Compte {

    private String numeroCompte ;
    private Double saldo ;

    public enum TypeCompte {
        Courant,
        Épargne
    }
    private  TypeCompte tipoCompte;
    private HashSet <Transaction> transactions;

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public Double getSaldo() {
        return saldo;
    }

    public TypeCompte getTipoCompte() {
        return tipoCompte;
    }

    public HashSet<Transaction> getTransaction() {
        return transactions;
    }


    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setTipoCompte(TypeCompte tipoCompte) {
        this.tipoCompte = tipoCompte;
    }

    public void setTransaction(HashSet<Transaction> transactions) {
        this.transactions = transactions;
    }
}
