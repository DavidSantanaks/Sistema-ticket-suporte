package com.suporte.ticket.sistemas.Controller;

import com.suporte.ticket.sistemas.Repository.TicketRepository;
import com.suporte.ticket.sistemas.Tickets.ListarTicketAbertoRecord;
import com.suporte.ticket.sistemas.Tickets.TicketCadastroRecord;
import com.suporte.ticket.sistemas.Tickets.TicketModelo;
import com.suporte.ticket.sistemas.Tickets.atualizarTicket;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ticket")
public class TicketController {

    @Autowired
    private TicketRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarTicket(@RequestBody @Valid TicketCadastroRecord dados){
        repository.save(new TicketModelo(dados));
    }

    //Listar por ID
    @GetMapping
    public List<ListarTicketAbertoRecord> listar(Pageable paginacao){
        return repository.findAll(paginacao).stream().map(ListarTicketAbertoRecord::new).toList();
    }

    //@PutMapping
    //metodo de atualizar chamado
    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid atualizarTicket dados){
        TicketModelo ticker = repository.getReferenceById(dados.id());
        ticker.atualizarTicket(dados);

    }

    //@DeleteMapping
    //Metodo para "fechar o chamado"


}
