/* INSERT 문
 * 	INSERT INTO 테이블명( 컬럼명, 컬럼명, ....)
 * 	VALUES (값, 값, ....)
 * 
 * 
 */


insert into ADDRS(postno, bas_addr) values('100-100', '서울 강남구');
insert into ADDRS(postno, bas_addr) values('100-101', '서울 서초구');
insert into ADDRS(postno, bas_addr) values('100-102', '서울 마포구');
insert into ADDRS(postno, bas_addr) values('100-103', '서울 영등포구');
insert into ADDRS(postno, bas_addr) values('100-104', '서울 송파구');
insert into ADDRS(postno, bas_addr) values('100-105', '서울 관악구');
insert into ADDRS(postno, bas_addr) values('100-106', '서울 동작구');
insert into ADDRS(postno, bas_addr) values('100-107', '서울 강동구');
insert into ADDRS(postno, bas_addr) values('100-108', '서울 중구');
insert into ADDRS(postno, bas_addr) values('100-109', '서울 은평구');

select *from ADDRS;

delete from ADDRS;

commit;

/* SELECT 컬럼명, 컬럼명, .... FROM 테이블명
 * SELECT *FROM 테이블명
 
 * 
 */



