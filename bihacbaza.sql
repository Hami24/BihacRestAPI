-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 15, 2018 at 05:36 PM
-- Server version: 5.7.14
-- PHP Version: 7.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bihacbaza`
--

-- --------------------------------------------------------

--
-- Table structure for table `restorani`
--

CREATE TABLE `restorani` (
  `id_restorana` int(11) NOT NULL,
  `adresa` varchar(255) COLLATE utf8_croatian_ci DEFAULT NULL,
  `broj_telefona` varchar(255) COLLATE utf8_croatian_ci DEFAULT NULL,
  `geografska_duzina` double DEFAULT NULL,
  `geografska_sirina` double DEFAULT NULL,
  `naziv_restorana` varchar(255) COLLATE utf8_croatian_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

--
-- Dumping data for table `restorani`
--

INSERT INTO `restorani` (`id_restorana`, `adresa`, `broj_telefona`, `geografska_duzina`, `geografska_sirina`, `naziv_restorana`) VALUES
(1, 'Džemala Bijedića 12, Bihać 77000', '037 310-014', 15.873688399999992, 44.81317, 'Restoran River Una'),
(2, 'Ulica 502. viteške brdske brigade, Bihać 77000', '037 221-238', 15.872494500000016, 44.8094932, 'Čardak na Uni'),
(3, 'Bosanska, Bihać 77000', '037 223-380', 15.868841400000065, 44.8146884, 'Restoran Sofra'),
(4, 'Dr. Irfana Ljubijankića 43, Bihać 77000', '061 972 189', 15.863324000000034, 44.81907169999999, 'Restoran Anber');

-- --------------------------------------------------------

--
-- Table structure for table `sportski_centri`
--

CREATE TABLE `sportski_centri` (
  `id` int(11) NOT NULL,
  `adresa` varchar(255) DEFAULT NULL,
  `broj_telefona` varchar(255) DEFAULT NULL,
  `geografska_duzina` double DEFAULT NULL,
  `geografska_sirina` double DEFAULT NULL,
  `naziv_centra` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sportski_centri`
--

INSERT INTO `sportski_centri` (`id`, `adresa`, `broj_telefona`, `geografska_duzina`, `geografska_sirina`, `naziv_centra`) VALUES
(1, '502. viteske brigade, Bihac 77000', '037 223-488', 15.872494500000016, 44.8094932, 'Stens'),
(2, 'Mirze Delibasica, Bihac 77000', '037 222-280', 15.862689600000067, 44.80858569999999, 'Dvorana Luke');

-- --------------------------------------------------------

--
-- Table structure for table `znamenitosti`
--

CREATE TABLE `znamenitosti` (
  `id` int(11) NOT NULL,
  `adresa` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  `geografska_duzina` double DEFAULT NULL,
  `geografska_sirina` double DEFAULT NULL,
  `naziv` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  `slika` varchar(255) CHARACTER SET latin1 DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

--
-- Dumping data for table `znamenitosti`
--

INSERT INTO `znamenitosti` (`id`, `adresa`, `geografska_duzina`, `geografska_sirina`, `naziv`, `slika`) VALUES
(1, 'Trg Dzemaludina Causevica, Bihac 77000', 15.869638799999962, 44.8161566, 'Dzamija Fethija', 'https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/D%C5%BEamija_Fethija_%2830._4._2017._-_16-57%29.jpg/800px-D%C5%BEamija_Fethija_%2830._4._2017._-_16-57%29.jpg'),
(2, 'Petog korpusa 2, Bihac 77000', 15.865470500000015, 44.8074163, 'Muzej Prvog zasjedanja AVNOJ-a', 'https://lh3.googleusercontent.com/p/AF1QipNTiULPKkPIB11nPSkG17SL28T_EyR3eJwUZU4t=s1600-w600'),
(3, 'Trg Dzemaludina Causevica, Bihac 77000', 15.869638799999962, 44.8161566, 'Dzamija Fethija', 'https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/D%C5%BEamija_Fethija_%2830._4._2017._-_16-57%29.jpg/800px-D%C5%BEamija_Fethija_%2830._4._2017._-_16-57%29.jpg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `restorani`
--
ALTER TABLE `restorani`
  ADD PRIMARY KEY (`id_restorana`);

--
-- Indexes for table `sportski_centri`
--
ALTER TABLE `sportski_centri`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `znamenitosti`
--
ALTER TABLE `znamenitosti`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `sportski_centri`
--
ALTER TABLE `sportski_centri`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `znamenitosti`
--
ALTER TABLE `znamenitosti`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
