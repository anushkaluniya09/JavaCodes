package Inheritance.InhHyb8;

class LearnerAthlete extends Learner implements SportsHumanBeing{
    @Override
    public void play() {
        System.out.println("I am a Student and also a SportsPerson");
    }
}

