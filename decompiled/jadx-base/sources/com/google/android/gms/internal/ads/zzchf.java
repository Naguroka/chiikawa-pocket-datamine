package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzchf implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzcha zza;

    public zzchf(com.google.android.gms.internal.ads.zzcha zzchaVar) {
        this.zza = zzchaVar;
    }

    public static java.lang.ref.WeakReference zzc(com.google.android.gms.internal.ads.zzcha zzchaVar) {
        java.lang.ref.WeakReference weakReferenceZzg = zzchaVar.zzg();
        com.google.android.gms.internal.ads.zzhez.zzb(weakReferenceZzg);
        return weakReferenceZzg;
    }

    public final java.lang.ref.WeakReference zza() {
        return zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* synthetic */ java.lang.Object zzb() {
        return zzc(this.zza);
    }
}
