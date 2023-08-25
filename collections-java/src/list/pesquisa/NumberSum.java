package list.pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberSum {
    private List<Integer> numberList;

    public NumberSum() {
        this.numberList = new ArrayList<>();
    }

    public void addNumber(int num) {
        numberList.add(num);
    }

    public int calcSum() {
        int sum = 0;

        if (!numberList.isEmpty()) {
            for (int number : numberList) {
                sum += number;
            }
        }

        return sum;
    }

    @Override
    public String toString() {
        return "NumberSum [numberList=" + numberList + "]";
    }

    public int findGreaterNum() {
        if (!numberList.isEmpty()) {
            Collections.sort(numberList);
            int lastIndex = numberList.size() - 1;
            return numberList.get(lastIndex);
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public int findLowerNum() {
        if (!numberList.isEmpty()) {
            Collections.sort(numberList);
            return numberList.get(0);  
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        NumberSum numList = new NumberSum();
        numList.addNumber(2);
        numList.addNumber(5);
        numList.addNumber(0);
        numList.addNumber(1);
        System.out.println(numList);
        System.out.println(numList.calcSum());
        System.out.println(numList.findGreaterNum());
        System.out.println(numList.findLowerNum());
    }
}
