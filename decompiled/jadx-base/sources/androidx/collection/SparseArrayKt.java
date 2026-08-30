package androidx.collection;

/* JADX INFO: compiled from: SparseArray.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010(\n\u0000\u001a!\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0086\n\u001aQ\u0010\t\u001a\u00020\n\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000326\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\b\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\n0\fH\u0086\b\u001a.\u0010\u0010\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u0002H\u0002H\u0086\b¢\u0006\u0002\u0010\u0012\u001a4\u0010\u0013\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0014H\u0086\b¢\u0006\u0002\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\b\u001a\u0016\u0010\u0017\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a-\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\u0002\u001a-\u0010\u001b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u0002H\u0002H\u0007¢\u0006\u0002\u0010\u001c\u001a.\u0010\u001d\u001a\u00020\n\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u0002H\u0002H\u0086\n¢\u0006\u0002\u0010\u001e\u001a\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00020 \"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\"\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006!"}, d2 = {"size", "", "T", "Landroidx/collection/SparseArrayCompat;", "getSize", "(Landroidx/collection/SparseArrayCompat;)I", "contains", "", com.ironsource.y8.h.W, "forEach", "", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "getOrDefault", "defaultValue", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Ljava/lang/Object;", "getOrElse", "Lkotlin/Function0;", "(Landroidx/collection/SparseArrayCompat;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNotEmpty", "keyIterator", "Lkotlin/collections/IntIterator;", "plus", "other", "remove", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Z", "set", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)V", "valueIterator", "", "collection-ktx"}, k = 2, mv = {1, 1, 13})
public final class SparseArrayKt {
    public static final <T> int getSize(androidx.collection.SparseArrayCompat<T> receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        return receiver$0.size();
    }

    public static final <T> boolean contains(androidx.collection.SparseArrayCompat<T> receiver$0, int i) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        return receiver$0.containsKey(i);
    }

    public static final <T> void set(androidx.collection.SparseArrayCompat<T> receiver$0, int i, T t) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        receiver$0.put(i, t);
    }

    public static final <T> androidx.collection.SparseArrayCompat<T> plus(androidx.collection.SparseArrayCompat<T> receiver$0, androidx.collection.SparseArrayCompat<T> other) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(other, "other");
        androidx.collection.SparseArrayCompat<T> sparseArrayCompat = new androidx.collection.SparseArrayCompat<>(receiver$0.size() + other.size());
        sparseArrayCompat.putAll(receiver$0);
        sparseArrayCompat.putAll(other);
        return sparseArrayCompat;
    }

    public static final <T> T getOrDefault(androidx.collection.SparseArrayCompat<T> receiver$0, int i, T t) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        return receiver$0.get(i, t);
    }

    public static final <T> T getOrElse(androidx.collection.SparseArrayCompat<T> receiver$0, int i, kotlin.jvm.functions.Function0<? extends T> defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(defaultValue, "defaultValue");
        T t = receiver$0.get(i);
        return t != null ? t : defaultValue.invoke();
    }

    public static final <T> boolean isNotEmpty(androidx.collection.SparseArrayCompat<T> receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        return !receiver$0.isEmpty();
    }

    @kotlin.Deprecated(message = "Replaced with member function. Remove extension import!")
    public static final <T> boolean remove(androidx.collection.SparseArrayCompat<T> receiver$0, int i, T t) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        return receiver$0.remove(i, t);
    }

    public static final <T> void forEach(androidx.collection.SparseArrayCompat<T> receiver$0, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(action, "action");
        int size = receiver$0.size();
        for (int i = 0; i < size; i++) {
            action.invoke(java.lang.Integer.valueOf(receiver$0.keyAt(i)), receiver$0.valueAt(i));
        }
    }

    public static final <T> kotlin.collections.IntIterator keyIterator(final androidx.collection.SparseArrayCompat<T> receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        return new kotlin.collections.IntIterator() { // from class: androidx.collection.SparseArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            public final void setIndex(int i) {
                this.index = i;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < receiver$0.size();
            }

            @Override // kotlin.collections.IntIterator
            public int nextInt() {
                androidx.collection.SparseArrayCompat sparseArrayCompat = receiver$0;
                int i = this.index;
                this.index = i + 1;
                return sparseArrayCompat.keyAt(i);
            }
        };
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.collection.SparseArrayKt$valueIterator$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SparseArray.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\u0016\u0010\n\u001a\n \u000b*\u0004\u0018\u00018\u00008\u0000H\u0096\u0002¢\u0006\u0002\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"androidx/collection/SparseArrayKt$valueIterator$1", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "kotlin.jvm.PlatformType", "()Ljava/lang/Object;", "collection-ktx"}, k = 1, mv = {1, 1, 13})
    public static final class C02741<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {
        final /* synthetic */ androidx.collection.SparseArrayCompat $this_valueIterator;
        private int index;

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C02741(androidx.collection.SparseArrayCompat<T> sparseArrayCompat) {
            this.$this_valueIterator = sparseArrayCompat;
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
            androidx.collection.SparseArrayCompat sparseArrayCompat = this.$this_valueIterator;
            int i = this.index;
            this.index = i + 1;
            return (T) sparseArrayCompat.valueAt(i);
        }
    }

    public static final <T> java.util.Iterator<T> valueIterator(androidx.collection.SparseArrayCompat<T> receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        return new androidx.collection.SparseArrayKt.C02741(receiver$0);
    }
}
