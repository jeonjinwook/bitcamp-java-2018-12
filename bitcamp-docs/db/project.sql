-- 프로젝트관리
DROP TABLE IF EXISTS TABLE RESTRICT;

-- 사용자
DROP TABLE IF EXISTS Temporary RESTRICT;

-- 프로젝트
DROP TABLE IF EXISTS Temporary2 RESTRICT;

-- 참여중인프로젝트
DROP TABLE IF EXISTS Temporary3 RESTRICT;

-- 진행중인프로젝트
DROP TABLE IF EXISTS Temporary4 RESTRICT;

-- 사용자프로젝트목록
DROP TABLE IF EXISTS TABLE2 RESTRICT;

-- 주소
DROP TABLE IF EXISTS TABLE3 RESTRICT;

-- 자료
DROP TABLE IF EXISTS TABLE4 RESTRICT;

-- 프로젝트그룹
DROP TABLE IF EXISTS Temporary5 RESTRICT;

-- 팀장
DROP TABLE IF EXISTS tchr RESTRICT;

-- 연구원
DROP TABLE IF EXISTS stud RESTRICT;

-- 학력
DROP TABLE IF EXISTS TABLE5 RESTRICT;

-- 종료된프로젝트
DROP TABLE IF EXISTS Temporary6 RESTRICT;

-- 예정중인프로젝트
DROP TABLE IF EXISTS Temporary7 RESTRICT;

-- 프로젝트관리
CREATE TABLE TABLE (
  COL2 INTEGER NOT NULL COMMENT '프로젝트관리번호', -- 프로젝트관리번호
  id   INTEGER NULL     COMMENT '진행중인프로젝트', -- 진행중인프로젝트
  id2  INTEGER NULL     COMMENT '종료된프로젝트번호', -- 종료된프로젝트번호
  id3  INTEGER NULL     COMMENT '프로젝트예정번호' -- 프로젝트예정번호
)
COMMENT '프로젝트관리';

-- 프로젝트관리
ALTER TABLE TABLE
  ADD CONSTRAINT PK_TABLE -- 프로젝트관리 기본키
    PRIMARY KEY (
      COL2 -- 프로젝트관리번호
    );

ALTER TABLE TABLE
  MODIFY COLUMN COL2 INTEGER NOT NULL AUTO_INCREMENT COMMENT '프로젝트관리번호';

-- 사용자
CREATE TABLE Temporary (
  id    INTEGER      NOT NULL COMMENT '사용자번호', -- 사용자번호
  COL   VARCHAR(50)  NOT NULL COMMENT '이름', -- 이름
  COL11 VARCHAR(255) NOT NULL COMMENT '암호', -- 암호
  COL12 VARCHAR(40)  NOT NULL COMMENT '이메일', -- 이메일
  COL2  VARCHAR(30)  NULL     COMMENT '번호', -- 번호
  COL3  VARCHAR(255) NULL     COMMENT '사진', -- 사진
  COL4  INTEGER      NULL     COMMENT '주소번호', -- 주소번호
  COL5  VARCHAR(255) NULL     COMMENT '상제주소' -- 상제주소
)
COMMENT '사용자';

-- 사용자
ALTER TABLE Temporary
  ADD CONSTRAINT PK_Temporary -- 사용자 기본키
    PRIMARY KEY (
      id -- 사용자번호
    );

-- 사용자 유니크 인덱스
CREATE UNIQUE INDEX UIX_Temporary
  ON Temporary ( -- 사용자
    COL12 ASC -- 이메일
  );

-- 사용자 인덱스
CREATE INDEX IX_Temporary
  ON Temporary( -- 사용자
    COL ASC -- 이름
  );

ALTER TABLE Temporary
  MODIFY COLUMN id INTEGER NOT NULL AUTO_INCREMENT COMMENT '사용자번호';

-- 프로젝트
CREATE TABLE Temporary2 (
  id <데이터 타입 없음> NOT NULL COMMENT '프로젝트번호' -- 프로젝트번호
)
COMMENT '프로젝트';

-- 프로젝트
ALTER TABLE Temporary2
  ADD CONSTRAINT PK_Temporary2 -- 프로젝트 기본키
    PRIMARY KEY (
      id -- 프로젝트번호
    );

-- 참여중인프로젝트
CREATE TABLE Temporary3 (
  id <데이터 타입 없음> NOT NULL COMMENT '참여중인프로젝트번호' -- 참여중인프로젝트번호
)
COMMENT '참여중인프로젝트';

