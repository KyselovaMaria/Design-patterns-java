package Homework4.Task2;


/**
 * Builder for constructing a string with additional functionality.
 */
public class StringBuilderCustom {
    private StringBuilder stringBuilder;

    public StringBuilderCustom() {
        this.stringBuilder = new StringBuilder();
    }

    /**
     * Appends the given sequence to the end of the string.
     * @param text The text to append.
     * @return The builder instance for method chaining.
     */
    public StringBuilderCustom append(String text) {
        stringBuilder.append(text);
        return this;
    }

    /**
     * Inserts the given sequence at the specified position.
     * @param index The position where the text should be inserted.
     * @param text The text to insert.
     * @return The builder instance for method chaining.
     */
    public StringBuilderCustom insert(int index, String text) {
        if (index < 0 || index > stringBuilder.length()) {
            throw new IndexOutOfBoundsException("Index out of range.");
        }
        stringBuilder.insert(index, text);
        return this;
    }

    /**
     * Removes a part of the string from start index to end index.
     * @param start The start index.
     * @param end The end index (exclusive).
     * @return The builder instance for method chaining.
     */
    public StringBuilderCustom delete(int start, int end) {
        if (start < 0 || end > stringBuilder.length() || start > end) {
            throw new IndexOutOfBoundsException("Invalid index range.");
        }
        stringBuilder.delete(start, end);
        return this;
    }

    /**
     * Returns the final constructed string.
     * @return The final string.
     */
    public String build() {
        return stringBuilder.toString();
    }
}
