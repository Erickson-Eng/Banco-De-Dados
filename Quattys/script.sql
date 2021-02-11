create table atleta
(
    idAtleta         int         not null
        primary key,
    email            varchar(40) null,
    nome             varchar(15) null,
    sobreNome        varchar(35) null,
    cpf              varchar(11) null,
    dataDeNascimento date        null,
    rua              varchar(30) null,
    bairro           varchar(25) null,
    estado           char(2)     null,
    peso             double      null,
    altura           double      null,
    posicao          varchar(35) null,
    idTime           int         null,
    nometime         varchar(40) null
);

create table tecnico
(
    idTecnico        int         not null
        primary key,
    email            varchar(40) null,
    nome             varchar(15) null,
    sobreNome        varchar(35) null,
    cpf              varchar(11) null,
    dataDeNascimento date        null,
    rua              varchar(30) null,
    bairro           varchar(25) null,
    estado           varchar(2)  null,
    eFormado         char(3)     null
);

create table formacao
(
    idFormacao       int auto_increment
        primary key,
    Formacao         varchar(25) null,
    ChaveE_idTecnico int         null,
    constraint fk_idtec
        foreign key (ChaveE_idTecnico) references tecnico (idTecnico)
);

create table time
(
    idTime         int         not null
        primary key,
    email          varchar(40) null,
    nomeTime       varchar(40) null,
    cnpj           varchar(14) null,
    rua            varchar(30) null,
    bairro         varchar(25) null,
    estado         varchar(2)  null,
    qtdAtletas     int         null,
    chaveE_Tecnico int         null,
    tecnicoTime    varchar(15) null,
    constraint chaveETecnico
        foreign key (chaveE_Tecnico) references tecnico (idTecnico)
);

create table partida
(
    idPartida              int         not null
        primary key,
    modalidade             char(3)     null,
    chaveE_idTimeCasa      int         null,
    chaveE_idTimeVisitante int         null,
    nomeTimeCasa           varchar(40) null,
    nomeTImeVisitante      varchar(40) null,
    constraint fk_timeCasa
        foreign key (chaveE_idTimeCasa) references time (idTime),
    constraint fk_timeVisit
        foreign key (chaveE_idTimeVisitante) references time (idTime)
);

create table atleta_partida
(
    tempoJogado      time null,
    chaveE_idAtleta  int  not null,
    chaveE_idPartida int  not null,
    primary key (chaveE_idPartida, chaveE_idAtleta),
    constraint fk_idAtleta
        foreign key (chaveE_idAtleta) references atleta (idAtleta),
    constraint fk_idPartida
        foreign key (chaveE_idPartida) references partida (idPartida)
);

create table estatisticasbasquete
(
    chaveE_idAtleta           int null,
    chaveE_idPartida          int null,
    ChaveP_idBasqueteEst      int auto_increment
        primary key,
    total_pontos              int null,
    arremessos_convertidos    int null,
    lanceslivres_convertidos  int null,
    faltas                    int null,
    tocos                     int null,
    rebotes                   int null,
    assistencias              int null,
    arremessos_Nconvertidos   int null,
    lanceslivres_Nconvertidos int null,
    constraint fk_idAtleta1
        foreign key (chaveE_idAtleta) references atleta (idAtleta),
    constraint fk_idPartida1
        foreign key (chaveE_idPartida) references partida (idPartida)
);

create table estatisticas_time
(
    chaveE_idTime                   int    null,
    ChaveE_idBasqueteEst            int    null,
    ChaveP_idEstatisticas           int auto_increment
        primary key,
    media_total_pontos              double null,
    media_arremessos_convertidos    double null,
    media_lanceslivres_convertidos  double null,
    media_faltas                    double null,
    media_tocos                     double null,
    media_rebotes                   double null,
    media_assistencias              double null,
    media_arremessos_Nconvertidos   double null,
    media_lanceslivres_Nconvertidos double null,
    constraint fk_idBasqEstt
        foreign key (ChaveE_idBasqueteEst) references estatisticasbasquete (ChaveP_idBasqueteEst),
    constraint fk_idTime1
        foreign key (chaveE_idTime) references time (idTime)
);

create table estatisticasbasquete5x5
(
    chaveE_idAtleta           int null,
    chaveE_idPartida          int null,
    ChaveP_idBasqueteEst5x5   int auto_increment
        primary key,
    total_pontos              int null,
    arremessos_convertidos    int null,
    lanceslivres_convertidos  int null,
    faltas                    int null,
    tocos                     int null,
    rebotes                   int null,
    assistencias              int null,
    arremessos_Nconvertidos   int null,
    lanceslivres_Nconvertidos int null,
    arremessos3_convertidos   int null,
    arremessos3_Nconvertidos  int null,
    constraint fk_idAtleta2
        foreign key (chaveE_idAtleta) references atleta (idAtleta),
    constraint fk_idPartida2
        foreign key (chaveE_idPartida) references partida (idPartida)
);

create table estatisticas_time5x5
(
    chaveE_idTime                   int    null,
    ChaveE_idBasqueteEst5x5         int    null,
    ChaveP_idEstatisticas5x5        int auto_increment
        primary key,
    media_total_pontos              double null,
    media_arremessos_convertidos    double null,
    media_lanceslivres_convertidos  double null,
    media_faltas                    double null,
    media_tocos                     double null,
    media_rebotes                   double null,
    media_assistencias              double null,
    media_arremessos_Nconvertidos   double null,
    media_lanceslivres_Nconvertidos double null,
    media_arrmessos3_convertidos    double null,
    media_arrmessos3_Nconvertidos   double null,
    constraint fk_idBasqEstt5x5
        foreign key (ChaveE_idBasqueteEst5x5) references estatisticasbasquete5x5 (ChaveP_idBasqueteEst5x5),
    constraint fk_idTime2
        foreign key (chaveE_idTime) references time (idTime)
);


