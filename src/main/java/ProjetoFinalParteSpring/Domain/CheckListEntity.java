package ProjetoFinalParteSpring.Domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@Table(name = "checklist")

public class CheckListEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String data;
    private String hora;
    private String saidaRetorno;
    private String placa;
    private String motorista;
    private String kmVeiculo;
    private String tracao;
    private String rodoar;
    private String calibragemPneus;
    private String estepe;
    private String freioDianteiro;
    private String freioTraseiro;
    private String amortecedor;
    private String molas;
    private String cambioOleo;
    private String direcaoOleo;
    private String limpezaRadiadorAgua;
    private String oleoMotor;
    private String retrovisor;
    private String paraBrisa;
    private String paraChoqueDianteiro;
    private String paraChoqueTraseiro;
    private String estofamento;
    private String cortinas;
    private String cintoDeSeguranca;
    private String freioDeEstacionamento;

    public CheckListEntity() {

    }

    public CheckListDto checkDTO() {
        return new CheckListDto(this.id, this.data, this.hora, this.saidaRetorno, this.placa, this.motorista, this.kmVeiculo,
                                this.tracao, this.rodoar, this.calibragemPneus, this.estepe, this.freioDianteiro,
                                this.freioTraseiro, this.amortecedor, this.molas, this.cambioOleo, this.direcaoOleo,
                                this.limpezaRadiadorAgua, this.oleoMotor, this.retrovisor, this.paraBrisa, this.paraChoqueDianteiro,
                                this.paraChoqueTraseiro, this.estofamento, this.cortinas, this.cintoDeSeguranca, this.freioDeEstacionamento);
    }
}