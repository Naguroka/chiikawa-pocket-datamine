package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaln {
    private int zzf;
    private int zzh;
    private float zzn;
    private java.lang.String zza = "";
    private java.lang.String zzb = "";
    private java.util.Set zzc = java.util.Collections.emptySet();
    private java.lang.String zzd = "";
    private java.lang.String zze = null;
    private boolean zzg = false;
    private boolean zzi = false;
    private int zzj = -1;
    private int zzk = -1;
    private int zzl = -1;
    private int zzm = -1;
    private int zzo = -1;
    private boolean zzp = false;

    private static int zzA(int i, java.lang.String str, java.lang.String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    public final float zza() {
        return this.zzn;
    }

    public final int zzb() {
        if (this.zzi) {
            return this.zzh;
        }
        throw new java.lang.IllegalStateException("Background color not defined.");
    }

    public final int zzc() {
        if (this.zzg) {
            return this.zzf;
        }
        throw new java.lang.IllegalStateException("Font color not defined");
    }

    public final int zzd() {
        return this.zzm;
    }

    public final int zze() {
        return this.zzo;
    }

    public final int zzf(java.lang.String str, java.lang.String str2, java.util.Set set, java.lang.String str3) {
        if (this.zza.isEmpty() && this.zzb.isEmpty() && this.zzc.isEmpty() && this.zzd.isEmpty()) {
            return android.text.TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iZzA = zzA(zzA(zzA(0, this.zza, str, 1073741824), this.zzb, str2, 2), this.zzd, str3, 4);
        if (iZzA == -1 || !set.containsAll(this.zzc)) {
            return 0;
        }
        return iZzA + (this.zzc.size() * 4);
    }

    public final int zzg() {
        int i = this.zzk;
        if (i == -1 && this.zzl == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.zzl == 1 ? 2 : 0);
    }

    public final com.google.android.gms.internal.ads.zzaln zzh(int i) {
        this.zzh = i;
        this.zzi = true;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzaln zzi(boolean z) {
        this.zzk = 1;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzaln zzj(boolean z) {
        this.zzp = z;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzaln zzk(int i) {
        this.zzf = i;
        this.zzg = true;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzaln zzl(java.lang.String str) {
        this.zze = com.google.android.gms.internal.ads.zzftt.zza(str);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzaln zzm(float f) {
        this.zzn = f;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzaln zzn(int i) {
        this.zzm = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzaln zzo(boolean z) {
        this.zzl = 1;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzaln zzp(int i) {
        this.zzo = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzaln zzq(boolean z) {
        this.zzj = 1;
        return this;
    }

    public final java.lang.String zzr() {
        return this.zze;
    }

    public final void zzs(java.lang.String[] strArr) {
        this.zzc = new java.util.HashSet(java.util.Arrays.asList(strArr));
    }

    public final void zzt(java.lang.String str) {
        this.zza = str;
    }

    public final void zzu(java.lang.String str) {
        this.zzb = str;
    }

    public final void zzv(java.lang.String str) {
        this.zzd = str;
    }

    public final boolean zzw() {
        return this.zzp;
    }

    public final boolean zzx() {
        return this.zzi;
    }

    public final boolean zzy() {
        return this.zzg;
    }

    public final boolean zzz() {
        return this.zzj == 1;
    }
}
