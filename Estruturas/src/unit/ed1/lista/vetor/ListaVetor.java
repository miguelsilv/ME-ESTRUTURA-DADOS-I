/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit.ed1.lista.vetor;

import java.security.InvalidParameterException;
import java.util.Iterator;
import unit.ed1.lista.ILista;

/**
 *
 * @author 11645
 */
public class ListaVetor<Tipo> implements ILista<Tipo> {
    private Tipo[] elementos;
    private int contador;

    public ListaVetor() {
        //TODO
    }

    public ListaVetor(int capacidadeInicial) {
        //TODO
    }

    @Override
    public void adicionar(Tipo elemento) {
        System.out.println(elemento);
    }

    @Override
    public void adicionar(int posicao, Tipo elemento) throws InvalidParameterException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void adicionarNoInicio(Tipo elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contem(Tipo elemento) throws InvalidParameterException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tipo obter(int posicao) throws InvalidParameterException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int tamanho() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int capacidade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(int posicao) throws InvalidParameterException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int remover(Tipo elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removerDoInicio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void limpar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<Tipo> iterator() {
        return new IteradorVetor();
    }

    private class IteradorVetor implements Iterator<Tipo>{

        @Override
        public boolean hasNext() {
//            if(i < tamanho()) {
//                return true;
//            }
            return false;
        }

        @Override
        public Tipo next() {
            return null; //return elementos[i];
        }
        
    }
   
    
}
