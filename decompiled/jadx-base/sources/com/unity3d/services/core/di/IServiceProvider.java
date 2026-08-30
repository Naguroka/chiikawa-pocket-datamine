package com.unity3d.services.core.di;

/* JADX INFO: compiled from: IServiceProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/unity3d/services/core/di/IServiceProvider;", "", "getRegistry", "Lcom/unity3d/services/core/di/IServicesRegistry;", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface IServiceProvider {
    com.unity3d.services.core.di.IServicesRegistry getRegistry();

    com.unity3d.services.core.di.IServicesRegistry initialize();
}
