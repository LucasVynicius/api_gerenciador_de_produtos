package br.com.gerenciadordeprodutos.api.model;

import br.com.gerenciadordeprodutos.api.enums.TipoFornecedorEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "/fornecedor")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Fornecedor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "cnpj", nullable = false, length = 14, unique = true)
    private String cnpj;

    @Column(name = "tipo_fornecedor", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoFornecedorEnum tipoFornecedor;

    @Column(name = "criado_em", nullable = false)
    private LocalDate criadoEm;



}
