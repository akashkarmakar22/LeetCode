# Write your MySQL query statement below
select d.name as Department, e.name as Employee, e.salary as Salary
from Employee e
join Department d
on e.DepartmentId = d.id
where salary =(select max(salary) from Employee where DepartmentId=e.DepartmentId);