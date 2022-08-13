package Kapal;

abstract public class Kapal {
    String nama;

    public void build(){
        System.out.println("Membuat " + nama);
    }

    public String getNama(){
        return this.nama;
    }

}
