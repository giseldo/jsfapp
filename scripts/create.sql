select * from usuariodelimiter $$

delimiter $$

CREATE TABLE `usuario` (
  `idusuario` int(11) unsigned NOT NULL auto_increment,
  `nome` varchar(45) default NULL,
  `senha` varchar(45) default NULL,
  `email` varchar(45) default NULL,
  `cpf` varchar(45) default NULL,
  `ativo` varchar(45) default NULL,
  `idioma` varchar(45) default NULL,
  `login` varchar(45) default NULL,
  `celular` varchar(45) default NULL,
  `nascimento` varchar(45) default NULL,
  PRIMARY KEY  (`idusuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1$$


