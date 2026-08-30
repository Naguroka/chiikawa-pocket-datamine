package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcf {
    public static final com.google.android.gms.internal.ads.zzcf zza = new com.google.android.gms.internal.ads.zzcf(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzcf(int i, int i2, int i3) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = com.google.android.gms.internal.ads.zzei.zzJ(i3) ? com.google.android.gms.internal.ads.zzei.zzk(i3) * i2 : -1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzcf)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzcf zzcfVar = (com.google.android.gms.internal.ads.zzcf) obj;
        return this.zzb == zzcfVar.zzb && this.zzc == zzcfVar.zzc && this.zzd == zzcfVar.zzd;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc), java.lang.Integer.valueOf(this.zzd)});
    }

    public final java.lang.String toString() {
        return "AudioFormat[sampleRate=" + this.zzb + ", channelCount=" + this.zzc + ", encoding=" + this.zzd + com.ironsource.y8.i.e;
    }
}
