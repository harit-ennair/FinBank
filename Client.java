public class Client extends User {

    private int idClient;

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

//     functions

    public Double consulterSolde(Compte compte) {
        return compte.getSolde();
    }

    public void effectuerDepots(Compte compte,double montant) {

        compte.setSaldo(compte.getSolde() + montant);
        System.out.println("Le nouveau solde est : " + compte.getSolde());

    }

    public void effectuerRetraits(Compte compte,double montant) {
        if (compte.getSolde() >= montant) {
            compte.setSaldo(compte.getSolde() - montant);
            System.out.println("Le nouveau solde est : " + compte.getSolde());
        } else {
            System.out.println("Solde insuffisant pour effectuer le retrait.");
        }
    }

    public void realiserVirements(Compte source, Compte destination, int montant) {
        if (source.getSolde() >= montant) {
            source.setSaldo(source.getSolde() - montant);
            destination.setSaldo(destination.getSolde() + montant);

            // create transaction
            Transaction transaction = new Transaction();
            transaction.setType(Transaction.Type.Virement);
            transaction.setMontant(montant);
            transaction.setCompteSourc(source);
            transaction.setCompteDestination(destination);
            transaction.setDateTransaction(new java.util.Date());

            // add transaction to source
            source.getTransaction().add(transaction);

            System.out.println("Virement de " + montant + " effectué avec succès.");
        } else {
            System.out.println("Solde insuffisant pour effectuer le virement.");
        }
    }


    public Transaction ConsulterReleveBancaire(Compte compte , Transaction transaction) {
        for (Transaction t : compte.getTransaction()) {
            if (t.getIdTransaction() == transaction.getIdTransaction()) {
                return t;
            }
        }
        System.out.println("Transaction non trouvée.");
        return null;
    }

}
