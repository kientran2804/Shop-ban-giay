create database DUAN12
go 
use DUAN12
go
create table NGUOIDUNG(
	MAND NVARCHAR(50) PRIMARY KEY,
	HOTEN NVARCHAR(50),
	MATKHAU NVARCHAR(50),
	GIOITINH BIT,
	DIACHI NVARCHAR(250),
	EMAIL NVARCHAR(50),
	SDT NVARCHAR(11),
	CHUCVU BIT
)

GO

create table KHACHHANG(
	MAKH NCHAR(7) PRIMARY KEY,
	HOTEN NVARCHAR(50),
	GIOITINH BIT,
	DIACHI NVARCHAR(100),
	SDT NVARCHAR(10)
)

GO

create table SANPHAM(
	MASP NCHAR(7) PRIMARY KEY,
	TENSP NVARCHAR(50),
	GIA FLOAT,
	SOLUONG INT,
	NGAYNHAP DATE,
	HANSUDUNG DATE,
	XUATXU NVARCHAR(50),
	MOTA NVARCHAR(250),
	MAND NVARCHAR(50),
	HINH NVARCHAR(50) Null,
	FOREIGN KEY (MAND) REFERENCES NGUOIDUNG(MAND)
)
GO

create table HOADON(
	MAHD INT PRIMARY KEY not null,
	TENHANG NVARCHAR(250),
	SOLUONG INT,
	GIA FLOAT,
	MAND NVARCHAR(50),
	MAKH NCHAR(7),
	FOREIGN KEY (MAND) REFERENCES NGUOIDUNG(MAND),
	FOREIGN KEY (MAKH) REFERENCES KHACHHANG(MAKH) on delete cascade on update cascade
)
GO
create table CHITIETHOADON(
	MAHD INT,
	MASP NCHAR(7),
	NGAYBAN DATE,
	PRIMARY KEY (MAHD,MASP),
    FOREIGN KEY (MaHD) REFERENCES hoadon(maHD),
    FOREIGN KEY (Masp) REFERENCES sanpham(masp)
)
GO





INSERT INTO NGUOIDUNG
	   VALUES (N'ND1', N'LUONG THI THUY LANH',N'LANHLUONG', 0, N'TANH LINH', N'LUONGLANH090902@GMAIL.COM', N'0976649343',0),
			   (N'ND2', N'NGUYEN VAN TRIET', N'TRIET0909', 1, N'BINH THUAN',N'TRIET@GMAIL.COM',N'0974635876', 1),
			   (N'ND3',N'NGUYEN VAN TEO',N'TEONV',1, N'DA NANG', N'TEO@GMAIL.COM', N'0876543219', 1 ),
			   (N'ND4', N'NGUYEN THI THU',N'THU0909', 0, N'HA NOI', N'THU@GMAIL.COM',N'0943218765',0),
			   (N'ND5', N'BUI ANH KHOA',N'SA123', 0, N'HA NOI', N'KHOA@GMAIL.COM',N'0869136020',0);


INSERT INTO KHACHHANG
	   VALUES (N'KH01', N'NGUYEN THI NHUNG',0, N'NINH BINH', N'0976543219'),
		      (N'KH02', N'HAI YEN', 0, N'BINH THUAN', N'0975432178'),
			  (N'KH04', N'NGUYEN DINH CUONG', 1, N'TP.HCM', N'0869136020'),
			  (N'KH03', N'BUI ANH KHOA', 1, N'TP.HCM', N'0635418765'),
			  (N'KH05', N'DOAN NHAN TAN', 1, N'DONG NAI', N'0868694020'),
			  (N'KH06', N'NGUYEN HOAI NAM', 1, N'BAC LIEU', N'0635418765'),
			  (N'KH07', N'TRUONG TOAN THANG', 1, N'TRANG DAI', N'0864268020'),
			  (N'KH08', N'NGUYEN TRUONG VINH', 1, N'QUANG BIEN', N'0635418765'),
			  (N'KH09', N'NGUYEN THI BAY', 1, N'HA NOI', N'0841635974'),
			  (N'KH10', N'HO TIEN DUONG', 1, N'TP.HCM', N'0865786020'),
			  (N'KH11', N'BUI THI MINH HIEU', 1, N'HAI PHONG', N'0712548694'),
			  (N'KH12', N'NGUYEN THI HIEN', 1, N'DAKLAK', N'0865786020'),
			  (N'KH13', N'HO TAT THANH', 1, N'GIA LAI', N'0865786020'),
			  (N'KH14', N'LE THI THU HUONG', 1, N'LAM DONG', N'1578963241'),
			  (N'KH15', N'NGUYEN VAN SANG', 1, N'TP.HCM', N'0158745621'),
			  (N'KH16', N'NGUYEN THI BAY', 1, N'TP.HCM', N'0984567458');



