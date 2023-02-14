public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;
        if (isBluetoothEnabled){
            //send file
            fileSended++;
            System.out.println("archivo enviado");
        }else {
            System.out.println("porfavor enciende el bluetooth");
        }
    }
}
