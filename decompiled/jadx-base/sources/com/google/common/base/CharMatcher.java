package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
public abstract class CharMatcher implements com.google.common.base.Predicate<java.lang.Character> {
    private static final int DISTINCT_CHARS = 65536;

    private static boolean isSmall(int totalCharacters, int tableLength) {
        return totalCharacters <= 1023 && tableLength > (totalCharacters * 4) * 16;
    }

    public abstract boolean matches(char c);

    public static com.google.common.base.CharMatcher any() {
        return com.google.common.base.CharMatcher.Any.INSTANCE;
    }

    public static com.google.common.base.CharMatcher none() {
        return com.google.common.base.CharMatcher.None.INSTANCE;
    }

    public static com.google.common.base.CharMatcher whitespace() {
        return com.google.common.base.CharMatcher.Whitespace.INSTANCE;
    }

    public static com.google.common.base.CharMatcher breakingWhitespace() {
        return com.google.common.base.CharMatcher.BreakingWhitespace.INSTANCE;
    }

    public static com.google.common.base.CharMatcher ascii() {
        return com.google.common.base.CharMatcher.Ascii.INSTANCE;
    }

    @java.lang.Deprecated
    public static com.google.common.base.CharMatcher digit() {
        return com.google.common.base.CharMatcher.Digit.INSTANCE;
    }

    @java.lang.Deprecated
    public static com.google.common.base.CharMatcher javaDigit() {
        return com.google.common.base.CharMatcher.JavaDigit.INSTANCE;
    }

    @java.lang.Deprecated
    public static com.google.common.base.CharMatcher javaLetter() {
        return com.google.common.base.CharMatcher.JavaLetter.INSTANCE;
    }

    @java.lang.Deprecated
    public static com.google.common.base.CharMatcher javaLetterOrDigit() {
        return com.google.common.base.CharMatcher.JavaLetterOrDigit.INSTANCE;
    }

    @java.lang.Deprecated
    public static com.google.common.base.CharMatcher javaUpperCase() {
        return com.google.common.base.CharMatcher.JavaUpperCase.INSTANCE;
    }

    @java.lang.Deprecated
    public static com.google.common.base.CharMatcher javaLowerCase() {
        return com.google.common.base.CharMatcher.JavaLowerCase.INSTANCE;
    }

    public static com.google.common.base.CharMatcher javaIsoControl() {
        return com.google.common.base.CharMatcher.JavaIsoControl.INSTANCE;
    }

    @java.lang.Deprecated
    public static com.google.common.base.CharMatcher invisible() {
        return com.google.common.base.CharMatcher.Invisible.INSTANCE;
    }

    @java.lang.Deprecated
    public static com.google.common.base.CharMatcher singleWidth() {
        return com.google.common.base.CharMatcher.SingleWidth.INSTANCE;
    }

    public static com.google.common.base.CharMatcher is(final char match) {
        return new com.google.common.base.CharMatcher.Is(match);
    }

    public static com.google.common.base.CharMatcher isNot(final char match) {
        return new com.google.common.base.CharMatcher.IsNot(match);
    }

    public static com.google.common.base.CharMatcher anyOf(final java.lang.CharSequence sequence) {
        int length = sequence.length();
        if (length == 0) {
            return none();
        }
        if (length == 1) {
            return is(sequence.charAt(0));
        }
        if (length == 2) {
            return isEither(sequence.charAt(0), sequence.charAt(1));
        }
        return new com.google.common.base.CharMatcher.AnyOf(sequence);
    }

    public static com.google.common.base.CharMatcher noneOf(java.lang.CharSequence sequence) {
        return anyOf(sequence).negate();
    }

    public static com.google.common.base.CharMatcher inRange(final char startInclusive, final char endInclusive) {
        return new com.google.common.base.CharMatcher.InRange(startInclusive, endInclusive);
    }

