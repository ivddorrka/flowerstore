package flowerstore;
import java.util.ArrayList;
import java.util.List;


public class FlowerStore {
    public List<FlowerBucket> flowersStore = new ArrayList<>();

    public void addBucket(FlowerBucket flowerBucket) {
        flowersStore.add(flowerBucket);
    }

    public int search(FlowerType flowerType) {
        for (FlowerBucket flowerBucket : flowersStore) {
            for (int i = 0; i < flowerBucket.flowerPacks.size(); i++) {
                if (flowerBucket.flowerPacks.get(i).getFlower().getFlowerType() == flowerType) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
