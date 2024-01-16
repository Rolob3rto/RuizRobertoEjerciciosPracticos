
<%@page import="java.util.stream.Collectors"%>
<%@page import="java.util.Comparator"%>
<%@page import="java.util.List"%>
<%@page import="com.roberto.clase10.persistance.ControladoraPersistencia"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.roberto.clase10.model.Partido"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

        <style>
            body {
                display: flex;
                min-height: 100vh;
                align-items: center;
                justify-content: center;
                margin: 0;
                background-color: gray;
            }

            .container {
                width: 50%;
            }
            
            .lbPartidos{
                display: flex;
                
            }    
            
             .lbPartidos input[type="radio"] {
                margin-right: 5px;
            }
            
            h2{
                margin-bottom: 1em;
            }
        </style>
    </head>
    <body>
        <div class="container mt-4">
            <h2>Votación</h2>
            <form action="PartidoSv" method="post">
                <%! ControladoraPersistencia controladora = new ControladoraPersistencia();%>
               
                <% List<Partido> listadoPartidos = controladora.listadoPartidos();%>
                <% for (Partido partido : listadoPartidos ) {%>
                <div class="form-group">
                    <label class="lbPartidos">
                        <input type="radio" value="<%= partido.getId()%>" name="radios" > <%= partido.getNombre()%>
                    </label>
                </div>
                <% } %>

                <button type="submit" class="btn btn-primary">Votar</button>
            </form>

            <hr>


            <form action="PartidoSv" method="get">                
                <button type="submit" class="btn btn-primary">Mostrar resultados</button>
            </form>

            <br>
            <br>

            <div class="results-table">
                <% if (request.getAttribute("resultadosPartidos") != null) {%>
                <h3>Resultados:</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Nombre</th>
                            <th>Votos</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% List<Partido> partidosVotos = (List<Partido>) request.getAttribute("resultadosPartidos"); 
                           partidosVotos = partidosVotos.stream()
                                  .sorted(Comparator.comparingInt(Partido::getVotos).reversed())
                                  .collect(Collectors.toList());
                        %>
                        <% for (Partido partido : partidosVotos) {%>
                        <tr>
                            <td><%= partido.getId()%></td>
                            <td><%= partido.getNombre()%></td>
                            <td><%= partido.getVotos()%></td>
                        </tr>
                        <% }%>
                    </tbody>
                </table>
                <% }%>
            </div>
        </div>
        <!-- Scripts de Bootstrap -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>


    </body>
</html>
