-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.15


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema sellersdb
--

CREATE DATABASE IF NOT EXISTS sellersdb;
USE sellersdb;

--
-- Definition of table `seller`
--

DROP TABLE IF EXISTS `seller`;
CREATE TABLE `seller` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `rating` int(11) NOT NULL,
  `review` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `seller`
--

/*!40000 ALTER TABLE `seller` DISABLE KEYS */;
INSERT INTO `seller` (`id`,`name`,`rating`,`review`) VALUES 
 (1,'John Doe',5,'Great product! Highly recommended.'),
 (2,'Jane Smith',3,'The product is okay, but there is room for improvement.'),
 (3,'Alice Johnson',5,'Absolutely fantastic! Exceeded my expectations.'),
 (4,'Bob Brown',4,'Good value for money.'),
 (5,'Emily Clark',5,'Excellent service and product quality.'),
 (6,'David Wilson',3,'Not satisfied, the product didn’t meet my expectations.'),
 (7,'Sophia Martinez',4,'Pretty good, but could be better.'),
 (8,'James Taylor',4,'Decent product, but I found a few issues.'),
 (9,'Olivia Lee',5,'Perfect! Couldn’t ask for more.'),
 (10,'William Harris',5,'Great product, will buy again.'),
 (11,'Ava Young',4,'It’s okay, but I’m not fully convinced.'),
 (12,'Michael Anderson',2,'Disappointed, it didn’t work as expected.'),
 (13,'Isabella King',5,'Loved it! High quality and worth the price.'),
 (14,'Benjamin Wright',3,'It’s average, nothing special.'),
 (15,'Mia Scott',4,'Good, but not perfect.'),
 (16,'Alexander Turner',5,'Very satisfied with my purchase.'),
 (17,'Charlotte Perez',4,'Solid product, works as advertised.'),
 (18,'Daniel Thomas',2,'Terrible experience, I want a refund.'),
 (19,'Amelia Baker',5,'Outstanding! Highly recommended.'),
 (20,'Matthew Carter',3,'Not bad, but could use some improvements.'),
 (21,'Harper Phillips',4,'Good quality, I’m happy with it.'),
 (22,'Elijah Collins',3,'Below expectations, not very impressed.'),
 (23,'Evelyn Hill',4,'Very good, but there’s some room for improvement.'),
 (24,'Mason Mitchell',5,'Nearly perfect, very pleased.'),
 (25,'Abigail Campbell',4,'It’s okay, but there are better options out there.'),
 (26,'Lucas Roberts',4,'Works well, no major complaints.'),
 (27,'Sofia Rodriguez',5,'Top-notch! Exceeded all expectations.'),
 (28,'Henry Lewis',4,'Good, but could be improved in some areas.'),
 (29,'Ella Walker',5,'Very pleased with the product and service.'),
 (30,'Jackson Hall',2,'Not worth the money, quite disappointing.');
/*!40000 ALTER TABLE `seller` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`,`password`,`username`) VALUES 
 (1,'user1','user1@gmail.com'),
 (2,'user2','user2@gmail.com');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
