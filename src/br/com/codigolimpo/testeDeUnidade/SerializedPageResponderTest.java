package br.com.codigolimpo.testeDeUnidade;

public class SerializedPageResponderTest {
    /*
     Os testes nos possibitita criar um código robusto e seguro que pode ser alterado com poucas preocupações, então é de extrema importância mantelos limpos e seguindo o código em produção.


    public void testGetPageHieratchyAsXml() throws Exception {
        crawler.addPage(root, PathParser.parse("PageOne"));
        crawler.addPage(root, PathParser.parse("PageOne.ChildOne"));
        crawler.addPage(root, PathParser.parse("PageTwo"));
        request.setResource("root");
        request.addInput("type", "pages");
        Responder responder = new SerializedPageResponder();
        SimpleResponde responde = (SimpleResponde) responder.makeResponse(new FitNesseContext(root), request);
        String xml = response.getContent();

        assertEquals("Text/xml", response.getContentType());
        assertSubString("<name>Pageone</name>", xml);
        assertSubString("<name>PagTwo</name>", xml);
        assertSubString("<name>PageChildOne</name>", xml);
    }

    public void testGetPageHieratchyAsXmlDoesntContainSymbolicLinks() throws Exception {
        WikiPage pageOne = crawler.addPage(root, PathParser.parser("P"));
        crawler.addPage(root, PathParser.parse("PageOne.ChildOne"));
        crawler.addPage(root, PathParser.parse("PageTwo"));

        PageData data = pageOne.getData();
        WikiPageProperties properties = data.getProperties();
        WikiPageProperty symLinks = properties.set(SymbolicPage.PROF);
        symLinks.set("SymPage", "PageTwo");
        pageOne.commit(data);

        request.setResource("root");
        request.addInput("type", "pages");
        Responder responder = new SerializedPageResponder();
        SimpleResoponse resoponse = (SimpleResoponse) responder.makeResponse(new FitNesseContext(root), request);
        String xml = resoponse.getContent();

        assertEquals("Text/xml", response.getContentType());
        assertSubString("<name>Pageone</name>", xml);
        assertSubString("<name>PagTwo</name>", xml);
        assertSubString("<name>PageChildOne</name>", xml);
    }

    public void testGetDataAsHtml() throws Exception {
        crawler.addPage(root, PathParser.parse("TestPageOne"), "test");

        request.setResource("TestPageOne");
        request.addInput("type", "data");
    }


    Podemos ver que estes testes não foram feitos para ler, para poder entender teria que ter o contexto compledo de sua criação;
    Refatoração dos testes:


    public void testGetPageHierarchyAsXml() throws Exception {
        makePages("PageOne", "PageOne.ChildOne", "PageTwo");

        submitRequest("root", "type:pages");

        assertResponseIsXml();
        assertResponseContains("<name>PageOne</name>", "<name>PageTwo</name>", "<name>ChildOne</name>");
    }

    public void testSymbolicLinksAreNotInXmlPageHierarchy() throws Exception {
        WikiPage page = makePages("PageOne.ChildOne", "PageTwo");

        addLinkTo(page, "PageTwo", "SymPage");

        submitRequest("root", "type:pages");

        assertResponseIsXml();
        assertResponseContains("<name>PageOne</name>", "<name>PageTwo</name>", "<name>ChildOne</name>");
        assertResponseDoesContain("SymPage");
    }

    public void testGetDataAsXml() throws Exception {
        makePageWithContent("TestPageOne", "test page");

        submitRequest("TestPageOne", "type:data");

        assertResponseIsXml();
        assertResponseContains("test page", "<Test");
    }


    Uma única confirmação por teste.


    public void testGetPageHierarchyAsXml() throws Exception {
        givenPages("PageOne", "PageOne.ChildOne", "PageTwo");

        whenRequestIsIssued("root", "type:pages");

        thenResponseShouldBeXml();
    }

    public void testGetPageHierarchyRightTags() throws Exception {
        givenPages("PageOne", "PageOne.ChildOne", "PageTwo");

        whenRequestIsIssued("root", "type:pages");

        thenResponseShouldContain("<name>PageOne</name>", "<name>PageTwo</name>", "<name>ChildOne</name>");
    }
     */
}
