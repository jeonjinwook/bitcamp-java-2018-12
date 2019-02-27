-- 수강신청
DROP TABLE IF EXISTS TABLE RESTRICT;

-- 임시 테이블
DROP TABLE IF EXISTS Temporary RESTRICT;

-- 강사
DROP TABLE IF EXISTS Temporary2 RESTRICT;

-- 학생
DROP TABLE IF EXISTS Temporary3 RESTRICT;

-- 주소
DROP TABLE IF EXISTS Temporary4 RESTRICT;

-- 교육과정
DROP TABLE IF EXISTS Temporary5 RESTRICT;

-- 강의실
DROP TABLE IF EXISTS Temporary6 RESTRICT;

-- 강의실사진
DROP TABLE IF EXISTS Temporary7 RESTRICT;

-- 매니저
DROP TABLE IF EXISTS Temporary8 RESTRICT;

-- 지점
DROP TABLE IF EXISTS Temporary9 RESTRICT;

-- 과목
DROP TABLE IF EXISTS TABLE2 RESTRICT;

-- 강사교육과정배정
DROP TABLE IF EXISTS TABLE3 RESTRICT;

-- 강사강의과목
DROP TABLE IF EXISTS TABLE4 RESTRICT;

-- 교육과정과목
DROP TABLE IF EXISTS TABLE5 RESTRICT;

-- 사용자
DROP TABLE IF EXISTS Temporary10 RESTRICT;

-- 수강신청
CREATE TABLE TABLE (
  COL43 <데이터 타입 없음> NOT NULL COMMENT '수강신청번호', -- 수강신청번호
  id2   <데이터 타입 없음> NULL     COMMENT '교육과정번호', -- 교육과정번호
  COL39 <데이터 타입 없음> NULL     COMMENT '결제상태', -- 결제상태
  COL40 <데이터 타입 없음> NULL     COMMENT '결제유형', -- 결제유형
  COL41 <데이터 타입 없음> NULL     COMMENT '결제일', -- 결제일
  COL   <데이터 타입 없음> NULL     COMMENT '신청일', -- 신청일
  COL2  <데이터 타입 없음> NULL     COMMENT '학생번호' -- 학생번호
)
COMMENT '수강신청';

-- 수강신청
ALTER TABLE TABLE
  ADD CONSTRAINT PK_TABLE -- 수강신청 기본키
    PRIMARY KEY (
      COL43 -- 수강신청번호
    );

-- 임시 테이블
CREATE TABLE Temporary (
)
COMMENT '임시 테이블';

-- 강사
CREATE TABLE Temporary2 (
  COL4 <데이터 타입 없음> NOT NULL COMMENT '강사번호', -- 강사번호
  COL  <데이터 타입 없음> NULL     COMMENT '최종학력', -- 최종학력
  COL2 <데이터 타입 없음> NULL     COMMENT '학교', -- 학교
  COL3 <데이터 타입 없음> NULL     COMMENT '전공', -- 전공
  COL5 <데이터 타입 없음> NULL     COMMENT '홈페이지' -- 홈페이지
)
COMMENT '강사';

-- 강사
ALTER TABLE Temporary2
  ADD CONSTRAINT PK_Temporary2 -- 강사 기본키
    PRIMARY KEY (
      COL4 -- 강사번호
    );

-- 학생
CREATE TABLE Temporary3 (
  COL   <데이터 타입 없음> NOT NULL COMMENT '학생번호', -- 학생번호
  COL7  <데이터 타입 없음> NULL     COMMENT '은행명', -- 은행명
  COL8  <데이터 타입 없음> NULL     COMMENT '계좌번호', -- 계좌번호
  COL9  <데이터 타입 없음> NULL     COMMENT '최종학력', -- 최종학력
  COL10 <데이터 타입 없음> NULL     COMMENT '전공' -- 전공
)
COMMENT '학생';

-- 학생
ALTER TABLE Temporary3
  ADD CONSTRAINT PK_Temporary3 -- 학생 기본키
    PRIMARY KEY (
      COL -- 학생번호
    );

