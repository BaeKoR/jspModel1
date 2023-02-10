drop table member;

-- unique: null은 허용 같은 값은 불허
-- priamry: null과 같은 값 모두 불허
create table member(
	id varchar(50) primary key,
	pwd varchar(50) not null,
	name varchar(50) not null,
	email varchar(50) unique, 
	auth int
);

select id
from member
where id='abc';

select count(*)
from member
where id='abc';

select * from member;
