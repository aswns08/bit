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
select *from ADDRS;

/* 회원 정보 입력 */
insert into MEMBERS(UID,PWD,EMAIL,UNAME,TEL)
values('u01','1111','u01@test.com','홍길동','111-1111');

insert into MEMBERS(UID,PWD,EMAIL,UNAME,TEL)
values('u02','1111','u02@test.com','임꺽정','111-1111');

insert into MEMBERS(UID,PWD,EMAIL,UNAME,TEL)
values('u03','1111','u03@test.com','유관순','111-1111');

insert into MEMBERS(UID,PWD,EMAIL,UNAME,TEL)
values('u04','1111','u04@test.com','안중군','111-1111');

insert into MEMBERS(UID,PWD,EMAIL,UNAME,TEL)
values('u05','1111','u05@test.com','윤봉길','111-1111');

insert into MEMBERS(UID,PWD,EMAIL,UNAME,TEL)
values('u06','1111','u06@test.com','이순신','111-1111');

insert into MEMBERS(UID,PWD,EMAIL,UNAME,TEL)
values('u07','1111','u07@test.com','김구','111-1111');

insert into MEMBERS(UID,PWD,EMAIL,UNAME,TEL)
values('u08','1111','u08@test.com','김좌진','111-1111');

insert into MEMBERS(UID,PWD,EMAIL,UNAME,TEL)
values('u09','1111','u09@test.com','안창호','111-1111');

insert into MEMBERS(UID,PWD,EMAIL,UNAME,TEL)
values('u10','1111','u10@test.com','이봉창','111-1111');


/* 문제 : 회원의 아이디와 이름, 이메일을 출력하라 */

select UID,UNAME,EMAIL from MEMBERS;

/* 문제 : 위의 결과를 출력할 때 아이디와 이름의 라벨명(alias)을 id, name 으로 바꿀
 * 컬럼명 as별명
 * 컬럼명 별명 <== as 생략가능
 * 컬럼명 (as) 별명
 * 
 */ 

select UID as ID, UNAME NAME, EMAIL
from MEMBERS;

/* 문제 : 회원 정보를 출력할 때 다음과 같이 출력하시오.
 * 회원명 (이메일)
 */
select concat(UNAME, '(', EMAIL, ')')
from MEMBERS;


select concat(UNAME, '(', EMAIL, ')') as username
from MEMBERS;


/* 제조사 입력 */

insert into MAKERS(MKNAME,HOME,TEL)
values('애플','www.apple.com','100-1001');

insert into MAKERS(MKNAME,HOME,TEL)
values('삼성','www.samsung.com','100-1002');

insert into MAKERS(MKNAME,HOME,TEL)
values('LG','www.lg.com','100-1003');

insert into MAKERS(MKNAME,HOME,TEL)
values('IMB','www.ibm.com','100-1004');

insert into MAKERS(MKNAME,HOME,TEL)
values('인텔','www.intel.com','100-1005');

insert into MAKERS(MKNAME,HOME,TEL)
values('구글','www.google.com','100-1006');

/* 제품입력 */

insert into PRODUCTS(PNAME,QTY,MKNO)
values('아이폰6','100',100);  /에러
/* ERROR 1452 (23000): Cannot add or update a child row:
 *  a foreign key constraint fails 
 * (`studydb`.`PRODUCTS`, CONSTRAINT 
 * `FK_MAKERS_TO_PRODUCTS` FOREIGN KEY (`MKNO`) REFERENCES `MAKERS` (`MKNO`))
 * 
 */


insert into PRODUCTS(PNAME,QTY,MKNO)
values('아이폰6', 100, 1);

insert into PRODUCTS(PNAME,QTY,MKNO)
values('아이폰5', 100, 1);

insert into PRODUCTS(PNAME,QTY,MKNO)
values('아이패드', 50, 1);

insert into PRODUCTS(PNAME,QTY,MKNO)
values('갤럭시S5', 2000, 2);

insert into PRODUCTS(PNAME,QTY,MKNO)
values('갤럭시S4', 1000, 2);

insert into PRODUCTS(PNAME,QTY,MKNO)
values('구글글라스', 10000, 6);

insert into PRODUCTS(PNAME,QTY,MKNO)
values('넥서스7', 100, 6);


/* 사진 정보 입력 */

insert into PROD_PHOTS(PNO, URL)
values(1, 'a01.gif');

insert into PROD_PHOTS(PNO, URL)
values(2, 'a02.gif');

insert into PROD_PHOTS(PNO, URL)
values(4, 'a04.gif');

insert into PROD_PHOTS(PNO, URL)
values(5, 'a05.gif');

insert into PROD_PHOTS(PNO, URL)
values(6, 'a07.gif');


insert into PROD_PHOTS(URL)
values('X01.gif');

insert into PROD_PHOTS(URL)
values('X02.gif');

