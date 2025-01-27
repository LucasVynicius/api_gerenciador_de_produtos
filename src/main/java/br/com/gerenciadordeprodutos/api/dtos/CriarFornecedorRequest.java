package br.com.gerenciadordeprodutos.api.dtos;

import br.com.gerenciadordeprodutos.api.enums.TipoFornecedorEnum;
import org.hibernate.validator.constraints.br.CNPJ;

public record CriarFornecedorRequest(
        String nome,

        String email,

        @CNPJ(message = "CNPJ inválido")
        String cnpj,

        TipoFornecedorEnum tipoFornecedor
) {
}
