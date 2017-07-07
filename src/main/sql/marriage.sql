/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50067
Source Host           : localhost:3306
Source Database       : marriage

Target Server Type    : MYSQL
Target Server Version : 50067
File Encoding         : 65001

Date: 2017-06-21 14:50:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for document
-- ----------------------------
DROP TABLE IF EXISTS `document`;
CREATE TABLE `document` (
  `d_id` int(11) NOT NULL auto_increment,
  `title` varchar(50) default NULL,
  `content` varchar(200) default NULL,
  PRIMARY KEY  (`d_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL auto_increment,
  `username` varchar(50) default NULL,
  `password` varchar(100) default NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
