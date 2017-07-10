/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.6.20 : Database - whatever
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`whatever` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `whatever`;

/*Table structure for table `permission` */

DROP TABLE IF EXISTS `permission`;

CREATE TABLE `permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `p_id` int(11) DEFAULT '0',
  `system_id` int(11) DEFAULT '0',
  `code` varchar(50) NOT NULL,
  `desc` varchar(1000) DEFAULT NULL,
  `url` varchar(500) DEFAULT NULL,
  `orders` int(11) DEFAULT '0',
  `create_by` int(11) DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  `update_by` int(11) DEFAULT '0',
  `update_time` datetime DEFAULT NULL,
  `status` int(11) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `permission` */

insert  into `permission`(`id`,`p_id`,`system_id`,`code`,`desc`,`url`,`orders`,`create_by`,`create_time`,`update_by`,`update_time`,`status`) values (1,0,1,'whatever','系统管理','whatever',1,0,'2017-06-20 00:00:00',0,'2017-06-20 00:00:00',1);

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(50) NOT NULL COMMENT '权限编码',
  `name` varchar(50) DEFAULT NULL,
  `desc` varchar(1000) DEFAULT NULL COMMENT '权限说明',
  `create_by` int(11) DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  `update_by` int(11) DEFAULT '0',
  `update_time` datetime DEFAULT NULL,
  `status` int(11) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `role` */

insert  into `role`(`id`,`code`,`name`,`desc`,`create_by`,`create_time`,`update_by`,`update_time`,`status`) values (1,'ROLE_ADMIN','管理员','拥有除权限管理系统外的所有权限',NULL,'2017-06-20 00:00:00',NULL,'2017-06-20 00:00:00',1),(2,'ROLE_SADMIN','超级管理员','拥有所有权限',NULL,'2017-06-20 00:00:00',NULL,'2017-06-20 00:00:00',1);

/*Table structure for table `role_permission` */

DROP TABLE IF EXISTS `role_permission`;

CREATE TABLE `role_permission` (
  `role_id` int(11) NOT NULL,
  `permission_id` int(11) NOT NULL,
  `create_by` int(11) DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  `update_by` int(11) DEFAULT '0',
  `update_time` datetime DEFAULT NULL,
  `status` int(11) DEFAULT '1',
  PRIMARY KEY (`role_id`,`permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `role_permission` */

insert  into `role_permission`(`role_id`,`permission_id`,`create_by`,`create_time`,`update_by`,`update_time`,`status`) values (1,1,0,'2017-06-20 00:00:00',0,'2017-06-20 00:00:00',1);

/*Table structure for table `system_code` */

DROP TABLE IF EXISTS `system_code`;

CREATE TABLE `system_code` (
  `code` varchar(50) NOT NULL,
  `p_code` varchar(50) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `desc` varchar(1000) DEFAULT NULL,
  `create_by` int(11) DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  `updateBy` int(11) DEFAULT '0',
  `update_time` datetime DEFAULT NULL,
  `status` int(11) DEFAULT '1',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `system_code` */

insert  into `system_code`(`code`,`p_code`,`name`,`desc`,`create_by`,`create_time`,`updateBy`,`update_time`,`status`) values ('_PERMISSiON',NULL,'权限',NULL,0,'2017-06-20 00:00:00',0,'2017-06-20 00:00:00',1),('_ROLE',NULL,'角色',NULL,0,'2017-06-20 00:00:00',0,'2017-06-20 00:00:00',1);

/*Table structure for table `system_file` */

DROP TABLE IF EXISTS `system_file`;

CREATE TABLE `system_file` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '附件id',
  `objectid` int(11) DEFAULT '0' COMMENT '所属对象id',
  `objecttype` int(11) DEFAULT '0',
  `type` int(11) DEFAULT '0' COMMENT '附件类型',
  `oldname` varchar(255) DEFAULT NULL COMMENT '附件原名称',
  `newname` varchar(255) DEFAULT NULL COMMENT '附件新名称',
  `size` int(11) DEFAULT '0' COMMENT '附件大小',
  `path` varchar(255) DEFAULT NULL COMMENT '存放路径',
  `relativepath` varchar(255) DEFAULT NULL COMMENT '相对路径',
  `create_by` int(11) DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  `update_by` int(11) DEFAULT '0',
  `update_time` datetime DEFAULT NULL,
  `status` int(11) DEFAULT '1' COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='附件表';

/*Data for the table `system_file` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(20) NOT NULL COMMENT '用户id',
  `username` varchar(50) DEFAULT NULL COMMENT '用户名',
  `password` varchar(50) DEFAULT NULL COMMENT '密码',
  `gender` int(20) DEFAULT '0' COMMENT '性别',
  `mobile` varchar(50) DEFAULT NULL COMMENT '电话',
  `birthday` datetime DEFAULT NULL COMMENT '出生时间',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `address_id` int(11) DEFAULT '0',
  `photo_id` int(20) DEFAULT '0' COMMENT '照片附件',
  `create_by` int(11) DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  `update_by` int(11) DEFAULT '0',
  `update_time` datetime DEFAULT NULL,
  `status` int(20) DEFAULT '1' COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`,`gender`,`mobile`,`birthday`,`email`,`address_id`,`photo_id`,`create_by`,`create_time`,`update_by`,`update_time`,`status`) values (1,'admin','abc123',0,'18205256689','2017-06-16 00:00:00','wxpersonal@163.com',0,0,0,'2017-06-16 00:00:00',0,'2017-06-16 00:00:00',1),(2,'weix','xiang123',0,'18205256689','2017-06-20 00:00:00','wxpersonal@163.com',0,0,0,'2017-06-20 00:00:00',0,'2017-06-20 00:00:00',1);

/*Table structure for table `user_role` */

DROP TABLE IF EXISTS `user_role`;

CREATE TABLE `user_role` (
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `role_id` int(11) NOT NULL COMMENT '角色code',
  `create_by` int(11) DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  `update_by` int(11) DEFAULT '0',
  `update_time` datetime DEFAULT NULL,
  `status` int(11) DEFAULT '1',
  PRIMARY KEY (`user_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user_role` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
