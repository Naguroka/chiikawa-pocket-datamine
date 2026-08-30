package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final class CommandButton {
    public static final int ICON_ALBUM = 57369;
    public static final int ICON_ARTIST = 57370;
    public static final int ICON_BLOCK = 57675;
    public static final int ICON_BOOKMARK_FILLED = 1042534;
    public static final int ICON_BOOKMARK_UNFILLED = 59494;
    public static final int ICON_CHECK_CIRCLE_FILLED = 1042540;
    public static final int ICON_CHECK_CIRCLE_UNFILLED = 59500;
    public static final int ICON_CLOSED_CAPTIONS = 57372;
    public static final int ICON_CLOSED_CAPTIONS_OFF = 61916;
    public static final int ICON_FAST_FORWARD = 57375;
    public static final int ICON_FEED = 57573;
    public static final int ICON_FLAG_FILLED = 1040723;
    public static final int ICON_FLAG_UNFILLED = 57683;
    public static final int ICON_HEART_FILLED = 1042557;
    public static final int ICON_HEART_UNFILLED = 59517;
    public static final int ICON_MINUS = 57691;
    public static final int ICON_MINUS_CIRCLE_FILLED = 1040712;
    public static final int ICON_MINUS_CIRCLE_UNFILLED = 1040713;
    public static final int ICON_NEXT = 57412;
    public static final int ICON_PAUSE = 57396;
    public static final int ICON_PLAY = 57399;
    public static final int ICON_PLAYBACK_SPEED = 57448;
    public static final int ICON_PLAYBACK_SPEED_0_5 = 62690;
    public static final int ICON_PLAYBACK_SPEED_0_8 = 1045730;
    public static final int ICON_PLAYBACK_SPEED_1_0 = 61389;
    public static final int ICON_PLAYBACK_SPEED_1_2 = 62689;
    public static final int ICON_PLAYBACK_SPEED_1_5 = 62688;
    public static final int ICON_PLAYBACK_SPEED_1_8 = 1045728;
    public static final int ICON_PLAYBACK_SPEED_2_0 = 62699;
    public static final int ICON_PLAYLIST_ADD = 57403;
    public static final int ICON_PLAYLIST_REMOVE = 60288;
    public static final int ICON_PLUS = 57669;
    public static final int ICON_PLUS_CIRCLE_FILLED = 1040711;
    public static final int ICON_PLUS_CIRCLE_UNFILLED = 57671;
    public static final int ICON_PREVIOUS = 57413;
    public static final int ICON_QUALITY = 58409;
    public static final int ICON_QUEUE_ADD = 57436;
    public static final int ICON_QUEUE_NEXT = 57446;
    public static final int ICON_QUEUE_REMOVE = 57447;
    public static final int ICON_RADIO = 58654;
    public static final int ICON_REPEAT_ALL = 57408;
    public static final int ICON_REPEAT_OFF = 1040448;
    public static final int ICON_REPEAT_ONE = 57409;
    public static final int ICON_REWIND = 57376;
    public static final int ICON_SETTINGS = 59576;
    public static final int ICON_SHARE = 59405;
    public static final int ICON_SHUFFLE_OFF = 1040452;
    public static final int ICON_SHUFFLE_ON = 57411;
    public static final int ICON_SHUFFLE_STAR = 1040451;
    public static final int ICON_SIGNAL = 61512;
    public static final int ICON_SKIP_BACK = 57410;
    public static final int ICON_SKIP_BACK_10 = 57433;
    public static final int ICON_SKIP_BACK_15 = 1040473;
    public static final int ICON_SKIP_BACK_30 = 57434;
    public static final int ICON_SKIP_BACK_5 = 57435;
    public static final int ICON_SKIP_FORWARD = 63220;
    public static final int ICON_SKIP_FORWARD_10 = 57430;
    public static final int ICON_SKIP_FORWARD_15 = 1040470;
    public static final int ICON_SKIP_FORWARD_30 = 57431;
    public static final int ICON_SKIP_FORWARD_5 = 57432;
    public static final int ICON_STAR_FILLED = 1042488;
    public static final int ICON_STAR_UNFILLED = 59448;
    public static final int ICON_STOP = 57415;
    public static final int ICON_SUBTITLES = 57416;
    public static final int ICON_SUBTITLES_OFF = 61298;
    public static final int ICON_SYNC = 58919;
    public static final int ICON_THUMB_DOWN_FILLED = 1042651;
    public static final int ICON_THUMB_DOWN_UNFILLED = 59611;
    public static final int ICON_THUMB_UP_FILLED = 1042652;
    public static final int ICON_THUMB_UP_UNFILLED = 59612;
    public static final int ICON_UNDEFINED = 0;
    public static final int ICON_VOLUME_DOWN = 57421;
    public static final int ICON_VOLUME_OFF = 57423;
    public static final int ICON_VOLUME_UP = 57424;
    public final java.lang.CharSequence displayName;
    public final android.os.Bundle extras;
    public final int icon;
    public final int iconResId;
    public final android.net.Uri iconUri;
    public final boolean isEnabled;
    public final int playerCommand;
    public final androidx.media3.session.SessionCommand sessionCommand;
    private static final java.lang.String FIELD_SESSION_COMMAND = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_PLAYER_COMMAND = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_ICON_RES_ID = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String FIELD_DISPLAY_NAME = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String FIELD_EXTRAS = androidx.media3.common.util.Util.intToStringMaxRadix(4);
    private static final java.lang.String FIELD_ENABLED = androidx.media3.common.util.Util.intToStringMaxRadix(5);
    private static final java.lang.String FIELD_ICON_URI = androidx.media3.common.util.Util.intToStringMaxRadix(6);
    private static final java.lang.String FIELD_ICON = androidx.media3.common.util.Util.intToStringMaxRadix(7);

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Icon {
    }

    public static final class Builder {
        private java.lang.CharSequence displayName;
        private boolean enabled;
        private android.os.Bundle extras;
        private int icon;
        private int iconResId;
        private android.net.Uri iconUri;
        private int playerCommand;
        private androidx.media3.session.SessionCommand sessionCommand;

        public Builder() {
            this(0);
        }

        public Builder(int i) {
            this(i, androidx.media3.session.CommandButton.getIconResIdForIconConstant(i));
        }

        Builder(int i, int i2) {
            this.icon = i;
            this.iconResId = i2;
            this.displayName = "";
            this.extras = android.os.Bundle.EMPTY;
            this.playerCommand = -1;
            this.enabled = true;
        }

        public androidx.media3.session.CommandButton.Builder setSessionCommand(androidx.media3.session.SessionCommand sessionCommand) {
            androidx.media3.common.util.Assertions.checkNotNull(sessionCommand, "sessionCommand should not be null.");
            androidx.media3.common.util.Assertions.checkArgument(this.playerCommand == -1, "playerCommands is already set. Only one of sessionCommand and playerCommand should be set.");
            this.sessionCommand = sessionCommand;
            return this;
        }

        public androidx.media3.session.CommandButton.Builder setPlayerCommand(int i) {
            androidx.media3.common.util.Assertions.checkArgument(this.sessionCommand == null, "sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.");
            this.playerCommand = i;
            return this;
        }

        public androidx.media3.session.CommandButton.Builder setIconResId(int i) {
            return setCustomIconResId(i);
        }

        public androidx.media3.session.CommandButton.Builder setCustomIconResId(int i) {
            this.iconResId = i;
            return this;
        }

        public androidx.media3.session.CommandButton.Builder setIconUri(android.net.Uri uri) {
            this.iconUri = uri;
            return this;
        }

        public androidx.media3.session.CommandButton.Builder setDisplayName(java.lang.CharSequence charSequence) {
            this.displayName = charSequence;
            return this;
        }

        public androidx.media3.session.CommandButton.Builder setEnabled(boolean z) {
            this.enabled = z;
            return this;
        }

        public androidx.media3.session.CommandButton.Builder setExtras(android.os.Bundle bundle) {
            this.extras = new android.os.Bundle(bundle);
            return this;
        }

        public androidx.media3.session.CommandButton build() {
            androidx.media3.common.util.Assertions.checkState((this.sessionCommand == null) != (this.playerCommand == -1), "Exactly one of sessionCommand and playerCommand should be set");
            return new androidx.media3.session.CommandButton(this.sessionCommand, this.playerCommand, this.icon, this.iconResId, this.iconUri, this.displayName, this.extras, this.enabled);
        }
    }

    private CommandButton(androidx.media3.session.SessionCommand sessionCommand, int i, int i2, int i3, android.net.Uri uri, java.lang.CharSequence charSequence, android.os.Bundle bundle, boolean z) {
        this.sessionCommand = sessionCommand;
        this.playerCommand = i;
        this.icon = i2;
        this.iconResId = i3;
        this.iconUri = uri;
        this.displayName = charSequence;
        this.extras = new android.os.Bundle(bundle);
        this.isEnabled = z;
    }

    @com.google.errorprone.annotations.CheckReturnValue
    androidx.media3.session.CommandButton copyWithIsEnabled(boolean z) {
        return this.isEnabled == z ? this : new androidx.media3.session.CommandButton(this.sessionCommand, this.playerCommand, this.icon, this.iconResId, this.iconUri, this.displayName, new android.os.Bundle(this.extras), z);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.session.CommandButton)) {
            return false;
        }
        androidx.media3.session.CommandButton commandButton = (androidx.media3.session.CommandButton) obj;
        return com.google.common.base.Objects.equal(this.sessionCommand, commandButton.sessionCommand) && this.playerCommand == commandButton.playerCommand && this.icon == commandButton.icon && this.iconResId == commandButton.iconResId && com.google.common.base.Objects.equal(this.iconUri, commandButton.iconUri) && android.text.TextUtils.equals(this.displayName, commandButton.displayName) && this.isEnabled == commandButton.isEnabled;
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(this.sessionCommand, java.lang.Integer.valueOf(this.playerCommand), java.lang.Integer.valueOf(this.icon), java.lang.Integer.valueOf(this.iconResId), this.displayName, java.lang.Boolean.valueOf(this.isEnabled), this.iconUri);
    }

    static com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> copyWithUnavailableButtonsDisabled(java.util.List<androidx.media3.session.CommandButton> list, androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands) {
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.session.CommandButton commandButton = list.get(i);
            if (isButtonCommandAvailable(commandButton, sessionCommands, commands)) {
                builder.add(commandButton);
            } else {
                builder.add(commandButton.copyWithIsEnabled(false));
            }
        }
        return builder.build();
    }

    static boolean isButtonCommandAvailable(androidx.media3.session.CommandButton commandButton, androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands) {
        int i;
        androidx.media3.session.SessionCommand sessionCommand = commandButton.sessionCommand;
        return (sessionCommand != null && sessionCommands.contains(sessionCommand)) || ((i = commandButton.playerCommand) != -1 && commands.contains(i));
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        androidx.media3.session.SessionCommand sessionCommand = this.sessionCommand;
        if (sessionCommand != null) {
            bundle.putBundle(FIELD_SESSION_COMMAND, sessionCommand.toBundle());
        }
        int i = this.playerCommand;
        if (i != -1) {
            bundle.putInt(FIELD_PLAYER_COMMAND, i);
        }
        int i2 = this.icon;
        if (i2 != 0) {
            bundle.putInt(FIELD_ICON, i2);
        }
        int i3 = this.iconResId;
        if (i3 != 0) {
            bundle.putInt(FIELD_ICON_RES_ID, i3);
        }
        java.lang.CharSequence charSequence = this.displayName;
        if (charSequence != "") {
            bundle.putCharSequence(FIELD_DISPLAY_NAME, charSequence);
        }
        if (!this.extras.isEmpty()) {
            bundle.putBundle(FIELD_EXTRAS, this.extras);
        }
        android.net.Uri uri = this.iconUri;
        if (uri != null) {
            bundle.putParcelable(FIELD_ICON_URI, uri);
        }
        boolean z = this.isEnabled;
        if (!z) {
            bundle.putBoolean(FIELD_ENABLED, z);
        }
        return bundle;
    }

    @java.lang.Deprecated
    public static androidx.media3.session.CommandButton fromBundle(android.os.Bundle bundle) {
        return fromBundle(bundle, 4);
    }

    public static androidx.media3.session.CommandButton fromBundle(android.os.Bundle bundle, int i) {
        android.os.Bundle bundle2 = bundle.getBundle(FIELD_SESSION_COMMAND);
        androidx.media3.session.SessionCommand sessionCommandFromBundle = bundle2 == null ? null : androidx.media3.session.SessionCommand.fromBundle(bundle2);
        int i2 = bundle.getInt(FIELD_PLAYER_COMMAND, -1);
        int i3 = bundle.getInt(FIELD_ICON_RES_ID, 0);
        java.lang.CharSequence charSequence = bundle.getCharSequence(FIELD_DISPLAY_NAME, "");
        android.os.Bundle bundle3 = bundle.getBundle(FIELD_EXTRAS);
        boolean z = true;
        if (i >= 3 && !bundle.getBoolean(FIELD_ENABLED, true)) {
            z = false;
        }
        android.net.Uri uri = (android.net.Uri) bundle.getParcelable(FIELD_ICON_URI);
        androidx.media3.session.CommandButton.Builder builder = new androidx.media3.session.CommandButton.Builder(bundle.getInt(FIELD_ICON, 0), i3);
        if (sessionCommandFromBundle != null) {
            builder.setSessionCommand(sessionCommandFromBundle);
        }
        if (i2 != -1) {
            builder.setPlayerCommand(i2);
        }
        if (uri != null) {
            builder.setIconUri(uri);
        }
        androidx.media3.session.CommandButton.Builder displayName = builder.setDisplayName(charSequence);
        if (bundle3 == null) {
            bundle3 = android.os.Bundle.EMPTY;
        }
        return displayName.setExtras(bundle3).setEnabled(z).build();
    }

    public static int getIconResIdForIconConstant(int i) {
        switch (i) {
            case ICON_ALBUM /* 57369 */:
                return androidx.media3.session.R.drawable.media3_icon_album;
            case ICON_ARTIST /* 57370 */:
                return androidx.media3.session.R.drawable.media3_icon_artist;
            case ICON_CLOSED_CAPTIONS /* 57372 */:
                return androidx.media3.session.R.drawable.media3_icon_closed_captions;
            case ICON_FAST_FORWARD /* 57375 */:
                return androidx.media3.session.R.drawable.media3_icon_fast_forward;
            case ICON_REWIND /* 57376 */:
                return androidx.media3.session.R.drawable.media3_icon_rewind;
            case ICON_PAUSE /* 57396 */:
                return androidx.media3.session.R.drawable.media3_icon_pause;
            case ICON_PLAY /* 57399 */:
                return androidx.media3.session.R.drawable.media3_icon_play;
            case ICON_PLAYLIST_ADD /* 57403 */:
                return androidx.media3.session.R.drawable.media3_icon_playlist_add;
            case ICON_REPEAT_ALL /* 57408 */:
                return androidx.media3.session.R.drawable.media3_icon_repeat_all;
            case ICON_REPEAT_ONE /* 57409 */:
                return androidx.media3.session.R.drawable.media3_icon_repeat_one;
            case ICON_SKIP_BACK /* 57410 */:
                return androidx.media3.session.R.drawable.media3_icon_skip_back;
            case ICON_SHUFFLE_ON /* 57411 */:
                return androidx.media3.session.R.drawable.media3_icon_shuffle_on;
            case ICON_NEXT /* 57412 */:
                return androidx.media3.session.R.drawable.media3_icon_next;
            case ICON_PREVIOUS /* 57413 */:
                return androidx.media3.session.R.drawable.media3_icon_previous;
            case ICON_STOP /* 57415 */:
                return androidx.media3.session.R.drawable.media3_icon_stop;
            case ICON_SUBTITLES /* 57416 */:
                return androidx.media3.session.R.drawable.media3_icon_subtitles;
            case ICON_VOLUME_DOWN /* 57421 */:
                return androidx.media3.session.R.drawable.media3_icon_volume_down;
            case ICON_VOLUME_OFF /* 57423 */:
                return androidx.media3.session.R.drawable.media3_icon_volume_off;
            case ICON_VOLUME_UP /* 57424 */:
                return androidx.media3.session.R.drawable.media3_icon_volume_up;
            case ICON_SKIP_FORWARD_10 /* 57430 */:
                return androidx.media3.session.R.drawable.media3_icon_skip_forward_10;
            case ICON_SKIP_FORWARD_30 /* 57431 */:
                return androidx.media3.session.R.drawable.media3_icon_skip_forward_30;
            case ICON_SKIP_FORWARD_5 /* 57432 */:
                return androidx.media3.session.R.drawable.media3_icon_skip_forward_5;
            case ICON_SKIP_BACK_10 /* 57433 */:
                return androidx.media3.session.R.drawable.media3_icon_skip_back_10;
            case ICON_SKIP_BACK_30 /* 57434 */:
                return androidx.media3.session.R.drawable.media3_icon_skip_back_30;
            case ICON_SKIP_BACK_5 /* 57435 */:
                return androidx.media3.session.R.drawable.media3_icon_skip_back_5;
            case ICON_QUEUE_ADD /* 57436 */:
                return androidx.media3.session.R.drawable.media3_icon_queue_add;
            case ICON_QUEUE_NEXT /* 57446 */:
                return androidx.media3.session.R.drawable.media3_icon_queue_next;
            case ICON_QUEUE_REMOVE /* 57447 */:
                return androidx.media3.session.R.drawable.media3_icon_queue_remove;
            case ICON_PLAYBACK_SPEED /* 57448 */:
                return androidx.media3.session.R.drawable.media3_icon_playback_speed;
            case ICON_FEED /* 57573 */:
                return androidx.media3.session.R.drawable.media3_icon_feed;
            case ICON_PLUS /* 57669 */:
                return androidx.media3.session.R.drawable.media3_icon_plus;
            case ICON_PLUS_CIRCLE_UNFILLED /* 57671 */:
                return androidx.media3.session.R.drawable.media3_icon_plus_circle_unfilled;
            case ICON_BLOCK /* 57675 */:
                return androidx.media3.session.R.drawable.media3_icon_block;
            case ICON_FLAG_UNFILLED /* 57683 */:
                return androidx.media3.session.R.drawable.media3_icon_flag_unfilled;
            case ICON_MINUS /* 57691 */:
                return androidx.media3.session.R.drawable.media3_icon_minus;
            case ICON_QUALITY /* 58409 */:
                return androidx.media3.session.R.drawable.media3_icon_quality;
            case ICON_RADIO /* 58654 */:
                return androidx.media3.session.R.drawable.media3_icon_radio;
            case ICON_SYNC /* 58919 */:
                return androidx.media3.session.R.drawable.media3_icon_sync;
            case ICON_SHARE /* 59405 */:
                return androidx.media3.session.R.drawable.media3_icon_share;
            case ICON_STAR_UNFILLED /* 59448 */:
                return androidx.media3.session.R.drawable.media3_icon_star_unfilled;
            case ICON_BOOKMARK_UNFILLED /* 59494 */:
                return androidx.media3.session.R.drawable.media3_icon_bookmark_unfilled;
            case ICON_CHECK_CIRCLE_UNFILLED /* 59500 */:
                return androidx.media3.session.R.drawable.media3_icon_check_circle_unfilled;
            case ICON_HEART_UNFILLED /* 59517 */:
                return androidx.media3.session.R.drawable.media3_icon_heart_unfilled;
            case ICON_SETTINGS /* 59576 */:
                return androidx.media3.session.R.drawable.media3_icon_settings;
            case ICON_THUMB_DOWN_UNFILLED /* 59611 */:
                return androidx.media3.session.R.drawable.media3_icon_thumb_down_unfilled;
            case ICON_THUMB_UP_UNFILLED /* 59612 */:
                return androidx.media3.session.R.drawable.media3_icon_thumb_up_unfilled;
            case ICON_PLAYLIST_REMOVE /* 60288 */:
                return androidx.media3.session.R.drawable.media3_icon_playlist_remove;
            case ICON_SUBTITLES_OFF /* 61298 */:
                return androidx.media3.session.R.drawable.media3_icon_subtitles_off;
            case ICON_PLAYBACK_SPEED_1_0 /* 61389 */:
                return androidx.media3.session.R.drawable.media3_icon_playback_speed_1_0;
            case ICON_SIGNAL /* 61512 */:
                return androidx.media3.session.R.drawable.media3_icon_signal;
            case ICON_CLOSED_CAPTIONS_OFF /* 61916 */:
                return androidx.media3.session.R.drawable.media3_icon_closed_captions_off;
            case ICON_PLAYBACK_SPEED_1_5 /* 62688 */:
                return androidx.media3.session.R.drawable.media3_icon_playback_speed_1_5;
            case ICON_PLAYBACK_SPEED_1_2 /* 62689 */:
                return androidx.media3.session.R.drawable.media3_icon_playback_speed_1_2;
            case ICON_PLAYBACK_SPEED_0_5 /* 62690 */:
                return androidx.media3.session.R.drawable.media3_icon_playback_speed_0_5;
            case ICON_PLAYBACK_SPEED_2_0 /* 62699 */:
                return androidx.media3.session.R.drawable.media3_icon_playback_speed_2_0;
            case ICON_SKIP_FORWARD /* 63220 */:
                return androidx.media3.session.R.drawable.media3_icon_skip_forward;
            case ICON_REPEAT_OFF /* 1040448 */:
                return androidx.media3.session.R.drawable.media3_icon_repeat_off;
            case ICON_SHUFFLE_STAR /* 1040451 */:
                return androidx.media3.session.R.drawable.media3_icon_shuffle_star;
            case ICON_SHUFFLE_OFF /* 1040452 */:
                return androidx.media3.session.R.drawable.media3_icon_shuffle_off;
            case ICON_SKIP_FORWARD_15 /* 1040470 */:
                return androidx.media3.session.R.drawable.media3_icon_skip_forward_15;
            case ICON_SKIP_BACK_15 /* 1040473 */:
                return androidx.media3.session.R.drawable.media3_icon_skip_back_15;
            case ICON_PLUS_CIRCLE_FILLED /* 1040711 */:
                return androidx.media3.session.R.drawable.media3_icon_plus_circle_filled;
            case ICON_MINUS_CIRCLE_FILLED /* 1040712 */:
                return androidx.media3.session.R.drawable.media3_icon_minus_circle_filled;
            case ICON_MINUS_CIRCLE_UNFILLED /* 1040713 */:
                return androidx.media3.session.R.drawable.media3_icon_minus_circle_unfilled;
            case ICON_FLAG_FILLED /* 1040723 */:
                return androidx.media3.session.R.drawable.media3_icon_flag_filled;
            case ICON_STAR_FILLED /* 1042488 */:
                return androidx.media3.session.R.drawable.media3_icon_star_filled;
            case ICON_BOOKMARK_FILLED /* 1042534 */:
                return androidx.media3.session.R.drawable.media3_icon_bookmark_filled;
            case ICON_CHECK_CIRCLE_FILLED /* 1042540 */:
                return androidx.media3.session.R.drawable.media3_icon_check_circle_filled;
            case ICON_HEART_FILLED /* 1042557 */:
                return androidx.media3.session.R.drawable.media3_icon_heart_filled;
            case ICON_THUMB_DOWN_FILLED /* 1042651 */:
                return androidx.media3.session.R.drawable.media3_icon_thumb_down_filled;
            case ICON_THUMB_UP_FILLED /* 1042652 */:
                return androidx.media3.session.R.drawable.media3_icon_thumb_up_filled;
            case ICON_PLAYBACK_SPEED_1_8 /* 1045728 */:
                return androidx.media3.session.R.drawable.media3_icon_playback_speed_1_8;
            case ICON_PLAYBACK_SPEED_0_8 /* 1045730 */:
                return androidx.media3.session.R.drawable.media3_icon_playback_speed_0_8;
            default:
                return 0;
        }
    }
}
