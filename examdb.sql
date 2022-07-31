-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 12, 2019 at 01:02 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `examdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `candidate_registration`
--

CREATE TABLE `candidate_registration` (
  `Roll_No` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Fathers_Name` varchar(50) NOT NULL,
  `Date_of_Birth` varchar(30) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Department` varchar(50) NOT NULL,
  `Course` varchar(50) NOT NULL,
  `Semester` int(11) NOT NULL,
  `Email_Id` varchar(100) NOT NULL,
  `Mobile_No` varchar(15) NOT NULL,
  `Address` varchar(200) NOT NULL,
  `Profile_Pic_Path` varchar(200) NOT NULL,
  `Date_of_Registration` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `candidate_registration`
--

INSERT INTO `candidate_registration` (`Roll_No`, `Name`, `Fathers_Name`, `Date_of_Birth`, `Gender`, `Department`, `Course`, `Semester`, `Email_Id`, `Mobile_No`, `Address`, `Profile_Pic_Path`, `Date_of_Registration`) VALUES
(7, 'pranjali', 'ajit', '2019-08-10', 'female', '3', '2', 2, 'pranajlisingh74217@gamil.com', '2345', 'xzfd', '43222-7-119-51.jpg', '2-7-119 14:20:51'),
(8, 'pranjali', 'ajit', '2019-08-01', 'female', '2', '5', 3, 'pranajlisingh74217@gamil.com', '1234324', 'asfdg', '48512-7-119-9.jpg', '2-7-119 14:35:9'),
(13, 'Pranjali Singh', 'Ajit Singh', '2019-08-09', 'female', '3', '1', 5, 'pranajlisingh74217@gamil.com', '8318988680', 'assddfgg', 'adlogo6489-7-119-19.jpeg', '9-7-119 5:25:19');

-- --------------------------------------------------------

--
-- Table structure for table `qp`
--

CREATE TABLE `qp` (
  `QN` int(2) NOT NULL,
  `Question` varchar(500) NOT NULL,
  `A` varchar(500) NOT NULL,
  `B` varchar(500) NOT NULL,
  `C` varchar(500) NOT NULL,
  `D` varchar(500) NOT NULL,
  `Answer` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `qp`
--

INSERT INTO `qp` (`QN`, `Question`, `A`, `B`, `C`, `D`, `Answer`) VALUES
(6, 'Which of the following in not OOPS concept in java?', 'Inheritance', 'Encapsulation', 'Polymorphism', 'Compilation', 'D'),
(7, 'Which of the following is a type of polymorphism in Java?', 'Compile time Polymorphism', 'Execution time polymorphism', 'Multiple Polymorphism', 'Multilevel Polymorphism', 'A'),
(8, 'When does method overloading is determined?', 'At run time', 'At compile time', 'At coding time', 'At execution time', 'B'),
(9, 'Can you help me with a thousand rupees ?', 'Interrogative', 'Negative', 'Complex', 'Compound', 'A'),
(10, 'Object-oriented inheritance model is the', '\"is a kind of\" relationship', '\"has a\"relationship', '\"Want to be\"relationship', '\"contains\" of a relationship', 'A'),
(11, 'In object-oriented programming ,new classes can be defined by extending existing classes.This is an example of:', 'Encapsulation', 'Interface', 'Composition', 'Aggregation', 'D'),
(12, 'WWW stands for?', 'World Whole Web', 'Wide World Web', 'Web World Wide', 'World Wide Web', 'D'),
(13, 'Which among following first generation of computers had?', 'Vaccum Tubes and Magnetic Drum', 'IC', 'Magnetic Tape & Transisitors', 'All of the Above', 'A'),
(14, 'Where is the RAM located?', 'Expansion Board', 'External Drive', 'Mother Board', 'All of the above', 'C'),
(15, 'If a computer has more than one processor then it is known as?', 'Uniprocess', 'Multiprocessor', 'Multithreaded', 'Multiprogramming', 'B'),
(16, 'If a computer provides database services to other , then it will be known as?', 'Web Server', 'Application Server', 'Database Server', 'FTP Server', 'C'),
(17, 'Full form of URL is?', 'Uniform Resource Locator', 'Unifrom Resource Link', 'Uniform Registered Link', 'Unified Resource Link', 'A'),
(18, 'In which of the following form,data is stored in computer?', 'Decimal', 'Binary', 'HexaDecimal', 'Octal', 'B'),
(19, 'Where are saved files stored in computer?', 'RAM', 'Hard Disk', 'Cache', 'Any of the above', 'B'),
(20, 'USB is which type of storage device?', 'Primary', 'Secondary', 'Tertiary', 'None of Above', 'C'),
(21, 'What is the full form of SMPS?', 'Switch Mode Power Supply', 'Simple Mode Power Supply', 'Storage Mode Power Supply', 'Storage Mode Power Shortage', 'A'),
(22, 'Which is the odd one?', 'Inkjet Printers', 'CRT', 'Laser Printers', 'Dot Matrix Printers', 'B'),
(23, 'IP Address version 4 is in which format?', '4 bit', '8 bit', '16 bit', '32 bit', 'D'),
(24, 'ARP stands for?', 'Address Reverse Protocol', 'Address Resolution Protocol', 'Address Representation Protocol', 'Address Recording Protocol', 'B'),
(25, 'Who invented c++?', 'Steve Jobs', 'James Gosling', 'Bjarne Stroustrup', 'Dennis Ritchie', 'C');

-- --------------------------------------------------------

--
-- Table structure for table `res`
--

CREATE TABLE `res` (
  `ID` varchar(10) NOT NULL,
  `obtain` varchar(3) NOT NULL,
  `incorrect` varchar(3) NOT NULL,
  `total` varchar(3) NOT NULL,
  `answer` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `res`
--

INSERT INTO `res` (`ID`, `obtain`, `incorrect`, `total`, `answer`) VALUES
('13', '1', '19', '20', 'CCnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull'),
('13', '1', '19', '20', 'CBnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull'),
('13', '2', '18', '20', 'CAnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull'),
('13', '1', '19', '20', 'CBnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull'),
('13', '2', '18', '20', 'CAnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull'),
('13', '2', '18', '20', 'CAnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull'),
('13', '2', '18', '20', 'CAnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull');

-- --------------------------------------------------------

--
-- Table structure for table `result`
--

CREATE TABLE `result` (
  `I` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_enquiry`