-- 참여중인프로젝트
ALTER TABLE Temporary3
  ADD CONSTRAINT PK_Temporary3 -- 참여중인프로젝트 기본키
    PRIMARY KEY (
      id -- 참여중인프로젝트번호
    );

-- 진행중인프로젝트
CREATE TABLE Temporary4 (
  id   INTEGER     NOT NULL COMMENT '진행중인프로젝트 번호', -- 진행중인프로젝트 번호
  COL4 INTEGER     NOT NULL COMMENT '자료번호', -- 자료번호
  COL  INTEGER     NOT NULL COMMENT '프로젝트그룹번호', -- 프로젝트그룹번호
  COL2 VARCHAR(50) NOT NULL COMMENT '프로젝트명', -- 프로젝트명
  COL8 TEXT        NOT NULL COMMENT '프로젝트내용', -- 프로젝트내용
  COL6 DATETIME    NOT NULL COMMENT '시작일시', -- 시작일시
  COL7 DATETIME    NULL     COMMENT '종료일시' -- 종료일시
)
COMMENT '진행중인프로젝트';

-- 진행중인프로젝트
ALTER TABLE Temporary4
  ADD CONSTRAINT PK_Temporary4 -- 진행중인프로젝트 기본키
    PRIMARY KEY (
      id -- 진행중인프로젝트 번호
    );

-- 진행중인프로젝트 유니크 인덱스
CREATE UNIQUE INDEX UIX_Temporary4
  ON Temporary4 ( -- 진행중인프로젝트
    COL2 ASC -- 프로젝트명
  );

-- 진행중인프로젝트 인덱스
CREATE INDEX IX_Temporary4
  ON Temporary4( -- 진행중인프로젝트
    COL2 ASC -- 프로젝트명
  );

ALTER TABLE Temporary4
  MODIFY COLUMN id INTEGER NOT NULL AUTO_INCREMENT COMMENT '진행중인프로젝트 번호';

-- 사용자프로젝트목록
CREATE TABLE TABLE2 (
  id  <데이터 타입 없음> NOT NULL COMMENT '포로젝트목록번호', -- 포로젝트목록번호
  id2 INTEGER            NULL     COMMENT '진행중인프로젝트 번호' -- 진행중인프로젝트 번호
)
COMMENT '사용자프로젝트목록';

-- 사용자프로젝트목록
ALTER TABLE TABLE2
  ADD CONSTRAINT PK_TABLE2 -- 사용자프로젝트목록 기본키
    PRIMARY KEY (
      id -- 포로젝트목록번호
    );

-- 주소
CREATE TABLE TABLE3 (
  COL  INTEGER      NOT NULL COMMENT '주소번호', -- 주소번호
  COL6 VARCHAR(5)   NOT NULL COMMENT '우편번호', -- 우편번호
  COL7 VARCHAR(255) NOT NULL COMMENT '기본주소' -- 기본주소
)
COMMENT '주소';

-- 주소
ALTER TABLE TABLE3
  ADD CONSTRAINT PK_TABLE3 -- 주소 기본키
    PRIMARY KEY (
      COL -- 주소번호
    );

ALTER TABLE TABLE3
  MODIFY COLUMN COL INTEGER NOT NULL AUTO_INCREMENT COMMENT '주소번호';

-- 자료
CREATE TABLE TABLE4 (
  COL  INTEGER            NOT NULL COMMENT '자료번호', -- 자료번호
  COL3 <데이터 타입 없음> NOT NULL COMMENT '내용', -- 내용
  COL4 <데이터 타입 없음> NOT NULL COMMENT '요구사항정의' -- 요구사항정의
)
COMMENT '자료';

-- 자료
ALTER TABLE TABLE4
  ADD CONSTRAINT PK_TABLE4 -- 자료 기본키
    PRIMARY KEY (
      COL -- 자료번호
    );

ALTER TABLE TABLE4
  MODIFY COLUMN COL INTEGER NOT NULL AUTO_INCREMENT COMMENT '자료번호';

-- 프로젝트그룹
CREATE TABLE Temporary5 (
  COL2 INTEGER NOT NULL COMMENT '프로젝트그룹번호', -- 프로젝트그룹번호
  id   INTEGER NULL     COMMENT '연구원번호' -- 연구원번호
)
COMMENT '프로젝트그룹';

-- 프로젝트그룹
ALTER TABLE Temporary5
  ADD CONSTRAINT PK_Temporary5 -- 프로젝트그룹 기본키
    PRIMARY KEY (
      COL2 -- 프로젝트그룹번호
    );

-- 프로젝트그룹 인덱스
CREATE INDEX IX_Temporary5
  ON Temporary5( -- 프로젝트그룹
    id ASC -- 연구원번호
  );

