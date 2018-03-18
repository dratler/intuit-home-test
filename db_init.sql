create table if not exists `payee`(
	`id` varchar(34) not null  ,
    `name` varchar(20),
     `create_ts` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
     `update_ts` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
     PRIMARY KEY (`id`),
	UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


create table if not exists `payment_methods`(
	`id` varchar(34) not null,
    `name` varchar(20),
    `create_ts` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
     `update_ts` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

create table if not exists `user`(
	`id` varchar(34)not null,
    `name` varchar(20),
    `create_ts` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
     `update_ts` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	 PRIMARY KEY (`id`),
	UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

create table if not exists `currency`(
	`id`  int(8) unsigned NOT NULL AUTO_INCREMENT,
    `short_name` varchar(3) ,
    `create_ts` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
     `update_ts` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    primary key(`short_name`),
	UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

create table if not exists `payment_transaction`(
	`id` int(8) unsigned NOT NULL AUTO_INCREMENT,
    `amount` double(100,2) unsigned not null,
    `c_id` int(8) unsigned not null,
    `u_id` varchar(34) not null,
    `p_id` varchar(34) not null,
    `p_m_id` varchar(34) not null,
    `is_transaction_approved` boolean  not null,
    `create_ts` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
     `update_ts` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`),
     FOREIGN KEY (`c_id`) REFERENCES `currency`(`id`),
     FOREIGN KEY (`u_id`) REFERENCES `user`(`id`),
	 FOREIGN KEY (`p_id`) REFERENCES `payee`(`id`),
	 FOREIGN KEY (`p_m_id`) REFERENCES `payment_methods`(`id`)
);

insert into `payee` values('1','work place one',null,null),('2','work place two',null,null);

insert into `payment_methods` values('1','visa',null,null),('2','Master Card',null,null);

insert into `user` values('1','Arik',null,null),('2','Van Eric',null,null);

insert into `currency` values('1','USD',null,null),('2','ERO',null,null);