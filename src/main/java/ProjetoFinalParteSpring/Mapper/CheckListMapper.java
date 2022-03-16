package ProjetoFinalParteSpring.Mapper;

import ProjetoFinalParteSpring.Domain.CheckListDto;
import ProjetoFinalParteSpring.Domain.CheckListEntity;
import com.sun.istack.NotNull;
import org.springframework.stereotype.Component;

@Component
public class CheckListMapper {
    @NotNull
    public CheckListEntity toEntity(@NotNull CheckListDto dto) {
        return CheckListEntity.builder()
                .id(dto.getId())
                .data(dto.getData())
                .hora(dto.getHora())
                .saidaRetorno(dto.getSaidaRetorno())
                .placa(dto.getPlaca())
                .motorista(dto.getMotorista())
                .kmVeiculo(dto.getKmVeiculo())
                .tracao(dto.getTracao())
                .rodoar(dto.getRodoar())
                .calibragemPneus(dto.getCalibragemPneus())
                .estepe(dto.getEstepe())
                .freioDianteiro(dto.getFreioDianteiro())
                .freioTraseiro(dto.getFreioTraseiro())
                .amortecedor(dto.getAmortecedor())
                .molas(dto.getMolas())
                .cambioOleo(dto.getCambioOleo())
                .direcaoOleo(dto.getDirecaoOleo())
                .limpezaRadiadorAgua(dto.getLimpezaRadiadorAgua())
                .oleoMotor(dto.getOleoMotor())
                .retrovisor(dto.getRetrovisor())
                .paraBrisa(dto.getParaBrisa())
                .paraChoqueDianteiro(dto.getParaChoqueDianteiro())
                .paraChoqueTraseiro(dto.getParaChoqueTraseiro())
                .estofamento(dto.getEstofamento())
                .cortinas(dto.getCortinas())
                .cintoDeSeguranca(dto.getCintoDeSeguranca())
                .freioDeEstacionamento(dto.getFreioDeEstacionamento())
                .build();
    }

    }