    public static com.google.common.base.CharMatcher forPredicate(final com.google.common.base.Predicate<? super java.lang.Character> predicate) {
        return predicate instanceof com.google.common.base.CharMatcher ? (com.google.common.base.CharMatcher) predicate : new com.google.common.base.CharMatcher.ForPredicate(predicate);
    }

    protected CharMatcher() {
    }

    public com.google.common.base.CharMatcher negate() {
        return new com.google.common.base.CharMatcher.Negated(this);
    }

    public com.google.common.base.CharMatcher and(com.google.common.base.CharMatcher other) {
        return new com.google.common.base.CharMatcher.And(this, other);
    }

    public com.google.common.base.CharMatcher or(com.google.common.base.CharMatcher other) {
        return new com.google.common.base.CharMatcher.Or(this, other);
    }

    public com.google.common.base.CharMatcher precomputed() {
        return com.google.common.base.Platform.precomputeCharMatcher(this);
    }

    com.google.common.base.CharMatcher precomputedInternal() {
        java.lang.String strSubstring;
        java.util.BitSet bitSet = new java.util.BitSet();
        setBits(bitSet);
        int iCardinality = bitSet.cardinality();
        if (iCardinality * 2 <= 65536) {
            return precomputedPositive(iCardinality, bitSet, toString());
        }
        bitSet.flip(0, 65536);
        int i = 65536 - iCardinality;
        final java.lang.String string = toString();
        if (string.endsWith(".negate()")) {
            strSubstring = string.substring(0, string.length() - 9);
        } else {
            strSubstring = string + ".negate()";
        }
        return new com.google.common.base.CharMatcher.NegatedFastMatcher(this, precomputedPositive(i, bitSet, strSubstring)) { // from class: com.google.common.base.CharMatcher.1
            @Override // com.google.common.base.CharMatcher.Negated, com.google.common.base.CharMatcher
            public java.lang.String toString() {
                return string;
            }
        };
    }

    private static com.google.common.base.CharMatcher precomputedPositive(int totalCharacters, java.util.BitSet table, java.lang.String description) {
        if (totalCharacters == 0) {
            return none();
        }
        if (totalCharacters == 1) {
            return is((char) table.nextSetBit(0));
        }
        if (totalCharacters == 2) {
            char cNextSetBit = (char) table.nextSetBit(0);
            return isEither(cNextSetBit, (char) table.nextSetBit(cNextSetBit + 1));
        }
        if (isSmall(totalCharacters, table.length())) {
            return com.google.common.base.SmallCharMatcher.from(table, description);
        }
        return new com.google.common.base.CharMatcher.BitSetMatcher(table, description);
    }

    void setBits(java.util.BitSet table) {
        for (int i = 65535; i >= 0; i--) {
            if (matches((char) i)) {
                table.set(i);
            }
        }
    }

    public boolean matchesAnyOf(java.lang.CharSequence sequence) {
        return !matchesNoneOf(sequence);
    }

