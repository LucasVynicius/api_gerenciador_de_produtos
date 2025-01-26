package br.com.gerenciadordeprodutos.api.service;

import br.com.gerenciadordeprodutos.api.dtos.CriarFornecedorRequest;
import br.com.gerenciadordeprodutos.api.dtos.FornecedorCriadoResponse;
import br.com.gerenciadordeprodutos.api.model.Fornecedor;
import br.com.gerenciadordeprodutos.api.repository.FornecedorRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;


public class FornecedorServiceImpl implements FornecedorService{

    @Autowired
    FornecedorRepository fornecedorRepository;

    @Override
    public FornecedorCriadoResponse criarFornecedor(CriarFornecedorRequest criarFornecedorRequest) {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome(criarFornecedorRequest.nome());
        fornecedor.setEmail(criarFornecedorRequest.email());
        fornecedor.setCnpj(criarFornecedorRequest.cnpj());
        fornecedor.setTipoFornecedor(criarFornecedorRequest.tipoFornecedor());
        fornecedor.setCriadoEm(LocalDate.now());

        Fornecedor fornecedorCriado = fornecedorRepository.save(fornecedor);

        return new FornecedorCriadoResponse("Fornecedor Criado com Sucesso! ", fornecedorCriado.getId());
    }
}
