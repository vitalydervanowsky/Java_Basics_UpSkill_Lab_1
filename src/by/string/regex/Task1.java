package by.string.regex;

// три различных операции:
// * отсортировать абзацы по количеству предложений;
// * в каждом предложении отсортировать слова по длине;
// * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
//   а в случае равенства – по алфавиту.

import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
                char find = '(';
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
            Matcher m = Pattern.compile("[\\.!\\?]").matcher(paragraphs[i]);
            while (m.find()) {
                sentencesInParagraph[i]++;
            }
            System.out.println("[" + sentencesInParagraph[i] + "]" + paragraphs[i].substring(0, 20));
        }
        show(sort123(paragraphs, sentencesInParagraph));
    }

    static void sortWordsInSentencesByLength(String str) {
        System.out.println("=== сортировка предложений по длине слов: ===");
        Matcher mp = Pattern.compile(".*[.?!]").matcher(str);
        while (mp.find()) {
            String paragraph = mp.group();
            Matcher ms = Pattern.compile("([^\\?\\.!]*[\\?\\.!]+)").matcher(paragraph);
            while (ms.find()) {
                String sentence = ms.group();
                String [] words = splitIntoWords(sentence);
                show(sort123(words, findOutTheLength(words)), " ");
            }
            System.out.println();
        }
    }

    static void findSymbolAndSort(String str, char symbol) {
        System.out.println("=== сортировка лексем в предложениях по количеству вхождений символа '" + symbol + "' : ===");
        Matcher mp = Pattern.compile(".*[.?!]").matcher(str);
        while (mp.find()) {
            String paragraph = mp.group();
            Matcher ms = Pattern.compile("([^\\?\\.!\\n]*)").matcher(paragraph);
            while (ms.find()) {
                String sentence = ms.group();
                if (sentence.isEmpty()) {
                    continue;
                }
                String [] words = splitIntoWords(sentence);
                int[] numberOfOccurrences = new int[words.length];
                fillNumberOfOccurrences(numberOfOccurrences, words, symbol);
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
                sentence = joinStrings(words);
                System.out.print(sentence + " ");
            }
            System.out.println();
        }
    }

    static void fillNumberOfOccurrences(int [] nums, String [] str, char symbol) {
        for (int j = 0; j < str.length; j++) {
            for (int k = 0; k < str[j].length(); k++) {
                if (str[j].charAt(k) == symbol) {
                    nums[j]++;
                }
            }
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

    static String [] splitIntoWords(String sentence) {
        return sentence.split("\\s");
    }

    static int [] findOutTheLength(String [] a) {
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
                    swap(arrayOfStrings, i, j);
                    swap(numbers, i, j);
                }
            }
        }
        return arrayOfStrings;
    }

    static void sort321(String [] arrayOfStrings, int [] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    swap(arrayOfStrings, i, j);
                    swap(numbers, i, j);
                }
            }
        }
    }

    static void sortAbc(String [] arrayOfStrings) {
        for (int i = 0; i < arrayOfStrings.length; i++) {
            for (int j = i + 1; j < arrayOfStrings.length; j++) {
                if (arrayOfStrings[i].compareToIgnoreCase(arrayOfStrings[j]) > 0) {
                    swap(arrayOfStrings, i, j);
                }
            }
        }
    }

    static <T> void swap(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    static void swap(int [] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
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
