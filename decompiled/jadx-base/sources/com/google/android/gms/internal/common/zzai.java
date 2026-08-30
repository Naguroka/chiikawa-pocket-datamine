package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzai extends com.google.android.gms.internal.common.zzad {
    private final com.google.android.gms.internal.common.zzal zza;

    zzai(com.google.android.gms.internal.common.zzal zzalVar, int i) {
        super(zzalVar.size(), i);
        this.zza = zzalVar;
    }

    @Override // com.google.android.gms.internal.common.zzad
    protected final java.lang.Object zza(int i) {
        return this.zza.get(i);
    }
}
