public class Gestionnaire extends User{

    private int idGestionnaire ;

    public int getIdGestionnaire() {
        return idGestionnaire;
    }

    public void setIdGestionnaire(int idGestionnaire) {
        this.idGestionnaire = idGestionnaire;
    }

    public void CreerCompte(String nomClient, String prenomClient, String emailClient, String motDePasseClient, int idClient) {
        Client client = new Client();
        client.setNom(nomClient);
        client.setPrenom(prenomClient);
        client.setEmail(emailClient);
        client.setMotDouPasse(motDePasseClient);
        client.setIdClient(idClient);

        Compte compte = new Compte();
        compte.setNumeroCompte((int)(Math.random() * 99999999));
        compte.setSaldo(0.0);
        compte.setTipoCompte(Compte.TypeCompte.Courant);
        System.out.println("Compte cree avec succes : " + compte.getNumeroCompte());

    }

    public void modifierCompte(Compte compte , int numeroCompte, Double solde, Compte.TypeCompte typeCompte) {
        compte.setNumeroCompte(numeroCompte);
        compte.setSaldo(solde);
        compte.setTipoCompte(typeCompte);

        System.out.println("Compte modifie avec succes : " + compte.getNumeroCompte());

    }

    public void cloturerCompte(Compte compte) {
        compte = null;
        System.out.println("Compte supprime avec succes");
    }

    public void modifierClient(Client client, String nom, String prenom, String email, String motDePasse, String idClient) {
        client.setNom(nom);
        client.setPrenom(prenom);
        client.setEmail(email);
        client.setMotDouPasse(motDePasse);
        client.setIdClient(Integer.parseInt(idClient));
        System.out.println("Client supprime avec succes : " + client.getIdClient());

    }


}
