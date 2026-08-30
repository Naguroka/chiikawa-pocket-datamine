package com.google.unity.ads;

/* JADX INFO: loaded from: classes5.dex */
public interface AdNetworkExtras {
    android.os.Bundle buildExtras(java.util.HashMap<java.lang.String, java.lang.String> extras);

    java.lang.Class<? extends com.google.android.gms.ads.mediation.MediationExtrasReceiver> getAdapterClass();
}
