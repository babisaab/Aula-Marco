package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Contato;

public class ContatoDAO {

    public static ContatoDAO instance = new ContatoDAO();

    private ContatoDAO() {
    }

    public static ContatoDAO getInstance() {
        return instance;
    }

    public void save(Contato contato) throws SQLException, ClassNotFoundException {
        Statement st = null;
        Connection conn = null;

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("insert into contatonovo (nome, email)" + " values ('" + contato.getNome() + "', '" + contato.getEmail() + "')");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);

        }
    }

    public Contato get(String email) throws ClassNotFoundException {
        Statement st = null;
        Connection conn = null;

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();

            ResultSet rs = st.executeQuery("select nome, email from contato  where contato.email like '" + email + "'");
            String nomeBanco = "";
            String emailBanco = "";
            while (rs.next()) {
                nomeBanco = rs.getString("nome");
                emailBanco = rs.getString("email");
            }
            return new Contato(nomeBanco, emailBanco);
        } catch (SQLException ex) {
            Logger.getLogger(ContatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeResources(conn, st);
        }
        return null;
    }

    private void closeResources(Connection conn, Statement st) {

        try {
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }

        } catch (SQLException e) {

        }
    }

    public void delete(String email) throws ClassNotFoundException {
        Statement st = null;
        Connection conn = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("delete contato from contato where contato.email like '"+email+"'");
        } catch (SQLException ex) {
            Logger.getLogger(ContatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeResources(conn, st);
        }
    }
}
