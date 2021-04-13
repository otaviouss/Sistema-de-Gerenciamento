/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Coordenador;

/**
 *
 * @author Otavio
 */
public class CoordenadorDAO {
 
    private static List<Coordenador> coordenadores = new ArrayList<>();
    
    public static boolean inserirCoordenador(Coordenador c) {
        if(idExists(c.getId())) return false;
        coordenadores.add(c);
        return true;
    }
    
    private static boolean idExists(String id) {
        for(Coordenador c : coordenadores) {
            if(c.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
    
    public static void atualizarSalarioCoordenador(String idCoordenador, float salario) {
        for(Coordenador c : coordenadores) {
            if(c.getId().equals(idCoordenador)) {
                c.atualizarSalario(salario);
            }
        }
    }
    
    public static Coordenador pesquisa(String nome) {
        for(Coordenador c : coordenadores) {
            if(c.getNome().equals(nome)) {
                return c;
            }
        }
        return null;
    }
    
    private static boolean removerCoordenador(String idCoordenador) {
        for(Coordenador c : coordenadores) {
            if(c.getId().equals(idCoordenador)) {
                coordenadores.remove(c);
                return true;
            }
        }
        return false;
    }
    
    public static boolean verificarAcesso(String id, String senha) {
        if(CoordenadorDAO.idExists(id)) {
            for(Coordenador c : coordenadores) {
                if(c.getSenhaAcesso().equals(senha)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static List<Coordenador> listarCoordenadores() {
        return coordenadores;
    }
}
