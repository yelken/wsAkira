CREATE TABLE PONTOS(
	id integer auto_increment,
	latitude double NOT NULL,
	longitude double NOT NULL,
	CONSTRAINT PONTOS_ACESSIBILIDADE_pk PRIMARY KEY(id)
);

CREATE TABLE TIPO_PROBLEMA(
	id integer auto_increment,
	descricao VARCHAR(30),
	CONSTRAINT TIPO_PROBLEMA_pk PRIMARY KEY(id)
);

CREATE TABLE AVALIACAO_PONTOS(
	id integer auto_increment,
	latitude double,
	longitude double,
	tipo_problemaId integer,
	nome VARCHAR(30),
	CONSTRAINT AVALIACAO_LOCAIS_pk PRIMARY KEY(id),
	CONSTRAINT AVALIACAO_LOCAIS_fk FOREIGN KEY (tipo_problemaId) REFERENCES TIPO_PROBLEMA(id)
);

CREATE TABLE USUARIO(
	id INTEGER,
	usuario VARCHAR(30),
	senha VARCHAR(30),
	nome VARCHAR(30),
	url_facebook VARCHAR(254),
	CONSTRAINT TIPO_PROBLEMA_pk PRIMARY KEY(id)
);