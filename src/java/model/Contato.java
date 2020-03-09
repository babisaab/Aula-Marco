
package model;

public class Contato {
    private int  id;
    private String nome;
    private String email;
    private Contato contato;

    public Contato(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.contato = contato;
    }

    public Contato() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
