package br.com.gerenciadordeprodutos.api.model;

import br.com.gerenciadordeprodutos.api.enums.TipoFornecedorEnum;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "/fornecedor")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Fornecedor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "cnpj", nullable = false, length = 20, unique = true)
    private String cnpj;

    @Column(name = "tipo_fornecedor", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoFornecedorEnum tipoFornecedor;

    @Column(name = "criado_em", nullable = false)
    private LocalDate criadoEm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public TipoFornecedorEnum getTipoFornecedor() {
        return tipoFornecedor;
    }

    public void setTipoFornecedor(TipoFornecedorEnum tipoFornecedor) {
        this.tipoFornecedor = tipoFornecedor;
    }

    public LocalDate getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDate criadoEm) {
        this.criadoEm = criadoEm;
    }
}
