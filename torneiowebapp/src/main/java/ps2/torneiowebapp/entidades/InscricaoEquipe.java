package ps2.torneiowebapp.entidades;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("INCRICAO_EQUIPE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InscricaoEquipe extends Inscricao{
    private Equipe equipe;
}
