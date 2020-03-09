/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import controller.Action;
import dao.ContatoDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Contato;

public class GravarContatoAction implements Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String nome = request.getParameter("textNome");
        String email = request.getParameter("textEmail");
        if (nome.equals("") || email.equals("")) {
            response.sendRedirect("contatoErro.jsp");
        } else {
            try {
                Contato contato = new Contato(nome, email);
                ContatoDAO.getInstance().save(contato);
                response.sendRedirect("contatoSucesso.jsp");
            } catch (SQLException e) {
                response.sendRedirect("contatoErro.jsp");
                e.printStackTrace();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GravarContatoAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
