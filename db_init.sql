create table if not exists `payment_transaction`(
	`id` int(8) unsigned NOT NULL AUTO_INCREMENT,
    `amount` double(100,2) not null,
    `currency` varchar(3) not null,
    `user_id` varchar(36) not null,
	`payee_id` varchar(36) not null,
    `payment_method_id` varchar(36) not null,
    `is_transaction_approved` boolean  not null,
    `created_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    `updated_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
);