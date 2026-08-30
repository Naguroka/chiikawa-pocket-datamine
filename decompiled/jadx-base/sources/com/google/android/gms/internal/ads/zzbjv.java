package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbjv implements com.google.android.gms.internal.ads.zzbjp {
    private final android.content.Context zza;
    private final java.util.Map zzb;

    public zzbjv(android.content.Context context, java.util.Map map) {
        this.zza = context;
        this.zzb = map;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(java.lang.Object obj, java.util.Map map) {
        byte b;
        if (com.google.android.gms.ads.internal.zzv.zzo().zzp(this.zza)) {
            java.lang.String str = (java.lang.String) map.get(com.ironsource.y8.h.j0);
            java.lang.String str2 = (java.lang.String) map.get("eventId");
            int iHashCode = str.hashCode();
            if (iHashCode != 94399) {
                if (iHashCode != 94401) {
                    if (iHashCode == 94407 && str.equals("_ai")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("_ac")) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str.equals("_aa")) {
                b = 2;
            } else {
                b = -1;
            }
            if (b == 0) {
                com.google.android.gms.ads.internal.zzv.zzo().zzj(this.zza, str2, (java.util.Map) this.zzb.get("_ac"));
            } else if (b == 1) {
                com.google.android.gms.ads.internal.zzv.zzo().zzk(this.zza, str2, (java.util.Map) this.zzb.get("_ai"));
            } else if (b != 2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("logScionEvent gmsg contained unsupported eventName");
            } else {
                com.google.android.gms.ads.internal.zzv.zzo().zzh(this.zza, str2);
            }
        }
    }
}
