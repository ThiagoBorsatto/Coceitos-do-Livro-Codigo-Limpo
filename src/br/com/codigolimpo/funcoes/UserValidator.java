package br.com.codigolimpo.funcoes;

public class UserValidator {
    /*
    private Cryptographer cryptographer;

    public boolean checkPassword(String userName, String password) {
        User user = UserGateway.findByName(userName);
        if (user != User.NULL) {
            String codedPhrase = user.getPhraseEncodedByPassword();
            String phrase = cryptographer.decrypt(codedPhrase, password);
            if ("Valid Password".equals(phrase)) {
                Session.initialize();
                return true;
            }
        }
        return false;
    }

    A função de verificarSenha tem um efeito colateral, ela está fazendo mais uma função que não deveria no caso "Session.initialize();"
    esta segunda chamada não deveria estar dentro desta função, já que ela estaria fazendo duas coisas distintas.
     */
}
