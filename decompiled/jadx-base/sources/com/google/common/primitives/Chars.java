package com.google.common.primitives;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
public final class Chars {
    public static final int BYTES = 2;

    public static int compare(char a2, char b) {
        return a2 - b;
    }

    public static char fromBytes(byte b1, byte b2) {
        return (char) ((b1 << 8) | (b2 & 255));
    }

    public static int hashCode(char value) {
        return value;
    }

    public static char saturatedCast(long value) {
        if (value > okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            return kotlin.jvm.internal.CharCompanionObject.MAX_VALUE;
        }
        if (value < 0) {
            return (char) 0;
        }
        return (char) value;
    }

    public static byte[] toByteArray(char value) {
        return new byte[]{(byte) (value >> '\b'), (byte) value};
    }

    private Chars() {
    }

    public static char checkedCast(long value) {
        char c = (char) value;
        com.google.common.base.Preconditions.checkArgument(((long) c) == value, "Out of range: %s", value);
        return c;
    }

    public static boolean contains(char[] array, char target) {
        for (char c : array) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }

    public static int indexOf(char[] array, char target) {
        return indexOf(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(char[] array, char target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public static int indexOf(char[] array, char[] target) {
        com.google.common.base.Preconditions.checkNotNull(array, "array");
        com.google.common.base.Preconditions.checkNotNull(target, androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET);
        if (target.length == 0) {
            return 0;
        }
        for (int i = 0; i < (array.length - target.length) + 1; i++) {
            for (int i2 = 0; i2 < target.length; i2++) {
                if (array[i + i2] != target[i2]) {
                }
            }
            return i;
        }
        return -1;
    }

    public static int lastIndexOf(char[] array, char target) {
        return lastIndexOf(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(char[] array, char target, int start, int end) {
        for (int i = end - 1; i >= start; i--) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static char min(char... array) {
        com.google.common.base.Preconditions.checkArgument(array.length > 0);
        char c = array[0];
        for (int i = 1; i < array.length; i++) {
            char c2 = array[i];
            if (c2 < c) {
                c = c2;
            }
        }
        return c;
    }

    public static char max(char... array) {
        com.google.common.base.Preconditions.checkArgument(array.length > 0);
        char c = array[0];
        for (int i = 1; i < array.length; i++) {
            char c2 = array[i];
            if (c2 > c) {
                c = c2;
            }
        }
        return c;
    }

    public static char constrainToRange(char value, char min, char max) {
        com.google.common.base.Preconditions.checkArgument(min <= max, "min (%s) must be less than or equal to max (%s)", min, max);
        if (value < min) {
            return min;
        }
        return value < max ? value : max;
    }

    public static char[] concat(char[]... arrays) {
        int length = 0;
        for (char[] cArr : arrays) {
            length += cArr.length;
        }
        char[] cArr2 = new char[length];
        int length2 = 0;
        for (char[] cArr3 : arrays) {
            java.lang.System.arraycopy(cArr3, 0, cArr2, length2, cArr3.length);
            length2 += cArr3.length;
        }
        return cArr2;
    }

    public static char fromByteArray(byte[] bytes) {
        com.google.common.base.Preconditions.checkArgument(bytes.length >= 2, "array too small: %s < %s", bytes.length, 2);
        return fromBytes(bytes[0], bytes[1]);
    }

    public static char[] ensureCapacity(char[] array, int minLength, int padding) {
        com.google.common.base.Preconditions.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        com.google.common.base.Preconditions.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? java.util.Arrays.copyOf(array, minLength + padding) : array;
    }

    public static java.lang.String join(java.lang.String separator, char... array) {
        com.google.common.base.Preconditions.checkNotNull(separator);
        int length = array.length;
        if (length == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder((separator.length() * (length - 1)) + length);
        sb.append(array[0]);
        for (int i = 1; i < length; i++) {
            sb.append(separator).append(array[i]);
        }
        return sb.toString();
    }

    public static java.util.Comparator<char[]> lexicographicalComparator() {
        return com.google.common.primitives.Chars.LexicographicalComparator.INSTANCE;
    }

    private enum LexicographicalComparator implements java.util.Comparator<char[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public java.lang.String toString() {
            return "Chars.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(char[] left, char[] right) {
            int iMin = java.lang.Math.min(left.length, right.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = com.google.common.primitives.Chars.compare(left[i], right[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }
    }

    public static char[] toArray(java.util.Collection<java.lang.Character> collection) {
        if (collection instanceof com.google.common.primitives.Chars.CharArrayAsList) {
            return ((com.google.common.primitives.Chars.CharArrayAsList) collection).toCharArray();
        }
        java.lang.Object[] array = collection.toArray();
        int length = array.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = ((java.lang.Character) com.google.common.base.Preconditions.checkNotNull(array[i])).charValue();
        }
        return cArr;
    }

    public static void sortDescending(char[] array) {
        com.google.common.base.Preconditions.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static void sortDescending(char[] array, int fromIndex, int toIndex) {
        com.google.common.base.Preconditions.checkNotNull(array);
        com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        java.util.Arrays.sort(array, fromIndex, toIndex);
        reverse(array, fromIndex, toIndex);
    }

    public static void reverse(char[] array) {
        com.google.common.base.Preconditions.checkNotNull(array);
        reverse(array, 0, array.length);
    }

    public static void reverse(char[] array, int fromIndex, int toIndex) {
        com.google.common.base.Preconditions.checkNotNull(array);
        com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = toIndex - 1; fromIndex < i; i--) {
            char c = array[fromIndex];
            array[fromIndex] = array[i];
            array[i] = c;
            fromIndex++;
        }
    }

    public static void rotate(char[] array, int distance) {
        rotate(array, distance, 0, array.length);
    }

    public static void rotate(char[] array, int distance, int fromIndex, int toIndex) {
        com.google.common.base.Preconditions.checkNotNull(array);
        com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        if (array.length <= 1) {
            return;
        }
        int i = toIndex - fromIndex;
        int i2 = (-distance) % i;
        if (i2 < 0) {
            i2 += i;
        }
        int i3 = i2 + fromIndex;
        if (i3 == fromIndex) {
            return;
        }
        reverse(array, fromIndex, i3);
        reverse(array, i3, toIndex);
        reverse(array, fromIndex, toIndex);
    }

    public static java.util.List<java.lang.Character> asList(char... backingArray) {
        if (backingArray.length == 0) {
            return java.util.Collections.emptyList();
        }
        return new com.google.common.primitives.Chars.CharArrayAsList(backingArray);
    }

    private static class CharArrayAsList extends java.util.AbstractList<java.lang.Character> implements java.util.RandomAccess, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final char[] array;
        final int end;
        final int start;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        CharArrayAsList(char[] array) {
            this(array, 0, array.length);
        }

        CharArrayAsList(char[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Character get(int index) {
            com.google.common.base.Preconditions.checkElementIndex(index, size());
            return java.lang.Character.valueOf(this.array[this.start + index]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object target) {
            return (target instanceof java.lang.Character) && com.google.common.primitives.Chars.indexOf(this.array, ((java.lang.Character) target).charValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@javax.annotation.CheckForNull java.lang.Object target) {
            int iIndexOf;
            if (!(target instanceof java.lang.Character) || (iIndexOf = com.google.common.primitives.Chars.indexOf(this.array, ((java.lang.Character) target).charValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object target) {
            int iLastIndexOf;
            if (!(target instanceof java.lang.Character) || (iLastIndexOf = com.google.common.primitives.Chars.lastIndexOf(this.array, ((java.lang.Character) target).charValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Character set(int index, java.lang.Character element) {
            com.google.common.base.Preconditions.checkElementIndex(index, size());
            char[] cArr = this.array;
            int i = this.start;
            char c = cArr[i + index];
            cArr[i + index] = ((java.lang.Character) com.google.common.base.Preconditions.checkNotNull(element)).charValue();
            return java.lang.Character.valueOf(c);
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List<java.lang.Character> subList(int fromIndex, int toIndex) {
            com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return java.util.Collections.emptyList();
            }
            char[] cArr = this.array;
            int i = this.start;
            return new com.google.common.primitives.Chars.CharArrayAsList(cArr, fromIndex + i, i + toIndex);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            if (object == this) {
                return true;
            }
            if (object instanceof com.google.common.primitives.Chars.CharArrayAsList) {
                com.google.common.primitives.Chars.CharArrayAsList charArrayAsList = (com.google.common.primitives.Chars.CharArrayAsList) object;
                int size = size();
                if (charArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.array[this.start + i] != charArrayAsList.array[charArrayAsList.start + i]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(object);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i = this.start; i < this.end; i++) {
                iHashCode = (iHashCode * 31) + com.google.common.primitives.Chars.hashCode(this.array[i]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(size() * 3);
            sb.append('[').append(this.array[this.start]);
            int i = this.start;
            while (true) {
                i++;
                if (i < this.end) {
                    sb.append(", ").append(this.array[i]);
                } else {
                    return sb.append(']').toString();
                }
            }
        }

        char[] toCharArray() {
            return java.util.Arrays.copyOfRange(this.array, this.start, this.end);
        }
    }
}
