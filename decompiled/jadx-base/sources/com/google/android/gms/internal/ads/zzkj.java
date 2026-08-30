package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzkj {
    public final long zza;
    public final float zzb;
    public final long zzc;

    /* synthetic */ zzkj(com.google.android.gms.internal.ads.zzkh zzkhVar, com.google.android.gms.internal.ads.zzki zzkiVar) {
        this.zza = zzkhVar.zza;
        this.zzb = zzkhVar.zzb;
        this.zzc = zzkhVar.zzc;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzkj)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzkj zzkjVar = (com.google.android.gms.internal.ads.zzkj) obj;
        return this.zza == zzkjVar.zza && this.zzb == zzkjVar.zzb && this.zzc == zzkjVar.zzc;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Long.valueOf(this.zza), java.lang.Float.valueOf(this.zzb), java.lang.Long.valueOf(this.zzc)});
    }

    public final com.google.android.gms.internal.ads.zzkh zza() {
        return new com.google.android.gms.internal.ads.zzkh(this, null);
    }
}
