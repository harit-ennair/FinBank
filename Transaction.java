import java.util.Date;

public class Transaction {

    private int idTransaction ;
    private Date dateTransaction;

    public enum  Type{
        Depot,
        Retrait,
        Virement
    }

    private Type type;
    private int montant;
    private  Compte compteSourc;
    private  Compte compteDestination;

    public int getIdTransaction() {
        return idTransaction;
    }

    public Date getDateTransaction() {
        return dateTransaction;
    }

    public Type getType() {
        return type;
    }

    public int getMontant() {
        return montant;
    }

    public Compte getCompteSourc() {
        return compteSourc;
    }

    public Compte getCompteDestination() {
        return compteDestination;
    }


    public void setIdTransaction(int idTransaction) {
        this.idTransaction = idTransaction;
    }

    public void setDateTransaction(Date dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public void setCompteSourc(Compte compteSourc) {
        this.compteSourc = compteSourc;
    }

    public void setCompteDestination(Compte compteDestination) {
        this.compteDestination = compteDestination;
    }
}
