# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table forum_thread (
  id                            varchar(255) not null,
  constraint pk_forum_thread primary key (id)
);

create table game (
  id                            varchar(255) not null,
  title                         varchar(255),
  description                   varchar(255),
  price                         double not null,
  rating                        double not null,
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

create table posts (
  id                            varchar(255) not null,
  text                          varchar(255),
  date_time                     timestamp,
  constraint pk_posts primary key (id)
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
  constraint uq_user_email unique (email),
  constraint pk_user primary key (id)
);

create table user_game (
  user_id                       varchar(255) not null,
  game_id                       varchar(255) not null,
  constraint pk_user_game primary key (user_id,game_id)
);

alter table game add constraint fk_game_thread_id foreign key (thread_id) references forum_thread (id) on delete restrict on update restrict;

alter table game_media add constraint fk_game_media_game foreign key (game_id) references game (id) on delete restrict on update restrict;
create index ix_game_media_game on game_media (game_id);

alter table game_media add constraint fk_game_media_media foreign key (media_id) references media (id) on delete restrict on update restrict;
create index ix_game_media_media on game_media (media_id);

alter table user_game add constraint fk_user_game_user foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_user_game_user on user_game (user_id);

alter table user_game add constraint fk_user_game_game foreign key (game_id) references game (id) on delete restrict on update restrict;
create index ix_user_game_game on user_game (game_id);


# --- !Downs

alter table game drop constraint if exists fk_game_thread_id;

alter table game_media drop constraint if exists fk_game_media_game;
drop index if exists ix_game_media_game;

alter table game_media drop constraint if exists fk_game_media_media;
drop index if exists ix_game_media_media;

alter table user_game drop constraint if exists fk_user_game_user;
drop index if exists ix_user_game_user;

alter table user_game drop constraint if exists fk_user_game_game;
drop index if exists ix_user_game_game;

drop table if exists forum_thread;

drop table if exists game;

drop table if exists game_media;

drop table if exists media;

drop table if exists posts;

drop table if exists user;

drop table if exists user_game;

