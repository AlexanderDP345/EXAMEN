import java.util.Date;
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
         // Crear un cliente
    Cliente cliente = new Cliente("12345", "Juan", "Perez", "123 street", 555123456, 123456789);

    // Agregar eventos bancarios al cliente (hasta 5 eventos)
    EventoBancario evento1 = new EventoBancario(new Date(), "Compra en línea", "Se realizó una compra en línea de $100.");
    EventoBancario evento2 = new EventoBancario(new Date(), "Depósito de salario", "Depósito mensual del salario.");
    EventoBancario evento3 = new EventoBancario(new Date(), "Retiro en efectivo", "Se retiraron $50 en efectivo de un cajero.");
    EventoBancario evento4 = new EventoBancario(new Date(), "Pago de factura", "Se pagó una factura de servicios públicos.");
    EventoBancario evento5 = new EventoBancario(new Date(), "Transferencia bancaria", "Se recibió una transferencia de $200.");
    EventoBancario evento6 = new EventoBancario(new Date(), "Compra de comestibles", "Se realizó una compra de comestibles por $75.");
    cliente.agregarEventoBancario(evento1);
    cliente.agregarEventoBancario(evento2);
    cliente.agregarEventoBancario(evento3);
    cliente.agregarEventoBancario(evento4);
    cliente.agregarEventoBancario(evento5);
    cliente.agregarEventoBancario(evento6);  // Esto mostrará un mensaje de que se alcanzó el límite de 5 eventos
    System.out.println(evento1);
    System.out.println(evento2);
    System.out.println(evento3);
    System.out.println(evento4);
    System.out.println(evento5);
    System.out.println(evento6);
    CuentaFree cuentaFree2 = new CuentaFree(true);

    String[] beneficiosStrings = cuentaFree.getBeneficios();

    System.out.println("Beneficios de la cuenta Free:");
    for (String beneficio : beneficios) {
        System.out.println(beneficio);
    }
    }
    

}