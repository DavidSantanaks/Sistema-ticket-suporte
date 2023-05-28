package com.suporte.ticket.sistemas.Tickets;


import com.suporte.ticket.sistemas.descricao.Descricao;
import com.suporte.ticket.sistemas.descricao.DescricaoCadastro;

public record ListarTicketAbertoRecord(Long id, String cliente, String assunto, Status status, String email, Descricao descricao) {

        public ListarTicketAbertoRecord(TicketModelo modelo){
                this(modelo.getId(), modelo.getCliente(), modelo.getAssunto(), modelo.getStatus(), modelo.getEmail(), modelo.getDescricao());
        }

}
