

package com.gmjHogar.rifa_bakend.controllers;

import com.gmjHogar.rifa_bakend.models.Participante;
import com.gmjHogar.rifa_bakend.services.ParticipanteService;
import java.text.ParseException;
import java.util.Objects;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/participante")
@CrossOrigin(origins = {"http://localhost:4200/", "http://almacenelectrohogar.com/", "https://pagafacil.almacenelectrohogar.com/", "https://rifa.almacenelectrohogar.com/"})
public class ParticipanteController {
    
    
    private final ParticipanteService participanteService;

    public ParticipanteController(ParticipanteService participanteService) {
        this.participanteService = participanteService;
    }
    
    
    @PostMapping("/")
    public ResponseEntity<Participante> guardarParticipante(@RequestBody Participante participante) throws ParseException{
        Participante particip = participanteService.guardarParticipante(participante);
        
        return Objects.isNull(particip)?ResponseEntity.noContent().build():ResponseEntity.ok(particip);
    }

}
