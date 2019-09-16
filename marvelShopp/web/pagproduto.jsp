<%-- 
    Document   : pagproduto
    Created on : 15/09/2019, 22:24:13
    Author     : victo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estilo.css" /> 
         
        <title>JSP Page</title>
    </head>
    <body>
        <div id="interface">
             <%@ include file="header.jsp"%>
             <div class="grid-container">
          <a href="form .html">  <img src="imagens/maxresdefault.jpg"  width="600px" height="400px" class="grid-item"></a>
     <div class="grid-item label">
       
    <h1 > Eva 1</h1>
    <p >R$ 39,00</p>
     <button type="button" value="Comprar">Comprar</button>
     </div>
 <div class="grid-item descri">
     
    <h2 >Descrição</h2><br>
   
       <p>Spoiler <br>
        Ela é a prtaicamente é a mãe do shinji <br>
         transformada em um eva , absurdo né não<br>
         imagina sua mâe transformada em uma eva<br>
         traumatizante</p>
 </div>

  <div class ="grid-item descri">
    <p>Nome real: mãe do shinji</p>
    <p>categoria :robo altão</p>
    <p> sexo: feminino</p>
  </div>
   </div>
        </div>
              
        <%@ include file="footer.jsp"%>
    </body>
</html>
