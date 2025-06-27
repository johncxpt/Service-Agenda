package jhp.com.agenda.api.mapper;

import jhp.com.agenda.api.request.PacienteRequest;
import jhp.com.agenda.api.response.PacienteResponse;
import jhp.com.agenda.domain.entity.Paciente;
import jhp.com.agenda.domain.service.PacienteService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class PacienteMapper {

   private final ModelMapper mapper;

    public Paciente toPaciente(PacienteRequest request) {
        return mapper.map(request, Paciente.class);
    }

    public PacienteResponse toPacienteResponse(Paciente paciente) {
        return mapper.map(paciente, PacienteResponse.class);
    }

//    public PacienteCompletoResponse toPacienteCompletoResponse(Paciente paciente) {
//        return mapper.map(paciente, PacienteCompletoResponse.class);
//    }

    public List<PacienteResponse> toPacienteResponseList(List<Paciente> pacientes) {
        return pacientes.stream()
                .map(this::toPacienteResponse)
                .collect(Collectors.toList());
    }

}