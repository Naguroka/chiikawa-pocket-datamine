package android.support.v4.media.session;

/* JADX INFO: loaded from: classes.dex */
public class MediaSessionCompat {
    public static final java.lang.String ACTION_ARGUMENT_CAPTIONING_ENABLED = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";
    public static final java.lang.String ACTION_ARGUMENT_EXTRAS = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";
    public static final java.lang.String ACTION_ARGUMENT_MEDIA_ID = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";
    public static final java.lang.String ACTION_ARGUMENT_PLAYBACK_SPEED = "android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED";
    public static final java.lang.String ACTION_ARGUMENT_QUERY = "android.support.v4.media.session.action.ARGUMENT_QUERY";
    public static final java.lang.String ACTION_ARGUMENT_RATING = "android.support.v4.media.session.action.ARGUMENT_RATING";
    public static final java.lang.String ACTION_ARGUMENT_REPEAT_MODE = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";
    public static final java.lang.String ACTION_ARGUMENT_SHUFFLE_MODE = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";
    public static final java.lang.String ACTION_ARGUMENT_URI = "android.support.v4.media.session.action.ARGUMENT_URI";
    public static final java.lang.String ACTION_FLAG_AS_INAPPROPRIATE = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";
    public static final java.lang.String ACTION_FOLLOW = "android.support.v4.media.session.action.FOLLOW";
    public static final java.lang.String ACTION_PLAY_FROM_URI = "android.support.v4.media.session.action.PLAY_FROM_URI";
    public static final java.lang.String ACTION_PREPARE = "android.support.v4.media.session.action.PREPARE";
    public static final java.lang.String ACTION_PREPARE_FROM_MEDIA_ID = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";
    public static final java.lang.String ACTION_PREPARE_FROM_SEARCH = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";
    public static final java.lang.String ACTION_PREPARE_FROM_URI = "android.support.v4.media.session.action.PREPARE_FROM_URI";
    public static final java.lang.String ACTION_SET_CAPTIONING_ENABLED = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";
    public static final java.lang.String ACTION_SET_PLAYBACK_SPEED = "android.support.v4.media.session.action.SET_PLAYBACK_SPEED";
    public static final java.lang.String ACTION_SET_RATING = "android.support.v4.media.session.action.SET_RATING";
    public static final java.lang.String ACTION_SET_REPEAT_MODE = "android.support.v4.media.session.action.SET_REPEAT_MODE";
    public static final java.lang.String ACTION_SET_SHUFFLE_MODE = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";
    public static final java.lang.String ACTION_SKIP_AD = "android.support.v4.media.session.action.SKIP_AD";
    public static final java.lang.String ACTION_UNFOLLOW = "android.support.v4.media.session.action.UNFOLLOW";
    public static final java.lang.String ARGUMENT_MEDIA_ATTRIBUTE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";
    public static final java.lang.String ARGUMENT_MEDIA_ATTRIBUTE_VALUE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";
    private static final java.lang.String DATA_CALLING_PACKAGE = "data_calling_pkg";
    private static final java.lang.String DATA_CALLING_PID = "data_calling_pid";
    private static final java.lang.String DATA_CALLING_UID = "data_calling_uid";
    private static final java.lang.String DATA_EXTRAS = "data_extras";

    @java.lang.Deprecated
    public static final int FLAG_HANDLES_MEDIA_BUTTONS = 1;
    public static final int FLAG_HANDLES_QUEUE_COMMANDS = 4;

    @java.lang.Deprecated
    public static final int FLAG_HANDLES_TRANSPORT_CONTROLS = 2;
    public static final java.lang.String KEY_EXTRA_BINDER = "android.support.v4.media.session.EXTRA_BINDER";
    public static final java.lang.String KEY_SESSION2_TOKEN = "android.support.v4.media.session.SESSION_TOKEN2";
    public static final java.lang.String KEY_TOKEN = "android.support.v4.media.session.TOKEN";
    private static final int MAX_BITMAP_SIZE_IN_DP = 320;
    public static final int MEDIA_ATTRIBUTE_ALBUM = 1;
    public static final int MEDIA_ATTRIBUTE_ARTIST = 0;
    public static final int MEDIA_ATTRIBUTE_PLAYLIST = 2;
    static final java.lang.String TAG = "MediaSessionCompat";
    static int sMaxBitmapSize;
    private final java.util.ArrayList<android.support.v4.media.session.MediaSessionCompat.OnActiveChangeListener> mActiveListeners;
    private final android.support.v4.media.session.MediaControllerCompat mController;
    private final android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl mImpl;

    interface MediaSessionImpl {
        android.support.v4.media.session.MediaSessionCompat.Callback getCallback();

        java.lang.String getCallingPackage();

        androidx.media.MediaSessionManager.RemoteUserInfo getCurrentControllerInfo();

        java.lang.Object getMediaSession();

        android.support.v4.media.session.PlaybackStateCompat getPlaybackState();

        java.lang.Object getRemoteControlClient();

        android.support.v4.media.session.MediaSessionCompat.Token getSessionToken();

        boolean isActive();

        void release();

        void sendSessionEvent(java.lang.String str, android.os.Bundle bundle);

        void setActive(boolean z);

        void setCallback(android.support.v4.media.session.MediaSessionCompat.Callback callback, android.os.Handler handler);

        void setCaptioningEnabled(boolean z);

        void setCurrentControllerInfo(androidx.media.MediaSessionManager.RemoteUserInfo remoteUserInfo);

        void setExtras(android.os.Bundle bundle);

        void setFlags(int i);

        void setMediaButtonReceiver(android.app.PendingIntent pendingIntent);

        void setMetadata(android.support.v4.media.MediaMetadataCompat mediaMetadataCompat);

        void setPlaybackState(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat);

        void setPlaybackToLocal(int i);

        void setPlaybackToRemote(androidx.media.VolumeProviderCompat volumeProviderCompat);

        void setQueue(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> list);

        void setQueueTitle(java.lang.CharSequence charSequence);

        void setRatingType(int i);

        void setRegistrationCallback(android.support.v4.media.session.MediaSessionCompat.RegistrationCallback registrationCallback, android.os.Handler handler);

        void setRepeatMode(int i);

        void setSessionActivity(android.app.PendingIntent pendingIntent);

        void setShuffleMode(int i);
    }

    public interface OnActiveChangeListener {
        void onActiveChanged();
    }

    public interface RegistrationCallback {
        void onCallbackRegistered(int i, int i2);

        void onCallbackUnregistered(int i, int i2);
    }

    public MediaSessionCompat(android.content.Context context, java.lang.String str) {
        this(context, str, null, null);
    }

    public MediaSessionCompat(android.content.Context context, java.lang.String str, android.content.ComponentName componentName, android.app.PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    public MediaSessionCompat(android.content.Context context, java.lang.String str, android.content.ComponentName componentName, android.app.PendingIntent pendingIntent, android.os.Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, null);
    }

    public MediaSessionCompat(android.content.Context context, java.lang.String str, android.content.ComponentName componentName, android.app.PendingIntent pendingIntent, android.os.Bundle bundle, androidx.versionedparcelable.VersionedParcelable versionedParcelable) {
        this.mActiveListeners = new java.util.ArrayList<>();
        if (context == null) {
            throw new java.lang.IllegalArgumentException("context must not be null");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("tag must not be null or empty");
        }
        if (componentName == null && (componentName = androidx.media.session.MediaButtonReceiver.getMediaButtonReceiverComponent(context)) == null) {
            android.util.Log.w(TAG, "Couldn't find a unique registered media button receiver in the given context.");
        }
        if (componentName != null && pendingIntent == null) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            pendingIntent = android.app.PendingIntent.getBroadcast(context, 0, intent, android.os.Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.mImpl = new android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi29(context, str, versionedParcelable, bundle);
        } else if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.mImpl = new android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi28(context, str, versionedParcelable, bundle);
        } else {
            this.mImpl = new android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi22(context, str, versionedParcelable, bundle);
        }
        setCallback(new android.support.v4.media.session.MediaSessionCompat.Callback() { // from class: android.support.v4.media.session.MediaSessionCompat.1
        }, new android.os.Handler(android.os.Looper.myLooper() != null ? android.os.Looper.myLooper() : android.os.Looper.getMainLooper()));
        this.mImpl.setMediaButtonReceiver(pendingIntent);
        this.mController = new android.support.v4.media.session.MediaControllerCompat(context, this);
        if (sMaxBitmapSize == 0) {
            sMaxBitmapSize = (int) (android.util.TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    private MediaSessionCompat(android.content.Context context, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl mediaSessionImpl) {
        this.mActiveListeners = new java.util.ArrayList<>();
        this.mImpl = mediaSessionImpl;
        this.mController = new android.support.v4.media.session.MediaControllerCompat(context, this);
    }

    public void setCallback(android.support.v4.media.session.MediaSessionCompat.Callback callback) {
        setCallback(callback, null);
    }

    public void setCallback(android.support.v4.media.session.MediaSessionCompat.Callback callback, android.os.Handler handler) {
        if (callback == null) {
            this.mImpl.setCallback(null, null);
            return;
        }
        android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl mediaSessionImpl = this.mImpl;
        if (handler == null) {
            handler = new android.os.Handler();
        }
        mediaSessionImpl.setCallback(callback, handler);
    }

    public void setRegistrationCallback(android.support.v4.media.session.MediaSessionCompat.RegistrationCallback registrationCallback, android.os.Handler handler) {
        this.mImpl.setRegistrationCallback(registrationCallback, handler);
    }

    public void setSessionActivity(android.app.PendingIntent pendingIntent) {
        this.mImpl.setSessionActivity(pendingIntent);
    }

    public void setMediaButtonReceiver(android.app.PendingIntent pendingIntent) {
        this.mImpl.setMediaButtonReceiver(pendingIntent);
    }

    public void setFlags(int i) {
        this.mImpl.setFlags(i);
    }

    public void setPlaybackToLocal(int i) {
        this.mImpl.setPlaybackToLocal(i);
    }

    public void setPlaybackToRemote(androidx.media.VolumeProviderCompat volumeProviderCompat) {
        if (volumeProviderCompat == null) {
            throw new java.lang.IllegalArgumentException("volumeProvider may not be null!");
        }
        this.mImpl.setPlaybackToRemote(volumeProviderCompat);
    }

    public void setActive(boolean z) {
        this.mImpl.setActive(z);
        java.util.Iterator<android.support.v4.media.session.MediaSessionCompat.OnActiveChangeListener> it = this.mActiveListeners.iterator();
        while (it.hasNext()) {
            it.next().onActiveChanged();
        }
    }

    public boolean isActive() {
        return this.mImpl.isActive();
    }

    public void sendSessionEvent(java.lang.String str, android.os.Bundle bundle) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("event cannot be null or empty");
        }
        this.mImpl.sendSessionEvent(str, bundle);
    }

    public void release() {
        this.mImpl.release();
    }

    public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken() {
        return this.mImpl.getSessionToken();
    }

    public android.support.v4.media.session.MediaControllerCompat getController() {
        return this.mController;
    }

    public void setPlaybackState(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat) {
        this.mImpl.setPlaybackState(playbackStateCompat);
    }

    public void setMetadata(android.support.v4.media.MediaMetadataCompat mediaMetadataCompat) {
        this.mImpl.setMetadata(mediaMetadataCompat);
    }

