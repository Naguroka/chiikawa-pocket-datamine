package android.support.v4.media.session;

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
    private final android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl mImpl;
    private final java.util.Set<android.support.v4.media.session.MediaControllerCompat.Callback> mRegisteredCallbacks;
    private final android.support.v4.media.session.MediaSessionCompat.Token mToken;

    interface MediaControllerImpl {
        void addQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat);

        void addQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat, int i);

        void adjustVolume(int i, int i2);

        boolean dispatchMediaButtonEvent(android.view.KeyEvent keyEvent);

        android.os.Bundle getExtras();

        long getFlags();

        java.lang.Object getMediaController();

        android.support.v4.media.MediaMetadataCompat getMetadata();

        java.lang.String getPackageName();

        android.support.v4.media.session.MediaControllerCompat.PlaybackInfo getPlaybackInfo();

        android.support.v4.media.session.PlaybackStateCompat getPlaybackState();

        java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> getQueue();

        java.lang.CharSequence getQueueTitle();

        int getRatingType();

        int getRepeatMode();

        android.app.PendingIntent getSessionActivity();

        android.os.Bundle getSessionInfo();

        int getShuffleMode();

        android.support.v4.media.session.MediaControllerCompat.TransportControls getTransportControls();

        boolean isCaptioningEnabled();

        boolean isSessionReady();

        void registerCallback(android.support.v4.media.session.MediaControllerCompat.Callback callback, android.os.Handler handler);

        void removeQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat);

        void sendCommand(java.lang.String str, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver);

        void setVolumeTo(int i, int i2);

        void unregisterCallback(android.support.v4.media.session.MediaControllerCompat.Callback callback);
    }

    public static void setMediaController(android.app.Activity activity, android.support.v4.media.session.MediaControllerCompat mediaControllerCompat) {
        activity.getWindow().getDecorView().setTag(androidx.media.R.id.media_controller_compat_view_tag, mediaControllerCompat);
        android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21.setMediaController(activity, mediaControllerCompat);
    }

    public static android.support.v4.media.session.MediaControllerCompat getMediaController(android.app.Activity activity) {
        java.lang.Object tag = activity.getWindow().getDecorView().getTag(androidx.media.R.id.media_controller_compat_view_tag);
        if (tag instanceof android.support.v4.media.session.MediaControllerCompat) {
            return (android.support.v4.media.session.MediaControllerCompat) tag;
        }
        return android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21.getMediaController(activity);
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

    public MediaControllerCompat(android.content.Context context, android.support.v4.media.session.MediaSessionCompat mediaSessionCompat) {
        this(context, mediaSessionCompat.getSessionToken());
    }

    public MediaControllerCompat(android.content.Context context, android.support.v4.media.session.MediaSessionCompat.Token token) {
        if (token == null) {
            throw new java.lang.IllegalArgumentException("sessionToken must not be null");
        }
        this.mRegisteredCallbacks = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.mToken = token;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.mImpl = new android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi29(context, token);
        } else {
            this.mImpl = new android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21(context, token);
        }
    }

    public android.support.v4.media.session.MediaControllerCompat.TransportControls getTransportControls() {
        return this.mImpl.getTransportControls();
    }

    public boolean dispatchMediaButtonEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent == null) {
            throw new java.lang.IllegalArgumentException("KeyEvent may not be null");
        }
        return this.mImpl.dispatchMediaButtonEvent(keyEvent);
    }

    public android.support.v4.media.session.PlaybackStateCompat getPlaybackState() {
        return this.mImpl.getPlaybackState();
    }

    public android.support.v4.media.MediaMetadataCompat getMetadata() {
        return this.mImpl.getMetadata();
    }

    public java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> getQueue() {
        return this.mImpl.getQueue();
    }

    public void addQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) {
        this.mImpl.addQueueItem(mediaDescriptionCompat);
    }

    public void addQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat, int i) {
        this.mImpl.addQueueItem(mediaDescriptionCompat, i);
    }

    public void removeQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) {
        this.mImpl.removeQueueItem(mediaDescriptionCompat);
    }

    @java.lang.Deprecated
    public void removeQueueItemAt(int i) {
        android.support.v4.media.session.MediaSessionCompat.QueueItem queueItem;
        java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> queue = getQueue();
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

    public android.support.v4.media.session.MediaControllerCompat.PlaybackInfo getPlaybackInfo() {
        return this.mImpl.getPlaybackInfo();
    }

    public android.app.PendingIntent getSessionActivity() {
        return this.mImpl.getSessionActivity();
    }

    public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken() {
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

    public void registerCallback(android.support.v4.media.session.MediaControllerCompat.Callback callback) {
        registerCallback(callback, null);
    }

    public void registerCallback(android.support.v4.media.session.MediaControllerCompat.Callback callback, android.os.Handler handler) {
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

    public void unregisterCallback(android.support.v4.media.session.MediaControllerCompat.Callback callback) {
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
        final android.media.session.MediaController.Callback mCallbackFwk = new android.support.v4.media.session.MediaControllerCompat.Callback.MediaControllerCallbackApi21(this);
        android.support.v4.media.session.MediaControllerCompat.Callback.MessageHandler mHandler;
        android.support.v4.media.session.IMediaControllerCallback mIControllerCallback;

        public void onAudioInfoChanged(android.support.v4.media.session.MediaControllerCompat.PlaybackInfo playbackInfo) {
        }

        public void onCaptioningEnabledChanged(boolean z) {
        }

        public void onExtrasChanged(android.os.Bundle bundle) {
        }

        public void onMetadataChanged(android.support.v4.media.MediaMetadataCompat mediaMetadataCompat) {
        }

        public void onPlaybackStateChanged(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat) {
        }

        public void onQueueChanged(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> list) {
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

        public android.support.v4.media.session.IMediaControllerCallback getIControllerCallback() {
            return this.mIControllerCallback;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            postToHandler(8, null, null);
        }

        void setHandler(android.os.Handler handler) {
            if (handler == null) {
                android.support.v4.media.session.MediaControllerCompat.Callback.MessageHandler messageHandler = this.mHandler;
                if (messageHandler != null) {
                    messageHandler.mRegistered = false;
                    this.mHandler.removeCallbacksAndMessages(null);
                    this.mHandler = null;
                    return;
                }
                return;
            }
            android.support.v4.media.session.MediaControllerCompat.Callback.MessageHandler messageHandler2 = new android.support.v4.media.session.MediaControllerCompat.Callback.MessageHandler(handler.getLooper());
            this.mHandler = messageHandler2;
            messageHandler2.mRegistered = true;
        }

        void postToHandler(int i, java.lang.Object obj, android.os.Bundle bundle) {
            android.support.v4.media.session.MediaControllerCompat.Callback.MessageHandler messageHandler = this.mHandler;
            if (messageHandler != null) {
                android.os.Message messageObtainMessage = messageHandler.obtainMessage(i, obj);
                messageObtainMessage.setData(bundle);
                messageObtainMessage.sendToTarget();
            }
        }

        private static class MediaControllerCallbackApi21 extends android.media.session.MediaController.Callback {
            private final java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat.Callback> mCallback;

            MediaControllerCallbackApi21(android.support.v4.media.session.MediaControllerCompat.Callback callback) {
                this.mCallback = new java.lang.ref.WeakReference<>(callback);
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionDestroyed() {
                android.support.v4.media.session.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.onSessionDestroyed();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionEvent(java.lang.String str, android.os.Bundle bundle) {
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(bundle);
                android.support.v4.media.session.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    android.support.v4.media.session.IMediaControllerCallback iMediaControllerCallback = callback.mIControllerCallback;
                    callback.onSessionEvent(str, bundle);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onPlaybackStateChanged(android.media.session.PlaybackState playbackState) {
                android.support.v4.media.session.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback == null || callback.mIControllerCallback != null) {
                    return;
                }
                callback.onPlaybackStateChanged(android.support.v4.media.session.PlaybackStateCompat.fromPlaybackState(playbackState));
            }

            @Override // android.media.session.MediaController.Callback
            public void onMetadataChanged(android.media.MediaMetadata mediaMetadata) {
                android.support.v4.media.session.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.onMetadataChanged(android.support.v4.media.MediaMetadataCompat.fromMediaMetadata(mediaMetadata));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueChanged(java.util.List<android.media.session.MediaSession.QueueItem> list) {
                android.support.v4.media.session.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.onQueueChanged(android.support.v4.media.session.MediaSessionCompat.QueueItem.fromQueueItemList(list));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueTitleChanged(java.lang.CharSequence charSequence) {
                android.support.v4.media.session.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.onQueueTitleChanged(charSequence);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onExtrasChanged(android.os.Bundle bundle) {
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(bundle);
                android.support.v4.media.session.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.onExtrasChanged(bundle);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onAudioInfoChanged(android.media.session.MediaController.PlaybackInfo playbackInfo) {
                android.support.v4.media.session.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.onAudioInfoChanged(new android.support.v4.media.session.MediaControllerCompat.PlaybackInfo(playbackInfo.getPlaybackType(), androidx.media.AudioAttributesCompat.wrap(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                }
            }
        }

        private static class StubCompat extends android.support.v4.media.session.IMediaControllerCallback.Stub {
            private final java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat.Callback> mCallback;

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onShuffleModeChangedRemoved(boolean z) throws android.os.RemoteException {
            }

            StubCompat(android.support.v4.media.session.MediaControllerCompat.Callback callback) {
                this.mCallback = new java.lang.ref.WeakReference<>(callback);
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onEvent(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.support.v4.media.session.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(1, str, bundle);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onSessionDestroyed() throws android.os.RemoteException {
                android.support.v4.media.session.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(8, null, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onPlaybackStateChanged(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat) throws android.os.RemoteException {
                android.support.v4.media.session.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(2, playbackStateCompat, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onMetadataChanged(android.support.v4.media.MediaMetadataCompat mediaMetadataCompat) throws android.os.RemoteException {
                android.support.v4.media.session.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(3, mediaMetadataCompat, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onQueueChanged(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> list) throws android.os.RemoteException {
                android.support.v4.media.session.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(5, list, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onQueueTitleChanged(java.lang.CharSequence charSequence) throws android.os.RemoteException {
                android.support.v4.media.session.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(6, charSequence, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onCaptioningEnabledChanged(boolean z) throws android.os.RemoteException {
                android.support.v4.media.session.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(11, java.lang.Boolean.valueOf(z), null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onRepeatModeChanged(int i) throws android.os.RemoteException {
                android.support.v4.media.session.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(9, java.lang.Integer.valueOf(i), null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onShuffleModeChanged(int i) throws android.os.RemoteException {
                android.support.v4.media.session.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(12, java.lang.Integer.valueOf(i), null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onExtrasChanged(android.os.Bundle bundle) throws android.os.RemoteException {
                android.support.v4.media.session.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(7, bundle, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onVolumeInfoChanged(android.support.v4.media.session.ParcelableVolumeInfo parcelableVolumeInfo) throws android.os.RemoteException {
                android.support.v4.media.session.MediaControllerCompat.Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(4, parcelableVolumeInfo != null ? new android.support.v4.media.session.MediaControllerCompat.PlaybackInfo(parcelableVolumeInfo.volumeType, parcelableVolumeInfo.audioStream, parcelableVolumeInfo.controlType, parcelableVolumeInfo.maxVolume, parcelableVolumeInfo.currentVolume) : null, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onSessionReady() throws android.os.RemoteException {
                android.support.v4.media.session.MediaControllerCompat.Callback callback = this.mCallback.get();
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
                            android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(data);
                            android.support.v4.media.session.MediaControllerCompat.Callback.this.onSessionEvent((java.lang.String) message.obj, data);
                            break;
                        case 2:
                            android.support.v4.media.session.MediaControllerCompat.Callback.this.onPlaybackStateChanged((android.support.v4.media.session.PlaybackStateCompat) message.obj);
                            break;
                        case 3:
                            android.support.v4.media.session.MediaControllerCompat.Callback.this.onMetadataChanged((android.support.v4.media.MediaMetadataCompat) message.obj);
                            break;
                        case 4:
                            android.support.v4.media.session.MediaControllerCompat.Callback.this.onAudioInfoChanged((android.support.v4.media.session.MediaControllerCompat.PlaybackInfo) message.obj);
                            break;
                        case 5:
                            android.support.v4.media.session.MediaControllerCompat.Callback.this.onQueueChanged((java.util.List) message.obj);
                            break;
                        case 6:
                            android.support.v4.media.session.MediaControllerCompat.Callback.this.onQueueTitleChanged((java.lang.CharSequence) message.obj);
                            break;
                        case 7:
                            android.os.Bundle bundle = (android.os.Bundle) message.obj;
                            android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(bundle);
                            android.support.v4.media.session.MediaControllerCompat.Callback.this.onExtrasChanged(bundle);
                            break;
                        case 8:
                            android.support.v4.media.session.MediaControllerCompat.Callback.this.onSessionDestroyed();
                            break;
                        case 9:
                            android.support.v4.media.session.MediaControllerCompat.Callback.this.onRepeatModeChanged(((java.lang.Integer) message.obj).intValue());
                            break;
                        case 11:
                            android.support.v4.media.session.MediaControllerCompat.Callback.this.onCaptioningEnabledChanged(((java.lang.Boolean) message.obj).booleanValue());
                            break;
                        case 12:
                            android.support.v4.media.session.MediaControllerCompat.Callback.this.onShuffleModeChanged(((java.lang.Integer) message.obj).intValue());
                            break;
                        case 13:
                            android.support.v4.media.session.MediaControllerCompat.Callback.this.onSessionReady();
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

        public abstract void sendCustomAction(android.support.v4.media.session.PlaybackStateCompat.CustomAction customAction, android.os.Bundle bundle);

        public abstract void sendCustomAction(java.lang.String str, android.os.Bundle bundle);

        public abstract void setCaptioningEnabled(boolean z);

        public void setPlaybackSpeed(float f) {
        }

        public abstract void setRating(android.support.v4.media.RatingCompat ratingCompat);

        public abstract void setRating(android.support.v4.media.RatingCompat ratingCompat, android.os.Bundle bundle);

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
        private final androidx.media.AudioAttributesCompat mAudioAttrsCompat;
        private final int mCurrentVolume;
        private final int mMaxVolume;
        private final int mPlaybackType;
        private final int mVolumeControl;

        PlaybackInfo(int i, int i2, int i3, int i4, int i5) {
            this(i, new androidx.media.AudioAttributesCompat.Builder().setLegacyStreamType(i2).build(), i3, i4, i5);
        }

        PlaybackInfo(int i, androidx.media.AudioAttributesCompat audioAttributesCompat, int i2, int i3, int i4) {
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

        public androidx.media.AudioAttributesCompat getAudioAttributes() {
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

    static class MediaControllerImplBase implements android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl {
        private android.support.v4.media.session.IMediaSession mBinder;
        private android.os.Bundle mSessionInfo;
        private android.support.v4.media.session.MediaControllerCompat.TransportControls mTransportControls;

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public java.lang.Object getMediaController() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public boolean isSessionReady() {
            return true;
        }

        MediaControllerImplBase(android.support.v4.media.session.MediaSessionCompat.Token token) {
            this.mBinder = android.support.v4.media.session.IMediaSession.Stub.asInterface((android.os.IBinder) token.getToken());
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void registerCallback(android.support.v4.media.session.MediaControllerCompat.Callback callback, android.os.Handler handler) {
            if (callback == null) {
                throw new java.lang.IllegalArgumentException("callback may not be null.");
            }
            try {
                this.mBinder.asBinder().linkToDeath(callback, 0);
                this.mBinder.registerCallbackListener(callback.mIControllerCallback);
                callback.postToHandler(13, null, null);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in registerCallback.", e);
                callback.postToHandler(8, null, null);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void unregisterCallback(android.support.v4.media.session.MediaControllerCompat.Callback callback) {
            if (callback == null) {
                throw new java.lang.IllegalArgumentException("callback may not be null.");
            }
            try {
                this.mBinder.unregisterCallbackListener(callback.mIControllerCallback);
                this.mBinder.asBinder().unlinkToDeath(callback, 0);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in unregisterCallback.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public boolean dispatchMediaButtonEvent(android.view.KeyEvent keyEvent) {
            if (keyEvent == null) {
                throw new java.lang.IllegalArgumentException("event may not be null.");
            }
            try {
                this.mBinder.sendMediaButton(keyEvent);
                return false;
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in dispatchMediaButtonEvent.", e);
                return false;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.support.v4.media.session.MediaControllerCompat.TransportControls getTransportControls() {
            if (this.mTransportControls == null) {
                this.mTransportControls = new android.support.v4.media.session.MediaControllerCompat.TransportControlsBase(this.mBinder);
            }
            return this.mTransportControls;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.support.v4.media.session.PlaybackStateCompat getPlaybackState() {
            try {
                return this.mBinder.getPlaybackState();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in getPlaybackState.", e);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.support.v4.media.MediaMetadataCompat getMetadata() {
            try {
                return this.mBinder.getMetadata();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in getMetadata.", e);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> getQueue() {
            try {
                return this.mBinder.getQueue();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in getQueue.", e);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void addQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) {
            try {
                if ((this.mBinder.getFlags() & 4) == 0) {
                    throw new java.lang.UnsupportedOperationException("This session doesn't support queue management operations");
                }
                this.mBinder.addQueueItem(mediaDescriptionCompat);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in addQueueItem.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void addQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat, int i) {
            try {
                if ((this.mBinder.getFlags() & 4) == 0) {
                    throw new java.lang.UnsupportedOperationException("This session doesn't support queue management operations");
                }
                this.mBinder.addQueueItemAt(mediaDescriptionCompat, i);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in addQueueItemAt.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void removeQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) {
            try {
                if ((this.mBinder.getFlags() & 4) == 0) {
                    throw new java.lang.UnsupportedOperationException("This session doesn't support queue management operations");
                }
                this.mBinder.removeQueueItem(mediaDescriptionCompat);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in removeQueueItem.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public java.lang.CharSequence getQueueTitle() {
            try {
                return this.mBinder.getQueueTitle();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in getQueueTitle.", e);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.os.Bundle getExtras() {
            try {
                return this.mBinder.getExtras();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in getExtras.", e);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public int getRatingType() {
            try {
                return this.mBinder.getRatingType();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in getRatingType.", e);
                return 0;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public boolean isCaptioningEnabled() {
            try {
                return this.mBinder.isCaptioningEnabled();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in isCaptioningEnabled.", e);
                return false;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public int getRepeatMode() {
            try {
                return this.mBinder.getRepeatMode();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in getRepeatMode.", e);
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public int getShuffleMode() {
            try {
                return this.mBinder.getShuffleMode();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in getShuffleMode.", e);
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public long getFlags() {
            try {
                return this.mBinder.getFlags();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in getFlags.", e);
                return 0L;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.support.v4.media.session.MediaControllerCompat.PlaybackInfo getPlaybackInfo() {
            try {
                android.support.v4.media.session.ParcelableVolumeInfo volumeAttributes = this.mBinder.getVolumeAttributes();
                return new android.support.v4.media.session.MediaControllerCompat.PlaybackInfo(volumeAttributes.volumeType, volumeAttributes.audioStream, volumeAttributes.controlType, volumeAttributes.maxVolume, volumeAttributes.currentVolume);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in getPlaybackInfo.", e);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.app.PendingIntent getSessionActivity() {
            try {
                return this.mBinder.getLaunchPendingIntent();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in getSessionActivity.", e);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void setVolumeTo(int i, int i2) {
            try {
                this.mBinder.setVolumeTo(i, i2, null);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in setVolumeTo.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void adjustVolume(int i, int i2) {
            try {
                this.mBinder.adjustVolume(i, i2, null);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in adjustVolume.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void sendCommand(java.lang.String str, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
            try {
                this.mBinder.sendCommand(str, bundle, resultReceiver == null ? null : new android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper(resultReceiver));
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in sendCommand.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public java.lang.String getPackageName() {
            try {
                return this.mBinder.getPackageName();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in getPackageName.", e);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.os.Bundle getSessionInfo() {
            try {
                this.mSessionInfo = this.mBinder.getSessionInfo();
            } catch (android.os.RemoteException e) {
                android.util.Log.d(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in getSessionInfo.", e);
            }
            android.os.Bundle bundleUnparcelWithClassLoader = android.support.v4.media.session.MediaSessionCompat.unparcelWithClassLoader(this.mSessionInfo);
            this.mSessionInfo = bundleUnparcelWithClassLoader;
            return bundleUnparcelWithClassLoader == null ? android.os.Bundle.EMPTY : new android.os.Bundle(this.mSessionInfo);
        }
    }

    static class TransportControlsBase extends android.support.v4.media.session.MediaControllerCompat.TransportControls {
        private android.support.v4.media.session.IMediaSession mBinder;

        public TransportControlsBase(android.support.v4.media.session.IMediaSession iMediaSession) {
            this.mBinder = iMediaSession;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepare() {
            try {
                this.mBinder.prepare();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in prepare.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromMediaId(java.lang.String str, android.os.Bundle bundle) {
            try {
                this.mBinder.prepareFromMediaId(str, bundle);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in prepareFromMediaId.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromSearch(java.lang.String str, android.os.Bundle bundle) {
            try {
                this.mBinder.prepareFromSearch(str, bundle);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in prepareFromSearch.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromUri(android.net.Uri uri, android.os.Bundle bundle) {
            try {
                this.mBinder.prepareFromUri(uri, bundle);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in prepareFromUri.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void play() {
            try {
                this.mBinder.play();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in play.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromMediaId(java.lang.String str, android.os.Bundle bundle) {
            try {
                this.mBinder.playFromMediaId(str, bundle);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in playFromMediaId.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromSearch(java.lang.String str, android.os.Bundle bundle) {
            try {
                this.mBinder.playFromSearch(str, bundle);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in playFromSearch.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromUri(android.net.Uri uri, android.os.Bundle bundle) {
            try {
                this.mBinder.playFromUri(uri, bundle);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in playFromUri.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void skipToQueueItem(long j) {
            try {
                this.mBinder.skipToQueueItem(j);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in skipToQueueItem.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void pause() {
            try {
                this.mBinder.pause();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in pause.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void stop() {
            try {
                this.mBinder.stop();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in stop.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void seekTo(long j) {
            try {
                this.mBinder.seekTo(j);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in seekTo.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void fastForward() {
            try {
                this.mBinder.fastForward();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in fastForward.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void skipToNext() {
            try {
                this.mBinder.next();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in skipToNext.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void rewind() {
            try {
                this.mBinder.rewind();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in rewind.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void skipToPrevious() {
            try {
                this.mBinder.previous();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in skipToPrevious.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setRating(android.support.v4.media.RatingCompat ratingCompat) {
            try {
                this.mBinder.rate(ratingCompat);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in setRating.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setRating(android.support.v4.media.RatingCompat ratingCompat, android.os.Bundle bundle) {
            try {
                this.mBinder.rateWithExtras(ratingCompat, bundle);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in setRating.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setPlaybackSpeed(float f) {
            if (f == 0.0f) {
                throw new java.lang.IllegalArgumentException("speed must not be zero");
            }
            try {
                this.mBinder.setPlaybackSpeed(f);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in setPlaybackSpeed.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setCaptioningEnabled(boolean z) {
            try {
                this.mBinder.setCaptioningEnabled(z);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in setCaptioningEnabled.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setRepeatMode(int i) {
            try {
                this.mBinder.setRepeatMode(i);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in setRepeatMode.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setShuffleMode(int i) {
            try {
                this.mBinder.setShuffleMode(i);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in setShuffleMode.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void sendCustomAction(android.support.v4.media.session.PlaybackStateCompat.CustomAction customAction, android.os.Bundle bundle) {
            sendCustomAction(customAction.getAction(), bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void sendCustomAction(java.lang.String str, android.os.Bundle bundle) {
            android.support.v4.media.session.MediaControllerCompat.validateCustomAction(str, bundle);
            try {
                this.mBinder.sendCustomAction(str, bundle);
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in sendCustomAction.", e);
            }
        }
    }

    static class MediaControllerImplApi21 implements android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl {
        protected final android.media.session.MediaController mControllerFwk;
        protected android.os.Bundle mSessionInfo;
        final android.support.v4.media.session.MediaSessionCompat.Token mSessionToken;
        final java.lang.Object mLock = new java.lang.Object();
        private final java.util.List<android.support.v4.media.session.MediaControllerCompat.Callback> mPendingCallbacks = new java.util.ArrayList();
        private java.util.HashMap<android.support.v4.media.session.MediaControllerCompat.Callback, android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21.ExtraCallback> mCallbackMap = new java.util.HashMap<>();

        MediaControllerImplApi21(android.content.Context context, android.support.v4.media.session.MediaSessionCompat.Token token) {
            this.mSessionToken = token;
            this.mControllerFwk = new android.media.session.MediaController(context, (android.media.session.MediaSession.Token) token.getToken());
            if (token.getExtraBinder() == null) {
                requestExtraBinder();
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public final void registerCallback(android.support.v4.media.session.MediaControllerCompat.Callback callback, android.os.Handler handler) {
            this.mControllerFwk.registerCallback(callback.mCallbackFwk, handler);
            synchronized (this.mLock) {
                if (this.mSessionToken.getExtraBinder() != null) {
                    android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21.ExtraCallback extraCallback = new android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21.ExtraCallback(callback);
                    this.mCallbackMap.put(callback, extraCallback);
                    callback.mIControllerCallback = extraCallback;
                    try {
                        this.mSessionToken.getExtraBinder().registerCallbackListener(extraCallback);
                        callback.postToHandler(13, null, null);
                    } catch (android.os.RemoteException e) {
                        android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in registerCallback.", e);
                    }
                } else {
                    callback.mIControllerCallback = null;
                    this.mPendingCallbacks.add(callback);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public final void unregisterCallback(android.support.v4.media.session.MediaControllerCompat.Callback callback) {
            this.mControllerFwk.unregisterCallback(callback.mCallbackFwk);
            synchronized (this.mLock) {
                if (this.mSessionToken.getExtraBinder() != null) {
                    try {
                        android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21.ExtraCallback extraCallbackRemove = this.mCallbackMap.remove(callback);
                        if (extraCallbackRemove != null) {
                            callback.mIControllerCallback = null;
                            this.mSessionToken.getExtraBinder().unregisterCallbackListener(extraCallbackRemove);
                        }
                    } catch (android.os.RemoteException e) {
                        android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in unregisterCallback.", e);
                    }
                } else {
                    this.mPendingCallbacks.remove(callback);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public boolean dispatchMediaButtonEvent(android.view.KeyEvent keyEvent) {
            return this.mControllerFwk.dispatchMediaButtonEvent(keyEvent);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.support.v4.media.session.MediaControllerCompat.TransportControls getTransportControls() {
            android.media.session.MediaController.TransportControls transportControls = this.mControllerFwk.getTransportControls();
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                return new android.support.v4.media.session.MediaControllerCompat.TransportControlsApi29(transportControls);
            }
            return new android.support.v4.media.session.MediaControllerCompat.TransportControlsApi24(transportControls);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.support.v4.media.session.PlaybackStateCompat getPlaybackState() {
            if (this.mSessionToken.getExtraBinder() != null) {
                try {
                    return this.mSessionToken.getExtraBinder().getPlaybackState();
                } catch (android.os.RemoteException e) {
                    android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in getPlaybackState.", e);
                }
            }
            android.media.session.PlaybackState playbackState = this.mControllerFwk.getPlaybackState();
            if (playbackState != null) {
                return android.support.v4.media.session.PlaybackStateCompat.fromPlaybackState(playbackState);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.support.v4.media.MediaMetadataCompat getMetadata() {
            android.media.MediaMetadata metadata = this.mControllerFwk.getMetadata();
            if (metadata != null) {
                return android.support.v4.media.MediaMetadataCompat.fromMediaMetadata(metadata);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> getQueue() {
            java.util.List<android.media.session.MediaSession.QueueItem> queue = this.mControllerFwk.getQueue();
            if (queue != null) {
                return android.support.v4.media.session.MediaSessionCompat.QueueItem.fromQueueItemList(queue);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void addQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) {
            if ((getFlags() & 4) == 0) {
                throw new java.lang.UnsupportedOperationException("This session doesn't support queue management operations");
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", mediaDescriptionCompat);
            sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM", bundle, null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void addQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if ((getFlags() & 4) == 0) {
                throw new java.lang.UnsupportedOperationException("This session doesn't support queue management operations");
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", mediaDescriptionCompat);
            bundle.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", i);
            sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT", bundle, null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void removeQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) {
            if ((getFlags() & 4) == 0) {
                throw new java.lang.UnsupportedOperationException("This session doesn't support queue management operations");
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", mediaDescriptionCompat);
            sendCommand("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM", bundle, null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public java.lang.CharSequence getQueueTitle() {
            return this.mControllerFwk.getQueueTitle();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.os.Bundle getExtras() {
            return this.mControllerFwk.getExtras();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public int getRatingType() {
            return this.mControllerFwk.getRatingType();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public boolean isCaptioningEnabled() {
            if (this.mSessionToken.getExtraBinder() == null) {
                return false;
            }
            try {
                return this.mSessionToken.getExtraBinder().isCaptioningEnabled();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in isCaptioningEnabled.", e);
                return false;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public int getRepeatMode() {
            if (this.mSessionToken.getExtraBinder() == null) {
                return -1;
            }
            try {
                return this.mSessionToken.getExtraBinder().getRepeatMode();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in getRepeatMode.", e);
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public int getShuffleMode() {
            if (this.mSessionToken.getExtraBinder() == null) {
                return -1;
            }
            try {
                return this.mSessionToken.getExtraBinder().getShuffleMode();
            } catch (android.os.RemoteException e) {
                android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in getShuffleMode.", e);
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public long getFlags() {
            return this.mControllerFwk.getFlags();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.support.v4.media.session.MediaControllerCompat.PlaybackInfo getPlaybackInfo() {
            android.media.session.MediaController.PlaybackInfo playbackInfo = this.mControllerFwk.getPlaybackInfo();
            if (playbackInfo != null) {
                return new android.support.v4.media.session.MediaControllerCompat.PlaybackInfo(playbackInfo.getPlaybackType(), androidx.media.AudioAttributesCompat.wrap(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.app.PendingIntent getSessionActivity() {
            return this.mControllerFwk.getSessionActivity();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void setVolumeTo(int i, int i2) {
            this.mControllerFwk.setVolumeTo(i, i2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void adjustVolume(int i, int i2) {
            this.mControllerFwk.adjustVolume(i, i2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void sendCommand(java.lang.String str, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
            this.mControllerFwk.sendCommand(str, bundle, resultReceiver);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public boolean isSessionReady() {
            return this.mSessionToken.getExtraBinder() != null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public java.lang.String getPackageName() {
            return this.mControllerFwk.getPackageName();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.os.Bundle getSessionInfo() {
            if (this.mSessionInfo != null) {
                return new android.os.Bundle(this.mSessionInfo);
            }
            if (this.mSessionToken.getExtraBinder() != null) {
                try {
                    this.mSessionInfo = this.mSessionToken.getExtraBinder().getSessionInfo();
                } catch (android.os.RemoteException e) {
                    android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in getSessionInfo.", e);
                    this.mSessionInfo = android.os.Bundle.EMPTY;
                }
            }
            android.os.Bundle bundleUnparcelWithClassLoader = android.support.v4.media.session.MediaSessionCompat.unparcelWithClassLoader(this.mSessionInfo);
            this.mSessionInfo = bundleUnparcelWithClassLoader;
            return bundleUnparcelWithClassLoader == null ? android.os.Bundle.EMPTY : new android.os.Bundle(this.mSessionInfo);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public java.lang.Object getMediaController() {
            return this.mControllerFwk;
        }

        private void requestExtraBinder() {
            sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21.ExtraBinderRequestResultReceiver(this));
        }

        void processPendingCallbacksLocked() {
            if (this.mSessionToken.getExtraBinder() == null) {
                return;
            }
            for (android.support.v4.media.session.MediaControllerCompat.Callback callback : this.mPendingCallbacks) {
                android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21.ExtraCallback extraCallback = new android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21.ExtraCallback(callback);
                this.mCallbackMap.put(callback, extraCallback);
                callback.mIControllerCallback = extraCallback;
                try {
                    this.mSessionToken.getExtraBinder().registerCallbackListener(extraCallback);
                    callback.postToHandler(13, null, null);
                } catch (android.os.RemoteException e) {
                    android.util.Log.e(android.support.v4.media.session.MediaControllerCompat.TAG, "Dead object in registerCallback.", e);
                }
            }
            this.mPendingCallbacks.clear();
        }

        static void setMediaController(android.app.Activity activity, android.support.v4.media.session.MediaControllerCompat mediaControllerCompat) {
            activity.setMediaController(mediaControllerCompat != null ? new android.media.session.MediaController(activity, (android.media.session.MediaSession.Token) mediaControllerCompat.getSessionToken().getToken()) : null);
        }

        static android.support.v4.media.session.MediaControllerCompat getMediaController(android.app.Activity activity) {
            android.media.session.MediaController mediaController = activity.getMediaController();
            if (mediaController == null) {
                return null;
            }
            return new android.support.v4.media.session.MediaControllerCompat(activity, android.support.v4.media.session.MediaSessionCompat.Token.fromToken(mediaController.getSessionToken()));
        }

        private static class ExtraBinderRequestResultReceiver extends android.os.ResultReceiver {
            private java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21> mMediaControllerImpl;

            ExtraBinderRequestResultReceiver(android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.mMediaControllerImpl = new java.lang.ref.WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i, android.os.Bundle bundle) {
                android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21 mediaControllerImplApi21 = this.mMediaControllerImpl.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.mLock) {
                    mediaControllerImplApi21.mSessionToken.setExtraBinder(android.support.v4.media.session.IMediaSession.Stub.asInterface(androidx.core.app.BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerImplApi21.mSessionToken.setSession2Token(androidx.versionedparcelable.ParcelUtils.getVersionedParcelable(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                    mediaControllerImplApi21.processPendingCallbacksLocked();
                }
            }
        }

        private static class ExtraCallback extends android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat {
            ExtraCallback(android.support.v4.media.session.MediaControllerCompat.Callback callback) {
                super(callback);
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onSessionDestroyed() throws android.os.RemoteException {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onMetadataChanged(android.support.v4.media.MediaMetadataCompat mediaMetadataCompat) throws android.os.RemoteException {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onQueueChanged(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> list) throws android.os.RemoteException {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onQueueTitleChanged(java.lang.CharSequence charSequence) throws android.os.RemoteException {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onExtrasChanged(android.os.Bundle bundle) throws android.os.RemoteException {
                throw new java.lang.AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onVolumeInfoChanged(android.support.v4.media.session.ParcelableVolumeInfo parcelableVolumeInfo) throws android.os.RemoteException {
                throw new java.lang.AssertionError();
            }
        }
    }

    static class MediaControllerImplApi29 extends android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21 {
        MediaControllerImplApi29(android.content.Context context, android.support.v4.media.session.MediaSessionCompat.Token token) {
            super(context, token);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21, android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.os.Bundle getSessionInfo() {
            if (this.mSessionInfo != null) {
                return new android.os.Bundle(this.mSessionInfo);
            }
            this.mSessionInfo = this.mControllerFwk.getSessionInfo();
            this.mSessionInfo = android.support.v4.media.session.MediaSessionCompat.unparcelWithClassLoader(this.mSessionInfo);
            return this.mSessionInfo == null ? android.os.Bundle.EMPTY : new android.os.Bundle(this.mSessionInfo);
        }
    }

    static class TransportControlsApi21 extends android.support.v4.media.session.MediaControllerCompat.TransportControls {
        protected final android.media.session.MediaController.TransportControls mControlsFwk;

        TransportControlsApi21(android.media.session.MediaController.TransportControls transportControls) {
            this.mControlsFwk = transportControls;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepare() {
            sendCustomAction("android.support.v4.media.session.action.PREPARE", (android.os.Bundle) null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromMediaId(java.lang.String str, android.os.Bundle bundle) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID", str);
            bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
            sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID", bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromSearch(java.lang.String str, android.os.Bundle bundle) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("android.support.v4.media.session.action.ARGUMENT_QUERY", str);
            bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
            sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_SEARCH", bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromUri(android.net.Uri uri, android.os.Bundle bundle) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", uri);
            bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
            sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_URI", bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void play() {
            this.mControlsFwk.play();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void pause() {
            this.mControlsFwk.pause();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void stop() {
            this.mControlsFwk.stop();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void seekTo(long j) {
            this.mControlsFwk.seekTo(j);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void fastForward() {
            this.mControlsFwk.fastForward();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void rewind() {
            this.mControlsFwk.rewind();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void skipToNext() {
            this.mControlsFwk.skipToNext();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void skipToPrevious() {
            this.mControlsFwk.skipToPrevious();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setRating(android.support.v4.media.RatingCompat ratingCompat) {
            this.mControlsFwk.setRating(ratingCompat != null ? (android.media.Rating) ratingCompat.getRating() : null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setRating(android.support.v4.media.RatingCompat ratingCompat, android.os.Bundle bundle) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_RATING", ratingCompat);
            bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
            sendCustomAction("android.support.v4.media.session.action.SET_RATING", bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setPlaybackSpeed(float f) {
            if (f == 0.0f) {
                throw new java.lang.IllegalArgumentException("speed must not be zero");
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", f);
            sendCustomAction("android.support.v4.media.session.action.SET_PLAYBACK_SPEED", bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setCaptioningEnabled(boolean z) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED", z);
            sendCustomAction("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED", bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setRepeatMode(int i) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", i);
            sendCustomAction("android.support.v4.media.session.action.SET_REPEAT_MODE", bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setShuffleMode(int i) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE", i);
            sendCustomAction("android.support.v4.media.session.action.SET_SHUFFLE_MODE", bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromMediaId(java.lang.String str, android.os.Bundle bundle) {
            this.mControlsFwk.playFromMediaId(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromSearch(java.lang.String str, android.os.Bundle bundle) {
            this.mControlsFwk.playFromSearch(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromUri(android.net.Uri uri, android.os.Bundle bundle) {
            if (uri == null || android.net.Uri.EMPTY.equals(uri)) {
                throw new java.lang.IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
            }
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", uri);
            bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
            sendCustomAction("android.support.v4.media.session.action.PLAY_FROM_URI", bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void skipToQueueItem(long j) {
            this.mControlsFwk.skipToQueueItem(j);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void sendCustomAction(android.support.v4.media.session.PlaybackStateCompat.CustomAction customAction, android.os.Bundle bundle) {
            android.support.v4.media.session.MediaControllerCompat.validateCustomAction(customAction.getAction(), bundle);
            this.mControlsFwk.sendCustomAction(customAction.getAction(), bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void sendCustomAction(java.lang.String str, android.os.Bundle bundle) {
            android.support.v4.media.session.MediaControllerCompat.validateCustomAction(str, bundle);
            this.mControlsFwk.sendCustomAction(str, bundle);
        }
    }

    static class TransportControlsApi23 extends android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21 {
        TransportControlsApi23(android.media.session.MediaController.TransportControls transportControls) {
            super(transportControls);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21, android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromUri(android.net.Uri uri, android.os.Bundle bundle) {
            this.mControlsFwk.playFromUri(uri, bundle);
        }
    }

    static class TransportControlsApi24 extends android.support.v4.media.session.MediaControllerCompat.TransportControlsApi23 {
        TransportControlsApi24(android.media.session.MediaController.TransportControls transportControls) {
            super(transportControls);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21, android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepare() {
            this.mControlsFwk.prepare();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21, android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromMediaId(java.lang.String str, android.os.Bundle bundle) {
            this.mControlsFwk.prepareFromMediaId(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21, android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromSearch(java.lang.String str, android.os.Bundle bundle) {
            this.mControlsFwk.prepareFromSearch(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21, android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromUri(android.net.Uri uri, android.os.Bundle bundle) {
            this.mControlsFwk.prepareFromUri(uri, bundle);
        }
    }

    static class TransportControlsApi29 extends android.support.v4.media.session.MediaControllerCompat.TransportControlsApi24 {
        TransportControlsApi29(android.media.session.MediaController.TransportControls transportControls) {
            super(transportControls);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21, android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setPlaybackSpeed(float f) {
            if (f == 0.0f) {
                throw new java.lang.IllegalArgumentException("speed must not be zero");
            }
            this.mControlsFwk.setPlaybackSpeed(f);
        }
    }
}
