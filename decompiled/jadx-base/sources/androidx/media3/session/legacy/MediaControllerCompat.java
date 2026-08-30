package androidx.media3.session.legacy;

/* JADX INFO: loaded from: classes.dex */
public final class MediaControllerCompat {
    public static final java.lang.String COMMAND_ADD_QUEUE_ITEM = "android.support.v4.media.session.command.ADD_QUEUE_ITEM";
    public static final java.lang.String COMMAND_ADD_QUEUE_ITEM_AT = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";
    public static final java.lang.String COMMAND_ARGUMENT_INDEX = "android.support.v4.media.session.command.ARGUMENT_INDEX";
    public static final java.lang.String COMMAND_ARGUMENT_MEDIA_DESCRIPTION = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";
    public static final java.lang.String COMMAND_GET_EXTRA_BINDER = "android.support.v4.media.session.command.GET_EXTRA_BINDER";
    public static final java.lang.String COMMAND_REMOVE_QUEUE_ITEM = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM";
    public static final java.lang.String COMMAND_REMOVE_QUEUE_ITEM_AT = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";
    static final java.lang.String TAG = "MediaControllerCompat";
    private final androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl mImpl;
    private final java.util.Set<androidx.media3.session.legacy.MediaControllerCompat.Callback> mRegisteredCallbacks;
    private final androidx.media3.session.legacy.MediaSessionCompat.Token mToken;

    interface MediaControllerImpl {
        void addQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat);

