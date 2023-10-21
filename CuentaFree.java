public class CuentaFree extends CuentaAhorro{
    private boolean numIlimitadoRetiro;

    public CuentaFree(boolean numIlimitadoRetiro) {
        this.numIlimitadoRetiro = numIlimitadoRetiro;
    }

    public CuentaFree() {
    }

    public boolean getNumIlimitadoRetiro() {
        return numIlimitadoRetiro;
    }

    public void setNumIlimitadoRetiro(boolean numIlimitado) {
        this.numIlimitadoRetiro = numIlimitado;
    }

    @Override
    public double calcularInteresMensual() {
        double interesMensual;
        interesMensual = (saldoDisponible * tasaInteresAnual)/12;
        saldoDisponible += interesMensual;
        return interesMensual;
    }

    @Override
    public String toString() {
        return "CuentaFree [numIlimitadoRetiro=" + numIlimitadoRetiro + "]";
    }
}
