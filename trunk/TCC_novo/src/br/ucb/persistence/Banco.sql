SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

DROP SCHEMA IF EXISTS `mydb` ;
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`usuario` ;

CREATE  TABLE IF NOT EXISTS `mydb`.`usuario` (
  `id_usuario` INT NOT NULL ,
  `login_user` VARCHAR(45) NOT NULL ,
  `senha_user` VARCHAR(45) NOT NULL ,
  `nome` VARCHAR(45) NOT NULL ,
  `universidade` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`id_usuario`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`projeto`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`projeto` ;

CREATE  TABLE IF NOT EXISTS `mydb`.`projeto` (
  `id_projeto` INT NOT NULL ,
  `data_projeto` DATE NOT NULL ,
  `nom_projeto` VARCHAR(45) NOT NULL ,
  `usuario_id_usuario` INT NOT NULL ,
  PRIMARY KEY (`id_projeto`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`acompanhamento`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`acompanhamento` ;

CREATE  TABLE IF NOT EXISTS `mydb`.`acompanhamento` (
  `id_acompanhamento` INT NOT NULL ,
  `data_acompanhamento` VARCHAR(45) NOT NULL ,
  `txt_acompanhamento` VARCHAR(45) NOT NULL ,
  `projeto_id_projeto` INT NOT NULL ,
  PRIMARY KEY (`id_acompanhamento`, `projeto_id_projeto`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`situacao`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`situacao` ;

CREATE  TABLE IF NOT EXISTS `mydb`.`situacao` (
  `id_situacao` INT NOT NULL ,
  `des_situacao` VARCHAR(45) NOT NULL ,
  `acompanhamento_id_acompanhamento` INT NOT NULL ,
  PRIMARY KEY (`id_situacao`, `acompanhamento_id_acompanhamento`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`tipo_categoria`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`tipo_categoria` ;

CREATE  TABLE IF NOT EXISTS `mydb`.`tipo_categoria` (
  `id_tipo_categoria` INT NOT NULL ,
  `nom_tipo_categoria` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`id_tipo_categoria`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`categoria`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`categoria` ;

CREATE  TABLE IF NOT EXISTS `mydb`.`categoria` (
  `id_categoria` INT NOT NULL ,
  `txt_categoria` VARCHAR(45) NOT NULL ,
  `tipo_categoria_id_tipo_categoria` INT NOT NULL ,
  PRIMARY KEY (`id_categoria`, `tipo_categoria_id_tipo_categoria`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`projeto_has_categoria`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`projeto_has_categoria` ;

CREATE  TABLE IF NOT EXISTS `mydb`.`projeto_has_categoria` (
  `projeto_id_projeto` INT NOT NULL ,
  `categoria_id_categoria` INT NOT NULL ,
  PRIMARY KEY (`projeto_id_projeto`, `categoria_id_categoria`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Placeholder table for view `mydb`.`view1`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`view1` (`id` INT);

-- -----------------------------------------------------
-- Placeholder table for view `mydb`.`view2`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`view2` (`id` INT);

-- -----------------------------------------------------
-- procedure routine1
-- -----------------------------------------------------

USE `mydb`;
DROP procedure IF EXISTS `mydb`.`routine1`;

DELIMITER $$
USE `mydb`$$
CREATE PROCEDURE `mydb`.`routine1` ()
BEGIN

END$$

DELIMITER ;

-- -----------------------------------------------------
-- View `mydb`.`view1`
-- -----------------------------------------------------
DROP VIEW IF EXISTS `mydb`.`view1` ;
DROP TABLE IF EXISTS `mydb`.`view1`;
USE `mydb`;
;

-- -----------------------------------------------------
-- View `mydb`.`view2`
-- -----------------------------------------------------
DROP VIEW IF EXISTS `mydb`.`view2` ;
DROP TABLE IF EXISTS `mydb`.`view2`;
USE `mydb`;
;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;