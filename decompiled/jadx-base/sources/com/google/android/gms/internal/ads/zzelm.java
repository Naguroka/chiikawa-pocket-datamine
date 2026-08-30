package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzelm implements com.google.android.gms.internal.ads.zzetq {
    private final boolean zza;

    public zzelm(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        ((com.google.android.gms.internal.ads.zzcuv) obj).zza.putString("adid_p", true != this.zza ? "0" : "1");
    }
}
