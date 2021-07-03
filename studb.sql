/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50729
Source Host           : 127.0.0.1:3306
Source Database       : studb

Target Server Type    : MYSQL
Target Server Version : 50729
File Encoding         : 65001

Date: 2021-07-02 10:26:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `no` varchar(20) NOT NULL,
  `name` varchar(30) NOT NULL,
  `sex` varchar(10) NOT NULL,
  `major` varchar(40) NOT NULL,
  `classes` varchar(40) NOT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('2000666801', '王一', '女', '网络工程', '006');
INSERT INTO `student` VALUES ('2000666802', '王三', '男', '网络工程', '006');
INSERT INTO `student` VALUES ('2000666803', '王四', '男', '网络工程', '006');
INSERT INTO `student` VALUES ('2000666804', '王五', '女', '网络工程', '006');
INSERT INTO `student` VALUES ('2000666805', '王六', '女', '网络工程', '006');
INSERT INTO `student` VALUES ('2000666806', '王七', '女', '网络工程', '006');
INSERT INTO `student` VALUES ('2000666808', '王也', '男', '网络工程', '006');
INSERT INTO `student` VALUES ('2000666809', '王十', '男', '网络工程', '006');
INSERT INTO `student` VALUES ('2000666810', '王十一', '男', '网络工程', '006');
INSERT INTO `student` VALUES ('2000666811', '王十二', '男', '网络工程', '006');
INSERT INTO `student` VALUES ('2000666812', '王十三', '男', '网络工程', '006');
INSERT INTO `student` VALUES ('2000666813', '刘一', '男', '网络工程', '006');
INSERT INTO `student` VALUES ('2000666826', '李一', '男', '软件工程', '006');
INSERT INTO `student` VALUES ('2000666827', '李二', '男', '软件工程', '006');
INSERT INTO `student` VALUES ('2000666828', '李三', '男', '软件工程', '006');
INSERT INTO `student` VALUES ('2000666829', '李四', '男', '软件工程', '006');
INSERT INTO `student` VALUES ('2000666830', '李五', '女', '软件工程', '006');
INSERT INTO `student` VALUES ('2000666831', '李六', '女', '软件工程', '006');
INSERT INTO `student` VALUES ('2000666832', '李七', '女', '软件工程', '006');
INSERT INTO `student` VALUES ('2000666833', '李八', '女', '软件工程', '006');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(30) NOT NULL,
  `pwd` varchar(30) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('admin', 'admin');
