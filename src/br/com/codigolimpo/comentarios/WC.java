package br.com.codigolimpo.comentarios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WC {
    public static void main(String[] args) {

        // Comentários no final de cada "}" não serve de nada, as IDEs modernas já mostram onde é o começo de um par de chaves "{}".

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int lineCount = 0;
        int charCount = 0;
        int wordCount = 0;
        try {
            while ((line = in.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String words[] = line.split("\\W");
                wordCount += words.length;
            } // While
            System.out.println("wordCount = " + wordCount);
            System.out.println("lineCount = " + lineCount);
            System.out.println("charCount = " + charCount);
        } //try
        catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } //catch
    } // main
}
