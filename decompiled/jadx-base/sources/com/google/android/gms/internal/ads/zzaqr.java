package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzaqr extends com.google.android.gms.internal.ads.zzapm {
    private final java.lang.Object zza;
    private final com.google.android.gms.internal.ads.zzapr zzb;

    public zzaqr(int i, java.lang.String str, com.google.android.gms.internal.ads.zzapr zzaprVar, com.google.android.gms.internal.ads.zzapq zzapqVar) {
        super(i, str, zzapqVar);
        this.zza = new java.lang.Object();
        this.zzb = zzaprVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    protected final com.google.android.gms.internal.ads.zzaps zzh(com.google.android.gms.internal.ads.zzapi zzapiVar) {
        java.lang.String str;
        java.lang.String str2;
        try {
            byte[] bArr = zzapiVar.zzb;
            java.util.Map map = zzapiVar.zzc;
            java.lang.String str3 = "ISO-8859-1";
            if (map != null && (str2 = (java.lang.String) map.get("Content-Type")) != null) {
                java.lang.String[] strArrSplit = str2.split(";", 0);
                for (int i = 1; i < strArrSplit.length; i++) {
                    java.lang.String[] strArrSplit2 = strArrSplit[i].trim().split(com.ironsource.y8.i.b, 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals(com.json.zb.M)) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                }
            }
            str = new java.lang.String(bArr, str3);
        } catch (java.io.UnsupportedEncodingException unused) {
            str = new java.lang.String(zzapiVar.zzb);
        }
        return com.google.android.gms.internal.ads.zzaps.zzb(str, com.google.android.gms.internal.ads.zzaqj.zzb(zzapiVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzapm
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzo(java.lang.String str) {
        com.google.android.gms.internal.ads.zzapr zzaprVar;
        synchronized (this.zza) {
            zzaprVar = this.zzb;
        }
        zzaprVar.zza(str);
    }
}
