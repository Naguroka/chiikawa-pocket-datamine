package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tb {
    public static int a(int i) {
        return i;
    }

    public static int a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(int[] iArr, int i, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (iArr[i4] == i) {
                return i4;
            }
        }
        return -1;
    }

    private static class a extends java.util.AbstractList implements java.util.RandomAccess, java.io.Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f1360a;
        final int b;
        final int c;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.c - this.b;
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Integer get(int i) {
            com.applovin.exoplayer2.common.base.Preconditions.checkElementIndex(i, size());
            return java.lang.Integer.valueOf(this.f1360a[this.b + i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(java.lang.Object obj) {
            return (obj instanceof java.lang.Integer) && com.applovin.impl.tb.c(this.f1360a, ((java.lang.Integer) obj).intValue(), this.b, this.c) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(java.lang.Object obj) {
            int iC;
            if (!(obj instanceof java.lang.Integer) || (iC = com.applovin.impl.tb.c(this.f1360a, ((java.lang.Integer) obj).intValue(), this.b, this.c)) < 0) {
                return -1;
            }
            return iC - this.b;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(java.lang.Object obj) {
            int iD;
            if (!(obj instanceof java.lang.Integer) || (iD = com.applovin.impl.tb.d(this.f1360a, ((java.lang.Integer) obj).intValue(), this.b, this.c)) < 0) {
                return -1;
            }
            return iD - this.b;
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Integer set(int i, java.lang.Integer num) {
            com.applovin.exoplayer2.common.base.Preconditions.checkElementIndex(i, size());
            int[] iArr = this.f1360a;
            int i2 = this.b + i;
            int i3 = iArr[i2];
            iArr[i2] = ((java.lang.Integer) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(num)).intValue();
            return java.lang.Integer.valueOf(i3);
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List subList(int i, int i2) {
            com.applovin.exoplayer2.common.base.Preconditions.checkPositionIndexes(i, i2, size());
            if (i == i2) {
                return java.util.Collections.emptyList();
            }
            int[] iArr = this.f1360a;
            int i3 = this.b;
            return new com.applovin.impl.tb.a(iArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof com.applovin.impl.tb.a) {
                com.applovin.impl.tb.a aVar = (com.applovin.impl.tb.a) obj;
                int size = size();
                if (aVar.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.f1360a[this.b + i] != aVar.f1360a[aVar.b + i]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iA = 1;
            for (int i = this.b; i < this.c; i++) {
                iA = (iA * 31) + com.applovin.impl.tb.a(this.f1360a[i]);
            }
            return iA;
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(size() * 5);
            sb.append('[').append(this.f1360a[this.b]);
            int i = this.b;
            while (true) {
                i++;
                if (i < this.c) {
                    sb.append(", ").append(this.f1360a[i]);
                } else {
                    return sb.append(']').toString();
                }
            }
        }

        int[] a() {
            return java.util.Arrays.copyOfRange(this.f1360a, this.b, this.c);
        }

        a(int[] iArr, int i, int i2) {
            this.f1360a = iArr;
            this.b = i;
            this.c = i2;
        }
    }

    public static java.util.List a(int... iArr) {
        if (iArr.length == 0) {
            return java.util.Collections.emptyList();
        }
        return new com.applovin.impl.tb.a(iArr);
    }

    public static int a(long j) {
        int i = (int) j;
        com.applovin.exoplayer2.common.base.Preconditions.checkArgument(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int[] a(java.util.Collection collection) {
        if (collection instanceof com.applovin.impl.tb.a) {
            return ((com.applovin.impl.tb.a) collection).a();
        }
        java.lang.Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((java.lang.Number) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(array[i])).intValue();
        }
        return iArr;
    }
}
