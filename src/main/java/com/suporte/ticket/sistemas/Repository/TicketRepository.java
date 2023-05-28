package com.suporte.ticket.sistemas.Repository;

import com.suporte.ticket.sistemas.Tickets.TicketModelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<TicketModelo, Long> { }
