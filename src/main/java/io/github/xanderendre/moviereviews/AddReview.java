package io.github.xanderendre.moviereviews;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import static io.github.xanderendre.moviereviews.Home.movieArrayList;

@WebServlet(name = "addMovie", value = "/addMovie")
public class AddMovie extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        try {
            movieArrayList.add(new Movie(request.getParameter("name"), request.getParameter("review"), Integer.parseInt(request.getParameter("rating"))));
            response.setStatus(200);
        } catch (Exception exception) {
            response.setStatus(400);
        }

    }

    public void destroy() {
    }
}