package ps2.torneiowebapp.entidades;

import java.time.LocalDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Equipe {
    @Id @GeneratedValue
    private long id;
    private String nome;
    private String tag;
    private LocalDate dataCriacao;
}
