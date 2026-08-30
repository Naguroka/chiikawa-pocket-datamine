package com.google.android.gms.dynamite;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzj implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy {
    zzj() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context context, java.lang.String str, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions iVersions) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        int iZzb;
        com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectionResult = new com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult();
        int iZza = iVersions.zza(context, str);
        selectionResult.localVersion = iZza;
        int i = 1;
        int i2 = 0;
        if (iZza != 0) {
            iZzb = iVersions.zzb(context, str, false);
            selectionResult.remoteVersion = iZzb;
        } else {
            iZzb = iVersions.zzb(context, str, true);
            selectionResult.remoteVersion = iZzb;
        }
        int i3 = selectionResult.localVersion;
        if (i3 == 0) {
            if (iZzb == 0) {
                i = 0;
            }
            selectionResult.selection = i;
            return selectionResult;
        }
        i2 = i3;
        if (i2 >= iZzb) {
            i = -1;
        }
        selectionResult.selection = i;
        return selectionResult;
    }
}
