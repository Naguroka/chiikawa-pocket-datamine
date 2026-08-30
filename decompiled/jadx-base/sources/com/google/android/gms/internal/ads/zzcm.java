package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcm {
    private java.lang.CharSequence zza;
    private android.graphics.Bitmap zzb;
    private android.text.Layout.Alignment zzc;
    private android.text.Layout.Alignment zzd;
    private float zze;
    private int zzf;
    private int zzg;
    private float zzh;
    private int zzi;
    private int zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private int zzn;
    private float zzo;

    public zzcm() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = -3.4028235E38f;
        this.zzf = Integer.MIN_VALUE;
        this.zzg = Integer.MIN_VALUE;
        this.zzh = -3.4028235E38f;
        this.zzi = Integer.MIN_VALUE;
        this.zzj = Integer.MIN_VALUE;
        this.zzk = -3.4028235E38f;
        this.zzl = -3.4028235E38f;
        this.zzm = -3.4028235E38f;
        this.zzn = Integer.MIN_VALUE;
    }

    /* synthetic */ zzcm(com.google.android.gms.internal.ads.zzco zzcoVar, com.google.android.gms.internal.ads.zzcn zzcnVar) {
        this.zza = zzcoVar.zza;
        this.zzb = zzcoVar.zzd;
        this.zzc = zzcoVar.zzb;
        this.zzd = zzcoVar.zzc;
        this.zze = zzcoVar.zze;
        this.zzf = zzcoVar.zzf;
        this.zzg = zzcoVar.zzg;
        this.zzh = zzcoVar.zzh;
        this.zzi = zzcoVar.zzi;
        this.zzj = zzcoVar.zzl;
        this.zzk = zzcoVar.zzm;
        this.zzl = zzcoVar.zzj;
        this.zzm = zzcoVar.zzk;
        this.zzn = zzcoVar.zzn;
        this.zzo = zzcoVar.zzo;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final int zza() {
        return this.zzg;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final int zzb() {
        return this.zzi;
    }

    public final com.google.android.gms.internal.ads.zzcm zzc(android.graphics.Bitmap bitmap) {
        this.zzb = bitmap;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcm zzd(float f) {
        this.zzm = f;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcm zze(float f, int i) {
        this.zze = f;
        this.zzf = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcm zzf(int i) {
        this.zzg = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcm zzg(android.text.Layout.Alignment alignment) {
        this.zzd = alignment;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcm zzh(float f) {
        this.zzh = f;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcm zzi(int i) {
        this.zzi = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcm zzj(float f) {
        this.zzo = f;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcm zzk(float f) {
        this.zzl = f;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcm zzl(java.lang.CharSequence charSequence) {
        this.zza = charSequence;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcm zzm(android.text.Layout.Alignment alignment) {
        this.zzc = alignment;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcm zzn(float f, int i) {
        this.zzk = f;
        this.zzj = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcm zzo(int i) {
        this.zzn = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzco zzp() {
        return new com.google.android.gms.internal.ads.zzco(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, false, androidx.core.view.ViewCompat.MEASURED_STATE_MASK, this.zzn, this.zzo, null);
    }

    @org.checkerframework.dataflow.qual.Pure
    public final java.lang.CharSequence zzq() {
        return this.zza;
    }
}
