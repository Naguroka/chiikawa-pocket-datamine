package androidx.media3.exoplayer.offline;

/* JADX INFO: loaded from: classes.dex */
public final class DownloadNotificationHelper {
    private static final int NULL_STRING_ID = 0;
    private final androidx.core.app.NotificationCompat.Builder notificationBuilder;

    public DownloadNotificationHelper(android.content.Context context, java.lang.String str) {
        this.notificationBuilder = new androidx.core.app.NotificationCompat.Builder(context.getApplicationContext(), str);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    public android.app.Notification buildProgressNotification(android.content.Context context, int i, android.app.PendingIntent pendingIntent, java.lang.String str, java.util.List<androidx.media3.exoplayer.offline.Download> list, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        boolean z2;
        float percentDownloaded;
        boolean z3;
        float f = 0.0f;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        int i8 = 0;
        boolean z9 = true;
        for (int i9 = 0; i9 < list.size(); i9++) {
            androidx.media3.exoplayer.offline.Download download = list.get(i9);
            int i10 = download.state;
            if (i10 == 0) {
                z6 = true;
            } else if (i10 == 2) {
                percentDownloaded = download.getPercentDownloaded();
                if (percentDownloaded != -1.0f) {
                    f += percentDownloaded;
                    z9 = false;
                }
                if (download.getBytesDownloaded() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z7 |= z3;
                i8++;
                z5 = true;
            } else if (i10 == 5) {
                z8 = true;
            } else if (i10 == 7) {
                percentDownloaded = download.getPercentDownloaded();
                if (percentDownloaded != -1.0f) {
                    f += percentDownloaded;
                    z9 = false;
                }
                if (download.getBytesDownloaded() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z7 |= z3;
                i8++;
                z5 = true;
            }
        }
        if (z5) {
            i4 = androidx.media3.exoplayer.R.string.exo_download_downloading;
        } else {
            if (!z6 || i2 == 0) {
                if (z8) {
                    i4 = androidx.media3.exoplayer.R.string.exo_download_removing;
                } else {
                    i3 = 0;
                }
                z = true;
            } else {
                if ((i2 & 2) != 0) {
                    i5 = androidx.media3.exoplayer.R.string.exo_download_paused_for_wifi;
                } else if ((i2 & 1) != 0) {
                    i5 = androidx.media3.exoplayer.R.string.exo_download_paused_for_network;
                } else {
                    i5 = androidx.media3.exoplayer.R.string.exo_download_paused;
                }
                i3 = i5;
                z = false;
            }
            if (z) {
                if (z5) {
                    int i11 = (int) (f / i8);
                    if (z9 && z7) {
                        z4 = true;
                    }
                    i7 = i11;
                    z2 = z4;
                } else {
                    i7 = 0;
                    z2 = true;
                }
                i6 = 100;
            } else {
                i6 = 0;
                i7 = 0;
                z2 = false;
            }
            return buildNotification(context, i, pendingIntent, str, i3, i6, i7, z2, true, false);
        }
        i3 = i4;
        z = true;
        if (z) {
            if (z5) {
                int i12 = (int) (f / i8);
                if (z9) {
                    z4 = true;
                }
                i7 = i12;
                z2 = z4;
            } else {
                i7 = 0;
                z2 = true;
            }
            i6 = 100;
        } else {
            i6 = 0;
            i7 = 0;
            z2 = false;
        }
        return buildNotification(context, i, pendingIntent, str, i3, i6, i7, z2, true, false);
    }

    public android.app.Notification buildDownloadCompletedNotification(android.content.Context context, int i, android.app.PendingIntent pendingIntent, java.lang.String str) {
        return buildEndStateNotification(context, i, pendingIntent, str, androidx.media3.exoplayer.R.string.exo_download_completed);
    }

    public android.app.Notification buildDownloadFailedNotification(android.content.Context context, int i, android.app.PendingIntent pendingIntent, java.lang.String str) {
        return buildEndStateNotification(context, i, pendingIntent, str, androidx.media3.exoplayer.R.string.exo_download_failed);
    }

    private android.app.Notification buildEndStateNotification(android.content.Context context, int i, android.app.PendingIntent pendingIntent, java.lang.String str, int i2) {
        return buildNotification(context, i, pendingIntent, str, i2, 0, 0, false, false, true);
    }

    private android.app.Notification buildNotification(android.content.Context context, int i, android.app.PendingIntent pendingIntent, java.lang.String str, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.notificationBuilder.setSmallIcon(i);
        this.notificationBuilder.setContentTitle(i2 == 0 ? null : context.getResources().getString(i2));
        this.notificationBuilder.setContentIntent(pendingIntent);
        this.notificationBuilder.setStyle(str != null ? new androidx.core.app.NotificationCompat.BigTextStyle().bigText(str) : null);
        this.notificationBuilder.setProgress(i3, i4, z);
        this.notificationBuilder.setOngoing(z2);
        this.notificationBuilder.setShowWhen(z3);
        if (androidx.media3.common.util.Util.SDK_INT >= 31) {
            androidx.media3.exoplayer.offline.DownloadNotificationHelper.Api31.setForegroundServiceBehavior(this.notificationBuilder);
        }
        return this.notificationBuilder.build();
    }

    private static final class Api31 {
        private Api31() {
        }

        public static void setForegroundServiceBehavior(androidx.core.app.NotificationCompat.Builder builder) {
            builder.setForegroundServiceBehavior(1);
        }
    }
}
