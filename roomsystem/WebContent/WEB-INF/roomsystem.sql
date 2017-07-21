/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50709
Source Host           : localhost:3306
Source Database       : roomsystem

Target Server Type    : MYSQL
Target Server Version : 50709
File Encoding         : 65001

Date: 2015-11-28 19:31:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for base_house_manage
-- ----------------------------
DROP TABLE IF EXISTS `base_house_manage`;
CREATE TABLE `base_house_manage` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `house_num` varchar(4) DEFAULT '',
  `building_num` varchar(2) DEFAULT '',
  `floor_num` varchar(2) DEFAULT '',
  `house_type` varchar(8) DEFAULT '',
  `house_towards` varchar(4) DEFAULT '',
  `allow_num` varchar(2) DEFAULT '',
  `water_meter` varchar(8) DEFAULT '',
  `comment` varchar(128) DEFAULT '',
  `delete_flag` varchar(8) DEFAULT '',
  `lastupdated_operator` varchar(16) DEFAULT '',
  `lastupdated_date` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of base_house_manage
-- ----------------------------

-- ----------------------------
-- Table structure for base_person_manage
-- ----------------------------
DROP TABLE IF EXISTS `base_person_manage`;
CREATE TABLE `base_person_manage` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `person_num` varchar(32) DEFAULT '',
  `name` varchar(8) DEFAULT '',
  `sex` varchar(2) DEFAULT '',
  `native_place` varchar(64) DEFAULT '',
  `work_place` varchar(32) DEFAULT '',
  `telephone` varchar(16) DEFAULT '',
  `email` varchar(32) DEFAULT '',
  `comment` varchar(128) DEFAULT '',
  `delete_flag` varchar(8) DEFAULT '',
  `lastupdated_operator` varchar(16) DEFAULT '',
  `lastupdated_date` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of base_person_manage
-- ----------------------------

-- ----------------------------
-- Table structure for base_user_manage
-- ----------------------------
DROP TABLE IF EXISTS `base_user_manage`;
CREATE TABLE `base_user_manage` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `username` varchar(8) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT '',
  `password` varchar(8) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT '',
  `authority` varchar(8) DEFAULT '',
  `nickname` varchar(16) DEFAULT '',
  `comment` varchar(128) DEFAULT '',
  `delete_flag` varchar(8) DEFAULT '',
  `lastupdated_operator` varchar(16) DEFAULT '',
  `lastupdated_date` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of base_user_manage
-- ----------------------------
INSERT INTO `base_user_manage` VALUES ('1', 'manager', 'manager', 'manager', 'manager', 'manager', '', 'manager', '2015-11-28 11:29:23');

-- ----------------------------
-- Table structure for business_live_manage
-- ----------------------------
DROP TABLE IF EXISTS `business_live_manage`;
CREATE TABLE `business_live_manage` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `person_id` varchar(8) DEFAULT '',
  `house_id` varchar(8) DEFAULT '',
  `bed_num` varchar(2) DEFAULT '',
  `enter_date` date DEFAULT NULL,
  `comment` varchar(128) DEFAULT '',
  `delete_flag` varchar(8) DEFAULT '',
  `lastupdated_operator` varchar(16) DEFAULT '',
  `lastupdated_date` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of business_live_manage
-- ----------------------------

-- ----------------------------
-- Table structure for business_payment_manage
-- ----------------------------
DROP TABLE IF EXISTS `business_payment_manage`;
CREATE TABLE `business_payment_manage` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `live_id` int(8) DEFAULT NULL,
  `pay_date` date DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `room_rent` varchar(8) DEFAULT '',
  `water_charge` varchar(4) DEFAULT '',
  `power_charge` varchar(8) DEFAULT '',
  `extra_charge` varchar(8) DEFAULT '',
  `cable_charge` varchar(8) DEFAULT '',
  `heating_charge` varchar(8) DEFAULT '',
  `total_charge` varchar(10) DEFAULT '',
  `room_deposit` varchar(8) DEFAULT '',
  `comment` varchar(128) DEFAULT '',
  `delete_flag` varchar(8) DEFAULT '',
  `lastupdated_operator` varchar(16) DEFAULT '',
  `lastupdated_date` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of business_payment_manage
-- ----------------------------
