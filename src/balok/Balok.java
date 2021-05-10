package balok;


public class Balok implements rumus{
    double panjang,lebar,tinggi,luas,keliling,volume,permukaan;

    public Balok(double panjang, double lebar, double tinggi){
    this.panjang=panjang;
    this.lebar=lebar;
    this.tinggi=tinggi;
    }

    @Override
    public double Luas() {
        luas= this.panjang*this.lebar;
        return luas;
    }

    @Override
    public double Keliling() {
        keliling = 2*(this.panjang+this.lebar);
        return keliling;
    }
    public double Volume(){
        double volume = this.panjang*this.lebar*this.tinggi;
        return volume;
    }
    
    public double Luas(double tinggi) {
        return (2*(this.panjang*this.lebar+this.panjang*this.tinggi+this.lebar*this.tinggi));
        
    }
}

