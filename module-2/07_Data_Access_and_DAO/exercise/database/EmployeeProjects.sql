SELECT employee.employee_id, department_id, first_name, last_name, birth_date, hire_date
FROM employee
JOIN project_employee
	ON project_employee.employee_id = employee.employee_id
WHERE project_employee.project_id =