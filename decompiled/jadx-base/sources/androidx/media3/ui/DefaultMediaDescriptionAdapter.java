package androidx.media3.ui;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultMediaDescriptionAdapter implements androidx.media3.ui.PlayerNotificationManager.MediaDescriptionAdapter {
    private final android.app.PendingIntent pendingIntent;

    public DefaultMediaDescriptionAdapter(android.app.PendingIntent pendingIntent) {
        this.pendingIntent = pendingIntent;
    }

    @Override // androidx.media3.ui.PlayerNotificationManager.MediaDescriptionAdapter
    public java.lang.CharSequence getCurrentContentTitle(androidx.media3.common.Player player) {
        if (!player.isCommandAvailable(18)) {
            return "";
        }
        java.lang.CharSequence charSequence = player.getMediaMetadata().displayTitle;
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        java.lang.CharSequence charSequence2 = player.getMediaMetadata().title;
        return charSequence2 != null ? charSequence2 : "";
    }

    @Override // androidx.media3.ui.PlayerNotificationManager.MediaDescriptionAdapter
    public android.app.PendingIntent createCurrentContentIntent(androidx.media3.common.Player player) {
        return this.pendingIntent;
    }

    @Override // androidx.media3.ui.PlayerNotificationManager.MediaDescriptionAdapter
    public java.lang.CharSequence getCurrentContentText(androidx.media3.common.Player player) {
        if (!player.isCommandAvailable(18)) {
            return null;
        }
        java.lang.CharSequence charSequence = player.getMediaMetadata().artist;
        return !android.text.TextUtils.isEmpty(charSequence) ? charSequence : player.getMediaMetadata().albumArtist;
    }

    @Override // androidx.media3.ui.PlayerNotificationManager.MediaDescriptionAdapter
    public android.graphics.Bitmap getCurrentLargeIcon(androidx.media3.common.Player player, androidx.media3.ui.PlayerNotificationManager.BitmapCallback bitmapCallback) {
        byte[] bArr;
        if (player.isCommandAvailable(18) && (bArr = player.getMediaMetadata().artworkData) != null) {
            return android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        return null;
    }
}
