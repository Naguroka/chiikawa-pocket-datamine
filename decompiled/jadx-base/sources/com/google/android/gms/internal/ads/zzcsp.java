package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcsp implements com.google.android.gms.internal.ads.zzcxh, com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzcyq, com.google.android.gms.internal.ads.zzcwn, com.google.android.gms.internal.ads.zzcvt, com.google.android.gms.internal.ads.zzdbc {
    private final com.google.android.gms.common.util.Clock zza;
    private final com.google.android.gms.internal.ads.zzbzf zzb;

    public zzcsp(com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzbzf zzbzfVar) {
        this.zza = clock;
        this.zzb = zzbzfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zza() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(com.google.android.gms.internal.ads.zzbvk zzbvkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(com.google.android.gms.internal.ads.zzfca zzfcaVar) {
        this.zzb.zzk(this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzdq(com.google.android.gms.internal.ads.zzbvw zzbvwVar, java.lang.String str, java.lang.String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzf() {
    }

    public final java.lang.String zzg() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzi(com.google.android.gms.internal.ads.zzbbq.zzb zzbVar) {
        this.zzb.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzj(com.google.android.gms.internal.ads.zzbbq.zzb zzbVar) {
    }

    public final void zzk(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zzj(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzl(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzm(com.google.android.gms.internal.ads.zzbbq.zzb zzbVar) {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzn(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        this.zzb.zzh(true);
    }
}
