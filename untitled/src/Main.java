public class Main {
    public static void main(String[] args) {

//       3.*Напишите программу, чтобы перевернуть строку с помощью рекурсии.
//       7.*Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
//  1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
        String str1 = "Hello World";
        String str2 = "Привет, Мир!";
        System.out.println(str1.contains(str2));
// 2.Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).

        System.out.println(str1.equals(new StringBuilder(str2).reverse().toString()));

// 4.Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168
// Используем метод StringBuilder.append().
        int a = 60;
        int b = 5;
        StringBuilder str3 = new StringBuilder();
        str3.append(a).append(" + ").append(b).append(" = ").append(a + b);
        System.out.println(str3);

        StringBuilder str4 = new StringBuilder();
        str4.append(a).append(" - ").append(b).append(" = ").append(a - b);
        System.out.println(str4);

        StringBuilder str5 = new StringBuilder();
        str5.append(a).append(" * ").append(b).append(" = ").append(a * b);
        System.out.println(str5);

//  5.Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
        str3.insert(str3.indexOf("="),"равно").deleteCharAt(str3.indexOf("="));
        System.out.println(str3);
        str4.insert(str4.indexOf("="),"равно").deleteCharAt(str4.indexOf("="));
        System.out.println(str4);
        str5.insert(str5.indexOf("="),"равно").deleteCharAt(str5.indexOf("="));
        System.out.println(str5);
//  6.Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
//        str3.replace(str3.indexOf("="), str3.indexOf("=") + 1, "равно");
//        System.out.println(str3);
//        str4.replace(str4.indexOf("="), str4.indexOf("=") + 1, "равно");
//        System.out.println(str4);
//        str5.replace(str5.indexOf("="), str5.indexOf("=") + 1, "равно");
//        System.out.println(str5);
    }
}