import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String username,password;
        int right = 3;
        int balance = 1500;
        int select,price;
        while(right>0){
            System.out.println("Kullanıcı adını giriniz: ");
            username=inp.nextLine();System.out.println("Şifrenizi giriniz: ");password=inp.nextLine();
            if(username.equals("patika")&&password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do{
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz :");
                    System.out.println(" 1-Para yatırma\n" +
                            " 2-Para Çekme\n" +
                            " 3-Bakiye Sorgula\n" +
                            " 4-Çıkış Yap");
                    select = inp.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Para miktarı : ");
                             price = inp.nextInt();
                            balance += price;
                            System.out.println("Bakiyeniz : "+balance);
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                             price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                                System.out.println("Bakiyeniz : "+balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        default:
                            break;
                    }
                } while(select!=4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }else {
                right--;

                if(right==0){
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }else{
                    System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.!");
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
        }

    }
