package br.com.gerenciadordeprodutos.api.controller;

import br.com.gerenciadordeprodutos.api.service.FornecedorService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/fornecedor")
public class FornecedorController {

    @Autowired
    FornecedorService fornecedorService;
}