-- 주소
CREATE TABLE Temporary4 (
  COL  <데이터 타입 없음> NOT NULL COMMENT '주소번호', -- 주소번호
  COL4 <데이터 타입 없음> NULL     COMMENT '우편번호', -- 우편번호
  COL5 <데이터 타입 없음> NULL     COMMENT '기본주소' -- 기본주소
)
COMMENT '주소';

-- 주소
ALTER TABLE Temporary4
  ADD CONSTRAINT PK_Temporary4 -- 주소 기본키
    PRIMARY KEY (
      COL -- 주소번호
    );

-- 교육과정
CREATE TABLE Temporary5 (
  id    <데이터 타입 없음> NOT NULL COMMENT '교육과정번호', -- 교육과정번호
  COL   <데이터 타입 없음> NULL     COMMENT '강의실번호', -- 강의실번호
  COL11 <데이터 타입 없음> NULL     COMMENT '교육과정명', -- 교육과정명
  COL12 <데이터 타입 없음> NULL     COMMENT '시작일', -- 시작일
  COL13 <데이터 타입 없음> NULL     COMMENT '종료일', -- 종료일
  COL14 <데이터 타입 없음> NULL     COMMENT '총강의시간', -- 총강의시간
  COL15 <데이터 타입 없음> NULL     COMMENT '일강의시간', -- 일강의시간
  COL42 <데이터 타입 없음> NULL     COMMENT '수강료', -- 수강료
  COL4  <데이터 타입 없음> NULL     COMMENT '매니저번호' -- 매니저번호
)
COMMENT '교육과정';

-- 교육과정
ALTER TABLE Temporary5
  ADD CONSTRAINT PK_Temporary5 -- 교육과정 기본키
    PRIMARY KEY (
      id -- 교육과정번호
    );

-- 강의실
CREATE TABLE Temporary6 (
  COL   <데이터 타입 없음> NOT NULL COMMENT '강의실번호', -- 강의실번호
  COL2  <데이터 타입 없음> NULL     COMMENT '지점번호', -- 지점번호
  COL30 <데이터 타입 없음> NULL     COMMENT '최대수용인원', -- 최대수용인원
  COL29 <데이터 타입 없음> NULL     COMMENT '교실명' -- 교실명
)
COMMENT '강의실';

-- 강의실
ALTER TABLE Temporary6
  ADD CONSTRAINT PK_Temporary6 -- 강의실 기본키
    PRIMARY KEY (
      COL -- 강의실번호
    );

-- 강의실사진
CREATE TABLE Temporary7 (
  COL2  <데이터 타입 없음> NOT NULL COMMENT '강의실사진번호', -- 강의실사진번호
  COL   <데이터 타입 없음> NULL     COMMENT '강의실번호', -- 강의실번호
  COL33 <데이터 타입 없음> NULL     COMMENT '교실사진' -- 교실사진
)
COMMENT '강의실사진';

-- 강의실사진
ALTER TABLE Temporary7
  ADD CONSTRAINT PK_Temporary7 -- 강의실사진 기본키
    PRIMARY KEY (
      COL2 -- 강의실사진번호
    );

-- 매니저
CREATE TABLE Temporary8 (
  COL4  <데이터 타입 없음> NOT NULL COMMENT '매니저번호', -- 매니저번호
  COL37 <데이터 타입 없음> NULL     COMMENT '직위', -- 직위
  COL   <데이터 타입 없음> NULL     COMMENT '팩스' -- 팩스
)
COMMENT '매니저';

-- 매니저
ALTER TABLE Temporary8
  ADD CONSTRAINT PK_Temporary8 -- 매니저 기본키
    PRIMARY KEY (
      COL4 -- 매니저번호
    );

-- 지점
CREATE TABLE Temporary9 (
  COL   <데이터 타입 없음> NOT NULL COMMENT '지점번호', -- 지점번호
  COL28 <데이터 타입 없음> NULL     COMMENT '지점명' -- 지점명
)
COMMENT '지점';

-- 지점
ALTER TABLE Temporary9
  ADD CONSTRAINT PK_Temporary9 -- 지점 기본키
    PRIMARY KEY (
      COL -- 지점번호
    );

-- 과목
CREATE TABLE TABLE2 (
  COL2 <데이터 타입 없음> NOT NULL COMMENT '과목번호', -- 과목번호
  COL  <데이터 타입 없음> NULL     COMMENT '과목명' -- 과목명
)
COMMENT '과목';

