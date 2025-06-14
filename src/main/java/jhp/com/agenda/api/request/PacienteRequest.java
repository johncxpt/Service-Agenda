package jhp.com.agenda.api.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PacienteRequest {

    private String nome;
    private String sobreNome;
    private String email;
    private String cpf;

}
