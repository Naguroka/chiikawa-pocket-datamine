package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzade implements com.google.android.gms.internal.ads.zzadm {
    private final com.google.android.gms.internal.ads.zzdp zza;
    private final com.google.android.gms.internal.ads.zzdp zzb;
    private long zzc;

    public zzade(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        com.google.android.gms.internal.ads.zzcw.zzd(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.zza = new com.google.android.gms.internal.ads.zzdp(length2);
            this.zzb = new com.google.android.gms.internal.ads.zzdp(length2);
        } else {
            int i = length2 + 1;
            com.google.android.gms.internal.ads.zzdp zzdpVar = new com.google.android.gms.internal.ads.zzdp(i);
            this.zza = zzdpVar;
            com.google.android.gms.internal.ads.zzdp zzdpVar2 = new com.google.android.gms.internal.ads.zzdp(i);
            this.zzb = zzdpVar2;
            zzdpVar.zzc(0L);
            zzdpVar2.zzc(0L);
        }
        this.zza.zzd(jArr);
        this.zzb.zzd(jArr2);
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final com.google.android.gms.internal.ads.zzadk zzg(long j) {
        com.google.android.gms.internal.ads.zzdp zzdpVar = this.zzb;
        if (zzdpVar.zza() == 0) {
            com.google.android.gms.internal.ads.zzadn zzadnVar = com.google.android.gms.internal.ads.zzadn.zza;
            return new com.google.android.gms.internal.ads.zzadk(zzadnVar, zzadnVar);
        }
        int iZzb = com.google.android.gms.internal.ads.zzei.zzb(zzdpVar, j, true, true);
        com.google.android.gms.internal.ads.zzadn zzadnVar2 = new com.google.android.gms.internal.ads.zzadn(this.zzb.zzb(iZzb), this.zza.zzb(iZzb));
        if (zzadnVar2.zzb != j) {
            com.google.android.gms.internal.ads.zzdp zzdpVar2 = this.zzb;
            if (iZzb != zzdpVar2.zza() - 1) {
                int i = iZzb + 1;
                return new com.google.android.gms.internal.ads.zzadk(zzadnVar2, new com.google.android.gms.internal.ads.zzadn(zzdpVar2.zzb(i), this.zza.zzb(i)));
            }
        }
        return new com.google.android.gms.internal.ads.zzadk(zzadnVar2, zzadnVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return this.zzb.zza() > 0;
    }
}
