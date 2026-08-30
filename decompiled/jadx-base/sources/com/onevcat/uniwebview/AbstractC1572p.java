package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1572p {
    public static final java.lang.String a(kotlin.jvm.internal.StringCompanionObject stringCompanionObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        java.util.List listPlus = kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.plus((java.lang.Iterable) new kotlin.ranges.CharRange('A', 'Z'), (java.lang.Iterable) new kotlin.ranges.CharRange('a', 'z')), (java.lang.Iterable) new kotlin.ranges.CharRange('0', '9'));
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(1, 8);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRange, 10));
        java.util.Iterator<java.lang.Integer> it = intRange.iterator();
        while (it.hasNext()) {
            ((kotlin.collections.IntIterator) it).nextInt();
            java.lang.Character ch = (java.lang.Character) kotlin.collections.CollectionsKt.random(listPlus, kotlin.random.Random.INSTANCE);
            ch.getClass();
            arrayList.add(ch);
        }
        return kotlin.collections.CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }
}
