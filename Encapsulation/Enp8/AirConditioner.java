package Encapsulation.Enp8;

class AirConditioner{
    private int temperature;

    public void setTemperature(int temperature){
        if(temperature>=16 && temperature<=30){
            this.temperature=temperature;
        }else{
            System.out.println("Temperature must be between 16° C and 30° C");
        }
    }

    public int getTemperature() {
        return temperature;
    }
}
