package com.google.android.gms.internal.p000authapi;

/* JADX INFO: loaded from: classes4.dex */
public final class zzq {
    public static android.app.PendingIntent zzc(android.content.Context context, com.google.android.gms.auth.api.Auth.AuthCredentialsOptions authCredentialsOptions, com.google.android.gms.auth.api.credentials.HintRequest hintRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "context must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(hintRequest, "request must not be null");
        android.content.Intent intentPutExtra = new android.content.Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", (java.lang.String) null);
        com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToIntentExtra(hintRequest, intentPutExtra, "com.google.android.gms.credentials.HintRequest");
        return android.app.PendingIntent.getActivity(context, 2000, intentPutExtra, androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE);
    }
}
