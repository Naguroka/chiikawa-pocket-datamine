package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public class MediaStyleNotificationHelper {
    public static final java.lang.String EXTRA_MEDIA3_SESSION = "androidx.media3.session";

    private MediaStyleNotificationHelper() {
    }

    public static class MediaStyle extends androidx.core.app.NotificationCompat.Style {
        private static final int MAX_MEDIA_BUTTONS = 5;
        private static final int MAX_MEDIA_BUTTONS_IN_COMPACT = 3;
        int[] actionsToShowInCompact;
        android.app.PendingIntent cancelButtonIntent;
        int remoteDeviceIconRes;
        android.app.PendingIntent remoteDeviceIntent;
        java.lang.CharSequence remoteDeviceName;
        final androidx.media3.session.MediaSession session;
        private boolean showCancelButton;

        public androidx.media3.session.MediaStyleNotificationHelper.MediaStyle setShowCancelButton(boolean z) {
            return this;
        }

        public static androidx.media3.session.SessionToken getSessionToken(android.app.Notification notification) {
            android.os.Bundle bundle;
            android.os.Bundle extras = androidx.core.app.NotificationCompat.getExtras(notification);
            if (extras == null || (bundle = extras.getBundle(androidx.media3.session.MediaStyleNotificationHelper.EXTRA_MEDIA3_SESSION)) == null) {
                return null;
            }
            return androidx.media3.session.SessionToken.fromBundle(bundle);
        }

        public MediaStyle(androidx.media3.session.MediaSession mediaSession) {
            this.session = mediaSession;
        }

        public androidx.media3.session.MediaStyleNotificationHelper.MediaStyle setShowActionsInCompactView(int... iArr) {
            this.actionsToShowInCompact = iArr;
            return this;
        }

        public androidx.media3.session.MediaStyleNotificationHelper.MediaStyle setCancelButtonIntent(android.app.PendingIntent pendingIntent) {
            this.cancelButtonIntent = pendingIntent;
            return this;
        }

        public androidx.media3.session.MediaStyleNotificationHelper.MediaStyle setRemotePlaybackInfo(java.lang.CharSequence charSequence, int i, android.app.PendingIntent pendingIntent) {
            androidx.media3.common.util.Assertions.checkArgument(charSequence != null);
            this.remoteDeviceName = charSequence;
            this.remoteDeviceIconRes = i;
            this.remoteDeviceIntent = pendingIntent;
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (androidx.media3.common.util.Util.SDK_INT >= 34 && this.remoteDeviceName != null) {
                androidx.media3.session.MediaStyleNotificationHelper.Api21Impl.setMediaStyle(notificationBuilderWithBuilderAccessor.getBuilder(), androidx.media3.session.MediaStyleNotificationHelper.Api21Impl.fillInMediaStyle(androidx.media3.session.MediaStyleNotificationHelper.Api34Impl.setRemotePlaybackInfo(androidx.media3.session.MediaStyleNotificationHelper.Api21Impl.createMediaStyle(), this.remoteDeviceName, this.remoteDeviceIconRes, this.remoteDeviceIntent), this.actionsToShowInCompact, this.session));
                return;
            }
            if (androidx.media3.common.util.Util.SDK_INT >= 21) {
                androidx.media3.session.MediaStyleNotificationHelper.Api21Impl.setMediaStyle(notificationBuilderWithBuilderAccessor.getBuilder(), androidx.media3.session.MediaStyleNotificationHelper.Api21Impl.fillInMediaStyle(androidx.media3.session.MediaStyleNotificationHelper.Api21Impl.createMediaStyle(), this.actionsToShowInCompact, this.session));
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBundle(androidx.media3.session.MediaStyleNotificationHelper.EXTRA_MEDIA3_SESSION, this.session.getToken().toBundle());
                notificationBuilderWithBuilderAccessor.getBuilder().addExtras(bundle);
                return;
            }
            if (this.showCancelButton) {
                notificationBuilderWithBuilderAccessor.getBuilder().setOngoing(true);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (androidx.media3.common.util.Util.SDK_INT >= 21) {
                return null;
            }
            return generateContentView();
        }

        android.widget.RemoteViews generateContentView() {
            android.widget.RemoteViews remoteViewsApplyStandardTemplate = applyStandardTemplate(false, getContentViewLayoutResource(), true);
            int size = this.mBuilder.mActions.size();
            int[] iArr = this.actionsToShowInCompact;
            if (iArr != null) {
                int iMin = java.lang.Math.min(iArr.length, 3);
                remoteViewsApplyStandardTemplate.removeAllViews(androidx.media3.session.R.id.media_actions);
                if (iMin > 0) {
                    for (int i = 0; i < iMin; i++) {
                        if (i >= size) {
                            throw new java.lang.IllegalArgumentException(java.lang.String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(size - 1)));
                        }
                        remoteViewsApplyStandardTemplate.addView(androidx.media3.session.R.id.media_actions, generateMediaActionButton(this.mBuilder.mActions.get(iArr[i])));
                    }
                }
            }
            if (this.showCancelButton) {
                remoteViewsApplyStandardTemplate.setViewVisibility(androidx.media3.session.R.id.end_padder, 8);
                remoteViewsApplyStandardTemplate.setViewVisibility(androidx.media3.session.R.id.cancel_action, 0);
                remoteViewsApplyStandardTemplate.setOnClickPendingIntent(androidx.media3.session.R.id.cancel_action, this.cancelButtonIntent);
                remoteViewsApplyStandardTemplate.setInt(androidx.media3.session.R.id.cancel_action, "setAlpha", this.mBuilder.mContext.getResources().getInteger(androidx.media3.session.R.integer.cancel_button_image_alpha));
            } else {
                remoteViewsApplyStandardTemplate.setViewVisibility(androidx.media3.session.R.id.end_padder, 0);
                remoteViewsApplyStandardTemplate.setViewVisibility(androidx.media3.session.R.id.cancel_action, 8);
            }
            return remoteViewsApplyStandardTemplate;
        }

        private android.widget.RemoteViews generateMediaActionButton(androidx.core.app.NotificationCompat.Action action) {
            boolean z = action.getActionIntent() == null;
            android.widget.RemoteViews remoteViews = new android.widget.RemoteViews(this.mBuilder.mContext.getPackageName(), androidx.media3.session.R.layout.media3_notification_media_action);
            androidx.core.graphics.drawable.IconCompat iconCompat = action.getIconCompat();
            if (iconCompat != null) {
                remoteViews.setImageViewResource(androidx.media3.session.R.id.action0, iconCompat.getResId());
            }
            if (!z) {
                remoteViews.setOnClickPendingIntent(androidx.media3.session.R.id.action0, action.getActionIntent());
            }
            remoteViews.setContentDescription(androidx.media3.session.R.id.action0, action.getTitle());
            return remoteViews;
        }

        int getContentViewLayoutResource() {
            return androidx.media3.session.R.layout.media3_notification_template_media;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeBigContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (androidx.media3.common.util.Util.SDK_INT >= 21) {
                return null;
            }
            return generateBigContentView();
        }

        android.widget.RemoteViews generateBigContentView() {
            int iMin = java.lang.Math.min(this.mBuilder.mActions.size(), 5);
            android.widget.RemoteViews remoteViewsApplyStandardTemplate = applyStandardTemplate(false, getBigContentViewLayoutResource(iMin), false);
            remoteViewsApplyStandardTemplate.removeAllViews(androidx.media3.session.R.id.media_actions);
            if (iMin > 0) {
                for (int i = 0; i < iMin; i++) {
                    remoteViewsApplyStandardTemplate.addView(androidx.media3.session.R.id.media_actions, generateMediaActionButton(this.mBuilder.mActions.get(i)));
                }
            }
            if (this.showCancelButton) {
                remoteViewsApplyStandardTemplate.setViewVisibility(androidx.media3.session.R.id.cancel_action, 0);
                remoteViewsApplyStandardTemplate.setInt(androidx.media3.session.R.id.cancel_action, "setAlpha", this.mBuilder.mContext.getResources().getInteger(androidx.media3.session.R.integer.cancel_button_image_alpha));
                remoteViewsApplyStandardTemplate.setOnClickPendingIntent(androidx.media3.session.R.id.cancel_action, this.cancelButtonIntent);
            } else {
                remoteViewsApplyStandardTemplate.setViewVisibility(androidx.media3.session.R.id.cancel_action, 8);
            }
            return remoteViewsApplyStandardTemplate;
        }

        int getBigContentViewLayoutResource(int i) {
            if (i <= 3) {
                return androidx.media3.session.R.layout.media3_notification_template_big_media_narrow;
            }
            return androidx.media3.session.R.layout.media3_notification_template_big_media;
        }
    }

    public static class DecoratedMediaCustomViewStyle extends androidx.media3.session.MediaStyleNotificationHelper.MediaStyle {
        public DecoratedMediaCustomViewStyle(androidx.media3.session.MediaSession mediaSession) {
            super(mediaSession);
        }

        @Override // androidx.media3.session.MediaStyleNotificationHelper.MediaStyle, androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (androidx.media3.common.util.Util.SDK_INT >= 34 && this.remoteDeviceName != null) {
                androidx.media3.session.MediaStyleNotificationHelper.Api21Impl.setMediaStyle(notificationBuilderWithBuilderAccessor.getBuilder(), androidx.media3.session.MediaStyleNotificationHelper.Api21Impl.fillInMediaStyle(androidx.media3.session.MediaStyleNotificationHelper.Api34Impl.setRemotePlaybackInfo(androidx.media3.session.MediaStyleNotificationHelper.Api24Impl.createDecoratedMediaCustomViewStyle(), this.remoteDeviceName, this.remoteDeviceIconRes, this.remoteDeviceIntent), this.actionsToShowInCompact, this.session));
                return;
            }
            if (androidx.media3.common.util.Util.SDK_INT >= 24) {
                androidx.media3.session.MediaStyleNotificationHelper.Api21Impl.setMediaStyle(notificationBuilderWithBuilderAccessor.getBuilder(), androidx.media3.session.MediaStyleNotificationHelper.Api21Impl.fillInMediaStyle(androidx.media3.session.MediaStyleNotificationHelper.Api24Impl.createDecoratedMediaCustomViewStyle(), this.actionsToShowInCompact, this.session));
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBundle(androidx.media3.session.MediaStyleNotificationHelper.EXTRA_MEDIA3_SESSION, this.session.getToken().toBundle());
                notificationBuilderWithBuilderAccessor.getBuilder().addExtras(bundle);
                return;
            }
            super.apply(notificationBuilderWithBuilderAccessor);
        }

        @Override // androidx.media3.session.MediaStyleNotificationHelper.MediaStyle, androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (androidx.media3.common.util.Util.SDK_INT >= 24) {
                return null;
            }
            boolean z = true;
            boolean z2 = this.mBuilder.getContentView() != null;
            if (androidx.media3.common.util.Util.SDK_INT >= 21) {
                if (!z2 && this.mBuilder.getBigContentView() == null) {
                    z = false;
                }
                if (z) {
                    android.widget.RemoteViews remoteViewsGenerateContentView = generateContentView();
                    if (z2) {
                        buildIntoRemoteViews(remoteViewsGenerateContentView, this.mBuilder.getContentView());
                    }
                    setBackgroundColor(remoteViewsGenerateContentView);
                    return remoteViewsGenerateContentView;
                }
            } else {
                android.widget.RemoteViews remoteViewsGenerateContentView2 = generateContentView();
                if (z2) {
                    buildIntoRemoteViews(remoteViewsGenerateContentView2, this.mBuilder.getContentView());
                    return remoteViewsGenerateContentView2;
                }
            }
            return null;
        }

        @Override // androidx.media3.session.MediaStyleNotificationHelper.MediaStyle
        int getContentViewLayoutResource() {
            if (this.mBuilder.getContentView() != null) {
                return androidx.media3.session.R.layout.media3_notification_template_media_custom;
            }
            return super.getContentViewLayoutResource();
        }

        @Override // androidx.media3.session.MediaStyleNotificationHelper.MediaStyle, androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeBigContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            android.widget.RemoteViews contentView;
            if (androidx.media3.common.util.Util.SDK_INT >= 24) {
                return null;
            }
            if (this.mBuilder.getBigContentView() != null) {
                contentView = this.mBuilder.getBigContentView();
            } else {
                contentView = this.mBuilder.getContentView();
            }
            if (contentView == null) {
                return null;
            }
            android.widget.RemoteViews remoteViewsGenerateBigContentView = generateBigContentView();
            buildIntoRemoteViews(remoteViewsGenerateBigContentView, contentView);
            if (androidx.media3.common.util.Util.SDK_INT >= 21) {
                setBackgroundColor(remoteViewsGenerateBigContentView);
            }
            return remoteViewsGenerateBigContentView;
        }

        @Override // androidx.media3.session.MediaStyleNotificationHelper.MediaStyle
        int getBigContentViewLayoutResource(int i) {
            if (i <= 3) {
                return androidx.media3.session.R.layout.media3_notification_template_big_media_narrow_custom;
            }
            return androidx.media3.session.R.layout.media3_notification_template_big_media_custom;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeHeadsUpContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            android.widget.RemoteViews contentView;
            if (androidx.media3.common.util.Util.SDK_INT >= 24) {
                return null;
            }
            if (this.mBuilder.getHeadsUpContentView() != null) {
                contentView = this.mBuilder.getHeadsUpContentView();
            } else {
                contentView = this.mBuilder.getContentView();
            }
            if (contentView == null) {
                return null;
            }
            android.widget.RemoteViews remoteViewsGenerateBigContentView = generateBigContentView();
            buildIntoRemoteViews(remoteViewsGenerateBigContentView, contentView);
            if (androidx.media3.common.util.Util.SDK_INT >= 21) {
                setBackgroundColor(remoteViewsGenerateBigContentView);
            }
            return remoteViewsGenerateBigContentView;
        }

        private void setBackgroundColor(android.widget.RemoteViews remoteViews) {
            int color;
            if (this.mBuilder.getColor() != 0) {
                color = this.mBuilder.getColor();
            } else {
                color = this.mBuilder.mContext.getResources().getColor(androidx.media3.session.R.color.notification_material_background_media_default_color);
            }
            remoteViews.setInt(androidx.media3.session.R.id.status_bar_latest_event_content, "setBackgroundColor", color);
        }
    }

    private static class Api21Impl {
        private Api21Impl() {
        }

        static void setMediaStyle(android.app.Notification.Builder builder, android.app.Notification.MediaStyle mediaStyle) {
            builder.setStyle(mediaStyle);
        }

        public static android.app.Notification.MediaStyle createMediaStyle() {
            return new android.app.Notification.MediaStyle();
        }

        public static android.app.Notification.MediaStyle fillInMediaStyle(android.app.Notification.MediaStyle mediaStyle, int[] iArr, androidx.media3.session.MediaSession mediaSession) {
            androidx.media3.common.util.Assertions.checkNotNull(mediaStyle);
            androidx.media3.common.util.Assertions.checkNotNull(mediaSession);
            if (iArr != null) {
                setShowActionsInCompactView(mediaStyle, iArr);
            }
            mediaStyle.setMediaSession((android.media.session.MediaSession.Token) mediaSession.getSessionCompat().getSessionToken().getToken());
            return mediaStyle;
        }

        public static void setShowActionsInCompactView(android.app.Notification.MediaStyle mediaStyle, int... iArr) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
    }

    private static class Api24Impl {
        private Api24Impl() {
        }

        public static android.app.Notification.DecoratedMediaCustomViewStyle createDecoratedMediaCustomViewStyle() {
            return new android.app.Notification.DecoratedMediaCustomViewStyle();
        }
    }

    private static class Api34Impl {
        private Api34Impl() {
        }

        public static android.app.Notification.MediaStyle setRemotePlaybackInfo(android.app.Notification.MediaStyle mediaStyle, java.lang.CharSequence charSequence, int i, android.app.PendingIntent pendingIntent) {
            mediaStyle.setRemotePlaybackInfo(charSequence, i, pendingIntent);
            return mediaStyle;
        }
    }
}
