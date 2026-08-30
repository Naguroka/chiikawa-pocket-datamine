package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeii implements com.google.android.gms.internal.ads.zzecw {
    private final com.google.android.gms.internal.ads.zzecy zza;
    private final com.google.android.gms.internal.ads.zzedc zzb;
    private final com.google.android.gms.internal.ads.zzfgn zzc;
    private final com.google.android.gms.internal.ads.zzgcs zzd;

    public zzeii(com.google.android.gms.internal.ads.zzfgn zzfgnVar, com.google.android.gms.internal.ads.zzgcs zzgcsVar, com.google.android.gms.internal.ads.zzecy zzecyVar, com.google.android.gms.internal.ads.zzedc zzedcVar) {
        this.zzc = zzfgnVar;
        this.zzd = zzgcsVar;
        this.zzb = zzedcVar;
        this.zza = zzecyVar;
    }

    static final java.lang.String zze(java.lang.String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final com.google.common.util.concurrent.ListenableFuture zza(final com.google.android.gms.internal.ads.zzfca zzfcaVar, final com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        final com.google.android.gms.internal.ads.zzecz zzeczVarZza;
        java.util.Iterator it = zzfboVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzeczVarZza = null;
                break;
            }
            try {
                zzeczVarZza = this.zza.zza((java.lang.String) it.next(), zzfboVar.zzv);
                break;
            } catch (com.google.android.gms.internal.ads.zzfcq unused) {
            }
        }
        if (zzeczVarZza == null) {
            return com.google.android.gms.internal.ads.zzgch.zzg(new com.google.android.gms.internal.ads.zzefy("Unable to instantiate mediation adapter class."));
        }
        com.google.android.gms.internal.ads.zzcab zzcabVar = new com.google.android.gms.internal.ads.zzcab();
        zzeczVarZza.zzc.zza(new com.google.android.gms.internal.ads.zzeih(this, zzeczVarZza, zzcabVar));
        if (zzfboVar.zzM) {
            android.os.Bundle bundle = zzfcaVar.zza.zza.zzd.zzm;
            android.os.Bundle bundle2 = bundle.getBundle(com.google.ads.mediation.admob.AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new android.os.Bundle();
                bundle.putBundle(com.google.ads.mediation.admob.AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        com.google.android.gms.internal.ads.zzfgn zzfgnVar = this.zzc;
        return com.google.android.gms.internal.ads.zzffx.zzd(new com.google.android.gms.internal.ads.zzffs() { // from class: com.google.android.gms.internal.ads.zzeif
            @Override // com.google.android.gms.internal.ads.zzffs
            public final void zza() throws java.lang.Exception {
                this.zza.zzd(zzfcaVar, zzfboVar, zzeczVarZza);
            }
        }, this.zzd, com.google.android.gms.internal.ads.zzfgh.ADAPTER_LOAD_AD_SYN, zzfgnVar).zzb(com.google.android.gms.internal.ads.zzfgh.ADAPTER_LOAD_AD_ACK).zzd(zzcabVar).zzb(com.google.android.gms.internal.ads.zzfgh.ADAPTER_WRAP_ADAPTER).zze(new com.google.android.gms.internal.ads.zzffr() { // from class: com.google.android.gms.internal.ads.zzeig
            @Override // com.google.android.gms.internal.ads.zzffr
            public final java.lang.Object zza(java.lang.Object obj) {
                return this.zza.zzc(zzfcaVar, zzfboVar, zzeczVarZza, (java.lang.Void) obj);
            }
        }).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        return !zzfboVar.zzt.isEmpty();
    }

    final /* synthetic */ java.lang.Object zzc(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzecz zzeczVar, java.lang.Void r4) throws java.lang.Exception {
        return this.zzb.zza(zzfcaVar, zzfboVar, zzeczVar);
    }

    final /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzecz zzeczVar) throws java.lang.Exception {
        this.zzb.zzb(zzfcaVar, zzfboVar, zzeczVar);
    }
}
