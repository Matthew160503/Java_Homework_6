
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Programm {
    public static void main(String[] args) {
        Set<Laptop> allStock = new HashSet<>();

        allStock = addLaptop(allStock);
        
        choiceCriterion(allStock);
    }

    private static Set<Laptop> addLaptop(Set<Laptop> allStock){
        Laptop laptop1 = new Laptop("Asus Tuf Gaming", 16, 1000, "Windows", "black", 4000);
        Laptop laptop2 = new Laptop("Macbook", 12, 512, "macOS", "white", 3700);
        Laptop laptop3 = new Laptop("Lenovo", 10, 256, "Linux", "blue", 2560);
        Laptop laptop4 = new Laptop("MSI", 12, 128, "Windows", "black", 2300);
        Laptop laptop5 = new Laptop("Samsung", 16, 512, "Windows", "purple", 2450);
        
        allStock.addAll(List.of(laptop1,laptop2,laptop3,laptop4,laptop5));

        return allStock;
    }

    private static void choiceCriterion(Set<Laptop> allStock){
        Map<String, Object> sortValues = new LinkedHashMap<>();
        sortValues.put("ram", null);
        sortValues.put("sizeHDD", null);
        sortValues.put("operationSistem", null);
        sortValues.put("price", null);
        
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        int variant = 0;
        String value = "";
        Object val = null;

        while(flag){
            System.out.println("Выберите критерий фильтрации:\n1 - ОЗУ\n2 - Объём ЖД\n3 - Операционаая система\n"+
                "4 - цена\n5 - выход из цикла и переход к поиску подходящих ноутбуков");

            variant = sc.nextInt();

            if (!(variant == 5)){
                System.out.println("Введите значение выбранного критерия");

                value = sc.next();
            }

            switch (variant) {
                case 1:
                    val = Integer.valueOf(value);
                    sortValues.replace("ram", val);
                    break;
                case 2:
                    val = Integer.valueOf(value);
                    sortValues.replace("sizeHDD", val);
                    break;
                case 3:
                    sortValues.replace("operationSistem", value);
                    break;
                case 4:
                    val = Integer.valueOf(value);
                    sortValues.replace("price", val);
                    break;
                case 5:
                    flag = false;
                    System.out.println("Цикл с добавлением критериев завершен\n");
                    sortLaptops(sortValues, allStock);
                    break;
                default:
                    System.out.println("Введен несуществующий критерий");
                    break;
            }
        }
        sc.close();
    }

    private static void sortLaptops(Map<String, Object> sortValues, Set<Laptop> allStock){

        Set<Laptop> temp = new HashSet<>(allStock);

        for (Laptop laptop : allStock){
            if(sortValues.get("ram") != null){
                if(sortValues.get("ram").equals(laptop.ram)) ;
                else temp.remove(laptop);
            }

            if(sortValues.get("sizeHDD") != null){
                if(sortValues.get("sizeHDD").equals(laptop.sizeHDD)) ;
                else temp.remove(laptop);
            }

            if(sortValues.get("operationSistem") != null){
                if(sortValues.get("operationSistem").equals(laptop.operationSistem)) ;
                else temp.remove(laptop);
            }

            if(sortValues.get("price") != null){
                if(sortValues.get("price").equals(laptop.price)) ;
                else temp.remove(laptop);
            }
        }
        System.out.println("Ноутбок(и), подходящие под Ваши характеристики:\n" + temp);
    }
}
