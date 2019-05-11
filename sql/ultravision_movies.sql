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
-- Table structure for table `movies`
--

DROP TABLE IF EXISTS `movies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `movies` (
  `idMovies` int(11) NOT NULL AUTO_INCREMENT,
  `MediaTitle` varchar(45) DEFAULT NULL,
  `MediaType` varchar(45) DEFAULT NULL,
  `Format` varchar(45) DEFAULT NULL,
  `Yearr` int(11) DEFAULT NULL,
  `Genre` varchar(45) DEFAULT NULL,
  `Description` varchar(45) DEFAULT NULL,
  `ArrivalDate` varchar(45) DEFAULT NULL,
  `Rate` varchar(45) DEFAULT NULL,
  `Director` varchar(45) DEFAULT NULL,
  `Cast` varchar(45) DEFAULT NULL,
  `Classification` varchar(45) DEFAULT NULL,
  `Avaiability` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT 'Available',
  PRIMARY KEY (`idMovies`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movies`
--

LOCK TABLES `movies` WRITE;
/*!40000 ALTER TABLE `movies` DISABLE KEYS */;
INSERT INTO `movies` VALUES (1,'Titanic','Movie','Dvd,BlueRay',1998,'DRAMA','VERY GOOD DRAMA','23/02/1999','6,00£','James Cameron','Leonardo Dicaprio','18+',NULL),(2,'Lord of the Rings',' VL                                 ','DVD                  Blue-Ray                ',2001,'Action','Very good Action','22042002','8£','James Court','Elijaj Hood','16+',NULL),(3,'Ella',' VL                                 ','DVD                                          ',2018,'Drama','Very good Drama','20082019','10£','Ellis Huppet','Isabelle Huppet','18+',NULL),(4,'Shrek',' VL                                 ','DVD                                          ',2009,'Comedy','Funny movie','20052009','8£','James C','Beyonce','12+',NULL),(5,'Love Story',' VL                                 ','DVD                                          ',2013,'Romance','This is a Love story','23072008','9,00','Austin Mutty','Dakota Fenning','All free',NULL);
/*!40000 ALTER TABLE `movies` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-11 22:23:14
