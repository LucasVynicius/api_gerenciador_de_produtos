package br.com.gerenciadordeprodutos.api.service;

import br.com.gerenciadordeprodutos.api.dtos.CriarFornecedorRequest;
import br.com.gerenciadordeprodutos.api.dtos.FornecedorCriadoResponse;
import org.springframework.stereotype.Service;


@Service
public interface FornecedorService {


    FornecedorCriadoResponse criarFornecedor(CriarFornecedorRequest criarFornecedorRequest);
}
