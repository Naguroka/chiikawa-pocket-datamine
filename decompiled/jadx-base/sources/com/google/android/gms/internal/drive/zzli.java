package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzli<K, V> {
    static <K, V> void zza(com.google.android.gms.internal.drive.zzjr zzjrVar, com.google.android.gms.internal.drive.zzlj<K, V> zzljVar, K k, V v) throws java.io.IOException {
        com.google.android.gms.internal.drive.zzkb.zza(zzjrVar, zzljVar.zztu, 1, k);
        com.google.android.gms.internal.drive.zzkb.zza(zzjrVar, zzljVar.zztw, 2, v);
    }

    static <K, V> int zza(com.google.android.gms.internal.drive.zzlj<K, V> zzljVar, K k, V v) {
        return com.google.android.gms.internal.drive.zzkb.zza(zzljVar.zztu, 1, k) + com.google.android.gms.internal.drive.zzkb.zza(zzljVar.zztw, 2, v);
    }
}
