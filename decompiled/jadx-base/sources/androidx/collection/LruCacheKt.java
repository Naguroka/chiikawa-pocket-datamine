package androidx.collection;

/* JADX INFO: compiled from: LruCache.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u001aø\u0001\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000628\b\u0006\u0010\u0007\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00060\b2%\b\u0006\u0010\r\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u000e2d\b\u0006\u0010\u000f\u001a^\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u0001H\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0010H\u0086\b¨\u0006\u0016"}, d2 = {"lruCache", "Landroidx/collection/LruCache;", "K", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "maxSize", "", "sizeOf", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", com.ironsource.y8.h.W, "value", "create", "Lkotlin/Function1;", "onEntryRemoved", "Lkotlin/Function4;", "", "evicted", "oldValue", "newValue", "", "collection-ktx"}, k = 2, mv = {1, 1, 13})
public final class LruCacheKt {
    public static /* synthetic */ androidx.collection.LruCache lruCache$default(int i, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function4 function4, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            function2 = new kotlin.jvm.functions.Function2<K, V, java.lang.Integer>() { // from class: androidx.collection.LruCacheKt.lruCache.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final int invoke2(K k, V v) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(k, "<anonymous parameter 0>");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(v, "<anonymous parameter 1>");
                    return 1;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return java.lang.Integer.valueOf(invoke2(obj2, obj3));
                }
            };
        }
        kotlin.jvm.functions.Function2 sizeOf = function2;
        if ((i2 & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1<K, V>() { // from class: androidx.collection.LruCacheKt.lruCache.2
                @Override // kotlin.jvm.functions.Function1
                public final V invoke(K it) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                    return null;
                }
            };
        }
        kotlin.jvm.functions.Function1 create = function1;
        if ((i2 & 8) != 0) {
            function4 = new kotlin.jvm.functions.Function4<java.lang.Boolean, K, V, V, kotlin.Unit>() { // from class: androidx.collection.LruCacheKt.lruCache.3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    invoke(bool.booleanValue(), obj2, obj3, obj4);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(boolean z, K k, V v, V v2) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(k, "<anonymous parameter 1>");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(v, "<anonymous parameter 2>");
                }
            };
        }
        kotlin.jvm.functions.Function4 onEntryRemoved = function4;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(sizeOf, "sizeOf");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(create, "create");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onEntryRemoved, "onEntryRemoved");
        return new androidx.collection.LruCacheKt.AnonymousClass4(sizeOf, create, onEntryRemoved, i, i);
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: androidx.collection.LruCacheKt$lruCache$4, reason: invalid class name */
    /* JADX INFO: compiled from: LruCache.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0017\u0010\u0002\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0004J/\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00012\b\u0010\n\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0001H\u0014¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/collection/LruCacheKt$lruCache$4", "Landroidx/collection/LruCache;", "create", com.ironsource.y8.h.W, "(Ljava/lang/Object;)Ljava/lang/Object;", "entryRemoved", "", "evicted", "", "oldValue", "newValue", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "sizeOf", "", "value", "(Ljava/lang/Object;Ljava/lang/Object;)I", "collection-ktx"}, k = 1, mv = {1, 1, 13})
    public static final class AnonymousClass4<K, V> extends androidx.collection.LruCache<K, V> {
        final /* synthetic */ kotlin.jvm.functions.Function1 $create;
        final /* synthetic */ int $maxSize;
        final /* synthetic */ kotlin.jvm.functions.Function4 $onEntryRemoved;
        final /* synthetic */ kotlin.jvm.functions.Function2 $sizeOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function4 function4, int i, int i2) {
            super(i2);
            this.$sizeOf = function2;
            this.$create = function1;
            this.$onEntryRemoved = function4;
            this.$maxSize = i;
        }

        @Override // androidx.collection.LruCache
        protected int sizeOf(K key, V value) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(value, "value");
            return ((java.lang.Number) this.$sizeOf.invoke(key, value)).intValue();
        }

        @Override // androidx.collection.LruCache
        protected V create(K key) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
            return (V) this.$create.invoke(key);
        }

        @Override // androidx.collection.LruCache
        protected void entryRemoved(boolean evicted, K key, V oldValue, V newValue) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(oldValue, "oldValue");
            this.$onEntryRemoved.invoke(java.lang.Boolean.valueOf(evicted), key, oldValue, newValue);
        }
    }

    public static final <K, V> androidx.collection.LruCache<K, V> lruCache(int i, kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Integer> sizeOf, kotlin.jvm.functions.Function1<? super K, ? extends V> create, kotlin.jvm.functions.Function4<? super java.lang.Boolean, ? super K, ? super V, ? super V, kotlin.Unit> onEntryRemoved) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(sizeOf, "sizeOf");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(create, "create");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onEntryRemoved, "onEntryRemoved");
        return new androidx.collection.LruCacheKt.AnonymousClass4(sizeOf, create, onEntryRemoved, i, i);
    }
}
