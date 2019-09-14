package app.servlets;

import app.DAO.DAOImplementation;
import app.entities.ResultsEntity;
import app.entities.UsersEntity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

public class WebParser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/views/webparser.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        DAOImplementation daoImplementation = new DAOImplementation();
        ResultsEntity resultsEntity =  new ResultsEntity();
        //resultsEntity.setPage(req.getParameter("page"));
        //resultsEntity.setWords_quantity(req.getParameter("words_quantity"));
        resultsEntity.setPage("qwe");
        resultsEntity.setWords_quantity("qwe");
        UsersEntity usersEntity = (UsersEntity) req.getSession().getAttribute("user");
        resultsEntity.setCookie(usersEntity.getCookie());
        daoImplementation.save(resultsEntity);
        req.getRequestDispatcher("/views/webparser.jsp").forward(req, resp);
    }


}
