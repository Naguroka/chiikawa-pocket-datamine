package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.d9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\t\u0010\f\u001a~\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u000f2\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u00112(\u0010\u0012\u001a$\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0013H\u0082\b¢\u0006\u0002\u0010\u0014\"\u0018\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"EMPTY", "", "", "[Ljava/lang/Object;", "MAX_SIZE", "", "collectionToArray", "collection", "", "toArray", "(Ljava/util/Collection;)[Ljava/lang/Object;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "toArrayImpl", "empty", "Lkotlin/Function0;", "alloc", "Lkotlin/Function1;", "trim", "Lkotlin/Function2;", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public abstract class AbstractC1399d9 {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"YRWMBYiInjfQquDkxRxaATvpWTtljPJC", "ofzRm5oD0ZehPjXAXsE4VN9RCemE2t7K", "rA3SUki7nKpweXyrpjsgW", "Q8xFqD15qZ9htNy6CShIJMvcdmz5frjW", "47AxPgGepX47UnNHLVE8SY2HaawvPhh1", "ilOqevOSCglGHIOxiwAEAySXTzWlxd7f", "WuOUZ6PVGszUBtiCu1AXLxWGhthYizTs", "WIuZhNvv8KxyFIlYsT8aGBLDwb7Qt6lT"};
    public static final java.lang.Object[] A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 30);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{108, 96, 99, 99, 106, 108, 123, 102, 96, 97, 26, 22, 9, 0, 54, 31, 81, 87, 87, 87, 80, 123, 96, 121, 121, 53, 118, 116, 123, 123, 122, 97, 53, 119, 112, 53, 118, 116, 102, 97, 53, 97, 122, 53, 123, 122, 123, 56, 123, 96, 121, 121, 53, 97, 108, 101, 112, 53, 126, 122, 97, 121, 124, 123, 59, 84, 103, 103, 116, 108, 41, 126, 122, 97, 121, 124, 123, 59, 84, 123, 108, 42, 43};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @kotlin.Deprecated(message = "This function will be made internal in a future release")
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.9")
    public static final java.lang.Object[] A02(java.util.Collection<?> collection) {
        com.facebook.ads.redexgen.core.C1397d7.A07(collection, A00(0, 10, 17));
        int size = collection.size();
        if (size == 0) {
            return A02;
        }
        java.util.Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return A02;
        }
        java.lang.Object[] objArrCopyOf = new java.lang.Object[size];
        int i = 0;
        while (true) {
            i++;
            objArrCopyOf[i] = it.next();
            int length = objArrCopyOf.length;
            java.lang.String strA00 = A00(10, 11, 103);
            if (i >= length) {
                boolean zHasNext = it.hasNext();
                java.lang.String[] strArr = A01;
                if (strArr[3].charAt(14) == strArr[1].charAt(14)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A01;
                strArr2[6] = "EScuV0zxhuEvZysc5helwPhrpqvjjBl6";
                strArr2[4] = "HbMMbmPQRBR0PjZnzsYHyu73qTDtUO0T";
                if (!zHasNext) {
                    return objArrCopyOf;
                }
                int i2 = ((i * 3) + 1) >>> 1;
                if (i2 <= i) {
                    if (i >= 2147483645) {
                        throw new java.lang.OutOfMemoryError();
                    }
                    i2 = 2147483645;
                }
                objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, i2);
                com.facebook.ads.redexgen.core.C1397d7.A06(objArrCopyOf, strA00);
            } else if (!it.hasNext()) {
                java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArrCopyOf, i);
                com.facebook.ads.redexgen.core.C1397d7.A06(objArrCopyOf2, strA00);
                return objArrCopyOf2;
            }
        }
    }

    static {
        A01();
        A02 = new java.lang.Object[0];
    }

    @kotlin.Deprecated(message = "This function will be made internal in a future release")
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.9")
    public static final java.lang.Object[] A03(java.util.Collection<?> collection, java.lang.Object[] objArr) {
        java.lang.Object[] objArrCopyOf;
        com.facebook.ads.redexgen.core.C1397d7.A07(collection, A00(0, 10, 17));
        if (objArr != null) {
            int size = collection.size();
            if (size == 0) {
                int $i$f$toArrayImpl = objArr.length;
                if ($i$f$toArrayImpl > 0) {
                    objArr[0] = null;
                }
            } else {
                java.util.Iterator<?> it = collection.iterator();
                if (!it.hasNext()) {
                    if (objArr.length > 0) {
                        objArr[0] = null;
                    }
                } else {
                    int length = objArr.length;
                    java.lang.String[] strArr = A01;
                    java.lang.String str = strArr[3];
                    java.lang.String str2 = strArr[1];
                    int size$iv = str.charAt(14);
                    int $i$f$toArrayImpl2 = str2.charAt(14);
                    if (size$iv != $i$f$toArrayImpl2) {
                        java.lang.String[] strArr2 = A01;
                        strArr2[6] = "lrytJuFjMaT6Yp6XeApmWusax7Y4JpNy";
                        strArr2[4] = "gD4OyNyezD5obJmFstdRZH3h61osYZaN";
                        if (size <= length) {
                            objArrCopyOf = objArr;
                        } else {
                            java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), size);
                            com.facebook.ads.redexgen.core.C1397d7.A05(objNewInstance, A00(21, 62, 11));
                            objArrCopyOf = (java.lang.Object[]) objNewInstance;
                        }
                        int i$iv = 0;
                        while (true) {
                            i$iv++;
                            objArrCopyOf[i$iv] = it.next();
                            int length2 = objArrCopyOf.length;
                            java.lang.String strA00 = A00(10, 11, 103);
                            if (i$iv >= length2) {
                                if (!it.hasNext()) {
                                    return objArrCopyOf;
                                }
                                int $i$f$toArrayImpl3 = i$iv * 3;
                                int $i$f$toArrayImpl4 = ($i$f$toArrayImpl3 + 1) >>> 1;
                                if ($i$f$toArrayImpl4 <= i$iv) {
                                    if (i$iv < 2147483645) {
                                        $i$f$toArrayImpl4 = 2147483645;
                                    } else {
                                        throw new java.lang.OutOfMemoryError();
                                    }
                                }
                                objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, $i$f$toArrayImpl4);
                                com.facebook.ads.redexgen.core.C1397d7.A06(objArrCopyOf, strA00);
                            } else if (!it.hasNext()) {
                                if (objArrCopyOf == objArr) {
                                    objArr[i$iv] = null;
                                } else {
                                    objArr = java.util.Arrays.copyOf(objArrCopyOf, i$iv);
                                    java.lang.String[] strArr3 = A01;
                                    java.lang.String str3 = strArr3[7];
                                    java.lang.String str4 = strArr3[0];
                                    int size$iv2 = str3.charAt(1);
                                    int $i$f$toArrayImpl5 = str4.charAt(1);
                                    if (size$iv2 == $i$f$toArrayImpl5) {
                                        break;
                                    }
                                    java.lang.Object[] result$iv = A01;
                                    result$iv[5] = "MOwQC4VnYrG9FSwrwyUZAgsxR7nFQ96o";
                                    com.facebook.ads.redexgen.core.C1397d7.A06(objArr, strA00);
                                }
                                return objArr;
                            }
                        }
                    }
                    throw new java.lang.RuntimeException();
                }
            }
            return objArr;
        }
        throw new java.lang.NullPointerException();
    }
}
