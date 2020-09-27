package ssau.esa.lab1.servlets;

import ssau.esa.lab1.beans.EmployeeBean;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/")
public class FirstServlet extends HttpServlet {

    @EJB
    private EmployeeBean emplBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        session.setAttribute("employeesList", emplBean.findAll());

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/myPage.jsp");
        if (dispatcher != null) {
            dispatcher.forward(req, resp);
        }
    }
}