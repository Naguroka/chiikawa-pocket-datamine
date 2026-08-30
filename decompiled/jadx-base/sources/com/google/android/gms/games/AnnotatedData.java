package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public class AnnotatedData<T> {
    private final java.lang.Object zza;
    private final boolean zzb;

    public AnnotatedData(java.lang.Object obj, boolean z) {
        this.zza = obj;
        this.zzb = z;
    }

    public T get() {
        return (T) this.zza;
    }

    public boolean isStale() {
        return this.zzb;
    }
}
