public class Pembayaran {

    private boolean status;

    public Pembayaran() {
        status = false;
    }

    public void bayar(String rekening, int nominal, double hargaPaket)
        throws InvalidPaymentException {

    if (!rekening.equals("12345678")) {
        throw new InvalidPaymentException(
                "Harap memasukkan nomor rekening yang benar!");
    }

    if (nominal < hargaPaket) {
        throw new InvalidPaymentException(
                "Nominal pembayaran kurang.");
    }

    status = true;
}

    public boolean isStatus() {
        return status;
    }
}