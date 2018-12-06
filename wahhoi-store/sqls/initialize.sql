CREATE DATABASE wahhoi;
use wahhoi;

CREATE TABLE wahhoi (
  id int(11) unsigned not null auto_increment,
  nm varchar(255) not null,
  created_at datetime not null default current_timestamp,
  updated_at datetime not null default current_timestamp on update current_timestamp,
  primary key (id)
);
