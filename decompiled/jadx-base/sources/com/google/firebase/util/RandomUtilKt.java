package com.google.firebase.util;

/* JADX INFO: compiled from: RandomUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"ALPHANUMERIC_ALPHABET", "", "getALPHANUMERIC_ALPHABET$annotations", "()V", "nextAlphanumericString", "Lkotlin/random/Random;", "length", "", "com.google.firebase-firebase-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RandomUtilKt {
    private static final java.lang.String ALPHANUMERIC_ALPHABET = "23456789abcdefghjkmnpqrstvwxyz";

    private static /* synthetic */ void getALPHANUMERIC_ALPHABET$annotations() {
    }

    public static final java.lang.String nextAlphanumericString(kotlin.random.Random random, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "<this>");
        if (!(i >= 0)) {
            throw new java.lang.IllegalArgumentException(("invalid length: " + i).toString());
        }
        kotlin.ranges.IntRange intRangeUntil = kotlin.ranges.RangesKt.until(0, i);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        java.util.Iterator<java.lang.Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            ((kotlin.collections.IntIterator) it).nextInt();
            arrayList.add(java.lang.Character.valueOf(kotlin.text.StringsKt.random(ALPHANUMERIC_ALPHABET, random)));
        }
        return kotlin.collections.CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }
}
