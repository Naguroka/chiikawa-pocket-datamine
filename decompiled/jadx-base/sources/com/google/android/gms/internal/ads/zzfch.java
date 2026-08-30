package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfch {
    private com.google.android.gms.ads.internal.client.zzm zza;
    private com.google.android.gms.ads.internal.client.zzs zzb;
    private java.lang.String zzc;
    private com.google.android.gms.ads.internal.client.zzga zzd;
    private boolean zze;
    private java.util.ArrayList zzf;
    private java.util.ArrayList zzg;
    private com.google.android.gms.internal.ads.zzbfl zzh;
    private com.google.android.gms.ads.internal.client.zzy zzi;
    private com.google.android.gms.ads.formats.AdManagerAdViewOptions zzj;
    private com.google.android.gms.ads.formats.PublisherAdViewOptions zzk;
    private com.google.android.gms.ads.internal.client.zzcm zzl;
    private com.google.android.gms.internal.ads.zzblz zzn;
    private com.google.android.gms.internal.ads.zzekn zzr;
    private android.os.Bundle zzt;
    private com.google.android.gms.ads.internal.client.zzcq zzu;
    private int zzm = 1;
    private final com.google.android.gms.internal.ads.zzfbu zzo = new com.google.android.gms.internal.ads.zzfbu();
    private boolean zzp = false;
    private boolean zzq = false;
    private boolean zzs = false;

    public final com.google.android.gms.internal.ads.zzfch zzA(android.os.Bundle bundle) {
        this.zzt = bundle;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfch zzB(boolean z) {
        this.zze = z;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfch zzC(int i) {
        this.zzm = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfch zzD(com.google.android.gms.internal.ads.zzbfl zzbflVar) {
        this.zzh = zzbflVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfch zzE(java.util.ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfch zzF(java.util.ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfch zzG(com.google.android.gms.ads.formats.PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zzc();
            this.zzl = publisherAdViewOptions.zza();
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfch zzH(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zza = zzmVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfch zzI(com.google.android.gms.ads.internal.client.zzga zzgaVar) {
        this.zzd = zzgaVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfcj zzJ() {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new com.google.android.gms.internal.ads.zzfcj(this, null);
    }

    public final java.lang.String zzL() {
        return this.zzc;
    }

    public final boolean zzS() {
        return this.zzp;
    }

    public final boolean zzT() {
        return this.zzq;
    }

    public final com.google.android.gms.internal.ads.zzfch zzV(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
        this.zzu = zzcqVar;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzm zzf() {
        return this.zza;
    }

    public final com.google.android.gms.ads.internal.client.zzs zzh() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzfbu zzp() {
        return this.zzo;
    }

    public final com.google.android.gms.internal.ads.zzfch zzq(com.google.android.gms.internal.ads.zzfcj zzfcjVar) {
        this.zzo.zza(zzfcjVar.zzo.zza);
        this.zza = zzfcjVar.zzd;
        this.zzb = zzfcjVar.zze;
        this.zzu = zzfcjVar.zzt;
        this.zzc = zzfcjVar.zzf;
        this.zzd = zzfcjVar.zza;
        this.zzf = zzfcjVar.zzg;
        this.zzg = zzfcjVar.zzh;
        this.zzh = zzfcjVar.zzi;
        this.zzi = zzfcjVar.zzj;
        zzr(zzfcjVar.zzl);
        zzG(zzfcjVar.zzm);
        this.zzp = zzfcjVar.zzp;
        this.zzq = zzfcjVar.zzq;
        this.zzr = zzfcjVar.zzc;
        this.zzs = zzfcjVar.zzr;
        this.zzt = zzfcjVar.zzs;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfch zzr(com.google.android.gms.ads.formats.AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfch zzs(com.google.android.gms.ads.internal.client.zzs zzsVar) {
        this.zzb = zzsVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfch zzt(java.lang.String str) {
        this.zzc = str;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfch zzu(com.google.android.gms.ads.internal.client.zzy zzyVar) {
        this.zzi = zzyVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfch zzv(com.google.android.gms.internal.ads.zzekn zzeknVar) {
        this.zzr = zzeknVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfch zzw(com.google.android.gms.internal.ads.zzblz zzblzVar) {
        this.zzn = zzblzVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzga(false, true, false);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfch zzx(boolean z) {
        this.zzp = z;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfch zzy(boolean z) {
        this.zzq = z;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfch zzz(boolean z) {
        this.zzs = true;
        return this;
    }
}
