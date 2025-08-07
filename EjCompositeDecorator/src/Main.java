
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ProductoSimple ps1 = new ProductoSimple("Guantes",5000,56);
        ProductoSimple ps2 = new ProductoSimple("Chaleco",7500,45);
        ProductoSimple ps3 = new ProductoSimple("Casco",2500,32);
        ProductoSimple ps4 = new ProductoSimple("Piloto",4000,21);
        HashSet productosc1 = new HashSet();
        productosc1.add(ps1);
        productosc1.add(ps2);
        productosc1.add(ps3);
        Combo c1 = new Combo("Descuento1",productosc1);
        HashSet productosc2 = new HashSet();
        productosc2.add(c1);
        productosc2.add(ps4);
        Combo c2 = new Combo ("Descuento2",productosc2);

        System.out.println("\nPrecios y Stock por producto");
        System.out.println(ps1.getDescripcion() + " precio "+ ps1.precio()+" stock "+ ps1.getStock());
        System.out.println(ps2.getDescripcion() + " precio "+ ps2.precio()+" stock "+ ps2.getStock());
        System.out.println(ps3.getDescripcion() + " precio "+ ps3.precio()+" stock "+ ps3.getStock());
        System.out.println(ps4.getDescripcion() + " precio "+ ps4.precio()+" stock "+ ps4.getStock());

        System.out.println("\nPrecios combos");
        System.out.println(c1.getDescripcion() + " precio "+ c1.precio()+" stock "+ c1.Stock());
        System.out.println(c2.getDescripcion() + " precio "+ c2.precio()+" stock "+ c2.Stock());

        Packaging pk1 = new Packaging("pack1",c1,797.57);
        Packaging pk2 = new Packaging("pack2",c2,1797.57);

        Descuento d1 = new Descuento("des1",pk2,150);
        Descuento d2 = new Descuento("des1",d1,1100);

        System.out.println("\nPrecios Packagins");
        System.out.println(pk1.getDescripcion() + " precio "+ pk1.precio());
        System.out.println(pk2.getDescripcion() + " precio "+ pk2.precio());

        System.out.println("\nPrecios Descuentos");
        System.out.println(d1.getDescripcion() + " descuento de "+ d1.precio());
        System.out.println(d2.getDescripcion() + " descuento de "+ d2.precio());

        System.out.println("\nPrecios Finales");
        System.out.println(pk1.getDescripcion() + " precio final "+ pk1.precioFinal());
        System.out.println(pk2.getDescripcion() + "  precio final "+ pk2.precioFinal());
        System.out.println(d1.getDescripcion() + "  precio final "+ d1.precioFinal());
        System.out.println(d2.getDescripcion() + " precio final "+ d2.precioFinal());
        
    }
}
