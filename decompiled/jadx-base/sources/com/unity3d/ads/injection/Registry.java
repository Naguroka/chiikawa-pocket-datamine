package com.unity3d.ads.injection;

/* JADX INFO: compiled from: Registry.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0007J.\u0010\u0010\u001a\u00020\u0006\"\u0006\b\u0000\u0010\r\u0018\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u000e\b\b\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0013H\u0086\bø\u0001\u0000J \u0010\u0014\u001a\u0002H\r\"\u0006\b\u0000\u0010\r\u0018\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0086\b¢\u0006\u0002\u0010\u0015J\"\u0010\u0016\u001a\u0004\u0018\u0001H\r\"\u0006\b\u0000\u0010\r\u0018\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0086\b¢\u0006\u0002\u0010\u0015J.\u0010\u0017\u001a\u00020\u0006\"\u0006\b\u0000\u0010\r\u0018\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u000e\b\b\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0013H\u0086\bø\u0001\u0000R$\u0010\u0003\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/injection/Registry;", "", "()V", "_services", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/unity3d/ads/injection/EntryKey;", "Lkotlin/Lazy;", "services", "getServices", "()Ljava/util/Map;", "add", "", "T", com.ironsource.y8.h.W, com.json.j5.p, "factory", "named", "", "Lkotlin/Function0;", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "getOrNull", "single", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Registry {
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<com.unity3d.ads.injection.EntryKey, kotlin.Lazy<?>>> _services = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.MapsKt.emptyMap());

    public final java.util.Map<com.unity3d.ads.injection.EntryKey, kotlin.Lazy<?>> getServices() {
        return this._services.getValue();
    }

    public static /* synthetic */ com.unity3d.ads.injection.EntryKey single$default(com.unity3d.ads.injection.Registry registry, java.lang.String named, kotlin.jvm.functions.Function0 instance, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        com.unity3d.ads.injection.EntryKey entryKey = new com.unity3d.ads.injection.EntryKey(named, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        registry.add(entryKey, kotlin.LazyKt.lazy(instance));
        return entryKey;
    }

    public final /* synthetic */ <T> com.unity3d.ads.injection.EntryKey single(java.lang.String named, kotlin.jvm.functions.Function0<? extends T> instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        com.unity3d.ads.injection.EntryKey entryKey = new com.unity3d.ads.injection.EntryKey(named, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        add(entryKey, kotlin.LazyKt.lazy(instance));
        return entryKey;
    }

    public static /* synthetic */ com.unity3d.ads.injection.EntryKey factory$default(com.unity3d.ads.injection.Registry registry, java.lang.String named, kotlin.jvm.functions.Function0 instance, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        com.unity3d.ads.injection.EntryKey entryKey = new com.unity3d.ads.injection.EntryKey(named, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        registry.add(entryKey, new com.unity3d.ads.injection.Factory(instance));
        return entryKey;
    }

    public final /* synthetic */ <T> com.unity3d.ads.injection.EntryKey factory(java.lang.String named, kotlin.jvm.functions.Function0<? extends T> instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        com.unity3d.ads.injection.EntryKey entryKey = new com.unity3d.ads.injection.EntryKey(named, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        add(entryKey, new com.unity3d.ads.injection.Factory(instance));
        return entryKey;
    }

    public final <T> void add(com.unity3d.ads.injection.EntryKey key, kotlin.Lazy<? extends T> instance) {
        java.util.Map<com.unity3d.ads.injection.EntryKey, kotlin.Lazy<?>> value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        if (!(!getServices().containsKey(key))) {
            throw new java.lang.IllegalStateException("Cannot have identical entries.".toString());
        }
        kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<com.unity3d.ads.injection.EntryKey, kotlin.Lazy<?>>> mutableStateFlow = this._services;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, kotlin.collections.MapsKt.plus(value, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(key, instance)))));
    }

    public static /* synthetic */ java.lang.Object get$default(com.unity3d.ads.injection.Registry registry, java.lang.String named, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        com.unity3d.ads.injection.EntryKey entryKey = new com.unity3d.ads.injection.EntryKey(named, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        kotlin.Lazy<?> lazy = registry.getServices().get(entryKey);
        if (lazy == null) {
            throw new java.lang.IllegalStateException("No entry found for " + entryKey);
        }
        java.lang.Object value = lazy.getValue();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
        return value;
    }

    public final /* synthetic */ <T> T get(java.lang.String named) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        com.unity3d.ads.injection.EntryKey entryKey = new com.unity3d.ads.injection.EntryKey(named, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        kotlin.Lazy<?> lazy = getServices().get(entryKey);
        if (lazy == null) {
            throw new java.lang.IllegalStateException("No entry found for " + entryKey);
        }
        T t = (T) lazy.getValue();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
        return t;
    }

    public static /* synthetic */ java.lang.Object getOrNull$default(com.unity3d.ads.injection.Registry registry, java.lang.String named, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        kotlin.Lazy<?> lazy = registry.getServices().get(new com.unity3d.ads.injection.EntryKey(named, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class)));
        if (lazy == null) {
            return null;
        }
        java.lang.Object value = lazy.getValue();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
        return value;
    }

    public final /* synthetic */ <T> T getOrNull(java.lang.String named) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        kotlin.Lazy<?> lazy = getServices().get(new com.unity3d.ads.injection.EntryKey(named, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class)));
        if (lazy == null) {
            return null;
        }
        T t = (T) lazy.getValue();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
        return t;
    }
}
