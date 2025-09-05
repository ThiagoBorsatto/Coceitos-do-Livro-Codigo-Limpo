package br.com.codigolimpo.nomesSignificativos;

public class ContextoObscuro {
    private void imprimirEstatusVisitante (char candidato, int conta) {
        String numero;
        String verbo;
        String modificadorPlural;

        if (conta == 0) {
            numero = "não";
            verbo = "Existem";
            modificadorPlural = "s";
        } else if (conta == 1) {
            numero = "1";
            verbo = "Existe";
            modificadorPlural = "";
        } else {
            numero = Integer.toString(conta);
            verbo = "Existem";
            modificadorPlural = "s";
        }
        String mensagemVisitante = String.format("À %s %s %s%s", verbo, numero, candidato, modificadorPlural);
        System.out.println(mensagemVisitante);
    }
    // Pomdemos melhorar está função deixando á mais curta e dando um contexto para as variáveis
    public class mensagemStatusVisitante {
        private String numero;
        private String verbo;
        private String modificadorPlural;

        public String faca(char candidato, int conta) {
            criarParteMensagemDependentePlural(conta);
            return String.format(
                    "À %s %s %s%s",
                    verbo, numero, candidato, modificadorPlural
            );
        }

        private void criarParteMensagemDependentePlural(int conta) {
            if (conta == 0) {
                naoTemCartas();
            } else if (conta == 1) {
                temUmaCarta();
            } else {
                temMuitasCartas(conta);
            }
        }

        private void temMuitasCartas(int conta) {
            numero = Integer.toString(conta);
            verbo = "Existem";
            modificadorPlural = "s";
        }

        private void temUmaCarta() {
            numero = "1";
            verbo = "Existe";
            modificadorPlural = "";
        }

        private void naoTemCartas() {
            numero = "Não";
            verbo = "Existem";
            modificadorPlural = "s";
        }
    }
}
