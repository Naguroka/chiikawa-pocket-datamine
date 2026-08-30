package com.google.android.gms.ads.initialization;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface AdapterStatus {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    public enum State {
        NOT_READY,
        READY
    }

    java.lang.String getDescription();

    com.google.android.gms.ads.initialization.AdapterStatus.State getInitializationState();

    int getLatency();
}
