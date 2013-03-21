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
public class Endereco {
    private int Idendereco;
    private String bairro;
    private String rua;
    private int num;

    public int getIdendereco() {
        return Idendereco;
    }

    public void setIdendereco(int Idendereco) {
        this.Idendereco = Idendereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" + "Idendereco=" + Idendereco + ", bairro=" + bairro + ", rua=" + rua + ", num=" + num + ", cep=" + cep + ", cidade=" + cidade + '}';
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + this.Idendereco;
        hash = 73 * hash + Objects.hashCode(this.cidade);
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
        final Endereco other = (Endereco) obj;
        if (this.Idendereco != other.Idendereco) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        return true;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    private int cep;
    private String cidade;
    
}
