DROP TABLE IF EXISTS `user_profile`;
CREATE TABLE `user_profile` (
  `ID` varchar(32) NOT NULL,
  `ROLE_ID` int NOT NULL,
  `NAME` varchar(30) NOT NULL,
  `PASSWORD` varchar(30) NOT NULL,
  `EMAIL` varchar(30) default NULL,
  `IS_ACCOUNT_NON_EXPIRED` tinyint(1) default NULL,
  `IS_ACCOUNT_NON_LOCKED` tinyint(1) default NULL,
  `IS_CREDENTIALS_NON_EXPIRED` tinyint(1) default NULL,
  `IS_ENABLED` tinyint(1) default NULL,
  `MODIFY_DATE` datetime default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
