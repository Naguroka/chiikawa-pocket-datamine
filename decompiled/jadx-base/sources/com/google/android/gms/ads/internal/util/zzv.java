package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzv extends com.google.android.gms.ads.internal.util.zzu {
    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final android.content.Intent zzf(android.app.Activity activity) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final com.google.android.gms.internal.ads.zzbbq.zzq zzg(android.content.Context context, android.telephony.TelephonyManager telephonyManager) {
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzB(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return telephonyManager.isDataEnabled() ? com.google.android.gms.internal.ads.zzbbq.zzq.ENUM_TRUE : com.google.android.gms.internal.ads.zzbbq.zzq.ENUM_FALSE;
        }
        return com.google.android.gms.internal.ads.zzbbq.zzq.ENUM_FALSE;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final void zzh(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzir)).intValue());
        notificationChannel.setShowBadge(false);
        ((android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class)).createNotificationChannel(notificationChannel);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final boolean zzi(android.content.Context context, java.lang.String str) {
        android.app.NotificationChannel notificationChannel = ((android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }
}
