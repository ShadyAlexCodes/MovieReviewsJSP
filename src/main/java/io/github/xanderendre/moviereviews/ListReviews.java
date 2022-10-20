package io.github.xanderendre.moviereviews;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import static io.github.xanderendre.moviereviews.Home.movieArrayList;

@WebServlet(name = "listMovies", value = "/listMovies")
public class ListMovies extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        try {
            for(Movie movie: movieArrayList) {
                System.out.println(movie.toString());
            }
        } catch (Exception exception) {
            response.setStatus(400);
        }

    }

    public void destroy() {
    }
}