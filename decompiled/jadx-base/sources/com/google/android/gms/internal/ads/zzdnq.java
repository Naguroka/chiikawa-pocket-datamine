package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdnq {
    private final com.google.android.gms.internal.ads.zzcvr zza;
    private final com.google.android.gms.internal.ads.zzcxa zzb;
    private final com.google.android.gms.internal.ads.zzcxn zzc;
    private final com.google.android.gms.internal.ads.zzcxz zzd;
    private final com.google.android.gms.internal.ads.zzdap zze;
    private final com.google.android.gms.internal.ads.zzddq zzf;
    private final com.google.android.gms.internal.ads.zzdrw zzg;
    private final com.google.android.gms.internal.ads.zzfja zzh;
    private final com.google.android.gms.internal.ads.zzebk zzi;
    private final com.google.android.gms.internal.ads.zzcmk zzj;

    zzdnq(com.google.android.gms.internal.ads.zzcvr zzcvrVar, com.google.android.gms.internal.ads.zzcxa zzcxaVar, com.google.android.gms.internal.ads.zzcxn zzcxnVar, com.google.android.gms.internal.ads.zzcxz zzcxzVar, com.google.android.gms.internal.ads.zzdap zzdapVar, com.google.android.gms.internal.ads.zzddq zzddqVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar, com.google.android.gms.internal.ads.zzfja zzfjaVar, com.google.android.gms.internal.ads.zzebk zzebkVar, com.google.android.gms.internal.ads.zzcmk zzcmkVar) {
        this.zza = zzcvrVar;
        this.zzb = zzcxaVar;
        this.zzc = zzcxnVar;
        this.zzd = zzcxzVar;
        this.zze = zzdapVar;
        this.zzf = zzddqVar;
        this.zzg = zzdrwVar;
        this.zzh = zzfjaVar;
        this.zzi = zzebkVar;
        this.zzj = zzcmkVar;
    }

    public final void zza(com.google.android.gms.internal.ads.zzdnr zzdnrVar, com.google.android.gms.internal.ads.zzcex zzcexVar) {
        com.google.android.gms.internal.ads.zzdno zzdnoVar = zzdnrVar.zza;
        final com.google.android.gms.internal.ads.zzcxa zzcxaVar = this.zzb;
        java.util.Objects.requireNonNull(zzcxaVar);
        zzdnoVar.zzi(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzac() { // from class: com.google.android.gms.internal.ads.zzdnp
            @Override // com.google.android.gms.ads.internal.overlay.zzac
            public final void zzg() {
                zzcxaVar.zzb();
            }
        }, this.zzf);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjZ)).booleanValue() || zzcexVar == null || zzcexVar.zzN() == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzcgp zzcgpVarZzN = zzcexVar.zzN();
        zzcgpVarZzN.zzK(this.zzj, this.zzi, this.zzh);
        zzcgpVarZzN.zzM(this.zzj, this.zzi, this.zzg);
    }
}
