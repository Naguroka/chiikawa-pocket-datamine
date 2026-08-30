package com.unity3d.services.core.di;

/* JADX INFO: compiled from: ServicesRegistry.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J.\u0010\u000b\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u00012\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\b\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\f0\u0010H\u0086\bø\u0001\u0000J \u0010\u0011\u001a\u0002H\f\"\u0006\b\u0000\u0010\f\u0018\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0086\b¢\u0006\u0002\u0010\u0012J\"\u0010\u0013\u001a\u0004\u0018\u0001H\f\"\u0006\b\u0000\u0010\f\u0018\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0086\b¢\u0006\u0002\u0010\u0012J'\u0010\u0014\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0016¢\u0006\u0002\u0010\u0016J\u001b\u0010\u0017\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0018\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u0019J\u001d\u0010\u001a\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0018\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u0019J.\u0010\u001b\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u00012\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\b\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\f0\u0010H\u0086\bø\u0001\u0000J$\u0010\u001c\u001a\u00020\u001d\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0018\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\f0\u0006H\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001e"}, d2 = {"Lcom/unity3d/services/core/di/ServicesRegistry;", "Lcom/unity3d/services/core/di/IServicesRegistry;", "()V", "_services", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/unity3d/services/core/di/ServiceKey;", "Lkotlin/Lazy;", "services", "", "getServices", "()Ljava/util/Map;", "factory", "T", "named", "", com.json.j5.p, "Lkotlin/Function0;", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "getOrNull", "getService", "Lkotlin/reflect/KClass;", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "resolveService", com.ironsource.y8.h.W, "(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;", "resolveServiceOrNull", "single", "updateService", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ServicesRegistry implements com.unity3d.services.core.di.IServicesRegistry {
    private final java.util.concurrent.ConcurrentHashMap<com.unity3d.services.core.di.ServiceKey, kotlin.Lazy<?>> _services = new java.util.concurrent.ConcurrentHashMap<>();

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public java.util.Map<com.unity3d.services.core.di.ServiceKey, kotlin.Lazy<?>> getServices() {
        return this._services;
    }

    public static /* synthetic */ com.unity3d.services.core.di.ServiceKey single$default(com.unity3d.services.core.di.ServicesRegistry servicesRegistry, java.lang.String named, kotlin.jvm.functions.Function0 instance, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        com.unity3d.services.core.di.ServiceKey serviceKey = new com.unity3d.services.core.di.ServiceKey(named, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        servicesRegistry.updateService(serviceKey, kotlin.LazyKt.lazy(instance));
        return serviceKey;
    }

    public final /* synthetic */ <T> com.unity3d.services.core.di.ServiceKey single(java.lang.String named, kotlin.jvm.functions.Function0<? extends T> instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        com.unity3d.services.core.di.ServiceKey serviceKey = new com.unity3d.services.core.di.ServiceKey(named, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        updateService(serviceKey, kotlin.LazyKt.lazy(instance));
        return serviceKey;
    }

    public static /* synthetic */ com.unity3d.services.core.di.ServiceKey factory$default(com.unity3d.services.core.di.ServicesRegistry servicesRegistry, java.lang.String named, kotlin.jvm.functions.Function0 instance, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        com.unity3d.services.core.di.ServiceKey serviceKey = new com.unity3d.services.core.di.ServiceKey(named, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        servicesRegistry.updateService(serviceKey, com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(instance));
        return serviceKey;
    }

    public final /* synthetic */ <T> com.unity3d.services.core.di.ServiceKey factory(java.lang.String named, kotlin.jvm.functions.Function0<? extends T> instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        com.unity3d.services.core.di.ServiceKey serviceKey = new com.unity3d.services.core.di.ServiceKey(named, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        updateService(serviceKey, com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(instance));
        return serviceKey;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> void updateService(com.unity3d.services.core.di.ServiceKey key, kotlin.Lazy<? extends T> instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        if (!(!getServices().containsKey(key))) {
            throw new java.lang.IllegalStateException(("Cannot have multiple identical services: " + key).toString());
        }
        this._services.put(key, instance);
    }

    public static /* synthetic */ java.lang.Object get$default(com.unity3d.services.core.di.ServicesRegistry servicesRegistry, java.lang.String named, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return servicesRegistry.resolveService(new com.unity3d.services.core.di.ServiceKey(named, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class)));
    }

    public final /* synthetic */ <T> T get(java.lang.String named) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) resolveService(new com.unity3d.services.core.di.ServiceKey(named, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class)));
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T getService(java.lang.String named, kotlin.reflect.KClass<?> instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        return (T) resolveService(new com.unity3d.services.core.di.ServiceKey(named, instance));
    }

    public static /* synthetic */ java.lang.Object getOrNull$default(com.unity3d.services.core.di.ServicesRegistry servicesRegistry, java.lang.String named, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return servicesRegistry.resolveServiceOrNull(new com.unity3d.services.core.di.ServiceKey(named, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class)));
    }

    public final /* synthetic */ <T> T getOrNull(java.lang.String named) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(named, "named");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) resolveServiceOrNull(new com.unity3d.services.core.di.ServiceKey(named, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class)));
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T resolveService(com.unity3d.services.core.di.ServiceKey key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.Lazy<?> lazy = getServices().get(key);
        if (lazy == null) {
            throw new java.lang.IllegalStateException("No service instance found for " + key);
        }
        return (T) lazy.getValue();
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T resolveServiceOrNull(com.unity3d.services.core.di.ServiceKey key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.Lazy<?> lazy = getServices().get(key);
        if (lazy == null) {
            return null;
        }
        return (T) lazy.getValue();
    }
}
