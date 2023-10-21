public class Main {
    public static void main(String[] args) {
        CuentaSueldo cuentaSueldo = new CuentaSueldo();
        cuentaSueldo.setSaldoDisponible(1500);

        CuentaFree cuentaFree = new CuentaFree();
        cuentaFree.setSaldoDisponible(20000);

        cuentaSueldo.setTasaInteresAnual(0.03);
        cuentaFree.setTasaInteresAnual(0.03);

        for (int mes = 1; mes <= 12; mes++) {
            double interesSueldo = cuentaSueldo.calcularInteresMensual();
            double interesFree = cuentaFree.calcularInteresMensual();
            System.out.println("\nMes " + mes + ": Interés Cuenta Sueldo: " + interesSueldo + ", Saldo: " + cuentaSueldo.getSaldoDisponible());
            System.out.println("Mes " + mes + ": Interés Cuenta Free: " + interesFree + ", Saldo: " + cuentaFree.getSaldoDisponible());
        }

        CuentaSueldo cuenta = new CuentaSueldo();
        String[] beneficios = {"ropa", "restaurante", "gym", "conciertos", "vuelos", "hotel"};
        cuenta.setBeneficios(beneficios);
        System.out.println(cuenta);
    }
}