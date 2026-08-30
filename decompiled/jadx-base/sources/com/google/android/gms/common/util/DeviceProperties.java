package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class DeviceProperties {
    private static java.lang.Boolean zza;
    private static java.lang.Boolean zzb;
    private static java.lang.Boolean zzc;
    private static java.lang.Boolean zzd;
    private static java.lang.Boolean zze;
    private static java.lang.Boolean zzf;
    private static java.lang.Boolean zzg;
    private static java.lang.Boolean zzh;
    private static java.lang.Boolean zzi;
    private static java.lang.Boolean zzj;
    private static java.lang.Boolean zzk;
    private static java.lang.Boolean zzl;
    private static java.lang.Boolean zzm;
    private static java.lang.Boolean zzn;
    private static java.lang.Boolean zzo;
    private static java.lang.Boolean zzp;
    private static java.lang.Boolean zzq;

    private DeviceProperties() {
    }

    public static boolean isAuto(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (zzl == null) {
            boolean z = false;
            if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            zzl = java.lang.Boolean.valueOf(z);
        }
        return zzl.booleanValue();
    }

    public static boolean isBstar(android.content.Context context) {
        if (zzo == null) {
            boolean z = false;
            if (com.google.android.gms.common.util.PlatformVersion.isAtLeastR() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z = true;
            }
            zzo = java.lang.Boolean.valueOf(z);
        }
        return zzo.booleanValue();
    }

    public static boolean isFoldable(android.content.Context context) {
        if (zzd == null) {
            boolean z = false;
            if (com.google.android.gms.common.util.PlatformVersion.isAtLeastR() && context.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle")) {
                z = true;
            }
            zzd = java.lang.Boolean.valueOf(z);
        }
        return zzd.booleanValue();
    }

    public static boolean isLatchsky(android.content.Context context) {
        if (zzh == null) {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            zzh = java.lang.Boolean.valueOf(z);
        }
        return zzh.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    public static boolean isPhone(android.content.Context context) {
        if (zza == null) {
            boolean z = true;
            if (!isFoldable(context)) {
                if (isTablet(context) || isWearable(context) || zzb(context)) {
                    z = false;
                } else {
                    if (zzk == null) {
                        zzk = java.lang.Boolean.valueOf(context.getPackageManager().hasSystemFeature("org.chromium.arc"));
                    }
                    if (zzk.booleanValue() || isAuto(context) || isTv(context)) {
                        z = false;
                    } else {
                        if (zzn == null) {
                            zzn = java.lang.Boolean.valueOf(context.getPackageManager().hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE"));
                        }
                        if (zzn.booleanValue() || isBstar(context) || isXr(context)) {
                            z = false;
                        } else {
                            if (zzq == null) {
                                zzq = java.lang.Boolean.valueOf(context.getPackageManager().hasSystemFeature("com.google.desktop.gms"));
                            }
                            if (zzq.booleanValue()) {
                                z = false;
                            }
                        }
                    }
                }
            }
            zza = java.lang.Boolean.valueOf(z);
        }
        return zza.booleanValue();
    }

    public static boolean isPhoneGo(android.content.Context context) {
        android.app.ActivityManager activityManager;
        boolean z = false;
        if (context == null) {
            return false;
        }
        if (zzb == null) {
            if (isPhone(context)) {
                if (zzi == null && (activityManager = (android.app.ActivityManager) context.getSystemService("activity")) != null) {
                    zzi = java.lang.Boolean.valueOf(activityManager.isLowRamDevice());
                }
                if (com.google.android.gms.common.internal.Objects.equal(zzi, java.lang.Boolean.TRUE) && android.os.Build.VERSION.SDK_INT >= 27) {
                    z = true;
                }
            }
            zzb = java.lang.Boolean.valueOf(z);
        }
        return zzb.booleanValue();
    }

    public static boolean isSevenInchTablet(android.content.Context context) {
        return zzc(context.getResources());
    }

    public static boolean isSidewinder(android.content.Context context) {
        return zza(context);
    }

    public static boolean isTablet(android.content.Context context) {
        return isTablet(context.getResources());
    }

    public static boolean isTv(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (zzm == null) {
            boolean z = true;
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback") && !packageManager.hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE")) {
                z = false;
            }
            zzm = java.lang.Boolean.valueOf(z);
        }
        return zzm.booleanValue();
    }

    public static boolean isUserBuild() {
        int i = com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return "user".equals(android.os.Build.TYPE);
    }

    public static boolean isWearable(android.content.Context context) {
        return zzd(context.getPackageManager());
    }

    public static boolean isWearableWithoutPlayStore(android.content.Context context) {
        if (isWearable(context) && !com.google.android.gms.common.util.PlatformVersion.isAtLeastN()) {
            return true;
        }
        if (zza(context)) {
            return !com.google.android.gms.common.util.PlatformVersion.isAtLeastO() || com.google.android.gms.common.util.PlatformVersion.isAtLeastR();
        }
        return false;
    }

    public static boolean isXr(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (zzp == null) {
            zzp = java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.software.xr.immersive"));
        }
        return zzp.booleanValue();
    }

    public static boolean zza(android.content.Context context) {
        if (zzg == null) {
            zzg = java.lang.Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return zzg.booleanValue();
    }

    public static boolean zzb(android.content.Context context) {
        if (zzj == null) {
            zzj = java.lang.Boolean.valueOf(com.google.android.gms.common.util.PlatformVersion.isAtLeastO() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
        }
        return zzj.booleanValue();
    }

    public static boolean zzc(android.content.res.Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        if (zze == null) {
            android.content.res.Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z = true;
            }
            zze = java.lang.Boolean.valueOf(z);
        }
        return zze.booleanValue();
    }

    public static boolean zzd(android.content.pm.PackageManager packageManager) {
        if (zzf == null) {
            zzf = java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return zzf.booleanValue();
    }

    public static boolean isTablet(android.content.res.Resources resources) {
        if (resources == null) {
            return false;
        }
        if (zzc == null) {
            zzc = java.lang.Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || zzc(resources));
        }
        return zzc.booleanValue();
    }
}
