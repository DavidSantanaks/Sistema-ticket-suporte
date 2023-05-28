package com.suporte.ticket.sistemas.descricao;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Descricao {

    private String descricao;


    //Construtor
    public Descricao(DescricaoCadastro descricao){
        this.descricao = descricao.descricao();
    }
}
