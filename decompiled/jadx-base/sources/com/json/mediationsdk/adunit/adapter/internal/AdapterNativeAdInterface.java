package com.json.mediationsdk.adunit.adapter.internal;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\u00020\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J%\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterNativeAdInterface;", "Listener", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/listener/AdapterAdListener;", "", "destroyAd", "", "adData", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;", "loadAd", "activity", "Landroid/app/Activity;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;Landroid/app/Activity;Lcom/ironsource/mediationsdk/adunit/adapter/internal/listener/AdapterAdListener;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface AdapterNativeAdInterface<Listener extends com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener> {
    void destroyAd(com.json.mediationsdk.adunit.adapter.utility.AdData adData);

    void loadAd(com.json.mediationsdk.adunit.adapter.utility.AdData adData, android.app.Activity activity, Listener listener);
}
