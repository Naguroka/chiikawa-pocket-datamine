package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzhdz extends com.google.android.gms.internal.ads.zzhec implements com.google.android.gms.internal.ads.zzaqz {
    protected final java.lang.String zza = "moov";

    public zzhdz(java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqz
    public final java.lang.String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaqz
    public final void zzb(com.google.android.gms.internal.ads.zzhed zzhedVar, java.nio.ByteBuffer byteBuffer, long j, com.google.android.gms.internal.ads.zzaqw zzaqwVar) throws java.io.IOException {
        zzhedVar.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzc = zzhedVar;
        this.zze = zzhedVar.zzb();
        zzhedVar.zze(zzhedVar.zzb() + j);
        this.zzf = zzhedVar.zzb();
        this.zzb = zzaqwVar;
    }
}
