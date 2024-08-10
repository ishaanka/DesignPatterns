import Impl.Desk;
import Impl.StoreClothes;
import Impl.StoreStationary;
import Impl.Wardrobe;

public class Main {
    public static void main(String[] args) {


        Desk desk = new Desk(new StoreStationary());
        Wardrobe wardrobe = new Wardrobe(new StoreClothes());

        desk.giveName();
        wardrobe.giveName();
    }
}