package br.com.gerenciadordeprodutos.api.dtos;

import jakarta.validation.constraints.Email;
import org.hibernate.validator.constraints.br.CPF;

public record RegistroUsuarioRequest(
        @Email
        String email,

        String senha,

        String nomeCompleto,
        @CPF
        String cpf
) {
}
