package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzelq implements com.google.android.gms.internal.ads.zzetq {
    public final android.content.Context zza;
    public final com.google.android.gms.ads.internal.client.zzs zzb;
    public final java.util.List zzc;

    public zzelq(android.content.Context context, com.google.android.gms.ads.internal.client.zzs zzsVar, java.util.List list) {
        this.zza = context;
        this.zzb = zzsVar;
        this.zzc = list;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks;
        android.app.ActivityManager.RunningTaskInfo runningTaskInfo;
        com.google.android.gms.internal.ads.zzcuv zzcuvVar = (com.google.android.gms.internal.ads.zzcuv) obj;
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeo.zza.zze()).booleanValue()) {
            android.os.Bundle bundle = new android.os.Bundle();
            com.google.android.gms.ads.internal.zzv.zzq();
            java.lang.String className = null;
            try {
                android.app.ActivityManager activityManager = (android.app.ActivityManager) this.zza.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                    className = runningTaskInfo.topActivity.getClassName();
                }
            } catch (java.lang.Exception unused) {
            }
            bundle.putString("activity", className);
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("width", this.zzb.zze);
            bundle2.putInt("height", this.zzb.zzb);
            bundle.putBundle("size", bundle2);
            if (!this.zzc.isEmpty()) {
                java.util.List list = this.zzc;
                bundle.putParcelableArray("parents", (android.os.Parcelable[]) list.toArray(new android.os.Parcelable[list.size()]));
            }
            zzcuvVar.zza.putBundle("view_hierarchy", bundle);
        }
    }
}
