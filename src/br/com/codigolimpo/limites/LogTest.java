package br.com.codigolimpo.limites;

import java.util.logging.Logger;

public class LogTest {
    /*
    Quando usamos código de terceiro devemos sempre considerar em "warp" ou empacotar os mesmos para que nos nem sempre dependermos das APIs de terceiros
    Então limites devem ser criados, podemos usar o código mas primeiro entender seu funcionamento e depois usalo.
    Os testes de pacote de terceiro é um bom exemplo, já que o conhecimento obtido por realizar as funções básicas do pacote, podemos sempre testar as versões mais recentes
    e identificar caso algo pare de funcionar, fora do nosso sistema já implantado.

    private Logger logger;

    @Before
    public void initialize() {
        logger = Logger.getLogger("logger");
        logger.removeAllAppenders();
        Logger.getRootLooger().removeAllAppenders();
    }

    @Test1
    public void basicLogger() {
        BasicConfigurator.configure();
        logger.info("basicLogger");
    }

    @Test2
    public void addAppenderWithStream() {
        logger.addAppender(new ConsoleAppender(new PatternLayout("%p %t %m%n"),ConsoleAppender.SYSTEM_OUT));
        logger.info("addAppenderWithStream");
    }

    @Test3
    public void addAppenderWithoutStream() {
        logger.addAppender(new ConsoleAppender(new PatternLayout("%p %t %m%n"),ConsoleAppender.SYSTEM_OUT));
        logger.info("addAppenderWithoutStream");
    }
     */
}
