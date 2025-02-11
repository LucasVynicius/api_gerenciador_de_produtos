package br.com.gerenciadordeprodutos.api.controller;

import br.com.gerenciadordeprodutos.api.dtos.CriarProdutoRequest;
import br.com.gerenciadordeprodutos.api.dtos.ProdutoCriadoResponse;
import br.com.gerenciadordeprodutos.api.model.Produto;
import br.com.gerenciadordeprodutos.api.repository.FornecedorRepository;
import br.com.gerenciadordeprodutos.api.repository.ProdutoRepository;
import br.com.gerenciadordeprodutos.api.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoCriadoResponse criarProduto(@Valid @RequestBody CriarProdutoRequest criarProdutoRequest){
       return produtoService.criarProduto(criarProdutoRequest);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Produto buscarProdutoPeloId(@PathVariable Long id){
        return produtoService.buscarProdutoPeloId(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Produto> buscarTodosProdutos(){
        return produtoService.buscarTodosProdutos();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Produto atualizarProduto(@PathVariable Long id,@Valid @RequestBody CriarProdutoRequest criarProdutoRequest){
        return produtoService.atualizarProduto(id, criarProdutoRequest);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarProduto(@PathVariable Long id){
        produtoService.deletarProduto(id);
    }

}
