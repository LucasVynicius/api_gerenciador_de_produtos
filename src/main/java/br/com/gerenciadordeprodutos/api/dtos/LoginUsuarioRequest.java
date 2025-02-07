package br.com.gerenciadordeprodutos.api.dtos;

import jakarta.validation.constraints.Email;

public record LoginUsuarioRequest(
        @Email
        String email,

        String senha
) {
}
