package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbbt {
    private final android.content.Context zza;

    public zzbbt(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context can not be null");
        this.zza = context;
    }

    public final boolean zza(android.content.Intent intent) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(intent, "Intent can not be null");
        return !this.zza.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public final boolean zzb() {
        return zza(new android.content.Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean zzc() {
        return ((java.lang.Boolean) com.google.android.gms.ads.internal.util.zzcd.zza(this.zza, new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzbbs
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return java.lang.Boolean.valueOf("mounted".equals(android.os.Environment.getExternalStorageState()));
            }
        })).booleanValue() && com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zza).checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
