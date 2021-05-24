---- drop ----
DROP TABLE IF EXISTS `users`;
DROP TABLE IF EXISTS `items`;
DROP TABLE IF EXISTS `histries`;

---- create ----
create table IF not exists `users`
(
 `user_id`          INT(20) AUTO_INCREMENT,
 `name`             VARCHAR(20) NOT NULL,
 `updated_at`       Datetime DEFAULT NULL,
 `created_at`       Datetime NOT NULL,
    PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

create table IF not exists `items`
(
 `item_id`          INT(20) AUTO_INCREMENT,
 `name`             VARCHAR(20) NOT NULL,
 `price`            INT(20) NOT NULL,
 `updated_at`       Datetime DEFAULT NULL,
 `created_at`       Datetime NOT NULL,
    PRIMARY KEY (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

create table IF not exists `histries`
(
 `history_id`          INT(20) AUTO_INCREMENT,
 `user_id`          INT(20) NOT NULL,
 `item_id`          INT(20) NOT NULL,
 `created_at`       Datetime NOT NULL,
    PRIMARY KEY (`history_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
