package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzefb implements com.google.android.gms.internal.ads.zzdgc {
    private final com.google.android.gms.internal.ads.zzfbo zza;
    private final com.google.android.gms.internal.ads.zzbrd zzb;
    private final com.google.android.gms.ads.AdFormat zzc;
    private com.google.android.gms.internal.ads.zzcwl zzd = null;

    zzefb(com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzbrd zzbrdVar, com.google.android.gms.ads.AdFormat adFormat) {
        this.zza = zzfboVar;
        this.zzb = zzbrdVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdgc
    public final void zza(boolean z, android.content.Context context, com.google.android.gms.internal.ads.zzcwg zzcwgVar) throws com.google.android.gms.internal.ads.zzdgb {
        boolean zZzs;
        try {
            com.google.android.gms.ads.AdFormat adFormat = com.google.android.gms.ads.AdFormat.BANNER;
            int iOrdinal = this.zzc.ordinal();
            if (iOrdinal == 1) {
                zZzs = this.zzb.zzs(com.google.android.gms.dynamic.ObjectWrapper.wrap(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zZzs = this.zzb.zzr(com.google.android.gms.dynamic.ObjectWrapper.wrap(context));
                    }
                    throw new com.google.android.gms.internal.ads.zzdgb("Adapter failed to show.");
                }
                zZzs = this.zzb.zzt(com.google.android.gms.dynamic.ObjectWrapper.wrap(context));
            }
            if (zZzs) {
                com.google.android.gms.internal.ads.zzcwl zzcwlVar = this.zzd;
                if (zzcwlVar == null) {
                    return;
                }
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbE)).booleanValue() || this.zza.zzY != 2) {
                    return;
                }
                zzcwlVar.zza();
                return;
            }
            throw new com.google.android.gms.internal.ads.zzdgb("Adapter failed to show.");
        } catch (java.lang.Throwable th) {
            throw new com.google.android.gms.internal.ads.zzdgb(th);
        }
    }

    public final void zzb(com.google.android.gms.internal.ads.zzcwl zzcwlVar) {
        this.zzd = zzcwlVar;
    }
}
