package ProjetoFinalParteSpring.Domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder(toBuilder = true)
@Getter
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
    @Column(name = "tracao")
    private String tracao;
    @Column(name = "rodoar")
    private String rodoar;
    @Column(name = "calibragemPneus")
    private String calibragemPneus;
    @Column(name = "estepe")
    private String estepe;
    @Column(name = "freioDianteiro")
    private String freioDianteiro;
    @Column(name = "freioTraseiro")
    private String freioTraseiro;
    @Column(name = "amortecedor")
    private String amortecedor;
    @Column(name = "molas")
    private String molas;
    @Column(name = "cambioOleo")
    private String cambioOleo;
    @Column(name = "direcaoOleo")
    private String direcaoOleo;
    @Column(name = "limpezaRadiadorAgua")
    private String limpezaRadiadorAgua;
    @Column(name = "oleoMotor")
    private String oleoMotor;
    @Column(name = "retrovisor")
    private String retrovisor;
    @Column(name = "paraBrisa")
    private String paraBrisa;
    @Column(name = "paraChoqueDianteiro")
    private String paraChoqueDianteiro;
    @Column(name = "paraChoqueTraseiro")
    private String paraChoqueTraseiro;
    @Column(name = "estofamento")
    private String estofamento;
    @Column(name = "cortinas")
    private String cortinas;
    @Column(name = "cintoDeSeguranca")
    private String cintoDeSeguranca;
    @Column(name = "freioDeEstacionamento")
    private String freioDeEstacionamento;

    public CheckListEntity (Integer id, String data, String hora, String saidaRetorno, String placa, String motorista,
        String kmVeiculo, String tracao, String rodoar, String calibragemPneus, String estepe, String freioDianteiro,
        String freioTraseiro, String amortecedor, String molas, String cambioOleo, String direcaoOleo,
        String limpezaRadiadorAgua, String oleoMotor, String retrovisor, String paraBrisa, String paraChoqueDianteiro,
        String paraChoqueTraseiro, String estofamento, String cortinas, String cintoDeSeguranca, String freioDeEstacionamento) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.saidaRetorno = saidaRetorno;
        this.placa = placa;
        this.motorista = motorista;
        this.kmVeiculo = kmVeiculo;
        this.tracao = tracao;
        this.rodoar = rodoar;
        this.calibragemPneus = calibragemPneus;
        this.estepe = estepe;
        this.freioDianteiro = freioDianteiro;
        this.freioTraseiro = freioTraseiro;
        this.amortecedor = amortecedor;
        this.molas = molas;
        this.cambioOleo = cambioOleo;
        this.direcaoOleo = direcaoOleo;
        this.limpezaRadiadorAgua = limpezaRadiadorAgua;
        this.oleoMotor = oleoMotor;
        this.retrovisor = retrovisor;
        this.paraBrisa = paraBrisa;
        this.paraChoqueDianteiro = paraChoqueDianteiro;
        this.paraChoqueTraseiro = paraChoqueTraseiro;
        this.estofamento = estofamento;
        this.cortinas = cortinas;
        this.cintoDeSeguranca = cintoDeSeguranca;
        this.freioDeEstacionamento = freioDeEstacionamento;
    }

    public CheckListEntity() {
    }

}
