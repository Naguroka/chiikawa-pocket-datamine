package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfrt extends com.google.android.gms.internal.ads.zzfsx {
    private android.os.IBinder zza;
    private java.lang.String zzb;
    private int zzc;
    private float zzd;
    private int zze;
    private java.lang.String zzf;
    private byte zzg;

    zzfrt() {
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    public final com.google.android.gms.internal.ads.zzfsx zza(java.lang.String str) {
        this.zzf = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    public final com.google.android.gms.internal.ads.zzfsx zzb(java.lang.String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    public final com.google.android.gms.internal.ads.zzfsx zzc(int i) {
        this.zzg = (byte) (this.zzg | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    public final com.google.android.gms.internal.ads.zzfsx zzd(int i) {
        this.zzc = i;
        this.zzg = (byte) (this.zzg | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    public final com.google.android.gms.internal.ads.zzfsx zze(float f) {
        this.zzd = f;
        this.zzg = (byte) (this.zzg | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    public final com.google.android.gms.internal.ads.zzfsx zzf(int i) {
        this.zzg = (byte) (this.zzg | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    public final com.google.android.gms.internal.ads.zzfsx zzg(android.os.IBinder iBinder) {
        if (iBinder == null) {
            throw new java.lang.NullPointerException("Null windowToken");
        }
        this.zza = iBinder;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    public final com.google.android.gms.internal.ads.zzfsx zzh(int i) {
        this.zze = i;
        this.zzg = (byte) (this.zzg | 16);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    public final com.google.android.gms.internal.ads.zzfsy zzi() {
        android.os.IBinder iBinder;
        if (this.zzg == 31 && (iBinder = this.zza) != null) {
            return new com.google.android.gms.internal.ads.zzfrv(iBinder, this.zzb, this.zzc, this.zzd, 0, 0, null, this.zze, null, this.zzf, null, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" windowToken");
        }
        if ((this.zzg & 1) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.zzg & 2) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.zzg & 4) == 0) {
            sb.append(" displayMode");
        }
        if ((this.zzg & 8) == 0) {
            sb.append(" triggerMode");
        }
        if ((this.zzg & 16) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
