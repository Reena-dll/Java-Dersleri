public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    void printEmployee(){
        System.out.println("İsim : "+this.name);
        System.out.println("Maaş : "+this.salary);
        System.out.println("Haftalık Çalışma Saati : "+this.workHours);
        System.out.println("Giriş Yılı : "+this.hireYear);
        System.out.println("Vergi : "+this.tax());
        System.out.println("Bonus : "+this.bonus());
        System.out.println("Maaş Artışı : "+this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile Maaş : "+(this.salary+this.bonus()-this.tax()));
        System.out.println("Total Maaş : "+(this.salary+this.raiseSalary()));
    }

    double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        } else {
            return 0;
        }
    }

    int bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else
            return 0;
    }

    double raiseSalary(){
        if (2021-this.hireYear<10){
            return this.salary*0.05;
        }
        else if (2021-this.salary<20){
            return  this.salary*0.1;
        }
        else{
            return this.salary*0.15;
        }

    }
}
