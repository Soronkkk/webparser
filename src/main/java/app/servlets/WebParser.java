package app.servlets;

import app.DAO.DAOImplementation;
import app.entities.ResultsEntity;
import app.entities.UsersEntity;
import app.webparser.GetHTML;
import app.webparser.TextAnalysis;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class WebParser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/views/webparser.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        DAOImplementation daoImplementation = new DAOImplementation();
        ResultsEntity resultsEntity =  new ResultsEntity();

        resultsEntity.setPage(req.getParameter("page"));

        GetHTML getHTML = new GetHTML(resultsEntity.getPage());
        getHTML.getHtmlToText();
        TextAnalysis textAnalysis = new TextAnalysis();
        textAnalysis.setSplitWords(getHTML.getPathName());

        resultsEntity.setWords_quantity(String.valueOf(textAnalysis.wordCount().size()));
        UsersEntity usersEntity = (UsersEntity) req.getSession().getAttribute("user");
        resultsEntity.setUser_id(usersEntity.getId());
        daoImplementation.save(resultsEntity);
        req.getRequestDispatcher("/views/webparser.jsp").forward(req, resp);
    }




}
