package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfrv extends com.google.android.gms.internal.ads.zzfsy {
    private final android.os.IBinder zza;
    private final java.lang.String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;
    private final java.lang.String zzf;

    /* synthetic */ zzfrv(android.os.IBinder iBinder, java.lang.String str, int i, float f, int i2, int i3, java.lang.String str2, int i4, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.google.android.gms.internal.ads.zzfru zzfruVar) {
        this.zza = iBinder;
        this.zzb = str;
        this.zzc = i;
        this.zzd = f;
        this.zze = i4;
        this.zzf = str4;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzfsy) {
            com.google.android.gms.internal.ads.zzfsy zzfsyVar = (com.google.android.gms.internal.ads.zzfsy) obj;
            if (this.zza.equals(zzfsyVar.zzf()) && ((str = this.zzb) != null ? str.equals(zzfsyVar.zzh()) : zzfsyVar.zzh() == null) && this.zzc == zzfsyVar.zzc() && java.lang.Float.floatToIntBits(this.zzd) == java.lang.Float.floatToIntBits(zzfsyVar.zza())) {
                zzfsyVar.zzb();
                zzfsyVar.zzd();
                zzfsyVar.zzj();
                if (this.zze == zzfsyVar.zze()) {
                    zzfsyVar.zzi();
                    java.lang.String str2 = this.zzf;
                    if (str2 != null ? str2.equals(zzfsyVar.zzg()) : zzfsyVar.zzg() == null) {
                        zzfsyVar.zzk();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        java.lang.String str = this.zzb;
        int iHashCode2 = (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc) * 1000003) ^ java.lang.Float.floatToIntBits(this.zzd);
        int i = this.zze;
        java.lang.String str2 = this.zzf;
        return ((((iHashCode2 * 1525764945) ^ i) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final java.lang.String toString() {
        return "OverlayDisplayShowRequest{windowToken=" + this.zza.toString() + ", appId=" + this.zzb + ", layoutGravity=" + this.zzc + ", layoutVerticalMargin=" + this.zzd + ", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=" + this.zze + ", deeplinkUrl=null, adFieldEnifd=" + this.zzf + ", thirdPartyAuthCallerId=null}";
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final float zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final int zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final android.os.IBinder zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final java.lang.String zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final java.lang.String zzh() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final java.lang.String zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final java.lang.String zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final java.lang.String zzk() {
        return null;
    }
}
