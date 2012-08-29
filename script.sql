
CREATE DATABASE `jsfapp`

CREATE  TABLE `jsfapp`.`usuario` (

  `idusuario` INT NOT NULL ,

  `nome` VARCHAR(45) NULL ,

  `senha` VARCHAR(45) NULL ,

  `email` VARCHAR(45) NULL ,

  `cpf` VARCHAR(45) NULL ,

  PRIMARY KEY (`idusuario`) );
  
  ALTER TABLE `jsfapp`.`usuario` CHANGE COLUMN `idusuario` `idusuario` INT(11) UNSIGNED NOT NULL AUTO_INCREMENT  ;

