package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgd {
    public static final /* synthetic */ int zzh = 0;
    public final android.net.Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final java.util.Map zzd;
    public final long zze;
    public final long zzf;
    public final int zzg;

    static {
        com.google.android.gms.internal.ads.zzas.zzb("media3.datasource");
    }

    private zzgd(android.net.Uri uri, long j, int i, byte[] bArr, java.util.Map map, long j2, long j3, java.lang.String str, int i2, java.lang.Object obj) {
        boolean z = false;
        boolean z2 = j2 >= 0;
        com.google.android.gms.internal.ads.zzcw.zzd(z2);
        com.google.android.gms.internal.ads.zzcw.zzd(z2);
        if (j3 > 0) {
            z = true;
        } else if (j3 == -1) {
            j3 = -1;
            z = true;
        }
        com.google.android.gms.internal.ads.zzcw.zzd(z);
        uri.getClass();
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = java.util.Collections.unmodifiableMap(new java.util.HashMap(map));
        this.zze = j2;
        this.zzf = j3;
        this.zzg = i2;
    }

    @java.lang.Deprecated
    public zzgd(android.net.Uri uri, long j, long j2, java.lang.String str) {
        this(uri, 0L, 1, null, java.util.Collections.emptyMap(), j, j2, null, 0, null);
    }

    public final java.lang.String toString() {
        return "DataSpec[GET " + this.zza.toString() + ", " + this.zze + ", " + this.zzf + ", null, " + this.zzg + com.ironsource.y8.i.e;
    }

    public final com.google.android.gms.internal.ads.zzgb zza() {
        return new com.google.android.gms.internal.ads.zzgb(this, null);
    }

    public final boolean zzb(int i) {
        return (this.zzg & i) == i;
    }
}