    public boolean matchesAllOf(java.lang.CharSequence sequence) {
        for (int length = sequence.length() - 1; length >= 0; length--) {
            if (!matches(sequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesNoneOf(java.lang.CharSequence sequence) {
        return indexIn(sequence) == -1;
    }

    public int indexIn(java.lang.CharSequence sequence) {
        return indexIn(sequence, 0);
    }

    public int indexIn(java.lang.CharSequence sequence, int start) {
        int length = sequence.length();
        com.google.common.base.Preconditions.checkPositionIndex(start, length);
        while (start < length) {
            if (matches(sequence.charAt(start))) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public int lastIndexIn(java.lang.CharSequence sequence) {
        for (int length = sequence.length() - 1; length >= 0; length--) {
            if (matches(sequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public int countIn(java.lang.CharSequence sequence) {
        int i = 0;
        for (int i2 = 0; i2 < sequence.length(); i2++) {
            if (matches(sequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    public java.lang.String removeFrom(java.lang.CharSequence sequence) {
        java.lang.String string = sequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        int i = 1;
        while (true) {
            iIndexIn++;
            while (iIndexIn != charArray.length) {
                if (matches(charArray[iIndexIn])) {
                    i++;
                } else {
                    charArray[iIndexIn - i] = charArray[iIndexIn];
                    iIndexIn++;
                }
            }
            return new java.lang.String(charArray, 0, iIndexIn - i);
        }
    }

    public java.lang.String retainFrom(java.lang.CharSequence sequence) {
        return negate().removeFrom(sequence);
    }

    public java.lang.String replaceFrom(java.lang.CharSequence sequence, char replacement) {
        java.lang.String string = sequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        charArray[iIndexIn] = replacement;
        while (true) {
            iIndexIn++;
            if (iIndexIn < charArray.length) {
                if (matches(charArray[iIndexIn])) {
                    charArray[iIndexIn] = replacement;
                }
            } else {
                return new java.lang.String(charArray);
            }
        }
    }

    public java.lang.String replaceFrom(java.lang.CharSequence sequence, java.lang.CharSequence replacement) {
        int length = replacement.length();
        if (length == 0) {
            return removeFrom(sequence);
        }
        int i = 0;
        if (length == 1) {
            return replaceFrom(sequence, replacement.charAt(0));
        }
        java.lang.String string = sequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        int length2 = string.length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb.append((java.lang.CharSequence) string, i, iIndexIn);
            sb.append(replacement);
            i = iIndexIn + 1;
            iIndexIn = indexIn(string, i);
        } while (iIndexIn != -1);
        sb.append((java.lang.CharSequence) string, i, length2);
        return sb.toString();
    }

    public java.lang.String trimFrom(java.lang.CharSequence sequence) {
        int length = sequence.length();
        int i = 0;
        while (i < length && matches(sequence.charAt(i))) {
            i++;
        }
        int i2 = length - 1;
        while (i2 > i && matches(sequence.charAt(i2))) {
            i2--;
        }
        return sequence.subSequence(i, i2 + 1).toString();
    }

    public java.lang.String trimLeadingFrom(java.lang.CharSequence sequence) {
        int length = sequence.length();
        for (int i = 0; i < length; i++) {
            if (!matches(sequence.charAt(i))) {
                return sequence.subSequence(i, length).toString();
            }
        }
        return "";
    }

    public java.lang.String trimTrailingFrom(java.lang.CharSequence sequence) {
        for (int length = sequence.length() - 1; length >= 0; length--) {
            if (!matches(sequence.charAt(length))) {
                return sequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    public java.lang.String collapseFrom(java.lang.CharSequence sequence, char replacement) {
        int length = sequence.length();
        int i = 0;
        while (i < length) {
            char cCharAt = sequence.charAt(i);
            if (matches(cCharAt)) {
                if (cCharAt != replacement || (i != length - 1 && matches(sequence.charAt(i + 1)))) {
                    return finishCollapseFrom(sequence, i + 1, length, replacement, new java.lang.StringBuilder(length).append(sequence, 0, i).append(replacement), true);
                }
                i++;
            }
            i++;
        }
        return sequence.toString();
    }

    public java.lang.String trimAndCollapseFrom(java.lang.CharSequence sequence, char replacement) {
        int length = sequence.length();
        int i = length - 1;
        int i2 = 0;
        while (i2 < length && matches(sequence.charAt(i2))) {
            i2++;
        }
        int i3 = i;
        while (i3 > i2 && matches(sequence.charAt(i3))) {
            i3--;
        }
        if (i2 == 0 && i3 == i) {
            return collapseFrom(sequence, replacement);
        }
        int i4 = i3 + 1;
        return finishCollapseFrom(sequence, i2, i4, replacement, new java.lang.StringBuilder(i4 - i2), false);
    }

    private java.lang.String finishCollapseFrom(java.lang.CharSequence sequence, int start, int end, char replacement, java.lang.StringBuilder builder, boolean inMatchingGroup) {
        while (start < end) {
            char cCharAt = sequence.charAt(start);
            if (!matches(cCharAt)) {
                builder.append(cCharAt);
                inMatchingGroup = false;
            } else if (!inMatchingGroup) {
                builder.append(replacement);
                inMatchingGroup = true;
            }
            start++;
        }
        return builder.toString();
    }

    @Override // com.google.common.base.Predicate
    @java.lang.Deprecated
    public boolean apply(java.lang.Character character) {
        return matches(character.charValue());
    }

    public java.lang.String toString() {
        return super.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String showCharacter(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return java.lang.String.copyValueOf(cArr);
    }

    static abstract class FastMatcher extends com.google.common.base.CharMatcher {
        @Override // com.google.common.base.CharMatcher
        public final com.google.common.base.CharMatcher precomputed() {
            return this;
        }

        FastMatcher() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character character) {
            return super.apply(character);
        }

        @Override // com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher negate() {
            return new com.google.common.base.CharMatcher.NegatedFastMatcher(this);
        }
    }

    static abstract class NamedFastMatcher extends com.google.common.base.CharMatcher.FastMatcher {
        private final java.lang.String description;

        NamedFastMatcher(java.lang.String description) {
            this.description = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(description);
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String toString() {
            return this.description;
        }
    }

    private static class NegatedFastMatcher extends com.google.common.base.CharMatcher.Negated {
        @Override // com.google.common.base.CharMatcher
        public final com.google.common.base.CharMatcher precomputed() {
            return this;
        }

        NegatedFastMatcher(com.google.common.base.CharMatcher original) {
            super(original);
        }
    }

    private static final class BitSetMatcher extends com.google.common.base.CharMatcher.NamedFastMatcher {
        private final java.util.BitSet table;

        private BitSetMatcher(java.util.BitSet table, java.lang.String description) {
            super(description);
            this.table = table.length() + 64 < table.size() ? (java.util.BitSet) table.clone() : table;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return this.table.get(c);
        }

        @Override // com.google.common.base.CharMatcher
        void setBits(java.util.BitSet bitSet) {
            bitSet.or(this.table);
        }
    }

    private static final class Any extends com.google.common.base.CharMatcher.NamedFastMatcher {
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.Any();

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return true;
        }

        private Any() {
            super("CharMatcher.any()");
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(java.lang.CharSequence sequence) {
            return sequence.length() == 0 ? -1 : 0;
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(java.lang.CharSequence sequence, int start) {
            int length = sequence.length();
            com.google.common.base.Preconditions.checkPositionIndex(start, length);
            if (start == length) {
                return -1;
            }
            return start;
        }

        @Override // com.google.common.base.CharMatcher
        public int lastIndexIn(java.lang.CharSequence sequence) {
            return sequence.length() - 1;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(java.lang.CharSequence sequence) {
            com.google.common.base.Preconditions.checkNotNull(sequence);
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(java.lang.CharSequence sequence) {
            return sequence.length() == 0;
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String removeFrom(java.lang.CharSequence sequence) {
            com.google.common.base.Preconditions.checkNotNull(sequence);
            return "";
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String replaceFrom(java.lang.CharSequence sequence, char replacement) {
            char[] cArr = new char[sequence.length()];
            java.util.Arrays.fill(cArr, replacement);
            return new java.lang.String(cArr);
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String replaceFrom(java.lang.CharSequence sequence, java.lang.CharSequence replacement) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(sequence.length() * replacement.length());
            for (int i = 0; i < sequence.length(); i++) {
                sb.append(replacement);
            }
            return sb.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String collapseFrom(java.lang.CharSequence sequence, char replacement) {
            return sequence.length() == 0 ? "" : java.lang.String.valueOf(replacement);
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String trimFrom(java.lang.CharSequence sequence) {
            com.google.common.base.Preconditions.checkNotNull(sequence);
            return "";
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(java.lang.CharSequence sequence) {
            return sequence.length();
        }

        @Override // com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher and(com.google.common.base.CharMatcher other) {
            return (com.google.common.base.CharMatcher) com.google.common.base.Preconditions.checkNotNull(other);
        }

        @Override // com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher or(com.google.common.base.CharMatcher other) {
            com.google.common.base.Preconditions.checkNotNull(other);
            return this;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher negate() {
            return none();
        }
    }

    private static final class None extends com.google.common.base.CharMatcher.NamedFastMatcher {
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.None();

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return false;
        }

        private None() {
            super("CharMatcher.none()");
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(java.lang.CharSequence sequence) {
            com.google.common.base.Preconditions.checkNotNull(sequence);
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(java.lang.CharSequence sequence, int start) {
            com.google.common.base.Preconditions.checkPositionIndex(start, sequence.length());
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public int lastIndexIn(java.lang.CharSequence sequence) {
            com.google.common.base.Preconditions.checkNotNull(sequence);
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(java.lang.CharSequence sequence) {
            return sequence.length() == 0;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(java.lang.CharSequence sequence) {
            com.google.common.base.Preconditions.checkNotNull(sequence);
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String removeFrom(java.lang.CharSequence sequence) {
            return sequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String replaceFrom(java.lang.CharSequence sequence, char replacement) {
            return sequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String replaceFrom(java.lang.CharSequence sequence, java.lang.CharSequence replacement) {
            com.google.common.base.Preconditions.checkNotNull(replacement);
            return sequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String collapseFrom(java.lang.CharSequence sequence, char replacement) {
            return sequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String trimFrom(java.lang.CharSequence sequence) {
            return sequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String trimLeadingFrom(java.lang.CharSequence sequence) {
            return sequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String trimTrailingFrom(java.lang.CharSequence sequence) {
            return sequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(java.lang.CharSequence sequence) {
            com.google.common.base.Preconditions.checkNotNull(sequence);
            return 0;
        }

        @Override // com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher and(com.google.common.base.CharMatcher other) {
            com.google.common.base.Preconditions.checkNotNull(other);
            return this;
        }

        @Override // com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher or(com.google.common.base.CharMatcher other) {
            return (com.google.common.base.CharMatcher) com.google.common.base.Preconditions.checkNotNull(other);
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher negate() {
            return any();
        }
    }

    static final class Whitespace extends com.google.common.base.CharMatcher.NamedFastMatcher {
        static final int MULTIPLIER = 1682554634;
        static final java.lang.String TABLE = "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000";
        static final int SHIFT = java.lang.Integer.numberOfLeadingZeros(31);
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.Whitespace();

        Whitespace() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return TABLE.charAt((MULTIPLIER * c) >>> SHIFT) == c;
        }

        @Override // com.google.common.base.CharMatcher
        void setBits(java.util.BitSet table) {
            for (int i = 0; i < 32; i++) {
                table.set(TABLE.charAt(i));
            }
        }
    }

    private static final class BreakingWhitespace extends com.google.common.base.CharMatcher {
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.BreakingWhitespace();

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            if (c != ' ' && c != 133 && c != 5760) {
                if (c == 8199) {
                    return false;
                }
                if (c != 8287 && c != 12288 && c != 8232 && c != 8233) {
                    switch (c) {
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                            break;
                        default:
                            return c >= 8192 && c <= 8202;
                    }
                }
            }
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
            return "CharMatcher.breakingWhitespace()";
        }

        private BreakingWhitespace() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character character) {
            return super.apply(character);
        }
    }

    private static final class Ascii extends com.google.common.base.CharMatcher.NamedFastMatcher {
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.Ascii();

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return c <= 127;
        }

        Ascii() {
            super("CharMatcher.ascii()");
        }
    }

    private static class RangesMatcher extends com.google.common.base.CharMatcher {
        private final java.lang.String description;
        private final char[] rangeEnds;
        private final char[] rangeStarts;

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character character) {
            return super.apply(character);
        }

        RangesMatcher(java.lang.String description, char[] rangeStarts, char[] rangeEnds) {
            this.description = description;
            this.rangeStarts = rangeStarts;
            this.rangeEnds = rangeEnds;
            com.google.common.base.Preconditions.checkArgument(rangeStarts.length == rangeEnds.length);
            int i = 0;
            while (i < rangeStarts.length) {
                com.google.common.base.Preconditions.checkArgument(rangeStarts[i] <= rangeEnds[i]);
                int i2 = i + 1;
                if (i2 < rangeStarts.length) {
                    com.google.common.base.Preconditions.checkArgument(rangeEnds[i] < rangeStarts[i2]);
                }
                i = i2;
            }
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            int iBinarySearch = java.util.Arrays.binarySearch(this.rangeStarts, c);
            if (iBinarySearch >= 0) {
                return true;
            }
            int i = (~iBinarySearch) - 1;
            return i >= 0 && c <= this.rangeEnds[i];
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
            return this.description;
        }
    }

    private static final class Digit extends com.google.common.base.CharMatcher.RangesMatcher {
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.Digit();
        private static final java.lang.String ZEROES = "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０";

        private static char[] zeroes() {
            return ZEROES.toCharArray();
        }

        private static char[] nines() {
            char[] cArr = new char[37];
            for (int i = 0; i < 37; i++) {
                cArr[i] = (char) (ZEROES.charAt(i) + '\t');
            }
            return cArr;
        }

        private Digit() {
            super("CharMatcher.digit()", zeroes(), nines());
        }
    }

    private static final class JavaDigit extends com.google.common.base.CharMatcher {
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.JavaDigit();

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
            return "CharMatcher.javaDigit()";
        }

        private JavaDigit() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character character) {
            return super.apply(character);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return java.lang.Character.isDigit(c);
        }
    }

    private static final class JavaLetter extends com.google.common.base.CharMatcher {
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.JavaLetter();

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
            return "CharMatcher.javaLetter()";
        }

        private JavaLetter() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character character) {
            return super.apply(character);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return java.lang.Character.isLetter(c);
        }
    }

    private static final class JavaLetterOrDigit extends com.google.common.base.CharMatcher {
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.JavaLetterOrDigit();

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }

        private JavaLetterOrDigit() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character character) {
            return super.apply(character);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return java.lang.Character.isLetterOrDigit(c);
        }
    }

    private static final class JavaUpperCase extends com.google.common.base.CharMatcher {
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.JavaUpperCase();

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
            return "CharMatcher.javaUpperCase()";
        }

        private JavaUpperCase() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character character) {
            return super.apply(character);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return java.lang.Character.isUpperCase(c);
        }
    }

    private static final class JavaLowerCase extends com.google.common.base.CharMatcher {
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.JavaLowerCase();

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
            return "CharMatcher.javaLowerCase()";
        }

        private JavaLowerCase() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character character) {
            return super.apply(character);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return java.lang.Character.isLowerCase(c);
        }
    }

    private static final class JavaIsoControl extends com.google.common.base.CharMatcher.NamedFastMatcher {
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.JavaIsoControl();

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return c <= 31 || (c >= 127 && c <= 159);
        }

        private JavaIsoControl() {
            super("CharMatcher.javaIsoControl()");
        }
    }

    private static final class Invisible extends com.google.common.base.CharMatcher.RangesMatcher {
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.Invisible();
        private static final java.lang.String RANGE_ENDS = "  \u00ad\u0605\u061c\u06dd\u070f\u0891\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb";
        private static final java.lang.String RANGE_STARTS = "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u0890\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9";

        private Invisible() {
            super("CharMatcher.invisible()", RANGE_STARTS.toCharArray(), RANGE_ENDS.toCharArray());
        }
    }

    private static final class SingleWidth extends com.google.common.base.CharMatcher.RangesMatcher {
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.SingleWidth();

        private SingleWidth() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ".toCharArray());
        }
    }

    private static class Negated extends com.google.common.base.CharMatcher {
        final com.google.common.base.CharMatcher original;

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character character) {
            return super.apply(character);
        }

        Negated(com.google.common.base.CharMatcher original) {
            this.original = (com.google.common.base.CharMatcher) com.google.common.base.Preconditions.checkNotNull(original);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return !this.original.matches(c);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(java.lang.CharSequence sequence) {
            return this.original.matchesNoneOf(sequence);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(java.lang.CharSequence sequence) {
            return this.original.matchesAllOf(sequence);
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(java.lang.CharSequence sequence) {
            return sequence.length() - this.original.countIn(sequence);
        }

        @Override // com.google.common.base.CharMatcher
        void setBits(java.util.BitSet table) {
            java.util.BitSet bitSet = new java.util.BitSet();
            this.original.setBits(bitSet);
            bitSet.flip(0, 65536);
            table.or(bitSet);
        }

        @Override // com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher negate() {
            return this.original;
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
            return this.original + ".negate()";
        }
    }

    private static final class And extends com.google.common.base.CharMatcher {
        final com.google.common.base.CharMatcher first;
        final com.google.common.base.CharMatcher second;

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character character) {
            return super.apply(character);
        }

        And(com.google.common.base.CharMatcher a2, com.google.common.base.CharMatcher b) {
            this.first = (com.google.common.base.CharMatcher) com.google.common.base.Preconditions.checkNotNull(a2);
            this.second = (com.google.common.base.CharMatcher) com.google.common.base.Preconditions.checkNotNull(b);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return this.first.matches(c) && this.second.matches(c);
        }

        @Override // com.google.common.base.CharMatcher
        void setBits(java.util.BitSet table) {
            java.util.BitSet bitSet = new java.util.BitSet();
            this.first.setBits(bitSet);
            java.util.BitSet bitSet2 = new java.util.BitSet();
            this.second.setBits(bitSet2);
            bitSet.and(bitSet2);
            table.or(bitSet);
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
            return "CharMatcher.and(" + this.first + ", " + this.second + ")";
        }
    }

    private static final class Or extends com.google.common.base.CharMatcher {
        final com.google.common.base.CharMatcher first;
        final com.google.common.base.CharMatcher second;

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character character) {
            return super.apply(character);
        }

        Or(com.google.common.base.CharMatcher a2, com.google.common.base.CharMatcher b) {
            this.first = (com.google.common.base.CharMatcher) com.google.common.base.Preconditions.checkNotNull(a2);
            this.second = (com.google.common.base.CharMatcher) com.google.common.base.Preconditions.checkNotNull(b);
        }

        @Override // com.google.common.base.CharMatcher
        void setBits(java.util.BitSet table) {
            this.first.setBits(table);
            this.second.setBits(table);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return this.first.matches(c) || this.second.matches(c);
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
            return "CharMatcher.or(" + this.first + ", " + this.second + ")";
        }
    }

    private static final class Is extends com.google.common.base.CharMatcher.FastMatcher {
        private final char match;

        Is(char match) {
            this.match = match;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return c == this.match;
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String replaceFrom(java.lang.CharSequence sequence, char replacement) {
            return sequence.toString().replace(this.match, replacement);
        }

        @Override // com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher and(com.google.common.base.CharMatcher other) {
            return other.matches(this.match) ? this : none();
        }

        @Override // com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher or(com.google.common.base.CharMatcher other) {
            return other.matches(this.match) ? other : super.or(other);
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher negate() {
            return isNot(this.match);
        }

        @Override // com.google.common.base.CharMatcher
        void setBits(java.util.BitSet table) {
            table.set(this.match);
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
            return "CharMatcher.is('" + com.google.common.base.CharMatcher.showCharacter(this.match) + "')";
        }
    }

    private static final class IsNot extends com.google.common.base.CharMatcher.FastMatcher {
        private final char match;

        IsNot(char match) {
            this.match = match;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return c != this.match;
        }

        @Override // com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher and(com.google.common.base.CharMatcher other) {
            return other.matches(this.match) ? super.and(other) : other;
        }

        @Override // com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher or(com.google.common.base.CharMatcher other) {
            return other.matches(this.match) ? any() : this;
        }

        @Override // com.google.common.base.CharMatcher
        void setBits(java.util.BitSet table) {
            table.set(0, this.match);
            table.set(this.match + 1, 65536);
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher negate() {
            return is(this.match);
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
            return "CharMatcher.isNot('" + com.google.common.base.CharMatcher.showCharacter(this.match) + "')";
        }
    }

    private static com.google.common.base.CharMatcher.IsEither isEither(char c1, char c2) {
        return new com.google.common.base.CharMatcher.IsEither(c1, c2);
    }

    private static final class IsEither extends com.google.common.base.CharMatcher.FastMatcher {
        private final char match1;
        private final char match2;

        IsEither(char match1, char match2) {
            this.match1 = match1;
            this.match2 = match2;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return c == this.match1 || c == this.match2;
        }

        @Override // com.google.common.base.CharMatcher
        void setBits(java.util.BitSet table) {
            table.set(this.match1);
            table.set(this.match2);
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
            return "CharMatcher.anyOf(\"" + com.google.common.base.CharMatcher.showCharacter(this.match1) + com.google.common.base.CharMatcher.showCharacter(this.match2) + "\")";
        }
    }

    private static final class AnyOf extends com.google.common.base.CharMatcher {
        private final char[] chars;

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character character) {
            return super.apply(character);
        }

        public AnyOf(java.lang.CharSequence chars) {
            char[] charArray = chars.toString().toCharArray();
            this.chars = charArray;
            java.util.Arrays.sort(charArray);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return java.util.Arrays.binarySearch(this.chars, c) >= 0;
        }

        @Override // com.google.common.base.CharMatcher
        void setBits(java.util.BitSet table) {
            for (char c : this.chars) {
                table.set(c);
            }
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CharMatcher.anyOf(\"");
            for (char c : this.chars) {
                sb.append(com.google.common.base.CharMatcher.showCharacter(c));
            }
            sb.append("\")");
            return sb.toString();
        }
    }

    private static final class InRange extends com.google.common.base.CharMatcher.FastMatcher {
        private final char endInclusive;
        private final char startInclusive;

        InRange(char startInclusive, char endInclusive) {
            com.google.common.base.Preconditions.checkArgument(endInclusive >= startInclusive);
            this.startInclusive = startInclusive;
            this.endInclusive = endInclusive;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return this.startInclusive <= c && c <= this.endInclusive;
        }

        @Override // com.google.common.base.CharMatcher
        void setBits(java.util.BitSet table) {
            table.set(this.startInclusive, this.endInclusive + 1);
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
            return "CharMatcher.inRange('" + com.google.common.base.CharMatcher.showCharacter(this.startInclusive) + "', '" + com.google.common.base.CharMatcher.showCharacter(this.endInclusive) + "')";
        }
    }

    private static final class ForPredicate extends com.google.common.base.CharMatcher {
        private final com.google.common.base.Predicate<? super java.lang.Character> predicate;

        ForPredicate(com.google.common.base.Predicate<? super java.lang.Character> predicate) {
            this.predicate = (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(predicate);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return this.predicate.apply(java.lang.Character.valueOf(c));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public boolean apply(java.lang.Character character) {
            return this.predicate.apply(com.google.common.base.Preconditions.checkNotNull(character));
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
            return "CharMatcher.forPredicate(" + this.predicate + ")";
        }
    }
}
