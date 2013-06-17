/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bridge.classes.GeradorArquivoDoc;
import classes.Recibo;

/**
 *
 * @author Junior
 */

public class TesteRecibo {

    public static void main(String[] args) {
    GeradorArquivoDoc arquivoDoc = new GeradorArquivoDoc();
    Recibo reciboAbril = new Recibo("XX", "Aluizio Junior", 50.00, arquivoDoc);
        reciboAbril.geraArquivo();
    }
}