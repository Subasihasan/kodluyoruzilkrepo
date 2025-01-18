import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matemetik Notunu gir: ");
        mat = inp.nextInt();

        System.out.println("Kimya Notunu gir: ");
        kimya = inp.nextInt();

        System.out.println("Fizik Notunu gir: ");
        fizik = inp.nextInt();

        System.out.println("Turkçe Notunu gir: ");
        turkce = inp.nextInt();

        System.out.println("Tarih Notunu gir: ");
        tarih = inp.nextInt();

        System.out.println("Müzik Notunu gir: ");
        muzik = inp.nextInt();
        int toplam = mat + turkce + fizik + kimya + muzik + tarih;
        double ort = toplam / 6.0;
        System.out.println("Ortalaman" + ort);
        System.out.println((ort >= 60) ? "Geçtiniz" : "Kaldınız");
    }
    }

