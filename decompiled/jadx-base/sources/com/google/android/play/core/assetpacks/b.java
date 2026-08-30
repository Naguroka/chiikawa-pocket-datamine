package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class b extends com.google.android.play.core.assetpacks.internal.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final android.app.NotificationManager f2146a;
    private final com.google.android.play.core.assetpacks.internal.o b = new com.google.android.play.core.assetpacks.internal.o("AssetPackExtractionService");
    private final android.content.Context c;
    private final com.google.android.play.core.assetpacks.bh d;
    private final com.google.android.play.core.assetpacks.l e;
    private final com.google.android.play.core.assetpacks.ci f;

    b(android.content.Context context, com.google.android.play.core.assetpacks.bh bhVar, com.google.android.play.core.assetpacks.l lVar, com.google.android.play.core.assetpacks.ci ciVar) {
        this.c = context;
        this.d = bhVar;
        this.e = lVar;
        this.f = ciVar;
        this.f2146a = (android.app.NotificationManager) context.getSystemService("notification");
    }

    private final synchronized void d(java.lang.String str) {
        if (str == null) {
            str = "File downloads by Play";
        }
        this.f2146a.createNotificationChannel(new android.app.NotificationChannel("playcore-assetpacks-service-notification-channel", str, 2));
    }

    private final synchronized void e(android.os.Bundle bundle, com.google.android.play.core.assetpacks.internal.k kVar) throws android.os.RemoteException {
        this.b.a("updateServiceState AIDL call", new java.lang.Object[0]);
        if (com.google.android.play.core.assetpacks.internal.ai.b(this.c) && com.google.android.play.core.assetpacks.internal.ai.a(this.c)) {
            int i = bundle.getInt("action_type");
            this.f.c(kVar);
            if (i != 1) {
                if (i == 2) {
                    this.e.g(false);
                    this.f.b();
                    return;
                } else {
                    this.b.b("Unknown action type received: %d", java.lang.Integer.valueOf(i));
                    kVar.d(new android.os.Bundle());
                    return;
                }
            }
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                d(bundle.getString("notification_channel_name"));
            }
            this.e.g(true);
            com.google.android.play.core.assetpacks.ci ciVar = this.f;
            java.lang.String string = bundle.getString("notification_title");
            java.lang.String string2 = bundle.getString("notification_subtext");
            long j = bundle.getLong("notification_timeout", com.bytedance.sdk.openadsdk.TTAdConstant.AD_MAX_EVENT_TIME);
            android.os.Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
            android.app.Notification.Builder timeoutAfter = android.os.Build.VERSION.SDK_INT >= 26 ? new android.app.Notification.Builder(this.c, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j) : new android.app.Notification.Builder(this.c).setPriority(-2);
            if (parcelable instanceof android.app.PendingIntent) {
                timeoutAfter.setContentIntent((android.app.PendingIntent) parcelable);
            }
            android.app.Notification.Builder ongoing = timeoutAfter.setSmallIcon(android.R.drawable.stat_sys_download).setOngoing(false);
            if (string == null) {
                string = "Downloading additional file";
            }
            android.app.Notification.Builder contentTitle = ongoing.setContentTitle(string);
            if (string2 == null) {
                string2 = "Transferring";
            }
            contentTitle.setSubText(string2);
            int i2 = bundle.getInt("notification_color");
            if (i2 != 0) {
                timeoutAfter.setColor(i2).setVisibility(-1);
            }
            ciVar.a(timeoutAfter.build());
            this.c.bindService(new android.content.Intent(this.c, (java.lang.Class<?>) com.google.android.play.core.assetpacks.ExtractionForegroundService.class), this.f, 1);
            return;
        }
        kVar.d(new android.os.Bundle());
    }

    @Override // com.google.android.play.core.assetpacks.internal.j
    public final void b(android.os.Bundle bundle, com.google.android.play.core.assetpacks.internal.k kVar) throws android.os.RemoteException {
        this.b.a("clearAssetPackStorage AIDL call", new java.lang.Object[0]);
        if (!com.google.android.play.core.assetpacks.internal.ai.b(this.c) || !com.google.android.play.core.assetpacks.internal.ai.a(this.c)) {
            kVar.d(new android.os.Bundle());
        } else {
            this.d.z();
            kVar.c(new android.os.Bundle());
        }
    }

    @Override // com.google.android.play.core.assetpacks.internal.j
    public final void c(android.os.Bundle bundle, com.google.android.play.core.assetpacks.internal.k kVar) throws android.os.RemoteException {
        e(bundle, kVar);
    }
}
