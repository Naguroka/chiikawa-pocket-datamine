package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdje implements com.google.android.gms.internal.ads.zzbfk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzdkd zza;
    final /* synthetic */ android.view.ViewGroup zzb;

    zzdje(com.google.android.gms.internal.ads.zzdkd zzdkdVar, android.view.ViewGroup viewGroup) {
        this.zza = zzdkdVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final org.json.JSONObject zza() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final org.json.JSONObject zzb() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zzc() {
        com.google.android.gms.internal.ads.zzfxn zzfxnVar = com.google.android.gms.internal.ads.zzdjb.zza;
        java.util.Map mapZzm = this.zza.zzm();
        if (mapZzm == null) {
            return;
        }
        int size = zzfxnVar.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = mapZzm.get((java.lang.String) zzfxnVar.get(i));
            i++;
            if (obj != null) {
                this.zza.onClick(this.zzb);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zzd(android.view.MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }
}
