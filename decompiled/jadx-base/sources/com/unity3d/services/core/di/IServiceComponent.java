package com.unity3d.services.core.di;

/* JADX INFO: compiled from: IServiceComponent.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"Lcom/unity3d/services/core/di/IServiceComponent;", "", "getServiceProvider", "Lcom/unity3d/services/core/di/IServiceProvider;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface IServiceComponent {
    com.unity3d.services.core.di.IServiceProvider getServiceProvider();

    /* JADX INFO: compiled from: IServiceComponent.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static com.unity3d.services.core.di.IServiceProvider getServiceProvider(com.unity3d.services.core.di.IServiceComponent iServiceComponent) {
            return com.unity3d.services.core.di.ServiceProvider.INSTANCE;
        }
    }
}
