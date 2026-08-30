package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfcj {
    public final com.google.android.gms.ads.internal.client.zzga zza;
    public final com.google.android.gms.internal.ads.zzblz zzb;
    public final com.google.android.gms.internal.ads.zzekn zzc;
    public final com.google.android.gms.ads.internal.client.zzm zzd;
    public final com.google.android.gms.ads.internal.client.zzs zze;
    public final java.lang.String zzf;
    public final java.util.ArrayList zzg;
    public final java.util.ArrayList zzh;
    public final com.google.android.gms.internal.ads.zzbfl zzi;
    public final com.google.android.gms.ads.internal.client.zzy zzj;
    public final int zzk;
    public final com.google.android.gms.ads.formats.AdManagerAdViewOptions zzl;
    public final com.google.android.gms.ads.formats.PublisherAdViewOptions zzm;
    public final com.google.android.gms.ads.internal.client.zzcm zzn;
    public final com.google.android.gms.internal.ads.zzfbw zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final android.os.Bundle zzs;
    public final com.google.android.gms.ads.internal.client.zzcq zzt;

    /* synthetic */ zzfcj(com.google.android.gms.internal.ads.zzfch zzfchVar, com.google.android.gms.internal.ads.zzfci zzfciVar) {
        this.zze = zzfchVar.zzb;
        this.zzf = zzfchVar.zzc;
        this.zzt = zzfchVar.zzu;
        int i = zzfchVar.zza.zza;
        long j = zzfchVar.zza.zzb;
        android.os.Bundle bundle = zzfchVar.zza.zzc;
        int i2 = zzfchVar.zza.zzd;
        java.util.List list = zzfchVar.zza.zze;
        boolean z = zzfchVar.zza.zzf;
        int i3 = zzfchVar.zza.zzg;
        boolean z2 = true;
        if (!zzfchVar.zza.zzh && !zzfchVar.zze) {
            z2 = false;
        }
        this.zzd = new com.google.android.gms.ads.internal.client.zzm(i, j, bundle, i2, list, z, i3, z2, zzfchVar.zza.zzi, zzfchVar.zza.zzj, zzfchVar.zza.zzk, zzfchVar.zza.zzl, zzfchVar.zza.zzm, zzfchVar.zza.zzn, zzfchVar.zza.zzo, zzfchVar.zza.zzp, zzfchVar.zza.zzq, zzfchVar.zza.zzr, zzfchVar.zza.zzs, zzfchVar.zza.zzt, zzfchVar.zza.zzu, zzfchVar.zza.zzv, com.google.android.gms.ads.internal.util.zzs.zza(zzfchVar.zza.zzw), zzfchVar.zza.zzx, zzfchVar.zza.zzy, zzfchVar.zza.zzz);
        this.zza = zzfchVar.zzd != null ? zzfchVar.zzd : zzfchVar.zzh != null ? zzfchVar.zzh.zzf : null;
        this.zzg = zzfchVar.zzf;
        this.zzh = zzfchVar.zzg;
        this.zzi = zzfchVar.zzf == null ? null : zzfchVar.zzh == null ? new com.google.android.gms.internal.ads.zzbfl(new com.google.android.gms.ads.formats.NativeAdOptions.Builder().build()) : zzfchVar.zzh;
        this.zzj = zzfchVar.zzi;
        this.zzk = zzfchVar.zzm;
        this.zzl = zzfchVar.zzj;
        this.zzm = zzfchVar.zzk;
        this.zzn = zzfchVar.zzl;
        this.zzb = zzfchVar.zzn;
        this.zzo = new com.google.android.gms.internal.ads.zzfbw(zzfchVar.zzo, null);
        this.zzp = zzfchVar.zzp;
        this.zzq = zzfchVar.zzq;
        this.zzc = zzfchVar.zzr;
        this.zzr = zzfchVar.zzs;
        this.zzs = zzfchVar.zzt;
    }

    public final com.google.android.gms.internal.ads.zzbhn zza() {
        com.google.android.gms.ads.formats.PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.zzb() : this.zzl.zza();
    }

    public final boolean zzb() {
        return this.zzf.matches((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdn));
    }
}
