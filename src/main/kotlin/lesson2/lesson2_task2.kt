fun main() {
    val employees = 50
    val interns = 30
    val staffAll = employees + interns
    val salaryEmployee = 30000
    val salaryIntern = 20000
    val sumSalaryEmployees = employees * salaryEmployee
    val sumSalaryInterns = interns * salaryIntern
    val sumSalaryStaffAll = sumSalaryEmployees + sumSalaryInterns
    val avarageSalary = sumSalaryStaffAll / staffAll

    println("кол-во сотрудников: " + employees)
    println("кол-во интернов: " + interns)
    println("весь персонал:" + staffAll)
    println("зарплата сотрудник: " + salaryEmployee)
    println("зарплата интерна: " + salaryIntern)
    println("общие выплоты сотрудникам: " + sumSalaryEmployees)
    println("общие выплоты интернам: " + sumSalaryInterns)
    println("общие выалты всему персоналу: " + sumSalaryStaffAll)
    println("средняя зарплата: " + avarageSalary)
}
