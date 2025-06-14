package jhp.com.agenda.api.mapper;

import jhp.com.agenda.api.request.PacienteRequest;
import jhp.com.agenda.api.response.PacienteResponse;
import jhp.com.agenda.domain.entity.Paciente;

public class PacienteMapper {

    public static Paciente toPaciente(PacienteRequest request) {

        Paciente paciente = new Paciente();
        paciente.setNome(request.getNome());
        paciente.setSobreNome(request.getSobreNome());
        paciente.setEmail(request.getEmail());
        paciente.setCpf(request.getCpf());
        return paciente;

    }

    public  static PacienteResponse toPacienteResponse(Paciente paciente){
        PacienteResponse response = new PacienteResponse();
        response.setId(paciente.getId());
        response.setNome(paciente.getNome());
        response.setSobreNome(paciente.getSobreNome());
        response.setEmail(paciente.getEmail());
        response.setCpf(paciente.getCpf());
        return response;
    }

}
