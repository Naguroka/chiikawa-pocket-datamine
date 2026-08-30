package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzalw implements com.google.android.gms.internal.ads.zzakf {
    private final com.google.android.gms.internal.ads.zzdy zza = new com.google.android.gms.internal.ads.zzdy();
    private final com.google.android.gms.internal.ads.zzalm zzb = new com.google.android.gms.internal.ads.zzalm();

    @Override // com.google.android.gms.internal.ads.zzakf
    public final void zza(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzake zzakeVar, com.google.android.gms.internal.ads.zzdb zzdbVar) {
        this.zza.zzJ(bArr, i2 + i);
        this.zza.zzL(i);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            com.google.android.gms.internal.ads.zzdy zzdyVar = this.zza;
            int iZzd = zzdyVar.zzd();
            java.lang.String strZzz = zzdyVar.zzz(java.nio.charset.StandardCharsets.UTF_8);
            if (strZzz == null || !strZzz.startsWith("WEBVTT")) {
                zzdyVar.zzL(iZzd);
                throw com.google.android.gms.internal.ads.zzbc.zza("Expected WEBVTT. Got ".concat(java.lang.String.valueOf(zzdyVar.zzz(java.nio.charset.StandardCharsets.UTF_8))), null);
            }
            while (!android.text.TextUtils.isEmpty(this.zza.zzz(java.nio.charset.StandardCharsets.UTF_8))) {
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (true) {
                com.google.android.gms.internal.ads.zzdy zzdyVar2 = this.zza;
                byte b = -1;
                int iZzd2 = 0;
                while (b == -1) {
                    iZzd2 = zzdyVar2.zzd();
                    java.lang.String strZzz2 = zzdyVar2.zzz(java.nio.charset.StandardCharsets.UTF_8);
                    if (strZzz2 == null) {
                        b = 0;
                    } else if ("STYLE".equals(strZzz2)) {
                        b = 2;
                    } else {
                        b = strZzz2.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                    }
                }
                zzdyVar2.zzL(iZzd2);
                if (b == 0) {
                    com.google.android.gms.internal.ads.zzajz.zza(new com.google.android.gms.internal.ads.zzalz(arrayList2), zzakeVar, zzdbVar);
                    return;
                }
                if (b == 1) {
                    while (!android.text.TextUtils.isEmpty(this.zza.zzz(java.nio.charset.StandardCharsets.UTF_8))) {
                    }
                } else if (b != 2) {
                    com.google.android.gms.internal.ads.zzalo zzaloVarZzc = com.google.android.gms.internal.ads.zzalv.zzc(this.zza, arrayList);
                    if (zzaloVarZzc != null) {
                        arrayList2.add(zzaloVarZzc);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new java.lang.IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.zza.zzz(java.nio.charset.StandardCharsets.UTF_8);
                    arrayList.addAll(this.zzb.zzb(this.zza));
                }
            }
        } catch (com.google.android.gms.internal.ads.zzbc e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }
}
