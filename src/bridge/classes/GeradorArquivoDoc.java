/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge.classes;

/**
 *
 * @author Junior
 */
import java.io.FileNotFoundException;
import java.io.PrintStream;

import bridge.interfaces.GeradorDeArquivo;
/*
 * classe que gera arquivo txt
 */

public class GeradorArquivoDoc implements GeradorDeArquivo {

    @Override
    public void criarArquivo(String dados) {
        try {
            PrintStream arquivo = new PrintStream("teste.doc");
            arquivo.println(dados);
            arquivo.close();
            System.out.println("Arquivo Gerado com Sucesso");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}