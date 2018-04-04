CREATE SCHEMA `contact` ;

CREATE TABLE `contact`.`user` (
  `id_user` INT NOT NULL AUTO_INCREMENT,
  `enabled` VARCHAR(45) NOT NULL,
  `login` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `snp` VARCHAR(45) NULL,
  PRIMARY KEY (`id_user`),
  UNIQUE INDEX `iduser_UNIQUE` (`id_user` ASC));

CREATE TABLE `contact`.`contacts` (
  `id_contacts` INT NOT NULL AUTO_INCREMENT,
  `adds` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `home_number` VARCHAR(45) NULL,
  `mobile_number` VARCHAR(45) NULL,
  `name` VARCHAR(45) NULL,
  `patronymic` VARCHAR(45) NULL,
  `user_id` VARCHAR(45) NULL,
  `sur_name` VARCHAR(45) NULL,
  PRIMARY KEY (`id_contacts`));

CREATE TABLE `contact`.`roles` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `role` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));


#Test DB

CREATE SCHEMA `contacttestdb` ;

CREATE TABLE `contacttestdb`.`user` (
  `id_user` INT NOT NULL AUTO_INCREMENT,
  `login` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `enabled` INT NOT NULL,
  `snp` VARCHAR(45) NULL,
  PRIMARY KEY (`id_user`),
  UNIQUE INDEX `id_user_UNIQUE` (`id_user` ASC));
  
  CREATE TABLE `contacttestdb`.`contacts` (
    `id_contacts` INT NOT NULL AUTO_INCREMENT,
    `adds` VARCHAR(45) NULL,
    `email` VARCHAR(45) NULL,
    `phone_number` VARCHAR(45) NULL,
    `home_number` VARCHAR(45) NULL,
    `name` VARCHAR(45) NULL,
    `sur_name` VARCHAR(45) NULL,
    `patronymic` VARCHAR(45) NULL,
    `user_id` INT NULL,
    PRIMARY KEY (`id_contacts`),
    INDEX `user_id_idx` (`user_id` ASC),
    CONSTRAINT `user_id`
      FOREIGN KEY (`user_id`)
      REFERENCES `contacttestdb`.`user` (`id_user`)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);

CREATE TABLE `contacttestdb`.`roles` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NULL,
  `role` VARCHAR(255) NULL,
  PRIMARY KEY (`id`));
