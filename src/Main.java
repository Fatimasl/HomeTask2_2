public class Main {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили

        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран

        float ticket_value = 13686.45F;
        short bonus_value = 21;
        int bonus_sum;

        bonus_sum = (int) ticket_value/bonus_value;
        System.out.println(bonus_sum);
    }
}
