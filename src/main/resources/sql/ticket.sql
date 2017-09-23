DROP TABLE IF EXISTS `ticket`;
CREATE TABLE `ticket` (
  `ID` int(11) unsigned zerofill NOT NULL auto_increment,
  `TITLE` varchar(32) default NULL,
  `ASSIGNEE_ID` varchar(32) default NULL,
  `CREATOR_ID` varchar(32) default NULL,
  `STATUS` int(11) NOT NULL,
  `DESCRIPTION` blob,
  `CREATED_DATE` datetime default NULL,
  `MODIFIED_DATE` datetime default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
