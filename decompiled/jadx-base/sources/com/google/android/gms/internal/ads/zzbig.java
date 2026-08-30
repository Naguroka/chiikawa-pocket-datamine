package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbig implements com.google.android.gms.internal.ads.zzbjp {
    private final com.google.android.gms.internal.ads.zzbih zza;

    public zzbig(com.google.android.gms.internal.ads.zzbih zzbihVar) {
        this.zza = zzbihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(java.lang.Object obj, java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get("name");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("App event with no name parameter.");
        } else {
            this.zza.zzb(str, (java.lang.String) map.get("info"));
        }
    }
}
