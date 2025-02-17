# Симулятор Боя "Герои Меча и Магии III"

Этот проект представляет собой симулятор боевой системы, вдохновленный классической игрой "Герои Меча и Магии III". Основная цель — разработать стратегию боя против искусственного интеллекта.

## Основные возможности

В проекте реализованы четыре ключевых метода, которые позволяют симулировать бой:

- **Поиск подходящих юнитов для атаки (getSuitableUnits)**  
  Этот метод определяет, какие юниты могут атаковать в текущий момент, принимая во внимание их расположение на поле боя и характеристики.

- **Генерация пресета армии (generate)**  
  Метод создает сбалансированную армию, учитывая доступные ресурсы, и оптимизирует состав для эффективного ведения боя.

- **Поиск пути к цели (getTargetPath)**  
  Этот метод находит оптимальный путь для перемещения юнита к цели, учитывая препятствия и других юнитов на поле.

- **Симуляция боя (simulate)**  
  Метод проводит симуляцию сражения между двумя армиями, определяя результат боя и потери с обеих сторон.
## Структура проекта


├── src/
│ ├── main/
│ │ └── java/
│ │ ├── interfaces/
│ │ │ ├── SuitableForAttackUnitsFinder.java
│ │ │ ├── GeneratePreset.java
│ │ │ ├── UnitTargetPathFinder.java
│ │ │ └── SimulateBattle.java
│ │ └── implementation/
│ │ ├── SuitableForAttackUnitsFinderImpl.java
│ │ ├── GeneratePresetImpl.java
│ │ ├── UnitTargetPathFinderImpl.java
│ │ └── SimulateBattleImpl.java
│ └── test/
│ └── java/
│ └── implementation/
│ ├── SuitableForAttackUnitsFinderImplTest.java
│ ├── GeneratePresetImplTest.java
│ ├── UnitTargetPathFinderImplTest.java
│ └── SimulateBattleImplTest.java
└── resources/

- **Java**: Основной язык программирования проекта.
- **JUnit**: Используется для написания и выполнения тестов.



## Установка и запуск

1. Клонируйте репозиторий:
   ```bash
   git clone https://github.com/Evgeniy2001Poluhin/--_-.git
   ```

2. Перейдите в директорию проекта:
   ```bash
   cd heroes
   ```

3. Соберите проект с помощью вашей IDE или используйте Maven/Gradle, если они настроены.

4. Запустите тесты, чтобы убедиться, что все работает корректно.
