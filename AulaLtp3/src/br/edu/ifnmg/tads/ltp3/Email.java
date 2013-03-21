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

    public int getIdemail() {
        return Idemail;
    }

    public void setIdemail(int Idemail) {
        this.Idemail = Idemail;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.Idemail;
        hash = 89 * hash + Objects.hashCode(this.Nome);
        return hash;
    }

    @Override
    public String toString() {
        return "Email{" + "Idemail=" + Idemail + ", Nome=" + Nome + '}';
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
        if (!Objects.equals(this.Nome, other.Nome)) {
            return false;
        }
        return true;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    private String Nome;
    
}
