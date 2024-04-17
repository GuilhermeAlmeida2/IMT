-- Active: 1713360670607@@mysql-12d63dd1-guilhermeamorimasilva-bb84.b.aivencloud.com@25549@defaultdb
CREATE TABLE tb_usuario(
    cod_usuario INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    login VARCHAR(200) NOT NULL,
    senha VARCHAR(200) NOT NULL,
    tipo INT NOT NULL
);

INSERT INTO tb_usuario(login, senha, tipo) VALUES ('admin', 'admin', 1);
INSERT INTO tb_usuario(login, senha, tipo) VALUES ('comum', 'comum', 2);

SELECT* FROM tb_usuario;
---usuário passa 
UPDATE tb_usuario SET login='Comum' WHERE cod_usuario=2;

UPDATE tb_usuario SET login = 'Admin', senha= 123456 WHERE cod_usuario= 1

DELETE FROM tb_usuario WHERE cod_usuario=1;