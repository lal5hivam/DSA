class Item {
        int value, weight;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }
    double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        // code here
        int n = wt.size();
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) items[i] = new Item(val.get(i), wt.get(i));
        Arrays.sort(items, (a, b) -> Double.compare((double)b.value / b.weight, (double)a.value / a.weight));
        double totalValue = 0.0;
        for (Item item : items) {
            if (capacity >= item.weight) {
                totalValue += item.value;
                capacity -= item.weight;
            } else {
                totalValue += (double)item.value * ((double)capacity / item.weight);
                break;
            }
        }
        return totalValue;
    }
}
