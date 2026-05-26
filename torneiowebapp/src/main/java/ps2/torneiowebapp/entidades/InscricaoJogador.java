package ps2.torneiowebapp.entidades;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("INSCRICAO_JOGADOR")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InscricaoJogador extends Inscricao{
    private Jogador jogador;
}
