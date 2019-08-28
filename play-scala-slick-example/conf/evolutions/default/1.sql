# --- !Ups

create table `people` (
  `id` bigint not null auto_increment primary key,
  `name` varchar(255) not null,
  `age` int not null
);

# --- !Downs

drop table "people" if exists;
