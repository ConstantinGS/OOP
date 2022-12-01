package seminar2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {

    private List<Animal> animals;
    public Zoo() {
        animals = new ArrayList<>(Arrays.asList(new Cat("Vasya", "British", "gray", 4, 5),
        new Dog("Sandy", "Colly", "brown", 4, 2), 
        new Duck("Donald", "wild", "brown-gray", 2, 2),
        new Fish("Goldy", "Goldfish", "gold", 0, 1),
        new Turtle("Tortila", "redear", "green", 4, 10),
        new Frog ("Carevna", "bullfrog", "brown-green", 4, 3 ) ));
    }

    public List<SpeakAble> getSpeakAble(){
        List<SpeakAble> result = new ArrayList<>();
        for (Animal speakIteAnimal:animals){
            if(speakIteAnimal instanceof SpeakAble){
               
                result.add((SpeakAble)speakIteAnimal);
                result.add(new Radio());
            }
           
            
        }
        return result;
    }

        public void talk() {
            for (SpeakAble item: getSpeakAble()) {
                System.out.printf("%s \n",  item.speak());
            }
        }


        public List<RunAble> getRunAble(){
            List<RunAble> result = new ArrayList<>();
            for (Animal runIteAnimal:animals){
                if(runIteAnimal instanceof RunAble){
                    result.add((RunAble)runIteAnimal);
                }
                
            }
            return result;
        }
    
            public void run() {
                for (RunAble item: getRunAble()) {
                    System.out.printf("%s бегает со скоростью %s\n", ((Animal) item).getName(), item.run());
                }
            }



            public List<FlyAble> getFlyAble(){
            List<FlyAble> result = new ArrayList<>();
            for (Animal flyIteAnimal:animals){
                if(flyIteAnimal instanceof FlyAble){
                    result.add((FlyAble)flyIteAnimal);
                }
                
            }
            return result;
        }
    
            public void fly() {
                for (FlyAble item: getFlyAble()) {
                    System.out.printf("%s летает со скоростью %s \n", ((Animal) item).getName(), item.fly());
                }
            }




            public List<SwimAble> getSwimAble(){
                List<SwimAble> result = new ArrayList<>();
                for (Animal swimIteAnimal:animals){
                    if(swimIteAnimal instanceof SwimAble){
                        result.add((SwimAble)swimIteAnimal);
                    }
                    
                }
                return result;
            }
        
                public void swim() {
                    for (SwimAble item: getSwimAble()) {
                        System.out.printf("%s плавает со скоростью %s \n", ((Animal) item).getName(), item.swim());
                    }
                }



    
    
}
