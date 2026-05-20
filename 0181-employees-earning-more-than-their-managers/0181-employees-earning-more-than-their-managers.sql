# Write your MySQL query statement below
select emp.name as Employee
from Employee m, Employee emp 
where m.id = emp.managerId and m.salary<emp.salary;