
package com.gmjHogar.rifa_bakend.services;

import com.gmjHogar.rifa_bakend.models.Participante;
import com.gmjHogar.rifa_bakend.repository.ParticipanteRepository;
import java.util.Objects;
import org.springframework.stereotype.Service;

@Service
public class ParticipanteService {
    
    
    private final ParticipanteRepository participanteRepository;

    public ParticipanteService(ParticipanteRepository participanteRepository) {
        this.participanteRepository = participanteRepository;
    }
    
    
    public Participante guardarParticipante(Participante participante){
        Participante parti = participanteRepository.findByNombre(participante.getNombre());
        if(!Objects.isNull(participante)){
            return null;
        }
        
        return  participanteRepository.save(participante);
        
        
    }
    
    

}
