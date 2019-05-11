-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: ultravision
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `customer` (
  `idCustomer` int(11) NOT NULL AUTO_INCREMENT,
  `MembershipCard` int(11) DEFAULT NULL,
  `PlanType` varchar(45) NOT NULL,
  `Points` int(11) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Surname` varchar(45) DEFAULT NULL,
  `Phone` varchar(45) DEFAULT NULL,
  `Gender` varchar(45) DEFAULT NULL,
  `RentalS` varchar(45) DEFAULT NULL,
  `FreeRental` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idCustomer`),
  UNIQUE KEY `MembershipCard_UNIQUE` (`MembershipCard`)
) ENGINE=InnoDB AUTO_INCREMENT=44444467 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,1,'Premium',10,'jadymartins@gmail.com','Jady','Martins','873356789','F','OFFRENTAL','0'),(4,2,'ML',10,'fernando@gmail.com','Fernando','Salles','3530897788','M','OFF','1'),(44444448,5,'TV',10,'larissa@gmail.com','Larissa','Roseno','0877778899','F','OFF','0'),(44444449,NULL,'MusicLovers (ML)',10,'priscilasoares@gmail.com','Priscila','Soares','0873390282','F','OFF','false'),(44444450,NULL,'TvLover (TV)',0,'jadymartins@gmail.com','Jady','Martins','088997766','F','OFF','false'),(44444451,NULL,' PREMIUM (PR)',0,'jadymartins@gmail.com','Leandro','Martins','088997766','M','OFF','false'),(44444452,123,' PREMIUM (PR)',0,'marielza@gmail.com','Marielza','Lucides','09988990','F','OFF','false'),(44444460,1234,'MusicLovers (ML)',0,'fernandosouza@gmail.com','Fernando','Souza','22990000','M','OFF','false'),(44444461,12345,' PREMIUM (PR)',0,'igor@gmail.com','Igor','Braga','0987788','M','OFF','false'),(44444462,2323,'MusicLovers (ML)',0,'lucaspereira@gmail.com','Lucas','Pereira','38883377','M','OFF','false'),(44444464,1111111,'TvLover (TV)',0,'kamil@gmail.com','Kamil','Oleies','23338899','m','off','false'),(44444465,121212,'VideoLovers (VL)',0,'reinaldo@gmail.com','Reinaldo','Costa','0099887766','M','OFFRental','false'),(44444466,123456789,'MusicLovers (ML)',0,'mauro@gmail.com','Mauro','Pereira','77886655','M','OFF','null');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-11 22:23:12