insert into PROD_PHOTS(URL)
values('X04.gif');


/*주문 정보 입력 */

insert into ORDERS(PNO, UID, QTY, ODATE)
value(1, 'u01', 1, '2014-05-07');

insert into ORDERS(PNO, UID, QTY, ODATE)
value(1, 'u02', 3, '2014-06-07');

insert into ORDERS(PNO, UID, QTY, ODATE)
value(2, 'u01', 3, '2014-07-07');

insert into ORDERS(PNO, UID, QTY, ODATE)
value(2, 'u05', 1, '2014-08-07');

insert into ORDERS(PNO, UID, QTY, ODATE)
value(3, 'u07', 6, '2014-09-07');

insert into ORDERS(PNO, UID, QTY, ODATE)
value(7, 'u10', 1, '2014-10-07');

insert into ORDERS(PNO, UID, QTY, ODATE)
value(7, 'u03', 5, '2014-11-10');

/* UPDATE 명령 
* 문법 : update 테이블명 set 컬럼명=값, 컬럼명=값... 
*/

insert into ORDERS(PNO, UID, QTY, ODATE)
value(7, 'u03', 5, '2014-11-10');

update ORDERS set
	QTY=3,
	ODATE='2014-11-09'
	where ONO=13;


/* DELETE 명령 
* 문법 : 
* delete from 테이블명 where 조건1 .....
*/

DELETE FROM ORDERS
where ONO=13;


------------------------------------------------------------------------

/* DISTINCT
* 중복 데이터 제거
 ==> 참고로 DISTINCT를 붙이지 않으면 ALL이다.
 SELECT ALL PNO FROM ORDERS;
*/

/* 1. 모든 제품 번호를 출력하 */
SELECT PNO FROM PRODUCTS;

/* 2) 모든 주문 제품의 번호를 출력하라 */
SELECT PNO FROM ORDERS;

* 3) 주문한 제품이 무엇 무엇이 있는지 목록을 출력하라. */
SELECT DISTINCT PNO FROM ORDERS;


SELECT DISTINCT PNO, UID FROM ORDERS; // 아무런 효과가 없다.


INSERT INTO ORDERS(PNO, UID, QTY) VALUES(1, 'u01', 3);


/* ORDER BY 절 
* 출력 결과를 정렬.
* 문법 :
* ORDER BY /* ASC */ 컬럼명, /* ASC */ 컬럼명, ....
* ORDER BY /* DESC */ 컬럼명, /* DESC */ 컬럼명 ....
* ==> 나열된 컬럼 순서대로 정렬한다. 기본은 상향 정렬 ( ㄱ ~ㅎ )이다.
*
*
* 정렬조건 :
* ASC(ENDING) => 오름차순
* DESC(ENDING) => 내림차순

* ORDER BY 절 수행 후 SELECT 실행.
*/

/* 1) 기본출력 */
SELECT * FROM MEMBERS ;

SELECT UID, UNAME, EMAIL FROM MEMBERS;

// 2) 이름을 오름차순으로 정렬하라 
SELECT UID, UNAME, EMAIL FROM MEMBERS ORDER BY UNAME /*(ASC)*/ ; 

// 3) 이름을 내림차순으로 정렬하라.
SELECT UID, UNAME, EMAIL FROM MEMBERS ORDER BY UNAME DESC;

// 4) 주문 정보를 제품 번호의 오름 차순으로 정렬하라.
SELECT * FROM ORDERS ORDER BY PNO ASC;

// 5) 주문 정보를 제품 번호의 오름차순으로 정렬하고,
사용자 아이디로 오름차순으로 정렬하라.


SELECT * FROM ORDERS ORDER BY PNO, UID;


// 6) 주문 정보를 제품 번호의 오름차순으로 정렬하고,
사용자 아이디로 내림차순으로 정렬하라.
  
SELECT * FROM ORDERS ORDER BY PNO, UID DESC;

/* 주문 정보를 제품 번호의 오름 차순으로 정렬하고, 
사용자 아이디로 내림차순으로 정렬하라.

 => 정렬을 먼저 한 다음 SELECT를 실행한다.
/*
SELECT ONO, ODATE FROM ORDERS ORDER BY PNO, UID DESC;

/* 별명 붙이기 
* 문법 :
* SELECT 컬럼명 [AS] 별명, ....
*/

SELECT ONO AS NO, ODATE AS 'Order Date' FROM ORDERS;

SELECT ONO AS NO, ODATE AS 'Order Date', PNO AS 'Product No', 
UID id FROM ORDERS;


/* WHERE 절
* 문법 :
* WHERE 조건1 (AND | OR) 조건2...
*/


/* 연산자 사용 
*
*/

/* 1) 더하기 연산자 */

SELECT ONO, QTY * 500000 AS TOTAL FROM ORDERS;

/* 2) 비교 연산자 */

