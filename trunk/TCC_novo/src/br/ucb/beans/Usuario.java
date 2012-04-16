/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ucb.beans;

import javax.persistence.*;

/**
 *
 * @author GUICUNHA
 */

@Entity
@Table(name="usuario")
public class Usuario {
    @Column(name="id_usuario")
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idUsuario;
    @Column(name="login_user")
    private String login;
    @Column(name="senha_user")
    private String senha;
    @Column(name="nome")
    private String nome;
    @Column(name="universidade")
    private String universidade;

    public Usuario() {
    }

    /**
     * @return the idUsuario
     */
    public Integer getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the universidade
     */
    public String getUniversidade() {
        return universidade;
    }

    /**
     * @param universidade the universidade to set
     */
    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }
}