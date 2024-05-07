Задача №1: CashBackHacker
Введение
Вы участвуете в проекте CashBackHacker — это небольшой сервис, который сообщает пользователю о том, сколько ему нужно докупить в рамках конкретной траты, чтобы получить максимальное количество кешбека.

Подробнее: кешбек начисляется за каждую потраченную полную тысячу рублей, поэтому, если вы покупаете что-то на 900 рублей, сервис должен посоветовать вам докупить ещё чего-нибудь на 100 рублей.

Код сервиса выглядит следующим образом:

package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}
Вам нужно создать проект на базе Gradle, как на лекции, не добавляя в него внешних зависимостей.

Выложите полученный проект на GitHub. Не забудьте о файле .gitignore. Подключите GitHub Actions. Можете воспользоваться примером файла для конфигурации gradle-сборки в Github Actions.

Легенда
Поскольку вы уже умеете работать с JUnit5, вам поручили провести небольшое исследование, в рамках которого попробовать использовать TestNG и JUnit4 — тот самый пресловутый кейс — попробуем что-то сделать, а потом уже будем принимать решения.

Часть 1. TestNG
Описание
TestNG сравнительно неплохо документирован.

На этом уровне, с точки зрения пользователя, почти всё, что поменяется, — мы подключим другую библиотеку и будем использовать аннотации из неё и asserts.

Ключевые аннотации (вы можете прочитать Javadoc).

Ключевые asserts (вы можете прочитать Javadoc).

Что нужно сделать
Сделайте ветку testng, в которой:

1. Добавьте в зависимости TestNG:

dependencies {
    testImplementation 'org.testng:testng:7.1.0'

}

test {
    useTestNG()
}
2. Напишите простые автотесты без параметризации на основании материала следующего раздела.

Особенности
На этом уровне для нас поменяется всего три вещи:

Аннотация @Test должна иметь Fully Qualified Name org.testng.annotations.Test.
Asserts расположены в классе org.testng.Assert. Обратите внимание: в TestNG принято actual, expected вместо expected, actual.
Класс и тестовые методы должны иметь модификатор доступа public. Именно поэтому мы вам рекомендовали прописывать модификаторы в тестовых классах.
Часть 2. JUnit4
Описание
JUnit4, по сравнению с JUnit5, практически не документирован, поэтому всё, что нам доступно, — это Javadoc и FAQ.

На этом уровне, с точки зрения пользователя, почти всё, что поменяется, — мы подключим другую библиотеку и будем использовать аннотации из неё и asserts.

Ключевые аннотации (вы можете прочитать Javadoc на них): 

Ключевые asserts (вы можете прочитать Javadoc на них): 

Что нужно сделать
Сделайте ветку junit4, в которой:

1. Добавьте в зависимости JUnit:

dependencies {
    testImplementation 'junit:junit:4.13'
}

test {
    useJUnit()
}
2. Напишите простые автотесты без параметризации.

Особенности
На этом уровне для нас поменяется всего три вещи:

Аннотация @Test должна иметь Fully Qualified Name org.junit.Test.
Asserts расположены в классе org.junit.Assert.
Класс и тестовые методы должны иметь модификатор доступа public. Именно поэтому мы вам рекомендовали прописывать модификаторы в тестовых классах.
Об ошибках
В сервисе точно есть ошибка, поэтому один из ваших автотестов должен падать. На обнаруженный дефект должен быть оформлен репорт по установленным правилам

Подсказка
Если пользователь купил ровно на 1000 рублей, то приложение не должно ему говорить, что нужно купить ещё на 1000.
