-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 14, 2020 at 10:30 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quizdatabase`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_admin`
--

CREATE TABLE `admin_admin` (
  `admin_username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `admin_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin_admin`
--

INSERT INTO `admin_admin` (`admin_username`, `password`, `admin_id`) VALUES
('moktan', 'wangchhu', 1);

-- --------------------------------------------------------

--
-- Table structure for table `questions`
--

CREATE TABLE `questions` (
  `question_id` int(11) NOT NULL,
  `subject` varchar(50) NOT NULL,
  `Set_code` varchar(10) NOT NULL,
  `Questions` varchar(100) NOT NULL,
  `Answer` varchar(50) NOT NULL,
  `Option1` varchar(50) NOT NULL,
  `Option2` varchar(50) NOT NULL,
  `Option3` varchar(50) NOT NULL,
  `Option4` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `questions`
--

INSERT INTO `questions` (`question_id`, `subject`, `Set_code`, `Questions`, `Answer`, `Option1`, `Option2`, `Option3`, `Option4`) VALUES
(1, 'Java', 'A', 'what is java?', ' alter PL', 'alter PL', 'butler', 'hitler', 'dealer'),
(2, 'web', 'A', 'what is web?', 'spidernet', 'spidernet', 'internet', '.net', 'labairichet'),
(4, 'Java', 'A', 'Which class is available to all the class automati', 'object', 'swing', 'applet', 'object', 'actionevent'),
(5, 'Java', 'A', 'Which one among these is not a primitive datatype?', 'float', 'int', 'float', 'boolean', 'char'),
(10, 'Java', 'A', 'String class is defined in which package?', 'lang', 'lang', 'swing', 'applet', 'awt'),
(12, 'java', 'A', 'Which institute is best for java coaching?', 'SSS IT', 'Utek', 'Aptech', 'SSS IT', 'JTek'),
(13, 'java', 'A', 'Which one among these is not a keyword?', 'get', 'class', 'int', 'get', 'if'),
(14, 'java', 'A', 'Which one among these is not a class?', 'ActionPerformed', 'swing', 'ActionPerformed', 'ActionEvent', 'Button'),
(15, 'java', 'A', 'which one among these is not a function of Object class?', 'getDocumentBase', 'toString', 'Finalize', 'equals', 'getDocumentBase');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `student_id` int(11) NOT NULL,
  `student_name` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`student_id`, `student_name`, `username`, `password`) VALUES
(1, 'wangchhuMoktan', 'wangchhu', 'wangchhu'),
(2, '', '', ''),
(3, 'sujal', 'sujal', 'sujal');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_admin`
--
ALTER TABLE `admin_admin`
  ADD PRIMARY KEY (`admin_id`);

--
-- Indexes for table `questions`
--
ALTER TABLE `questions`
  ADD PRIMARY KEY (`question_id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`student_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin_admin`
--
ALTER TABLE `admin_admin`
  MODIFY `admin_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `questions`
--
ALTER TABLE `questions`
  MODIFY `question_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `student_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
