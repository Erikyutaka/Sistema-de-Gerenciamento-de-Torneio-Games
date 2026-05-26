package ps2.torneiowebapp.entidades;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Partida {
    @Id @GeneratedValue
    private long id;
    private int rodada;
    private LocalDate dataHora;
    private int placarA;
    private int placarB;
    private String vencerdor;
}
