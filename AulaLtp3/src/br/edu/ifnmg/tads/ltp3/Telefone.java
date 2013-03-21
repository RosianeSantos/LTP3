/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.ltp3;

/**
 *
 * @author aluno
 */
public class Telefone {
    private int idtelefone;
    private int numero;
    private int DDD;

    public int getIdtelefone() {
        return idtelefone;
    }

    public void setIdtelefone(int idtelefone) {
        this.idtelefone = idtelefone;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDDD() {
        return DDD;
    }

    @Override
    public String toString() {
        return "Telefone{" + "idtelefone=" + idtelefone + ", numero=" + numero + ", DDD=" + DDD + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.idtelefone;
        hash = 73 * hash + this.numero;
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
        final Telefone other = (Telefone) obj;
        if (this.idtelefone != other.idtelefone) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    public void setDDD(int DDD) {
        this.DDD = DDD;
    }
    
    
}
