package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzig {
    public static java.lang.String zza(android.content.Context context) {
        try {
            return context.getResources().getResourcePackageName(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        } catch (android.content.res.Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static final java.lang.String zzb(java.lang.String str, android.content.res.Resources resources, java.lang.String str2) {
        int identifier = resources.getIdentifier(str, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING, str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (android.content.res.Resources.NotFoundException unused) {
            return null;
        }
    }
}
