import java.util.ArrayList;

public class Cashier {
    private ArrayList<Item> items;

    public Cashier() {
        items = new ArrayList<>();
    }

    public void addItem(double p, String c, String n, int j) {
        items.add(new Item(c, n, p, j));
        System.out.println("Barang ditambahkan.");
    }

    public void removeItem(String code) {
        for (Item item : items) {
            if (item.getCode().equals(code)) {
                items.remove(item);
                System.out.println("Barang dihapus.");
                return;
            }
        }
        System.out.println("Barang tidak ditemukan.");
    }

    public double displayTotal() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice() * item.getJumlah();
        }
        return total;
    }

    public void displayItem(){
        for (Item item : items) {
            double hargaItem = item.getPrice() * item.getJumlah();
            System.out.println("Kode Item : " + item.getCode());
            System.out.println("Nama Item : " + item.getName());
            System.out.println("Harga Item : " + item.getPrice());
            System.out.println("Jumlah Item : " + item.getJumlah());
            System.out.println("Total Harga Item : " + hargaItem);
        }
    }

    public void displayProsesBayar(double bayar){
        double total = displayTotal();
        if(bayar<total){
            System.out.println("Pembayaran Tidak Cukup");
        }
        else{
            double kembali = bayar - total;
            System.out.println("Pembayaran Berhasil");
            System.out.println("Total Bayar : " + bayar);
            System.out.println("Kembali : " + kembali);
        }
    }
}