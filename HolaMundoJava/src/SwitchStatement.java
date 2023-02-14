public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "Dark";
        switch (colorModeSelected){
            case    "Lighht":
                System.out.println("Seleccionaste Light Mode");
                break;
            case "Nigth":
                System.out.println("seleccionaste Nigth Mode");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste Blue Dark Mode");
                break;
            case "Dark":
                System.out.println("Seleccionaste Dark Mode");
                break;
            default:
                System.out.println("Selecciona una opcion");
        }
    }
}
