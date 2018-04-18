# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table basket (
  id                            bigint auto_increment not null,
  customer_id                   varchar(255),
  constraint uq_basket_customer_id unique (customer_id),
  constraint pk_basket primary key (id)
);

create table basket_game (
  basket_id                     bigint not null,
  game_id                       varchar(255) not null,
  constraint pk_basket_game primary key (basket_id,game_id)
);

create table forum_thread (
  id                            varchar(255) not null,
  constraint pk_forum_thread primary key (id)
);

create table game (
  id                            varchar(255) not null,
  title                         varchar(255),
  description                   longvarchar,
  price                         double not null,
  rating                        double not null,
  discount                      double not null,
  thread_id                     varchar(255),
  constraint uq_game_thread_id unique (thread_id),
  constraint pk_game primary key (id)
);

create table game_media (
  game_id                       varchar(255) not null,
  media_id                      varchar(255) not null,
  constraint pk_game_media primary key (game_id,media_id)
);

create table media (
  id                            varchar(255) not null,
  mime                          varchar(255),
  link                          varchar(255),
  absolute_link                 varchar(255),
  constraint pk_media primary key (id)
);

create table order_game (
  id                            bigint auto_increment not null,
  order_id                      bigint,
  basket_id                     bigint,
  game_id                       varchar(255),
  quantity                      integer not null,
  price                         double not null,
  constraint pk_order_game primary key (id)
);

create table posts (
  id                            varchar(255) not null,
  text                          varchar(255),
  date_time                     timestamp,
  constraint pk_posts primary key (id)
);

create table shop_order (
  id                            bigint auto_increment not null,
  order_date                    timestamp,
  customer_id                   varchar(255),
  constraint pk_shop_order primary key (id)
);

create table user (
  privileges                    varchar(31) not null,
  id                            varchar(255) not null,
  email                         varchar(255) not null,
  password                      varchar(255) not null,
  first_name                    varchar(255),
  last_name                     varchar(255),
  username                      varchar(255) not null,
  joined                        timestamp,
  basket_id                     bigint,
  constraint uq_user_email unique (email),
  constraint uq_user_basket_id unique (basket_id),
  constraint pk_user primary key (id)
);

create table user_game (
  user_id                       varchar(255) not null,
  game_id                       varchar(255) not null,
  constraint pk_user_game primary key (user_id,game_id)
);

alter table basket add constraint fk_basket_customer_id foreign key (customer_id) references user (id) on delete restrict on update restrict;

alter table basket_game add constraint fk_basket_game_basket foreign key (basket_id) references basket (id) on delete restrict on update restrict;
create index ix_basket_game_basket on basket_game (basket_id);

alter table basket_game add constraint fk_basket_game_game foreign key (game_id) references game (id) on delete restrict on update restrict;
create index ix_basket_game_game on basket_game (game_id);

alter table game add constraint fk_game_thread_id foreign key (thread_id) references forum_thread (id) on delete restrict on update restrict;

alter table game_media add constraint fk_game_media_game foreign key (game_id) references game (id) on delete restrict on update restrict;
create index ix_game_media_game on game_media (game_id);

alter table game_media add constraint fk_game_media_media foreign key (media_id) references media (id) on delete restrict on update restrict;
create index ix_game_media_media on game_media (media_id);

alter table order_game add constraint fk_order_game_order_id foreign key (order_id) references shop_order (id) on delete restrict on update restrict;
create index ix_order_game_order_id on order_game (order_id);

alter table order_game add constraint fk_order_game_basket_id foreign key (basket_id) references basket (id) on delete restrict on update restrict;
create index ix_order_game_basket_id on order_game (basket_id);

alter table order_game add constraint fk_order_game_game_id foreign key (game_id) references game (id) on delete restrict on update restrict;
create index ix_order_game_game_id on order_game (game_id);

alter table shop_order add constraint fk_shop_order_customer_id foreign key (customer_id) references user (id) on delete restrict on update restrict;
create index ix_shop_order_customer_id on shop_order (customer_id);

alter table user add constraint fk_user_basket_id foreign key (basket_id) references basket (id) on delete restrict on update restrict;

alter table user_game add constraint fk_user_game_user foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_user_game_user on user_game (user_id);

alter table user_game add constraint fk_user_game_game foreign key (game_id) references game (id) on delete restrict on update restrict;
create index ix_user_game_game on user_game (game_id);


# --- !Downs

alter table basket drop constraint if exists fk_basket_customer_id;

alter table basket_game drop constraint if exists fk_basket_game_basket;
drop index if exists ix_basket_game_basket;

alter table basket_game drop constraint if exists fk_basket_game_game;
drop index if exists ix_basket_game_game;

alter table game drop constraint if exists fk_game_thread_id;

alter table game_media drop constraint if exists fk_game_media_game;
drop index if exists ix_game_media_game;

alter table game_media drop constraint if exists fk_game_media_media;
drop index if exists ix_game_media_media;

alter table order_game drop constraint if exists fk_order_game_order_id;
drop index if exists ix_order_game_order_id;

alter table order_game drop constraint if exists fk_order_game_basket_id;
drop index if exists ix_order_game_basket_id;

alter table order_game drop constraint if exists fk_order_game_game_id;
drop index if exists ix_order_game_game_id;

alter table shop_order drop constraint if exists fk_shop_order_customer_id;
drop index if exists ix_shop_order_customer_id;

alter table user drop constraint if exists fk_user_basket_id;

alter table user_game drop constraint if exists fk_user_game_user;
drop index if exists ix_user_game_user;

alter table user_game drop constraint if exists fk_user_game_game;
drop index if exists ix_user_game_game;

drop table if exists basket;

drop table if exists basket_game;

drop table if exists forum_thread;

drop table if exists game;

drop table if exists game_media;

drop table if exists media;

drop table if exists order_game;

drop table if exists posts;

drop table if exists shop_order;

drop table if exists user;

drop table if exists user_game;

