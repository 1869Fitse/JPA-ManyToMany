create table person
(id integer not null,name varchar(255) not null,
location varchar(255),
birth_date timestamp,
primary key(id));

insert into person(ID,NAME,LOCATION,BIRTH_DATE)values
             (100,'mike smith','fall church',sysdate());
 insert into person(ID,NAME,LOCATION,BIRTH_DATE)values
             (200,'jack wilber',' church',sysdate());
 insert into person(ID,NAME,LOCATION,BIRTH_DATE)values
             (300,'lisa aaron','falls',sysdate());