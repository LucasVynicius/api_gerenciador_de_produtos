package br.com.gerenciadordeprodutos.api.service;

import br.com.gerenciadordeprodutos.api.dtos.CriarFornecedorRequest;
import br.com.gerenciadordeprodutos.api.dtos.FornecedorCriadoResponse;
import br.com.gerenciadordeprodutos.api.model.Fornecedor;
import br.com.gerenciadordeprodutos.api.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;

@Service
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

    @Override
    public Fornecedor buscarFornecedorPeloId(Long id) {
        return fornecedorRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Fornecedor não encontrado"));
    }

    @Override
    public List<Fornecedor> buscarTodosFornecedores() {
        return fornecedorRepository.findAll();
    }

    @Override
    public Fornecedor atualizarFornecedor(Long id, CriarFornecedorRequest criarFornecedorRequest) {
        Fornecedor fornecedorExistente = fornecedorRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Fornecedor não escontrado"));

        fornecedorExistente.setNome(criarFornecedorRequest.nome());
        fornecedorExistente.setEmail(criarFornecedorRequest.email());
        fornecedorExistente.setCnpj(criarFornecedorRequest.cnpj());
        fornecedorExistente.setTipoFornecedor(criarFornecedorRequest.tipoFornecedor());

        return fornecedorRepository.save(fornecedorExistente);
    }

    @Override
    public void deletarFornecedorPeloId(Long id) {
        Fornecedor fornecedorExistente = fornecedorRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Fornecedor não encontrado!"));

        fornecedorRepository.delete(fornecedorExistente);
    }


}
