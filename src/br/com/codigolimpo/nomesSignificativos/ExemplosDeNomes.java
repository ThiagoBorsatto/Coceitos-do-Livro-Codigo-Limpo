package br.com.codigolimpo.nomesSignificativos;

import java.util.ArrayList;
import java.util.List;

public class ExemplosDeNomes {

    int d; //Significa o tempo decorrido em dias
    // Mas o "d" não passa nenhum significado do que representa, um nome ruim para uma variável.

    int tempoEmDias;
    int diasDesdeDaCriacao;
    int diasDesdeDaModificacao;
    int arquivoDeAnosEmDias;
    // Seriam nomes de certa forma mais adequados, tentam passar seu propósito.


    /* Qual o propósito da lista?
    public List<int[]> getThem() {
        List<int []> list1 = new ArrayList<int[]>();
        for (int[] x : theList)
            if (x[0] == 4)
                list1.add(x);
        return list1;
    }

    // Com os nomes deixamos mais claro os componetes do nosso jogo.
    public List<int[]> pegarCedulaBandeira() {
        List<int []> cedulaComBandeira = new ArrayList<int[]>();
        int campoMinado;
        for (int[] cedula : campoMinado)
            if (cedula[STATUS_VALUE] == FLAGGED)
                cedulaComBandeira.add(cedula);
        return cedulaComBandeira;
    }

    public List<Cedula> pegarCedulaBandeira() {
        List<Cedula> cedulaComBandeira = new ArrayList<Cedula>();
        for (Cedula cedula : campoMinado)
            if (cedula.eBandeira())
                cedulaComBandeira.add(cedula);
        return cedulaComBandeira;
    }

    /* Evitar usar apreviações, como siglas "hp" que podem representar muitas coisas distintas,
       ou usa letra com I e 1 ou até O e 0 para variáveis.
       int a = 1;
       if(O == I)
        a = 01;
       else
        I = O1;

    // a1 e a2 são facilmente distintos, mas não é expressado o seu real significado, caso fossem trocados por remetende e destinatario a interpretação seria mais fácil.
    public static void copiaCaracter(char a1[], char a2[]) {
        for (int i = 0; i < a1.length; i++) {
            a2[i] = a1[i];
            }
    }

    Nome devem ter diferenças significativas, já que nomes muito parecidos também podem complicar o entendimento, por ser mais difícil distingir seu funcionamento só pelo nome.
    contaAtiva
    contaAtivas
    contaAtivaInfo

    Nome de classes devem ser substantivos, como "Cliente, PaginaWiki, Conta e AnaliseEndereco. É não devem ser verbos.

    Nome de métodos devem ter verbos, como: fazerPagamento, removerCliente e adicionarEndereco.
     */
}
