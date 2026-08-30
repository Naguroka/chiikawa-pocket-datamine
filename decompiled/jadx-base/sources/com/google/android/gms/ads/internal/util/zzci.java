package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzci {
    private boolean zzd;
    private android.content.Context zze;
    private boolean zzc = false;
    private final java.util.Map zzb = new java.util.WeakHashMap();
    private final android.content.BroadcastReceiver zza = new com.google.android.gms.ads.internal.util.zzch(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zze(android.content.Context context, android.content.Intent intent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : this.zzb.entrySet()) {
            if (((android.content.IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                arrayList.add((android.content.BroadcastReceiver) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((android.content.BroadcastReceiver) arrayList.get(i)).onReceive(context, intent);
        }
    }

    public final synchronized void zzb(android.content.Context context) {
        if (this.zzc) {
            return;
        }
        android.content.Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        if (applicationContext == null) {
            this.zze = context;
        }
        com.google.android.gms.internal.ads.zzbcl.zza(this.zze);
        this.zzd = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdU)).booleanValue();
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkR)).booleanValue() || android.os.Build.VERSION.SDK_INT < 33) {
            this.zze.registerReceiver(this.zza, intentFilter);
        } else {
            this.zze.registerReceiver(this.zza, intentFilter, 4);
        }
        this.zzc = true;
    }

    public final synchronized void zzc(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter) {
        if (this.zzd) {
            this.zzb.put(broadcastReceiver, intentFilter);
            return;
        }
        com.google.android.gms.internal.ads.zzbcl.zza(context);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkR)).booleanValue() || android.os.Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    public final synchronized void zzd(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver) {
        if (this.zzd) {
            this.zzb.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
