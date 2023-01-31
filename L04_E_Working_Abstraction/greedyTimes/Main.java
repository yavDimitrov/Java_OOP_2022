
package L04_E_Working_Abstraction.greedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    static String item;
    static String itemKind;
    static long quantity;
    static long quantityInTheBag;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] treasure = scanner.nextLine().split("\\s+");

        Map<String, TreeMap<String, Long>> bag = new LinkedHashMap<>();

        for (int i = 0; i < treasure.length; i += 2) {
            item = treasure[i];
            quantity = Long.parseLong(treasure[i + 1]);

            itemKind = getItemKind();

            if (itemKind == null ||
                    bagCapacity < quantityInTheBag + quantity ||
                    notCoverRules(bag)) {
                continue;
            }

            putItemInBag(bag);
        }

        print(bag);
    }

    private static void putItemInBag(Map<String, TreeMap<String, Long>> bag) {
        bag.putIfAbsent(itemKind, new TreeMap<>());
        bag.get(itemKind).putIfAbsent(item, 0L);
        long quantityToPut = bag.get(itemKind).get(item) + quantity;
        bag.get(itemKind).put(item, quantityToPut);
        quantityInTheBag += quantity;
    }

    private static void print(Map<String, TreeMap<String, Long>> bag) {
        for (var itemKind : bag.entrySet()) {
            long sumValues = itemKind.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.printf("<%s> $%s%n", itemKind.getKey(), sumValues);
            itemKind.getValue().entrySet().stream().
                    sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).
                    forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));
        }
    }

    private static boolean notCoverRules(Map<String, TreeMap<String, Long>> bag) {
        long goldInBag = bag.containsKey("Gold") ? bag.get("Gold").values().stream().mapToLong(e -> e).sum() : 0L;
        long gemInBag = bag.containsKey("Gem") ? bag.get("Gem").values().stream().mapToLong(e -> e).sum() : 0L;
        long newItemKindQuantity = bag.containsKey(itemKind) ?  bag.get(itemKind).values().stream().mapToLong(e -> e).sum() + quantity : quantity;

        if (itemKind.equals("Gem") && quantity > goldInBag) {
            return true;
        }

        return itemKind.equals("Cash") && (quantity > goldInBag || newItemKindQuantity > gemInBag);
    }

    private static String getItemKind() {
        itemKind = null;

        if (item.length() == 3) {
            itemKind = "Cash";
        } else if (item.toLowerCase().endsWith("gem")) {
            itemKind = "Gem";
        } else if (item.equals("Gold")) {
            itemKind = "Gold";
        }

        return itemKind;
    }
}