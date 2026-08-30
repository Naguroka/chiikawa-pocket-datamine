package com.facebook.ads.redexgen.core;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03912w<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>>, java.util.Map.Entry<K, V> {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"EcQijE7IVr04Rw61NGaoicInYj0Y5pIf", "PCDE4c", "BYuZqH1", "OJoSfp", "QCWxhSjCiFvhWHavsiQeM5doYPZYmeMK", "d82pg0nhnPmaH2Vj0U0d9nQwwUZrcRQP", "ixFFHsUoC5yCXRppT5dY", "J79m4yZ8T6gMUys2Mw9buLKZFKLQuXB5"};
    public int A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.AbstractC03932y A03;
    public boolean A02 = false;
    public int A01 = -1;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 41);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{123, 30, 34, 35, 57, 106, 41, 37, 36, 62, 43, 35, 36, 47, 56, 106, 46, 37, 47, 57, 106, 36, 37, 62, 106, 57, okio.Utf8.REPLACEMENT_BYTE, 58, 58, 37, 56, 62, 106, 56, 47, 62, 43, 35, 36, 35, 36, 45, 106, 7, 43, 58, 100, 15, 36, 62, 56, 51, 106, 37, 40, 32, 47, 41, 62, 57};
    }

    static {
        A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    public C03912w(com.facebook.ads.redexgen.core.AbstractC03932y abstractC03932y) {
        this.A03 = abstractC03932y;
        this.A00 = abstractC03932y.A04() - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final java.util.Map.Entry<K, V> next() {
        if (hasNext()) {
            this.A01++;
            this.A02 = true;
            return this;
        }
        throw new java.util.NoSuchElementException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (this.A02) {
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            return com.facebook.ads.redexgen.core.AbstractC03862r.A04(entry.getKey(), this.A03.A0B(this.A01, 0)) && com.facebook.ads.redexgen.core.AbstractC03862r.A04(entry.getValue(), this.A03.A0B(this.A01, 1));
        }
        throw new java.lang.IllegalStateException(A01(1, 59, 99));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public final K getKey() {
        if (this.A02) {
            return (K) this.A03.A0B(this.A01, 0);
        }
        throw new java.lang.IllegalStateException(A01(1, 59, 99));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public final V getValue() {
        if (this.A02) {
            return (V) this.A03.A0B(this.A01, 1);
        }
        throw new java.lang.IllegalStateException(A01(1, 59, 99));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01 < this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (this.A02) {
            java.lang.Object objA0B = this.A03.A0B(this.A01, 0);
            java.lang.Object value = this.A03.A0B(this.A01, 1);
            return (value != null ? value.hashCode() : 0) ^ (objA0B == null ? 0 : objA0B.hashCode());
        }
        throw new java.lang.IllegalStateException(A01(1, 59, 99));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Iterator
    public final void remove() {
        if (this.A02) {
            this.A03.A0E(this.A01);
            this.A01--;
            int i = this.A00;
            java.lang.String[] strArr = A05;
            if (strArr[4].charAt(29) == strArr[0].charAt(29)) {
                throw new java.lang.RuntimeException();
            }
            A05[6] = "BDV7jip61nQIrhzKiydP";
            this.A00 = i - 1;
            this.A02 = false;
            return;
        }
        throw new java.lang.IllegalStateException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        if (this.A02) {
            return (V) this.A03.A0C(this.A01, v);
        }
        throw new java.lang.IllegalStateException(A01(1, 59, 99));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    public final java.lang.String toString() {
        return getKey() + A01(0, 1, 111) + getValue();
    }
}
