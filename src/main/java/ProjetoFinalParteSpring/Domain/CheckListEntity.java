package ProjetoFinalParteSpring.Domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@Table(name = "CHECKLIST")

public class CheckListEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "data")
    private String data;
    @Column(name = "hora")
    private String hora;
    @Column(name = "saidaRetorno")
    private String saidaRetorno;
    @Column(name = "placa")
    private String placa;
    @Column(name = "motorista")
    private String motorista;
    @Column(name = "kmVeiculo")
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

//    public CheckListDto checkDTO() {
//        return new CheckListDto(this.id, this.data, this.hora, this.saidaRetorno, this.placa, this.motorista, this.kmVeiculo,
//                                this.tracao, this.rodoar, this.calibragemPneus, this.estepe, this.freioDianteiro,
//                                this.freioTraseiro, this.amortecedor, this.molas, this.cambioOleo, this.direcaoOleo,
//                                this.limpezaRadiadorAgua, this.oleoMotor, this.retrovisor, this.paraBrisa, this.paraChoqueDianteiro,
//                                this.paraChoqueTraseiro, this.estofamento, this.cortinas, this.cintoDeSeguranca, this.freioDeEstacionamento);
//    }
}
