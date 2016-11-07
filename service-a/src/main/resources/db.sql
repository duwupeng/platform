DROP DATABASE `db_a`;

CREATE DATABASE  `db_a` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE `users` (
  `id` varchar(50) NOT NULL DEFAULT '',
  `username` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;