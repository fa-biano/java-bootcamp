package map.operacoes_basicas;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<>();
    }

    public void addWord(String word, String definition) {
        this.dictionary.put(word, definition);
    }

    public void removeWord(String word) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word);
        }
    }

    public void printWords() {
        System.out.println(this.dictionary);
    }

    public String searchByWord(String word) {
        String foundWord = null;
        if (this.dictionary.containsKey(word)) {
            foundWord = this.dictionary.get(word);
        }

        return foundWord;
    }

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("Teste", "Teste é teste");
        dictionary.addWord("Bug", "Bug é bug");
        dictionary.printWords();
        System.out.println(dictionary.searchByWord("Teste"));
        dictionary.removeWord("Bug");
        dictionary.printWords();
    }
    
}
