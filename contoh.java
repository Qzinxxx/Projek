class Phone {
    private String merk;
    private int harga;
    public Phone(){

    }
    public Phone(String merk) {
        this.merk = merk;
    }
    public Phone(String merk, int harga) {
    this.merk = merk;
    this.harga = harga;
    }
    public void isiPhone(String merk){
        this.merk = merk;
    }
    public void isiPhone(String merk, int harga) {
        this.merk = merk;
        this.harga = harga;
    }
    public void lihatPhone(){
        System.out.println("merk: " + merk);
        System.out.println("harga: " + harga);
        System.out.println("");
    }
}


class Contoh {
    public static void main(String[] args) {
        System.out.println("");
        Phone p1 = new Phone();
        Phone p2 = new Phone("vivo");
        Phone p3 = new Phone("asus", 50000);
        System.out.println("perbedaan output masing konstruktor");
        p1.lihatPhone();
        p2.lihatPhone();
        p3.lihatPhone();
        Phone p4,p5;
        p4 = new Phone();
        p5 = new Phone();
        p4.isiPhone("esia");
        p5.isiPhone("esia", 10000);
        System.out.println("perbedaan output masing method");
        p4.lihatPhone();
        p5.lihatPhone();
    }
}