/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.JogoDAO;
import java.util.Iterator;

/**
 *
 * @author 3223612
 */
public class JogoV {
    public static void imprime(JogoDAO jogoDAO){
        for (model.Jogo j : jogoDAO.getJogos()) {
            System.out.println("Jogo: " + j.getTitulo());
            
        }
    }
}
