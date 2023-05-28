package com.suporte.ticket.sistemas.Tickets;

import com.suporte.ticket.sistemas.descricao.DescricaoCadastro;

public record atualizarTicket(Long id, Status status, DescricaoCadastro descricao) {

}
