-- Project Name : memoru
-- Date/Time    : 2022/05/29 23:08:41
-- Author       : nobuhito0906
-- RDBMS Type   : Oracle Database
-- Application  : A5:SQL Mk-2

-- Todo
drop table NEW_ENTITY1 cascade constraints;

create table NEW_ENTITY1 (
  ID NUMBER default "SYSTEM"."ISEQ$$_77134".nextval not null
  , MEMO VARCHAR2(50) not null
  , REMARKS VARCHAR2(100)
  , ACTION_DATE CHAR(8) not null
  , USER_ID CHAR(36) not null
  , ALREADY_FLAG CHAR(1) not null
  , ACTION_TIME CHAR(4) not null
  , create_date DATE not null
  , create_user CHAR(36) not null
  , update_date DATE not null
  , update_user CHAR(36) not null
  , version NUMBER(10) default 0 not null
  , constraint NEW_ENTITY1_PKC primary key (ID)
) ;

comment on table NEW_ENTITY1 is 'Todo';
comment on column NEW_ENTITY1.ID is 'ID';
comment on column NEW_ENTITY1.MEMO is 'メモ';
comment on column NEW_ENTITY1.REMARKS is '備考';
comment on column NEW_ENTITY1.ACTION_DATE is '行動日';
comment on column NEW_ENTITY1.USER_ID is 'ユーザID';
comment on column NEW_ENTITY1.ALREADY_FLAG is '行動済フラグ';
comment on column NEW_ENTITY1.ACTION_TIME is '行動時間';
comment on column NEW_ENTITY1.create_date is '作成日時';
comment on column NEW_ENTITY1.create_user is '作成ユーザ';
comment on column NEW_ENTITY1.update_date is '更新日時';
comment on column NEW_ENTITY1.update_user is '更新ユーザ';
comment on column NEW_ENTITY1.version is 'バージョン';

