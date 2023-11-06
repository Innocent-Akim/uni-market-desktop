/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.model.panierAppro;

/**
 *
 * @author PC
 */
public class PanierAppro {

    private String fournisseur;
    private String designation;
    private String quantite;
    private String punitaire;
    private String dateReception;
    private String datePeremption;

    public PanierAppro(String fournisseur, String designation, String quantite, String punitaire, String dateReception, String datePeremption) {
        this.fournisseur = fournisseur;
        this.designation = designation;
        this.quantite = quantite;
        this.punitaire = punitaire;
        this.dateReception = dateReception;
        this.datePeremption = datePeremption;
    }

    public PanierAppro() {
    }

    public String getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(String fournisseur) {
        this.fournisseur = fournisseur;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getQuantite() {
        return quantite;
    }

    public void setQuantite(String quantite) {
        this.quantite = quantite;
    }

    public String getPunitaire() {
        return punitaire;
    }

    public void setPunitaire(String punitaire) {
        this.punitaire = punitaire;
    }

    public String getDateReception() {
        return dateReception;
    }

    public void setDateReception(String dateReception) {
        this.dateReception = dateReception;
    }

    public String getDatePeremption() {
        return datePeremption;
    }

    public void setDatePeremption(String datePeremption) {
        this.datePeremption = datePeremption;
    }
    public static PanierAppro panierAppro = new PanierAppro();
}
