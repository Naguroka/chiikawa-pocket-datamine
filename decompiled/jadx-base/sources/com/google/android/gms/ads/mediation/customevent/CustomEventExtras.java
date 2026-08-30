package com.google.android.gms.ads.mediation.customevent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public final class CustomEventExtras {
    private final java.util.HashMap zza = new java.util.HashMap();

    public java.lang.Object getExtra(java.lang.String str) {
        return this.zza.get(str);
    }

    public void setExtra(java.lang.String str, java.lang.Object obj) {
        this.zza.put(str, obj);
    }
}
