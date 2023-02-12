public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        // bono 200
        salary = salary + 200;

        System.out.println(salary);

        //pension 50

        salary -= 50;
        System.out.println(salary);

        //2 horas extra 30 c/u
        //comida 45
        salary = salary +(2*30) - 45;
        System.out.println(salary);

        // Actualizando cadenas de texto

        String employeeName = "Fabian Andres";
        employeeName = employeeName + " Cuartas";
        System.out.println(employeeName);
        employeeName = "El Mejor " + employeeName;
        System.out.println(employeeName);


    }
}