ALTER TABLE Temporary5
  MODIFY COLUMN COL2 INTEGER NOT NULL AUTO_INCREMENT COMMENT '프로젝트그룹번호';

-- 팀장
CREATE TABLE tchr (
  id   INTEGER      NOT NULL COMMENT '강사번호', -- 강사번호
  COL2 INTEGER      NOT NULL COMMENT '프로젝트관리번호', -- 프로젝트관리번호
  COL  INTEGER      NOT NULL COMMENT '학력번호', -- 학력번호
  work VARCHAR(20)  NOT NULL COMMENT '프로젝트경력', -- 프로젝트경력
  hp   VARCHAR(255) NULL     COMMENT '홈페이지' -- 홈페이지
)
COMMENT '팀장';

-- 팀장
ALTER TABLE tchr
  ADD CONSTRAINT PK_tchr -- 팀장 기본키
    PRIMARY KEY (
      id -- 강사번호
    );

-- 연구원
CREATE TABLE stud (
  id   INTEGER NOT NULL COMMENT '연구원번호', -- 연구원번호
  COL2 INTEGER NOT NULL COMMENT '학력번호' -- 학력번호
)
COMMENT '연구원';

-- 연구원
ALTER TABLE stud
  ADD CONSTRAINT PK_stud -- 연구원 기본키
    PRIMARY KEY (
      id -- 연구원번호
    );

-- 학력
CREATE TABLE TABLE5 (
  COL       INTEGER     NOT NULL COMMENT '학력번호', -- 학력번호
  lst_grade VARCHAR(50) NOT NULL COMMENT '최종학력', -- 최종학력
  schl      VARCHAR(50) NOT NULL COMMENT '학교', -- 학교
  major     VARCHAR(50) NOT NULL COMMENT '전공' -- 전공
)
COMMENT '학력';

-- 학력
ALTER TABLE TABLE5
  ADD CONSTRAINT PK_TABLE5 -- 학력 기본키
    PRIMARY KEY (
      COL -- 학력번호
    );

ALTER TABLE TABLE5
  MODIFY COLUMN COL INTEGER NOT NULL AUTO_INCREMENT COMMENT '학력번호';

-- 종료된프로젝트
CREATE TABLE Temporary6 (
  id  INTEGER  NOT NULL COMMENT '종료된프로젝트번호', -- 종료된프로젝트번호
  id2 INTEGER  NULL     COMMENT '진행중인프로젝트 번호', -- 진행중인프로젝트 번호
  COL DATETIME NULL     COMMENT '종료일시' -- 종료일시
)
COMMENT '종료된프로젝트';

-- 종료된프로젝트
ALTER TABLE Temporary6
  ADD CONSTRAINT PK_Temporary6 -- 종료된프로젝트 기본키
    PRIMARY KEY (
      id -- 종료된프로젝트번호
    );

ALTER TABLE Temporary6
  MODIFY COLUMN id INTEGER NOT NULL AUTO_INCREMENT COMMENT '종료된프로젝트번호';

-- 예정중인프로젝트
CREATE TABLE Temporary7 (
  id   INTEGER  NOT NULL COMMENT '프로젝트예정번호', -- 프로젝트예정번호
  COL  INTEGER  NOT NULL COMMENT '자료번호', -- 자료번호
  COL2 DATETIME NOT NULL COMMENT '시작일시' -- 시작일시
)
COMMENT '예정중인프로젝트';

-- 예정중인프로젝트
ALTER TABLE Temporary7
  ADD CONSTRAINT PK_Temporary7 -- 예정중인프로젝트 기본키
    PRIMARY KEY (
      id -- 프로젝트예정번호
    );

ALTER TABLE Temporary7
  MODIFY COLUMN id INTEGER NOT NULL AUTO_INCREMENT COMMENT '프로젝트예정번호';

-- 프로젝트관리
ALTER TABLE TABLE
  ADD CONSTRAINT FK_Temporary4_TO_TABLE -- 진행중인프로젝트 -> 프로젝트관리
    FOREIGN KEY (
      id -- 진행중인프로젝트
    )
    REFERENCES Temporary4 ( -- 진행중인프로젝트
      id -- 진행중인프로젝트 번호
    );

-- 프로젝트관리
ALTER TABLE TABLE
  ADD CONSTRAINT FK_Temporary6_TO_TABLE -- 종료된프로젝트 -> 프로젝트관리
    FOREIGN KEY (
      id2 -- 종료된프로젝트번호
    )
    REFERENCES Temporary6 ( -- 종료된프로젝트
      id -- 종료된프로젝트번호
    );