INSERT INTO SANPHAM
	   VALUES (N'SP1',N'NIKE JORDAN 1',20000000,900,'2021-01-01','2022-12-12', N'HA NOI',N'FULL SIZE', N'ND1', '1.jpg'),
	          (N'SP2', N'NIKE AIR MAX 90', 12000000,1000,'2020-09-02','2022-09-12', N'TP.HCM', N'FULL SIZE', N'ND2', '123.png'),
			  (N'SP3', N'NIKE AIR FORCE 1', 9000000,1000,'2020-09-02','2022-09-12', N'TP.HCM', N'FULL SIZE', N'ND1', '123.png'),
			  (N'SP4', N'NIKE SF AF1', 4000000,1000,'2020-09-02','2022-09-12', N'TP.HCM', N'FULL SIZE', N'ND1', '123.png'),
			  (N'SP5', N'NIKE UPTEMPO', 5000000,1000,'2020-09-02','2022-09-12', N'TP.HCM', N'FULL SIZE', N'ND1', '123.png'),
			  (N'SP6', N'NIKE CORTEZ', 3500000,1000,'2020-09-02','2022-09-12', N'TP.HCM', N'FULL SIZE', N'ND1', '123.png'),
			  (N'SP7', N'NIKE VAPORMAX ACE', 4500000,1000,'2020-09-02','2022-09-12', N'TP.HCM', N'FULL SIZE', N'ND1', '123.png'),
			  (N'SP8', N'ADIDAS YEEZY', 1450000,1000,'2020-09-02','2022-09-12', N'TP.HCM', N'FULL SIZE', N'ND1', '123.png'),
			  (N'SP9', N'ADIDAS ULTRA BOOST', 1450000,1000,'2020-09-02','2022-09-12', N'TP.HCM', N'FULL SIZE', N'ND1', '123.png'),
			  (N'SP10', N'ADIDAS YEEZY 300', 1450000,1000,'2020-09-02','2022-09-12', N'TP.HCM', N'FULL SIZE', N'ND1', '123.png'),
			  (N'SP11', N'ADIDAS YEEZY 700', 1450000,1000,'2020-09-02','2022-09-12', N'TP.HCM', N'FULL SIZE', N'ND1', '123.png'),
			  (N'SP12', N'ADIDAS NMD', 1450000,1000,'2020-09-02','2022-09-12', N'TP.HCM', N'FULL SIZE', N'ND1', '123.png'),
			  (N'SP13', N'ADIDAS STAN SMITH', 1450000,1000,'2020-09-02','2022-09-12', N'TP.HCM', N'FULL SIZE', N'ND1', '123.png'),
			  (N'SP14', N'ADIDAS X DRAGON BALL', 1450000,1000,'2020-09-02','2022-09-12', N'TP.HCM', N'FULL SIZE', N'ND1', '123.png'),
			  (N'SP15', N'ADIDAS EQT ', 1450000,1000,'2020-09-02','2022-09-12', N'TP.HCM', N'FULL SIZE', N'ND1', '123.png');
INSERT INTO HOADON
	   VALUES (1,N'NIKE JORDAN 1', 10,20000, N'ND1', N'KH01'),
	          (2,N'NIKE AIR MAX 90', 20,20000, N'ND1', N'KH03'),
			  (3,N'NIKE AIR FORCE 1', 30,20000, N'ND3', N'KH02'),
			  (4,N'NIKE SF AF1', 30,20000, N'ND3', N'KH02'),
			  (5,N'NIKE UPTEMPO', 25,20000, N'ND3', N'KH02'),
			  (6,N'NIKE CORTEZ', 35,20000, N'ND3', N'KH02'),
			  (7,N'NIKE FB', 15,20000, N'ND3', N'KH02'),
			  (8,N'ADIDAS YEEZY 300', 15,20000, N'ND3', N'KH02'),
			  (9,N'ADIDAS YEEZY 700', 15,20000, N'ND3', N'KH02'),
			  (10,N'ADIDAS NMD', 15,20000, N'ND3', N'KH02'),
			  (11,N'ADIDAS STAN SMITH', 15,20000, N'ND3', N'KH02'),
			  (12,N'ADIDAS X DRAGON BALL', 15,20000, N'ND3', N'KH02'),
			  (13,N'ADIDAS EQT', 15,20000, N'ND3', N'KH02');