--

CREATE TABLE `tbl_enquiry` (
  `EnquiryId` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Email_Id` varchar(100) NOT NULL,
  `Mobile_No` varchar(15) NOT NULL,
  `Message` varchar(500) NOT NULL,
  `EnquiryDT` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_enquiry`
--

INSERT INTO `tbl_enquiry` (`EnquiryId`, `Name`, `Email_Id`, `Mobile_No`, `Message`, `EnquiryDT`) VALUES
(1, 'pranjali', 'pranajlisingh74217@gmail.com', '7348545924', 'hii', '3/7/119-20:15:6'),
(2, 'pranjali', 'pranajlisingh74217@gmail.com', '8318988680', 'hii', '7/7/119-21:31:15'),
(3, '', '', '', '', '8/7/119-0:24:34'),
(4, '', '', '', 'assad', '8/7/119-0:37:25'),
(5, '', '', '', 'as', '8/7/119-0:38:21'),
(6, 'pranjali', 'pranajlisingh74217@gmail.com', '8318986789', 'how r u?', '10/7/119-18:48:50');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_feedback`
--

CREATE TABLE `tbl_feedback` (
  `FeedbackId` int(11) NOT NULL,
  `Topic` varchar(200) NOT NULL,
  `Message` varchar(500) NOT NULL,
  `SubmittedBy` int(11) NOT NULL,
  `StarRating` int(11) NOT NULL,
  `SubmittedOn` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_feedback`
--

INSERT INTO `tbl_feedback` (`FeedbackId`, `Topic`, `Message`, `SubmittedBy`, `StarRating`, `SubmittedOn`) VALUES
(2, 'PORTAL', 'NICE ! INTERFACE, EASY TO USE..', 11, 5, '6/7/119-4:5:57'),
(4, 'efficiency', 'it is an efficient portal', 13, 5, '11/7/119-20:47:28'),
(5, '', '', 13, 3, '11/7/119-22:30:26'),
(6, '', '', 13, 3, '11/7/119-22:30:40');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_login`
--

CREATE TABLE `tbl_login` (
  `UserId` int(11) NOT NULL,
  `Pass` varchar(50) NOT NULL,
  `Utype` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_login`
--

INSERT INTO `tbl_login` (`UserId`, `Pass`, `Utype`) VALUES
(0, '\"+Pass+\"', '0'),
(7, 'ZHWHZ', '0'),
(9, 'ZYX', 'USER'),
(10, 'KIZMQZOR876', 'USER'),
(11, 'k876', 'USER'),
(12, 'KIZMQZOR876', 'USER'),
(13, 'KIZMQZOR876', 'USER'),
(2065, '0', 'ADMIN');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_notification`
--

CREATE TABLE `tbl_notification` (
  `Notification_Id` int(11) NOT NULL,
  `Notification_Msg` varchar(200) NOT NULL,
  `Notification_DT` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_notification`
--

INSERT INTO `tbl_notification` (`Notification_Id`, `Notification_Msg`, `Notification_DT`) VALUES
(1, 'Online Exam Dates are announced for B.tech Odd Semester students.', '25-07-2019'),
(2, 'Admit Cards UG Entrance Examination of Agriculture Faculty 2019 is available Now.', '29-07-2019');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `candidate_registration`
--
ALTER TABLE `candidate_registration`
  ADD PRIMARY KEY (`Roll_No`);

--
-- Indexes for table `qp`
--
ALTER TABLE `qp`
  ADD PRIMARY KEY (`QN`);

--
-- Indexes for table `tbl_enquiry`
--
ALTER TABLE `tbl_enquiry`
  ADD PRIMARY KEY (`EnquiryId`);

--
-- Indexes for table `tbl_feedback`
--
ALTER TABLE `tbl_feedback`
  ADD PRIMARY KEY (`FeedbackId`);

--
-- Indexes for table `tbl_login`
--
ALTER TABLE `tbl_login`
  ADD PRIMARY KEY (`UserId`);

--
-- Indexes for table `tbl_notification`
--
ALTER TABLE `tbl_notification`
  ADD PRIMARY KEY (`Notification_Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `candidate_registration`
--
ALTER TABLE `candidate_registration`
  MODIFY `Roll_No` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `qp`
--
ALTER TABLE `qp`
  MODIFY `QN` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `tbl_enquiry`
--
ALTER TABLE `tbl_enquiry`
  MODIFY `EnquiryId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tbl_feedback`
--
ALTER TABLE `tbl_feedback`
  MODIFY `FeedbackId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tbl_notification`
--
ALTER TABLE `tbl_notification`
  MODIFY `Notification_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
