show databases;
select database();
create database if not exists day1_work;
use day1_work;

create table if not exists user (
	id int primary key auto_increment,
    name varchar(30) not null,
	email varchar(30),
    institute varchar (30),
    INSERT_ID varchar(30),
    INSERT_TS timestamp,
    UPDATE_ID varchar(30),
    UPDATE_TS timestamp
) engine = InnoDB charset=utf8;
create index idx_user_name on user(name);

create table if not exists product (
	id int primary key auto_increment,
    name varchar(30) not null,
	num int not null,
    description varchar(300),
    price decimal(10,2),
    INSERT_ID varchar(30),
    INSERT_TS timestamp,
    UPDATE_ID varchar(30),
    UPDATE_TS timestamp
) engine = InnoDB charset=utf8;
create index idx_product_name on product(name);

create table if not exists trade (
	id int primary key auto_increment,
    tr_time datetime not null,
	quantity int not null,
    pro_id int not null,
    u_id int not null,
    total_price decimal(20,2) not null,
    INSERT_ID varchar(30),
    INSERT_TS timestamp,
    UPDATE_ID varchar(30),
    UPDATE_TS timestamp,
    foreign key (pro_id) references product(id),
    foreign key (u_id) references user(id)
) engine = InnoDB charset=utf8;

