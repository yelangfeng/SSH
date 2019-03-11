
CREATE TABLE cst_customer (
  cust_id int primary key identity(1,1),
  cust_name varchar(32) not null,
  cust_source varchar(32),
  cust_industry varchar(32),
  cust_level varchar(32) ,
  cust_phone varchar(64) ,
  cust_mobile varchar(16),
)


