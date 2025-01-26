package br.com.gerenciadordeprodutos.api.dtos;

import br.com.gerenciadordeprodutos.api.enums.TipoFornecedorEnum;
import br.com.gerenciadordeprodutos.api.model.Fornecedor;

public record CriarFornecedorRequest(
        String nome,
        String email,
        String cnpj,
        TipoFornecedorEnum tipoFornecedor
) {
}
