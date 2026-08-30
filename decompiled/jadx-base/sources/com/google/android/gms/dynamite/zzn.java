package com.google.android.gms.dynamite;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzn implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions {
    private final int zza;

    public zzn(int i, int i2) {
        this.zza = i;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public final int zza(android.content.Context context, java.lang.String str) {
        return this.zza;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public final int zzb(android.content.Context context, java.lang.String str, boolean z) {
        return 0;
    }
}
