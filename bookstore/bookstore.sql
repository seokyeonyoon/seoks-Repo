create table book(
	isbn varchar2(13) primary key not null,
	title varchar2(50) not null,
	author varchar2(50) not null,
	page number(4) not null,
	price number not null,
	publish_date date not null,
	publisher_no number not null,
	constraint book_pub_fk foreign key (publisher_no) references publisher(publisher_no)
);


--출판사_no 값을 자동증가 시킬 sequence객체 생성
create sequence publisher_no_seq;
select pub_no_seq.nextval from dual;
insert into publisher values (pub_no_seq.nextval, '우리출판','서울', '010-223-3333');

create table publisher(
	publisher_no number not null,
	publisher_name varchar2(50) not null,
	publisher_address varchar2(100) not null,
	publisher_tel varchar2(20) not null,
	constraint pub_no_pk primary key(publisher_no)
);

select publisher_no,
		publisher_name,
		publisher_address,
		publisher_tel
from publisher
		
drop table publisher

