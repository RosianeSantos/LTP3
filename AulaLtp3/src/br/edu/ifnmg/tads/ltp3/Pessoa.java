/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.ltp3;

/**
 *
 * @author aluno
 */
public class Pessoa {
    private int id;
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String pnome) throws Exception {
        if(pnome.length()>3 && pnome.length()<250 ){
        nome=pnome;
    }
    
    throw new Exception("Não pode haver nomes com menos de 3 letras"
            + "e mais de 250 letras");
    }
}
