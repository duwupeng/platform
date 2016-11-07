DROP DATABASE `db_b`;

CREATE DATABASE  `db_b` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE `products` (
  `id` varchar(50) NOT NULL DEFAULT '',
  `name` varchar(50) DEFAULT NULL,
  `createtime` DATETIME ,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;