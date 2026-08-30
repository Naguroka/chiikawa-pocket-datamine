package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcrb implements com.google.android.gms.internal.ads.zzcrc {
    private final java.util.Map zza;

    zzcrb(java.util.Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcrc
    public final com.google.android.gms.internal.ads.zzecw zza(int i, java.lang.String str) {
        return (com.google.android.gms.internal.ads.zzecw) this.zza.get(str);
    }
}
