package com.google.common.primitives;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
public final class Bytes {
    public static int hashCode(byte value) {
        return value;
    }

    private Bytes() {
    }

    public static boolean contains(byte[] array, byte target) {
        for (byte b : array) {
            if (b == target) {
                return true;
            }
        }
        return false;
    }

    public static int indexOf(byte[] array, byte target) {
        return indexOf(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(byte[] array, byte target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public static int indexOf(byte[] array, byte[] target) {
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

    public static int lastIndexOf(byte[] array, byte target) {
        return lastIndexOf(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(byte[] array, byte target, int start, int end) {
        for (int i = end - 1; i >= start; i--) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static byte[] concat(byte[]... arrays) {
        int length = 0;
        for (byte[] bArr : arrays) {
            length += bArr.length;
        }
        byte[] bArr2 = new byte[length];
        int length2 = 0;
        for (byte[] bArr3 : arrays) {
            java.lang.System.arraycopy(bArr3, 0, bArr2, length2, bArr3.length);
            length2 += bArr3.length;
        }
        return bArr2;
    }

    public static byte[] ensureCapacity(byte[] array, int minLength, int padding) {
        com.google.common.base.Preconditions.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        com.google.common.base.Preconditions.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? java.util.Arrays.copyOf(array, minLength + padding) : array;
    }

    public static byte[] toArray(java.util.Collection<? extends java.lang.Number> collection) {
        if (collection instanceof com.google.common.primitives.Bytes.ByteArrayAsList) {
            return ((com.google.common.primitives.Bytes.ByteArrayAsList) collection).toByteArray();
        }
        java.lang.Object[] array = collection.toArray();
        int length = array.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = ((java.lang.Number) com.google.common.base.Preconditions.checkNotNull(array[i])).byteValue();
        }
        return bArr;
    }

    public static java.util.List<java.lang.Byte> asList(byte... backingArray) {
        if (backingArray.length == 0) {
            return java.util.Collections.emptyList();
        }
        return new com.google.common.primitives.Bytes.ByteArrayAsList(backingArray);
    }

    private static class ByteArrayAsList extends java.util.AbstractList<java.lang.Byte> implements java.util.RandomAccess, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final byte[] array;
        final int end;
        final int start;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        ByteArrayAsList(byte[] array) {
            this(array, 0, array.length);
        }

        ByteArrayAsList(byte[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Byte get(int index) {
            com.google.common.base.Preconditions.checkElementIndex(index, size());
            return java.lang.Byte.valueOf(this.array[this.start + index]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object target) {
            return (target instanceof java.lang.Byte) && com.google.common.primitives.Bytes.indexOf(this.array, ((java.lang.Byte) target).byteValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@javax.annotation.CheckForNull java.lang.Object target) {
            int iIndexOf;
            if (!(target instanceof java.lang.Byte) || (iIndexOf = com.google.common.primitives.Bytes.indexOf(this.array, ((java.lang.Byte) target).byteValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object target) {
            int iLastIndexOf;
            if (!(target instanceof java.lang.Byte) || (iLastIndexOf = com.google.common.primitives.Bytes.lastIndexOf(this.array, ((java.lang.Byte) target).byteValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Byte set(int index, java.lang.Byte element) {
            com.google.common.base.Preconditions.checkElementIndex(index, size());
            byte[] bArr = this.array;
            int i = this.start;
            byte b = bArr[i + index];
            bArr[i + index] = ((java.lang.Byte) com.google.common.base.Preconditions.checkNotNull(element)).byteValue();
            return java.lang.Byte.valueOf(b);
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List<java.lang.Byte> subList(int fromIndex, int toIndex) {
            com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return java.util.Collections.emptyList();
            }
            byte[] bArr = this.array;
            int i = this.start;
            return new com.google.common.primitives.Bytes.ByteArrayAsList(bArr, fromIndex + i, i + toIndex);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            if (object == this) {
                return true;
            }
            if (object instanceof com.google.common.primitives.Bytes.ByteArrayAsList) {
                com.google.common.primitives.Bytes.ByteArrayAsList byteArrayAsList = (com.google.common.primitives.Bytes.ByteArrayAsList) object;
                int size = size();
                if (byteArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.array[this.start + i] != byteArrayAsList.array[byteArrayAsList.start + i]) {
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
                iHashCode = (iHashCode * 31) + com.google.common.primitives.Bytes.hashCode(this.array[i]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(size() * 5);
            sb.append('[').append((int) this.array[this.start]);
            int i = this.start;
            while (true) {
                i++;
                if (i < this.end) {
                    sb.append(", ").append((int) this.array[i]);
                } else {
                    return sb.append(']').toString();
                }
            }
        }

        byte[] toByteArray() {
            return java.util.Arrays.copyOfRange(this.array, this.start, this.end);
        }
    }

    public static void reverse(byte[] array) {
        com.google.common.base.Preconditions.checkNotNull(array);
        reverse(array, 0, array.length);
    }

    public static void reverse(byte[] array, int fromIndex, int toIndex) {
        com.google.common.base.Preconditions.checkNotNull(array);
        com.google.common.base.Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = toIndex - 1; fromIndex < i; i--) {
            byte b = array[fromIndex];
            array[fromIndex] = array[i];
            array[i] = b;
            fromIndex++;
        }
    }

    public static void rotate(byte[] array, int distance) {
        rotate(array, distance, 0, array.length);
    }

    public static void rotate(byte[] array, int distance, int fromIndex, int toIndex) {
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
}
