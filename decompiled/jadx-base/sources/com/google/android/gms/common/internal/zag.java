package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zag implements android.content.DialogInterface.OnClickListener {
    public static com.google.android.gms.common.internal.zag zab(android.app.Activity activity, android.content.Intent intent, int i) {
        return new com.google.android.gms.common.internal.zad(intent, activity, i);
    }

    public static com.google.android.gms.common.internal.zag zac(androidx.fragment.app.Fragment fragment, android.content.Intent intent, int i) {
        return new com.google.android.gms.common.internal.zae(intent, fragment, i);
    }

    public static com.google.android.gms.common.internal.zag zad(com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment, android.content.Intent intent, int i) {
        return new com.google.android.gms.common.internal.zaf(intent, lifecycleFragment, 2);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        try {
            try {
                zaa();
            } catch (android.content.ActivityNotFoundException e) {
                android.util.Log.e("DialogRedirect", true == android.os.Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }

    protected abstract void zaa();
}
