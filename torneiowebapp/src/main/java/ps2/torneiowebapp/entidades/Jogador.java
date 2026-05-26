package ps2.torneiowebapp.entidades;

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
public class Jogador {
    @Id @GeneratedValue
    private long id;
    private String nickname;
    private String nomeReal;
    private String email;
    private String pais;
    private int ranking;
}
