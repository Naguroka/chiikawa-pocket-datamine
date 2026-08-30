package com.google.android.gms.cloudmessaging;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzw {
    private final android.content.Context zza;
    private int zzb;
    private int zzc = 0;

    public zzw(android.content.Context context) {
        this.zza = context;
    }

    public final synchronized int zza() {
        android.content.pm.PackageInfo packageInfo;
        if (this.zzb == 0) {
            try {
                packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zza).getPackageInfo("com.google.android.gms", 0);
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                android.util.Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.zzb = packageInfo.versionCode;
            }
        }
        return this.zzb;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046 A[Catch: all -> 0x0077, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x001d, B:12:0x0026, B:14:0x002d, B:16:0x003f, B:24:0x0060, B:19:0x0046, B:21:0x0059, B:27:0x0064, B:31:0x0073), top: B:37:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    public final synchronized int zzb() {
        java.util.List<android.content.pm.ResolveInfo> listQueryBroadcastReceivers;
        int i = this.zzc;
        if (i != 0) {
            return i;
        }
        android.content.Context context = this.zza;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (com.google.android.gms.common.wrappers.Wrappers.packageManager(context).checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            android.util.Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
            android.content.Intent intent = new android.content.Intent("com.google.iid.TOKEN_REQUEST");
            intent.setPackage("com.google.android.gms");
            listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
            if (listQueryBroadcastReceivers != null) {
            }
            android.util.Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            if (true != com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
                i2 = 2;
            }
            this.zzc = i2;
            return i2;
        }
        android.content.Intent intent2 = new android.content.Intent("com.google.android.c2dm.intent.REGISTER");
        intent2.setPackage("com.google.android.gms");
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            android.content.Intent intent3 = new android.content.Intent("com.google.iid.TOKEN_REQUEST");
            intent3.setPackage("com.google.android.gms");
            listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
            if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.isEmpty()) {
                android.util.Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
                if (true != com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
                    i2 = 2;
                }
                this.zzc = i2;
                return i2;
            }
            i2 = 2;
        }
        this.zzc = i2;
        return i2;
    }
}
