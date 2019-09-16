package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Marvel Shopp</title>\n");
      out.write("        <link rel=\"icon\" type=\"imagem/png\" href=\"imagens/deadpoolLogo.png\" />\n");
      out.write("       <!-- <link rel = \"shortcut icon\" type = \"imagem/x-icon\" href = \"imagens/favicon.ico\"/> -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilo.css\" /> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"interface\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <header id=\"cabecalho\">                \n");
      out.write("        <a href=\"index.jsp\"><img id=\"logo\" src=\"imagens/logo.PNG\"/></a>             \n");
      out.write("        <nav id=\"menu\">\n");
      out.write("            <ul type=\"disk\">\n");
      out.write("                <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"top10.html\">Top 10</a></li>\n");
      out.write("                <li><a href=\"promocao.html\">Promoção</a></li>\n");
      out.write("                <li><a href=\"faleConosco.html\">Fale Conosco</a></li>\n");
      out.write("                <li><a href=\"login.html\">Login</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        <nav id=\"carrinho\">\n");
      out.write("            <ul type=\"disk\">\n");
      out.write("                <li><a href=\"carrinhoDeCompras.html\"><img id=\"carrinho\" src=\"imagens/carrinhoDeCompras.png\"/></a></li>\n");
      out.write("            </ul>                    \n");
      out.write("        </nav>    \n");
      out.write("                \n");
      out.write("        <form action=\" \" method=\"post\" id= \"busca\">\t\t\t\n");
      out.write("            <input type=\"search\" id=\"busca\" name=\"q\">\n");
      out.write("            <button type=\"submit\">Buscar</button>\n");
      out.write("        </form>\n");
      out.write("    </header>     \n");
      out.write("</html>\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <section id=\"corpo\"> <!--divisão da pagina. Aqui se inicia o corpo da pagina (seção do meio)-->\n");
      out.write("                <header id=\"propaganda\">\n");
      out.write("                    <h2><p>TOP 10</p></h2>\t\t\n");
      out.write("                    <h2><p>Promoções</p></h2>\t\t\n");
      out.write("                    <h2><p>+ vendidos</p></h2>\t\t\t\t\n");
      out.write("                </header>\n");
      out.write("            </section>\n");
      out.write("            \n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <footer id=\"rodape\"><!--delimita o rodapé da pagina-->  <!--target=_black faz\\ com que a pagina abra em outra aba-->\t\t\n");
      out.write("\t<a href=\"index.jsp\"><img id=\"home\" src=\"imagens/logo.PNG\" /></a>\n");
      out.write("                \n");
      out.write("        <p id=\"endereco\">Endereço Av. Gal. Milton Tavares de Souza, s/n </br> São Domingos, Niterói - RJ, 24210-310</br>\n");
      out.write("        Telefone (21) 2629-2960</br>\n");
      out.write("        Copyright © 2019</p>\n");
      out.write("        <a href=\"http://facebook.com\" target= \"_black\"><img id=\"facebook\" src=\"imagens/facebook.png\" title=\"Facebook\" /></a>\n");
      out.write("        <a href=\"http://instagram.com\" target= \"_black\"><img id=\"instagran\" src=\"imagens/insta.png\" title=\"Instagram\"/></a>\n");
      out.write("\t<a href=\"http://twitter.com\" target=\"_black\"><img id=\"twitter\" src=\"imagens/twitter.png\" title=\"Twitter\"/></a>\n");
      out.write("        <a href=\"http://web.whatsapp.com/\" target=\"_black\"><img id=\"whatsapp\" src=\"imagens/whatsapp.png\" title=\"Whatsapp\"/></a>\n");
      out.write("        <a href=\"http://youtube.com/\" target=\"_black\"><img id=\"youtube\" src=\"imagens/youtube.png\" title=\"Youtube\"/></a>\n");
      out.write("    </footer>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
