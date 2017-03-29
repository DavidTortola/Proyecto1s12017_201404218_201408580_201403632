<%-- 
    Document   : index
    Created on : 26-mar-2017, 14:23:33
    Author     : Jorge Espina
--%>

<%@page import="Clases.Datos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String SesionNombre = request.getParameter("Name");
    session.setAttribute("theName", SesionNombre);
    String SesionEmpresa = request.getParameter("empresa");
    session.setAttribute("theempresa", SesionEmpresa);
    String SesionDepartamento = request.getParameter("departamento");
    session.setAttribute("thedepartamento", SesionDepartamento);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Inicio de Sesion</title>
        <!-- Meta tag Keywords -->

        <!-- Meta tag Keywords -->

        <!-- css files -->
        <link rel="stylesheet" href="css/style.css" type="text/css" media="all" /> <!-- Style-CSS --> 
        <link rel="stylesheet" href="css/font-awesome.css"> <!-- Font-Awesome-Icons-CSS -->
        <!-- //css files -->

        <!-- online-fonts -->
        <link href="//fonts.googleapis.com/css?family=Josefin+Sans:100,100i,300,300i,400,400i,600,600i,700,700i&amp;subset=latin-ext" rel="stylesheet">
        <!-- //online-fonts -->

    </head>

    <body>

        <!--header-->
        <div class="header-w3l">
            <h1>Renta de Activos </h1>
        </div>
        <!--//header-->

        <!--main-->
        <div class="main-content-agile">
            <div class="sub-main-w3">	
                <div class="wthree-pro">
                    <img src="images/pro.jpg" alt="image">
                    <h2>Inicio de Sesion</h2>
                </div>
                <form method="POST">
                    <input placeholder="Usuario" name="Name" class="user" type="text" required="" > 
                    <input  placeholder="Password" name="Password" class="pass" type="password" required="">
                    <input placeholder="Empresa" name="empresa" class="emp" type="text" required="">
                    <input placeholder="Departamento" name="departamento" class="dep" type="text" required="">
                    <div class="sub-w3l">
                        <div class="right-w3l">
                            <input type="submit" value="Login">
                            <%                                try {
                                    if (request.getParameter("Name") != null) {
                                        Datos d = new Datos();

                                        d.setUsuario(request.getParameter("Name"));
                                        d.setContraseña(request.getParameter("Password"));
                                        d.setEmpresa(request.getParameter("empresa"));
                                        d.setDepartamento(request.getParameter("departamento"));
                                        String Usu = d.getUsuario();
                                        String Con = d.getContraseña();
                                        String Empre = d.getEmpresa();
                                        String Dep = d.getDepartamento();

                                        if (d.Login(Usu, Con, Empre, Dep) == true) {
                                            response.sendRedirect("Principal.jsp");
                                            out.println("<br>Tu Usuario es: " + d.getUsuario());
                                            out.println("<br>Tu Contraseña es: " + d.getContraseña());
                                            out.println("<br>Tu Empresa es: " + d.getEmpresa());
                                            out.println("<br>Tu Departamento es: " + d.getDepartamento());
                                        } else {
                                            String popupScript = "<script language='JavaScript'> alert('Usuario o Contraseña Invalidos!'); </script>";
                                          //  index.RegisterStartupScript("PopupScript", popupScript);
                                            out.println("<br> ERROR");
                                        }

                                    }
                                } catch (Exception ex) {
                                    out.println("");
                                }
                            %>
                            <div class="top-big-link">
                                <a class="btn btn-link-3" href="Registro.jsp">Registrase</a>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>



