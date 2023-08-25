package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberSorter {
    private List<Integer> numList;

    public NumberSorter() {
        this.numList = new ArrayList<>();
    }

    public void addNumber(int num) {
        this.numList.add(num);
    }

    public List<Integer> ascSort() {
        List<Integer> ascSortedNums = new ArrayList<>(this.numList);

        if (!numList.isEmpty()) {
            Collections.sort(ascSortedNums);
            return ascSortedNums;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> descSort() {
        List<Integer> descSortedNums = new ArrayList<>(this.numList);

        if (!numList.isEmpty()) {
            descSortedNums.sort(Collections.reverseOrder());
            return descSortedNums;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void showNumbers() {
        if (!numList.isEmpty()) {
            System.out.println(this.numList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        NumberSorter numberSorter = new NumberSorter();
        numberSorter.addNumber(2);
        numberSorter.addNumber(5);
        numberSorter.addNumber(4);
        numberSorter.addNumber(1);
        numberSorter.addNumber(99);

        numberSorter.showNumbers();
        
        System.out.println(numberSorter.ascSort());
        System.out.println(numberSorter.descSort());
        numberSorter.showNumbers();
    }
}
