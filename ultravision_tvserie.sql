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
-- Table structure for table `tvserie`
--

DROP TABLE IF EXISTS `tvserie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tvserie` (
  `idTvSerie` int(11) NOT NULL AUTO_INCREMENT,
  `MediaName` varchar(45) NOT NULL,
  `MediaType` varchar(45) NOT NULL,
  `Format` varchar(45) NOT NULL,
  `Year` int(11) NOT NULL,
  `Genre` varchar(45) NOT NULL,
  `Description` varchar(45) DEFAULT NULL,
  `ArrivalDate` varchar(45) NOT NULL,
  `Rate` int(11) DEFAULT NULL,
  `Director` varchar(45) DEFAULT NULL,
  `TvStudio` varchar(45) DEFAULT NULL,
  `Season` varchar(45) DEFAULT NULL,
  `EpisodeNumber` int(11) DEFAULT NULL,
  `Avaiability` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`idTvSerie`),
  UNIQUE KEY `idTvSerie_UNIQUE` (`idTvSerie`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tvserie`
--

LOCK TABLES `tvserie` WRITE;
/*!40000 ALTER TABLE `tvserie` DISABLE KEYS */;
INSERT INTO `tvserie` VALUES (1,'x','x','x',1,'x','x','1',1,'x','x','1',1,NULL),(2,'Game of Thrones','TV','DVD',2001,'Action','The batle of the Seven Kingdons','21/01/2001',8,'Cris Pane','HB0','8',67,NULL),(3,'The Walkind Dead','TV Box Set        ','Cd,Blue-Ray                               ',2001,'Horror','Zumbi Apocalypse','23232001',8,'Chon Lee','Fox','10',100,'Avaiable');
/*!40000 ALTER TABLE `tvserie` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-11 22:23:15
