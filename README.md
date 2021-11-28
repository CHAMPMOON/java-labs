# Model-View-Controller pattern

```
java-labs
├── Controller
│   ├── Animals
│   │   ├── AnimalsController.java
│   │   ├── CreateAnimals.java
│   │   ├── DeleteAnimals.java
│   │   └── MoveAnimals.java
│   ├── AppController.java
│   ├── Aviary
│   │   ├── AviaryController.java
│   │   ├── CreateAviary.java
│   │   ├── DeleteAnimalAviary.java
│   │   └── DeleteAviary.java
│   └── Common
│       ├── EntryDouble.java
│       ├── EntryInt.java
│       ├── EntryName.java
│       ├── SelectAnimal.java
│       └── SelectAviary.java
├── database.db
├── Main.java
├── Model
│   ├── Animals
│   │   ├── AnimalsChildClasses
│   │   │   ├── AquaAnimals.java
│   │   │   ├── ColdAnimals.java
│   │   │   ├── FeatAnimals.java
│   │   │   └── UnguAnimals.java
│   │   ├── AnimalsFactory.java
│   │   ├── Animals.java
│   │   └── TypeAnimals.java
│   ├── Aviary
│   │   ├── AviaryChildClasses
│   │   │   ├── NettyAviary.java
│   │   │   ├── OpenAviary.java
│   │   │   ├── WarmAviary.java
│   │   │   └── WaterAviary.java
│   │   ├── AviaryFactory.java
│   │   ├── Aviary.java
│   │   └── TypeAviary.java
│   └── Storage
│       ├── AnimalsStorage.java
│       ├── AviaryStorage.java
│       ├── Database.java
│       └── Storage.java
└── View
    ├── AnimalsView.java
    ├── AppView.java
    ├── AviaryView.java
    └── CommonView.java
```
