package NestedClass.Practice3;
class DeliveryService {
    void placeOrder() {
        System.out.println("Order Placed");

        class DeliveryBoy {
            String name;
            int time;

            DeliveryBoy(String name, int time) {
                this.name = name;
                this.time = time;
            }

            void display() {
                System.out.println("Delivery Boy: " + name);
                System.out.println("Estimated Time: " + time + " mins");
            }
        }

        DeliveryBoy boy = new DeliveryBoy("Rajesh", 30);
        boy.display();
    }
}

