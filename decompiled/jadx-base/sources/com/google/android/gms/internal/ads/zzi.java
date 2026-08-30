package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzi {
    private int zza;
    private int zzb;
    private int zzc;
    private byte[] zzd;
    private int zze;
    private int zzf;

    public zzi() {
        this.zza = -1;
        this.zzb = -1;
        this.zzc = -1;
        this.zze = -1;
        this.zzf = -1;
    }

    /* synthetic */ zzi(com.google.android.gms.internal.ads.zzk zzkVar, com.google.android.gms.internal.ads.zzj zzjVar) {
        this.zza = zzkVar.zzb;
        this.zzb = zzkVar.zzc;
        this.zzc = zzkVar.zzd;
        this.zzd = zzkVar.zze;
        this.zze = zzkVar.zzf;
        this.zzf = zzkVar.zzg;
    }

    public final com.google.android.gms.internal.ads.zzi zza(int i) {
        this.zzf = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzi zzb(int i) {
        this.zzb = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzi zzc(int i) {
        this.zza = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzi zzd(int i) {
        this.zzc = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzi zze(byte[] bArr) {
        this.zzd = bArr;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzi zzf(int i) {
        this.zze = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzk zzg() {
        return new com.google.android.gms.internal.ads.zzk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, null);
    }
}
