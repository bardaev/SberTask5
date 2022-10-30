package task5;

public class Task5 {
    /*
        Ваше Spring приложение падает при запуске:
        Caused by:
        org.springframework.beans.factory.BeanCreationException: Could not
        autowire field: private ru.sbrf.app.Utils
        ru.sbrf.app.handlers.CreateHandler.utils; nested exception is
        org.springframework.beans.factory.NoUniqueBeanDefinitionException:
        No qualifying bean of type [ru.sbrf.app.Utils] is defined:
        expected single matching bean but found 2: commonUtils,customUtils
        В чём может быть проблема? Как её можно решить?
    */

    /*
        Овтет:
        Ошибка возникает из-за того, что в контейнере spring имеется несколько бинов одного типа
        Так как по умолчанию spring инжектит бины по типу, возникает неопределнность какой именно бин нужно инжектить
        Следовательно возникает ошибка
        Чтобы исправить данное исключение необходимо задать имена бинам и использовать аннотацию @Qualifier
        С помощью данной аннотации будет внедрен конкретный бин
        Так же можно объявить бин с аннотауией @Primary
        В таком случае данный бин будет внедряться по умолчанию
     */
}
