package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class StringResourceValueReader {
    private final android.content.res.Resources zza;
    private final java.lang.String zzb;

    public StringResourceValueReader(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        android.content.res.Resources resources = context.getResources();
        this.zza = resources;
        this.zzb = resources.getResourcePackageName(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
    }

    public java.lang.String getString(java.lang.String str) {
        int identifier = this.zza.getIdentifier(str, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING, this.zzb);
        if (identifier == 0) {
            return null;
        }
        return this.zza.getString(identifier);
    }
}
