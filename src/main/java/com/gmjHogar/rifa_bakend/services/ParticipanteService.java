
package com.gmjHogar.rifa_bakend.services;

import com.gmjHogar.rifa_bakend.models.Participante;
import com.gmjHogar.rifa_bakend.repository.ParticipanteRepository;
import com.gmjHogar.rifa_bakend.utils.Functions;
import java.text.ParseException;
import java.util.Objects;
import org.springframework.stereotype.Service;

@Service
public class ParticipanteService {
    
    
    private final ParticipanteRepository participanteRepository;

    public ParticipanteService(ParticipanteRepository participanteRepository) {
        this.participanteRepository = participanteRepository;
    }
    
    
    public Participante guardarParticipante(Participante participante) throws ParseException{
        Participante parti = participanteRepository.findByNombre(participante.getNombre());
        if(Objects.isNull(parti)){
            participante.setFecha_registro(Functions.obtenerFechaYhora());
            return  participanteRepository.save(participante);
        }
        
        return null;
        
        
        
    }
    
    

}
