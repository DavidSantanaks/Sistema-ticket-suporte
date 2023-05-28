package com.suporte.ticket.sistemas.Tickets;

import com.suporte.ticket.sistemas.descricao.DescricaoCadastro;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;


public record TicketCadastroRecord(
        int id,
        @NotNull
        String cliente,
        @NotNull
        String assunto,
        @NotNull
        Status status,
        @NotNull
        @Email
        String email,
        DescricaoCadastro descricao,
        LocalDate dataAbertura
) {}
