SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

DROP SCHEMA IF EXISTS `tcc` ;
CREATE SCHEMA IF NOT EXISTS `tcc` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
USE `tcc` ;

-- -----------------------------------------------------
-- Table `tcc`.`usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tcc`.`usuario` ;

CREATE  TABLE IF NOT EXISTS `tcc`.`usuario` (
  `id_usuario` INT NOT NULL ,
  `login_user` VARCHAR(45) NOT NULL ,
  `senha_user` VARCHAR(45) NOT NULL ,
  `nome` VARCHAR(45) NOT NULL ,
  `universidade` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`id_usuario`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `tcc`.`projeto`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tcc`.`projeto` ;

CREATE  TABLE IF NOT EXISTS `tcc`.`projeto` (
  `id_projeto` INT NOT NULL ,
  `data_projeto` DATE NOT NULL ,
  `nom_projeto` VARCHAR(45) NOT NULL ,
  `usuario_id_usuario` INT NOT NULL ,
  PRIMARY KEY (`id_projeto`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `tcc`.`acompanhamento`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tcc`.`acompanhamento` ;

CREATE  TABLE IF NOT EXISTS `tcc`.`acompanhamento` (
  `id_acompanhamento` INT NOT NULL ,
  `data_acompanhamento` VARCHAR(45) NOT NULL ,
  `txt_acompanhamento` VARCHAR(45) NOT NULL ,
  `projeto_id_projeto` INT NOT NULL ,
  PRIMARY KEY (`id_acompanhamento`, `projeto_id_projeto`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `tcc`.`situacao`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tcc`.`situacao` ;

CREATE  TABLE IF NOT EXISTS `tcc`.`situacao` (
  `id_situacao` INT NOT NULL ,
  `des_situacao` VARCHAR(45) NOT NULL ,
  `acompanhamento_id_acompanhamento` INT NOT NULL ,
  PRIMARY KEY (`id_situacao`, `acompanhamento_id_acompanhamento`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `tcc`.`tipo_categoria`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tcc`.`tipo_categoria` ;

CREATE  TABLE IF NOT EXISTS `tcc`.`tipo_categoria` (
  `id_tipo_categoria` INT NOT NULL ,
  `nom_tipo_categoria` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`id_tipo_categoria`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `tcc`.`categoria`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tcc`.`categoria` ;

CREATE  TABLE IF NOT EXISTS `tcc`.`categoria` (
  `id_categoria` INT NOT NULL ,
  `txt_categoria` VARCHAR(45) NOT NULL ,
  `tipo_categoria_id_tipo_categoria` INT NOT NULL ,
  PRIMARY KEY (`id_categoria`, `tipo_categoria_id_tipo_categoria`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `tcc`.`projeto_has_categoria`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tcc`.`projeto_has_categoria` ;

CREATE  TABLE IF NOT EXISTS `tcc`.`projeto_has_categoria` (
  `projeto_id_projeto` INT NOT NULL ,
  `categoria_id_categoria` INT NOT NULL ,
  PRIMARY KEY (`projeto_id_projeto`, `categoria_id_categoria`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Placeholder table for view `tcc`.`view1`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tcc`.`view1` (`id` INT);

-- -----------------------------------------------------
-- Placeholder table for view `tcc`.`view2`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tcc`.`view2` (`id` INT);

-- -----------------------------------------------------
-- procedure routine1
-- -----------------------------------------------------

USE `tcc`;
DROP procedure IF EXISTS `tcc`.`routine1`;

DELIMITER $$
USE `tcc`$$
CREATE PROCEDURE `tcc`.`routine1` ()
BEGIN

END$$

DELIMITER ;

-- -----------------------------------------------------
-- View `tcc`.`view1`
-- -----------------------------------------------------
DROP VIEW IF EXISTS `tcc`.`view1` ;
DROP TABLE IF EXISTS `tcc`.`view1`;
USE `tcc`;
;

-- -----------------------------------------------------
-- View `tcc`.`view2`
-- -----------------------------------------------------
DROP VIEW IF EXISTS `tcc`.`view2` ;
DROP TABLE IF EXISTS `tcc`.`view2`;
USE `tcc`;
;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;