    public void setQueue(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> list) {
        if (list != null) {
            java.util.HashSet hashSet = new java.util.HashSet();
            for (android.support.v4.media.session.MediaSessionCompat.QueueItem queueItem : list) {
                if (queueItem == null) {
                    throw new java.lang.IllegalArgumentException("queue shouldn't have null items");
                }
                if (hashSet.contains(java.lang.Long.valueOf(queueItem.getQueueId()))) {
                    android.util.Log.e(TAG, "Found duplicate queue id: " + queueItem.getQueueId(), new java.lang.IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(java.lang.Long.valueOf(queueItem.getQueueId()));
            }
        }
        this.mImpl.setQueue(list);
    }

    public void setQueueTitle(java.lang.CharSequence charSequence) {
        this.mImpl.setQueueTitle(charSequence);
    }

    public void setRatingType(int i) {
        this.mImpl.setRatingType(i);
    }

    public void setCaptioningEnabled(boolean z) {
        this.mImpl.setCaptioningEnabled(z);
    }

    public void setRepeatMode(int i) {
        this.mImpl.setRepeatMode(i);
    }

    public void setShuffleMode(int i) {
        this.mImpl.setShuffleMode(i);
    }

    public void setExtras(android.os.Bundle bundle) {
        this.mImpl.setExtras(bundle);
    }

    public java.lang.Object getMediaSession() {
        return this.mImpl.getMediaSession();
    }

    public java.lang.Object getRemoteControlClient() {
        return this.mImpl.getRemoteControlClient();
    }

    public final androidx.media.MediaSessionManager.RemoteUserInfo getCurrentControllerInfo() {
        return this.mImpl.getCurrentControllerInfo();
    }

    public java.lang.String getCallingPackage() {
        return this.mImpl.getCallingPackage();
    }

    public void addOnActiveChangeListener(android.support.v4.media.session.MediaSessionCompat.OnActiveChangeListener onActiveChangeListener) {
        if (onActiveChangeListener == null) {
            throw new java.lang.IllegalArgumentException("Listener may not be null");
        }
        this.mActiveListeners.add(onActiveChangeListener);
    }

    public void removeOnActiveChangeListener(android.support.v4.media.session.MediaSessionCompat.OnActiveChangeListener onActiveChangeListener) {
        if (onActiveChangeListener == null) {
            throw new java.lang.IllegalArgumentException("Listener may not be null");
        }
        this.mActiveListeners.remove(onActiveChangeListener);
    }

    public static android.support.v4.media.session.MediaSessionCompat fromMediaSession(android.content.Context context, java.lang.Object obj) {
        android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl mediaSessionImplApi21;
        if (context == null || obj == null) {
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            mediaSessionImplApi21 = new android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi29(obj);
        } else if (android.os.Build.VERSION.SDK_INT >= 28) {
            mediaSessionImplApi21 = new android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi28(obj);
        } else {
            mediaSessionImplApi21 = new android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21(obj);
        }
        return new android.support.v4.media.session.MediaSessionCompat(context, mediaSessionImplApi21);
    }

    public static void ensureClassLoader(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(android.support.v4.media.session.MediaSessionCompat.class.getClassLoader());
        }
    }

    public static android.os.Bundle unparcelWithClassLoader(android.os.Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ensureClassLoader(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (android.os.BadParcelableException unused) {
            android.util.Log.e(TAG, "Could not unparcel the data.");
            return null;
        }
    }

    static android.support.v4.media.session.PlaybackStateCompat getStateWithUpdatedPosition(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat, android.support.v4.media.MediaMetadataCompat mediaMetadataCompat) {
        long j;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j2 = -1;
        if (playbackStateCompat.getPosition() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.getState() != 3 && playbackStateCompat.getState() != 4 && playbackStateCompat.getState() != 5) {
            return playbackStateCompat;
        }
        long lastPositionUpdateTime = playbackStateCompat.getLastPositionUpdateTime();
        if (lastPositionUpdateTime <= 0) {
            return playbackStateCompat;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long playbackSpeed = ((long) (playbackStateCompat.getPlaybackSpeed() * (jElapsedRealtime - lastPositionUpdateTime))) + playbackStateCompat.getPosition();
        if (mediaMetadataCompat != null && mediaMetadataCompat.containsKey("android.media.metadata.DURATION")) {
            j2 = mediaMetadataCompat.getLong("android.media.metadata.DURATION");
        }
        if (j2 < 0 || playbackSpeed <= j2) {
            j = playbackSpeed < 0 ? 0L : playbackSpeed;
        } else {
            j = j2;
        }
        return new android.support.v4.media.session.PlaybackStateCompat.Builder(playbackStateCompat).setState(playbackStateCompat.getState(), j, playbackStateCompat.getPlaybackSpeed(), jElapsedRealtime).build();
    }

    public static abstract class Callback {
        android.support.v4.media.session.MediaSessionCompat.Callback.CallbackHandler mCallbackHandler;
        private boolean mMediaPlayPausePendingOnHandler;
        final java.lang.Object mLock = new java.lang.Object();
        final android.media.session.MediaSession.Callback mCallbackFwk = new android.support.v4.media.session.MediaSessionCompat.Callback.MediaSessionCallbackApi21();
        java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl> mSessionImpl = new java.lang.ref.WeakReference<>(null);

        public void onAddQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void onAddQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        public void onCommand(java.lang.String str, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
        }

        public void onCustomAction(java.lang.String str, android.os.Bundle bundle) {
        }

        public void onFastForward() {
        }

        public void onPause() {
        }

        public void onPlay() {
        }

        public void onPlayFromMediaId(java.lang.String str, android.os.Bundle bundle) {
        }

        public void onPlayFromSearch(java.lang.String str, android.os.Bundle bundle) {
        }

        public void onPlayFromUri(android.net.Uri uri, android.os.Bundle bundle) {
        }

        public void onPrepare() {
        }

        public void onPrepareFromMediaId(java.lang.String str, android.os.Bundle bundle) {
        }

        public void onPrepareFromSearch(java.lang.String str, android.os.Bundle bundle) {
        }

        public void onPrepareFromUri(android.net.Uri uri, android.os.Bundle bundle) {
        }

        public void onRemoveQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) {
        }

        @java.lang.Deprecated
        public void onRemoveQueueItemAt(int i) {
        }

        public void onRewind() {
        }

        public void onSeekTo(long j) {
        }

        public void onSetCaptioningEnabled(boolean z) {
        }

        public void onSetPlaybackSpeed(float f) {
        }

        public void onSetRating(android.support.v4.media.RatingCompat ratingCompat) {
        }

        public void onSetRating(android.support.v4.media.RatingCompat ratingCompat, android.os.Bundle bundle) {
        }

        public void onSetRepeatMode(int i) {
        }

        public void onSetShuffleMode(int i) {
        }

        public void onSkipToNext() {
        }

        public void onSkipToPrevious() {
        }

        public void onSkipToQueueItem(long j) {
        }

        public void onStop() {
        }

        void setSessionImpl(android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl mediaSessionImpl, android.os.Handler handler) {
            synchronized (this.mLock) {
                this.mSessionImpl = new java.lang.ref.WeakReference<>(mediaSessionImpl);
                android.support.v4.media.session.MediaSessionCompat.Callback.CallbackHandler callbackHandler = this.mCallbackHandler;
                android.support.v4.media.session.MediaSessionCompat.Callback.CallbackHandler callbackHandler2 = null;
                if (callbackHandler != null) {
                    callbackHandler.removeCallbacksAndMessages(null);
                }
                if (mediaSessionImpl != null && handler != null) {
                    callbackHandler2 = new android.support.v4.media.session.MediaSessionCompat.Callback.CallbackHandler(handler.getLooper());
                }
                this.mCallbackHandler = callbackHandler2;
            }
        }

        public boolean onMediaButtonEvent(android.content.Intent intent) {
            android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl mediaSessionImpl;
            android.support.v4.media.session.MediaSessionCompat.Callback.CallbackHandler callbackHandler;
            android.view.KeyEvent keyEvent;
            if (android.os.Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.mLock) {
                mediaSessionImpl = this.mSessionImpl.get();
                callbackHandler = this.mCallbackHandler;
            }
            if (mediaSessionImpl == null || callbackHandler == null || (keyEvent = (android.view.KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            androidx.media.MediaSessionManager.RemoteUserInfo currentControllerInfo = mediaSessionImpl.getCurrentControllerInfo();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79 || keyCode == 85) {
                if (keyEvent.getRepeatCount() == 0) {
                    if (this.mMediaPlayPausePendingOnHandler) {
                        callbackHandler.removeMessages(1);
                        this.mMediaPlayPausePendingOnHandler = false;
                        android.support.v4.media.session.PlaybackStateCompat playbackState = mediaSessionImpl.getPlaybackState();
                        if (((playbackState == null ? 0L : playbackState.getActions()) & 32) != 0) {
                            onSkipToNext();
                        }
                    } else {
                        this.mMediaPlayPausePendingOnHandler = true;
                        callbackHandler.sendMessageDelayed(callbackHandler.obtainMessage(1, currentControllerInfo), android.view.ViewConfiguration.getDoubleTapTimeout());
                    }
                } else {
                    handleMediaPlayPauseIfPendingOnHandler(mediaSessionImpl, callbackHandler);
                }
                return true;
            }
            handleMediaPlayPauseIfPendingOnHandler(mediaSessionImpl, callbackHandler);
            return false;
        }

        void handleMediaPlayPauseIfPendingOnHandler(android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl mediaSessionImpl, android.os.Handler handler) {
            if (this.mMediaPlayPausePendingOnHandler) {
                this.mMediaPlayPausePendingOnHandler = false;
                handler.removeMessages(1);
                android.support.v4.media.session.PlaybackStateCompat playbackState = mediaSessionImpl.getPlaybackState();
                long actions = playbackState == null ? 0L : playbackState.getActions();
                boolean z = playbackState != null && playbackState.getState() == 3;
                boolean z2 = (516 & actions) != 0;
                boolean z3 = (actions & 514) != 0;
                if (z && z3) {
                    onPause();
                } else {
                    if (z || !z2) {
                        return;
                    }
                    onPlay();
                }
            }
        }

        private class CallbackHandler extends android.os.Handler {
            private static final int MSG_MEDIA_PLAY_PAUSE_KEY_DOUBLE_TAP_TIMEOUT = 1;

            CallbackHandler(android.os.Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(android.os.Message message) {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl mediaSessionImpl;
                android.support.v4.media.session.MediaSessionCompat.Callback.CallbackHandler callbackHandler;
                if (message.what == 1) {
                    synchronized (android.support.v4.media.session.MediaSessionCompat.Callback.this.mLock) {
                        mediaSessionImpl = android.support.v4.media.session.MediaSessionCompat.Callback.this.mSessionImpl.get();
                        callbackHandler = android.support.v4.media.session.MediaSessionCompat.Callback.this.mCallbackHandler;
                    }
                    if (mediaSessionImpl == null || android.support.v4.media.session.MediaSessionCompat.Callback.this != mediaSessionImpl.getCallback() || callbackHandler == null) {
                        return;
                    }
                    mediaSessionImpl.setCurrentControllerInfo((androidx.media.MediaSessionManager.RemoteUserInfo) message.obj);
                    android.support.v4.media.session.MediaSessionCompat.Callback.this.handleMediaPlayPauseIfPendingOnHandler(mediaSessionImpl, callbackHandler);
                    mediaSessionImpl.setCurrentControllerInfo(null);
                }
            }
        }

        private class MediaSessionCallbackApi21 extends android.media.session.MediaSession.Callback {
            MediaSessionCallbackApi21() {
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCommand(java.lang.String str, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                try {
                    android.support.v4.media.session.MediaSessionCompat.QueueItem queueItem = null;
                    android.os.IBinder iBinderAsBinder = null;
                    queueItem = null;
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        android.os.Bundle bundle2 = new android.os.Bundle();
                        android.support.v4.media.session.MediaSessionCompat.Token sessionToken = sessionImplIfCallbackIsSet.getSessionToken();
                        android.support.v4.media.session.IMediaSession extraBinder = sessionToken.getExtraBinder();
                        if (extraBinder != null) {
                            iBinderAsBinder = extraBinder.asBinder();
                        }
                        androidx.core.app.BundleCompat.putBinder(bundle2, "android.support.v4.media.session.EXTRA_BINDER", iBinderAsBinder);
                        androidx.versionedparcelable.ParcelUtils.putVersionedParcelable(bundle2, "android.support.v4.media.session.SESSION_TOKEN2", sessionToken.getSession2Token());
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        android.support.v4.media.session.MediaSessionCompat.Callback.this.onAddQueueItem((android.support.v4.media.MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        android.support.v4.media.session.MediaSessionCompat.Callback.this.onAddQueueItem((android.support.v4.media.MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        android.support.v4.media.session.MediaSessionCompat.Callback.this.onRemoveQueueItem((android.support.v4.media.MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        if (sessionImplIfCallbackIsSet.mQueue != null) {
                            int i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                            if (i >= 0 && i < sessionImplIfCallbackIsSet.mQueue.size()) {
                                queueItem = sessionImplIfCallbackIsSet.mQueue.get(i);
                            }
                            if (queueItem != null) {
                                android.support.v4.media.session.MediaSessionCompat.Callback.this.onRemoveQueueItem(queueItem.getDescription());
                            }
                        }
                    } else {
                        android.support.v4.media.session.MediaSessionCompat.Callback.this.onCommand(str, bundle, resultReceiver);
                    }
                } catch (android.os.BadParcelableException unused) {
                    android.util.Log.e(android.support.v4.media.session.MediaSessionCompat.TAG, "Could not unparcel the extra data.");
                }
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public boolean onMediaButtonEvent(android.content.Intent intent) {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return false;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                boolean zOnMediaButtonEvent = android.support.v4.media.session.MediaSessionCompat.Callback.this.onMediaButtonEvent(intent);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
                return zOnMediaButtonEvent || super.onMediaButtonEvent(intent);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlay() {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                android.support.v4.media.session.MediaSessionCompat.Callback.this.onPlay();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromMediaId(java.lang.String str, android.os.Bundle bundle) {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                android.support.v4.media.session.MediaSessionCompat.Callback.this.onPlayFromMediaId(str, bundle);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromSearch(java.lang.String str, android.os.Bundle bundle) {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                android.support.v4.media.session.MediaSessionCompat.Callback.this.onPlayFromSearch(str, bundle);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromUri(android.net.Uri uri, android.os.Bundle bundle) {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                android.support.v4.media.session.MediaSessionCompat.Callback.this.onPlayFromUri(uri, bundle);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToQueueItem(long j) {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                android.support.v4.media.session.MediaSessionCompat.Callback.this.onSkipToQueueItem(j);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPause() {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                android.support.v4.media.session.MediaSessionCompat.Callback.this.onPause();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToNext() {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                android.support.v4.media.session.MediaSessionCompat.Callback.this.onSkipToNext();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToPrevious() {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                android.support.v4.media.session.MediaSessionCompat.Callback.this.onSkipToPrevious();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onFastForward() {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                android.support.v4.media.session.MediaSessionCompat.Callback.this.onFastForward();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onRewind() {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                android.support.v4.media.session.MediaSessionCompat.Callback.this.onRewind();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onStop() {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                android.support.v4.media.session.MediaSessionCompat.Callback.this.onStop();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSeekTo(long j) {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                android.support.v4.media.session.MediaSessionCompat.Callback.this.onSeekTo(j);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetRating(android.media.Rating rating) {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                android.support.v4.media.session.MediaSessionCompat.Callback.this.onSetRating(android.support.v4.media.RatingCompat.fromRating(rating));
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCustomAction(java.lang.String str, android.os.Bundle bundle) {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                try {
                    if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                        android.net.Uri uri = (android.net.Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        android.os.Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(bundle2);
                        android.support.v4.media.session.MediaSessionCompat.Callback.this.onPlayFromUri(uri, bundle2);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                        android.support.v4.media.session.MediaSessionCompat.Callback.this.onPrepare();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        java.lang.String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                        android.os.Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(bundle3);
                        android.support.v4.media.session.MediaSessionCompat.Callback.this.onPrepareFromMediaId(string, bundle3);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        java.lang.String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                        android.os.Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(bundle4);
                        android.support.v4.media.session.MediaSessionCompat.Callback.this.onPrepareFromSearch(string2, bundle4);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        android.net.Uri uri2 = (android.net.Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        android.os.Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(bundle5);
                        android.support.v4.media.session.MediaSessionCompat.Callback.this.onPrepareFromUri(uri2, bundle5);
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        android.support.v4.media.session.MediaSessionCompat.Callback.this.onSetCaptioningEnabled(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        android.support.v4.media.session.MediaSessionCompat.Callback.this.onSetRepeatMode(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        android.support.v4.media.session.MediaSessionCompat.Callback.this.onSetShuffleMode(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        android.support.v4.media.RatingCompat ratingCompat = (android.support.v4.media.RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                        android.os.Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(bundle6);
                        android.support.v4.media.session.MediaSessionCompat.Callback.this.onSetRating(ratingCompat, bundle6);
                    } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        android.support.v4.media.session.MediaSessionCompat.Callback.this.onSetPlaybackSpeed(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                    } else {
                        android.support.v4.media.session.MediaSessionCompat.Callback.this.onCustomAction(str, bundle);
                    }
                } catch (android.os.BadParcelableException unused) {
                    android.util.Log.e(android.support.v4.media.session.MediaSessionCompat.TAG, "Could not unparcel the data.");
                }
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepare() {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                android.support.v4.media.session.MediaSessionCompat.Callback.this.onPrepare();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromMediaId(java.lang.String str, android.os.Bundle bundle) {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                android.support.v4.media.session.MediaSessionCompat.Callback.this.onPrepareFromMediaId(str, bundle);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromSearch(java.lang.String str, android.os.Bundle bundle) {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                android.support.v4.media.session.MediaSessionCompat.Callback.this.onPrepareFromSearch(str, bundle);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromUri(android.net.Uri uri, android.os.Bundle bundle) {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                android.support.v4.media.session.MediaSessionCompat.Callback.this.onPrepareFromUri(uri, bundle);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetPlaybackSpeed(float f) {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                android.support.v4.media.session.MediaSessionCompat.Callback.this.onSetPlaybackSpeed(f);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            private void setCurrentControllerInfo(android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl mediaSessionImpl) {
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                java.lang.String callingPackage = mediaSessionImpl.getCallingPackage();
                if (android.text.TextUtils.isEmpty(callingPackage)) {
                    callingPackage = "android.media.session.MediaController";
                }
                mediaSessionImpl.setCurrentControllerInfo(new androidx.media.MediaSessionManager.RemoteUserInfo(callingPackage, -1, -1));
            }

            private void clearCurrentControllerInfo(android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl mediaSessionImpl) {
                mediaSessionImpl.setCurrentControllerInfo(null);
            }

            private android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 getSessionImplIfCallbackIsSet() {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 mediaSessionImplApi21;
                synchronized (android.support.v4.media.session.MediaSessionCompat.Callback.this.mLock) {
                    mediaSessionImplApi21 = (android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21) android.support.v4.media.session.MediaSessionCompat.Callback.this.mSessionImpl.get();
                }
                if (mediaSessionImplApi21 == null || android.support.v4.media.session.MediaSessionCompat.Callback.this != mediaSessionImplApi21.getCallback()) {
                    return null;
                }
                return mediaSessionImplApi21;
            }
        }
    }

    public static final class Token implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.support.v4.media.session.MediaSessionCompat.Token> CREATOR = new android.os.Parcelable.Creator<android.support.v4.media.session.MediaSessionCompat.Token>() { // from class: android.support.v4.media.session.MediaSessionCompat.Token.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public android.support.v4.media.session.MediaSessionCompat.Token createFromParcel(android.os.Parcel parcel) {
                return new android.support.v4.media.session.MediaSessionCompat.Token(parcel.readParcelable(null));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public android.support.v4.media.session.MediaSessionCompat.Token[] newArray(int i) {
                return new android.support.v4.media.session.MediaSessionCompat.Token[i];
            }
        };
        private android.support.v4.media.session.IMediaSession mExtraBinder;
        private final java.lang.Object mInner;
        private final java.lang.Object mLock;
        private androidx.versionedparcelable.VersionedParcelable mSession2Token;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        Token(java.lang.Object obj) {
            this(obj, null, null);
        }

        Token(java.lang.Object obj, android.support.v4.media.session.IMediaSession iMediaSession) {
            this(obj, iMediaSession, null);
        }

        Token(java.lang.Object obj, android.support.v4.media.session.IMediaSession iMediaSession, androidx.versionedparcelable.VersionedParcelable versionedParcelable) {
            this.mLock = new java.lang.Object();
            this.mInner = obj;
            this.mExtraBinder = iMediaSession;
            this.mSession2Token = versionedParcelable;
        }

        public static android.support.v4.media.session.MediaSessionCompat.Token fromToken(java.lang.Object obj) {
            return fromToken(obj, null);
        }

        public static android.support.v4.media.session.MediaSessionCompat.Token fromToken(java.lang.Object obj, android.support.v4.media.session.IMediaSession iMediaSession) {
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof android.media.session.MediaSession.Token)) {
                throw new java.lang.IllegalArgumentException("token is not a valid MediaSession.Token object");
            }
            return new android.support.v4.media.session.MediaSessionCompat.Token(obj, iMediaSession);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeParcelable((android.os.Parcelable) this.mInner, i);
        }

        public int hashCode() {
            java.lang.Object obj = this.mInner;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof android.support.v4.media.session.MediaSessionCompat.Token)) {
                return false;
            }
            android.support.v4.media.session.MediaSessionCompat.Token token = (android.support.v4.media.session.MediaSessionCompat.Token) obj;
            java.lang.Object obj2 = this.mInner;
            if (obj2 == null) {
                return token.mInner == null;
            }
            java.lang.Object obj3 = token.mInner;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public java.lang.Object getToken() {
            return this.mInner;
        }

        public android.support.v4.media.session.IMediaSession getExtraBinder() {
            android.support.v4.media.session.IMediaSession iMediaSession;
            synchronized (this.mLock) {
                iMediaSession = this.mExtraBinder;
            }
            return iMediaSession;
        }

        public void setExtraBinder(android.support.v4.media.session.IMediaSession iMediaSession) {
            synchronized (this.mLock) {
                this.mExtraBinder = iMediaSession;
            }
        }

        public androidx.versionedparcelable.VersionedParcelable getSession2Token() {
            androidx.versionedparcelable.VersionedParcelable versionedParcelable;
            synchronized (this.mLock) {
                versionedParcelable = this.mSession2Token;
            }
            return versionedParcelable;
        }

        public void setSession2Token(androidx.versionedparcelable.VersionedParcelable versionedParcelable) {
            synchronized (this.mLock) {
                this.mSession2Token = versionedParcelable;
            }
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("android.support.v4.media.session.TOKEN", this);
            synchronized (this.mLock) {
                android.support.v4.media.session.IMediaSession iMediaSession = this.mExtraBinder;
                if (iMediaSession != null) {
                    androidx.core.app.BundleCompat.putBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER", iMediaSession.asBinder());
                }
                androidx.versionedparcelable.VersionedParcelable versionedParcelable = this.mSession2Token;
                if (versionedParcelable != null) {
                    androidx.versionedparcelable.ParcelUtils.putVersionedParcelable(bundle, "android.support.v4.media.session.SESSION_TOKEN2", versionedParcelable);
                }
            }
            return bundle;
        }

        public static android.support.v4.media.session.MediaSessionCompat.Token fromBundle(android.os.Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            bundle.setClassLoader(android.support.v4.media.session.MediaSessionCompat.Token.class.getClassLoader());
            android.support.v4.media.session.IMediaSession iMediaSessionAsInterface = android.support.v4.media.session.IMediaSession.Stub.asInterface(androidx.core.app.BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
            androidx.versionedparcelable.VersionedParcelable versionedParcelable = androidx.versionedparcelable.ParcelUtils.getVersionedParcelable(bundle, "android.support.v4.media.session.SESSION_TOKEN2");
            android.support.v4.media.session.MediaSessionCompat.Token token = (android.support.v4.media.session.MediaSessionCompat.Token) bundle.getParcelable("android.support.v4.media.session.TOKEN");
            if (token == null) {
                return null;
            }
            return new android.support.v4.media.session.MediaSessionCompat.Token(token.mInner, iMediaSessionAsInterface, versionedParcelable);
        }
    }

    public static final class QueueItem implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.support.v4.media.session.MediaSessionCompat.QueueItem> CREATOR = new android.os.Parcelable.Creator<android.support.v4.media.session.MediaSessionCompat.QueueItem>() { // from class: android.support.v4.media.session.MediaSessionCompat.QueueItem.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public android.support.v4.media.session.MediaSessionCompat.QueueItem createFromParcel(android.os.Parcel parcel) {
                return new android.support.v4.media.session.MediaSessionCompat.QueueItem(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public android.support.v4.media.session.MediaSessionCompat.QueueItem[] newArray(int i) {
                return new android.support.v4.media.session.MediaSessionCompat.QueueItem[i];
            }
        };
        public static final int UNKNOWN_ID = -1;
        private final android.support.v4.media.MediaDescriptionCompat mDescription;
        private final long mId;
        private android.media.session.MediaSession.QueueItem mItemFwk;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public QueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat, long j) {
            this(null, mediaDescriptionCompat, j);
        }

        private QueueItem(android.media.session.MediaSession.QueueItem queueItem, android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new java.lang.IllegalArgumentException("Description cannot be null");
            }
            if (j == -1) {
                throw new java.lang.IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.mDescription = mediaDescriptionCompat;
            this.mId = j;
            this.mItemFwk = queueItem;
        }

        QueueItem(android.os.Parcel parcel) {
            this.mDescription = android.support.v4.media.MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.mId = parcel.readLong();
        }

        public android.support.v4.media.MediaDescriptionCompat getDescription() {
            return this.mDescription;
        }

        public long getQueueId() {
            return this.mId;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            this.mDescription.writeToParcel(parcel, i);
            parcel.writeLong(this.mId);
        }

        public java.lang.Object getQueueItem() {
            android.media.session.MediaSession.QueueItem queueItem = this.mItemFwk;
            if (queueItem != null) {
                return queueItem;
            }
            android.media.session.MediaSession.QueueItem queueItemCreateQueueItem = android.support.v4.media.session.MediaSessionCompat.QueueItem.Api21Impl.createQueueItem((android.media.MediaDescription) this.mDescription.getMediaDescription(), this.mId);
            this.mItemFwk = queueItemCreateQueueItem;
            return queueItemCreateQueueItem;
        }

        public static android.support.v4.media.session.MediaSessionCompat.QueueItem fromQueueItem(java.lang.Object obj) {
            if (obj == null) {
                return null;
            }
            android.media.session.MediaSession.QueueItem queueItem = (android.media.session.MediaSession.QueueItem) obj;
            return new android.support.v4.media.session.MediaSessionCompat.QueueItem(queueItem, android.support.v4.media.MediaDescriptionCompat.fromMediaDescription(android.support.v4.media.session.MediaSessionCompat.QueueItem.Api21Impl.getDescription(queueItem)), android.support.v4.media.session.MediaSessionCompat.QueueItem.Api21Impl.getQueueId(queueItem));
        }

        public static java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> fromQueueItemList(java.util.List<?> list) {
            if (list == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            java.util.Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(fromQueueItem(it.next()));
            }
            return arrayList;
        }

        public java.lang.String toString() {
            return "MediaSession.QueueItem {Description=" + this.mDescription + ", Id=" + this.mId + " }";
        }

        private static class Api21Impl {
            private Api21Impl() {
            }

            static android.media.session.MediaSession.QueueItem createQueueItem(android.media.MediaDescription mediaDescription, long j) {
                return new android.media.session.MediaSession.QueueItem(mediaDescription, j);
            }

            static android.media.MediaDescription getDescription(android.media.session.MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            static long getQueueId(android.media.session.MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }
    }

    static final class ResultReceiverWrapper implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper> CREATOR = new android.os.Parcelable.Creator<android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper>() { // from class: android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper createFromParcel(android.os.Parcel parcel) {
                return new android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper[] newArray(int i) {
                return new android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper[i];
            }
        };
        android.os.ResultReceiver mResultReceiver;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public ResultReceiverWrapper(android.os.ResultReceiver resultReceiver) {
            this.mResultReceiver = resultReceiver;
        }

        ResultReceiverWrapper(android.os.Parcel parcel) {
            this.mResultReceiver = (android.os.ResultReceiver) android.os.ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            this.mResultReceiver.writeToParcel(parcel, i);
        }
    }

    static class MediaSessionImplBase implements android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl {
        static final int RCC_PLAYSTATE_NONE = 0;
        final android.media.AudioManager mAudioManager;
        volatile android.support.v4.media.session.MediaSessionCompat.Callback mCallback;
        boolean mCaptioningEnabled;
        private final android.content.Context mContext;
        android.os.Bundle mExtras;
        private android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.MessageHandler mHandler;
        int mLocalStream;
        private final android.content.ComponentName mMediaButtonReceiverComponentName;
        private final android.app.PendingIntent mMediaButtonReceiverIntent;
        android.support.v4.media.MediaMetadataCompat mMetadata;
        java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> mQueue;
        java.lang.CharSequence mQueueTitle;
        int mRatingType;
        final android.media.RemoteControlClient mRcc;
        android.support.v4.media.session.MediaSessionCompat.RegistrationCallbackHandler mRegistrationCallbackHandler;
        private androidx.media.MediaSessionManager.RemoteUserInfo mRemoteUserInfo;
        int mRepeatMode;
        android.app.PendingIntent mSessionActivity;
        final android.os.Bundle mSessionInfo;
        int mShuffleMode;
        android.support.v4.media.session.PlaybackStateCompat mState;
        private final android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.MediaSessionStub mStub;
        private final android.support.v4.media.session.MediaSessionCompat.Token mToken;
        androidx.media.VolumeProviderCompat mVolumeProvider;
        int mVolumeType;
        final java.lang.Object mLock = new java.lang.Object();
        final android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> mControllerCallbacks = new android.os.RemoteCallbackList<>();
        boolean mDestroyed = false;
        boolean mIsActive = false;
        int mFlags = 3;
        private androidx.media.VolumeProviderCompat.Callback mVolumeCallback = new androidx.media.VolumeProviderCompat.Callback() { // from class: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.1
            @Override // androidx.media.VolumeProviderCompat.Callback
            public void onVolumeChanged(androidx.media.VolumeProviderCompat volumeProviderCompat) {
                if (android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.this.mVolumeProvider != volumeProviderCompat) {
                    return;
                }
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.this.sendVolumeInfoChanged(new android.support.v4.media.session.ParcelableVolumeInfo(android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.this.mVolumeType, android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.this.mLocalStream, volumeProviderCompat.getVolumeControl(), volumeProviderCompat.getMaxVolume(), volumeProviderCompat.getCurrentVolume()));
            }
        };

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public java.lang.String getCallingPackage() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public java.lang.Object getMediaSession() {
            return null;
        }

        int getRccStateFromState(int i) {
            switch (i) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        int getRccTransportControlFlagsFromActions(long j) {
            int i = (1 & j) != 0 ? 32 : 0;
            if ((2 & j) != 0) {
                i |= 16;
            }
            if ((4 & j) != 0) {
                i |= 4;
            }
            if ((8 & j) != 0) {
                i |= 2;
            }
            if ((16 & j) != 0) {
                i |= 1;
            }
            if ((32 & j) != 0) {
                i |= 128;
            }
            if ((64 & j) != 0) {
                i |= 64;
            }
            return (j & 512) != 0 ? i | 8 : i;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public java.lang.Object getRemoteControlClient() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setMediaButtonReceiver(android.app.PendingIntent pendingIntent) {
        }

        public MediaSessionImplBase(android.content.Context context, java.lang.String str, android.content.ComponentName componentName, android.app.PendingIntent pendingIntent, androidx.versionedparcelable.VersionedParcelable versionedParcelable, android.os.Bundle bundle) {
            if (componentName == null) {
                throw new java.lang.IllegalArgumentException("MediaButtonReceiver component may not be null");
            }
            this.mContext = context;
            this.mSessionInfo = bundle;
            this.mAudioManager = (android.media.AudioManager) context.getSystemService("audio");
            this.mMediaButtonReceiverComponentName = componentName;
            this.mMediaButtonReceiverIntent = pendingIntent;
            android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.MediaSessionStub mediaSessionStub = new android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.MediaSessionStub(this, context.getPackageName(), str);
            this.mStub = mediaSessionStub;
            this.mToken = new android.support.v4.media.session.MediaSessionCompat.Token(mediaSessionStub, null, versionedParcelable);
            this.mRatingType = 0;
            this.mVolumeType = 1;
            this.mLocalStream = 3;
            this.mRcc = new android.media.RemoteControlClient(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCallback(android.support.v4.media.session.MediaSessionCompat.Callback callback, android.os.Handler handler) {
            synchronized (this.mLock) {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.MessageHandler messageHandler = this.mHandler;
                if (messageHandler != null) {
                    messageHandler.removeCallbacksAndMessages(null);
                }
                this.mHandler = (callback == null || handler == null) ? null : new android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.MessageHandler(handler.getLooper());
                if (this.mCallback != callback && this.mCallback != null) {
                    this.mCallback.setSessionImpl(null, null);
                }
                this.mCallback = callback;
                if (this.mCallback != null) {
                    this.mCallback.setSessionImpl(this, handler);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRegistrationCallback(android.support.v4.media.session.MediaSessionCompat.RegistrationCallback registrationCallback, android.os.Handler handler) {
            synchronized (this.mLock) {
                android.support.v4.media.session.MediaSessionCompat.RegistrationCallbackHandler registrationCallbackHandler = this.mRegistrationCallbackHandler;
                if (registrationCallbackHandler != null) {
                    registrationCallbackHandler.removeCallbacksAndMessages(null);
                }
                if (registrationCallback != null) {
                    this.mRegistrationCallbackHandler = new android.support.v4.media.session.MediaSessionCompat.RegistrationCallbackHandler(handler.getLooper(), registrationCallback);
                } else {
                    this.mRegistrationCallbackHandler = null;
                }
            }
        }

        void postToHandler(int i, int i2, int i3, java.lang.Object obj, android.os.Bundle bundle) {
            synchronized (this.mLock) {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.MessageHandler messageHandler = this.mHandler;
                if (messageHandler != null) {
                    android.os.Message messageObtainMessage = messageHandler.obtainMessage(i, i2, i3, obj);
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    int callingUid = android.os.Binder.getCallingUid();
                    bundle2.putInt("data_calling_uid", callingUid);
                    bundle2.putString(android.support.v4.media.session.MediaSessionCompat.DATA_CALLING_PACKAGE, getPackageNameForUid(callingUid));
                    int callingPid = android.os.Binder.getCallingPid();
                    if (callingPid > 0) {
                        bundle2.putInt("data_calling_pid", callingPid);
                    } else {
                        bundle2.putInt("data_calling_pid", -1);
                    }
                    if (bundle != null) {
                        bundle2.putBundle(android.support.v4.media.session.MediaSessionCompat.DATA_EXTRAS, bundle);
                    }
                    messageObtainMessage.setData(bundle2);
                    messageObtainMessage.sendToTarget();
                }
            }
        }

        java.lang.String getPackageNameForUid(int i) {
            java.lang.String nameForUid = this.mContext.getPackageManager().getNameForUid(i);
            return android.text.TextUtils.isEmpty(nameForUid) ? "android.media.session.MediaController" : nameForUid;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setFlags(int i) {
            synchronized (this.mLock) {
                this.mFlags = i | 1 | 2;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackToLocal(int i) {
            androidx.media.VolumeProviderCompat volumeProviderCompat = this.mVolumeProvider;
            if (volumeProviderCompat != null) {
                volumeProviderCompat.setCallback(null);
            }
            this.mLocalStream = i;
            this.mVolumeType = 1;
            int i2 = this.mVolumeType;
            int i3 = this.mLocalStream;
            sendVolumeInfoChanged(new android.support.v4.media.session.ParcelableVolumeInfo(i2, i3, 2, this.mAudioManager.getStreamMaxVolume(i3), this.mAudioManager.getStreamVolume(this.mLocalStream)));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackToRemote(androidx.media.VolumeProviderCompat volumeProviderCompat) {
            if (volumeProviderCompat == null) {
                throw new java.lang.IllegalArgumentException("volumeProvider may not be null");
            }
            androidx.media.VolumeProviderCompat volumeProviderCompat2 = this.mVolumeProvider;
            if (volumeProviderCompat2 != null) {
                volumeProviderCompat2.setCallback(null);
            }
            this.mVolumeType = 2;
            this.mVolumeProvider = volumeProviderCompat;
            sendVolumeInfoChanged(new android.support.v4.media.session.ParcelableVolumeInfo(this.mVolumeType, this.mLocalStream, this.mVolumeProvider.getVolumeControl(), this.mVolumeProvider.getMaxVolume(), this.mVolumeProvider.getCurrentVolume()));
            volumeProviderCompat.setCallback(this.mVolumeCallback);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setActive(boolean z) {
            if (z == this.mIsActive) {
                return;
            }
            this.mIsActive = z;
            updateMbrAndRcc();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public boolean isActive() {
            return this.mIsActive;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void sendSessionEvent(java.lang.String str, android.os.Bundle bundle) {
            sendEvent(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void release() {
            this.mIsActive = false;
            this.mDestroyed = true;
            updateMbrAndRcc();
            sendSessionDestroyed();
            setCallback(null, null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken() {
            return this.mToken;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackState(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat) {
            synchronized (this.mLock) {
                this.mState = playbackStateCompat;
            }
            sendState(playbackStateCompat);
            if (this.mIsActive) {
                if (playbackStateCompat == null) {
                    this.mRcc.setPlaybackState(0);
                    this.mRcc.setTransportControlFlags(0);
                } else {
                    setRccState(playbackStateCompat);
                    this.mRcc.setTransportControlFlags(getRccTransportControlFlagsFromActions(playbackStateCompat.getActions()));
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public android.support.v4.media.session.PlaybackStateCompat getPlaybackState() {
            android.support.v4.media.session.PlaybackStateCompat playbackStateCompat;
            synchronized (this.mLock) {
                playbackStateCompat = this.mState;
            }
            return playbackStateCompat;
        }

        void setRccState(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat) {
            this.mRcc.setPlaybackState(getRccStateFromState(playbackStateCompat.getState()));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setMetadata(android.support.v4.media.MediaMetadataCompat mediaMetadataCompat) {
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new android.support.v4.media.MediaMetadataCompat.Builder(mediaMetadataCompat, android.support.v4.media.session.MediaSessionCompat.sMaxBitmapSize).build();
            }
            synchronized (this.mLock) {
                this.mMetadata = mediaMetadataCompat;
            }
            sendMetadata(mediaMetadataCompat);
            if (this.mIsActive) {
                buildRccMetadata(mediaMetadataCompat == null ? null : mediaMetadataCompat.getBundle()).apply();
            }
        }

        android.media.RemoteControlClient.MetadataEditor buildRccMetadata(android.os.Bundle bundle) {
            android.media.RemoteControlClient.MetadataEditor metadataEditorEditMetadata = this.mRcc.editMetadata(true);
            if (bundle == null) {
                return metadataEditorEditMetadata;
            }
            if (bundle.containsKey("android.media.metadata.ART")) {
                android.graphics.Bitmap bitmapCopy = (android.graphics.Bitmap) bundle.getParcelable("android.media.metadata.ART");
                if (bitmapCopy != null) {
                    bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), false);
                }
                metadataEditorEditMetadata.putBitmap(100, bitmapCopy);
            } else if (bundle.containsKey("android.media.metadata.ALBUM_ART")) {
                android.graphics.Bitmap bitmapCopy2 = (android.graphics.Bitmap) bundle.getParcelable("android.media.metadata.ALBUM_ART");
                if (bitmapCopy2 != null) {
                    bitmapCopy2 = bitmapCopy2.copy(bitmapCopy2.getConfig(), false);
                }
                metadataEditorEditMetadata.putBitmap(100, bitmapCopy2);
            }
            if (bundle.containsKey("android.media.metadata.ALBUM")) {
                metadataEditorEditMetadata.putString(1, bundle.getString("android.media.metadata.ALBUM"));
            }
            if (bundle.containsKey("android.media.metadata.ALBUM_ARTIST")) {
                metadataEditorEditMetadata.putString(13, bundle.getString("android.media.metadata.ALBUM_ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.ARTIST")) {
                metadataEditorEditMetadata.putString(2, bundle.getString("android.media.metadata.ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.AUTHOR")) {
                metadataEditorEditMetadata.putString(3, bundle.getString("android.media.metadata.AUTHOR"));
            }
            if (bundle.containsKey("android.media.metadata.COMPILATION")) {
                metadataEditorEditMetadata.putString(15, bundle.getString("android.media.metadata.COMPILATION"));
            }
            if (bundle.containsKey("android.media.metadata.COMPOSER")) {
                metadataEditorEditMetadata.putString(4, bundle.getString("android.media.metadata.COMPOSER"));
            }
            if (bundle.containsKey("android.media.metadata.DATE")) {
                metadataEditorEditMetadata.putString(5, bundle.getString("android.media.metadata.DATE"));
            }
            if (bundle.containsKey("android.media.metadata.DISC_NUMBER")) {
                metadataEditorEditMetadata.putLong(14, bundle.getLong("android.media.metadata.DISC_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                metadataEditorEditMetadata.putLong(9, bundle.getLong("android.media.metadata.DURATION"));
            }
            if (bundle.containsKey("android.media.metadata.GENRE")) {
                metadataEditorEditMetadata.putString(6, bundle.getString("android.media.metadata.GENRE"));
            }
            if (bundle.containsKey("android.media.metadata.TITLE")) {
                metadataEditorEditMetadata.putString(7, bundle.getString("android.media.metadata.TITLE"));
            }
            if (bundle.containsKey("android.media.metadata.TRACK_NUMBER")) {
                metadataEditorEditMetadata.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.WRITER")) {
                metadataEditorEditMetadata.putString(11, bundle.getString("android.media.metadata.WRITER"));
            }
            return metadataEditorEditMetadata;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setSessionActivity(android.app.PendingIntent pendingIntent) {
            synchronized (this.mLock) {
                this.mSessionActivity = pendingIntent;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setQueue(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> list) {
            this.mQueue = list;
            sendQueue(list);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setQueueTitle(java.lang.CharSequence charSequence) {
            this.mQueueTitle = charSequence;
            sendQueueTitle(charSequence);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRatingType(int i) {
            this.mRatingType = i;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCaptioningEnabled(boolean z) {
            if (this.mCaptioningEnabled != z) {
                this.mCaptioningEnabled = z;
                sendCaptioningEnabled(z);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRepeatMode(int i) {
            if (this.mRepeatMode != i) {
                this.mRepeatMode = i;
                sendRepeatMode(i);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setShuffleMode(int i) {
            if (this.mShuffleMode != i) {
                this.mShuffleMode = i;
                sendShuffleMode(i);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setExtras(android.os.Bundle bundle) {
            this.mExtras = bundle;
            sendExtras(bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public androidx.media.MediaSessionManager.RemoteUserInfo getCurrentControllerInfo() {
            androidx.media.MediaSessionManager.RemoteUserInfo remoteUserInfo;
            synchronized (this.mLock) {
                remoteUserInfo = this.mRemoteUserInfo;
            }
            return remoteUserInfo;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCurrentControllerInfo(androidx.media.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            synchronized (this.mLock) {
                this.mRemoteUserInfo = remoteUserInfo;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public android.support.v4.media.session.MediaSessionCompat.Callback getCallback() {
            android.support.v4.media.session.MediaSessionCompat.Callback callback;
            synchronized (this.mLock) {
                callback = this.mCallback;
            }
            return callback;
        }

        void updateMbrAndRcc() {
            if (this.mIsActive) {
                registerMediaButtonEventReceiver(this.mMediaButtonReceiverIntent, this.mMediaButtonReceiverComponentName);
                this.mAudioManager.registerRemoteControlClient(this.mRcc);
                setMetadata(this.mMetadata);
                setPlaybackState(this.mState);
                return;
            }
            unregisterMediaButtonEventReceiver(this.mMediaButtonReceiverIntent, this.mMediaButtonReceiverComponentName);
            this.mRcc.setPlaybackState(0);
            this.mAudioManager.unregisterRemoteControlClient(this.mRcc);
        }

        void registerMediaButtonEventReceiver(android.app.PendingIntent pendingIntent, android.content.ComponentName componentName) {
            this.mAudioManager.registerMediaButtonEventReceiver(componentName);
        }

        void unregisterMediaButtonEventReceiver(android.app.PendingIntent pendingIntent, android.content.ComponentName componentName) {
            this.mAudioManager.unregisterMediaButtonEventReceiver(componentName);
        }

        void adjustVolume(int i, int i2) {
            if (this.mVolumeType == 2) {
                androidx.media.VolumeProviderCompat volumeProviderCompat = this.mVolumeProvider;
                if (volumeProviderCompat != null) {
                    volumeProviderCompat.onAdjustVolume(i);
                    return;
                }
                return;
            }
            this.mAudioManager.adjustStreamVolume(this.mLocalStream, i, i2);
        }

        void setVolumeTo(int i, int i2) {
            if (this.mVolumeType == 2) {
                androidx.media.VolumeProviderCompat volumeProviderCompat = this.mVolumeProvider;
                if (volumeProviderCompat != null) {
                    volumeProviderCompat.onSetVolumeTo(i);
                    return;
                }
                return;
            }
            this.mAudioManager.setStreamVolume(this.mLocalStream, i, i2);
        }

        void sendVolumeInfoChanged(android.support.v4.media.session.ParcelableVolumeInfo parcelableVolumeInfo) {
            synchronized (this.mLock) {
                for (int iBeginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onVolumeInfoChanged(parcelableVolumeInfo);
                    } catch (android.os.RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        private void sendSessionDestroyed() {
            synchronized (this.mLock) {
                for (int iBeginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onSessionDestroyed();
                    } catch (android.os.RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
                this.mControllerCallbacks.kill();
            }
        }

        private void sendEvent(java.lang.String str, android.os.Bundle bundle) {
            synchronized (this.mLock) {
                for (int iBeginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onEvent(str, bundle);
                    } catch (android.os.RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        private void sendState(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat) {
            synchronized (this.mLock) {
                for (int iBeginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onPlaybackStateChanged(playbackStateCompat);
                    } catch (android.os.RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        private void sendMetadata(android.support.v4.media.MediaMetadataCompat mediaMetadataCompat) {
            synchronized (this.mLock) {
                for (int iBeginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onMetadataChanged(mediaMetadataCompat);
                    } catch (android.os.RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        private void sendQueue(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> list) {
            synchronized (this.mLock) {
                for (int iBeginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onQueueChanged(list);
                    } catch (android.os.RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        private void sendQueueTitle(java.lang.CharSequence charSequence) {
            synchronized (this.mLock) {
                for (int iBeginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onQueueTitleChanged(charSequence);
                    } catch (android.os.RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        private void sendCaptioningEnabled(boolean z) {
            synchronized (this.mLock) {
                for (int iBeginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onCaptioningEnabledChanged(z);
                    } catch (android.os.RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        private void sendRepeatMode(int i) {
            synchronized (this.mLock) {
                for (int iBeginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onRepeatModeChanged(i);
                    } catch (android.os.RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        private void sendShuffleMode(int i) {
            synchronized (this.mLock) {
                for (int iBeginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onShuffleModeChanged(i);
                    } catch (android.os.RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        private void sendExtras(android.os.Bundle bundle) {
            synchronized (this.mLock) {
                for (int iBeginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onExtrasChanged(bundle);
                    } catch (android.os.RemoteException unused) {
                    }
                }
                this.mControllerCallbacks.finishBroadcast();
            }
        }

        static class MediaSessionStub extends android.support.v4.media.session.IMediaSession.Stub {
            private final java.util.concurrent.atomic.AtomicReference<android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase> mMediaSessionImplRef;
            private final java.lang.String mPackageName;
            private final java.lang.String mTag;

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isShuffleModeEnabledRemoved() {
                return false;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isTransportControlEnabled() {
                return true;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleModeEnabledRemoved(boolean z) {
            }

            MediaSessionStub(android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase mediaSessionImplBase, java.lang.String str, java.lang.String str2) {
                this.mMediaSessionImplRef = new java.util.concurrent.atomic.AtomicReference<>(mediaSessionImplBase);
                this.mPackageName = str;
                this.mTag = str2;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCommand(java.lang.String str, android.os.Bundle bundle, android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) {
                postToHandler(1, new android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.Command(str, bundle, resultReceiverWrapper == null ? null : resultReceiverWrapper.mResultReceiver));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean sendMediaButton(android.view.KeyEvent keyEvent) {
                postToHandler(21, keyEvent);
                return true;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void registerCallbackListener(android.support.v4.media.session.IMediaControllerCallback iMediaControllerCallback) {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase == null) {
                    try {
                        iMediaControllerCallback.onSessionDestroyed();
                        return;
                    } catch (java.lang.Exception unused) {
                        return;
                    }
                }
                int callingPid = android.os.Binder.getCallingPid();
                int callingUid = android.os.Binder.getCallingUid();
                mediaSessionImplBase.mControllerCallbacks.register(iMediaControllerCallback, new androidx.media.MediaSessionManager.RemoteUserInfo(mediaSessionImplBase.getPackageNameForUid(callingUid), callingPid, callingUid));
                synchronized (mediaSessionImplBase.mLock) {
                    if (mediaSessionImplBase.mRegistrationCallbackHandler != null) {
                        mediaSessionImplBase.mRegistrationCallbackHandler.postCallbackRegistered(callingPid, callingUid);
                    }
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void unregisterCallbackListener(android.support.v4.media.session.IMediaControllerCallback iMediaControllerCallback) {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase == null) {
                    return;
                }
                mediaSessionImplBase.mControllerCallbacks.unregister(iMediaControllerCallback);
                int callingPid = android.os.Binder.getCallingPid();
                int callingUid = android.os.Binder.getCallingUid();
                synchronized (mediaSessionImplBase.mLock) {
                    if (mediaSessionImplBase.mRegistrationCallbackHandler != null) {
                        mediaSessionImplBase.mRegistrationCallbackHandler.postCallbackUnregistered(callingPid, callingUid);
                    }
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.lang.String getPackageName() {
                return this.mPackageName;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.os.Bundle getSessionInfo() {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase == null || mediaSessionImplBase.mSessionInfo == null) {
                    return null;
                }
                return new android.os.Bundle(mediaSessionImplBase.mSessionInfo);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.lang.String getTag() {
                return this.mTag;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.app.PendingIntent getLaunchPendingIntent() {
                android.app.PendingIntent pendingIntent;
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase == null) {
                    return null;
                }
                synchronized (mediaSessionImplBase.mLock) {
                    pendingIntent = mediaSessionImplBase.mSessionActivity;
                }
                return pendingIntent;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public long getFlags() {
                long j;
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase == null) {
                    return 0L;
                }
                synchronized (mediaSessionImplBase.mLock) {
                    j = mediaSessionImplBase.mFlags;
                }
                return j;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.support.v4.media.session.ParcelableVolumeInfo getVolumeAttributes() {
                int streamVolume;
                int i;
                android.support.v4.media.session.ParcelableVolumeInfo parcelableVolumeInfo;
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase == null) {
                    return null;
                }
                synchronized (mediaSessionImplBase.mLock) {
                    int i2 = mediaSessionImplBase.mVolumeType;
                    int i3 = mediaSessionImplBase.mLocalStream;
                    androidx.media.VolumeProviderCompat volumeProviderCompat = mediaSessionImplBase.mVolumeProvider;
                    int i4 = 2;
                    if (i2 == 2) {
                        int volumeControl = volumeProviderCompat.getVolumeControl();
                        int maxVolume = volumeProviderCompat.getMaxVolume();
                        streamVolume = volumeProviderCompat.getCurrentVolume();
                        i = maxVolume;
                        i4 = volumeControl;
                    } else {
                        int streamMaxVolume = mediaSessionImplBase.mAudioManager.getStreamMaxVolume(i3);
                        streamVolume = mediaSessionImplBase.mAudioManager.getStreamVolume(i3);
                        i = streamMaxVolume;
                    }
                    parcelableVolumeInfo = new android.support.v4.media.session.ParcelableVolumeInfo(i2, i3, i4, i, streamVolume);
                }
                return parcelableVolumeInfo;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void adjustVolume(int i, int i2, java.lang.String str) {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase != null) {
                    mediaSessionImplBase.adjustVolume(i, i2);
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setVolumeTo(int i, int i2, java.lang.String str) {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase != null) {
                    mediaSessionImplBase.setVolumeTo(i, i2);
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepare() throws android.os.RemoteException {
                postToHandler(3);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromMediaId(java.lang.String str, android.os.Bundle bundle) {
                postToHandler(4, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromSearch(java.lang.String str, android.os.Bundle bundle) {
                postToHandler(5, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromUri(android.net.Uri uri, android.os.Bundle bundle) {
                postToHandler(6, uri, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void play() throws android.os.RemoteException {
                postToHandler(7);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromMediaId(java.lang.String str, android.os.Bundle bundle) {
                postToHandler(8, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromSearch(java.lang.String str, android.os.Bundle bundle) {
                postToHandler(9, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromUri(android.net.Uri uri, android.os.Bundle bundle) {
                postToHandler(10, uri, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void skipToQueueItem(long j) {
                postToHandler(11, java.lang.Long.valueOf(j));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void pause() {
                postToHandler(12);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void stop() {
                postToHandler(13);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void next() {
                postToHandler(14);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void previous() {
                postToHandler(15);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void fastForward() {
                postToHandler(16);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rewind() {
                postToHandler(17);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void seekTo(long j) {
                postToHandler(18, java.lang.Long.valueOf(j));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rate(android.support.v4.media.RatingCompat ratingCompat) {
                postToHandler(19, ratingCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rateWithExtras(android.support.v4.media.RatingCompat ratingCompat, android.os.Bundle bundle) {
                postToHandler(31, ratingCompat, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setPlaybackSpeed(float f) {
                postToHandler(32, java.lang.Float.valueOf(f));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setCaptioningEnabled(boolean z) {
                postToHandler(29, java.lang.Boolean.valueOf(z));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setRepeatMode(int i) {
                postToHandler(23, i);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleMode(int i) {
                postToHandler(30, i);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCustomAction(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                postToHandler(20, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.support.v4.media.MediaMetadataCompat getMetadata() {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase != null) {
                    return mediaSessionImplBase.mMetadata;
                }
                return null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.support.v4.media.session.PlaybackStateCompat getPlaybackState() {
                android.support.v4.media.session.PlaybackStateCompat playbackStateCompat;
                android.support.v4.media.MediaMetadataCompat mediaMetadataCompat;
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase == null) {
                    return null;
                }
                synchronized (mediaSessionImplBase.mLock) {
                    playbackStateCompat = mediaSessionImplBase.mState;
                    mediaMetadataCompat = mediaSessionImplBase.mMetadata;
                }
                return android.support.v4.media.session.MediaSessionCompat.getStateWithUpdatedPosition(playbackStateCompat, mediaMetadataCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> getQueue() {
                java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> list;
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase == null) {
                    return null;
                }
                synchronized (mediaSessionImplBase.mLock) {
                    list = mediaSessionImplBase.mQueue;
                }
                return list;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) {
                postToHandler(25, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItemAt(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat, int i) {
                postToHandler(26, mediaDescriptionCompat, i, null);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) {
                postToHandler(27, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItemAt(int i) {
                postToHandler(28, i);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.lang.CharSequence getQueueTitle() {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase != null) {
                    return mediaSessionImplBase.mQueueTitle;
                }
                return null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.os.Bundle getExtras() {
                android.os.Bundle bundle;
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase == null) {
                    return null;
                }
                synchronized (mediaSessionImplBase.mLock) {
                    bundle = mediaSessionImplBase.mExtras;
                }
                return bundle;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRatingType() {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase != null) {
                    return mediaSessionImplBase.mRatingType;
                }
                return 0;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isCaptioningEnabled() {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                return mediaSessionImplBase != null && mediaSessionImplBase.mCaptioningEnabled;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRepeatMode() {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase != null) {
                    return mediaSessionImplBase.mRepeatMode;
                }
                return -1;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getShuffleMode() {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase != null) {
                    return mediaSessionImplBase.mShuffleMode;
                }
                return -1;
            }

            void postToHandler(int i) {
                postToHandler(i, null, 0, null);
            }

            void postToHandler(int i, int i2) {
                postToHandler(i, null, i2, null);
            }

            void postToHandler(int i, java.lang.Object obj) {
                postToHandler(i, obj, 0, null);
            }

            void postToHandler(int i, java.lang.Object obj, android.os.Bundle bundle) {
                postToHandler(i, obj, 0, bundle);
            }

            void postToHandler(int i, java.lang.Object obj, int i2, android.os.Bundle bundle) {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase mediaSessionImplBase = this.mMediaSessionImplRef.get();
                if (mediaSessionImplBase != null) {
                    mediaSessionImplBase.postToHandler(i, i2, 0, obj, bundle);
                }
            }
        }

        private static final class Command {
            public final java.lang.String command;
            public final android.os.Bundle extras;
            public final android.os.ResultReceiver stub;

            public Command(java.lang.String str, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
                this.command = str;
                this.extras = bundle;
                this.stub = resultReceiver;
            }
        }

        class MessageHandler extends android.os.Handler {
            private static final int KEYCODE_MEDIA_PAUSE = 127;
            private static final int KEYCODE_MEDIA_PLAY = 126;
            private static final int MSG_ADD_QUEUE_ITEM = 25;
            private static final int MSG_ADD_QUEUE_ITEM_AT = 26;
            private static final int MSG_ADJUST_VOLUME = 2;
            private static final int MSG_COMMAND = 1;
            private static final int MSG_CUSTOM_ACTION = 20;
            private static final int MSG_FAST_FORWARD = 16;
            private static final int MSG_MEDIA_BUTTON = 21;
            private static final int MSG_NEXT = 14;
            private static final int MSG_PAUSE = 12;
            private static final int MSG_PLAY = 7;
            private static final int MSG_PLAY_MEDIA_ID = 8;
            private static final int MSG_PLAY_SEARCH = 9;
            private static final int MSG_PLAY_URI = 10;
            private static final int MSG_PREPARE = 3;
            private static final int MSG_PREPARE_MEDIA_ID = 4;
            private static final int MSG_PREPARE_SEARCH = 5;
            private static final int MSG_PREPARE_URI = 6;
            private static final int MSG_PREVIOUS = 15;
            private static final int MSG_RATE = 19;
            private static final int MSG_RATE_EXTRA = 31;
            private static final int MSG_REMOVE_QUEUE_ITEM = 27;
            private static final int MSG_REMOVE_QUEUE_ITEM_AT = 28;
            private static final int MSG_REWIND = 17;
            private static final int MSG_SEEK_TO = 18;
            private static final int MSG_SET_CAPTIONING_ENABLED = 29;
            private static final int MSG_SET_PLAYBACK_SPEED = 32;
            private static final int MSG_SET_REPEAT_MODE = 23;
            private static final int MSG_SET_SHUFFLE_MODE = 30;
            private static final int MSG_SET_VOLUME = 22;
            private static final int MSG_SKIP_TO_ITEM = 11;
            private static final int MSG_STOP = 13;

            public MessageHandler(android.os.Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(android.os.Message message) {
                android.support.v4.media.session.MediaSessionCompat.Callback callback = android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.this.mCallback;
                if (callback == null) {
                    return;
                }
                android.os.Bundle data = message.getData();
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(data);
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.this.setCurrentControllerInfo(new androidx.media.MediaSessionManager.RemoteUserInfo(data.getString(android.support.v4.media.session.MediaSessionCompat.DATA_CALLING_PACKAGE), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                android.os.Bundle bundle = data.getBundle(android.support.v4.media.session.MediaSessionCompat.DATA_EXTRAS);
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(bundle);
                try {
                    switch (message.what) {
                        case 1:
                            android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.Command command = (android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.Command) message.obj;
                            callback.onCommand(command.command, command.extras, command.stub);
                            break;
                        case 2:
                            android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.this.adjustVolume(message.arg1, 0);
                            break;
                        case 3:
                            callback.onPrepare();
                            break;
                        case 4:
                            callback.onPrepareFromMediaId((java.lang.String) message.obj, bundle);
                            break;
                        case 5:
                            callback.onPrepareFromSearch((java.lang.String) message.obj, bundle);
                            break;
                        case 6:
                            callback.onPrepareFromUri((android.net.Uri) message.obj, bundle);
                            break;
                        case 7:
                            callback.onPlay();
                            break;
                        case 8:
                            callback.onPlayFromMediaId((java.lang.String) message.obj, bundle);
                            break;
                        case 9:
                            callback.onPlayFromSearch((java.lang.String) message.obj, bundle);
                            break;
                        case 10:
                            callback.onPlayFromUri((android.net.Uri) message.obj, bundle);
                            break;
                        case 11:
                            callback.onSkipToQueueItem(((java.lang.Long) message.obj).longValue());
                            break;
                        case 12:
                            callback.onPause();
                            break;
                        case 13:
                            callback.onStop();
                            break;
                        case 14:
                            callback.onSkipToNext();
                            break;
                        case 15:
                            callback.onSkipToPrevious();
                            break;
                        case 16:
                            callback.onFastForward();
                            break;
                        case 17:
                            callback.onRewind();
                            break;
                        case 18:
                            callback.onSeekTo(((java.lang.Long) message.obj).longValue());
                            break;
                        case 19:
                            callback.onSetRating((android.support.v4.media.RatingCompat) message.obj);
                            break;
                        case 20:
                            callback.onCustomAction((java.lang.String) message.obj, bundle);
                            break;
                        case 21:
                            android.view.KeyEvent keyEvent = (android.view.KeyEvent) message.obj;
                            android.content.Intent intent = new android.content.Intent("android.intent.action.MEDIA_BUTTON");
                            intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                            if (!callback.onMediaButtonEvent(intent)) {
                                onMediaButtonEvent(keyEvent, callback);
                            }
                            break;
                        case 22:
                            android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.this.setVolumeTo(message.arg1, 0);
                            break;
                        case 23:
                            callback.onSetRepeatMode(message.arg1);
                            break;
                        case 25:
                            callback.onAddQueueItem((android.support.v4.media.MediaDescriptionCompat) message.obj);
                            break;
                        case 26:
                            callback.onAddQueueItem((android.support.v4.media.MediaDescriptionCompat) message.obj, message.arg1);
                            break;
                        case 27:
                            callback.onRemoveQueueItem((android.support.v4.media.MediaDescriptionCompat) message.obj);
                            break;
                        case 28:
                            if (android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.this.mQueue != null) {
                                android.support.v4.media.session.MediaSessionCompat.QueueItem queueItem = (message.arg1 < 0 || message.arg1 >= android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.this.mQueue.size()) ? null : android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.this.mQueue.get(message.arg1);
                                if (queueItem != null) {
                                    callback.onRemoveQueueItem(queueItem.getDescription());
                                }
                            }
                            break;
                        case 29:
                            callback.onSetCaptioningEnabled(((java.lang.Boolean) message.obj).booleanValue());
                            break;
                        case 30:
                            callback.onSetShuffleMode(message.arg1);
                            break;
                        case 31:
                            callback.onSetRating((android.support.v4.media.RatingCompat) message.obj, bundle);
                            break;
                        case 32:
                            callback.onSetPlaybackSpeed(((java.lang.Float) message.obj).floatValue());
                            break;
                    }
                } finally {
                    android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.this.setCurrentControllerInfo(null);
                }
            }

            private void onMediaButtonEvent(android.view.KeyEvent keyEvent, android.support.v4.media.session.MediaSessionCompat.Callback callback) {
                if (keyEvent == null || keyEvent.getAction() != 0) {
                    return;
                }
                long actions = android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.this.mState == null ? 0L : android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.this.mState.getActions();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79) {
                    if (keyCode == 126) {
                        if ((actions & 4) != 0) {
                            callback.onPlay();
                            return;
                        }
                        return;
                    }
                    if (keyCode == 127) {
                        if ((actions & 2) != 0) {
                            callback.onPause();
                            return;
                        }
                        return;
                    }
                    switch (keyCode) {
                        case 86:
                            if ((actions & 1) != 0) {
                                callback.onStop();
                            }
                            break;
                        case 87:
                            if ((actions & 32) != 0) {
                                callback.onSkipToNext();
                            }
                            break;
                        case 88:
                            if ((actions & 16) != 0) {
                                callback.onSkipToPrevious();
                            }
                            break;
                        case 89:
                            if ((actions & 8) != 0) {
                                callback.onRewind();
                            }
                            break;
                        case 90:
                            if ((actions & 64) != 0) {
                                callback.onFastForward();
                            }
                            break;
                    }
                }
                android.util.Log.w(android.support.v4.media.session.MediaSessionCompat.TAG, "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
            }
        }
    }

    static class MediaSessionImplApi18 extends android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase {
        private static boolean sIsMbrPendingIntentSupported = true;

        MediaSessionImplApi18(android.content.Context context, java.lang.String str, android.content.ComponentName componentName, android.app.PendingIntent pendingIntent, androidx.versionedparcelable.VersionedParcelable versionedParcelable, android.os.Bundle bundle) {
            super(context, str, componentName, pendingIntent, versionedParcelable, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCallback(android.support.v4.media.session.MediaSessionCompat.Callback callback, android.os.Handler handler) {
            super.setCallback(callback, handler);
            if (callback == null) {
                this.mRcc.setPlaybackPositionUpdateListener(null);
            } else {
                this.mRcc.setPlaybackPositionUpdateListener(new android.media.RemoteControlClient.OnPlaybackPositionUpdateListener() { // from class: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18.1
                    @Override // android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
                    public void onPlaybackPositionUpdate(long j) {
                        android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18.this.postToHandler(18, -1, -1, java.lang.Long.valueOf(j), null);
                    }
                });
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        void setRccState(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat) {
            long position = playbackStateCompat.getPosition();
            float playbackSpeed = playbackStateCompat.getPlaybackSpeed();
            long lastPositionUpdateTime = playbackStateCompat.getLastPositionUpdateTime();
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (playbackStateCompat.getState() == 3) {
                long j = 0;
                if (position > 0) {
                    if (lastPositionUpdateTime > 0) {
                        j = jElapsedRealtime - lastPositionUpdateTime;
                        if (playbackSpeed > 0.0f && playbackSpeed != 1.0f) {
                            j = (long) (j * playbackSpeed);
                        }
                    }
                    position += j;
                }
            }
            this.mRcc.setPlaybackState(getRccStateFromState(playbackStateCompat.getState()), position, playbackSpeed);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        int getRccTransportControlFlagsFromActions(long j) {
            int rccTransportControlFlagsFromActions = super.getRccTransportControlFlagsFromActions(j);
            return (j & 256) != 0 ? rccTransportControlFlagsFromActions | 256 : rccTransportControlFlagsFromActions;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        void registerMediaButtonEventReceiver(android.app.PendingIntent pendingIntent, android.content.ComponentName componentName) {
            if (sIsMbrPendingIntentSupported) {
                try {
                    this.mAudioManager.registerMediaButtonEventReceiver(pendingIntent);
                } catch (java.lang.NullPointerException unused) {
                    android.util.Log.w(android.support.v4.media.session.MediaSessionCompat.TAG, "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
                    sIsMbrPendingIntentSupported = false;
                }
            }
            if (sIsMbrPendingIntentSupported) {
                return;
            }
            super.registerMediaButtonEventReceiver(pendingIntent, componentName);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        void unregisterMediaButtonEventReceiver(android.app.PendingIntent pendingIntent, android.content.ComponentName componentName) {
            if (sIsMbrPendingIntentSupported) {
                this.mAudioManager.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.unregisterMediaButtonEventReceiver(pendingIntent, componentName);
            }
        }
    }

    static class MediaSessionImplApi19 extends android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18 {
        MediaSessionImplApi19(android.content.Context context, java.lang.String str, android.content.ComponentName componentName, android.app.PendingIntent pendingIntent, androidx.versionedparcelable.VersionedParcelable versionedParcelable, android.os.Bundle bundle) {
            super(context, str, componentName, pendingIntent, versionedParcelable, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18, android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCallback(android.support.v4.media.session.MediaSessionCompat.Callback callback, android.os.Handler handler) {
            super.setCallback(callback, handler);
            if (callback == null) {
                this.mRcc.setMetadataUpdateListener(null);
            } else {
                this.mRcc.setMetadataUpdateListener(new android.media.RemoteControlClient.OnMetadataUpdateListener() { // from class: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi19.1
                    @Override // android.media.RemoteControlClient.OnMetadataUpdateListener
                    public void onMetadataUpdate(int i, java.lang.Object obj) {
                        if (i == 268435457 && (obj instanceof android.media.Rating)) {
                            android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi19.this.postToHandler(19, -1, -1, android.support.v4.media.RatingCompat.fromRating(obj), null);
                        }
                    }
                });
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18, android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        int getRccTransportControlFlagsFromActions(long j) {
            int rccTransportControlFlagsFromActions = super.getRccTransportControlFlagsFromActions(j);
            return (j & 128) != 0 ? rccTransportControlFlagsFromActions | 512 : rccTransportControlFlagsFromActions;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        android.media.RemoteControlClient.MetadataEditor buildRccMetadata(android.os.Bundle bundle) {
            android.media.RemoteControlClient.MetadataEditor metadataEditorBuildRccMetadata = super.buildRccMetadata(bundle);
            if (((this.mState == null ? 0L : this.mState.getActions()) & 128) != 0) {
                metadataEditorBuildRccMetadata.addEditableKey(268435457);
            }
            if (bundle == null) {
                return metadataEditorBuildRccMetadata;
            }
            if (bundle.containsKey("android.media.metadata.YEAR")) {
                metadataEditorBuildRccMetadata.putLong(8, bundle.getLong("android.media.metadata.YEAR"));
            }
            if (bundle.containsKey("android.media.metadata.RATING")) {
                metadataEditorBuildRccMetadata.putObject(101, (java.lang.Object) bundle.getParcelable("android.media.metadata.RATING"));
            }
            if (bundle.containsKey("android.media.metadata.USER_RATING")) {
                metadataEditorBuildRccMetadata.putObject(268435457, (java.lang.Object) bundle.getParcelable("android.media.metadata.USER_RATING"));
            }
            return metadataEditorBuildRccMetadata;
        }
    }

    static class MediaSessionImplApi21 implements android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl {
        android.support.v4.media.session.MediaSessionCompat.Callback mCallback;
        boolean mCaptioningEnabled;
        final android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21.ExtraSession mExtraSession;
        android.support.v4.media.MediaMetadataCompat mMetadata;
        android.support.v4.media.session.PlaybackStateCompat mPlaybackState;
        java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> mQueue;
        int mRatingType;
        android.support.v4.media.session.MediaSessionCompat.RegistrationCallbackHandler mRegistrationCallbackHandler;
        androidx.media.MediaSessionManager.RemoteUserInfo mRemoteUserInfo;
        int mRepeatMode;
        final android.media.session.MediaSession mSessionFwk;
        android.os.Bundle mSessionInfo;
        int mShuffleMode;
        final android.support.v4.media.session.MediaSessionCompat.Token mToken;
        final java.lang.Object mLock = new java.lang.Object();
        boolean mDestroyed = false;
        final android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> mExtraControllerCallbacks = new android.os.RemoteCallbackList<>();

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public java.lang.Object getRemoteControlClient() {
            return null;
        }

        MediaSessionImplApi21(android.content.Context context, java.lang.String str, androidx.versionedparcelable.VersionedParcelable versionedParcelable, android.os.Bundle bundle) {
            android.media.session.MediaSession mediaSessionCreateFwkMediaSession = createFwkMediaSession(context, str, bundle);
            this.mSessionFwk = mediaSessionCreateFwkMediaSession;
            android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21.ExtraSession extraSession = new android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21.ExtraSession(this);
            this.mExtraSession = extraSession;
            this.mToken = new android.support.v4.media.session.MediaSessionCompat.Token(mediaSessionCreateFwkMediaSession.getSessionToken(), extraSession, versionedParcelable);
            this.mSessionInfo = bundle;
            setFlags(3);
        }

        MediaSessionImplApi21(java.lang.Object obj) {
            if (!(obj instanceof android.media.session.MediaSession)) {
                throw new java.lang.IllegalArgumentException("mediaSession is not a valid MediaSession object");
            }
            android.media.session.MediaSession mediaSession = (android.media.session.MediaSession) obj;
            this.mSessionFwk = mediaSession;
            android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21.ExtraSession extraSession = new android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21.ExtraSession(this);
            this.mExtraSession = extraSession;
            this.mToken = new android.support.v4.media.session.MediaSessionCompat.Token(mediaSession.getSessionToken(), extraSession);
            this.mSessionInfo = null;
            setFlags(3);
        }

        public android.media.session.MediaSession createFwkMediaSession(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
            return new android.media.session.MediaSession(context, str);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCallback(android.support.v4.media.session.MediaSessionCompat.Callback callback, android.os.Handler handler) {
            synchronized (this.mLock) {
                this.mCallback = callback;
                this.mSessionFwk.setCallback(callback == null ? null : callback.mCallbackFwk, handler);
                if (callback != null) {
                    callback.setSessionImpl(this, handler);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRegistrationCallback(android.support.v4.media.session.MediaSessionCompat.RegistrationCallback registrationCallback, android.os.Handler handler) {
            synchronized (this.mLock) {
                android.support.v4.media.session.MediaSessionCompat.RegistrationCallbackHandler registrationCallbackHandler = this.mRegistrationCallbackHandler;
                if (registrationCallbackHandler != null) {
                    registrationCallbackHandler.removeCallbacksAndMessages(null);
                }
                if (registrationCallback != null) {
                    this.mRegistrationCallbackHandler = new android.support.v4.media.session.MediaSessionCompat.RegistrationCallbackHandler(handler.getLooper(), registrationCallback);
                } else {
                    this.mRegistrationCallbackHandler = null;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setFlags(int i) {
            this.mSessionFwk.setFlags(i | 1 | 2);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackToLocal(int i) {
            android.media.AudioAttributes.Builder builder = new android.media.AudioAttributes.Builder();
            builder.setLegacyStreamType(i);
            this.mSessionFwk.setPlaybackToLocal(builder.build());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackToRemote(androidx.media.VolumeProviderCompat volumeProviderCompat) {
            this.mSessionFwk.setPlaybackToRemote((android.media.VolumeProvider) volumeProviderCompat.getVolumeProvider());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setActive(boolean z) {
            this.mSessionFwk.setActive(z);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public boolean isActive() {
            return this.mSessionFwk.isActive();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void sendSessionEvent(java.lang.String str, android.os.Bundle bundle) {
            this.mSessionFwk.sendSessionEvent(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void release() {
            this.mDestroyed = true;
            this.mExtraControllerCallbacks.kill();
            if (android.os.Build.VERSION.SDK_INT == 27) {
                try {
                    java.lang.reflect.Field declaredField = this.mSessionFwk.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    android.os.Handler handler = (android.os.Handler) declaredField.get(this.mSessionFwk);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                } catch (java.lang.Exception e) {
                    android.util.Log.w(android.support.v4.media.session.MediaSessionCompat.TAG, "Exception happened while accessing MediaSession.mCallback.", e);
                }
            }
            this.mSessionFwk.setCallback(null);
            this.mExtraSession.release();
            this.mSessionFwk.release();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken() {
            return this.mToken;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackState(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat) {
            this.mPlaybackState = playbackStateCompat;
            synchronized (this.mLock) {
                for (int iBeginBroadcast = this.mExtraControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.IMediaControllerCallback) this.mExtraControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onPlaybackStateChanged(playbackStateCompat);
                    } catch (android.os.RemoteException unused) {
                    }
                }
                this.mExtraControllerCallbacks.finishBroadcast();
            }
            this.mSessionFwk.setPlaybackState(playbackStateCompat == null ? null : (android.media.session.PlaybackState) playbackStateCompat.getPlaybackState());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public android.support.v4.media.session.PlaybackStateCompat getPlaybackState() {
            return this.mPlaybackState;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setMetadata(android.support.v4.media.MediaMetadataCompat mediaMetadataCompat) {
            this.mMetadata = mediaMetadataCompat;
            this.mSessionFwk.setMetadata(mediaMetadataCompat == null ? null : (android.media.MediaMetadata) mediaMetadataCompat.getMediaMetadata());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setSessionActivity(android.app.PendingIntent pendingIntent) {
            this.mSessionFwk.setSessionActivity(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setMediaButtonReceiver(android.app.PendingIntent pendingIntent) {
            this.mSessionFwk.setMediaButtonReceiver(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setQueue(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> list) {
            this.mQueue = list;
            if (list == null) {
                this.mSessionFwk.setQueue(null);
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            java.util.Iterator<android.support.v4.media.session.MediaSessionCompat.QueueItem> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((android.media.session.MediaSession.QueueItem) it.next().getQueueItem());
            }
            this.mSessionFwk.setQueue(arrayList);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setQueueTitle(java.lang.CharSequence charSequence) {
            this.mSessionFwk.setQueueTitle(charSequence);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRatingType(int i) {
            this.mRatingType = i;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCaptioningEnabled(boolean z) {
            if (this.mCaptioningEnabled != z) {
                this.mCaptioningEnabled = z;
                synchronized (this.mLock) {
                    for (int iBeginBroadcast = this.mExtraControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                        try {
                            ((android.support.v4.media.session.IMediaControllerCallback) this.mExtraControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onCaptioningEnabledChanged(z);
                        } catch (android.os.RemoteException unused) {
                        }
                    }
                    this.mExtraControllerCallbacks.finishBroadcast();
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRepeatMode(int i) {
            if (this.mRepeatMode != i) {
                this.mRepeatMode = i;
                synchronized (this.mLock) {
                    for (int iBeginBroadcast = this.mExtraControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                        try {
                            ((android.support.v4.media.session.IMediaControllerCallback) this.mExtraControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onRepeatModeChanged(i);
                        } catch (android.os.RemoteException unused) {
                        }
                    }
                    this.mExtraControllerCallbacks.finishBroadcast();
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setShuffleMode(int i) {
            if (this.mShuffleMode != i) {
                this.mShuffleMode = i;
                synchronized (this.mLock) {
                    for (int iBeginBroadcast = this.mExtraControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                        try {
                            ((android.support.v4.media.session.IMediaControllerCallback) this.mExtraControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onShuffleModeChanged(i);
                        } catch (android.os.RemoteException unused) {
                        }
                    }
                    this.mExtraControllerCallbacks.finishBroadcast();
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setExtras(android.os.Bundle bundle) {
            this.mSessionFwk.setExtras(bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public java.lang.Object getMediaSession() {
            return this.mSessionFwk;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCurrentControllerInfo(androidx.media.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            synchronized (this.mLock) {
                this.mRemoteUserInfo = remoteUserInfo;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public java.lang.String getCallingPackage() {
            try {
                return (java.lang.String) this.mSessionFwk.getClass().getMethod("getCallingPackage", new java.lang.Class[0]).invoke(this.mSessionFwk, new java.lang.Object[0]);
            } catch (java.lang.Exception e) {
                android.util.Log.e(android.support.v4.media.session.MediaSessionCompat.TAG, "Cannot execute MediaSession.getCallingPackage()", e);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public androidx.media.MediaSessionManager.RemoteUserInfo getCurrentControllerInfo() {
            androidx.media.MediaSessionManager.RemoteUserInfo remoteUserInfo;
            synchronized (this.mLock) {
                remoteUserInfo = this.mRemoteUserInfo;
            }
            return remoteUserInfo;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public android.support.v4.media.session.MediaSessionCompat.Callback getCallback() {
            android.support.v4.media.session.MediaSessionCompat.Callback callback;
            synchronized (this.mLock) {
                callback = this.mCallback;
            }
            return callback;
        }

        private static class ExtraSession extends android.support.v4.media.session.IMediaSession.Stub {
            private final java.util.concurrent.atomic.AtomicReference<android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21> mMediaSessionImplRef;

            @Override // android.support.v4.media.session.IMediaSession
            public java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> getQueue() {
                return null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isShuffleModeEnabledRemoved() {
                return false;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleModeEnabledRemoved(boolean z) {
            }

            ExtraSession(android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 mediaSessionImplApi21) {
                this.mMediaSessionImplRef = new java.util.concurrent.atomic.AtomicReference<>(mediaSessionImplApi21);
            }

            public void release() {
                this.mMediaSessionImplRef.set(null);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCommand(java.lang.String str, android.os.Bundle bundle, android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean sendMediaButton(android.view.KeyEvent keyEvent) {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void registerCallbackListener(android.support.v4.media.session.IMediaControllerCallback iMediaControllerCallback) {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();
                if (mediaSessionImplApi21 == null) {
                    return;
                }
                int callingPid = android.os.Binder.getCallingPid();
                int callingUid = android.os.Binder.getCallingUid();
                mediaSessionImplApi21.mExtraControllerCallbacks.register(iMediaControllerCallback, new androidx.media.MediaSessionManager.RemoteUserInfo("android.media.session.MediaController", callingPid, callingUid));
                synchronized (mediaSessionImplApi21.mLock) {
                    if (mediaSessionImplApi21.mRegistrationCallbackHandler != null) {
                        mediaSessionImplApi21.mRegistrationCallbackHandler.postCallbackRegistered(callingPid, callingUid);
                    }
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void unregisterCallbackListener(android.support.v4.media.session.IMediaControllerCallback iMediaControllerCallback) {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();
                if (mediaSessionImplApi21 == null) {
                    return;
                }
                mediaSessionImplApi21.mExtraControllerCallbacks.unregister(iMediaControllerCallback);
                int callingPid = android.os.Binder.getCallingPid();
                int callingUid = android.os.Binder.getCallingUid();
                synchronized (mediaSessionImplApi21.mLock) {
                    if (mediaSessionImplApi21.mRegistrationCallbackHandler != null) {
                        mediaSessionImplApi21.mRegistrationCallbackHandler.postCallbackUnregistered(callingPid, callingUid);
                    }
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.lang.String getPackageName() {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.os.Bundle getSessionInfo() {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();
                if (mediaSessionImplApi21.mSessionInfo == null) {
                    return null;
                }
                return new android.os.Bundle(mediaSessionImplApi21.mSessionInfo);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.lang.String getTag() {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.app.PendingIntent getLaunchPendingIntent() {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public long getFlags() {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.support.v4.media.session.ParcelableVolumeInfo getVolumeAttributes() {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void adjustVolume(int i, int i2, java.lang.String str) {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setVolumeTo(int i, int i2, java.lang.String str) {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepare() throws android.os.RemoteException {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromMediaId(java.lang.String str, android.os.Bundle bundle) {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromSearch(java.lang.String str, android.os.Bundle bundle) {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromUri(android.net.Uri uri, android.os.Bundle bundle) {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void play() throws android.os.RemoteException {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromMediaId(java.lang.String str, android.os.Bundle bundle) {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromSearch(java.lang.String str, android.os.Bundle bundle) {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromUri(android.net.Uri uri, android.os.Bundle bundle) {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void skipToQueueItem(long j) {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void pause() {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void stop() {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void next() {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void previous() {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void fastForward() {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rewind() {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void seekTo(long j) {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rate(android.support.v4.media.RatingCompat ratingCompat) {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rateWithExtras(android.support.v4.media.RatingCompat ratingCompat, android.os.Bundle bundle) {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setPlaybackSpeed(float f) {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setCaptioningEnabled(boolean z) {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setRepeatMode(int i) {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleMode(int i) throws android.os.RemoteException {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCustomAction(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.support.v4.media.MediaMetadataCompat getMetadata() {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.support.v4.media.session.PlaybackStateCompat getPlaybackState() {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();
                if (mediaSessionImplApi21 != null) {
                    return android.support.v4.media.session.MediaSessionCompat.getStateWithUpdatedPosition(mediaSessionImplApi21.mPlaybackState, mediaSessionImplApi21.mMetadata);
                }
                return null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItemAt(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItemAt(int i) {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.lang.CharSequence getQueueTitle() {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.os.Bundle getExtras() {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRatingType() {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();
                if (mediaSessionImplApi21 != null) {
                    return mediaSessionImplApi21.mRatingType;
                }
                return 0;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isCaptioningEnabled() {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();
                return mediaSessionImplApi21 != null && mediaSessionImplApi21.mCaptioningEnabled;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRepeatMode() {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();
                if (mediaSessionImplApi21 != null) {
                    return mediaSessionImplApi21.mRepeatMode;
                }
                return -1;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getShuffleMode() {
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 mediaSessionImplApi21 = this.mMediaSessionImplRef.get();
                if (mediaSessionImplApi21 != null) {
                    return mediaSessionImplApi21.mShuffleMode;
                }
                return -1;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isTransportControlEnabled() {
                throw new java.lang.AssertionError();
            }
        }
    }

    static class MediaSessionImplApi22 extends android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 {
        MediaSessionImplApi22(android.content.Context context, java.lang.String str, androidx.versionedparcelable.VersionedParcelable versionedParcelable, android.os.Bundle bundle) {
            super(context, str, versionedParcelable, bundle);
        }

        MediaSessionImplApi22(java.lang.Object obj) {
            super(obj);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRatingType(int i) {
            this.mSessionFwk.setRatingType(i);
        }
    }

    static class MediaSessionImplApi28 extends android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi22 {
        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCurrentControllerInfo(androidx.media.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        }

        MediaSessionImplApi28(android.content.Context context, java.lang.String str, androidx.versionedparcelable.VersionedParcelable versionedParcelable, android.os.Bundle bundle) {
            super(context, str, versionedParcelable, bundle);
        }

        MediaSessionImplApi28(java.lang.Object obj) {
            super(obj);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public final androidx.media.MediaSessionManager.RemoteUserInfo getCurrentControllerInfo() {
            return new androidx.media.MediaSessionManager.RemoteUserInfo(this.mSessionFwk.getCurrentControllerInfo());
        }
    }

    static class MediaSessionImplApi29 extends android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi28 {
        MediaSessionImplApi29(android.content.Context context, java.lang.String str, androidx.versionedparcelable.VersionedParcelable versionedParcelable, android.os.Bundle bundle) {
            super(context, str, versionedParcelable, bundle);
        }

        MediaSessionImplApi29(java.lang.Object obj) {
            super(obj);
            this.mSessionInfo = ((android.media.session.MediaSession) obj).getController().getSessionInfo();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21
        public android.media.session.MediaSession createFwkMediaSession(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
            return new android.media.session.MediaSession(context, str, bundle);
        }
    }

    static final class RegistrationCallbackHandler extends android.os.Handler {
        private static final int MSG_CALLBACK_REGISTERED = 1001;
        private static final int MSG_CALLBACK_UNREGISTERED = 1002;
        private final android.support.v4.media.session.MediaSessionCompat.RegistrationCallback mCallback;

        RegistrationCallbackHandler(android.os.Looper looper, android.support.v4.media.session.MediaSessionCompat.RegistrationCallback registrationCallback) {
            super(looper);
            this.mCallback = registrationCallback;
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1001) {
                this.mCallback.onCallbackRegistered(message.arg1, message.arg2);
            } else {
                if (i != 1002) {
                    return;
                }
                this.mCallback.onCallbackUnregistered(message.arg1, message.arg2);
            }
        }

        public void postCallbackRegistered(int i, int i2) {
            obtainMessage(1001, i, i2).sendToTarget();
        }

        public void postCallbackUnregistered(int i, int i2) {
            obtainMessage(1002, i, i2).sendToTarget();
        }
    }
}
