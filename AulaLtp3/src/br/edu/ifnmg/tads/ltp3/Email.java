/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.ltp3;

import java.util.Objects;

/**
 *
 * @author aluno
 */
public class Email {
    private int Idemail;
    private String Email;

    public int getIdemail() {
        return Idemail;
    }

    public void setIdemail(int Idemail) {
        this.Idemail = Idemail;
    }

    public String getEmail() {
        return Email;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.Idemail;
        hash = 71 * hash + Objects.hashCode(this.Email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Email other = (Email) obj;
        if (this.Idemail != other.Idemail) {
            return false;
        }
        if (!Objects.equals(this.Email, other.Email)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Email{" + "Idemail=" + Idemail + ", Email=" + Email + '}';
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
}
