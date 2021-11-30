-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        10.6.5-MariaDB - mariadb.org binary distribution
-- 서버 OS:                        Win64
-- HeidiSQL 버전:                  11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- 테이블 kakaoweb.movie_mst 구조 내보내기
DROP TABLE IF EXISTS `movie_mst`;
CREATE TABLE IF NOT EXISTS `movie_mst` (
  `mov_idn` int(20) NOT NULL,
  `mov_photo` varchar(1000) DEFAULT NULL,
  `mov_title` varchar(100) DEFAULT NULL,
  `mov_release` date DEFAULT NULL,
  `mov_viewCnt` int(20) DEFAULT NULL,
  `mov_gnr` int(20) DEFAULT NULL,
  `mov_rat` float DEFAULT NULL,
  `mov_rat_cnt` int(20) DEFAULT NULL,
  `mov_lik` int(10) DEFAULT NULL,
  `mov_lik_cnt` int(11) DEFAULT NULL,
  `mov_gnr_idn` int(20) DEFAULT NULL,
  `mov_cht_idn` int(20) DEFAULT NULL,
  `mov_viw_list_idn` int(20) DEFAULT NULL,
  `number` int(100) DEFAULT NULL,
  PRIMARY KEY (`mov_idn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- 테이블 데이터 kakaoweb.movie_mst:~3 rows (대략적) 내보내기
DELETE FROM `movie_mst`;
/*!40000 ALTER TABLE `movie_mst` DISABLE KEYS */;
INSERT INTO `movie_mst` (`mov_idn`, `mov_photo`, `mov_title`, `mov_release`, `mov_viewCnt`, `mov_gnr`, `mov_rat`, `mov_rat_cnt`, `mov_lik`, `mov_lik_cnt`, `mov_gnr_idn`, `mov_cht_idn`, `mov_viw_list_idn`, `number`) VALUES
	(1, 'eternals.jpg', 'eternals', '2021-11-03', 15, 1, 9.1, 9, 1, 18, 1, 1, 1, 1),
	(2, 'dune.jpg', 'dune', '2021-10-20', 24, 1, 7.6, 9, 1, 12, 1, 1, 1, 1),
	(3, 'noTimeToDie.jpg', 'noTimeToDie', '2021-09-29', 8, 1, 5.4, 9, 1, 25, 1, 1, 1, 1);
/*!40000 ALTER TABLE `movie_mst` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
