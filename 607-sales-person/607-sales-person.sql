SELECT name from salesperson
where sales_id not in 
(
    select sales_id from orders where com_id in 
	(select com_id from company where name='RED')
)