/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tesseract;

import java.io.File;
import net.sourceforge.tess4j.*;

/**
 *
 * @author Matheus Barros
 */
public class Teste {
    
    public static void main(String[] args) {
        File image = new File(Teste.class.getResource("/imagem/placa.jpg").getFile());
        ITesseract tessInst = new Tesseract();
        tessInst.setLanguage("por");
        tessInst.setDatapath("C:\\Users\\mathe\\OneDrive\\Documentos\\NetBeansProjects\\Aplicacao\\tessdata");
        try {
            String result= tessInst.doOCR(image);
            result = result.replaceAll("[-+.^:,_]", "");
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }

    }
}
