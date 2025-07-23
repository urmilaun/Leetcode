# Write your MySQL query statement below
select a.name as Customers from Customers a  left join Orders ON a.id = customerId 
where customerId is Null