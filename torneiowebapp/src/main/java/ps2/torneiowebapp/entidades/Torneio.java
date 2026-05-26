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
public class Torneio {
    @Id @GeneratedValue
    private long id;
    private String nome;
    private String jogo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String premiacao;
    private String modo;
    private StatusTorneio status;
}