-- 과목
ALTER TABLE TABLE2
  ADD CONSTRAINT PK_TABLE2 -- 과목 기본키
    PRIMARY KEY (
      COL2 -- 과목번호
    );

-- 강사교육과정배정
CREATE TABLE TABLE3 (
  id   <데이터 타입 없음> NOT NULL COMMENT '교육과정번호', -- 교육과정번호
  COL4 <데이터 타입 없음> NOT NULL COMMENT '강사번호' -- 강사번호
)
COMMENT '강사교육과정배정';

-- 강사교육과정배정
ALTER TABLE TABLE3
  ADD CONSTRAINT PK_TABLE3 -- 강사교육과정배정 기본키
    PRIMARY KEY (
      id,   -- 교육과정번호
      COL4  -- 강사번호
    );

-- 강사강의과목
CREATE TABLE TABLE4 (
  COL2 <데이터 타입 없음> NOT NULL COMMENT '과목번호', -- 과목번호
  COL4 <데이터 타입 없음> NOT NULL COMMENT '강사번호' -- 강사번호
)
COMMENT '강사강의과목';

-- 강사강의과목
ALTER TABLE TABLE4
  ADD CONSTRAINT PK_TABLE4 -- 강사강의과목 기본키
    PRIMARY KEY (
      COL2, -- 과목번호
      COL4  -- 강사번호
    );

-- 교육과정과목
CREATE TABLE TABLE5 (
  id   <데이터 타입 없음> NOT NULL COMMENT '교육과정번호', -- 교육과정번호
  COL2 <데이터 타입 없음> NOT NULL COMMENT '과목번호' -- 과목번호
)
COMMENT '교육과정과목';

-- 교육과정과목
ALTER TABLE TABLE5
  ADD CONSTRAINT PK_TABLE5 -- 교육과정과목 기본키
    PRIMARY KEY (
      id,   -- 교육과정번호
      COL2  -- 과목번호
    );

-- 사용자
CREATE TABLE Temporary10 (
  COL4 <데이터 타입 없음> NOT NULL COMMENT '사용자번호', -- 사용자번호
  COL  <데이터 타입 없음> NULL     COMMENT '이름', -- 이름
  COL2 <데이터 타입 없음> NULL     COMMENT '이메일', -- 이메일
  COL8 <데이터 타입 없음> NULL     COMMENT '암호', -- 암호
  COL3 <데이터 타입 없음> NULL     COMMENT '전화', -- 전화
  COL7 <데이터 타입 없음> NULL     COMMENT '사진', -- 사진
  COL5 <데이터 타입 없음> NULL     COMMENT '주소번호', -- 주소번호
  COL6 <데이터 타입 없음> NULL     COMMENT '상세주소' -- 상세주소
)
COMMENT '사용자';

-- 사용자
ALTER TABLE Temporary10
  ADD CONSTRAINT PK_Temporary10 -- 사용자 기본키
    PRIMARY KEY (
      COL4 -- 사용자번호
    );

-- 수강신청
ALTER TABLE TABLE
  ADD CONSTRAINT FK_Temporary3_TO_TABLE -- 학생 -> 수강신청
    FOREIGN KEY (
      COL2 -- 학생번호
    )
    REFERENCES Temporary3 ( -- 학생
      COL -- 학생번호
    );

-- 수강신청
ALTER TABLE TABLE
  ADD CONSTRAINT FK_Temporary5_TO_TABLE -- 교육과정 -> 수강신청
    FOREIGN KEY (
      id2 -- 교육과정번호
    )
    REFERENCES Temporary5 ( -- 교육과정
      id -- 교육과정번호
    );

-- 강사
ALTER TABLE Temporary2
  ADD CONSTRAINT FK_Temporary10_TO_Temporary2 -- 사용자 -> 강사
    FOREIGN KEY (
      COL4 -- 강사번호
    )
    REFERENCES Temporary10 ( -- 사용자
      COL4 -- 사용자번호
    );

-- 학생
ALTER TABLE Temporary3
  ADD CONSTRAINT FK_Temporary10_TO_Temporary3 -- 사용자 -> 학생
    FOREIGN KEY (
      COL -- 학생번호
    )
    REFERENCES Temporary10 ( -- 사용자
      COL4 -- 사용자번호
    );

