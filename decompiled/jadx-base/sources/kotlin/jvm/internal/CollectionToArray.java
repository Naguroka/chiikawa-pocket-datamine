package kotlin.jvm.internal;

/* JADX INFO: compiled from: CollectionToArray.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\t\u0010\f\u001a~\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u000f2\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u00112(\u0010\u0012\u001a$\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0013H\u0082\b¢\u0006\u0002\u0010\u0014\"\u0018\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"EMPTY", "", "", "[Ljava/lang/Object;", "MAX_SIZE", "", "collectionToArray", "collection", "", "toArray", "(Ljava/util/Collection;)[Ljava/lang/Object;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "toArrayImpl", "empty", "Lkotlin/Function0;", "alloc", "Lkotlin/Function1;", "trim", "Lkotlin/Function2;", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CollectionToArray {
    private static final java.lang.Object[] EMPTY = new java.lang.Object[0];
    private static final int MAX_SIZE = 2147483645;

    @kotlin.Deprecated(message = "This function will be made internal in a future release")
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.9")
    public static final java.lang.Object[] toArray(java.util.Collection<?> collection, java.lang.Object[] objArr) {
        java.lang.Object[] objArrCopyOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        java.util.Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArrCopyOf = objArr;
        } else {
            java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), size);
            kotlin.jvm.internal.Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf = (java.lang.Object[]) objNewInstance;
        }
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = MAX_SIZE;
                    if (i2 >= MAX_SIZE) {
                        throw new java.lang.OutOfMemoryError();
                    }
                }
                objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, i3);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i2] = null;
                    return objArr;
                }
                java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArrCopyOf, i2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i = i2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    private static final java.lang.Object[] toArrayImpl(java.util.Collection<?> collection, kotlin.jvm.functions.Function0<java.lang.Object[]> function0, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Object[]> function1, kotlin.jvm.functions.Function2<? super java.lang.Object[], ? super java.lang.Integer, java.lang.Object[]> function2) {
        int size = collection.size();
        if (size == 0) {
            return function0.invoke();
        }
        java.util.Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return function0.invoke();
        }
        java.lang.Object[] objArrInvoke = function1.invoke(java.lang.Integer.valueOf(size));
        int i = 0;
        ?? CopyOf = objArrInvoke;
        while (true) {
            int i2 = i + 1;
            CopyOf[i] = it.next();
            if (i2 >= CopyOf.length) {
                if (!it.hasNext()) {
                    return CopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = MAX_SIZE;
                    if (i2 >= MAX_SIZE) {
                        throw new java.lang.OutOfMemoryError();
                    }
                }
                CopyOf = java.util.Arrays.copyOf((java.lang.Object[]) CopyOf, i3);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(CopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                return function2.invoke(CopyOf, java.lang.Integer.valueOf(i2));
            }
            i = i2;
            CopyOf = CopyOf;
        }
    }

    @kotlin.Deprecated(message = "This function will be made internal in a future release")
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.9")
    public static final java.lang.Object[] toArray(java.util.Collection<?> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            java.util.Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                java.lang.Object[] objArrCopyOf = new java.lang.Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = MAX_SIZE;
                            if (i2 >= MAX_SIZE) {
                                throw new java.lang.OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, i3);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArrCopyOf, i2);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i = i2;
                }
            }
        }
        return EMPTY;
    }
}
