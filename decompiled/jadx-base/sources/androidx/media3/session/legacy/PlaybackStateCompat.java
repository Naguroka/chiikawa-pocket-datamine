package androidx.media3.session.legacy;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements android.os.Parcelable {
    public static final long ACTION_FAST_FORWARD = 64;
    public static final long ACTION_PAUSE = 2;
    public static final long ACTION_PLAY = 4;
    public static final long ACTION_PLAY_FROM_MEDIA_ID = 1024;
    public static final long ACTION_PLAY_FROM_SEARCH = 2048;
    public static final long ACTION_PLAY_FROM_URI = 8192;
    public static final long ACTION_PLAY_PAUSE = 512;
    public static final long ACTION_PREPARE = 16384;
    public static final long ACTION_PREPARE_FROM_MEDIA_ID = 32768;
    public static final long ACTION_PREPARE_FROM_SEARCH = 65536;
    public static final long ACTION_PREPARE_FROM_URI = 131072;
    public static final long ACTION_REWIND = 8;
    public static final long ACTION_SEEK_TO = 256;
    public static final long ACTION_SET_CAPTIONING_ENABLED = 1048576;
    public static final long ACTION_SET_PLAYBACK_SPEED = 4194304;
    public static final long ACTION_SET_RATING = 128;
    public static final long ACTION_SET_REPEAT_MODE = 262144;
    public static final long ACTION_SET_SHUFFLE_MODE = 2097152;

    @java.lang.Deprecated
    public static final long ACTION_SET_SHUFFLE_MODE_ENABLED = 524288;
    public static final long ACTION_SKIP_TO_NEXT = 32;
    public static final long ACTION_SKIP_TO_PREVIOUS = 16;
    public static final long ACTION_SKIP_TO_QUEUE_ITEM = 4096;
    public static final long ACTION_STOP = 1;
    public static final android.os.Parcelable.Creator<androidx.media3.session.legacy.PlaybackStateCompat> CREATOR = new android.os.Parcelable.Creator<androidx.media3.session.legacy.PlaybackStateCompat>() { // from class: androidx.media3.session.legacy.PlaybackStateCompat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.session.legacy.PlaybackStateCompat createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.session.legacy.PlaybackStateCompat(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.session.legacy.PlaybackStateCompat[] newArray(int i) {
            return new androidx.media3.session.legacy.PlaybackStateCompat[i];
        }
    };
    public static final int ERROR_CODE_ACTION_ABORTED = 10;
    public static final int ERROR_CODE_APP_ERROR = 1;
    public static final int ERROR_CODE_AUTHENTICATION_EXPIRED = 3;
    public static final int ERROR_CODE_CONCURRENT_STREAM_LIMIT = 5;
    public static final int ERROR_CODE_CONTENT_ALREADY_PLAYING = 8;
    public static final int ERROR_CODE_END_OF_QUEUE = 11;
    public static final int ERROR_CODE_NOT_AVAILABLE_IN_REGION = 7;
    public static final int ERROR_CODE_NOT_SUPPORTED = 2;
    public static final int ERROR_CODE_PARENTAL_CONTROL_RESTRICTED = 6;
    public static final int ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED = 4;
    public static final int ERROR_CODE_SKIP_LIMIT_REACHED = 9;
    public static final int ERROR_CODE_UNKNOWN_ERROR = 0;
    private static final int KEYCODE_MEDIA_PAUSE = 127;
    private static final int KEYCODE_MEDIA_PLAY = 126;
    public static final long PLAYBACK_POSITION_UNKNOWN = -1;
    public static final int REPEAT_MODE_ALL = 2;
    public static final int REPEAT_MODE_GROUP = 3;
    public static final int REPEAT_MODE_INVALID = -1;
    public static final int REPEAT_MODE_NONE = 0;
    public static final int REPEAT_MODE_ONE = 1;
    public static final int SHUFFLE_MODE_ALL = 1;
    public static final int SHUFFLE_MODE_GROUP = 2;
    public static final int SHUFFLE_MODE_INVALID = -1;
    public static final int SHUFFLE_MODE_NONE = 0;
    public static final int STATE_BUFFERING = 6;
    public static final int STATE_CONNECTING = 8;
    public static final int STATE_ERROR = 7;
    public static final int STATE_FAST_FORWARDING = 4;
    public static final int STATE_NONE = 0;
    public static final int STATE_PAUSED = 2;
    public static final int STATE_PLAYING = 3;
    public static final int STATE_REWINDING = 5;
    public static final int STATE_SKIPPING_TO_NEXT = 10;
    public static final int STATE_SKIPPING_TO_PREVIOUS = 9;
    public static final int STATE_SKIPPING_TO_QUEUE_ITEM = 11;
    public static final int STATE_STOPPED = 1;
    final long mActions;
    final long mActiveItemId;
    final long mBufferedPosition;
    java.util.List<androidx.media3.session.legacy.PlaybackStateCompat.CustomAction> mCustomActions;
    final int mErrorCode;
    final java.lang.CharSequence mErrorMessage;
    final android.os.Bundle mExtras;
    final long mPosition;
    final float mSpeed;
    final int mState;
    private android.media.session.PlaybackState mStateFwk;
    final long mUpdateTime;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Actions {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ErrorCode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MediaKeyAction {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ShuffleMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface State {
    }

    public static int toKeyCode(long j) {
        if (j == 4) {
            return 126;
        }
        if (j == 2) {
            return 127;
        }
        if (j == 32) {
            return 87;
        }
        if (j == 16) {
            return 88;
        }
        if (j == 1) {
            return 86;
        }
        if (j == 64) {
            return 90;
        }
        if (j == 8) {
            return 89;
        }
        return j == 512 ? 85 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, java.lang.CharSequence charSequence, long j4, java.util.List<androidx.media3.session.legacy.PlaybackStateCompat.CustomAction> list, long j5, android.os.Bundle bundle) {
        this.mState = i;
        this.mPosition = j;
        this.mBufferedPosition = j2;
        this.mSpeed = f;
        this.mActions = j3;
        this.mErrorCode = i2;
        this.mErrorMessage = charSequence;
        this.mUpdateTime = j4;
        this.mCustomActions = list == null ? com.google.common.collect.ImmutableList.of() : new java.util.ArrayList(list);
        this.mActiveItemId = j5;
        this.mExtras = bundle;
    }

    PlaybackStateCompat(android.os.Parcel parcel) {
        this.mState = parcel.readInt();
        this.mPosition = parcel.readLong();
        this.mSpeed = parcel.readFloat();
        this.mUpdateTime = parcel.readLong();
        this.mBufferedPosition = parcel.readLong();
        this.mActions = parcel.readLong();
        this.mErrorMessage = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        java.util.List<androidx.media3.session.legacy.PlaybackStateCompat.CustomAction> listCreateTypedArrayList = parcel.createTypedArrayList(androidx.media3.session.legacy.PlaybackStateCompat.CustomAction.CREATOR);
        this.mCustomActions = listCreateTypedArrayList == null ? com.google.common.collect.ImmutableList.of() : listCreateTypedArrayList;
        this.mActiveItemId = parcel.readLong();
        this.mExtras = parcel.readBundle(androidx.media3.session.legacy.MediaSessionCompat.class.getClassLoader());
        this.mErrorCode = parcel.readInt();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlaybackState {state=");
        sb.append(this.mState);
        sb.append(", position=").append(this.mPosition);
        sb.append(", buffered position=").append(this.mBufferedPosition);
        sb.append(", speed=").append(this.mSpeed);
        sb.append(", updated=").append(this.mUpdateTime);
        sb.append(", actions=").append(this.mActions);
        sb.append(", error code=").append(this.mErrorCode);
        sb.append(", error message=").append(this.mErrorMessage);
        sb.append(", custom actions=").append(this.mCustomActions);
        sb.append(", active item id=").append(this.mActiveItemId);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.mState);
        parcel.writeLong(this.mPosition);
        parcel.writeFloat(this.mSpeed);
        parcel.writeLong(this.mUpdateTime);
        parcel.writeLong(this.mBufferedPosition);
        parcel.writeLong(this.mActions);
        android.text.TextUtils.writeToParcel(this.mErrorMessage, parcel, i);
        parcel.writeTypedList(this.mCustomActions);
        parcel.writeLong(this.mActiveItemId);
        parcel.writeBundle(this.mExtras);
        parcel.writeInt(this.mErrorCode);
    }

    public int getState() {
        return this.mState;
    }

    public long getPosition() {
        return this.mPosition;
    }

    public long getLastPositionUpdateTime() {
        return this.mUpdateTime;
    }

    public long getCurrentPosition(java.lang.Long l) {
        long jElapsedRealtime;
        long j = this.mPosition;
        float f = this.mSpeed;
        if (l != null) {
            jElapsedRealtime = l.longValue();
        } else {
            jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.mUpdateTime;
        }
        return java.lang.Math.max(0L, j + ((long) (f * jElapsedRealtime)));
    }

    public long getBufferedPosition() {
        return this.mBufferedPosition;
    }

    public float getPlaybackSpeed() {
        return this.mSpeed;
    }

    public long getActions() {
        return this.mActions;
    }

    public java.util.List<androidx.media3.session.legacy.PlaybackStateCompat.CustomAction> getCustomActions() {
        return this.mCustomActions;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public java.lang.CharSequence getErrorMessage() {
        return this.mErrorMessage;
    }

    public long getActiveQueueItemId() {
        return this.mActiveItemId;
    }

    public android.os.Bundle getExtras() {
        return this.mExtras;
    }

    public static androidx.media3.session.legacy.PlaybackStateCompat fromPlaybackState(java.lang.Object obj) {
        java.util.ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        android.media.session.PlaybackState playbackState = (android.media.session.PlaybackState) obj;
        java.util.List<android.media.session.PlaybackState.CustomAction> customActions = androidx.media3.session.legacy.PlaybackStateCompat.Api21Impl.getCustomActions(playbackState);
        if (customActions != null) {
            arrayList = new java.util.ArrayList(customActions.size());
            for (android.media.session.PlaybackState.CustomAction customAction : customActions) {
                if (customAction != null) {
                    arrayList.add(androidx.media3.session.legacy.PlaybackStateCompat.CustomAction.fromCustomAction(customAction));
                }
            }
        }
        android.os.Bundle extras = androidx.media3.session.legacy.PlaybackStateCompat.Api22Impl.getExtras(playbackState);
        androidx.media3.session.legacy.MediaSessionCompat.ensureClassLoader(extras);
        androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat = new androidx.media3.session.legacy.PlaybackStateCompat(androidx.media3.session.legacy.PlaybackStateCompat.Api21Impl.getState(playbackState), androidx.media3.session.legacy.PlaybackStateCompat.Api21Impl.getPosition(playbackState), androidx.media3.session.legacy.PlaybackStateCompat.Api21Impl.getBufferedPosition(playbackState), androidx.media3.session.legacy.PlaybackStateCompat.Api21Impl.getPlaybackSpeed(playbackState), androidx.media3.session.legacy.PlaybackStateCompat.Api21Impl.getActions(playbackState), 0, androidx.media3.session.legacy.PlaybackStateCompat.Api21Impl.getErrorMessage(playbackState), androidx.media3.session.legacy.PlaybackStateCompat.Api21Impl.getLastPositionUpdateTime(playbackState), arrayList, androidx.media3.session.legacy.PlaybackStateCompat.Api21Impl.getActiveQueueItemId(playbackState), extras);
        playbackStateCompat.mStateFwk = playbackState;
        return playbackStateCompat;
    }

    public java.lang.Object getPlaybackState() {
        if (this.mStateFwk == null) {
            android.media.session.PlaybackState.Builder builderCreateBuilder = androidx.media3.session.legacy.PlaybackStateCompat.Api21Impl.createBuilder();
            androidx.media3.session.legacy.PlaybackStateCompat.Api21Impl.setState(builderCreateBuilder, this.mState, this.mPosition, this.mSpeed, this.mUpdateTime);
            androidx.media3.session.legacy.PlaybackStateCompat.Api21Impl.setBufferedPosition(builderCreateBuilder, this.mBufferedPosition);
            androidx.media3.session.legacy.PlaybackStateCompat.Api21Impl.setActions(builderCreateBuilder, this.mActions);
            androidx.media3.session.legacy.PlaybackStateCompat.Api21Impl.setErrorMessage(builderCreateBuilder, this.mErrorMessage);
            java.util.Iterator<androidx.media3.session.legacy.PlaybackStateCompat.CustomAction> it = this.mCustomActions.iterator();
            while (it.hasNext()) {
                android.media.session.PlaybackState.CustomAction customAction = (android.media.session.PlaybackState.CustomAction) it.next().getCustomAction();
                if (customAction != null) {
                    androidx.media3.session.legacy.PlaybackStateCompat.Api21Impl.addCustomAction(builderCreateBuilder, customAction);
                }
            }
            androidx.media3.session.legacy.PlaybackStateCompat.Api21Impl.setActiveQueueItemId(builderCreateBuilder, this.mActiveItemId);
            androidx.media3.session.legacy.PlaybackStateCompat.Api22Impl.setExtras(builderCreateBuilder, this.mExtras);
            this.mStateFwk = androidx.media3.session.legacy.PlaybackStateCompat.Api21Impl.build(builderCreateBuilder);
        }
        return this.mStateFwk;
    }

    public static final class CustomAction implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.media3.session.legacy.PlaybackStateCompat.CustomAction> CREATOR = new android.os.Parcelable.Creator<androidx.media3.session.legacy.PlaybackStateCompat.CustomAction>() { // from class: androidx.media3.session.legacy.PlaybackStateCompat.CustomAction.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.session.legacy.PlaybackStateCompat.CustomAction createFromParcel(android.os.Parcel parcel) {
                return new androidx.media3.session.legacy.PlaybackStateCompat.CustomAction(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.session.legacy.PlaybackStateCompat.CustomAction[] newArray(int i) {
                return new androidx.media3.session.legacy.PlaybackStateCompat.CustomAction[i];
            }
        };
        private final java.lang.String mAction;
        private android.media.session.PlaybackState.CustomAction mCustomActionFwk;
        private final android.os.Bundle mExtras;
        private final int mIcon;
        private final java.lang.CharSequence mName;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        CustomAction(java.lang.String str, java.lang.CharSequence charSequence, int i, android.os.Bundle bundle) {
            this.mAction = str;
            this.mName = charSequence;
            this.mIcon = i;
            this.mExtras = bundle;
        }

        CustomAction(android.os.Parcel parcel) {
            this.mAction = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(parcel.readString());
            this.mName = (java.lang.CharSequence) androidx.media3.common.util.Assertions.checkNotNull((java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            this.mIcon = parcel.readInt();
            this.mExtras = parcel.readBundle(androidx.media3.session.legacy.MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(this.mAction);
            android.text.TextUtils.writeToParcel(this.mName, parcel, i);
            parcel.writeInt(this.mIcon);
            parcel.writeBundle(this.mExtras);
        }

        public static androidx.media3.session.legacy.PlaybackStateCompat.CustomAction fromCustomAction(java.lang.Object obj) {
            android.media.session.PlaybackState.CustomAction customAction = (android.media.session.PlaybackState.CustomAction) obj;
            android.os.Bundle extras = androidx.media3.session.legacy.PlaybackStateCompat.Api21Impl.getExtras(customAction);
            androidx.media3.session.legacy.MediaSessionCompat.ensureClassLoader(extras);
            androidx.media3.session.legacy.PlaybackStateCompat.CustomAction customAction2 = new androidx.media3.session.legacy.PlaybackStateCompat.CustomAction(androidx.media3.session.legacy.PlaybackStateCompat.Api21Impl.getAction(customAction), androidx.media3.session.legacy.PlaybackStateCompat.Api21Impl.getName(customAction), androidx.media3.session.legacy.PlaybackStateCompat.Api21Impl.getIcon(customAction), extras);
            customAction2.mCustomActionFwk = customAction;
            return customAction2;
        }

        public java.lang.Object getCustomAction() {
            android.media.session.PlaybackState.CustomAction customAction = this.mCustomActionFwk;
            if (customAction != null) {
                return customAction;
            }
            android.media.session.PlaybackState.CustomAction.Builder builderCreateCustomActionBuilder = androidx.media3.session.legacy.PlaybackStateCompat.Api21Impl.createCustomActionBuilder(this.mAction, this.mName, this.mIcon);
            androidx.media3.session.legacy.PlaybackStateCompat.Api21Impl.setExtras(builderCreateCustomActionBuilder, this.mExtras);
            return androidx.media3.session.legacy.PlaybackStateCompat.Api21Impl.build(builderCreateCustomActionBuilder);
        }

        public java.lang.String getAction() {
            return this.mAction;
        }

        public java.lang.CharSequence getName() {
            return this.mName;
        }

        public int getIcon() {
            return this.mIcon;
        }

        public android.os.Bundle getExtras() {
            return this.mExtras;
        }

        public java.lang.String toString() {
            return "Action:mName='" + ((java.lang.Object) this.mName) + ", mIcon=" + this.mIcon + ", mExtras=" + this.mExtras;
        }

        public static final class Builder {
            private final java.lang.String mAction;
            private android.os.Bundle mExtras;
            private final int mIcon;
            private final java.lang.CharSequence mName;

            public Builder(java.lang.String str, java.lang.CharSequence charSequence, int i) {
                if (android.text.TextUtils.isEmpty(str)) {
                    throw new java.lang.IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (android.text.TextUtils.isEmpty(charSequence)) {
                    throw new java.lang.IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i == 0) {
                    throw new java.lang.IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                this.mAction = str;
                this.mName = charSequence;
                this.mIcon = i;
            }

            public androidx.media3.session.legacy.PlaybackStateCompat.CustomAction.Builder setExtras(android.os.Bundle bundle) {
                this.mExtras = bundle;
                return this;
            }

            public androidx.media3.session.legacy.PlaybackStateCompat.CustomAction build() {
                return new androidx.media3.session.legacy.PlaybackStateCompat.CustomAction(this.mAction, this.mName, this.mIcon, this.mExtras);
            }
        }
    }

    public static final class Builder {
        private long mActions;
        private long mActiveItemId;
        private long mBufferedPosition;
        private final java.util.List<androidx.media3.session.legacy.PlaybackStateCompat.CustomAction> mCustomActions;
        private int mErrorCode;
        private java.lang.CharSequence mErrorMessage;
        private android.os.Bundle mExtras;
        private long mPosition;
        private float mRate;
        private int mState;
        private long mUpdateTime;

        public Builder() {
            this.mCustomActions = new java.util.ArrayList();
            this.mActiveItemId = -1L;
        }

        public Builder(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.mCustomActions = arrayList;
            this.mActiveItemId = -1L;
            this.mState = playbackStateCompat.mState;
            this.mPosition = playbackStateCompat.mPosition;
            this.mRate = playbackStateCompat.mSpeed;
            this.mUpdateTime = playbackStateCompat.mUpdateTime;
            this.mBufferedPosition = playbackStateCompat.mBufferedPosition;
            this.mActions = playbackStateCompat.mActions;
            this.mErrorCode = playbackStateCompat.mErrorCode;
            this.mErrorMessage = playbackStateCompat.mErrorMessage;
            if (playbackStateCompat.mCustomActions != null) {
                arrayList.addAll(playbackStateCompat.mCustomActions);
            }
            this.mActiveItemId = playbackStateCompat.mActiveItemId;
            this.mExtras = playbackStateCompat.mExtras;
        }

        public androidx.media3.session.legacy.PlaybackStateCompat.Builder setState(int i, long j, float f) {
            return setState(i, j, f, android.os.SystemClock.elapsedRealtime());
        }

        public androidx.media3.session.legacy.PlaybackStateCompat.Builder setState(int i, long j, float f, long j2) {
            this.mState = i;
            this.mPosition = j;
            this.mUpdateTime = j2;
            this.mRate = f;
            return this;
        }

        public androidx.media3.session.legacy.PlaybackStateCompat.Builder setBufferedPosition(long j) {
            this.mBufferedPosition = j;
            return this;
        }

        public androidx.media3.session.legacy.PlaybackStateCompat.Builder setActions(long j) {
            this.mActions = j;
            return this;
        }

        public androidx.media3.session.legacy.PlaybackStateCompat.Builder addCustomAction(java.lang.String str, java.lang.String str2, int i) {
            return addCustomAction(new androidx.media3.session.legacy.PlaybackStateCompat.CustomAction(str, str2, i, null));
        }

        public androidx.media3.session.legacy.PlaybackStateCompat.Builder addCustomAction(androidx.media3.session.legacy.PlaybackStateCompat.CustomAction customAction) {
            if (customAction == null) {
                throw new java.lang.IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
            }
            this.mCustomActions.add(customAction);
            return this;
        }

        public androidx.media3.session.legacy.PlaybackStateCompat.Builder setActiveQueueItemId(long j) {
            this.mActiveItemId = j;
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.session.legacy.PlaybackStateCompat.Builder setErrorMessage(java.lang.CharSequence charSequence) {
            this.mErrorMessage = charSequence;
            return this;
        }

        public androidx.media3.session.legacy.PlaybackStateCompat.Builder setErrorMessage(int i, java.lang.CharSequence charSequence) {
            this.mErrorCode = i;
            this.mErrorMessage = charSequence;
            return this;
        }

        public androidx.media3.session.legacy.PlaybackStateCompat.Builder setExtras(android.os.Bundle bundle) {
            this.mExtras = bundle;
            return this;
        }

        public androidx.media3.session.legacy.PlaybackStateCompat build() {
            return new androidx.media3.session.legacy.PlaybackStateCompat(this.mState, this.mPosition, this.mBufferedPosition, this.mRate, this.mActions, this.mErrorCode, this.mErrorMessage, this.mUpdateTime, this.mCustomActions, this.mActiveItemId, this.mExtras);
        }
    }

    private static class Api21Impl {
        private Api21Impl() {
        }

        static android.media.session.PlaybackState.Builder createBuilder() {
            return new android.media.session.PlaybackState.Builder();
        }

        static void setState(android.media.session.PlaybackState.Builder builder, int i, long j, float f, long j2) {
            builder.setState(i, j, f, j2);
        }

        static void setBufferedPosition(android.media.session.PlaybackState.Builder builder, long j) {
            builder.setBufferedPosition(j);
        }

        static void setActions(android.media.session.PlaybackState.Builder builder, long j) {
            builder.setActions(j);
        }

        static void setErrorMessage(android.media.session.PlaybackState.Builder builder, java.lang.CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        static void addCustomAction(android.media.session.PlaybackState.Builder builder, android.media.session.PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        static void setActiveQueueItemId(android.media.session.PlaybackState.Builder builder, long j) {
            builder.setActiveQueueItemId(j);
        }

        static java.util.List<android.media.session.PlaybackState.CustomAction> getCustomActions(android.media.session.PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        static android.media.session.PlaybackState build(android.media.session.PlaybackState.Builder builder) {
            return builder.build();
        }

        static int getState(android.media.session.PlaybackState playbackState) {
            return playbackState.getState();
        }

        static long getPosition(android.media.session.PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        static long getBufferedPosition(android.media.session.PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        static float getPlaybackSpeed(android.media.session.PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        static long getActions(android.media.session.PlaybackState playbackState) {
            return playbackState.getActions();
        }

        static java.lang.CharSequence getErrorMessage(android.media.session.PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        static long getLastPositionUpdateTime(android.media.session.PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        static long getActiveQueueItemId(android.media.session.PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        static android.media.session.PlaybackState.CustomAction.Builder createCustomActionBuilder(java.lang.String str, java.lang.CharSequence charSequence, int i) {
            return new android.media.session.PlaybackState.CustomAction.Builder(str, charSequence, i);
        }

        static void setExtras(android.media.session.PlaybackState.CustomAction.Builder builder, android.os.Bundle bundle) {
            builder.setExtras(bundle);
        }

        static android.media.session.PlaybackState.CustomAction build(android.media.session.PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        static android.os.Bundle getExtras(android.media.session.PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        static java.lang.String getAction(android.media.session.PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        static java.lang.CharSequence getName(android.media.session.PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        static int getIcon(android.media.session.PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }
    }

    private static class Api22Impl {
        private Api22Impl() {
        }

        static void setExtras(android.media.session.PlaybackState.Builder builder, android.os.Bundle bundle) {
            builder.setExtras(bundle);
        }

        static android.os.Bundle getExtras(android.media.session.PlaybackState playbackState) {
            return playbackState.getExtras();
        }
    }
}
