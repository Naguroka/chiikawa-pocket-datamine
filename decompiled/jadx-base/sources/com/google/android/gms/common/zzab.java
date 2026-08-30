package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzab extends com.google.android.gms.common.zzad {
    private final java.util.concurrent.Callable zzf;

    /* synthetic */ zzab(java.util.concurrent.Callable callable, com.google.android.gms.common.zzac zzacVar) {
        super();
        this.zzf = callable;
    }

    @Override // com.google.android.gms.common.zzad
    final java.lang.String zza() {
        try {
            return (java.lang.String) this.zzf.call();
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}
