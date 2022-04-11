package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void sil() {
        for (int i = 0; i < 100; i++) {
            System.out.println(" ");
        }
    }

    public static void gezegen() {
        Scanner girdi = new Scanner(System.in);
        int okunandeger = 0;
        int girilendeger = 0;
        boolean a = true;
        int kullanici;

        try {
            while (a) {
                System.out.println("1.---->DÜNYA<----");
                System.out.println("2.---->MARS<----");
                System.out.println("3.---->JÜPİTER<----");
                System.out.println("4.---->SATÜRN<----");
                System.out.println("5.---->NEPTÜN<----");
                System.out.println("6.---->MERKÜR<----");
                System.out.println("7.---->VENÜS<----");
                System.out.println("8.---->URANÜS<----");
                System.out.println("9.---->PLüTON<----");
                System.out.println("10.---->AY<----");
                System.out.println("11.---->GÜNEŞ<----");
                System.out.print("Lütfen bir sayı giriniz (1-11) : ");
                okunandeger = girdi.nextInt();
                sil();
                if (okunandeger < 1 || okunandeger > 11) {
                    System.out.println("Lütfen 1-11 arasında bir sayı giriniz");
                }
                if (okunandeger == 1) {
                    System.out.println("Dünya gezegenini seçtiniz");
                    System.out.println("1.Dünya'nın nüfusu nedir?");
                    System.out.println("2.Dünya'nın Güneş'e uzaklığı nedir?");
                    System.out.println("3.Dünya'da kaç ülke vardır?");
                    System.out.println("4.Dünya,hangi galaksinin içindedir?");
                    System.out.println("5.Dünya,büyüklük sıralamasında kaçıncı sırada?");
                    System.out.println("6.Dünya'nın uydusu nedir?");
                    System.out.println("7.Dünya'nın atmosferi neyden oluşur?");
                    System.out.println("Yukarıdaki sorulardan hangisinin cevabına ulaşmak istiyorsanız o sorunun numarası giriniz (1-7): ");
                    girilendeger = girdi.nextInt();
                    sil();
                    if (girilendeger < 1 || girilendeger > 7) {
                        System.out.println("Lütfen 1-7 arasında bir sayı giriniz");
                    }
                    if (girilendeger == 1) {
                        System.out.println("Dünya'nın nüfusu = 7 milyar 924 milyon.");
                    } else if (girilendeger == 2) {
                        System.out.println("Dünya'nın güneşe uzaklığı = 149,5 milyon km'dir.");
                    } else if (girilendeger == 3) {
                        System.out.println("Dünya'da 206 ülke vardır.");
                    } else if (girilendeger == 4) {
                        System.out.println("Dünya,Samanyolu Galaksi'sinin içindedir.");
                    } else if (girilendeger == 5) {
                        System.out.println("Dünya,büyüklük sıralamasında 5.sıradadır.");
                    } else if (girilendeger == 6) {
                        System.out.println("Dünya'nın uydusu Ay'dır.");
                    } else if (girilendeger == 7) {
                        System.out.println("Dünya'nın atmodferin %78'ini azot,%21'ini oksijen,% 1'ini ise su buharı, argon, karbondioksit, neon, helyum, metan, kripton, hidrojen, ozon ve ksenon oluşturur.");
                    }
                }

                if (okunandeger == 2) {
                    System.out.println("Mars gezegenini seçtiniz");
                    System.out.println("1.Mars'ta nüfus var mı?");
                    System.out.println("2.Mars'ın Güneş'e uzaklığı nedir?");
                    System.out.println("3.Mars 'ın atmosferi neyden oluşur?");
                    System.out.println("4.Mars,hangi galaksinin içindedir?");
                    System.out.println("5.Mars,büyüklük sıralamasında kaçıncı sırada?");
                    System.out.println("6.Mars'ın uydusu var mıdır?");
                    System.out.println("Yukarıdaki sorulardan hangisinin cevabına ulaşmak istiyorsanız o sorunun numarası giriniz (1-6): ");
                    girilendeger = girdi.nextInt();
                    sil();
                    if (girilendeger < 1 || girilendeger > 6) {
                        System.out.println("Lütfen 1-6 arasında bir sayı giriniz");
                    }
                    if (girilendeger == 1) {
                        System.out.println("Mars'ta nüfus yoktur.");
                    } else if (girilendeger == 2) {
                        System.out.println("Mars'ın güneşe uzaklığı = 230.000.000 km'dir.");
                    } else if (girilendeger == 3) {
                        System.out.println("Mars'ın atmosferinin %95'i karbondioksittir.");
                    } else if (girilendeger == 4) {
                        System.out.println("Mars,Samanyolu Galaksi'sinin içindedir.");
                    } else if (girilendeger == 5) {
                        System.out.println("Mars,büyüklük sıralamasında 7.sıradadır.");
                    } else if (girilendeger == 6) {
                        System.out.println("Mars'ın uyduları Phobos ve Deimos'tur.");
                    }
                }

                if (okunandeger == 3) {
                    System.out.println("Jüpiter gezegenini seçtiniz");
                    System.out.println("1.Jüpiter'de nüfus var mı?");
                    System.out.println("2.Jüpiter'in Güneş'e uzaklığı nedir?");
                    System.out.println("3.Jüpiter'in atmosferi neyden oluşur?");
                    System.out.println("4.Jüpiter,hangi galaksinin içindedir?");
                    System.out.println("5.Jüpiter,büyüklük sıralamasında kaçıncı sırada?");
                    System.out.println("6.Jüpiter'in uydusu var mıdır?");
                    System.out.println("Yukarıdaki sorulardan hangisinin cevabına ulaşmak istiyorsanız o sorunun numarası giriniz (1-6): ");
                    girilendeger = girdi.nextInt();
                    sil();
                    if (girilendeger < 1 || girilendeger > 6) {
                        System.out.println("Lütfen 1-6 arasında bir sayı giriniz");
                    }
                    if (girilendeger == 1) {
                        System.out.println("Jüpiter'de nüfus yoktur.");
                    } else if (girilendeger == 2) {
                        System.out.println("Jüpiter'in güneşe uzaklığı = 780.000.000 km'dir.");
                    } else if (girilendeger == 3) {
                        System.out.println("Jüpiter'in atmosferini helyum ve hidrojen oluşturur.");
                    } else if (girilendeger == 4) {
                        System.out.println("Jüpiter,Samanyolu Galaksi'sinin içindedir.");
                    } else if (girilendeger == 5) {
                        System.out.println("Jüpiter,büyüklük sıralamasında 1.sıradadır.");
                    } else if (girilendeger == 6) {
                        System.out.println(" Jüpiter'in 80 doğal uydusu vardır.İç uyduları olan İo, Europa, Ganymede ve Callisto büyük ve aydın iken diğerleri soluk ve küçüktür.");
                    }
                }

                if (okunandeger == 4) {
                    System.out.println("Satürn gezegenini seçtiniz");
                    System.out.println("1.Satürn'de nüfus var mı?");
                    System.out.println("2.Satürn'ün Güneş'e uzaklığı nedir?");
                    System.out.println("3.Satürn'ün  atmosferi neyden oluşur?");
                    System.out.println("4.Satürn,hangi galaksinin içindedir?");
                    System.out.println("5.Satürn,büyüklük sıralamasında kaçıncı sırada?");
                    System.out.println("6.Satürn'ün uydusu var mıdır?");
                    System.out.println("Yukarıdaki sorulardan hangisinin cevabına ulaşmak istiyorsanız o sorunun numarası giriniz (1-6): ");
                    girilendeger = girdi.nextInt();
                    sil();
                    if (girilendeger < 1 || girilendeger > 6) {
                        System.out.println("Lütfen 1-6 arasında bir sayı giriniz");
                    }
                    if (girilendeger == 1) {
                        System.out.println("Satürn'de nüfus yoktur.");
                    } else if (girilendeger == 2) {
                        System.out.println("Satürn'ün güneşe uzaklığı = 1.438.000.000 km'dir.");
                    } else if (girilendeger == 3) {
                        System.out.println("Satürn'ün atmosferi %94 hidrojen ve %6 helyumdan oluşmaktadır.");
                    } else if (girilendeger == 4) {
                        System.out.println("Satürn,Samanyolu Galaksi'sinin içindedir.");
                    } else if (girilendeger == 5) {
                        System.out.println("Satürn,büyüklük sıralamasında 2.sıradadır.");
                    } else if (girilendeger == 6) {
                        System.out.println(" Satürn'ün  82 doğal uydusu vardır.Mimas, Enceladus, Tethys, Dione, Rhea bunlardan birkaçı.");
                    }
                }

                if (okunandeger == 5) {
                    System.out.println("Neptün gezegenini seçtiniz");
                    System.out.println("1.Neptün'de nüfus var mı?");
                    System.out.println("2.Neptün'ün Güneş'e uzaklığı nedir?");
                    System.out.println("3.Neptün'ün  atmosferi neyden oluşur?");
                    System.out.println("4.Neptün,hangi galaksinin içindedir?");
                    System.out.println("5.Neptün,büyüklük sıralamasında kaçıncı sırada?");
                    System.out.println("6.Neptün'ün  uydusu var mıdır?");
                    System.out.println("Yukarıdaki sorulardan hangisinin cevabına ulaşmak istiyorsanız o sorunun numarası giriniz (1-6): ");
                    girilendeger = girdi.nextInt();
                    sil();
                    if (girilendeger < 1 || girilendeger > 6) {
                        System.out.println("Lütfen 1-6 arasında bir sayı giriniz");
                    }
                    if (girilendeger == 1) {
                        System.out.println("Neptün'de nüfus yoktur.");
                    } else if (girilendeger == 2) {
                        System.out.println("Neptün'ün  güneşe uzaklığı = 4,495E9 km'dir.");
                    } else if (girilendeger == 3) {
                        System.out.println("Neptün'ün atmosferini hidrojen ve helyum oluşturur.");
                    } else if (girilendeger == 4) {
                        System.out.println("Neptün,Samanyolu Galaksi'sinin içindedir.");
                    } else if (girilendeger == 5) {
                        System.out.println("Neptün,büyüklük sıralamasında 4.sıradadır.");
                    } else if (girilendeger == 6) {
                        System.out.println("Neptün'ün bilinen 14 uydusu vardır.Gezegenin en büyük uydusu küresel şekle sahip olabilecek kadar kütleye sahip tek gök cismi olan, Triton'dur. Triton, diğer uydulara kıyasla ters yörüngeye sahip tek uydudur.");
                    }
                }

                if (okunandeger == 6) {
                    System.out.println("Merkür gezegenini seçtiniz");
                    System.out.println("1.Merkür'de nüfus var mı?");
                    System.out.println("2.Merkür'ün Güneş'e uzaklığı nedir?");
                    System.out.println("3.Merkür'ün  atmosferi neyden oluşur?");
                    System.out.println("4.Merkür,hangi galaksinin içindedir?");
                    System.out.println("5.Merkür,büyüklük sıralamasında kaçıncı sırada?");
                    System.out.println("6.Merkür'ün  uydusu var mıdır?");
                    System.out.println("Yukarıdaki sorulardan hangisinin cevabına ulaşmak istiyorsanız o sorunun numarası giriniz (1-6): ");
                    girilendeger = girdi.nextInt();
                    sil();
                    if (girilendeger < 1 || girilendeger > 6) {
                        System.out.println("Lütfen 1-6 arasında bir sayı giriniz");
                    }
                    if (girilendeger == 1) {
                        System.out.println("Merkür'de nüfus yoktur.");
                    } else if (girilendeger == 2) {
                        System.out.println("Merkür'ün  güneşe uzaklığı =  57.000.000 km'dir.");
                    } else if (girilendeger == 3) {
                        System.out.println("Merkür'ün atmosferi ;hidrojen, helyum, oksijen, sodyum, kalsiyum, potasyum ve su buharından oluşur.");
                    } else if (girilendeger == 4) {
                        System.out.println("Merkür,Samanyolu Galaksi'sinin içindedir.");
                    } else if (girilendeger == 5) {
                        System.out.println("Merkür,büyüklük sıralamasında 8.sıradadır.");
                    } else if (girilendeger == 6) {
                        System.out.println("Merkür'ün uydusu yoktor.");
                    }
                }

                if (okunandeger == 7) {
                    System.out.println("Venüs gezegenini seçtiniz");
                    System.out.println("1.Venüs'te nüfus var mı?");
                    System.out.println("2.Venüs'ün Güneş'e uzaklığı nedir?");
                    System.out.println("3.Venüs'ün  atmosferi neyden oluşur?");
                    System.out.println("4.Venüs,hangi galaksinin içindedir?");
                    System.out.println("5.Venüs,büyüklük sıralamasında kaçıncı sırada?");
                    System.out.println("6.Venüs'ün  uydusu var mıdır?");
                    System.out.println("Yukarıdaki sorulardan hangisinin cevabına ulaşmak istiyorsanız o sorunun numarası giriniz (1-6): ");
                    girilendeger = girdi.nextInt();
                    sil();
                    if (girilendeger < 1 || girilendeger > 6) {
                        System.out.println("Lütfen 1-6 arasında bir sayı giriniz");
                    }
                    if (girilendeger == 1) {
                        System.out.println("Venüs'te nüfus yoktur.");
                    } else if (girilendeger == 2) {
                        System.out.println("Venüs'ün  güneşe uzaklığı =  110.000.000 km'dir.");
                    } else if (girilendeger == 3) {
                        System.out.println("Venüs'ün atmosferi yüzde 96.5 karbondioksit ve yüzde 3.5 azot ile az miktarda sülfür dioksit, argon, su, karbonmonoksit, helyum ve neondan oluşur.");
                    } else if (girilendeger == 4) {
                        System.out.println("Venüs,Samanyolu Galaksi'sinin içindedir.");
                    } else if (girilendeger == 5) {
                        System.out.println("Venüs,büyüklük sıralamasında 6.sıradadır.");
                    } else if (girilendeger == 6) {
                        System.out.println("Venüs'ün uydusu yoktor.");
                    }
                }

                if (okunandeger == 8) {
                    System.out.println("Uranüs gezegenini seçtiniz");
                    System.out.println("1.Uranüs'te nüfus var mı?");
                    System.out.println("2.Uranüs'ün Güneş'e uzaklığı nedir?");
                    System.out.println("3.Uranüs'ün  atmosferi neyden oluşur?");
                    System.out.println("4.Uranüs,hangi galaksinin içindedir?");
                    System.out.println("5.Uranüs,büyüklük sıralamasında kaçıncı sırada?");
                    System.out.println("6.Uranüs'ün  uydusu var mıdır?");
                    System.out.println("Yukarıdaki sorulardan hangisinin cevabına ulaşmak istiyorsanız o sorunun numarası giriniz (1-6): ");
                    girilendeger = girdi.nextInt();
                    sil();
                    if (girilendeger < 1 || girilendeger > 6) {
                        System.out.println("Lütfen 1-6 arasında bir sayı giriniz");
                    }

                    if (girilendeger == 1) {
                        System.out.println("Uranüs'te nüfus yoktur.");
                    } else if (girilendeger == 2) {
                        System.out.println("Uranüs'ün  güneşe uzaklığı = 2.970.000.000 km'dir.");
                    } else if (girilendeger == 3) {
                        System.out.println("Uranüs'ün atmosferi metan, helyum ve hidrojenden oluşur.");
                    } else if (girilendeger == 4) {
                        System.out.println("Uranüs,Samanyolu Galaksi'sinin içindedir.");
                    } else if (girilendeger == 5) {
                        System.out.println("Uranüs,büyüklük sıralamasında 3.sıradadır.");
                    } else if (girilendeger == 6) {
                        System.out.println("Uranüs'ün 27 uydusu vardır.Bunlardan birkaçı şunlardır:Ariel, Umbriel, Belinda,Titania, Oberon, Puck vb.");
                    }
                }

                if (okunandeger == 9) {
                    System.out.println("Plüton'u seçtiniz");
                    System.out.println("1.Plüton gezegen olarak sayılıyor mu?");
                    System.out.println("2.Plüton'da nüfus var mı?");
                    System.out.println("3.Plüton'un Güneş'e uzaklığı nedir?");
                    System.out.println("4.Plüton'un  atmosferi neyden oluşur?");
                    System.out.println("5.Plüton,hangi galaksinin içindedir?");
                    System.out.println("6.Plüton'un  uydusu var mıdır?");
                    System.out.println("Yukarıdaki sorulardan hangisinin cevabına ulaşmak istiyorsanız o sorunun numarası giriniz (1-6): ");
                    girilendeger = girdi.nextInt();
                    sil();
                    if (girilendeger < 1 || girilendeger > 6) {
                        System.out.println("Lütfen 1-6 arasında bir sayı giriniz");
                    }
                    if (girilendeger == 1) {
                        System.out.println("Plüton,Güneş Sistemi'nin en dış bölgelerindeki asteroid tabakası olan Kuiper Kuşağı'na oldukça yakın bir noktada olduğu için cüce gezegen sayılıyor.");
                    } else if (girilendeger == 2) {
                        System.out.println("Plüton'da nüfus yok.");
                    } else if (girilendeger == 3) {
                        System.out.println("Plüton'un  güneşe uzaklığı = 7.500.000.000 km'dir.");
                    } else if (girilendeger == 4) {
                        System.out.println("Plüton'un atmosferi azot,metan ve karbonmonoksit gazlarından oluşur.");
                    } else if (girilendeger == 5) {
                        System.out.println("Plüton,Samanyolu Galaksi'sinin içindedir.");
                    } else if (girilendeger == 6) {
                        System.out.println("Plüton'un 5 uydusu vardır.Uydular:Charon,Nix,Hydra,Kerberos ve Styx");
                    }
                }

                if (okunandeger == 10) {
                    System.out.println("Ay'ı seçtiniz");
                    System.out.println("1.Ay hangi gezegenin uydusudur?");
                    System.out.println("2.Ay,Dünya'nın yörüngesinde bir turunu ne kadar sürede tamamlar?");
                    System.out.println("3.Ay'ın Güneş'e uzaklığı nedir?");
                    System.out.println("4.Ay'a ilk defa kim ne zaman ayak bastı?");
                    System.out.println("5.Ay kabuğunda neler yer alır?");
                    System.out.println("6.Ay'ın Dünya'ya uzaklığı nedir?");
                    System.out.println("Yukarıdaki sorulardan hangisinin cevabına ulaşmak istiyorsanız o sorunun numarası giriniz (1-6): ");
                    girilendeger = girdi.nextInt();
                    sil();
                    if (girilendeger < 1 || girilendeger > 6) {
                        System.out.println("Lütfen 1-6 arasında bir sayı giriniz");
                    }

                    if (girilendeger == 1) {
                        System.out.println("Ay,Dünya'nın uydusudur.");
                    } else if (girilendeger == 2) {
                        System.out.println(" Ay,Dünya'nın yörüngesinde bir turunu 27 gün 7 saatte tamamlar. .");
                    } else if (girilendeger == 3) {
                        System.out.println("Ay'ın Güneş'e uzaklığı yaklaşık 152 milyon km'dir.");
                    } else if (girilendeger == 4) {
                        System.out.println("Ay'a ilk Neil Armstrong tarafından 16 Temmuz 1969'da ayak basıldı.");
                    } else if (girilendeger == 5) {
                        System.out.println("Ay kabuğunda taş ve toz tabakası yer alır.");
                    } else if (girilendeger == 6) {
                        System.out.println("Ay'ın Dünya'ya uzaklığı 384.400 km'dir.");
                    }
                }

                if (okunandeger == 11) {
                    System.out.println("Güneş'i seçtiniz");
                    System.out.println("1.Güneş,yıldız mıdır?");
                    System.out.println("2.Güneş'in yörüngesinde kaç gezegen vardır?");
                    System.out.println("3.Güneş'in yüzey sıcaklığı nedir?");
                    System.out.println("4.Güneş kendi ekseni etrafında döner mi?");
                    System.out.println("5.Güneş'in yapısında hangi gazlar bulunur?");
                    System.out.println("6.Güneş'in Dünya'ya uzaklığı nedir?");
                    System.out.println("Yukarıdaki sorulardan hangisinin cevabına ulaşmak istiyorsanız o sorunun numarası giriniz (1-6): ");
                    girilendeger = girdi.nextInt();
                    sil();
                    if (girilendeger < 1 || girilendeger > 6) {
                        System.out.println("Lütfen 1-6 arasında bir sayı giriniz");
                    }

                    if (girilendeger == 1) {
                        System.out.println("Güneş,Güneş sisteminde yer alan orta büyüklükte bir yıldızdır.Tek başına Güneş Sistemi kütlesinin % 99,8'ini oluşturur.");
                    } else if (girilendeger == 2) {
                        System.out.println("Güneş'in yörüngesinde sekiz gezegen vardır.Gezegenler:Merkür,Venüs,Dünya,Mars,Jüpiter,Satürn,Uranüs,Neptün.");
                    } else if (girilendeger == 3) {
                        System.out.println("Güneş'in yüzey sıcaklığı 5500 °C'dir.");
                    } else if (girilendeger == 4) {
                        System.out.println("Güneş kendi ekseni etrafında batıdan doğuya doğru döner.");
                    } else if (girilendeger == 5) {
                        System.out.println("Güneş'in yapısında %70 hidrojen,%28 helyum ve %2 diğer gazlar bulunur.");
                    } else if (girilendeger == 6) {
                        System.out.println("Güneş'in Dünya'ya uzaklığı 149,5 milyon km'dir.");
                    }
                }

                System.out.print("Devam etmek istiyorsanız 3, devam etmek istemiyorsanız 6 yazınız: ");
                kullanici = girdi.nextInt();
                if (kullanici == 3) {
                    a = true;
                } else if (kullanici == 6) {
                    a = false;
                    System.exit(0);
                } else {
                    System.out.print("3 ya da 6 yazınız");
                    System.exit(0);
                }
                sil();
            }

        } catch (Exception e) {
            System.out.println("Lütfen sadece sayı giriniz");
        }
    }

    public static void main(String[] args) {
        while (true) {
            gezegen();
        }
    }
}