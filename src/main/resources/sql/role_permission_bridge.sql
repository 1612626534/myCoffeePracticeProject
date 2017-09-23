DROP TABLE IF EXISTS `role_permission_bridge`;
CREATE TABLE `role_permission_bridge` (
  `ROLE_ID` int(32) NOT NULL,
  `PERMISSION_ID` varchar(32) NOT NULL,
  PRIMARY KEY  (`ROLE_ID`,`PERMISSION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
