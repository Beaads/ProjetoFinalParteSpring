package ProjetoFinalParteSpring.Domain;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Getter
@Table(name = "CHECKLIST", schema = "public")

public class CheckListEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "data")
    private String data;
    @Column(name = "hora")
    private String hora;
    @Column(name = "saida_retorno")
    private String saidaRetorno;
    @Column(name = "placa")
    private String placa;
    @Column(name = "motorista")
    private String motorista;
    @Column(name = "km_veiculo")
    private Double kmVeiculo;
    @Column(name = "tracao")
    private String tracao;
    @Column(name = "rodoar")
    private String rodoar;
    @Column(name = "calibragem_pneus")
    private String calibragemPneus;
    @Column(name = "estepe")
    private String estepe;
    @Column(name = "freio_dianteiro")
    private String freioDianteiro;
    @Column(name = "freio_traseiro")
    private String freioTraseiro;
    @Column(name = "amortecedor")
    private String amortecedor;
    @Column(name = "molas")
    private String molas;
    @Column(name = "cambio_oleo")
    private String cambioOleo;
    @Column(name = "direcao_oleo")
    private String direcaoOleo;
    @Column(name = "limpeza_radiador_agua")
    private String limpezaRadiadorAgua;
    @Column(name = "oleo_motor")
    private String oleoMotor;
    @Column(name = "retrovisor")
    private String retrovisor;
    @Column(name = "para_brisa")
    private String paraBrisa;
    @Column(name = "para_choque_dianteiro")
    private String paraChoqueDianteiro;
    @Column(name = "para_choque_traseiro")
    private String paraChoqueTraseiro;
    @Column(name = "estofamento")
    private String estofamento;
    @Column(name = "cortinas")
    private String cortinas;
    @Column(name = "cinto_de_seguranca")
    private String cintoDeSeguranca;
    @Column(name = "freio_de_estacionamento")
    private String freioDeEstacionamento;
}
