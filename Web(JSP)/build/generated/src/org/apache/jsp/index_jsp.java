package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Clases.Datos;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <title>Inicio de Sesion</title>\n");
      out.write("        <!-- Meta tag Keywords -->\n");
      out.write("\n");
      out.write("        <!-- Meta tag Keywords -->\n");
      out.write("\n");
      out.write("        <!-- css files -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\" /> <!-- Style-CSS --> \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.css\"> <!-- Font-Awesome-Icons-CSS -->\n");
      out.write("        <!-- //css files -->\n");
      out.write("\n");
      out.write("        <!-- online-fonts -->\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Josefin+Sans:100,100i,300,300i,400,400i,600,600i,700,700i&amp;subset=latin-ext\" rel=\"stylesheet\">\n");
      out.write("        <!-- //online-fonts -->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!--header-->\n");
      out.write("        <div class=\"header-w3l\">\n");
      out.write("            <h1>Renta de Activos CORRECTA </h1>\n");
      out.write("        </div>\n");
      out.write("        <!--//header-->\n");
      out.write("\n");
      out.write("        <!--main-->\n");
      out.write("        <div class=\"main-content-agile\">\n");
      out.write("            <div class=\"sub-main-w3\">\t\n");
      out.write("                <div class=\"wthree-pro\">\n");
      out.write("                    <img src=\"images/pro.jpg\" alt=\"image\">\n");
      out.write("                    <h2>Inicio de Sesion</h2>\n");
      out.write("                </div>\n");
      out.write("                <form method=\"POST\">\n");
      out.write("                    <input placeholder=\"Usuario\" name=\"Name\" class=\"user\" type=\"text\" required=\"\" > \n");
      out.write("                    <input  placeholder=\"Password\" name=\"Password\" class=\"pass\" type=\"password\" required=\"\">\n");
      out.write("                    <input placeholder=\"Empresa\" name=\"empresa\" class=\"emp\" type=\"text\" required=\"\">\n");
      out.write("                    <input placeholder=\"Departamento\" name=\"departamento\" class=\"dep\" type=\"text\" required=\"\">\n");
      out.write("                    <div class=\"sub-w3l\">\n");
      out.write("                        <div class=\"right-w3l\">\n");
      out.write("                            <input type=\"submit\" value=\"Login\">\n");
      out.write("                            ");

                            try{
                            if(request.getParameter("nombre")!=null){
                            Datos d=new Datos();
                            d.setUsuario(request.getParameter("Name"));
                            d.setContraseña(request.getParameter("Password"));
                            d.setEmpresa(request.getParameter("empresa"));
                            d.setDepartamento(request.getParameter("departamento"));
                            out.println("<br>Tu Usuario es: "+d.getUsuario() );
                            out.println("<br>Tu Contraseña es: "+d.getContraseña());
                            out.println("<br>Tu Empresa es: "+d.getEmpresa());
                            out.println("<br>Tu Departamento es: "+d.getDepartamento());
                            }
                            }
                            catch(Exception ex){
                            out.println("");
                            }
                            
      out.write("\n");
      out.write("                            <div class=\"top-big-link\">\n");
      out.write("                                <a class=\"btn btn-link-3\" href=\"Registro.jsp\">Registrase</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
