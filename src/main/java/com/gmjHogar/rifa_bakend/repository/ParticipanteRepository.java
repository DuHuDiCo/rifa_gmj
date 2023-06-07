
package com.gmjHogar.rifa_bakend.repository;

import com.gmjHogar.rifa_bakend.models.Participante;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ParticipanteRepository extends JpaRepository<Participante, Long>{
    
    Participante findByNombre(String nombre);

}
