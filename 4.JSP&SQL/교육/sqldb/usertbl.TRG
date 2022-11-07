TYPE=TRIGGERS
triggers='CREATE DEFINER=`root`@`localhost` TRIGGER backUserTBL_UpdateTrg\nAFTER UPDATE\nON usertbl\nFOR EACH ROW\nBEGIN\nINSERT INTO backup_userTBL VALUES\n(\nOLD.userID, OLD.userName, OLD.birthYear, OLD.addr, OLD.mobile1,\nOLD.mobile2, OLD.height, OLD.mDate,\'수정\',CURDATE(),\nCURRENT_USER()\n);\nEND' 'CREATE DEFINER=`root`@`localhost` TRIGGER backUserTBL_DeleteTrg\nAFTER DELETE\nON usertbl\nFOR EACH ROW\nBEGIN\nINSERT INTO backup_userTBL VALUES\n(\nOLD.userID, OLD.userName, OLD.birthYear, OLD.addr, OLD.mobile1,\nOLD.mobile2, OLD.height, OLD.mDate,\'삭제\',CURDATE(),\nCURRENT_USER()\n);\nEND'
sql_modes=1411383296 1411383296
definers='root@localhost' 'root@localhost'
client_cs_names='utf8mb4' 'utf8mb4'
connection_cl_names='utf8mb4_general_ci' 'utf8mb4_general_ci'
db_cl_names='utf8mb4_unicode_ci' 'utf8mb4_unicode_ci'
created=165958343912 165958343914