-- 프로젝트관리
ALTER TABLE TABLE
  ADD CONSTRAINT FK_Temporary7_TO_TABLE -- 예정중인프로젝트 -> 프로젝트관리
    FOREIGN KEY (
      id3 -- 프로젝트예정번호
    )
    REFERENCES Temporary7 ( -- 예정중인프로젝트
      id -- 프로젝트예정번호
    );

-- 사용자
ALTER TABLE Temporary
  ADD CONSTRAINT FK_TABLE3_TO_Temporary -- 주소 -> 사용자
    FOREIGN KEY (
      COL4 -- 주소번호
    )
    REFERENCES TABLE3 ( -- 주소
      COL -- 주소번호
    );

-- 진행중인프로젝트
ALTER TABLE Temporary4
  ADD CONSTRAINT FK_TABLE4_TO_Temporary4 -- 자료 -> 진행중인프로젝트
    FOREIGN KEY (
      COL4 -- 자료번호
    )
    REFERENCES TABLE4 ( -- 자료
      COL -- 자료번호
    );

-- 진행중인프로젝트
ALTER TABLE Temporary4
  ADD CONSTRAINT FK_Temporary5_TO_Temporary4 -- 프로젝트그룹 -> 진행중인프로젝트
    FOREIGN KEY (
      COL -- 프로젝트그룹번호
    )
    REFERENCES Temporary5 ( -- 프로젝트그룹
      COL2 -- 프로젝트그룹번호
    );

-- 사용자프로젝트목록
ALTER TABLE TABLE2
  ADD CONSTRAINT FK_Temporary4_TO_TABLE2 -- 진행중인프로젝트 -> 사용자프로젝트목록
    FOREIGN KEY (
      id2 -- 진행중인프로젝트 번호
    )
    REFERENCES Temporary4 ( -- 진행중인프로젝트
      id -- 진행중인프로젝트 번호
    );

-- 프로젝트그룹
ALTER TABLE Temporary5
  ADD CONSTRAINT FK_stud_TO_Temporary5 -- 연구원 -> 프로젝트그룹
    FOREIGN KEY (
      id -- 연구원번호
    )
    REFERENCES stud ( -- 연구원
      id -- 연구원번호
    );

-- 팀장
ALTER TABLE tchr
  ADD CONSTRAINT FK_Temporary_TO_tchr -- 사용자 -> 팀장
    FOREIGN KEY (
      id -- 강사번호
    )
    REFERENCES Temporary ( -- 사용자
      id -- 사용자번호
    );

-- 팀장
ALTER TABLE tchr
  ADD CONSTRAINT FK_TABLE_TO_tchr -- 프로젝트관리 -> 팀장
    FOREIGN KEY (
      COL2 -- 프로젝트관리번호
    )
    REFERENCES TABLE ( -- 프로젝트관리
      COL2 -- 프로젝트관리번호
    );

-- 팀장
ALTER TABLE tchr
  ADD CONSTRAINT FK_TABLE5_TO_tchr -- 학력 -> 팀장
    FOREIGN KEY (
      COL -- 학력번호
    )
    REFERENCES TABLE5 ( -- 학력
      COL -- 학력번호
    );

-- 연구원
ALTER TABLE stud
  ADD CONSTRAINT FK_Temporary_TO_stud -- 사용자 -> 연구원
    FOREIGN KEY (
      id -- 연구원번호
    )
    REFERENCES Temporary ( -- 사용자
      id -- 사용자번호
    );

-- 연구원
ALTER TABLE stud
  ADD CONSTRAINT FK_TABLE5_TO_stud -- 학력 -> 연구원
    FOREIGN KEY (
      COL2 -- 학력번호
    )
    REFERENCES TABLE5 ( -- 학력
      COL -- 학력번호
    );

-- 종료된프로젝트
ALTER TABLE Temporary6
  ADD CONSTRAINT FK_Temporary4_TO_Temporary6 -- 진행중인프로젝트 -> 종료된프로젝트
    FOREIGN KEY (
      id2 -- 진행중인프로젝트 번호
    )
    REFERENCES Temporary4 ( -- 진행중인프로젝트
      id -- 진행중인프로젝트 번호
    );

-- 예정중인프로젝트
ALTER TABLE Temporary7
  ADD CONSTRAINT FK_TABLE4_TO_Temporary7 -- 자료 -> 예정중인프로젝트
    FOREIGN KEY (
      COL -- 자료번호
    )
    REFERENCES TABLE4 ( -- 자료
      COL -- 자료번호
    );