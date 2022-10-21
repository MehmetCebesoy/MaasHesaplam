
    public class Employee {
        String name;
        double salary;
        int workHours, hireYear;
        Employee(String name, double salary, int workHours, int hireYear) {
            this.name = name;
            this.salary = salary;
            this.workHours = workHours;
            this.hireYear = hireYear;
        }
        public  double tax(){
            if(this.salary >= 1000){
                return this.salary*0.03;
            }
            return 0.00;

        }
        public double bonus(){
            if(this.workHours> 40){
                return 30*(this.workHours-40);
            }
            return 0.0;

        }
        public double raiseSalary(){
            int year = 2021-this.hireYear;
            if (year < 0){
                return 0.0;
            }
            else if(year < 10){
                return salary*0.05;
            }
            else if(year > 9 && year < 20){
                return salary*0.1;
            }
            else return salary*0.15;
        }
        public  void toString(Employee employee){
            System.out.println("Adı : "+ this.name);
            System.out.println("Maaşı : "+ this.salary);
            System.out.println("Çalışma Saati : "+this.workHours);
            System.out.println("Başlangıç Yılı : "+ this.hireYear);
            System.out.println("Vergi : "+ this.tax());
            System.out.println("Bonus : "+this.bonus());
            System.out.println("Maaş Artışı : "+this.raiseSalary());
            System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+(this.salary-this.tax()+this.bonus()));
            System.out.println("Toplam Maaş :"+ (this.salary-this.tax()+this.bonus()+this.raiseSalary()));


        }
    }


