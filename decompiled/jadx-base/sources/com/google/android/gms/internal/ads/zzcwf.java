package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcwf extends com.google.android.gms.internal.ads.zzdbj implements com.google.android.gms.internal.ads.zzcvx {
    public zzcwf(java.util.Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzq(new com.google.android.gms.internal.ads.zzdbi() { // from class: com.google.android.gms.internal.ads.zzcwe
            @Override // com.google.android.gms.internal.ads.zzdbi
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzcwj) obj).zzq(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void zzb() {
        zzq(new com.google.android.gms.internal.ads.zzdbi() { // from class: com.google.android.gms.internal.ads.zzcwd
            @Override // com.google.android.gms.internal.ads.zzdbi
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzcwj) obj).zzq(com.google.android.gms.internal.ads.zzfdk.zzd(11, null, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void zzc(final com.google.android.gms.internal.ads.zzdgb zzdgbVar) {
        zzq(new com.google.android.gms.internal.ads.zzdbi() { // from class: com.google.android.gms.internal.ads.zzcwc
            @Override // com.google.android.gms.internal.ads.zzdbi
            public final void zza(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzcwj zzcwjVar = (com.google.android.gms.internal.ads.zzcwj) obj;
                java.lang.String message = zzdgbVar.getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                zzcwjVar.zzq(com.google.android.gms.internal.ads.zzfdk.zzd(12, message, null));
            }
        });
    }
}
