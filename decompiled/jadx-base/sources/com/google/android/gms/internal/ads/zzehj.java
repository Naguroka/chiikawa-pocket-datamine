package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzehj extends com.google.android.gms.internal.ads.zzeik {
    private final com.google.android.gms.internal.ads.zzdeb zza;

    public zzehj(com.google.android.gms.internal.ads.zzcvr zzcvrVar, com.google.android.gms.internal.ads.zzddq zzddqVar, com.google.android.gms.internal.ads.zzcwl zzcwlVar, com.google.android.gms.internal.ads.zzcxa zzcxaVar, com.google.android.gms.internal.ads.zzcxf zzcxfVar, com.google.android.gms.internal.ads.zzcwg zzcwgVar, com.google.android.gms.internal.ads.zzdap zzdapVar, com.google.android.gms.internal.ads.zzden zzdenVar, com.google.android.gms.internal.ads.zzcxz zzcxzVar, com.google.android.gms.internal.ads.zzdeb zzdebVar, com.google.android.gms.internal.ads.zzdal zzdalVar) {
        super(zzcvrVar, zzddqVar, zzcwlVar, zzcxaVar, zzcxfVar, zzdapVar, zzcxzVar, zzdenVar, zzdalVar, zzcwgVar);
        this.zza = zzdebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeik, com.google.android.gms.internal.ads.zzbpk
    public final void zzs(com.google.android.gms.internal.ads.zzbwi zzbwiVar) {
        this.zza.zza(zzbwiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeik, com.google.android.gms.internal.ads.zzbpk
    public final void zzt(com.google.android.gms.internal.ads.zzbwm zzbwmVar) throws android.os.RemoteException {
        this.zza.zza(new com.google.android.gms.internal.ads.zzbwi(zzbwmVar.zzf(), zzbwmVar.zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzeik, com.google.android.gms.internal.ads.zzbpk
    public final void zzu() throws android.os.RemoteException {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzeik, com.google.android.gms.internal.ads.zzbpk
    public final void zzv() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzeik, com.google.android.gms.internal.ads.zzbpk
    public final void zzy() {
        this.zza.zzc();
    }
}
