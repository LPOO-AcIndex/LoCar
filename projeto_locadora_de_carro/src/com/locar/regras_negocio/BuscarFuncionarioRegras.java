package com.locar.regras_negocio;

import com.locar.dados.DadosFuncionarioBuscar;
import com.locar.entidades.Funcionario;
import java.util.List;

public class BuscarFuncionarioRegras {

    private DadosFuncionarioBuscar dados = new DadosFuncionarioBuscar();

    public List<Funcionario> buscarFuncionarios(String cpf, String nome, String telefone) {

        return dados.buscarFuncionarios(cpf, nome, telefone);
    }
}
