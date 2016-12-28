/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50627
 Source Host           : localhost
 Source Database       : mydb

 Target Server Type    : MySQL
 Target Server Version : 50627
 File Encoding         : utf-8

 Date: 11/22/2015 22:34:06 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `T_User`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '流水号',
  `name` varchar(64) NOT NULL DEFAULT '' COMMENT '姓名',
  `sex` enum('-1','0','1') NOT NULL DEFAULT '0' COMMENT '性别(-1女，0保密，1男)',
  `birthday` timestamp NULL DEFAULT NULL COMMENT '生日',
  `age` tinyint(3) DEFAULT '0' COMMENT '年龄',
  `salary` int(6) DEFAULT '0' COMMENT '工资',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_user_name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

SET FOREIGN_KEY_CHECKS = 1;
