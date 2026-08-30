package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzji {
    private static android.os.UserManager zza;
    private static volatile boolean zzb = !zzc();

    private zzji() {
    }

    public static boolean zza(android.content.Context context) {
        return zzc() && !zzd(context);
    }

    public static boolean zzb(android.content.Context context) {
        return !zzc() || zzd(context);
    }

    public static boolean zzc() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004e A[Catch: all -> 0x0052, TryCatch #0 {, blocks: (B:7:0x0009, B:9:0x000d, B:14:0x0015, B:16:0x0019, B:17:0x0023, B:30:0x004e, B:31:0x0050, B:20:0x0029, B:22:0x002f, B:26:0x003c, B:28:0x004a), top: B:36:0x0009, inners: #1 }] */
    private static boolean zzd(android.content.Context context) {
        if (zzb) {
            return true;
        }
        synchronized (com.google.android.gms.internal.measurement.zzji.class) {
            if (zzb) {
                return true;
            }
            int i = 1;
            while (true) {
                boolean z = false;
                if (i <= 2) {
                    if (zza == null) {
                        zza = (android.os.UserManager) context.getSystemService(android.os.UserManager.class);
                    }
                    android.os.UserManager userManager = zza;
                    if (userManager == null) {
                        z = true;
                    } else {
                        try {
                            if (userManager.isUserUnlocked() || !userManager.isUserRunning(android.os.Process.myUserHandle())) {
                                z = true;
                            }
                        } catch (java.lang.NullPointerException e) {
                            android.util.Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                            zza = null;
                            i++;
                        }
                    }
                    if (z) {
                        zzb = true;
                    }
                    return z;
                }
                if (z) {
                    zza = null;
                }
                if (z) {
                    zzb = true;
                }
                return z;
            }
        }
    }
}
