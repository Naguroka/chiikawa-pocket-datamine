package com.unity3d.services.core.di;

/* JADX INFO: compiled from: ServicesRegistry.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0000\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"registry", "Lcom/unity3d/services/core/di/ServicesRegistry;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ServicesRegistryKt {
    public static final com.unity3d.services.core.di.ServicesRegistry registry(kotlin.jvm.functions.Function1<? super com.unity3d.services.core.di.ServicesRegistry, kotlin.Unit> registry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(registry, "registry");
        com.unity3d.services.core.di.ServicesRegistry servicesRegistry = new com.unity3d.services.core.di.ServicesRegistry();
        registry.invoke(servicesRegistry);
        return servicesRegistry;
    }
}
