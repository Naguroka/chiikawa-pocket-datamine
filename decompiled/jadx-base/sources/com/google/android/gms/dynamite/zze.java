package com.google.android.gms.dynamite;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zze implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions {
    zze() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public final int zza(android.content.Context context, java.lang.String str) {
        return com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(context, str);
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public final int zzb(android.content.Context context, java.lang.String str, boolean z) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        return com.google.android.gms.dynamite.DynamiteModule.zza(context, str, z);
    }
}
