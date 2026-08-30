package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdgy implements com.google.android.gms.internal.ads.zzbjp {
    private final java.lang.ref.WeakReference zza;

    /* synthetic */ zzdgy(com.google.android.gms.internal.ads.zzdhb zzdhbVar, com.google.android.gms.internal.ads.zzdha zzdhaVar) {
        this.zza = new java.lang.ref.WeakReference(zzdhbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzdhb zzdhbVar = (com.google.android.gms.internal.ads.zzdhb) this.zza.get();
        if (zzdhbVar == null) {
            return;
        }
        zzdhbVar.zzh.onAdClicked();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkE)).booleanValue()) {
            zzdhbVar.zzi.zzdd();
            if (android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get("sccg"))) {
                return;
            }
            zzdhbVar.zzi.zzu();
        }
    }
}
