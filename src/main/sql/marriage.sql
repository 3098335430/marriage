/*
Navicat MySQL Data Transfer

Source Server         : marriage
Source Server Version : 50515
Source Host           : 210.29.65.96:3306
Source Database       : marriage

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2017-07-08 20:33:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for advice
-- ----------------------------
DROP TABLE IF EXISTS `advice`;
CREATE TABLE `advice` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `CaseId` int(11) DEFAULT NULL,
  `advice` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`aid`),
  KEY `CaseId` (`CaseId`),
  CONSTRAINT `advice_ibfk_1` FOREIGN KEY (`CaseId`) REFERENCES `case` (`cid`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for case
-- ----------------------------
DROP TABLE IF EXISTS `case`;
CREATE TABLE `case` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for document
-- ----------------------------
DROP TABLE IF EXISTS `document`;
CREATE TABLE `document` (
  `did` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL,
  `content` varchar(2000) DEFAULT NULL,
  `CaseId` int(11) DEFAULT NULL,
  `label` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`did`),
  KEY `CaseId` (`CaseId`),
  CONSTRAINT `document_ibfk_1` FOREIGN KEY (`CaseId`) REFERENCES `case` (`cid`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for law
-- ----------------------------
DROP TABLE IF EXISTS `law`;
CREATE TABLE `law` (
  `lid` int(11) NOT NULL AUTO_INCREMENT,
  `law` varchar(2000) DEFAULT NULL,
  `CaseId` int(11) DEFAULT NULL,
  PRIMARY KEY (`lid`),
  KEY `CaseId` (`CaseId`),
  CONSTRAINT `law_ibfk_1` FOREIGN KEY (`CaseId`) REFERENCES `case` (`cid`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for word_original
-- ----------------------------
DROP TABLE IF EXISTS `word_original`;
CREATE TABLE `word_original` (
  `wid` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL,
  `word` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`wid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for word_success
-- ----------------------------
DROP TABLE IF EXISTS `word_success`;
CREATE TABLE `word_success` (
  `wid` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL,
  `word` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`wid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
