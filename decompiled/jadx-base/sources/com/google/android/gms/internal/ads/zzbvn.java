package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbvn {
    private int zzA;
    private final java.lang.String zzB;
    private boolean zzC;
    private int zza;
    private boolean zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private java.lang.String zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private int zzl;
    private double zzm;
    private boolean zzn;
    private java.lang.String zzo;
    private java.lang.String zzp;
    private final boolean zzq;
    private final boolean zzr;
    private final java.lang.String zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final boolean zzv;
    private final java.lang.String zzw;
    private final java.lang.String zzx;
    private float zzy;
    private int zzz;

    /* JADX WARN: Code duplicated, block: B:12:0x0061  */
    public zzbvn(android.content.Context context) {
        android.content.pm.ActivityInfo activityInfo;
        java.lang.String str;
        android.util.DisplayMetrics displayMetrics;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        com.google.android.gms.internal.ads.zzbcl.zza(context);
        zzc(context);
        zze(context);
        zzd(context);
        java.util.Locale locale = java.util.Locale.getDefault();
        this.zzq = zzb(packageManager, "geo:0,0?q=donuts") != null;
        this.zzr = zzb(packageManager, "http://www.google.com") != null;
        this.zzs = locale.getCountry();
        com.google.android.gms.ads.internal.zzv.zzq();
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        this.zzt = com.google.android.gms.ads.internal.util.client.zzf.zzr();
        this.zzu = com.google.android.gms.common.util.DeviceProperties.isLatchsky(context);
        this.zzv = com.google.android.gms.common.util.DeviceProperties.isSidewinder(context);
        this.zzw = locale.getLanguage();
        android.content.pm.ResolveInfo resolveInfoZzb = zzb(packageManager, "market://details?id=com.google.android.gms.ads");
        java.lang.String str2 = null;
        if (resolveInfoZzb == null || (activityInfo = resolveInfoZzb.activityInfo) == null) {
            str = null;
        } else {
            try {
                android.content.pm.PackageInfo packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo(activityInfo.packageName, 0);
                if (packageInfo != null) {
                    str = packageInfo.versionCode + "." + activityInfo.packageName;
                } else {
                    str = null;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        this.zzx = str;
        try {
            android.content.pm.PackageInfo packageInfo2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo("com.android.vending", 128);
            if (packageInfo2 != null) {
                str2 = packageInfo2.versionCode + "." + packageInfo2.packageName;
            }
        } catch (java.lang.Exception unused2) {
        }
        this.zzB = str2;
        android.content.res.Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return;
        }
        this.zzy = displayMetrics.density;
        this.zzz = displayMetrics.widthPixels;
        this.zzA = displayMetrics.heightPixels;
    }

    private static android.content.pm.ResolveInfo zzb(android.content.pm.PackageManager packageManager, java.lang.String str) {
        try {
            return packageManager.resolveActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str)), 65536);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    private final void zzc(android.content.Context context) {
        android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.zza = audioManager.getMode();
                this.zzb = audioManager.isMusicActive();
                this.zzc = audioManager.isSpeakerphoneOn();
                this.zzd = audioManager.getStreamVolume(3);
                this.zze = audioManager.getRingerMode();
                this.zzf = audioManager.getStreamVolume(2);
                return;
            } catch (java.lang.Throwable th) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.zza = -2;
        this.zzb = false;
        this.zzc = false;
        this.zzd = 0;
        this.zze = 2;
        this.zzf = 0;
    }

    private final void zzd(android.content.Context context) {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED");
        android.content.Intent intentRegisterReceiver = (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkR)).booleanValue() || android.os.Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (intentRegisterReceiver == null) {
            this.zzm = -1.0d;
            this.zzn = false;
        } else {
            int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
            this.zzm = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
            this.zzn = intExtra == 2 || intExtra == 5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0031  */
    private final void zze(android.content.Context context) {
        int networkType;
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        this.zzg = telephonyManager.getNetworkOperator();
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastR()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziy)).booleanValue()) {
                networkType = 0;
            } else {
                networkType = telephonyManager.getNetworkType();
            }
        } else {
            networkType = telephonyManager.getNetworkType();
        }
        this.zzi = networkType;
        this.zzj = telephonyManager.getPhoneType();
        this.zzh = -2;
        this.zzk = false;
        this.zzl = -1;
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzB(context, "android.permission.ACCESS_NETWORK_STATE")) {
            android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.zzh = activeNetworkInfo.getType();
                this.zzl = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.zzh = -1;
            }
            this.zzk = connectivityManager.isActiveNetworkMetered();
        }
    }

    public final com.google.android.gms.internal.ads.zzbvo zza() {
        return new com.google.android.gms.internal.ads.zzbvo(this.zza, this.zzq, this.zzr, this.zzg, this.zzs, this.zzt, this.zzu, this.zzv, this.zzb, this.zzc, this.zzw, this.zzx, this.zzB, this.zzd, this.zzh, this.zzi, this.zzj, this.zze, this.zzf, this.zzy, this.zzz, this.zzA, this.zzm, this.zzn, this.zzk, this.zzl, this.zzo, this.zzC, this.zzp);
    }

    public zzbvn(android.content.Context context, com.google.android.gms.internal.ads.zzbvo zzbvoVar) {
        com.google.android.gms.internal.ads.zzbcl.zza(context);
        zzc(context);
        zze(context);
        zzd(context);
        this.zzo = android.os.Build.FINGERPRINT;
        this.zzp = android.os.Build.DEVICE;
        this.zzC = com.google.android.gms.internal.ads.zzbdm.zzg(context);
        this.zzq = zzbvoVar.zza;
        this.zzr = zzbvoVar.zzb;
        this.zzs = zzbvoVar.zzc;
        this.zzt = zzbvoVar.zzd;
        this.zzu = zzbvoVar.zze;
        this.zzv = zzbvoVar.zzf;
        this.zzw = zzbvoVar.zzg;
        this.zzx = zzbvoVar.zzh;
        this.zzB = zzbvoVar.zzi;
        this.zzy = zzbvoVar.zzl;
        this.zzz = zzbvoVar.zzm;
        this.zzA = zzbvoVar.zzn;
    }
}
