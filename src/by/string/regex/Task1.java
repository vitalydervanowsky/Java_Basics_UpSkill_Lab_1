package by.string.regex;

// три различных операции:
// * отсортировать абзацы по количеству предложений;
// * в каждом предложении отсортировать слова по длине;
// * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
//   а в случае равенства – по алфавиту.

import java.util.Scanner;
import java.util.StringJoiner;

public class Task1 {
    public static void main(String[] args) {
        String str = "Лексе́ма (от др-греч λέξις — слово, выражение, оборот речи) в лингвистике — слово как абстрактная " +
                "единица морфологического анализа.\n" +
                "В одну лексему объединяются разные парадигматические формы (словоформы) одного слова. Например, " +
                "словарь, словарём, словарю — это формы одной и той же лексемы, по соглашению пишущейся как СЛОВАРЬ.\n" +
                "В ряде концепций в лексему включаются разные смысловые варианты слова, зависящие от контекста, в котором " +
                "оно употребляется (например, соль в смысле названия вещества и в значении того, что придает остроту или " +
                "интерес какому-либо высказыванию, мысли).\n" +
                "Устаревшее значение лексемы — это группа ассоциированных слов. Сейчас в данном значении используют " +
                "термин семантическое поле.";
        System.out.println(str);
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        sc.close();
//        int choose = 3;
        switch (choose) {
            case 1 : {
                sortParagraphsByNumberOfSentences(str);
                break;
            }
            case 2 : {
                sortWordsInSentencesByLength(str);
                break;
            }
            case 3 : {
                char find = '('; // с кириллическая
                findSymbolAndSort(str, find);
                break;
            }
            default: {
                break;
            }
        }
    }

    static void sortParagraphsByNumberOfSentences(String str) {
        System.out.println("=== сортировка абзацов по количеству предложений: ===");
        String [] paragraphs = splitIntoParagraphs(str);
        int [] sentencesInParagraph = new int[paragraphs.length];
        for (int i = 0; i < paragraphs.length; i++) {
            String [] sentences = splitIntoSentences(paragraphs[i]);
            sentencesInParagraph[i] = sentences.length;
            System.out.println("[" + sentencesInParagraph[i] + "]" + paragraphs[i].substring(0, 20));
        }
        show(sort123(paragraphs, sentencesInParagraph));
    }

    static void sortWordsInSentencesByLength(String str) {
        System.out.println("=== сортировка предложений по длине слов: ===");
        String [] paragraphs = splitIntoParagraphs(str);
        for (String paragraph : paragraphs) {
            String[] sentences = splitIntoSentences(paragraph);
            for (String sentence : sentences) {
                String [] words = splitIntoWords(sentence);
                show(sort123(words, findOutTheLength(words)), " ");
            }
            System.out.println();
        }
    }

    static void findSymbolAndSort(String str, char symbol) {
        System.out.println("=== сортировка лексем в предложениях по количеству вхождений символа '" + symbol + "' : ===");
        String [] paragraphs = splitIntoParagraphs(str);
        for (int i = 0; i < paragraphs.length; i++) {
            String[] sentences = splitIntoSentences(paragraphs[i]);
            for (int i1 = 0; i1 < sentences.length; i1++) {
                String[] words = splitIntoWords(sentences[i1]);
                int[] numberOfOccurrences = new int[words.length];
                for (int j = 0; j < words.length; j++) {
                    for (int k = 0; k < words[j].length(); k++) {
                        if (words[j].charAt(k) == symbol) {
                            numberOfOccurrences[j]++;
                        }
                    }
                }
                boolean hasEqualOccurrences = true;
                int firstNumberOfOccurrences = numberOfOccurrences[0];
                for (int j = 1; j < numberOfOccurrences.length; j++) {
                    hasEqualOccurrences = hasEqualOccurrences && firstNumberOfOccurrences == numberOfOccurrences[j];
                }
                if (hasEqualOccurrences) {
                    sortAbc(words);
                } else {
                    sort321(words, numberOfOccurrences);
                }
                sentences[i1] = joinStrings(words);
            }
            paragraphs[i] = joinStrings(sentences);
            System.out.println(paragraphs[i]);
        }
    }

    static String joinStrings(String [] arrayOfStrings) {
        StringJoiner sj = new StringJoiner(" ");
        for (String arrayOfString : arrayOfStrings) {
            sj.add(arrayOfString);
        }
        return sj.toString();
    }

    static String [] splitIntoParagraphs(String str) {
        return str.split("\\n");
    }

    static String [] splitIntoSentences(String paragraph) {
        return paragraph.split("[\\.!\\?]");
    }

    static String [] splitIntoWords(String sentence) {
        return sentence.split("\\s");
    }

    static int [] findOutTheLength(String [] a) { // поиск длины слова
        int [] length = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            length[i] = a[i].length();
        }
        return length;
    }

    static String [] sort123(String [] arrayOfStrings, int [] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    String tempString = arrayOfStrings[i];
                    arrayOfStrings[i] = arrayOfStrings[j];
                    arrayOfStrings[j] = tempString;
                    int tempInt = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tempInt;
                }
            }
        }
        return arrayOfStrings;
    }

    static void sort321(String [] arrayOfStrings, int [] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    String tempString = arrayOfStrings[i];
                    arrayOfStrings[i] = arrayOfStrings[j];
                    arrayOfStrings[j] = tempString;
                    int tempInt = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tempInt;
                }
            }
        }
    }

    static void sortAbc(String [] arrayOfStrings) {
        String tempString;
        for (int i = 0; i < arrayOfStrings.length; i++) {
            for (int j = i + 1; j < arrayOfStrings.length; j++) {
                if (arrayOfStrings[i].compareToIgnoreCase(arrayOfStrings[j]) > 0) {
                    tempString = arrayOfStrings[i];
                    arrayOfStrings[i] = arrayOfStrings[j];
                    arrayOfStrings[j] = tempString;
                }
            }
        }
    }

    static void show(String [] array, String separator) {
        for (String string : array) {
            System.out.print(string + separator);
        }
    }

    static void show(String [] array) {
        for (String string : array) {
            System.out.println(string);
        }
    }
}
