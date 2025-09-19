import java.util.HashSet;

public class Compte {

    private int numeroCompte ;
    private Double solde;

    public enum TypeCompte {
        Courant,
        Epargne
    }
    private  TypeCompte tipoCompte;
    private HashSet <Transaction> transactions;

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public Double getSolde() {
        return solde;
    }

    public TypeCompte getTipoCompte() {
        return tipoCompte;
    }

    public HashSet<Transaction> getTransaction() {
        return transactions;
    }


    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public void setSaldo(Double solde) {
        this.solde = solde;
    }

    public void setTipoCompte(TypeCompte tipoCompte) {
        this.tipoCompte = tipoCompte;
    }

    public void setTransaction(HashSet<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void ajouterTransaction( Compte compte, int idTransaction, Transaction.Type type, int montant, Compte compteSourc, Compte compteDestination) {
        Transaction transaction = new Transaction();
        transaction.setIdTransaction(idTransaction);
        transaction.setDateTransaction(new java.util.Date());
        transaction.setType(type);
        transaction.setMontant(montant);
        transaction.setCompteSourc(compte);
        transaction.setCompteDestination(compteDestination);

        if (this.transactions == null) {
            this.transactions = new HashSet<>();
        }
        this.transactions.add(transaction);

    }


}

