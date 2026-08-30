package androidx.core.util;

/* JADX INFO: compiled from: SparseArray.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010(\n\u0000\u001a!\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0086\n\u001a!\u0010\t\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0086\b\u001a&\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u000b\u001a\u0002H\u0002H\u0086\b¢\u0006\u0002\u0010\f\u001aT\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000326\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\b\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0086\bø\u0001\u0000\u001a.\u0010\u0013\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002H\u0002H\u0086\b¢\u0006\u0002\u0010\u0015\u001a7\u0010\u0016\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0017H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a\u0019\u0010\u0019\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\b\u001a\u0019\u0010\u001a\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\b\u001a\u0016\u0010\u001b\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a-\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\u0002\u001a$\u0010\u001f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a+\u0010 \u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u0002H\u0002¢\u0006\u0002\u0010!\u001a.\u0010\"\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u0002H\u0002H\u0086\n¢\u0006\u0002\u0010#\u001a\u001c\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00020%\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\"\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006&"}, d2 = {"size", "", "T", "Landroid/util/SparseArray;", "getSize", "(Landroid/util/SparseArray;)I", "contains", "", com.ironsource.y8.h.W, "containsKey", "containsValue", "value", "(Landroid/util/SparseArray;Ljava/lang/Object;)Z", "forEach", "", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "getOrDefault", "defaultValue", "(Landroid/util/SparseArray;ILjava/lang/Object;)Ljava/lang/Object;", "getOrElse", "Lkotlin/Function0;", "(Landroid/util/SparseArray;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isEmpty", "isNotEmpty", "keyIterator", "Lkotlin/collections/IntIterator;", "plus", "other", "putAll", "remove", "(Landroid/util/SparseArray;ILjava/lang/Object;)Z", "set", "(Landroid/util/SparseArray;ILjava/lang/Object;)V", "valueIterator", "", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class SparseArrayKt {
    public static final <T> int getSize(android.util.SparseArray<T> sparseArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        return sparseArray.size();
    }

    public static final <T> boolean contains(android.util.SparseArray<T> sparseArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static final <T> void set(android.util.SparseArray<T> sparseArray, int i, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        sparseArray.put(i, t);
    }

    public static final <T> android.util.SparseArray<T> plus(android.util.SparseArray<T> sparseArray, android.util.SparseArray<T> other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        android.util.SparseArray<T> sparseArray2 = new android.util.SparseArray<>(sparseArray.size() + other.size());
        putAll(sparseArray2, sparseArray);
        putAll(sparseArray2, other);
        return sparseArray2;
    }

    public static final <T> boolean containsKey(android.util.SparseArray<T> sparseArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static final <T> boolean containsValue(android.util.SparseArray<T> sparseArray, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        return sparseArray.indexOfValue(t) >= 0;
    }

    public static final <T> T getOrDefault(android.util.SparseArray<T> sparseArray, int i, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        T t2 = sparseArray.get(i);
        return t2 == null ? t : t2;
    }

    public static final <T> T getOrElse(android.util.SparseArray<T> sparseArray, int i, kotlin.jvm.functions.Function0<? extends T> defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t = sparseArray.get(i);
        return t == null ? defaultValue.invoke() : t;
    }

    public static final <T> boolean isEmpty(android.util.SparseArray<T> sparseArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        return sparseArray.size() == 0;
    }

    public static final <T> boolean isNotEmpty(android.util.SparseArray<T> sparseArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        return sparseArray.size() != 0;
    }

    public static final <T> boolean remove(android.util.SparseArray<T> sparseArray, int i, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        int iIndexOfKey = sparseArray.indexOfKey(i);
        if (iIndexOfKey < 0 || !kotlin.jvm.internal.Intrinsics.areEqual(t, sparseArray.valueAt(iIndexOfKey))) {
            return false;
        }
        sparseArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final <T> void forEach(android.util.SparseArray<T> sparseArray, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            action.invoke(java.lang.Integer.valueOf(sparseArray.keyAt(i)), sparseArray.valueAt(i));
        }
    }

    public static final <T> kotlin.collections.IntIterator keyIterator(final android.util.SparseArray<T> sparseArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        return new kotlin.collections.IntIterator() { // from class: androidx.core.util.SparseArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            public final void setIndex(int i) {
                this.index = i;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseArray.size();
            }

            @Override // kotlin.collections.IntIterator
            public int nextInt() {
                android.util.SparseArray<T> sparseArray2 = sparseArray;
                int i = this.index;
                this.index = i + 1;
                return sparseArray2.keyAt(i);
            }
        };
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.core.util.SparseArrayKt$valueIterator$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SparseArray.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\u0016\u0010\n\u001a\n \u000b*\u0004\u0018\u00018\u00008\u0000H\u0096\u0002¢\u0006\u0002\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"androidx/core/util/SparseArrayKt$valueIterator$1", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "kotlin.jvm.PlatformType", "()Ljava/lang/Object;", "core-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class C02791<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {
        final /* synthetic */ android.util.SparseArray<T> $this_valueIterator;
        private int index;

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C02791(android.util.SparseArray<T> sparseArray) {
            this.$this_valueIterator = sparseArray;
        }

        public final int getIndex() {
            return this.index;
        }

        public final void setIndex(int i) {
            this.index = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_valueIterator.size();
        }

        @Override // java.util.Iterator
        public T next() {
            android.util.SparseArray<T> sparseArray = this.$this_valueIterator;
            int i = this.index;
            this.index = i + 1;
            return sparseArray.valueAt(i);
        }
    }

    public static final <T> java.util.Iterator<T> valueIterator(android.util.SparseArray<T> sparseArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        return new androidx.core.util.SparseArrayKt.C02791(sparseArray);
    }

    public static final <T> void putAll(android.util.SparseArray<T> sparseArray, android.util.SparseArray<T> other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        int size = other.size();
        for (int i = 0; i < size; i++) {
            sparseArray.put(other.keyAt(i), other.valueAt(i));
        }
    }
}
