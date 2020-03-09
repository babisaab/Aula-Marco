/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import controller.Action;
import dao.ContatoDAO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Contato;


public class ApagarContatoAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String email = request.getParameter("textEmail");
        if (email.equals("")) {
            response.sendRedirect("contatoErro.jsp");
        } else {
            try {
                ContatoDAO.getInstance().delete(email);
                response.sendRedirect("contatoSucesso.jsp");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GravarContatoAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
