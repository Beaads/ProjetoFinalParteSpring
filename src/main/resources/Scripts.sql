create table checklist
(
    id                    bigserial primary key not null,
    data_hora             timestamp             not null,
    data                  varchar(20)           not null,
    hora                  varchar(20)           not null,
    saida_retorno          varchar(7)            not null,
    placa                 varchar(20)           not null,
    motorista             varchar(50)           not null,
    km_veiculo             numeric              not null
        constraint km_positivo check ( kmveiculo >= 0 ),
    tracao                varchar(4)            not null,
    rodoar                varchar(4)            not null,
    calibragem_pneus       varchar(4)            not null,
    estepe                varchar(4)            not null,
    freio_dianteiro        varchar(4)            not null,
    freio_traseiro         varchar(4)            not null,
    amortecedor           varchar(4)            not null,
    molas                 varchar(4)            not null,
    cambio_oleo            varchar(4)            not null,
    direcao_oleo           varchar(4)            not null,
    limpeza_radiador_agua   varchar(4)            not null,
    oleo_motor             varchar(4)            not null,
    retrovisor            varchar(4)            not null,
    para_brisa             varchar(4)            not null,
    para_choquedianteiro   varchar(4)            not null,
    para_choquetraseiro    varchar(4)            not null,
    estofamento           varchar(4)            not null,
    cortinas              varchar(4)            not null,
    cinto_de_seguranca      varchar(4)            not null,
    freio_de_estacionamento varchar(4)            not null
);

CREATE TABLE USUARIO (
                         id BIGSERIAL PRIMARY KEY not null,
                         usuario VARCHAR(20),
                         senha VARCHAR(4)
);

SELECT * FROM usuario;