package ProjetoFinalParteSpring.Domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class CheckListRespostaDTOLista {
    private String data;
    private String hora;
    private String saidaRetorno;
    private String placa;
    private String motorista;
    private String kmVeiculo;
}
