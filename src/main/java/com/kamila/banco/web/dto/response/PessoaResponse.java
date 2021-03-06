package com.kamila.banco.web.dto.response;

import com.kamila.banco.enums.TipoPessoa;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaResponse implements Serializable {

    @ApiModelProperty(position = 1, required = true, example = "1")
    private Long id;

    @ApiModelProperty(position = 2, required = true, example = "Kamila Freitas")
    private String nome;

    @ApiModelProperty(position = 3, required = true, example = "example@gmail.com")
    private String email;

    @ApiModelProperty(position = 4, required = true, example = "128.799.314-10")
    private String cpf;

    @ApiModelProperty(position = 5, required = true, example = "19.628.332/0001-43")
    private String cnpj;

    @ApiModelProperty(position = 6, required = true, example = "2000-01-01")
    private LocalDate dataNascimento;

    @ApiModelProperty(position = 7, required = true, example = "PF")
    private TipoPessoa tipoPessoa;
}