INSERT INTO CHITIETHOADON
	   VALUES (1, N'SP2','12-12-2021'),
	           (3, N'SP2','11-12-2021'),
	           (2, N'SP2','11-12-2021'),
			   (3, N'SP3','10-12-2021');




SELECT * FROM NGUOIDUNG
SELECT * FROM SANPHAM
SELECT * FROM KHACHHANG
SELECT * FROM HOADON
SELECT * FROM CHITIETHOADON
 
SELECT TOP 1 MAHD FROM HOADON ORDER BY (MAHD) DESC 
-- SELECT MASP FROM CHITIETHOADON cthd sp 
-- GO 
-- --------------------------------------------------------------

SELECT SUM(GIA * sanpham.soluong) AS 'DOANH THU'
FROM CHITIETHOADON
JOIN SANPHAM ON SANPHAM.MASP = CHITIETHOADON.MASP
GO
----------------------------------------------------

-- CREATE PROC SP_BAN(@MASP NCHAR(7), @SL INT)
-- AS BEGIN
-- UPDATE SANPHAM
-- SET SOLUONG = SOLUONG -@SL
-- WHERE MASP = @MASP
-- END
-- GO

------------------------------------------------------------------
--??NG NH?P
-- DROP procedure DN_DANGNHAP
/*alter procedure dn_dangnhdp (@MATKHAU NVARCHAR(50), @EMAIL NVARCHAR(50))*/
--??ng nh?p
IF OBJECT_ID ('DN_DANGNHAP') IS NOT NULL
	DROP PROC DN_DANGNHAP
GO
CREATE PROC DN_DANGNHAP (@MAND NVARCHAR(50), @MATKHAU NVARCHAR(50))
AS
BEGIN
	IF EXISTS (SELECT MAND, MATKHAU FROM NGUOIDUNG WHERE MATKHAU = @MATKHAU AND MAND = @MAND)
	BEGIN
		PRINT (N'T�N NG??I D�NG HO?C MK KH�NG T?N T?I')
	END
	ELSE
	BEGIN
		SELECT MAND, MATKHAU FROM NGUOIDUNG
		WHERE HOTEN = @MAND AND MATKHAU = @MATKHAU
		PRINT (N'??NG NH?P TH�NH C�NG')
		
	END
END
GO
EXEC DN_DANGNHAP N'ND1',N'LANHLUONG'
EXEC DN_DANGNHAP N'LUONG THI THUY LANH',N'LANHLUONG'
------------------------------------------------------------------
-----------------------------TH?NG K� Ng�y Th�ng n?m-----------------------------
-- drop  proc SP_THONGKEDT 
go 
create proc SP_THONGKEDT (@ngay_thang_nam varchar(20))
as begin 
	select
		SAP.MASP,
		SAP.TENSP,
		SUM(HD.SOLUONG) SOLUONG,		
		SAP.GIA,
		(SUM(HD.SOLUONG) * SAP.gia) TONG
	from SANPHAM SAP
		join CHITIETHOADON CTHD on SAP.MASP = CTHD.MASP
		 JOIN HOADON HD ON HD.MAHD=CTHD.MAHD 
	where NGAYBAN like '%' + @ngay_thang_nam + '%'
	group by SAP.MASP, TENSP,SAP.GIA
end
go
exec SP_THONGKEDT '2021-12-12'

GO
create proc SP_THONGKEDT_TK_3
as begin 
	select
		SAP.MASP,
		SAP.TENSP,
		SUM(HD.SOLUONG) SOLUONG,		
		SAP.GIA,
		(SUM(HD.SOLUONG) * SAP.gia) TONG
	from SANPHAM SAP
		join CHITIETHOADON CTHD on SAP.MASP = CTHD.MASP
		 JOIN HOADON HD ON HD.MAHD=CTHD.MAHD
	group by SAP.MASP, TENSP,SAP.GIA
end

exec SP_THONGKEDT_TK
select
		SAP.MASP,
		SAP.TENSP,
		SUM(HD.SOLUONG) SOLUONG,		
		SAP.GIA,
		(SUM(HD.SOLUONG) * SAP.gia) TONG
	from SANPHAM SAP
		join CHITIETHOADON CTHD on SAP.MASP = CTHD.MASP
		 JOIN HOADON HD ON HD.MAHD=CTHD.MAHD
	group by SAP.MASP, TENSP,SAP.GIA