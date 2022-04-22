/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PP_Factory_Method_Pessoa;

/**
 *
 * @author IFGoiano
 */
public class Factory implements FactoryPessoa {
    public Pessoa getPessoa(String nome, String sexo){
        if(sexo.equals("M")){
            return new Homem(nome, sexo);
        }else
            return new Mulher(nome, sexo);
    }

    @Override
    public void getPessoa() {
    }
}
