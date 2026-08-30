package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzccr extends com.google.android.gms.internal.ads.zzaqv {
    static final com.google.android.gms.internal.ads.zzccr zzb = new com.google.android.gms.internal.ads.zzccr();

    zzccr() {
    }

    @Override // com.google.android.gms.internal.ads.zzaqv
    public final com.google.android.gms.internal.ads.zzaqz zza(java.lang.String str, byte[] bArr, java.lang.String str2) {
        if ("moov".equals(str)) {
            return new com.google.android.gms.internal.ads.zzarb();
        }
        return "mvhd".equals(str) ? new com.google.android.gms.internal.ads.zzarc() : new com.google.android.gms.internal.ads.zzard(str);
    }
}
