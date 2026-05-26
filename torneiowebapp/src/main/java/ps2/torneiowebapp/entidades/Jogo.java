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
public class Jogo {
    @Id @GeneratedValue
    private long id;
    private String nome;
    private String genero;
    private String plataforma;
    private String estudio;
    private LocalDate anoLancamento;
    private String modoCompetitivo;
}
