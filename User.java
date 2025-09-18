public abstract class User {

        protected String nom;
        protected String prenom;
        protected String email;
        protected String motDouPasse;

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getMotDouPasse() {
        return motDouPasse;
    }



    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMotDouPasse(String motDouPasse) {
        this.motDouPasse = motDouPasse;
    }


}
