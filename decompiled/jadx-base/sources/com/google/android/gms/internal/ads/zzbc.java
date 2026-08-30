package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzbc extends java.io.IOException {
    public final boolean zza;
    public final int zzb;

    protected zzbc(java.lang.String str, java.lang.Throwable th, boolean z, int i) {
        super(str, th);
        this.zza = z;
        this.zzb = i;
    }

    public static com.google.android.gms.internal.ads.zzbc zza(java.lang.String str, java.lang.Throwable th) {
        return new com.google.android.gms.internal.ads.zzbc(str, th, true, 1);
    }

    public static com.google.android.gms.internal.ads.zzbc zzb(java.lang.String str, java.lang.Throwable th) {
        return new com.google.android.gms.internal.ads.zzbc(str, th, true, 0);
    }

    public static com.google.android.gms.internal.ads.zzbc zzc(java.lang.String str) {
        return new com.google.android.gms.internal.ads.zzbc(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return super.getMessage() + " {contentIsMalformed=" + this.zza + ", dataType=" + this.zzb + "}";
    }
}
