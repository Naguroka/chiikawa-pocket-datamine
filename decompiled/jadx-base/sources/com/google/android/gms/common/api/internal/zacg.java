package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zacg {
    public final com.google.android.gms.common.api.internal.RegisterListenerMethod zaa;
    public final com.google.android.gms.common.api.internal.UnregisterListenerMethod zab;
    public final java.lang.Runnable zac;

    public zacg(com.google.android.gms.common.api.internal.RegisterListenerMethod registerListenerMethod, com.google.android.gms.common.api.internal.UnregisterListenerMethod unregisterListenerMethod, java.lang.Runnable runnable) {
        this.zaa = registerListenerMethod;
        this.zab = unregisterListenerMethod;
        this.zac = runnable;
    }
}
