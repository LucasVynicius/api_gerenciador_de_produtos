package br.com.gerenciadordeprodutos.api.service;

import br.com.gerenciadordeprodutos.api.dtos.CriarProdutoRequest;
import br.com.gerenciadordeprodutos.api.dtos.ProdutoCriadoResponse;
import br.com.gerenciadordeprodutos.api.model.Produto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProdutoService {

    ProdutoCriadoResponse criarProduto(CriarProdutoRequest criarProdutoRequest);

    Produto buscarProdutoPeloId(Long id);

    List<Produto> buscarTodosProdutos();

    Produto atualizarProduto(Long id, CriarProdutoRequest criarProdutoRequest);

    void deletarProduto(Long id);
}
