-- Adminer 4.7.3 MySQL dump
-- Digital Factory

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

DROP TABLE IF EXISTS `customers`;
CREATE TABLE `customers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `ruc` varchar(11) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `deleted_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `customers` (`id`, `name`, `ruc`, `address`, `phone`, `email`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1,	'Mauro',	'10704842088',	'Jr. Tacna 251 - Barrio Huayco',	'966948379',	'mauroflores8193@gmail.com',	'2019-09-20 04:14:33',	'2019-09-20 04:22:25',	NULL),
(2,	'otro',	'12345678431',	'',	'',	'',	'2019-09-21 23:55:18',	'2019-09-21 23:55:18',	NULL),
(3,	'Nuevo Cliente',	'76543242113',	'',	'',	'',	'2019-09-21 23:55:32',	'2019-09-21 23:55:32',	NULL),
(4,	NULL,	NULL,	NULL,	NULL,	NULL,	'2019-09-22 22:08:24',	'2019-09-22 23:41:48',	'2019-09-22 23:41:48');

DROP TABLE IF EXISTS `data_models`;
CREATE TABLE `data_models` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  `create_time` bigint(20) DEFAULT NULL,
  `update_time` bigint(20) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `deleted_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `data_models` (`id`, `name`, `uid`, `create_time`, `update_time`, `created_at`, `updated_at`, `deleted_at`) VALUES
(5243,	'PM5100',	13717,	1550438611,	1550438611,	'2019-05-03 13:06:10',	'2019-05-03 13:06:10',	NULL);

DROP TABLE IF EXISTS `data_variables`;
CREATE TABLE `data_variables` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `unit` varchar(20) DEFAULT NULL,
  `data_model_id` int(11) DEFAULT NULL,
  `formula` varchar(20) DEFAULT NULL,
  `account` varchar(20) DEFAULT NULL,
  `type` int(1) DEFAULT NULL,
  `decimal_accuracy` int(2) DEFAULT NULL,
  `create_time` bigint(20) DEFAULT NULL,
  `update_time` bigint(20) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `deleted_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `data_model_id` (`data_model_id`),
  CONSTRAINT `data_variables_ibfk_1` FOREIGN KEY (`data_model_id`) REFERENCES `data_models` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `data_variables` (`id`, `name`, `unit`, `data_model_id`, `formula`, `account`, `type`, `decimal_accuracy`, `create_time`, `update_time`, `created_at`, `updated_at`, `deleted_at`) VALUES
(22080,	'YEAR',	'Y',	5243,	'%s',	'miki31',	0,	NULL,	1550438611,	1550443811,	'2019-05-03 13:06:10',	'2019-05-03 13:06:10',	NULL),
(22081,	'Current Avg',	'A',	5243,	'%s',	'miki31',	0,	2,	1550444364,	1550444364,	'2019-05-03 13:06:10',	'2019-05-03 13:06:10',	NULL),
(22082,	'Voltage L-N Avg',	'V',	5243,	'%s',	'miki31',	0,	2,	1550444445,	1550444445,	'2019-05-03 13:06:10',	'2019-05-03 13:06:10',	NULL),
(22083,	'Active Power Total',	'kW',	5243,	'%s',	'miki31',	0,	2,	1550444532,	1550444532,	'2019-05-03 13:06:10',	'2019-05-03 13:06:10',	NULL),
(22084,	'Reactive Power Total',	'kVAR',	5243,	'%s',	'miki31',	0,	2,	1550444608,	1550444608,	'2019-05-03 13:06:10',	'2019-05-03 13:06:10',	NULL),
(22085,	'Apparent Power Total',	'kVA',	5243,	'%s',	'miki31',	0,	2,	1550444645,	1550444645,	'2019-05-03 13:06:10',	'2019-05-03 13:06:10',	NULL),
(22086,	'Frequency',	'Hz',	5243,	'%s',	'miki31',	0,	2,	1550444716,	1550444716,	'2019-05-03 13:06:10',	'2019-05-03 13:06:10',	NULL),
(22087,	'Active Energy Delivered (Into Load)_B',	'',	5243,	'%s',	'miki31',	0,	NULL,	1550444936,	1551581613,	'2019-05-03 13:06:10',	'2019-05-03 13:06:10',	NULL),
(22119,	'Active Energy Delivered (Into Load)_A',	'',	5243,	'%s',	'miki31',	0,	NULL,	1551581770,	1551581770,	'2019-05-03 13:06:10',	'2019-05-03 13:06:10',	NULL),
(22120,	'Reactive Energy Received_A',	'',	5243,	'%s',	'miki31',	0,	NULL,	1551581833,	1551581833,	'2019-05-03 13:06:10',	'2019-05-03 13:06:10',	NULL),
(22121,	'Reactive Energy Received_B',	'',	5243,	'%s',	'miki31',	0,	NULL,	1551581846,	1551581846,	'2019-05-03 13:06:10',	'2019-05-03 13:06:10',	NULL),
(22122,	'Apparent Energy Received_A',	'',	5243,	'%s',	'miki31',	0,	NULL,	1551581875,	1551581875,	'2019-05-03 13:06:10',	'2019-05-03 13:06:10',	NULL),
(22123,	'Apparent Energy Received_B',	'',	5243,	'%s',	'miki31',	0,	NULL,	1551581885,	1551581885,	'2019-05-03 13:06:10',	'2019-05-03 13:06:10',	NULL);

