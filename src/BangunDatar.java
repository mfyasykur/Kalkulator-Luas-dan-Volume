public class BangunDatar {
    protected float sisi, panjang, lebar, alas, tinggi, jariJari;
    protected final int PI = (22/7);

    public BangunDatar(){

    }

    //PERSEGI
    public float luasPersegi(){
        // L = s x s
        return sisi * sisi;
    }

    //PERSEGI PANJANG
    public float luasPersegiPanjang(){
        // L = p x l
        return panjang * lebar;
    }

    //SEGITIGA
    public float luasSegitiga(){
        // L = 1/2 x a x t
        return (float)(1/2 * alas * tinggi);
    }

    //TRAPESIUM
    public float luasTrapesium(){
        // L = 1/2 x (a+b) x t
        return (float)(1/2 * (alas + sisi) * tinggi);
    }

    //JAJAR GENJANG
    public float luasJajarGenjang(){
        // L = a x t
        return alas * tinggi;
    }

    //BELAH KETUPAT
    public float luasBelahKetupat(){
        // L = 1/2 x d1 x d2
        float d1 = sisi;
        float d2 = alas;
        return (float)(1/2 * d1 * d2);
    }

    //LAYANG-LAYANG
    public float luasLayangLayang(){
        // L = 1/2 x d1 x d2
        return luasBelahKetupat();
    }

    //LINGKARAN
    public float luasLingkaran(){
        // L = PI x r^2
        return (float)(PI * jariJari*jariJari);
    }
}
