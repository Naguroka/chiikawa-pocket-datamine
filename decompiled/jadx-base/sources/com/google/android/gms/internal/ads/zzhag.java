package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhag extends java.lang.RuntimeException {
    public zzhag(com.google.android.gms.internal.ads.zzgzc zzgzcVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final com.google.android.gms.internal.ads.zzgyg zza() {
        return new com.google.android.gms.internal.ads.zzgyg(getMessage());
    }
}
