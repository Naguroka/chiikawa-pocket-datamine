package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcq {
    public static boolean zza(boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return android.os.Build.FINGERPRINT.contains("generic") || android.os.Build.FINGERPRINT.contains("emulator") || android.os.Build.HARDWARE.contains("ranchu");
        }
        return android.os.Build.DEVICE.startsWith("generic");
    }
}
