# Write your MySQL query statement below
select email FROM person 
group by email
having count(email)>1;
