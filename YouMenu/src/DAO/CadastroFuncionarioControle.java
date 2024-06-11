/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import model.Funcionario;

/**
 *
 * @author Matheus
 */
public class CadastroFuncionarioControle {
     CadastroFuncionarioDAO restauranteDao = new CadastroFuncionarioDAO();

    public void salvar(Funcionario restaurante) {
        restauranteDao.salvar(restaurante);
    }
}
