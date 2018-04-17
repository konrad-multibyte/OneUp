# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table cart (
  id                            bigint auto_increment not null,
  total                         double not null,
  constraint pk_cart primary key (id)
);

create table cart_game (
  cart_id                       bigint not null,
  game_id                       bigint not null,
  constraint pk_cart_game primary key (cart_id,game_id)
);

create table game (
  id                            bigint auto_increment not null,
  title                         varchar(255),
  description                   longvarchar,
  price                         double not null,
  rating                        double not null,
  discount                      double not null,
  constraint pk_game primary key (id)
);

create table game_media (
  game_id                       bigint not null,
  media_id                      bigint not null,
  constraint pk_game_media primary key (game_id,media_id)
);

create table media (
  id                            bigint auto_increment not null,
  mime                          varchar(255),
  link                          varchar(255),
  absolute_link                 varchar(255),
  constraint pk_media primary key (id)
);

create table post (
  id                            bigint auto_increment not null,
  text                          longvarchar,
  time_posted                   timestamp,
  thread_id                     bigint,
  constraint pk_post primary key (id)
);

create table thread (
  id                            bigint auto_increment not null,
  title                         varchar(255),
  game_id                       bigint,
  constraint pk_thread primary key (id)
);

create table user (
  privileges                    varchar(31) not null,
  id                            integer not null,
  email                         varchar(255) not null,
  password                      varchar(255) not null,
  first_name                    varchar(255),
  last_name                     varchar(255),
  username                      varchar(255) not null,
  joined                        timestamp,
  cart_id                       bigint,
  constraint uq_user_email unique (email),
  constraint uq_user_cart_id unique (cart_id),
  constraint pk_user primary key (id)
);
create sequence user_seq start with 12432;

create table user_game (
  user_id                       integer not null,
  game_id                       bigint not null,
  constraint pk_user_game primary key (user_id,game_id)
);

alter table cart_game add constraint fk_cart_game_cart foreign key (cart_id) references cart (id) on delete restrict on update restrict;
create index ix_cart_game_cart on cart_game (cart_id);

alter table cart_game add constraint fk_cart_game_game foreign key (game_id) references game (id) on delete restrict on update restrict;
create index ix_cart_game_game on cart_game (game_id);

alter table game_media add constraint fk_game_media_game foreign key (game_id) references game (id) on delete restrict on update restrict;
create index ix_game_media_game on game_media (game_id);

alter table game_media add constraint fk_game_media_media foreign key (media_id) references media (id) on delete restrict on update restrict;
create index ix_game_media_media on game_media (media_id);

alter table post add constraint fk_post_thread_id foreign key (thread_id) references thread (id) on delete restrict on update restrict;
create index ix_post_thread_id on post (thread_id);

alter table thread add constraint fk_thread_game_id foreign key (game_id) references game (id) on delete restrict on update restrict;
create index ix_thread_game_id on thread (game_id);

alter table user add constraint fk_user_cart_id foreign key (cart_id) references cart (id) on delete restrict on update restrict;

alter table user_game add constraint fk_user_game_user foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_user_game_user on user_game (user_id);

alter table user_game add constraint fk_user_game_game foreign key (game_id) references game (id) on delete restrict on update restrict;
create index ix_user_game_game on user_game (game_id);


# --- !Downs

alter table cart_game drop constraint if exists fk_cart_game_cart;
drop index if exists ix_cart_game_cart;

alter table cart_game drop constraint if exists fk_cart_game_game;
drop index if exists ix_cart_game_game;

alter table game_media drop constraint if exists fk_game_media_game;
drop index if exists ix_game_media_game;

alter table game_media drop constraint if exists fk_game_media_media;
drop index if exists ix_game_media_media;

alter table post drop constraint if exists fk_post_thread_id;
drop index if exists ix_post_thread_id;

alter table thread drop constraint if exists fk_thread_game_id;
drop index if exists ix_thread_game_id;

alter table user drop constraint if exists fk_user_cart_id;

alter table user_game drop constraint if exists fk_user_game_user;
drop index if exists ix_user_game_user;

alter table user_game drop constraint if exists fk_user_game_game;
drop index if exists ix_user_game_game;

drop table if exists cart;

drop table if exists cart_game;

drop table if exists game;

drop table if exists game_media;

drop table if exists media;

drop table if exists post;

drop table if exists thread;

drop table if exists user;
drop sequence if exists user_seq;

drop table if exists user_game;

