package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdhx implements com.google.android.gms.internal.ads.zzayk {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdia zzb;

    zzdhx(com.google.android.gms.internal.ads.zzdia zzdiaVar, java.lang.String str) {
        this.zza = str;
        this.zzb = zzdiaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzayk
    public final void zzdn(com.google.android.gms.internal.ads.zzayj zzayjVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbR)).booleanValue()) {
            synchronized (this) {
                if (zzayjVar.zzj) {
                    com.google.android.gms.internal.ads.zzdia zzdiaVar = this.zzb;
                    if (zzdiaVar.zzo != null) {
                        zzdiaVar.zzy.put(this.zza, true);
                        com.google.android.gms.internal.ads.zzdia zzdiaVar2 = this.zzb;
                        if (zzdiaVar2.zzo == null) {
                            return;
                        } else {
                            zzdiaVar2.zzB(zzdiaVar2.zzo.zzf(), this.zzb.zzo.zzl(), this.zzb.zzo.zzm(), true);
                        }
                    }
                }
                return;
            }
        }
        if (zzayjVar.zzj) {
            com.google.android.gms.internal.ads.zzdia zzdiaVar3 = this.zzb;
            if (zzdiaVar3.zzo != null) {
                zzdiaVar3.zzy.put(this.zza, true);
                com.google.android.gms.internal.ads.zzdia zzdiaVar4 = this.zzb;
                if (zzdiaVar4.zzo == null) {
                    return;
                }
                zzdiaVar4.zzB(zzdiaVar4.zzo.zzf(), this.zzb.zzo.zzl(), this.zzb.zzo.zzm(), true);
            }
        }
    }
}
