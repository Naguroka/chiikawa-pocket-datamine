package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzclg implements com.google.android.gms.internal.ads.zzcla {
    private final com.google.android.gms.internal.ads.zzduv zza;

    zzclg(com.google.android.gms.internal.ads.zzduv zzduvVar) {
        this.zza = zzduvVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zza(java.util.Map map) {
        byte b;
        java.lang.String str = (java.lang.String) map.get("gesture");
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 97520651) {
            if (iHashCode == 109399814 && str.equals("shake")) {
                b = 0;
            } else {
                b = -1;
            }
        } else if (str.equals("flick")) {
            b = 1;
        } else {
            b = -1;
        }
        if (b == 0) {
            this.zza.zzm(com.google.android.gms.internal.ads.zzdur.SHAKE);
        } else if (b != 1) {
            this.zza.zzm(com.google.android.gms.internal.ads.zzdur.NONE);
        } else {
            this.zza.zzm(com.google.android.gms.internal.ads.zzdur.FLICK);
        }
    }
}
