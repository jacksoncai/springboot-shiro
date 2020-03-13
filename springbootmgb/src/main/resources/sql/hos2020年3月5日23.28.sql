/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : hos

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2020-03-05 23:28:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `department_id` int(8) NOT NULL,
  `department_name` varchar(32) NOT NULL,
  PRIMARY KEY (`department_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '住院');
INSERT INTO `department` VALUES ('2', '门诊');
INSERT INTO `department` VALUES ('3', '药库');

-- ----------------------------
-- Table structure for drug_information
-- ----------------------------
DROP TABLE IF EXISTS `drug_information`;
CREATE TABLE `drug_information` (
  `Drug_Id` varchar(32) NOT NULL,
  `Drug_Name` varchar(32) NOT NULL,
  `Drug_Type` varchar(32) NOT NULL,
  `Drug_Specification` varchar(32) NOT NULL,
  `Drug_Price` double NOT NULL,
  `Prescription_Id` varchar(32) DEFAULT NULL,
  `Numbers` int(20) DEFAULT NULL,
  PRIMARY KEY (`Drug_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of drug_information
-- ----------------------------
INSERT INTO `drug_information` VALUES ('11', '福尔马林', '药水', '广东', '170', '1', '20');
INSERT INTO `drug_information` VALUES ('12', '仙丹', '妙药', '蜗牛学院', '18', '3', '11');
INSERT INTO `drug_information` VALUES ('13', '头孢噻吩钠', '头孢菌素类', ' 西藏', '320', '2', '40');
INSERT INTO `drug_information` VALUES ('14', '利巴韦林', '丁胺卡那霉素', '北京', '150', '2', '23');
INSERT INTO `drug_information` VALUES ('15', '杜令丁', '哌替啶', '上海', '520', '3', '50');
INSERT INTO `drug_information` VALUES ('16', '　黄连素', '盐酸小襞碱', '上海', '100', '5', '25');
INSERT INTO `drug_information` VALUES ('17', '吲哚美辛', '硝酸异山梨酯', '新疆', '150', '2', '60');
INSERT INTO `drug_information` VALUES ('18', '硝苯地平', '普萘洛尔', '西安', '520', '20', '30');
INSERT INTO `drug_information` VALUES ('19', '辅酶凡', '胞磷胆碱钠', '西安', '200', '2', '30');
INSERT INTO `drug_information` VALUES ('20', '四环素', '硝苯地平', '上海', '250', '2', '70');

-- ----------------------------
-- Table structure for equipment
-- ----------------------------
DROP TABLE IF EXISTS `equipment`;
CREATE TABLE `equipment` (
  `equip_id` int(11) NOT NULL,
  `department_id` int(8) DEFAULT NULL,
  `equip_name` varchar(255) DEFAULT NULL,
  `equip_type_name` varchar(255) DEFAULT NULL,
  `equip_desc` varchar(255) DEFAULT NULL,
  `equip_storage_date` varchar(255) DEFAULT NULL,
  `equip_count` int(11) DEFAULT NULL,
  `equip_price` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`equip_id`),
  KEY `FK_Reference_1` (`department_id`),
  CONSTRAINT `FK_Reference_1` FOREIGN KEY (`department_id`) REFERENCES `department` (`department_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of equipment
-- ----------------------------
INSERT INTO `equipment` VALUES ('1', '1', '病床', '固定资产', '病人休息', '2020年3月4日10:19:04', '1000', '500.00');

-- ----------------------------
-- Table structure for equip_loss
-- ----------------------------
DROP TABLE IF EXISTS `equip_loss`;
CREATE TABLE `equip_loss` (
  `equip_loss_id` char(32) NOT NULL,
  `equip_id` int(11) DEFAULT NULL,
  `loss_desc` char(32) DEFAULT NULL,
  `reason` char(255) DEFAULT NULL,
  PRIMARY KEY (`equip_loss_id`),
  KEY `FK_Reference_2` (`equip_id`),
  CONSTRAINT `FK_Reference_2` FOREIGN KEY (`equip_id`) REFERENCES `equipment` (`equip_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of equip_loss
-- ----------------------------
INSERT INTO `equip_loss` VALUES ('1', '1', 'zhagndeshui\r\n', 'kkk');
INSERT INTO `equip_loss` VALUES ('72d9d94b9c9e47ed9c534b624ae488fb', '1', 'JJ', 'JJJ');
INSERT INTO `equip_loss` VALUES ('a', '1', 'hhh', 'xixix');
INSERT INTO `equip_loss` VALUES ('b2f88c7936b34c84a17c1760ac4e695a', '1', '2', '3');
INSERT INTO `equip_loss` VALUES ('bc9dc1806de74c328d5634ff850d96b4', '1', '2', '3');
INSERT INTO `equip_loss` VALUES ('D', '1', 'a', '1');

-- ----------------------------
-- Table structure for prescription
-- ----------------------------
DROP TABLE IF EXISTS `prescription`;
CREATE TABLE `prescription` (
  `Prescription_Id` varchar(32) NOT NULL,
  `Remarks` varchar(32) NOT NULL,
  `Dates` date NOT NULL,
  `Doctor_Id` varchar(32) NOT NULL,
  `Patient_Id` varchar(32) NOT NULL,
  PRIMARY KEY (`Prescription_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of prescription
-- ----------------------------
INSERT INTO `prescription` VALUES ('1', 'asdsad', '2019-07-05', '1', '1');
INSERT INTO `prescription` VALUES ('10', '今天要住院', '2020-03-04', '2', '2');
INSERT INTO `prescription` VALUES ('11', '今天要住院', '2020-02-04', '2', '10');
INSERT INTO `prescription` VALUES ('2', 'aaa', '2019-07-05', '1', '1');
INSERT INTO `prescription` VALUES ('3', 'lll', '2020-07-05', '2', '2');
INSERT INTO `prescription` VALUES ('4', 'iii', '2019-07-05', '2', '2');
INSERT INTO `prescription` VALUES ('5', 'eeee', '2019-07-05', '3', '6');
INSERT INTO `prescription` VALUES ('6', 'rrr', '2019-07-05', '3', '3');
INSERT INTO `prescription` VALUES ('7', 'uuu', '2019-07-05', '4', '4');
INSERT INTO `prescription` VALUES ('8', 'hhh', '2019-07-05', '4', '4');
INSERT INTO `prescription` VALUES ('9', '又死了', '2020-03-05', '3', '3');
