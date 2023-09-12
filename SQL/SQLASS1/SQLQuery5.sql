 --string
 DECLARE @myVar1 char(10) = 'sup18';
 DECLARE @myVar2 AS varchar(20) = 'SUP23RIYA';
 DECLARE @myVar3 AS varchar(max) = 'HappyFromInside777@';
 DECLARE @myVar4 nchar(20) = N'中国哲学书电子化计划';
 PRINT @myVar1;
 PRINT @myVar2;
 PRINT @myVar3;
 PRINT @myVar4;
 

 --Numerical
 DECLARE @myVar6 Bigint = '9893678276';
 DECLARE @myVar7 Smallint = '30000';
 DECLARE @myVar8 Tinyint = '10';
 DECLARE @myVar9 Decimal(5,2) = '12.08';
 DECLARE @myVar10 Numeric(5,2) ='456.98';
 DECLARE @myVar11 Bit ='0';
 DECLARE @myVar12 Float ='0.5695';
 DECLARE @myVar13 Real ='12435.3541389';
 PRINT @myVar6;
 PRINT @myVar7;
 PRINT @myVar8;
 PRINT @myVar9;
 PRINT @myVar10;
 PRINT @myVar11;
 PRINT @myVar12;
 PRINT @myVar13;

 --Date
 DECLARE @myVar14 Date = '2001-04-25';
 DECLARE @myVar15 Datetime = '09-05-23';
 DECLARE @myVar16 Datetime2 = '2022-10-27 21:45:50.786';
 DECLARE @myVar17 Datetimeoffset = '2022-10-27 21:45:50.1629832';
 DECLARE @myVar18 Smalldatetime ='2004-11-30 11:13:17';
 DECLARE @myVar19 Time ='23:10:23.1286289';
 DECLARE @myVar20 BINARY(5) = 0x1176;
 DECLARE @myVar21 VARBINARY(50) = 0x11765;
 PRINT @myVar14;
 PRINT @myVar15;
 PRINT @myVar16;
 PRINT @myVar17;
 PRINT @myVar18;
 PRINT @myVar19;
 PRINT @myVar20;
 PRINT @myVar21;

 --concatination
 PRINT 'MY USERNAME IS '+CAST(@myvar1 AS VARCHAR(5))+' AND PASSWORD IS '+@myvar3+' AND PHONE NUMBER IS '+CAST(@myvar6 AS VARCHAR(10));