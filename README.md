# ICS4U0-EmployeeManagementSystem
This is the user guide to the Employee Management System I made for the ICS4U0 course. 

## The main window
Employee info is found in tables. There are 2 tabs, one for full time employees and one for part time employees, each with their own table. On the bottom there is a search bar and button, on the right side there are buttons for adding, removing, editing, and showing all employees. Profile pictures will also be found on the right side, and appear when you select an employee in the table. On the tables, employee number, first name, last name, gender, location, deduction rate, gross pay, net pay, annual salary (FTE), hourly wage (PTE), hours per week (PTE), and weeks per year (PTE) are displayed. The 

## Saving, loading, importing and exporting
Data is saved in .txt files and can be loaded by going to **File -> Load** and then selecting the file you want to load. To save data, go to **File -> Save**. If a file has not yet been created or loaded, you will be prompted. To create a new file if a file has been created or loaded or to rename, go to **File -> Save As**. Profile pictures are files from the system the EMS is on, so if you want to move to a new system, please use **File -> Export** which is the same as Save As but it does not include filepaths to images. To load/import export files, use **File -> Load** or File -> Import (they now do the same thing). 

## Adding Employees
To add a new employee, click the **Add** button on the side of either tab. This will bring up a new window. Enter employee info into the fields provided. Employee Number, Deductions Rate, Annual Salary, Hourly Wage, Hours Per Week, and Weeks Per Year will only allow numbers to be inputted and will format the number. If an employee number that already exists is used, a warning dialog will appear when you submit and prevent you from submitting. To enable the employee-type specific fields, select the appropriate radio button.

## Editing Employees
To edit an employee, first select an employee in the table, and then press **Edit**. The row will be removed and the add employee dialog will be displayed with the field filled in with the old data. Change the appropriate fields and press **Submit** to re-add it to the table. **Cancel** will re-add the old data even if data has been edited. 

## Removing Employees
To remove an employee, select and employee in the table and then press **Remove**.

## Searching
Searching is by employee number, first name and last name. Type the query into the bar at the bottom and then press **Search**. Exact matches will be first, partial matches after. Matching employees will be the only ones displayed in their respective table. To see all employees after a search, press **Show All**. 


Have fun!
