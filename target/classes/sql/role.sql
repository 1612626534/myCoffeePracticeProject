DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `ID` int(32) unsigned NOT NULL auto_increment,
  `NAME` varchar(45) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'ROLE_ADMIN');
INSERT INTO `role` VALUES ('10', 'ROLE_STANDARD');
