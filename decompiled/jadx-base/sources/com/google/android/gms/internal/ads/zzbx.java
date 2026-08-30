package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbx {
    public final int zza;
    private final com.google.android.gms.internal.ads.zzbr zzb;
    private final boolean zzc;
    private final int[] zzd;
    private final boolean[] zze;

    static {
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
    }

    public zzbx(com.google.android.gms.internal.ads.zzbr zzbrVar, boolean z, int[] iArr, boolean[] zArr) {
        int i = zzbrVar.zza;
        this.zza = i;
        com.google.android.gms.internal.ads.zzcw.zzd(i == iArr.length && i == zArr.length);
        this.zzb = zzbrVar;
        this.zzc = z && i > 1;
        this.zzd = (int[]) iArr.clone();
        this.zze = (boolean[]) zArr.clone();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzbx zzbxVar = (com.google.android.gms.internal.ads.zzbx) obj;
            if (this.zzc == zzbxVar.zzc && this.zzb.equals(zzbxVar.zzb) && java.util.Arrays.equals(this.zzd, zzbxVar.zzd) && java.util.Arrays.equals(this.zze, zzbxVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zzb.hashCode() * 31) + (this.zzc ? 1 : 0)) * 31) + java.util.Arrays.hashCode(this.zzd)) * 31) + java.util.Arrays.hashCode(this.zze);
    }

    public final int zza() {
        return this.zzb.zzc;
    }

    public final com.google.android.gms.internal.ads.zzab zzb(int i) {
        return this.zzb.zzb(i);
    }

    public final boolean zzc() {
        for (boolean z : this.zze) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int i) {
        return this.zze[i];
    }
}
