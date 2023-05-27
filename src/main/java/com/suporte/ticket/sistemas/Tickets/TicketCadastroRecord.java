package com.suporte.ticket.sistemas.Tickets;

import com.suporte.ticket.sistemas.Status.Status;

import java.sql.Date;


public record TicketRecord(
        Integer id,
        String cliente,
        String assunto,
        String descricao,
        Status status,
        Date dataAbertura,
        Date dataFechamento
) {
}