DROP TABLE IF EXISTS `gateways`;
CREATE TABLE `gateways` (
  `id` int(11) NOT NULL,
  `code` varchar(20) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `address` text,
  `pass` varchar(100) DEFAULT NULL,
  `position` text,
  `type` int(1) DEFAULT NULL,
  `update_time` bigint(20) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `deleted_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `gateways` (`id`, `code`, `name`, `address`, `pass`, `position`, `type`, `update_time`, `created_at`, `updated_at`, `deleted_at`) VALUES
(10341,	'00013717000000000001',	'PM5100',	'Avenida Caminos del Inca, Lima, Peru',	'Btln4Fkw',	'-76.992722,-12.113634',	0,	1551632489,	'2019-05-03 16:32:32',	'2019-05-03 16:32:32',	NULL),
(248670,	'00007112000000000002',	'Gateway_Tiendas',	'北京市西城区南纬路南巷34号',	'admin',	'-0.007869,0.020865',	0,	1561581205,	'2019-06-26 23:17:42',	'2019-06-26 23:17:42',	NULL);

DROP TABLE IF EXISTS `meters`;
CREATE TABLE `meters` (
  `id` int(11) NOT NULL,
  `index` int(11) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `address` int(11) DEFAULT NULL,
  `data_model_id` int(11) DEFAULT NULL,
  `gateway_id` int(11) DEFAULT NULL,
  `create_date` bigint(20) DEFAULT NULL,
  `update_date` bigint(20) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `deleted_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `gateway_id` (`gateway_id`),
  KEY `data_model_id` (`data_model_id`),
  CONSTRAINT `meters_ibfk_1` FOREIGN KEY (`gateway_id`) REFERENCES `gateways` (`id`),
  CONSTRAINT `meters_ibfk_2` FOREIGN KEY (`data_model_id`) REFERENCES `data_models` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `meters` (`id`, `index`, `name`, `address`, `data_model_id`, `gateway_id`, `create_date`, `update_date`, `created_at`, `updated_at`, `deleted_at`) VALUES
(6562,	1,	'PM5100_HOME',	10,	5243,	10341,	1550467652000,	1551661289000,	'2019-05-03 16:32:32',	'2019-05-03 16:32:32',	NULL),
(6588,	2,	'PM5100_OFFICE',	11,	5243,	10341,	1551661289000,	1551661289000,	'2019-05-03 16:32:32',	'2019-05-03 16:32:32',	NULL);

DROP TABLE IF EXISTS `meter_data`;
CREATE TABLE `meter_data` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gateway_cod` varchar(20) DEFAULT NULL,
  `point_id` varchar(10) DEFAULT NULL,
  `value` int(11) DEFAULT NULL,
  `meter_index` varchar(10) DEFAULT NULL,
  `meter_addr` varchar(10) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `deleted_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `offices`;
CREATE TABLE `offices` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `floor` int(2) DEFAULT NULL,
  `number` int(6) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `meter_id` int(11) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `deleted_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `meter_id` (`meter_id`),
  CONSTRAINT `offices_ibfk_1` FOREIGN KEY (`meter_id`) REFERENCES `meters` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `offices` (`id`, `floor`, `number`, `description`, `meter_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1,	1,	101,	'a ver',	6562,	'2019-09-17 02:23:03',	'2019-09-19 00:12:25',	NULL),
(2,	1,	102,	'Otros',	6588,	'2019-09-17 02:55:30',	'2019-09-18 23:45:23',	NULL),
(3,	2,	201,	'Local 201',	6588,	'2019-09-17 04:14:48',	'2019-09-18 23:45:21',	NULL);

DROP TABLE IF EXISTS `rents`;
CREATE TABLE `rents` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_id` int(11) DEFAULT NULL,
  `contract_num` varchar(20) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `note` text,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `deleted_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `customer_id` (`customer_id`),
  CONSTRAINT `rents_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `rents` (`id`, `customer_id`, `contract_num`, `start_date`, `end_date`, `note`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1,	1,	'4525',	'2019-09-22',	NULL,	'',	'2019-09-22 22:16:36',	'2019-09-22 23:39:47',	NULL),
(2,	1,	'424243',	'2019-09-22',	NULL,	'',	'2019-09-22 22:22:16',	'2019-09-22 22:22:16',	NULL),
(3,	1,	'21321',	'2019-09-01',	NULL,	'',	'2019-09-22 23:33:34',	'2019-09-22 23:33:34',	NULL);

DROP TABLE IF EXISTS `rent_details`;
CREATE TABLE `rent_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rent_id` int(11) DEFAULT NULL,
  `office_id` int(11) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `deleted_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `rent_id` (`rent_id`),
  KEY `office_id` (`office_id`),
  CONSTRAINT `rent_details_ibfk_1` FOREIGN KEY (`rent_id`) REFERENCES `rents` (`id`),
  CONSTRAINT `rent_details_ibfk_2` FOREIGN KEY (`office_id`) REFERENCES `offices` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `rent_details` (`id`, `rent_id`, `office_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1,	1,	1,	'2019-09-22 22:16:36',	'2019-09-22 22:16:36',	NULL),
(2,	2,	2,	'2019-09-22 22:22:16',	'2019-09-22 23:38:29',	'2019-09-22 23:38:29'),
(3,	1,	2,	'2019-09-22 23:30:09',	'2019-09-22 23:39:31',	'2019-09-22 23:39:31'),
(4,	3,	3,	'2019-09-22 23:33:34',	'2019-09-22 23:33:46',	NULL),
(5,	1,	3,	'2019-09-22 23:34:18',	'2019-09-22 23:39:31',	'2019-09-22 23:39:31'),
(6,	3,	1,	'2019-09-22 23:35:01',	'2019-09-22 23:35:01',	NULL),
(7,	2,	3,	'2019-09-22 23:39:14',	'2019-09-22 23:39:14',	NULL),
(8,	1,	2,	'2019-09-22 23:39:31',	'2019-09-22 23:39:31',	NULL);

-- 2019-11-22 02:20:50
