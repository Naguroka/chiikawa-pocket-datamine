package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzauz extends com.google.android.gms.internal.ads.zzauy {
    private zzauz(android.content.Context context, com.google.android.gms.internal.ads.zzaux zzauxVar) {
        super(context, zzauxVar);
    }

    public static com.google.android.gms.internal.ads.zzauz zzu(android.content.Context context, com.google.android.gms.internal.ads.zzaux zzauxVar) {
        zzs(context, zzauxVar);
        return new com.google.android.gms.internal.ads.zzauz(context, zzauxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    protected final java.util.List zzq(com.google.android.gms.internal.ads.zzawd zzawdVar, android.content.Context context, com.google.android.gms.internal.ads.zzasc zzascVar, com.google.android.gms.internal.ads.zzarp zzarpVar) {
        if (zzawdVar.zzk() == null || !this.zzu.zza) {
            return super.zzq(zzawdVar, context, zzascVar, null);
        }
        int iZza = zzawdVar.zza();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(super.zzq(zzawdVar, context, zzascVar, null));
        arrayList.add(new com.google.android.gms.internal.ads.zzawv(zzawdVar, "mYdY7l5D+eRA2n+1DSS0l4Onm7QwkKst2ndSMEehloNd2MnZiOwv+qpmI2KWHSFP", "85J7Wr+LLVwpDfypFtzN1eoOiAfuTMa63SuSJgN9bwE=", zzascVar, iZza, 24));
        return arrayList;
    }
}
