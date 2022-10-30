package task5;

public class Task4 {
//    public String join(String[] args) {
//        String result = "";
//        for (String arg : args) {
//            result += arg;
//            result += ", ";
//        }
//        return result;
//    }

    public String join(String[] args) {
        StringBuilder sb = new StringBuilder();
        String separator = ", ";
        for (String arg : args) {
            if (sb.length() == 0) {
                sb.append(arg);
            } else {
                sb.append(separator);
                sb.append(arg);
            }
        }
        return sb.toString();
    }
}

/*
    Минусы данного метода в затратах памяти
    Так как String это немутабельный объект в каждой итерации создается новый объект String
    Чтобы использовать память более эффективно можно воспользоваться StringBuilder
    Благодаря этому классу память будет выделяться более эффективно

    CodeReview:
        В конце итерации происходит конкатенация разделителя
        В итоговой строке будет присуствовать разделитель, что не нужно
        Чтобы этого не было, можно постаивть условие: если StringBuilder пуст, то разделитель не добавляется
        Иначе сначала добавляем разделитель, а потом конкатенируем строку
        Таким образом мы избавимся от ненужного разделителя в конце
 */
