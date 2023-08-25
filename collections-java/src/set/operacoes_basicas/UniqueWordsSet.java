package set.operacoes_basicas;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordsSet {
    private Set<String> uniqueWords;

    public UniqueWordsSet() {
        this.uniqueWords = new HashSet<>();
    }

    public void addWord(String word) {
        this.uniqueWords.add(word);
    }

    public void removeWord(String word) {
        if (wordExists(word)) {
            this.uniqueWords.remove(word);
        } else {
            System.out.println("A palavra " + word + " não existe no Set de Palavras!");
        }
    }
    
    public boolean wordExists(String word) {
        return this.uniqueWords.contains(word);
    }

    public void printUniqueWords() {
        System.out.println(this.uniqueWords);
    }

    public static void main(String[] args) {
        UniqueWordsSet uniqueWordsSet = new UniqueWordsSet();
        uniqueWordsSet.addWord("Palavra 1");
        uniqueWordsSet.addWord("Palavra 2");
        uniqueWordsSet.addWord("Palavra 3");
        uniqueWordsSet.printUniqueWords();

        uniqueWordsSet.removeWord("null");
        uniqueWordsSet.removeWord("Palavra 1");
        uniqueWordsSet.printUniqueWords();
    }
}
