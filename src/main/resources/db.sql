if exists(select 1 from sysindexes i where i.name = 'PK_TB_USER' and 
           (i.status2&2) = 2 and i.id = object_id('tb_user'))
   alter table tb_user
      drop constraint PK_TB_USER
go

if exists (select 1
            from  sysobjects
            where id = object_id('tb_user')
            and   type = 'U')
   drop table tb_user
go

/*==============================================================*/
/* Table: tb_user                                               */
/*==============================================================*/
create table tb_user (
   id                   numeric(8,0)                   identity,
   username             varchar(30)                    null,
   password             varchar(32)                    null,
   userAge              int                            null,
   userAddress          varchar(40)                    null,
   birthday             date                           null,
   nickname             varchar(50)                    null,
   email                varchar(40)                    null
)
with identity_gap = 1
go

alter table tb_user
   add constraint PK_TB_USER primary key (id)
go
