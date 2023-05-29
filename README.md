# Втора лабораториска вежба по Софтверско инженерство
# Ангел Царчев, бр. на индекс 213156

# Control Flow Graf

![SI_Lab2_2023 drawio](https://github.com/angelcarcev/SI_2023_lab2_213156/blob/master/sliki/SI_Lab2_2023.drawio.jpg)


# Цикломатска комплексност

Цикломатската комплексност на овој код е 11, истата ја добив преку формулата со која се бројат регионите во control flow graf-от вкупно има 11 региони и затоа заклучуваме дека цикломатската комплексност е 11.

# Тест случаи според Every Branch:

![Screenshot_1](https://github.com/angelcarcev/SI_2023_lab2_213156/blob/master/sliki/Screenshot_1.png)


На сликата е прикажана табела, со чија помош се претставени тестовите и гранките кои се изминати. (белата боја означува дека гранката не е измината, а ѕвездата означува дека гранката е измината со соодветниот тест).

Со "test1" се изминуваат само 2 гранки односно 1-2 и поради тоа што се фрла искучок во јазол 2, тука функцијата завршува, што значи има потреба за нов тест случај.

![Screenshot_2](https://github.com/angelcarcev/SI_2023_lab2_213156/blob/master/sliki/Screenshot_2.png)

Со "test2" се изминуваат јазлите 1-3, 3-4, 4-5, 5-6, 6-7, 7-8.1, 8.1-8.2, 8.2-9, 8.3-8.2, 8.2-(14-15-16-17), 9-10, 10-11, 11-12, 12-13, 13-8.3, (14-15-16-17)-18, 18-25, со ова се поминуваат доста јазли но потребни се повеќе тест случаи да се поминат сите тестови. 

![Screenshot_3](https://github.com/angelcarcev/SI_2023_lab2_213156/blob/master/sliki/Screenshot_3.png)

Со "test3" се изминуваат дополнително се изминуваат и 3-5, 6-(14-15-16-17) , (14-15-16-17)-19, 19-20, 20-21.1, 21.1-21.2, 21.2-22, 21.2-24, 22-21.3, 21.3-21.2, 24-25, но треба уште тест случаеви за да се поминат преостанатите јазли.

![Screenshot_4](https://github.com/angelcarcev/SI_2023_lab2_213156/blob/master/sliki/Screenshot_4.png)

Со "test4" се изминуваат 10-12, (14-15-16-17)-19, 12-8.3, 22-23, 23-25, но само јазелот 20-24 останува непоминат и затоа во следниот тест случај ке го поминеме и него.

![Screenshot_5](https://github.com/angelcarcev/SI_2023_lab2_213156/blob/master/sliki/Screenshot_5.png)

Со "test5" го изминуваме последниот јазел 20-24.

![Screenshot_6](https://github.com/angelcarcev/SI_2023_lab2_213156/blob/master/sliki/Screenshot_6.png)

# Multiple Condition

![Screenshot_1](https://github.com/angelcarcev/SI_2023_lab2_213156/blob/master/sliki/Screenshot_11.png)

1. user==null враќа T, што значи дека останатите нема потреба да се проверуваат. (условот е исполнет, 1-2)

![Screenshot_7](https://github.com/angelcarcev/SI_2023_lab2_213156/blob/master/sliki/Screenshot_7.png)

2. user==null враќа F , се проверува user.getPassword()==null, што со дадениот тест ќе врати T, и наредниот израз нема потреба да се проверува. (условот е исполнет, 1-2)

![Screenshot_8](https://github.com/angelcarcev/SI_2023_lab2_213156/blob/master/sliki/Screenshot_8.png)

3. user==null и user.getPassword()==null враќаат F, па сега се проверува user.getEmail()==null, што со дадениот тест ќе врати T, дополнителни изрази нема за проверување, што значи условот е исполнет. (1-2)

![Screenshot_9](https://github.com/angelcarcev/SI_2023_lab2_213156/blob/master/sliki/Screenshot_9.png)

5. доколку сите вратат F условот не е исполнет и јазолот 2 се прескокнува. (1-3)

![Screenshot_10](https://github.com/angelcarcev/SI_2023_lab2_213156/blob/master/sliki/Screenshot_10.png)
