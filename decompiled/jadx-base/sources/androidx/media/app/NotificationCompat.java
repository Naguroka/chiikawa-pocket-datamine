package androidx.media.app;

/* JADX INFO: loaded from: classes.dex */
public class NotificationCompat {
    private NotificationCompat() {
    }

    public static class MediaStyle extends androidx.core.app.NotificationCompat.Style {
        private static final int MAX_MEDIA_BUTTONS = 5;
        private static final int MAX_MEDIA_BUTTONS_IN_COMPACT = 3;
        android.app.PendingIntent mCancelButtonIntent;
        int mDeviceIcon;
        android.app.PendingIntent mDeviceIntent;
        java.lang.CharSequence mDeviceName;
        boolean mShowCancelButton;
        android.support.v4.media.session.MediaSessionCompat.Token mToken;
        int[] mActionsToShowInCompact = null;
        boolean mShowRemotePlaybackInfo = false;

        @Override // androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeBigContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        public androidx.media.app.NotificationCompat.MediaStyle setShowCancelButton(boolean z) {
            return this;
        }

        public static android.support.v4.media.session.MediaSessionCompat.Token getMediaSession(android.app.Notification notification) {
            android.os.Parcelable parcelable;
            android.os.Bundle extras = androidx.core.app.NotificationCompat.getExtras(notification);
            if (extras == null || (parcelable = extras.getParcelable(androidx.core.app.NotificationCompat.EXTRA_MEDIA_SESSION)) == null) {
                return null;
            }
            return android.support.v4.media.session.MediaSessionCompat.Token.fromToken(parcelable);
        }

        public MediaStyle() {
        }

        public MediaStyle(androidx.core.app.NotificationCompat.Builder builder) {
            setBuilder(builder);
        }

        public androidx.media.app.NotificationCompat.MediaStyle setShowActionsInCompactView(int... iArr) {
            this.mActionsToShowInCompact = iArr;
            return this;
        }

        public androidx.media.app.NotificationCompat.MediaStyle setMediaSession(android.support.v4.media.session.MediaSessionCompat.Token token) {
            this.mToken = token;
            return this;
        }

        public androidx.media.app.NotificationCompat.MediaStyle setRemotePlaybackInfo(java.lang.CharSequence charSequence, int i, android.app.PendingIntent pendingIntent) {
            this.mDeviceName = charSequence;
            this.mDeviceIcon = i;
            this.mDeviceIntent = pendingIntent;
            this.mShowRemotePlaybackInfo = true;
            return this;
        }

