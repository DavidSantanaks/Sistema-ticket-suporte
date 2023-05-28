package com.suporte.ticket.sistemas.Tickets;


import com.suporte.ticket.sistemas.descricao.Descricao;
import com.suporte.ticket.sistemas.descricao.DescricaoCadastro;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity(name = "TicketModelo")
@Table(name = "ticket")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class TicketModelo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cliente;
    private String assunto;
    @Enumerated(EnumType.STRING)
    private Status status;
    private String email;
    private LocalDate dataAbertura;
    private LocalDate dataFechamento;
    @Embedded
    private Descricao descricao;

    //Construtor
    public TicketModelo(TicketCadastroRecord record){
        this.cliente = record.cliente();
        this.assunto = record.assunto();
        this.status = record.status();
        this.email = record.email();
        this.descricao = new Descricao(record.descricao());
        this.dataAbertura = LocalDate.now();
    }

}
