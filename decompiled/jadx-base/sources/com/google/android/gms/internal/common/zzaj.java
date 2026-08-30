package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaj extends com.google.android.gms.internal.common.zzal {
    private final transient com.google.android.gms.internal.common.zzal zza;

    zzaj(com.google.android.gms.internal.common.zzal zzalVar) {
        this.zza = zzalVar;
    }

    private final int zzr(int i) {
        return (this.zza.size() - 1) - i;
    }

    @Override // com.google.android.gms.internal.common.zzal, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return this.zza.contains(obj);
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.common.zzv.zza(i, this.zza.size(), com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return this.zza.get(zzr(i));
    }

    @Override // com.google.android.gms.internal.common.zzal, java.util.List
    public final int indexOf(java.lang.Object obj) {
        int iLastIndexOf = this.zza.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return zzr(iLastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzal, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        int iIndexOf = this.zza.indexOf(obj);
        if (iIndexOf >= 0) {
            return zzr(iIndexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.common.zzal, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.common.zzag
    final boolean zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.common.zzal
    public final com.google.android.gms.internal.common.zzal zzh() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.common.zzal
    /* JADX INFO: renamed from: zzi */
    public final com.google.android.gms.internal.common.zzal subList(int i, int i2) {
        com.google.android.gms.internal.common.zzv.zzc(i, i2, this.zza.size());
        com.google.android.gms.internal.common.zzal zzalVar = this.zza;
        return zzalVar.subList(zzalVar.size() - i2, this.zza.size() - i).zzh();
    }
}
