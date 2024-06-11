-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Categorias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Categorias` (
  `idCategorias` INT NOT NULL AUTO_INCREMENT,
  `Descrica` VARCHAR(45) NULL,
  PRIMARY KEY (`idCategorias`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Produtos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Produtos` (
  `idProdutos` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `descricao` VARCHAR(45) NULL,
  `preco` DECIMAL(7,2) NULL,
  `Categorias_idCategorias` INT NOT NULL,
  PRIMARY KEY (`idProdutos`, `Categorias_idCategorias`),
  INDEX `fk_Produtos_Categorias_idx` (`Categorias_idCategorias` ASC),
  CONSTRAINT `fk_Produtos_Categorias`
    FOREIGN KEY (`Categorias_idCategorias`)
    REFERENCES `mydb`.`Categorias` (`idCategorias`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Clientes` (
  `idClientes` INT NOT NULL,
  `email` VARCHAR(45) NULL,
  `cpf` VARCHAR(45) NULL,
  `nome` VARCHAR(45) NULL,
  `telefone` VARCHAR(45) NULL,
  PRIMARY KEY (`idClientes`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`notafiscal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`notafiscal` (
  `idnotafiscal` INT NOT NULL AUTO_INCREMENT,
  `data` VARCHAR(45) NULL,
  `total` VARCHAR(45) NULL,
  PRIMARY KEY (`idnotafiscal`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Pedidos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Pedidos` (
  `idPedidos` INT NOT NULL AUTO_INCREMENT,
  `notafiscal_idnotafiscal` INT NOT NULL,
  `Produtos_idProdutos` INT NOT NULL,
  `Produtos_Categorias_idCategorias` INT NOT NULL,
  `Clientes_idClientes` INT NOT NULL,
  PRIMARY KEY (`idPedidos`, `notafiscal_idnotafiscal`, `Produtos_idProdutos`, `Produtos_Categorias_idCategorias`, `Clientes_idClientes`),
  INDEX `fk_Pedidos_notafiscal1_idx` (`notafiscal_idnotafiscal` ASC),
  INDEX `fk_Pedidos_Produtos1_idx` (`Produtos_idProdutos` ASC, `Produtos_Categorias_idCategorias` ASC),
  INDEX `fk_Pedidos_Clientes1_idx` (`Clientes_idClientes` ASC),
  CONSTRAINT `fk_Pedidos_notafiscal1`
    FOREIGN KEY (`notafiscal_idnotafiscal`)
    REFERENCES `mydb`.`notafiscal` (`idnotafiscal`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pedidos_Produtos1`
    FOREIGN KEY (`Produtos_idProdutos` , `Produtos_Categorias_idCategorias`)
    REFERENCES `mydb`.`Produtos` (`idProdutos` , `Categorias_idCategorias`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pedidos_Clientes1`
    FOREIGN KEY (`Clientes_idClientes`)
    REFERENCES `mydb`.`Clientes` (`idClientes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;