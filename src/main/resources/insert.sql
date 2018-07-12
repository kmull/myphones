-- auto-generated definition
create table userData
(
  id      bigint auto_increment
    primary key,
  name    varchar(255) null,
  surname varchar(255) null
);

select *
from userData_Phone;

select *
from Phone;

select *
from userData;

insert into userData (name, surname)
VALUES ('Karol', 'Lewkowski'),
  ('Damian', 'Manelski');

INSERT INTO Phone (number, type, user_id)
VALUES ('111222111', 'mobile', 1),
  ('222111222', 'stacjonarny', 1),
  ('333444333', 'mobile', 2),
  ('999888999', 'prywatny', 2),
  ('888999888', 'stacjonarny', 2),
  ('111111111', 'sluzbowy', 1);