SELECT ONO, QTY FROM ORDERS
WHERE QTY = 2;

SELECT ONO, QTY FROM ORDERS
WHERE QTY = 1;

SELECT ONO, QTY FROM ORDERS
WHERE QTY > 1 AND QTY <= 5;

/* 문자열 비교 */


SELECT UID, UNAME, EMAIL 
FROM MEMBERS
WHERE UNAME = '홍길동';

/* '%'는 0개 이상의 글자 */
SELECT UID, UNAME, EMAIL 
FROM MEMBERS
WHERE UNAME LIKE '김%';

/* '_'는 1개 이상의 글자 */
SELECT UID, UNAME, EMAIL 
FROM MEMBERS
WHERE UNAME LIKE '김_진';

/* 제품명에 '럭시'라는 글자를 포함한 모든 제품 선택하기 
* => 주의! 검색 속도가 매우 느리다.
*/

SELECT PNO, PNAME
FROM PRODUCTS
WHERE PNAME LIKE '%럭시%';


/* IN
* 표현식 IN(값, 값, 값, ....)
* => 표현식이 IN안에 들어 있는 값과 일치하면 TRUE
*/

// 제조사 정보 보기
SELECT * FROM MAKERS;

/* 삼성과 애플 제품을 모두 출력하시오. */
SELECT PNO, PNAME, MKNO
FROM PRODUCTS
WHERE MKNO=1 OR MKNO=2;

SELECT PNO, PNAME, MKNO
FROM PRODUCTS
WHERE MKNO IN(1, 2);


/* NULL 여부 검사 */

사진테이블출력

SELECT *FROM PROD_PHOTS
WHERE PNO IS NULL;

SELECT *FROM PROD_PHOTS 
WHERE PNO IS NOT NULL;


/* BETWEEN A AND B 
*
*/

SELECT * FROM ORDERS
WHERE QTY >= 1 AND QTY <=3;


SELECT * FROM ORDERS
WHERE QTY BETWEEN 1 AND 3;

// 위의 두 결과가 같다는 것을 확인 할 수 있다.


/* UNION => 결과의 결합 */
/* 두 개의 결과를 합쳐서 하나로 다루고 싶을 때 */
/* 예) 제품 이름과 제조사 이름을 알고 싶다. */

SELECT PNAME FROM PRODUCTS;
SELECT MKNAME FROM MAKERS;

SELECT PNAME FROM PRODUCTS
UNION
SELECT MKNAME FROM MAKERS;

// 위의 두 결과를 UNION으로 합쳐서 출력

/* 예) 2014년 7월 이후의 주문 정보와 애플 제품의 주문 정보를 출력하시오.*/

SELECT * FROM ORDERS
WHERE ODATE >= '2014-9-1';

SELECT * FROM ORDERS
WHERE PNO IN(1, 2, 3); 


/* UNION => 두 결과 데이터를 합칠 때 중복 데이터 제거 */

SELECT * FROM ORDERS
WHERE ODATE >= '2014-9-1'
UNION
SELECT * FROM ORDERS
WHERE PNO IN(1, 2, 3); 

/* UNION ALL => 두 결과 데이터를 합칠 때 중복 데이터를 제거하지 않는다. 데이터가 중복됨. */

SELECT * FROM ORDERS
WHERE ODATE >= '2014-9-1'
UNION ALL
SELECT * FROM ORDERS
WHERE PNO IN(1, 2, 3); 


/* 7월 이후 주문 정보 중에서 애플 제품을 제외한 주문 정보 */
// MYSQL은  MINUS 연산이 없다. 다른 문법으로 대체 해야 한다.
/*
SELECT * FROM ORDERS WHERE ODATE >= '2014-7-1'
MINUS
SELECT * FROM ORDERS WHERE PNO IN(1, 2, 3);
*/

SELECT * FROM ORDERS
WHERE 
ODATE >='2014-7-1'
AND PNO NOT IN(1, 2, 3);

/* 서브쿼리 */

SELECT ONO, PNO, QTY FROM ORDERS;


/* 1) 주문 제품의 주문 번호와 제품명을 출력하라 */
SELECT 
ONO, 
PNO,
(SELECT PNAME FROM PRODUCTS WHERE PNO=T1.PNO) AS NAME, 
QTY
FROM ORDERS T1;


/* 2) 검색어와 일치하는 회사 제품의 주문 정보를 출력하시오. */
주문정보
SELECT * FROM ORDERS 
WHERE PNO IN (SELECT PNO FROM PRODUCTS WHERE MKNO=1);

/* 3) '2014-7-1' 이후에 주문한 정보 중에서 u01, u05가 주문한 것 */  
SELECT *
FROM ORDERS
WHERE ODATE >= '2014-9-1';


SELECT *
FROM (SELECT * FROM ORDERS WHERE ODATE >= '2014-7-1') AS T1
WHERE UID IN('U01', 'U05');