-- 교육과정
ALTER TABLE Temporary5
  ADD CONSTRAINT FK_Temporary6_TO_Temporary5 -- 강의실 -> 교육과정
    FOREIGN KEY (
      COL -- 강의실번호
    )
    REFERENCES Temporary6 ( -- 강의실
      COL -- 강의실번호
    );

-- 교육과정
ALTER TABLE Temporary5
  ADD CONSTRAINT FK_Temporary8_TO_Temporary5 -- 매니저 -> 교육과정
    FOREIGN KEY (
      COL4 -- 매니저번호
    )
    REFERENCES Temporary8 ( -- 매니저
      COL4 -- 매니저번호
    );

-- 강의실
ALTER TABLE Temporary6
  ADD CONSTRAINT FK_Temporary9_TO_Temporary6 -- 지점 -> 강의실
    FOREIGN KEY (
      COL2 -- 지점번호
    )
    REFERENCES Temporary9 ( -- 지점
      COL -- 지점번호
    );

-- 강의실사진
ALTER TABLE Temporary7
  ADD CONSTRAINT FK_Temporary6_TO_Temporary7 -- 강의실 -> 강의실사진
    FOREIGN KEY (
      COL -- 강의실번호
    )
    REFERENCES Temporary6 ( -- 강의실
      COL -- 강의실번호
    );

-- 매니저
ALTER TABLE Temporary8
  ADD CONSTRAINT FK_Temporary10_TO_Temporary8 -- 사용자 -> 매니저
    FOREIGN KEY (
      COL4 -- 매니저번호
    )
    REFERENCES Temporary10 ( -- 사용자
      COL4 -- 사용자번호
    );

-- 강사교육과정배정
ALTER TABLE TABLE3
  ADD CONSTRAINT FK_Temporary5_TO_TABLE3 -- 교육과정 -> 강사교육과정배정
    FOREIGN KEY (
      id -- 교육과정번호
    )
    REFERENCES Temporary5 ( -- 교육과정
      id -- 교육과정번호
    );

-- 강사교육과정배정
ALTER TABLE TABLE3
  ADD CONSTRAINT FK_Temporary2_TO_TABLE3 -- 강사 -> 강사교육과정배정
    FOREIGN KEY (
      COL4 -- 강사번호
    )
    REFERENCES Temporary2 ( -- 강사
      COL4 -- 강사번호
    );

-- 강사강의과목
ALTER TABLE TABLE4
  ADD CONSTRAINT FK_Temporary2_TO_TABLE4 -- 강사 -> 강사강의과목
    FOREIGN KEY (
      COL4 -- 강사번호
    )
    REFERENCES Temporary2 ( -- 강사
      COL4 -- 강사번호
    );

-- 강사강의과목
ALTER TABLE TABLE4
  ADD CONSTRAINT FK_TABLE2_TO_TABLE4 -- 과목 -> 강사강의과목
    FOREIGN KEY (
      COL2 -- 과목번호
    )
    REFERENCES TABLE2 ( -- 과목
      COL2 -- 과목번호
    );

-- 교육과정과목
ALTER TABLE TABLE5
  ADD CONSTRAINT FK_Temporary5_TO_TABLE5 -- 교육과정 -> 교육과정과목
    FOREIGN KEY (
      id -- 교육과정번호
    )
    REFERENCES Temporary5 ( -- 교육과정
      id -- 교육과정번호
    );

-- 교육과정과목
ALTER TABLE TABLE5
  ADD CONSTRAINT FK_TABLE2_TO_TABLE5 -- 과목 -> 교육과정과목
    FOREIGN KEY (
      COL2 -- 과목번호
    )
    REFERENCES TABLE2 ( -- 과목
      COL2 -- 과목번호
    );

-- 사용자
ALTER TABLE Temporary10
  ADD CONSTRAINT FK_Temporary4_TO_Temporary10 -- 주소 -> 사용자
    FOREIGN KEY (
      COL5 -- 주소번호
    )
    REFERENCES Temporary4 ( -- 주소
      COL -- 주소번호
    );