package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzlp {
    public static final com.google.android.gms.internal.ads.zzlp zza;
    public static final com.google.android.gms.internal.ads.zzlp zzb;
    public final long zzc;
    public final long zzd;

    static {
        com.google.android.gms.internal.ads.zzlp zzlpVar = new com.google.android.gms.internal.ads.zzlp(0L, 0L);
        zza = zzlpVar;
        new com.google.android.gms.internal.ads.zzlp(Long.MAX_VALUE, Long.MAX_VALUE);
        new com.google.android.gms.internal.ads.zzlp(Long.MAX_VALUE, 0L);
        new com.google.android.gms.internal.ads.zzlp(0L, Long.MAX_VALUE);
        zzb = zzlpVar;
    }

    public zzlp(long j, long j2) {
        com.google.android.gms.internal.ads.zzcw.zzd(j >= 0);
        com.google.android.gms.internal.ads.zzcw.zzd(j2 >= 0);
        this.zzc = j;
        this.zzd = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzlp zzlpVar = (com.google.android.gms.internal.ads.zzlp) obj;
            if (this.zzc == zzlpVar.zzc && this.zzd == zzlpVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzc) * 31) + ((int) this.zzd);
    }
}