        void addQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat, int i);

        void adjustVolume(int i, int i2);

        boolean dispatchMediaButtonEvent(android.view.KeyEvent keyEvent);

        android.os.Bundle getExtras();

        long getFlags();

        java.lang.Object getMediaController();

        androidx.media3.session.legacy.MediaMetadataCompat getMetadata();

        java.lang.String getPackageName();

        androidx.media3.session.legacy.MediaControllerCompat.PlaybackInfo getPlaybackInfo();

        androidx.media3.session.legacy.PlaybackStateCompat getPlaybackState();

        java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> getQueue();

        java.lang.CharSequence getQueueTitle();

        int getRatingType();

        int getRepeatMode();

        android.app.PendingIntent getSessionActivity();

        android.os.Bundle getSessionInfo();

        int getShuffleMode();

        androidx.media3.session.legacy.MediaControllerCompat.TransportControls getTransportControls();

        boolean isCaptioningEnabled();

        boolean isSessionReady();

        void registerCallback(androidx.media3.session.legacy.MediaControllerCompat.Callback callback, android.os.Handler handler);

        void removeQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat);

        void sendCommand(java.lang.String str, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver);

        void setVolumeTo(int i, int i2);

        void unregisterCallback(androidx.media3.session.legacy.MediaControllerCompat.Callback callback);
    }

    public static void setMediaController(android.app.Activity activity, androidx.media3.session.legacy.MediaControllerCompat mediaControllerCompat) {
        activity.getWindow().getDecorView().setTag(androidx.media3.session.R.id.media_controller_compat_view_tag, mediaControllerCompat);
        androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImplApi21.setMediaController(activity, mediaControllerCompat);
    }

    public static androidx.media3.session.legacy.MediaControllerCompat getMediaController(android.app.Activity activity) {
        java.lang.Object tag = activity.getWindow().getDecorView().getTag(androidx.media3.session.R.id.media_controller_compat_view_tag);
        if (tag instanceof androidx.media3.session.legacy.MediaControllerCompat) {
            return (androidx.media3.session.legacy.MediaControllerCompat) tag;
        }
        return androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImplApi21.getMediaController(activity);
    }

    static void validateCustomAction(java.lang.String str, android.os.Bundle bundle) {
        if (str == null) {
            return;
        }
        str.hashCode();
        if (str.equals("android.support.v4.media.session.action.FOLLOW") || str.equals("android.support.v4.media.session.action.UNFOLLOW")) {
            if (bundle == null || !bundle.containsKey("android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE")) {
                throw new java.lang.IllegalArgumentException("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action " + str + ".");
            }
        }
    }

    public MediaControllerCompat(android.content.Context context, androidx.media3.session.legacy.MediaSessionCompat mediaSessionCompat) {
        this(context, mediaSessionCompat.getSessionToken());
    }

    public MediaControllerCompat(android.content.Context context, androidx.media3.session.legacy.MediaSessionCompat.Token token) {
        if (token == null) {
            throw new java.lang.IllegalArgumentException("sessionToken must not be null");
        }
        this.mRegisteredCallbacks = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.mToken = token;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.mImpl = new androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImplApi29(context, token);
        } else {
            this.mImpl = new androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImplApi21(context, token);
        }
    }

    public androidx.media3.session.legacy.MediaControllerCompat.TransportControls getTransportControls() {
        return this.mImpl.getTransportControls();
    }

    public boolean dispatchMediaButtonEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent == null) {
            throw new java.lang.IllegalArgumentException("KeyEvent may not be null");
        }
        return this.mImpl.dispatchMediaButtonEvent(keyEvent);
    }

    public androidx.media3.session.legacy.PlaybackStateCompat getPlaybackState() {
        return this.mImpl.getPlaybackState();
    }

    public androidx.media3.session.legacy.MediaMetadataCompat getMetadata() {
        return this.mImpl.getMetadata();
    }

    public java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> getQueue() {
        return this.mImpl.getQueue();
    }

    public void addQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat) {
        this.mImpl.addQueueItem(mediaDescriptionCompat);
    }

    public void addQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat, int i) {
        this.mImpl.addQueueItem(mediaDescriptionCompat, i);
    }

    public void removeQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat) {
        this.mImpl.removeQueueItem(mediaDescriptionCompat);
    }

    @java.lang.Deprecated
    public void removeQueueItemAt(int i) {
        androidx.media3.session.legacy.MediaSessionCompat.QueueItem queueItem;
        java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> queue = getQueue();
        if (queue == null || i < 0 || i >= queue.size() || (queueItem = queue.get(i)) == null) {
            return;
        }
        removeQueueItem(queueItem.getDescription());
    }

    public java.lang.CharSequence getQueueTitle() {
        return this.mImpl.getQueueTitle();
    }

    public android.os.Bundle getExtras() {
        return this.mImpl.getExtras();
    }

    public int getRatingType() {
        return this.mImpl.getRatingType();
    }

    public boolean isCaptioningEnabled() {
        return this.mImpl.isCaptioningEnabled();
    }

    public int getRepeatMode() {
        return this.mImpl.getRepeatMode();
    }

    public int getShuffleMode() {
        return this.mImpl.getShuffleMode();
    }

    public long getFlags() {
        return this.mImpl.getFlags();
    }

    public androidx.media3.session.legacy.MediaControllerCompat.PlaybackInfo getPlaybackInfo() {
        return this.mImpl.getPlaybackInfo();
    }

    public android.app.PendingIntent getSessionActivity() {
        return this.mImpl.getSessionActivity();
    }

    public androidx.media3.session.legacy.MediaSessionCompat.Token getSessionToken() {
        return this.mToken;
    }

    public androidx.versionedparcelable.VersionedParcelable getSession2Token() {
        return this.mToken.getSession2Token();
    }

    public void setVolumeTo(int i, int i2) {
        this.mImpl.setVolumeTo(i, i2);
    }

    public void adjustVolume(int i, int i2) {
        this.mImpl.adjustVolume(i, i2);
    }

    public void registerCallback(androidx.media3.session.legacy.MediaControllerCompat.Callback callback) {
        registerCallback(callback, null);
    }

    public void registerCallback(androidx.media3.session.legacy.MediaControllerCompat.Callback callback, android.os.Handler handler) {
        if (callback == null) {
            throw new java.lang.IllegalArgumentException("callback must not be null");
        }
        if (!this.mRegisteredCallbacks.add(callback)) {
            android.util.Log.w(TAG, "the callback has already been registered");
            return;
        }
        if (handler == null) {
            handler = new android.os.Handler();
        }
        callback.setHandler(handler);
        this.mImpl.registerCallback(callback, handler);
    }

    public void unregisterCallback(androidx.media3.session.legacy.MediaControllerCompat.Callback callback) {
        if (callback == null) {
            throw new java.lang.IllegalArgumentException("callback must not be null");
        }
        if (!this.mRegisteredCallbacks.remove(callback)) {
            android.util.Log.w(TAG, "the callback has never been registered");
            return;
        }
        try {
            this.mImpl.unregisterCallback(callback);
        } finally {
            callback.setHandler(null);
        }
    }

    public void sendCommand(java.lang.String str, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("command must neither be null nor empty");
        }
        this.mImpl.sendCommand(str, bundle, resultReceiver);
    }

    public boolean isSessionReady() {
        return this.mImpl.isSessionReady();
    }

    public java.lang.String getPackageName() {
        return this.mImpl.getPackageName();
    }

    public android.os.Bundle getSessionInfo() {
        return this.mImpl.getSessionInfo();
    }

    public java.lang.Object getMediaController() {
        return this.mImpl.getMediaController();
    }

    public static abstract class Callback implements android.os.IBinder.DeathRecipient {
        final android.media.session.MediaController.Callback mCallbackFwk = new androidx.media3.session.legacy.MediaControllerCompat.Callback.MediaControllerCallbackApi21(this);
        androidx.media3.session.legacy.MediaControllerCompat.Callback.MessageHandler mHandler;
        androidx.media3.session.legacy.IMediaControllerCallback mIControllerCallback;

        public void onAudioInfoChanged(androidx.media3.session.legacy.MediaControllerCompat.PlaybackInfo playbackInfo) {
        }

        public void onCaptioningEnabledChanged(boolean z) {
        }

        public void onExtrasChanged(android.os.Bundle bundle) {
        }

        public void onMetadataChanged(androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat) {
        }

        public void onPlaybackStateChanged(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat) {
        }

        public void onQueueChanged(java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> list) {
        }

        public void onQueueTitleChanged(java.lang.CharSequence charSequence) {
        }

        public void onRepeatModeChanged(int i) {
        }

        public void onSessionDestroyed() {
        }

        public void onSessionEvent(java.lang.String str, android.os.Bundle bundle) {
        }

        public void onSessionReady() {
        }

        public void onShuffleModeChanged(int i) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            postToHandler(8, null, null);
        }

        void setHandler(android.os.Handler handler) {
            if (handler == null) {
                androidx.media3.session.legacy.MediaControllerCompat.Callback.MessageHandler messageHandler = this.mHandler;
                if (messageHandler != null) {
                    messageHandler.mRegistered = false;
                    this.mHandler.removeCallbacksAndMessages(null);
                    this.mHandler = null;
                    return;
                }
                return;
            }
            androidx.media3.session.legacy.MediaControllerCompat.Callback.MessageHandler messageHandler2 = new androidx.media3.session.legacy.MediaControllerCompat.Callback.MessageHandler(handler.getLooper());
            this.mHandler = messageHandler2;
            messageHandler2.mRegistered = true;
        }

        void postToHandler(int i, java.lang.Object obj, android.os.Bundle bundle) {
            androidx.media3.session.legacy.MediaControllerCompat.Callback.MessageHandler messageHandler = this.mHandler;
            if (messageHandler != null) {
                android.os.Message messageObtainMessage = messageHandler.obtainMessage(i, obj);
                if (bundle != null) {
                    messageObtainMessage.setData(bundle);
                }
                messageObtainMessage.sendToTarget();
            }
        }

        private static class MediaControllerCallbackApi21 extends android.media.session.MediaController.Callback {
            private final java.lang.ref.WeakReference<androidx.media3.session.legacy.MediaControllerCompat.Callback> mCallback;

            MediaControllerCallbackApi21(androidx.media3.session.legacy.MediaControllerCompat.Callback callback) {
                this.mCallback = new java.lang.ref.WeakReference<>(callback);
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionDestroyed() {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.onSessionDestroyed();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionEvent(java.lang.String str, android.os.Bundle bundle) {
                androidx.media3.session.legacy.MediaSessionCompat.ensureClassLoader(bundle);
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    androidx.media3.session.legacy.IMediaControllerCallback iMediaControllerCallback = callback.mIControllerCallback;
                    callback.onSessionEvent(str, bundle);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onPlaybackStateChanged(android.media.session.PlaybackState playbackState) {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback == null || callback.mIControllerCallback != null) {
                    return;
                }
                callback.onPlaybackStateChanged(androidx.media3.session.legacy.PlaybackStateCompat.fromPlaybackState(playbackState));
            }

            @Override // android.media.session.MediaController.Callback
            public void onMetadataChanged(android.media.MediaMetadata mediaMetadata) {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.onMetadataChanged(androidx.media3.session.legacy.MediaMetadataCompat.fromMediaMetadata(mediaMetadata));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueChanged(java.util.List<android.media.session.MediaSession.QueueItem> list) {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.onQueueChanged(androidx.media3.session.legacy.MediaSessionCompat.QueueItem.fromQueueItemList(list));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueTitleChanged(java.lang.CharSequence charSequence) {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.onQueueTitleChanged(charSequence);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onExtrasChanged(android.os.Bundle bundle) {
                androidx.media3.session.legacy.MediaSessionCompat.ensureClassLoader(bundle);
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.onExtrasChanged(bundle);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onAudioInfoChanged(android.media.session.MediaController.PlaybackInfo playbackInfo) {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback == null || playbackInfo == null) {
                    return;
                }
                callback.onAudioInfoChanged(new androidx.media3.session.legacy.MediaControllerCompat.PlaybackInfo(playbackInfo.getPlaybackType(), (androidx.media3.session.legacy.AudioAttributesCompat) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.AudioAttributesCompat.wrap(playbackInfo.getAudioAttributes())), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
            }
        }

        private static class StubCompat extends androidx.media3.session.legacy.IMediaControllerCallback.Stub {
            private final java.lang.ref.WeakReference<androidx.media3.session.legacy.MediaControllerCompat.Callback> mCallback;

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onShuffleModeChangedRemoved(boolean z) throws android.os.RemoteException {
            }

            StubCompat(androidx.media3.session.legacy.MediaControllerCompat.Callback callback) {
                this.mCallback = new java.lang.ref.WeakReference<>(callback);
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onEvent(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(1, str, bundle);
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onSessionDestroyed() throws android.os.RemoteException {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(8, null, null);
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onPlaybackStateChanged(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat) throws android.os.RemoteException {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(2, playbackStateCompat, null);
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onMetadataChanged(androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat) throws android.os.RemoteException {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(3, mediaMetadataCompat, null);
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onQueueChanged(java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> list) throws android.os.RemoteException {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(5, list, null);
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onQueueTitleChanged(java.lang.CharSequence charSequence) throws android.os.RemoteException {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(6, charSequence, null);
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onCaptioningEnabledChanged(boolean z) throws android.os.RemoteException {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(11, java.lang.Boolean.valueOf(z), null);
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onRepeatModeChanged(int i) throws android.os.RemoteException {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(9, java.lang.Integer.valueOf(i), null);
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onShuffleModeChanged(int i) throws android.os.RemoteException {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(12, java.lang.Integer.valueOf(i), null);
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onExtrasChanged(android.os.Bundle bundle) throws android.os.RemoteException {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(7, bundle, null);
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onVolumeInfoChanged(androidx.media3.session.legacy.ParcelableVolumeInfo parcelableVolumeInfo) throws android.os.RemoteException {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(4, parcelableVolumeInfo != null ? new androidx.media3.session.legacy.MediaControllerCompat.PlaybackInfo(parcelableVolumeInfo.volumeType, parcelableVolumeInfo.audioStream, parcelableVolumeInfo.controlType, parcelableVolumeInfo.maxVolume, parcelableVolumeInfo.currentVolume) : null, null);
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onSessionReady() throws android.os.RemoteException {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(13, null, null);
                }
            }
        }

        private class MessageHandler extends android.os.Handler {
            private static final int MSG_DESTROYED = 8;
            private static final int MSG_EVENT = 1;
            private static final int MSG_SESSION_READY = 13;
            private static final int MSG_UPDATE_CAPTIONING_ENABLED = 11;
            private static final int MSG_UPDATE_EXTRAS = 7;
            private static final int MSG_UPDATE_METADATA = 3;
            private static final int MSG_UPDATE_PLAYBACK_STATE = 2;
            private static final int MSG_UPDATE_QUEUE = 5;
            private static final int MSG_UPDATE_QUEUE_TITLE = 6;
            private static final int MSG_UPDATE_REPEAT_MODE = 9;
            private static final int MSG_UPDATE_SHUFFLE_MODE = 12;
            private static final int MSG_UPDATE_VOLUME = 4;
            boolean mRegistered;

            MessageHandler(android.os.Looper looper) {
                super(looper);
                this.mRegistered = false;
            }

            @Override // android.os.Handler
            public void handleMessage(android.os.Message message) {
                if (this.mRegistered) {
                    switch (message.what) {
                        case 1:
                            android.os.Bundle data = message.getData();
                            androidx.media3.session.legacy.MediaSessionCompat.ensureClassLoader(data);
                            androidx.media3.session.legacy.MediaControllerCompat.Callback.this.onSessionEvent((java.lang.String) message.obj, data);
                            break;
                        case 2:
                            androidx.media3.session.legacy.MediaControllerCompat.Callback.this.onPlaybackStateChanged((androidx.media3.session.legacy.PlaybackStateCompat) message.obj);
                            break;
                        case 3:
                            androidx.media3.session.legacy.MediaControllerCompat.Callback.this.onMetadataChanged((androidx.media3.session.legacy.MediaMetadataCompat) message.obj);
                            break;
                        case 4:
                            androidx.media3.session.legacy.MediaControllerCompat.Callback.this.onAudioInfoChanged((androidx.media3.session.legacy.MediaControllerCompat.PlaybackInfo) message.obj);
                            break;
                        case 5:
                            androidx.media3.session.legacy.MediaControllerCompat.Callback.this.onQueueChanged((java.util.List) message.obj);
                            break;
                        case 6:
                            androidx.media3.session.legacy.MediaControllerCompat.Callback.this.onQueueTitleChanged((java.lang.CharSequence) message.obj);
                            break;
                        case 7:
                            android.os.Bundle bundle = (android.os.Bundle) message.obj;
                            androidx.media3.session.legacy.MediaSessionCompat.ensureClassLoader(bundle);
                            androidx.media3.session.legacy.MediaControllerCompat.Callback.this.onExtrasChanged(bundle);
                            break;
                        case 8:
                            androidx.media3.session.legacy.MediaControllerCompat.Callback.this.onSessionDestroyed();
                            break;
                        case 9:
                            androidx.media3.session.legacy.MediaControllerCompat.Callback.this.onRepeatModeChanged(((java.lang.Integer) message.obj).intValue());
                            break;
                        case 11:
                            androidx.media3.session.legacy.MediaControllerCompat.Callback.this.onCaptioningEnabledChanged(((java.lang.Boolean) message.obj).booleanValue());
                            break;
                        case 12:
                            androidx.media3.session.legacy.MediaControllerCompat.Callback.this.onShuffleModeChanged(((java.lang.Integer) message.obj).intValue());
                            break;
                        case 13:
                            androidx.media3.session.legacy.MediaControllerCompat.Callback.this.onSessionReady();
                            break;
                    }
                }
            }
        }
    }

    public static abstract class TransportControls {

        @java.lang.Deprecated
        public static final java.lang.String EXTRA_LEGACY_STREAM_TYPE = "android.media.session.extra.LEGACY_STREAM_TYPE";

        public abstract void fastForward();

        public abstract void pause();

        public abstract void play();

        public abstract void playFromMediaId(java.lang.String str, android.os.Bundle bundle);

        public abstract void playFromSearch(java.lang.String str, android.os.Bundle bundle);

        public abstract void playFromUri(android.net.Uri uri, android.os.Bundle bundle);

        public abstract void prepare();

        public abstract void prepareFromMediaId(java.lang.String str, android.os.Bundle bundle);

        public abstract void prepareFromSearch(java.lang.String str, android.os.Bundle bundle);

        public abstract void prepareFromUri(android.net.Uri uri, android.os.Bundle bundle);

        public abstract void rewind();

        public abstract void seekTo(long j);

        public abstract void sendCustomAction(androidx.media3.session.legacy.PlaybackStateCompat.CustomAction customAction, android.os.Bundle bundle);

        public abstract void sendCustomAction(java.lang.String str, android.os.Bundle bundle);

        public abstract void setCaptioningEnabled(boolean z);

        public void setPlaybackSpeed(float f) {
        }

        public abstract void setRating(androidx.media3.session.legacy.RatingCompat ratingCompat);

        public abstract void setRating(androidx.media3.session.legacy.RatingCompat ratingCompat, android.os.Bundle bundle);

        public abstract void setRepeatMode(int i);

        public abstract void setShuffleMode(int i);

        public abstract void skipToNext();

        public abstract void skipToPrevious();

        public abstract void skipToQueueItem(long j);

        public abstract void stop();

        TransportControls() {
        }
    }

    public static final class PlaybackInfo {
        public static final int PLAYBACK_TYPE_LOCAL = 1;
        public static final int PLAYBACK_TYPE_REMOTE = 2;
        private final androidx.media3.session.legacy.AudioAttributesCompat mAudioAttrsCompat;
        private final int mCurrentVolume;
        private final int mMaxVolume;
        private final int mPlaybackType;
        private final int mVolumeControl;

        PlaybackInfo(int i, int i2, int i3, int i4, int i5) {
            this(i, new androidx.media3.session.legacy.AudioAttributesCompat.Builder().setLegacyStreamType(i2).build(), i3, i4, i5);
        }

        PlaybackInfo(int i, androidx.media3.session.legacy.AudioAttributesCompat audioAttributesCompat, int i2, int i3, int i4) {
            this.mPlaybackType = i;
            this.mAudioAttrsCompat = audioAttributesCompat;
            this.mVolumeControl = i2;
            this.mMaxVolume = i3;
            this.mCurrentVolume = i4;
        }

        public int getPlaybackType() {
            return this.mPlaybackType;
        }

        @java.lang.Deprecated
        public int getAudioStream() {
            return this.mAudioAttrsCompat.getLegacyStreamType();
        }

        public androidx.media3.session.legacy.AudioAttributesCompat getAudioAttributes() {
            return this.mAudioAttrsCompat;
        }

        public int getVolumeControl() {
            return this.mVolumeControl;
        }

        public int getMaxVolume() {
            return this.mMaxVolume;
        }

        public int getCurrentVolume() {
            return this.mCurrentVolume;
        }
    }

    static class MediaControllerImplBase implements androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl {
        private androidx.media3.session.legacy.IMediaSession mBinder;
        private android.os.Bundle mSessionInfo;
        private androidx.media3.session.legacy.MediaControllerCompat.TransportControls mTransportControls;

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public java.lang.Object getMediaController() {
            return null;
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public boolean isSessionReady() {
            return true;
        }

        MediaControllerImplBase(androidx.media3.session.legacy.MediaSessionCompat.Token token) {
            this.mBinder = androidx.media3.session.legacy.IMediaSession.Stub.asInterface((android.os.IBinder) token.getToken());
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public void registerCallback(androidx.media3.session.legacy.MediaControllerCompat.Callback callback, android.os.Handler handler) {
            if (callback == null) {
                throw new java.lang.IllegalArgumentException("callback may not be null.");
            }
            try {
                this.mBinder.asBinder().linkToDeath(callback, 0);
                this.mBinder.registerCallbackListener((androidx.media3.session.legacy.IMediaControllerCallback) androidx.media3.common.util.Assertions.checkNotNull(callback.mIControllerCallback));
                callback.postToHandler(13, null, null);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in registerCallback.", e);
                callback.postToHandler(8, null, null);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public void unregisterCallback(androidx.media3.session.legacy.MediaControllerCompat.Callback callback) {
            if (callback == null) {
                throw new java.lang.IllegalArgumentException("callback may not be null.");
            }
            try {
                this.mBinder.unregisterCallbackListener((androidx.media3.session.legacy.IMediaControllerCallback) androidx.media3.common.util.Assertions.checkNotNull(callback.mIControllerCallback));
                this.mBinder.asBinder().unlinkToDeath(callback, 0);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in unregisterCallback.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public boolean dispatchMediaButtonEvent(android.view.KeyEvent keyEvent) {
            if (keyEvent == null) {
                throw new java.lang.IllegalArgumentException("event may not be null.");
            }
            try {
                this.mBinder.sendMediaButton(keyEvent);
                return false;
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in dispatchMediaButtonEvent.", e);
                return false;
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public androidx.media3.session.legacy.MediaControllerCompat.TransportControls getTransportControls() {
            if (this.mTransportControls == null) {
                this.mTransportControls = new androidx.media3.session.legacy.MediaControllerCompat.TransportControlsBase(this.mBinder);
            }
            return this.mTransportControls;
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public androidx.media3.session.legacy.PlaybackStateCompat getPlaybackState() {
            try {
                return this.mBinder.getPlaybackState();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in getPlaybackState.", e);
                return null;
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public androidx.media3.session.legacy.MediaMetadataCompat getMetadata() {
            try {
                return this.mBinder.getMetadata();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in getMetadata.", e);
                return null;
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> getQueue() {
            try {
                return this.mBinder.getQueue();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in getQueue.", e);
                return null;
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public void addQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat) {
            try {
                if ((this.mBinder.getFlags() & 4) == 0) {
                    throw new java.lang.UnsupportedOperationException("This session doesn't support queue management operations");
                }
                this.mBinder.addQueueItem(mediaDescriptionCompat);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in addQueueItem.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public void addQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat, int i) {
            try {
                if ((this.mBinder.getFlags() & 4) == 0) {
                    throw new java.lang.UnsupportedOperationException("This session doesn't support queue management operations");
                }
                this.mBinder.addQueueItemAt(mediaDescriptionCompat, i);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in addQueueItemAt.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public void removeQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat) {
            try {
                if ((this.mBinder.getFlags() & 4) == 0) {
                    throw new java.lang.UnsupportedOperationException("This session doesn't support queue management operations");
                }
                this.mBinder.removeQueueItem(mediaDescriptionCompat);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in removeQueueItem.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public java.lang.CharSequence getQueueTitle() {
            try {
                return this.mBinder.getQueueTitle();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in getQueueTitle.", e);
                return null;
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public android.os.Bundle getExtras() {
            try {
                return this.mBinder.getExtras();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in getExtras.", e);
                return null;
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public int getRatingType() {
            try {
                return this.mBinder.getRatingType();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in getRatingType.", e);
                return 0;
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public boolean isCaptioningEnabled() {
            try {
                return this.mBinder.isCaptioningEnabled();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in isCaptioningEnabled.", e);
                return false;
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public int getRepeatMode() {
            try {
                return this.mBinder.getRepeatMode();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in getRepeatMode.", e);
                return -1;
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public int getShuffleMode() {
            try {
                return this.mBinder.getShuffleMode();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in getShuffleMode.", e);
                return -1;
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public long getFlags() {
            try {
                return this.mBinder.getFlags();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in getFlags.", e);
                return 0L;
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public androidx.media3.session.legacy.MediaControllerCompat.PlaybackInfo getPlaybackInfo() {
            try {
                androidx.media3.session.legacy.ParcelableVolumeInfo volumeAttributes = this.mBinder.getVolumeAttributes();
                if (volumeAttributes == null) {
                    return null;
                }
                return new androidx.media3.session.legacy.MediaControllerCompat.PlaybackInfo(volumeAttributes.volumeType, volumeAttributes.audioStream, volumeAttributes.controlType, volumeAttributes.maxVolume, volumeAttributes.currentVolume);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in getPlaybackInfo.", e);
                return null;
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public android.app.PendingIntent getSessionActivity() {
            try {
                return this.mBinder.getLaunchPendingIntent();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in getSessionActivity.", e);
                return null;
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public void setVolumeTo(int i, int i2) {
            try {
                this.mBinder.setVolumeTo(i, i2, null);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in setVolumeTo.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public void adjustVolume(int i, int i2) {
            try {
                this.mBinder.adjustVolume(i, i2, null);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in adjustVolume.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public void sendCommand(java.lang.String str, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
            try {
                this.mBinder.sendCommand(str, bundle, resultReceiver == null ? null : new androidx.media3.session.legacy.MediaSessionCompat.ResultReceiverWrapper(resultReceiver));
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in sendCommand.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public java.lang.String getPackageName() {
            try {
                return this.mBinder.getPackageName();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in getPackageName.", e);
                return null;
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public android.os.Bundle getSessionInfo() {
            try {
                this.mSessionInfo = this.mBinder.getSessionInfo();
            } catch (android.os.RemoteException e) {
                android.util.Log.d(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in getSessionInfo.", e);
            }
            android.os.Bundle bundleUnparcelWithClassLoader = androidx.media3.session.legacy.MediaSessionCompat.unparcelWithClassLoader(this.mSessionInfo);
            this.mSessionInfo = bundleUnparcelWithClassLoader;
            return bundleUnparcelWithClassLoader == null ? android.os.Bundle.EMPTY : new android.os.Bundle(this.mSessionInfo);
        }
    }

    static class TransportControlsBase extends androidx.media3.session.legacy.MediaControllerCompat.TransportControls {
        private androidx.media3.session.legacy.IMediaSession mBinder;

        public TransportControlsBase(androidx.media3.session.legacy.IMediaSession iMediaSession) {
            this.mBinder = iMediaSession;
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void prepare() {
            try {
                this.mBinder.prepare();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in prepare.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void prepareFromMediaId(java.lang.String str, android.os.Bundle bundle) {
            try {
                this.mBinder.prepareFromMediaId(str, bundle);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in prepareFromMediaId.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void prepareFromSearch(java.lang.String str, android.os.Bundle bundle) {
            try {
                this.mBinder.prepareFromSearch(str, bundle);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in prepareFromSearch.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void prepareFromUri(android.net.Uri uri, android.os.Bundle bundle) {
            try {
                this.mBinder.prepareFromUri(uri, bundle);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in prepareFromUri.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void play() {
            try {
                this.mBinder.play();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in play.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void playFromMediaId(java.lang.String str, android.os.Bundle bundle) {
            try {
                this.mBinder.playFromMediaId(str, bundle);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in playFromMediaId.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void playFromSearch(java.lang.String str, android.os.Bundle bundle) {
            try {
                this.mBinder.playFromSearch(str, bundle);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in playFromSearch.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void playFromUri(android.net.Uri uri, android.os.Bundle bundle) {
            try {
                this.mBinder.playFromUri(uri, bundle);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in playFromUri.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void skipToQueueItem(long j) {
            try {
                this.mBinder.skipToQueueItem(j);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in skipToQueueItem.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void pause() {
            try {
                this.mBinder.pause();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in pause.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void stop() {
            try {
                this.mBinder.stop();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in stop.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void seekTo(long j) {
            try {
                this.mBinder.seekTo(j);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in seekTo.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void fastForward() {
            try {
                this.mBinder.fastForward();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in fastForward.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void skipToNext() {
            try {
                this.mBinder.next();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in skipToNext.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void rewind() {
            try {
                this.mBinder.rewind();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in rewind.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void skipToPrevious() {
            try {
                this.mBinder.previous();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in skipToPrevious.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void setRating(androidx.media3.session.legacy.RatingCompat ratingCompat) {
            try {
                this.mBinder.rate(ratingCompat);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in setRating.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void setRating(androidx.media3.session.legacy.RatingCompat ratingCompat, android.os.Bundle bundle) {
            try {
                this.mBinder.rateWithExtras(ratingCompat, bundle);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in setRating.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void setPlaybackSpeed(float f) {
            if (f == 0.0f) {
                throw new java.lang.IllegalArgumentException("speed must not be zero");
            }
            try {
                this.mBinder.setPlaybackSpeed(f);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in setPlaybackSpeed.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void setCaptioningEnabled(boolean z) {
            try {
                this.mBinder.setCaptioningEnabled(z);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in setCaptioningEnabled.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void setRepeatMode(int i) {
            try {
                this.mBinder.setRepeatMode(i);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in setRepeatMode.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void setShuffleMode(int i) {
            try {
                this.mBinder.setShuffleMode(i);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in setShuffleMode.", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void sendCustomAction(androidx.media3.session.legacy.PlaybackStateCompat.CustomAction customAction, android.os.Bundle bundle) {
            sendCustomAction(customAction.getAction(), bundle);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void sendCustomAction(java.lang.String str, android.os.Bundle bundle) {
            androidx.media3.session.legacy.MediaControllerCompat.validateCustomAction(str, bundle);
            try {
                this.mBinder.sendCustomAction(str, bundle);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in sendCustomAction.", e);
            }
        }
    }

    static class MediaControllerImplApi21 implements androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl {
        protected final android.media.session.MediaController mControllerFwk;
        protected android.os.Bundle mSessionInfo;
        final androidx.media3.session.legacy.MediaSessionCompat.Token mSessionToken;
        final java.lang.Object mLock = new java.lang.Object();
        private final java.util.List<androidx.media3.session.legacy.MediaControllerCompat.Callback> mPendingCallbacks = new java.util.ArrayList();
        private java.util.HashMap<androidx.media3.session.legacy.MediaControllerCompat.Callback, androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImplApi21.ExtraCallback> mCallbackMap = new java.util.HashMap<>();

        MediaControllerImplApi21(android.content.Context context, androidx.media3.session.legacy.MediaSessionCompat.Token token) {
            this.mSessionToken = token;
            this.mControllerFwk = new android.media.session.MediaController(context, (android.media.session.MediaSession.Token) androidx.media3.common.util.Assertions.checkNotNull(token.getToken()));
            if (token.getExtraBinder() == null) {
                requestExtraBinder();
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public final void registerCallback(androidx.media3.session.legacy.MediaControllerCompat.Callback callback, android.os.Handler handler) {
            this.mControllerFwk.registerCallback((android.media.session.MediaController.Callback) androidx.media3.common.util.Assertions.checkNotNull(callback.mCallbackFwk), handler);
            synchronized (this.mLock) {
                androidx.media3.session.legacy.IMediaSession extraBinder = this.mSessionToken.getExtraBinder();
                if (extraBinder != null) {
                    androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImplApi21.ExtraCallback extraCallback = new androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImplApi21.ExtraCallback(callback);
                    this.mCallbackMap.put(callback, extraCallback);
                    callback.mIControllerCallback = extraCallback;
                    try {
                        extraBinder.registerCallbackListener(extraCallback);
                        callback.postToHandler(13, null, null);
                    } catch (android.os.RemoteException e) {
                        android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in registerCallback.", e);
                    }
                } else {
                    callback.mIControllerCallback = null;
                    this.mPendingCallbacks.add(callback);
                }
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public final void unregisterCallback(androidx.media3.session.legacy.MediaControllerCompat.Callback callback) {
            this.mControllerFwk.unregisterCallback((android.media.session.MediaController.Callback) androidx.media3.common.util.Assertions.checkNotNull(callback.mCallbackFwk));
            synchronized (this.mLock) {
                androidx.media3.session.legacy.IMediaSession extraBinder = this.mSessionToken.getExtraBinder();
                if (extraBinder != null) {
                    try {
                        androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImplApi21.ExtraCallback extraCallbackRemove = this.mCallbackMap.remove(callback);
                        if (extraCallbackRemove != null) {
                            callback.mIControllerCallback = null;
                            extraBinder.unregisterCallbackListener(extraCallbackRemove);
                        }
                    } catch (android.os.RemoteException e) {
                        android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in unregisterCallback.", e);
                    }
                } else {
                    this.mPendingCallbacks.remove(callback);
                }
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public boolean dispatchMediaButtonEvent(android.view.KeyEvent keyEvent) {
            return this.mControllerFwk.dispatchMediaButtonEvent(keyEvent);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public androidx.media3.session.legacy.MediaControllerCompat.TransportControls getTransportControls() {
            android.media.session.MediaController.TransportControls transportControls = this.mControllerFwk.getTransportControls();
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                return new androidx.media3.session.legacy.MediaControllerCompat.TransportControlsApi29(transportControls);
            }
            return new androidx.media3.session.legacy.MediaControllerCompat.TransportControlsApi24(transportControls);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public androidx.media3.session.legacy.PlaybackStateCompat getPlaybackState() {
            androidx.media3.session.legacy.IMediaSession extraBinder = this.mSessionToken.getExtraBinder();
            if (extraBinder != null) {
                try {
                    return extraBinder.getPlaybackState();
                } catch (android.os.RemoteException e) {
                    android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in getPlaybackState.", e);
                }
            }
            android.media.session.PlaybackState playbackState = this.mControllerFwk.getPlaybackState();
            if (playbackState != null) {
                return androidx.media3.session.legacy.PlaybackStateCompat.fromPlaybackState(playbackState);
            }
            return null;
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public androidx.media3.session.legacy.MediaMetadataCompat getMetadata() {
            android.media.MediaMetadata metadata = this.mControllerFwk.getMetadata();
            if (metadata != null) {
                return androidx.media3.session.legacy.MediaMetadataCompat.fromMediaMetadata(metadata);
            }
            return null;
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> getQueue() {
            java.util.List<android.media.session.MediaSession.QueueItem> queue = this.mControllerFwk.getQueue();
            if (queue != null) {
                return androidx.media3.session.legacy.MediaSessionCompat.QueueItem.fromQueueItemList(queue);
            }
            return null;
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public void addQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat) {
            if ((getFlags() & 4) == 0) {
                throw new java.lang.UnsupportedOperationException("This session doesn't support queue management operations");
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", androidx.media3.session.legacy.LegacyParcelableUtil.convert(mediaDescriptionCompat, android.support.v4.media.MediaDescriptionCompat.CREATOR));
            sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM", bundle, null);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public void addQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if ((getFlags() & 4) == 0) {
                throw new java.lang.UnsupportedOperationException("This session doesn't support queue management operations");
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", androidx.media3.session.legacy.LegacyParcelableUtil.convert(mediaDescriptionCompat, android.support.v4.media.MediaDescriptionCompat.CREATOR));
            bundle.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", i);
            sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT", bundle, null);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public void removeQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat) {
            if ((getFlags() & 4) == 0) {
                throw new java.lang.UnsupportedOperationException("This session doesn't support queue management operations");
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", androidx.media3.session.legacy.LegacyParcelableUtil.convert(mediaDescriptionCompat, android.support.v4.media.MediaDescriptionCompat.CREATOR));
            sendCommand("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM", bundle, null);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public java.lang.CharSequence getQueueTitle() {
            return this.mControllerFwk.getQueueTitle();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public android.os.Bundle getExtras() {
            return this.mControllerFwk.getExtras();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public int getRatingType() {
            return this.mControllerFwk.getRatingType();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public boolean isCaptioningEnabled() {
            androidx.media3.session.legacy.IMediaSession extraBinder = this.mSessionToken.getExtraBinder();
            if (extraBinder == null) {
                return false;
            }
            try {
                return extraBinder.isCaptioningEnabled();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in isCaptioningEnabled.", e);
                return false;
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public int getRepeatMode() {
            androidx.media3.session.legacy.IMediaSession extraBinder = this.mSessionToken.getExtraBinder();
            if (extraBinder == null) {
                return -1;
            }
            try {
                return extraBinder.getRepeatMode();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in getRepeatMode.", e);
                return -1;
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public int getShuffleMode() {
            androidx.media3.session.legacy.IMediaSession extraBinder = this.mSessionToken.getExtraBinder();
            if (extraBinder == null) {
                return -1;
            }
            try {
                return extraBinder.getShuffleMode();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in getShuffleMode.", e);
                return -1;
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public long getFlags() {
            return this.mControllerFwk.getFlags();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public androidx.media3.session.legacy.MediaControllerCompat.PlaybackInfo getPlaybackInfo() {
            android.media.session.MediaController.PlaybackInfo playbackInfo = this.mControllerFwk.getPlaybackInfo();
            if (playbackInfo != null) {
                return new androidx.media3.session.legacy.MediaControllerCompat.PlaybackInfo(playbackInfo.getPlaybackType(), (androidx.media3.session.legacy.AudioAttributesCompat) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.AudioAttributesCompat.wrap(playbackInfo.getAudioAttributes())), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
            }
            return null;
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public android.app.PendingIntent getSessionActivity() {
            return this.mControllerFwk.getSessionActivity();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public void setVolumeTo(int i, int i2) {
            this.mControllerFwk.setVolumeTo(i, i2);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public void adjustVolume(int i, int i2) {
            this.mControllerFwk.adjustVolume(i, i2);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public void sendCommand(java.lang.String str, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
            this.mControllerFwk.sendCommand(str, bundle, resultReceiver);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public boolean isSessionReady() {
            return this.mSessionToken.getExtraBinder() != null;
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public java.lang.String getPackageName() {
            return this.mControllerFwk.getPackageName();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public android.os.Bundle getSessionInfo() {
            if (this.mSessionInfo != null) {
                return new android.os.Bundle(this.mSessionInfo);
            }
            androidx.media3.session.legacy.IMediaSession extraBinder = this.mSessionToken.getExtraBinder();
            if (extraBinder != null) {
                try {
                    this.mSessionInfo = extraBinder.getSessionInfo();
                } catch (android.os.RemoteException e) {
                    android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in getSessionInfo.", e);
                    this.mSessionInfo = android.os.Bundle.EMPTY;
                }
            }
            android.os.Bundle bundleUnparcelWithClassLoader = androidx.media3.session.legacy.MediaSessionCompat.unparcelWithClassLoader(this.mSessionInfo);
            this.mSessionInfo = bundleUnparcelWithClassLoader;
            return bundleUnparcelWithClassLoader == null ? android.os.Bundle.EMPTY : new android.os.Bundle(this.mSessionInfo);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public java.lang.Object getMediaController() {
            return this.mControllerFwk;
        }

        private void requestExtraBinder() {
            sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImplApi21.ExtraBinderRequestResultReceiver(this));
        }

        void processPendingCallbacksLocked() {
            androidx.media3.session.legacy.IMediaSession extraBinder = this.mSessionToken.getExtraBinder();
            if (extraBinder == null) {
                return;
            }
            for (androidx.media3.session.legacy.MediaControllerCompat.Callback callback : this.mPendingCallbacks) {
                androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImplApi21.ExtraCallback extraCallback = new androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImplApi21.ExtraCallback(callback);
                this.mCallbackMap.put(callback, extraCallback);
                callback.mIControllerCallback = extraCallback;
                try {
                    extraBinder.registerCallbackListener(extraCallback);
                    callback.postToHandler(13, null, null);
                } catch (android.os.RemoteException e) {
                    android.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in registerCallback.", e);
                }
            }
            this.mPendingCallbacks.clear();
        }

        static void setMediaController(android.app.Activity activity, androidx.media3.session.legacy.MediaControllerCompat mediaControllerCompat) {
            activity.setMediaController(mediaControllerCompat != null ? new android.media.session.MediaController(activity, (android.media.session.MediaSession.Token) mediaControllerCompat.getSessionToken().getToken()) : null);
        }

        static androidx.media3.session.legacy.MediaControllerCompat getMediaController(android.app.Activity activity) {
            android.media.session.MediaController mediaController = activity.getMediaController();
            if (mediaController == null) {
                return null;
            }
            return new androidx.media3.session.legacy.MediaControllerCompat(activity, androidx.media3.session.legacy.MediaSessionCompat.Token.fromToken(mediaController.getSessionToken()));
        }

        private static class ExtraBinderRequestResultReceiver extends android.os.ResultReceiver {
            private java.lang.ref.WeakReference<androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImplApi21> mMediaControllerImpl;

            ExtraBinderRequestResultReceiver(androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.mMediaControllerImpl = new java.lang.ref.WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i, android.os.Bundle bundle) {
                androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImplApi21 mediaControllerImplApi21 = this.mMediaControllerImpl.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.mLock) {
                    mediaControllerImplApi21.mSessionToken.setExtraBinder(androidx.media3.session.legacy.IMediaSession.Stub.asInterface(bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerImplApi21.mSessionToken.setSession2Token(androidx.versionedparcelable.ParcelUtils.getVersionedParcelable(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                    mediaControllerImplApi21.processPendingCallbacksLocked();
                }
            }
        }

        private static class ExtraCallback extends androidx.media3.session.legacy.MediaControllerCompat.Callback.StubCompat {
            ExtraCallback(androidx.media3.session.legacy.MediaControllerCompat.Callback callback) {
                super(callback);
            }

            @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback.StubCompat, androidx.media3.session.legacy.IMediaControllerCallback
            public void onSessionDestroyed() throws android.os.RemoteException {
                throw new java.lang.AssertionError();
            }

            @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback.StubCompat, androidx.media3.session.legacy.IMediaControllerCallback
            public void onMetadataChanged(androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat) throws android.os.RemoteException {
                throw new java.lang.AssertionError();
            }

            @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback.StubCompat, androidx.media3.session.legacy.IMediaControllerCallback
            public void onQueueChanged(java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> list) throws android.os.RemoteException {
                throw new java.lang.AssertionError();
            }

            @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback.StubCompat, androidx.media3.session.legacy.IMediaControllerCallback
            public void onQueueTitleChanged(java.lang.CharSequence charSequence) throws android.os.RemoteException {
                throw new java.lang.AssertionError();
            }

            @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback.StubCompat, androidx.media3.session.legacy.IMediaControllerCallback
            public void onExtrasChanged(android.os.Bundle bundle) throws android.os.RemoteException {
                throw new java.lang.AssertionError();
            }

            @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback.StubCompat, androidx.media3.session.legacy.IMediaControllerCallback
            public void onVolumeInfoChanged(androidx.media3.session.legacy.ParcelableVolumeInfo parcelableVolumeInfo) throws android.os.RemoteException {
                throw new java.lang.AssertionError();
            }
        }
    }

    static class MediaControllerImplApi29 extends androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImplApi21 {
        MediaControllerImplApi29(android.content.Context context, androidx.media3.session.legacy.MediaSessionCompat.Token token) {
            super(context, token);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImplApi21, androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public android.os.Bundle getSessionInfo() {
            if (this.mSessionInfo != null) {
                return new android.os.Bundle(this.mSessionInfo);
            }
            this.mSessionInfo = this.mControllerFwk.getSessionInfo();
            this.mSessionInfo = androidx.media3.session.legacy.MediaSessionCompat.unparcelWithClassLoader(this.mSessionInfo);
            return this.mSessionInfo == null ? android.os.Bundle.EMPTY : new android.os.Bundle(this.mSessionInfo);
        }
    }

    static class TransportControlsApi21 extends androidx.media3.session.legacy.MediaControllerCompat.TransportControls {
        protected final android.media.session.MediaController.TransportControls mControlsFwk;

        TransportControlsApi21(android.media.session.MediaController.TransportControls transportControls) {
            this.mControlsFwk = transportControls;
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void prepare() {
            sendCustomAction("android.support.v4.media.session.action.PREPARE", (android.os.Bundle) null);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void prepareFromMediaId(java.lang.String str, android.os.Bundle bundle) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID", str);
            bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
            sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID", bundle2);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void prepareFromSearch(java.lang.String str, android.os.Bundle bundle) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("android.support.v4.media.session.action.ARGUMENT_QUERY", str);
            bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
            sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_SEARCH", bundle2);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void prepareFromUri(android.net.Uri uri, android.os.Bundle bundle) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", uri);
            bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
            sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_URI", bundle2);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void play() {
            this.mControlsFwk.play();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void pause() {
            this.mControlsFwk.pause();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void stop() {
            this.mControlsFwk.stop();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void seekTo(long j) {
            this.mControlsFwk.seekTo(j);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void fastForward() {
            this.mControlsFwk.fastForward();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void rewind() {
            this.mControlsFwk.rewind();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void skipToNext() {
            this.mControlsFwk.skipToNext();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void skipToPrevious() {
            this.mControlsFwk.skipToPrevious();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void setRating(androidx.media3.session.legacy.RatingCompat ratingCompat) {
            this.mControlsFwk.setRating(ratingCompat != null ? (android.media.Rating) ratingCompat.getRating() : null);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void setRating(androidx.media3.session.legacy.RatingCompat ratingCompat, android.os.Bundle bundle) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_RATING", androidx.media3.session.legacy.LegacyParcelableUtil.convert(ratingCompat, android.support.v4.media.RatingCompat.CREATOR));
            bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
            sendCustomAction("android.support.v4.media.session.action.SET_RATING", bundle2);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void setPlaybackSpeed(float f) {
            if (f == 0.0f) {
                throw new java.lang.IllegalArgumentException("speed must not be zero");
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", f);
            sendCustomAction("android.support.v4.media.session.action.SET_PLAYBACK_SPEED", bundle);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void setCaptioningEnabled(boolean z) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED", z);
            sendCustomAction("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED", bundle);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void setRepeatMode(int i) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", i);
            sendCustomAction("android.support.v4.media.session.action.SET_REPEAT_MODE", bundle);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void setShuffleMode(int i) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE", i);
            sendCustomAction("android.support.v4.media.session.action.SET_SHUFFLE_MODE", bundle);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void playFromMediaId(java.lang.String str, android.os.Bundle bundle) {
            this.mControlsFwk.playFromMediaId(str, bundle);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void playFromSearch(java.lang.String str, android.os.Bundle bundle) {
            this.mControlsFwk.playFromSearch(str, bundle);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void playFromUri(android.net.Uri uri, android.os.Bundle bundle) {
            if (uri == null || android.net.Uri.EMPTY.equals(uri)) {
                throw new java.lang.IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
            }
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", uri);
            bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
            sendCustomAction("android.support.v4.media.session.action.PLAY_FROM_URI", bundle2);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void skipToQueueItem(long j) {
            this.mControlsFwk.skipToQueueItem(j);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void sendCustomAction(androidx.media3.session.legacy.PlaybackStateCompat.CustomAction customAction, android.os.Bundle bundle) {
            androidx.media3.session.legacy.MediaControllerCompat.validateCustomAction(customAction.getAction(), bundle);
            this.mControlsFwk.sendCustomAction(customAction.getAction(), bundle);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void sendCustomAction(java.lang.String str, android.os.Bundle bundle) {
            androidx.media3.session.legacy.MediaControllerCompat.validateCustomAction(str, bundle);
            this.mControlsFwk.sendCustomAction(str, bundle);
        }
    }

    static class TransportControlsApi23 extends androidx.media3.session.legacy.MediaControllerCompat.TransportControlsApi21 {
        TransportControlsApi23(android.media.session.MediaController.TransportControls transportControls) {
            super(transportControls);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControlsApi21, androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void playFromUri(android.net.Uri uri, android.os.Bundle bundle) {
            this.mControlsFwk.playFromUri(uri, bundle);
        }
    }

    static class TransportControlsApi24 extends androidx.media3.session.legacy.MediaControllerCompat.TransportControlsApi23 {
        TransportControlsApi24(android.media.session.MediaController.TransportControls transportControls) {
            super(transportControls);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControlsApi21, androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void prepare() {
            this.mControlsFwk.prepare();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControlsApi21, androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void prepareFromMediaId(java.lang.String str, android.os.Bundle bundle) {
            this.mControlsFwk.prepareFromMediaId(str, bundle);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControlsApi21, androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void prepareFromSearch(java.lang.String str, android.os.Bundle bundle) {
            this.mControlsFwk.prepareFromSearch(str, bundle);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControlsApi21, androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void prepareFromUri(android.net.Uri uri, android.os.Bundle bundle) {
            this.mControlsFwk.prepareFromUri(uri, bundle);
        }
    }

    static class TransportControlsApi29 extends androidx.media3.session.legacy.MediaControllerCompat.TransportControlsApi24 {
        TransportControlsApi29(android.media.session.MediaController.TransportControls transportControls) {
            super(transportControls);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControlsApi21, androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void setPlaybackSpeed(float f) {
            if (f == 0.0f) {
                throw new java.lang.IllegalArgumentException("speed must not be zero");
            }
            this.mControlsFwk.setPlaybackSpeed(f);
        }
    }
}
