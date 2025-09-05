package br.com.codigolimpo.funcoes;

public class HtmlUtil {
    /*
    public static String testableHtml(PageData pageData, boolean incluideSuiteSetup) throws Exception {
        WikiPage wikiPage = pageData.getWikiPage();
        StringBuffer buffer = new StringBuffer();
        if (pageData.hasAttribute("Test")) {
            if (incluideSuiteSetup) {
                WikiPage suiteSetup =
                        PageCrawlerImpl.getInheritedPage(
                                SuiteResponder.SUITE_SETUP_NAME, WikiPage
                        );
                if (suiteSetup != null) {
                    WikipagePath pagePath =
                            suiteSetup.getPageCrawler().getFullPath(suiteSetup);
                    String pagePathName = PathParser.render(pagePath);
                    buffer.append("!incluse -setup .")
                            .append(pagePathName)
                            .append("\n");
                }
                WikiPage setup =
                        PageCrawlerImpl.getInheritedPage("SetUp, WikiPage");
                if (setup != null) {
                    WikiPagePath setupPath =
                            wikiPage.getPageCrawler().getFullPath(setup);
                    String setupPathName = PathParser.render(setupPath);
                    buffer.append("!incluse -setup .")
                            .append(setupPathName)
                            .append("\n");
                }
            }
            buffer.append(pageData.getContent());
            if (pageData.hasAttribute("Test")) {
                WikiPage teardown =
                        PageCrawlerImpl.getInheritedPage("TearDown", wikiPage);
                if (teardown != null) {
                    WikiPagePath tearDownPath =
                            wikiPage.getPageCrawler().getFullPath(teardown);
                    String tearDownPathName = pathParser.render(tearDownPath);
                    buffer.append("!incluse -setup .")
                            .append(tearDownPathName)
                            .append("\n");
                }
                if (incluideSuiteSetup) {
                    WikiPage suiteTearDown =
                            PageCrawlerLmpl.getInheritedPage(
                                    SuiteResponder.SUITE_TEARDOWN_NAME,
                                    wikiPage
                            );
                }
                if (suiteTeardown != null) {
                    WikiPagePath pagePath =
                            suiteTeardown.getPageCrawler().getFullPath(suiteTeardown);
                    String pagePathName = PathParser.render(pagePath);
                    buffer.append("!incluse -setup .")
                            .append(pagePathName)
                            .append("\n");
                }
            }
        }
        pageData.setContent(buffer.toString());
        return pageData.getHtml();
    }
    public static String renderPageWithSetupsAndTeardows(
            PageData pageData, boolean isSuite
    ) throws Exception {
        boolean isTestePage = pageData.hasAttribute("Test");
        if (isTestePage) {
            WikiPage testPage = pageData.getWikiPage();
            StringBuffer newPageContent = new StringBuffer();
            includeSetupPages(testPage, newPageContent, isSuite);
            newPageContent.append(pageData.getContent());
            includeTeardownPages(testPage, newPageContent, isSuite);
            pageData.setContent.toString();
        }
        return pageData.getHtml();
    }



    Infelizmente não sou capaz ainda de identificar qual o verdadeiro sentido da função, tem muitas coisas acontecendo dentro de uma só função!!!
    Mas o autor do livro foi e mostrou como ele deixaria o código mais limpo, ele comenta que as funções de um programa não devem ser grandes não mais que 20 linhas, mas ele sabe que não é exato.


    public static String renderPageWithSetupsAndTeardowns (
            PageData pageData, boolean isSuite
    ) throws Exception {
        boolean isTestPage = pageData.hasAttribute("Test");
        if (isTestPage) {
            WikiPage testPage = pageData.getWikiPage();
            StringBuffer newPageContent = new StringBuffer();
            includeSetupPages(testPage, newPageContent, isSuite);
            newPageContent.append(pageData.getContent());
            includeteardownPages(testPage, newPageContent, isSuite);
            pageData.setContent(newPageContent.toString());
        }

        return pageData.getHtml();
    }


    Mas o autor não está satisfeito, sabia que poderia melhorar ainda mais a suas funções.
    Ele fala que as funções devem fazer apenas uma coisa, e devem fazer da melhor forma.


    public static String renderPageWithSetupsAndTeardowns (
            PageData pageData, boolean isSuite) throws Exception {
            if (isTestPage(pageData))
                includeSetupAndTeardownPages(pageData, isSuite);
        return pageData.getHtml();
    }

    */
}