        public androidx.media.app.NotificationCompat.MediaStyle setCancelButtonIntent(android.app.PendingIntent pendingIntent) {
            this.mCancelButtonIntent = pendingIntent;
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                androidx.media.app.NotificationCompat.Api21Impl.setMediaStyle(notificationBuilderWithBuilderAccessor.getBuilder(), androidx.media.app.NotificationCompat.Api21Impl.fillInMediaStyle(androidx.media.app.NotificationCompat.Api34Impl.setRemotePlaybackInfo(androidx.media.app.NotificationCompat.Api21Impl.createMediaStyle(), this.mDeviceName, this.mDeviceIcon, this.mDeviceIntent, java.lang.Boolean.valueOf(this.mShowRemotePlaybackInfo)), this.mActionsToShowInCompact, this.mToken));
            } else {
                androidx.media.app.NotificationCompat.Api21Impl.setMediaStyle(notificationBuilderWithBuilderAccessor.getBuilder(), androidx.media.app.NotificationCompat.Api21Impl.fillInMediaStyle(androidx.media.app.NotificationCompat.Api21Impl.createMediaStyle(), this.mActionsToShowInCompact, this.mToken));
            }
        }

        android.widget.RemoteViews generateContentView() {
            android.widget.RemoteViews remoteViewsApplyStandardTemplate = applyStandardTemplate(false, getContentViewLayoutResource(), true);
            int size = this.mBuilder.mActions.size();
            int[] iArr = this.mActionsToShowInCompact;
            int iMin = iArr == null ? 0 : java.lang.Math.min(iArr.length, 3);
            remoteViewsApplyStandardTemplate.removeAllViews(androidx.media.R.id.media_actions);
            if (iMin > 0) {
                for (int i = 0; i < iMin; i++) {
                    if (i >= size) {
                        throw new java.lang.IllegalArgumentException(java.lang.String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(size - 1)));
                    }
                    remoteViewsApplyStandardTemplate.addView(androidx.media.R.id.media_actions, generateMediaActionButton(this.mBuilder.mActions.get(this.mActionsToShowInCompact[i])));
                }
            }
            if (this.mShowCancelButton) {
                remoteViewsApplyStandardTemplate.setViewVisibility(androidx.media.R.id.end_padder, 8);
                remoteViewsApplyStandardTemplate.setViewVisibility(androidx.media.R.id.cancel_action, 0);
                remoteViewsApplyStandardTemplate.setOnClickPendingIntent(androidx.media.R.id.cancel_action, this.mCancelButtonIntent);
                remoteViewsApplyStandardTemplate.setInt(androidx.media.R.id.cancel_action, "setAlpha", this.mBuilder.mContext.getResources().getInteger(androidx.media.R.integer.cancel_button_image_alpha));
            } else {
                remoteViewsApplyStandardTemplate.setViewVisibility(androidx.media.R.id.end_padder, 0);
                remoteViewsApplyStandardTemplate.setViewVisibility(androidx.media.R.id.cancel_action, 8);
            }
            return remoteViewsApplyStandardTemplate;
        }

        private android.widget.RemoteViews generateMediaActionButton(androidx.core.app.NotificationCompat.Action action) {
            boolean z = action.getActionIntent() == null;
            android.widget.RemoteViews remoteViews = new android.widget.RemoteViews(this.mBuilder.mContext.getPackageName(), androidx.media.R.layout.notification_media_action);
            remoteViews.setImageViewResource(androidx.media.R.id.action0, action.getIcon());
            if (!z) {
                remoteViews.setOnClickPendingIntent(androidx.media.R.id.action0, action.getActionIntent());
            }
            androidx.media.app.NotificationCompat.Api15Impl.setContentDescription(remoteViews, androidx.media.R.id.action0, action.getTitle());
            return remoteViews;
        }

        int getContentViewLayoutResource() {
            return androidx.media.R.layout.notification_template_media;
        }

        android.widget.RemoteViews generateBigContentView() {
            int iMin = java.lang.Math.min(this.mBuilder.mActions.size(), 5);
            android.widget.RemoteViews remoteViewsApplyStandardTemplate = applyStandardTemplate(false, getBigContentViewLayoutResource(iMin), false);
            remoteViewsApplyStandardTemplate.removeAllViews(androidx.media.R.id.media_actions);
            if (iMin > 0) {
                for (int i = 0; i < iMin; i++) {
                    remoteViewsApplyStandardTemplate.addView(androidx.media.R.id.media_actions, generateMediaActionButton(this.mBuilder.mActions.get(i)));
                }
            }
            if (this.mShowCancelButton) {
                remoteViewsApplyStandardTemplate.setViewVisibility(androidx.media.R.id.cancel_action, 0);
                remoteViewsApplyStandardTemplate.setInt(androidx.media.R.id.cancel_action, "setAlpha", this.mBuilder.mContext.getResources().getInteger(androidx.media.R.integer.cancel_button_image_alpha));
                remoteViewsApplyStandardTemplate.setOnClickPendingIntent(androidx.media.R.id.cancel_action, this.mCancelButtonIntent);
            } else {
                remoteViewsApplyStandardTemplate.setViewVisibility(androidx.media.R.id.cancel_action, 8);
            }
            return remoteViewsApplyStandardTemplate;
        }

        int getBigContentViewLayoutResource(int i) {
            if (i <= 3) {
                return androidx.media.R.layout.notification_template_big_media_narrow;
            }
            return androidx.media.R.layout.notification_template_big_media;
        }
    }

    public static class DecoratedMediaCustomViewStyle extends androidx.media.app.NotificationCompat.MediaStyle {
        @Override // androidx.media.app.NotificationCompat.MediaStyle, androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeBigContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // androidx.media.app.NotificationCompat.MediaStyle, androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeHeadsUpContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // androidx.media.app.NotificationCompat.MediaStyle, androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                androidx.media.app.NotificationCompat.Api21Impl.setMediaStyle(notificationBuilderWithBuilderAccessor.getBuilder(), androidx.media.app.NotificationCompat.Api21Impl.fillInMediaStyle(androidx.media.app.NotificationCompat.Api34Impl.setRemotePlaybackInfo(androidx.media.app.NotificationCompat.Api24Impl.createDecoratedMediaCustomViewStyle(), this.mDeviceName, this.mDeviceIcon, this.mDeviceIntent, java.lang.Boolean.valueOf(this.mShowRemotePlaybackInfo)), this.mActionsToShowInCompact, this.mToken));
            } else {
                androidx.media.app.NotificationCompat.Api21Impl.setMediaStyle(notificationBuilderWithBuilderAccessor.getBuilder(), androidx.media.app.NotificationCompat.Api21Impl.fillInMediaStyle(androidx.media.app.NotificationCompat.Api24Impl.createDecoratedMediaCustomViewStyle(), this.mActionsToShowInCompact, this.mToken));
            }
        }

        @Override // androidx.media.app.NotificationCompat.MediaStyle
        int getContentViewLayoutResource() {
            if (this.mBuilder.getContentView() != null) {
                return androidx.media.R.layout.notification_template_media_custom;
            }
            return super.getContentViewLayoutResource();
        }

        @Override // androidx.media.app.NotificationCompat.MediaStyle
        int getBigContentViewLayoutResource(int i) {
            if (i <= 3) {
                return androidx.media.R.layout.notification_template_big_media_narrow_custom;
            }
            return androidx.media.R.layout.notification_template_big_media_custom;
        }

        private void setBackgroundColor(android.widget.RemoteViews remoteViews) {
            int color;
            if (this.mBuilder.getColor() != 0) {
                color = this.mBuilder.getColor();
            } else {
                color = this.mBuilder.mContext.getResources().getColor(androidx.media.R.color.notification_material_background_media_default_color);
            }
            remoteViews.setInt(androidx.media.R.id.status_bar_latest_event_content, "setBackgroundColor", color);
        }
    }

    private static class Api15Impl {
        private Api15Impl() {
        }

        static void setContentDescription(android.widget.RemoteViews remoteViews, int i, java.lang.CharSequence charSequence) {
            remoteViews.setContentDescription(i, charSequence);
        }
    }

    private static class Api21Impl {
        private Api21Impl() {
        }

        static void setMediaStyle(android.app.Notification.Builder builder, android.app.Notification.MediaStyle mediaStyle) {
            builder.setStyle(mediaStyle);
        }

        static android.app.Notification.MediaStyle createMediaStyle() {
            return new android.app.Notification.MediaStyle();
        }

        static android.app.Notification.MediaStyle fillInMediaStyle(android.app.Notification.MediaStyle mediaStyle, int[] iArr, android.support.v4.media.session.MediaSessionCompat.Token token) {
            if (iArr != null) {
                setShowActionsInCompactView(mediaStyle, iArr);
            }
            if (token != null) {
                setMediaSession(mediaStyle, (android.media.session.MediaSession.Token) token.getToken());
            }
            return mediaStyle;
        }

        static void setShowActionsInCompactView(android.app.Notification.MediaStyle mediaStyle, int... iArr) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }

        static void setMediaSession(android.app.Notification.MediaStyle mediaStyle, android.media.session.MediaSession.Token token) {
            mediaStyle.setMediaSession(token);
        }
    }

    private static class Api24Impl {
        private Api24Impl() {
        }

        static android.app.Notification.MediaStyle createDecoratedMediaCustomViewStyle() {
            return new android.app.Notification.DecoratedMediaCustomViewStyle();
        }
    }

    private static class Api34Impl {
        private Api34Impl() {
        }

        static android.app.Notification.MediaStyle setRemotePlaybackInfo(android.app.Notification.MediaStyle mediaStyle, java.lang.CharSequence charSequence, int i, android.app.PendingIntent pendingIntent, java.lang.Boolean bool) {
            if (bool.booleanValue()) {
                mediaStyle.setRemotePlaybackInfo(charSequence, i, pendingIntent);
            }
            return mediaStyle;
        }
    }
}
