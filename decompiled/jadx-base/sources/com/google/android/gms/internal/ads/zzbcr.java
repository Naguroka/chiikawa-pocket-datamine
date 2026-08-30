package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
@java.lang.Deprecated
public final class zzbcr {
    public static final void zza(com.google.android.gms.internal.ads.zzbcq zzbcqVar, com.google.android.gms.internal.ads.zzbco zzbcoVar) {
        if (zzbcoVar.zza() == null) {
            throw new java.lang.IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (android.text.TextUtils.isEmpty(zzbcoVar.zzb())) {
            throw new java.lang.IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzbcqVar.zzd(zzbcoVar.zza(), zzbcoVar.zzb(), zzbcoVar.zzc(), zzbcoVar.zzd());
    }
}
