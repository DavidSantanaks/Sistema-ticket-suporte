CREATE TABLE ticket (
    id BIGINT auto_increment PRIMARY KEY,
    cliente VARCHAR(70),
    assunto VARCHAR(70),
    descricao TEXT,
    email VARCHAR(255),
    status VARCHAR(20),
    data_abertura DATE,
    data_fechamento DATE
);