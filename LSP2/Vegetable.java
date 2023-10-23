public class Vegetable extends FoodProduct{
    
    @Override
    String getName() {
        return "Broccoli";
    }
    @Override
    Date getExpireDate() {
        return new Date();
    }
}
