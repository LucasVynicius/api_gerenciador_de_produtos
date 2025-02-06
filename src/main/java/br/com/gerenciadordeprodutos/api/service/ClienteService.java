package br.com.gerenciadordeprodutos.api.service;

import br.com.gerenciadordeprodutos.api.dtos.ClienteCriadoResponse;
import br.com.gerenciadordeprodutos.api.dtos.CriarClienteRequest;
import br.com.gerenciadordeprodutos.api.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClienteService {

    ClienteCriadoResponse criarCliente(CriarClienteRequest criarClienteRequest);

    Cliente buscarClientePeloId(Long id);

    List<Cliente> buscarTodosClientes ();

    Cliente atualizarCliente(Long id, CriarClienteRequest criarClienteRequest);

    void deletarClientePeloId(Long id);
}
