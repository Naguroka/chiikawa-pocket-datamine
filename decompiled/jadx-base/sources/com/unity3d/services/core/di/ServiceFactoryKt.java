package com.unity3d.services.core.di;

/* JADX INFO: compiled from: ServiceFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004¨\u0006\u0005"}, d2 = {"factoryOf", "Lkotlin/Lazy;", "T", "initializer", "Lkotlin/Function0;", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ServiceFactoryKt {
    public static final <T> kotlin.Lazy<T> factoryOf(kotlin.jvm.functions.Function0<? extends T> initializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new com.unity3d.services.core.di.Factory(initializer);
    }
}
