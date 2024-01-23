fun main() {

    var employees = 50
    var interns = 30
    var staffAll = employees + interns
    var salaryEmployee = 30000
    var salaryIntern = 20000
    var sumSalaryEmployees = employees * salaryEmployee
    var sumSalaryInterns = interns * salaryIntern
    var sumSalaryStaffAll =  sumSalaryEmployees + sumSalaryInterns
    var avarageSalary = sumSalaryStaffAll / staffAll

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


