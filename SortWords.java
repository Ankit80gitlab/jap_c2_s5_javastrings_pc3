package com.jap.sortwords;

/* Write a Java program to sort all of the words in the list in alphabetical order and display */
public class SortWords {
    public static void main(String[] args) {
        String[] words = {};

        SortWords sortWords = new SortWords();
        // Call method to sort words alphabetically
        String[] sortedWords = sortWords.sort(words);

        // Display the words after sorting alphabetically
		for (int i=0; i<words.length; i++)
		{
		System.out.print(sortedWords[i]);
		}
    }

    // Function to sort words in an array in alphabetical order
    public String[] sort(String[] words) {

		String temp = null;
        for (int i = 0; i < words.length; i++)
        {
            for (int j = 0; j < words.length - 1; j++)
            {
                if (words[j].compareToIgnoreCase(words[j + 1]) > 0)
                {
                    temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
               return words;
	}
}