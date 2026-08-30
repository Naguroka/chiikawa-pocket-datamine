package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcl implements com.android.billingclient.api.zzch {
    private com.google.android.gms.internal.play_billing.zzis zzb;
    private final com.android.billingclient.api.zzcn zzc;

    zzcl(android.content.Context context, com.google.android.gms.internal.play_billing.zzis zzisVar) {
        this.zzc = new com.android.billingclient.api.zzcn(context);
        this.zzb = zzisVar;
    }

    private final void zzl(com.google.android.gms.internal.play_billing.zzhx zzhxVar, com.google.android.gms.internal.play_billing.zzis zzisVar) {
        if (zzhxVar == null) {
            return;
        }
        try {
            com.google.android.gms.internal.play_billing.zzjg zzjgVarZzc = com.google.android.gms.internal.play_billing.zzji.zzc();
            zzjgVarZzc.zzn(zzisVar);
            zzjgVarZzc.zza(zzhxVar);
            this.zzc.zza((com.google.android.gms.internal.play_billing.zzji) zzjgVarZzc.zze());
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    private final void zzm(com.google.android.gms.internal.play_billing.zzib zzibVar, com.google.android.gms.internal.play_billing.zzis zzisVar) {
        if (zzibVar == null) {
            return;
        }
        try {
            com.google.android.gms.internal.play_billing.zzjg zzjgVarZzc = com.google.android.gms.internal.play_billing.zzji.zzc();
            zzjgVarZzc.zzn(zzisVar);
            zzjgVarZzc.zzl(zzibVar);
            this.zzc.zza((com.google.android.gms.internal.play_billing.zzji) zzjgVarZzc.zze());
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzch
    public final void zza(com.google.android.gms.internal.play_billing.zzhx zzhxVar) {
        try {
            zzl(zzhxVar, this.zzb);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzch
    public final void zzb(com.google.android.gms.internal.play_billing.zzhx zzhxVar, int i) {
        try {
            com.google.android.gms.internal.play_billing.zziq zziqVar = (com.google.android.gms.internal.play_billing.zziq) this.zzb.zzm();
            zziqVar.zzm(i);
            this.zzb = (com.google.android.gms.internal.play_billing.zzis) zziqVar.zze();
            zza(zzhxVar);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzch
    public final void zzc(com.google.android.gms.internal.play_billing.zzhx zzhxVar, int i, long j) {
        try {
            com.google.android.gms.internal.play_billing.zziq zziqVar = (com.google.android.gms.internal.play_billing.zziq) this.zzb.zzm();
            zziqVar.zzm(i);
            com.google.android.gms.internal.play_billing.zzis zzisVar = (com.google.android.gms.internal.play_billing.zzis) zziqVar.zze();
            this.zzb = zzisVar;
            if (j != 0) {
                com.google.android.gms.internal.play_billing.zziq zziqVar2 = (com.google.android.gms.internal.play_billing.zziq) zzisVar.zzm();
                zziqVar2.zzo(j);
                zzisVar = (com.google.android.gms.internal.play_billing.zzis) zziqVar2.zze();
            }
            zzl(zzhxVar, zzisVar);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzch
    public final void zzd(com.google.android.gms.internal.play_billing.zzhx zzhxVar, long j, boolean z) {
        com.google.android.gms.internal.play_billing.zzis zzisVar;
        try {
            com.google.android.gms.internal.play_billing.zzhv zzhvVar = (com.google.android.gms.internal.play_billing.zzhv) zzhxVar.zzm();
            com.google.android.gms.internal.play_billing.zzja zzjaVar = (com.google.android.gms.internal.play_billing.zzja) zzhxVar.zzB().zzm();
            zzjaVar.zza(z);
            zzhvVar.zzn(zzjaVar);
            com.google.android.gms.internal.play_billing.zzhx zzhxVar2 = (com.google.android.gms.internal.play_billing.zzhx) zzhvVar.zze();
            if (j == 0) {
                zzisVar = this.zzb;
            } else {
                com.google.android.gms.internal.play_billing.zziq zziqVar = (com.google.android.gms.internal.play_billing.zziq) this.zzb.zzm();
                zziqVar.zzo(j);
                zzisVar = (com.google.android.gms.internal.play_billing.zzis) zziqVar.zze();
            }
            zzl(zzhxVar2, zzisVar);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzch
    public final void zze(com.google.android.gms.internal.play_billing.zzhx zzhxVar, int i, long j, boolean z) {
        com.google.android.gms.internal.play_billing.zzis zzisVar;
        try {
            com.google.android.gms.internal.play_billing.zziq zziqVar = (com.google.android.gms.internal.play_billing.zziq) this.zzb.zzm();
            zziqVar.zzm(i);
            this.zzb = (com.google.android.gms.internal.play_billing.zzis) zziqVar.zze();
            com.google.android.gms.internal.play_billing.zzhv zzhvVar = (com.google.android.gms.internal.play_billing.zzhv) zzhxVar.zzm();
            com.google.android.gms.internal.play_billing.zzja zzjaVar = (com.google.android.gms.internal.play_billing.zzja) zzhxVar.zzB().zzm();
            zzjaVar.zza(z);
            zzhvVar.zzn(zzjaVar);
            com.google.android.gms.internal.play_billing.zzhx zzhxVar2 = (com.google.android.gms.internal.play_billing.zzhx) zzhvVar.zze();
            if (j == 0) {
                zzisVar = this.zzb;
            } else {
                com.google.android.gms.internal.play_billing.zziq zziqVar2 = (com.google.android.gms.internal.play_billing.zziq) this.zzb.zzm();
                zziqVar2.zzo(j);
                zzisVar = (com.google.android.gms.internal.play_billing.zzis) zziqVar2.zze();
            }
            zzl(zzhxVar2, zzisVar);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzch
    public final void zzf(com.google.android.gms.internal.play_billing.zzib zzibVar) {
        try {
            zzm(zzibVar, this.zzb);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzch
    public final void zzg(com.google.android.gms.internal.play_billing.zzib zzibVar, int i) {
        try {
            com.google.android.gms.internal.play_billing.zziq zziqVar = (com.google.android.gms.internal.play_billing.zziq) this.zzb.zzm();
            zziqVar.zzm(i);
            this.zzb = (com.google.android.gms.internal.play_billing.zzis) zziqVar.zze();
            zzf(zzibVar);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzch
    public final void zzh(com.google.android.gms.internal.play_billing.zzib zzibVar, long j, boolean z) {
        com.google.android.gms.internal.play_billing.zzis zzisVar;
        try {
            com.google.android.gms.internal.play_billing.zzhz zzhzVar = (com.google.android.gms.internal.play_billing.zzhz) zzibVar.zzm();
            com.google.android.gms.internal.play_billing.zzja zzjaVar = (com.google.android.gms.internal.play_billing.zzja) zzibVar.zzA().zzm();
            zzjaVar.zza(z);
            zzhzVar.zzm(zzjaVar);
            com.google.android.gms.internal.play_billing.zzib zzibVar2 = (com.google.android.gms.internal.play_billing.zzib) zzhzVar.zze();
            if (j == 0) {
                zzisVar = this.zzb;
            } else {
                com.google.android.gms.internal.play_billing.zziq zziqVar = (com.google.android.gms.internal.play_billing.zziq) this.zzb.zzm();
                zziqVar.zzo(j);
                zzisVar = (com.google.android.gms.internal.play_billing.zzis) zziqVar.zze();
            }
            zzm(zzibVar2, zzisVar);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzch
    public final void zzi(com.google.android.gms.internal.play_billing.zzij zzijVar) {
        try {
            com.google.android.gms.internal.play_billing.zzjg zzjgVarZzc = com.google.android.gms.internal.play_billing.zzji.zzc();
            zzjgVarZzc.zzn(this.zzb);
            zzjgVarZzc.zzm(zzijVar);
            this.zzc.zza((com.google.android.gms.internal.play_billing.zzji) zzjgVarZzc.zze());
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzch
    public final void zzj(com.google.android.gms.internal.play_billing.zzjo zzjoVar) {
        try {
            com.android.billingclient.api.zzcn zzcnVar = this.zzc;
            com.google.android.gms.internal.play_billing.zzjg zzjgVarZzc = com.google.android.gms.internal.play_billing.zzji.zzc();
            zzjgVarZzc.zzn(this.zzb);
            zzjgVarZzc.zzo(zzjoVar);
            zzcnVar.zza((com.google.android.gms.internal.play_billing.zzji) zzjgVarZzc.zze());
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzch
    public final void zzk(com.google.android.gms.internal.play_billing.zzjs zzjsVar) {
        if (zzjsVar == null) {
            return;
        }
        try {
            com.google.android.gms.internal.play_billing.zzjg zzjgVarZzc = com.google.android.gms.internal.play_billing.zzji.zzc();
            zzjgVarZzc.zzn(this.zzb);
            zzjgVarZzc.zzp(zzjsVar);
            this.zzc.zza((com.google.android.gms.internal.play_billing.zzji) zzjgVarZzc.zze());
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }
}
