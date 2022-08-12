public class BangunRuang extends BangunDatar {
    public float alasSisiTegak;
    public BangunRuang (){

    }

    //KUBUS
    public float luasPermukaanKubus(){
        // Lp = 6 x Luas alas
        return 6 * super.luasPersegi();
    }

    public float volumeKubus(){
        // V = sisi^3
        return (float) Math.pow(super.sisi, 3);
    }

    //BALOK
    public float luasPermukaanBalok(){
        // Lp = 2 x (pl + lt + pt)
        return 2 * (super.luasPersegiPanjang() + (super.lebar * super.tinggi) + (super.panjang * super.tinggi));
    }

    public float volumeBalok(){
        // V = p x l x t
        return super.luasPersegiPanjang() * super.tinggi;
    }

    //PRISMA SEGITIGA
    public float luasPermukaanPrismaSegitiga(){
        // Lp = (2 x Luas alas) + (Keliling alas x tinggi prisma)
        float tinggiPrisma = super.panjang;
        float kelilingAlas = super.alas + super.tinggi + super.sisi;
        return (2 * super.luasSegitiga()) + (kelilingAlas * tinggiPrisma);
    }

    public float volumePrismaSegitiga(){
        // V = Luas alas x t
        float tinggiPrisma = super.panjang;
        return super.luasSegitiga() * tinggiPrisma;
    }

    //LIMAS SEGITIGA
    public float luasPermukaanLimasSegitiga(){
        // Lp = Luas alas + Luas selimut
        // Luas selimut = 3 x luas sisi tegak
        // Luas sisi tegak = 1/2 x alas sisi tegak x tinggi sisi tegak
        // tinggi sisi tegak = Akar((1/2 x alas sisi tegak)^2 + tinggi limas)
        float tinggiSisiTegak = (float) (Math.sqrt(Math.pow((float)(1/2 * alasSisiTegak), 2) + Math.pow(super.tinggi, 2)));
        float luasSisiTegak = (float) (1/2 * alasSisiTegak * tinggiSisiTegak);
        float luasSelimut = 3 * luasSisiTegak;
        float luasAlas = (float) (Math.sqrt(Math.pow(alasSisiTegak, 2)) - Math.pow((float)(1/2 * alasSisiTegak), 2));

        return luasAlas + luasSelimut;
    }

    public float volumeLimasSegitiga(){
        // V = 1/3 x Luas alas x t
        float luasAlas = (float) (Math.sqrt(Math.pow(alasSisiTegak, 2)) - Math.pow((float)(1/2 * alasSisiTegak), 2));

        return (float) (1/3 * luasAlas * super.tinggi);
    }

    //KERUCUT
    public float luasPermukaanKerucut(){
        // Lp = Luas alas + (PI x r x s)
        // s = garis pelukis = Akar(r^2 + t^2)
        float garisPelukis = (float) (Math.sqrt(Math.pow(super.jariJari, 2) + Math.pow(super.tinggi, 2)));

        return (float) (super.luasLingkaran() + (PI * super.jariJari * garisPelukis));
    }

    public float volumeKerucut(){
        // V = 1/3 x Luas alas x t
        return (float) (1/3 * super.luasLingkaran() * super.tinggi);
    }

    //TABUNG
    public float luasPermukaanTabung(){
        // Lp = 2 x PI x r x (r + t)
        return 2 * PI * super.jariJari * (super.jariJari + super.tinggi);
    }

    public float volumeTabung(){
        // V = Luas alas x t
        return super.luasLingkaran() * super.tinggi;
    }

    //BOLA
    public float luasPermukaanBola(){
        // Lp = 4 x Luas lingkaran
        return 4 * super.luasLingkaran();
    }

    public float volumeBola(){
        // V = 4/3 x PI x r^3
        return (float) (4/3 * PI * Math.pow(super.jariJari, 3));
    }
}
