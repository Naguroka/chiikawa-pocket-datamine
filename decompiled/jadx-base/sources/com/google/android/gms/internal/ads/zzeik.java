package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzeik extends com.google.android.gms.internal.ads.zzbpj {
    private final com.google.android.gms.internal.ads.zzcvr zza;
    private final com.google.android.gms.internal.ads.zzddq zzb;
    private final com.google.android.gms.internal.ads.zzcwl zzc;
    private final com.google.android.gms.internal.ads.zzcxa zzd;
    private final com.google.android.gms.internal.ads.zzcxf zze;
    private final com.google.android.gms.internal.ads.zzdap zzf;
    private final com.google.android.gms.internal.ads.zzcxz zzg;
    private final com.google.android.gms.internal.ads.zzden zzh;
    private final com.google.android.gms.internal.ads.zzdal zzi;
    private final com.google.android.gms.internal.ads.zzcwg zzj;

    public zzeik(com.google.android.gms.internal.ads.zzcvr zzcvrVar, com.google.android.gms.internal.ads.zzddq zzddqVar, com.google.android.gms.internal.ads.zzcwl zzcwlVar, com.google.android.gms.internal.ads.zzcxa zzcxaVar, com.google.android.gms.internal.ads.zzcxf zzcxfVar, com.google.android.gms.internal.ads.zzdap zzdapVar, com.google.android.gms.internal.ads.zzcxz zzcxzVar, com.google.android.gms.internal.ads.zzden zzdenVar, com.google.android.gms.internal.ads.zzdal zzdalVar, com.google.android.gms.internal.ads.zzcwg zzcwgVar) {
        this.zza = zzcvrVar;
        this.zzb = zzddqVar;
        this.zzc = zzcwlVar;
        this.zzd = zzcxaVar;
        this.zze = zzcxfVar;
        this.zzf = zzdapVar;
        this.zzg = zzcxzVar;
        this.zzh = zzdenVar;
        this.zzi = zzdalVar;
        this.zzj = zzcwgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzdd();
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzf() {
        this.zzg.zzds(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzg(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzi(int i, java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    @java.lang.Deprecated
    public final void zzj(int i) throws android.os.RemoteException {
        zzk(new com.google.android.gms.ads.internal.client.zze(i, "", com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zza(com.google.android.gms.internal.ads.zzfdk.zzc(8, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzl(java.lang.String str) {
        zzk(new com.google.android.gms.ads.internal.client.zze(0, str, com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN, null, null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzn() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzo() {
        this.zze.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzp() {
        this.zzg.zzdp();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzq(java.lang.String str, java.lang.String str2) {
        this.zzf.zzb(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzr(com.google.android.gms.internal.ads.zzbgq zzbgqVar, java.lang.String str) {
    }

    public void zzs(com.google.android.gms.internal.ads.zzbwi zzbwiVar) {
    }

    public void zzt(com.google.android.gms.internal.ads.zzbwm zzbwmVar) throws android.os.RemoteException {
    }

    public void zzu() throws android.os.RemoteException {
    }

    public void zzv() {
        this.zzh.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzw() {
        this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzx() throws android.os.RemoteException {
        this.zzh.zzc();
    }

    public void zzy() {
        this.zzh.zzd();
    }
}
