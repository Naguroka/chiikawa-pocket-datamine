package kotlin.collections;

/* JADX INFO: compiled from: _UCollections.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0019\u0010\u0000\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\u0005\u001a\u0017\u0010\f\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007¢\u0006\u0002\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0007¢\u0006\u0002\u0010\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\n0\u000eH\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"sum", "Lkotlin/UInt;", "", "Lkotlin/UByte;", "sumOfUByte", "(Ljava/lang/Iterable;)I", "sumOfUInt", "Lkotlin/ULong;", "sumOfULong", "(Ljava/lang/Iterable;)J", "Lkotlin/UShort;", "sumOfUShort", "toUByteArray", "Lkotlin/UByteArray;", "", "(Ljava/util/Collection;)[B", "toUIntArray", "Lkotlin/UIntArray;", "(Ljava/util/Collection;)[I", "toULongArray", "Lkotlin/ULongArray;", "(Ljava/util/Collection;)[J", "toUShortArray", "Lkotlin/UShortArray;", "(Ljava/util/Collection;)[S", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/UCollectionsKt")
class UCollectionsKt___UCollectionsKt {
    public static final byte[] toUByteArray(java.util.Collection<kotlin.UByte> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "<this>");
        byte[] bArrM1372constructorimpl = kotlin.UByteArray.m1372constructorimpl(collection.size());
        java.util.Iterator<kotlin.UByte> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            kotlin.UByteArray.m1383setVurrAj0(bArrM1372constructorimpl, i, it.next().getData());
            i++;
        }
        return bArrM1372constructorimpl;
    }

    public static final int[] toUIntArray(java.util.Collection<kotlin.UInt> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "<this>");
        int[] iArrM1451constructorimpl = kotlin.UIntArray.m1451constructorimpl(collection.size());
        java.util.Iterator<kotlin.UInt> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            kotlin.UIntArray.m1462setVXSXFK8(iArrM1451constructorimpl, i, it.next().getData());
            i++;
        }
        return iArrM1451constructorimpl;
    }

    public static final long[] toULongArray(java.util.Collection<kotlin.ULong> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "<this>");
        long[] jArrM1530constructorimpl = kotlin.ULongArray.m1530constructorimpl(collection.size());
        java.util.Iterator<kotlin.ULong> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            kotlin.ULongArray.m1541setk8EXiF4(jArrM1530constructorimpl, i, it.next().getData());
            i++;
        }
        return jArrM1530constructorimpl;
    }

    public static final short[] toUShortArray(java.util.Collection<kotlin.UShort> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "<this>");
        short[] sArrM1635constructorimpl = kotlin.UShortArray.m1635constructorimpl(collection.size());
        java.util.Iterator<kotlin.UShort> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            kotlin.UShortArray.m1646set01HTLdE(sArrM1635constructorimpl, i, it.next().getData());
            i++;
        }
        return sArrM1635constructorimpl;
    }

    public static final int sumOfUInt(java.lang.Iterable<kotlin.UInt> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "<this>");
        java.util.Iterator<kotlin.UInt> it = iterable.iterator();
        int iM1397constructorimpl = 0;
        while (it.hasNext()) {
            iM1397constructorimpl = kotlin.UInt.m1397constructorimpl(iM1397constructorimpl + it.next().getData());
        }
        return iM1397constructorimpl;
    }

    public static final long sumOfULong(java.lang.Iterable<kotlin.ULong> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "<this>");
        java.util.Iterator<kotlin.ULong> it = iterable.iterator();
        long jM1476constructorimpl = 0;
        while (it.hasNext()) {
            jM1476constructorimpl = kotlin.ULong.m1476constructorimpl(jM1476constructorimpl + it.next().getData());
        }
        return jM1476constructorimpl;
    }

    public static final int sumOfUByte(java.lang.Iterable<kotlin.UByte> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "<this>");
        java.util.Iterator<kotlin.UByte> it = iterable.iterator();
        int iM1397constructorimpl = 0;
        while (it.hasNext()) {
            iM1397constructorimpl = kotlin.UInt.m1397constructorimpl(iM1397constructorimpl + kotlin.UInt.m1397constructorimpl(it.next().getData() & 255));
        }
        return iM1397constructorimpl;
    }

    public static final int sumOfUShort(java.lang.Iterable<kotlin.UShort> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "<this>");
        java.util.Iterator<kotlin.UShort> it = iterable.iterator();
        int iM1397constructorimpl = 0;
        while (it.hasNext()) {
            iM1397constructorimpl = kotlin.UInt.m1397constructorimpl(iM1397constructorimpl + kotlin.UInt.m1397constructorimpl(it.next().getData() & kotlin.UShort.MAX_VALUE));
        }
        return iM1397constructorimpl;
    }
}
