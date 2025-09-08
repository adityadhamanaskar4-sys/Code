-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 08, 2025 at 04:46 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `feemanagementdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `studentdata`
--

CREATE TABLE `studentdata` (
  `ID` char(6) DEFAULT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Mobile no.` char(10) DEFAULT NULL,
  `Email` varchar(20) DEFAULT NULL,
  `Gender` char(1) DEFAULT NULL,
  `DOB` char(10) DEFAULT NULL,
  `Age` varchar(2) DEFAULT NULL,
  `Address` varchar(300) DEFAULT NULL,
  `DOA` char(10) DEFAULT NULL,
  `Java` char(1) DEFAULT NULL,
  `DS` char(1) DEFAULT NULL,
  `AOA` char(1) DEFAULT NULL,
  `Python` char(1) DEFAULT NULL,
  `Fees` varchar(10) DEFAULT NULL,
  `Advance` varchar(10) DEFAULT NULL,
  `Payment Method` varchar(10) DEFAULT NULL,
  `Cheque no.` char(6) DEFAULT NULL,
  `Bank` varchar(20) DEFAULT NULL,
  `Balance Fees` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `studentdata`
--

INSERT INTO `studentdata` (`ID`, `Name`, `Mobile no.`, `Email`, `Gender`, `DOB`, `Age`, `Address`, `DOA`, `Java`, `DS`, `AOA`, `Python`, `Fees`, `Advance`, `Payment Method`, `Cheque no.`, `Bank`, `Balance Fees`) VALUES
('122337', 'Suresh Kumar', '8794561230', 'sk@gmail.com', 'M', '09-05-2006', '19', 'A/103,Skyline Bldg.,Dixit rd,Vileparle Mumbai-400057', '10-08-2025', '✓', '✓', '✕', '✓', '3000.0', '300', 'Cash', 'null', 'null', '2700.0'),
('122333', 'Jignesh ', '9876543210', 'jkl@gmail.com', 'M', '08-05-2003', '22', 'A/203,Kalpita soc.,Nehru rd,VileParle E Mumbai-400057', '10-08-2025', '✓', '✓', '✓', '✕', '3000.0', '2000', 'Cheque', '123456', 'ICICI', 'null');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
