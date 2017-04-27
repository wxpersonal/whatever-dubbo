use whatever


/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : whatever

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2016-12-16 22:08:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sysfile
-- ----------------------------
DROP TABLE IF EXISTS `sysfile`;
CREATE TABLE `sysfile` (
  `fileid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '附件id',
  `userid` bigint(20) DEFAULT NULL COMMENT '附件上传者id',
  `objectid` bigint(20) DEFAULT NULL COMMENT '所属对象id',
  `objecttype` bigint(20) DEFAULT NULL,
  `type` bigint(20) DEFAULT NULL COMMENT '附件类型',
  `oldname` varchar(255) DEFAULT NULL COMMENT '附件原名称',
  `newname` varchar(255) DEFAULT NULL COMMENT '附件新名称',
  `size` bigint(20) DEFAULT NULL COMMENT '附件大小',
  `path` varchar(255) DEFAULT NULL COMMENT '存放路径',
  `relativepath` varchar(255) DEFAULT NULL COMMENT '相对路径',
  `uploadtime` date DEFAULT NULL COMMENT '上传时间',
  `status` bigint(20) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`fileid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='附件表';

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` bigint(20) NOT NULL DEFAULT '0' COMMENT '用户id',
  `username` varchar(50) DEFAULT NULL COMMENT '用户名',
  `password` varchar(50) DEFAULT NULL COMMENT '密码',
  `gender` bigint(20) DEFAULT NULL COMMENT '性别',
  `mobile` varchar(50) DEFAULT NULL COMMENT '电话',
  `registertime` date DEFAULT NULL COMMENT '注册时间',
  `birthday` date DEFAULT NULL COMMENT '出生时间',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `area` varchar(50) DEFAULT NULL COMMENT '地区',
  `photoid` bigint(20) DEFAULT NULL COMMENT '照片附件',
  `status` bigint(20) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';


DROP TABLE IF EXISTS USER_INFO;
CREATE TABLE USER_INFO(
`id` BIGINT NOT NULL AUTO_INCREMENT,
`user_name` VARCHAR(30) NOT NULL,
`password` VARCHAR(32) NOT NULL,
`email` VARCHAR(32) DEFAULT NULL,
`phone` VARCHAR(16) DEFAULT NULL,
`sex` VARCHAR(1) DEFAULT NULL,
`status` VARCHAR(2) NOT NULL,
`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
PRIMARY KEY (`ID`)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8 COMMENT='用户表'