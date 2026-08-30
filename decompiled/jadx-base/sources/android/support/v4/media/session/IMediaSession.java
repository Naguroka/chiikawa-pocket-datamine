package android.support.v4.media.session;

/* JADX INFO: loaded from: classes.dex */
public interface IMediaSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.support.v4.media.session.IMediaSession";

    public static class Default implements android.support.v4.media.session.IMediaSession {
        @Override // android.support.v4.media.session.IMediaSession
        public void addQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void addQueueItemAt(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat, int i) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void adjustVolume(int i, int i2, java.lang.String str) throws android.os.RemoteException {
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void fastForward() throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public android.os.Bundle getExtras() throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public long getFlags() throws android.os.RemoteException {
            return 0L;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public android.app.PendingIntent getLaunchPendingIntent() throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public android.support.v4.media.MediaMetadataCompat getMetadata() throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public java.lang.String getPackageName() throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public android.support.v4.media.session.PlaybackStateCompat getPlaybackState() throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> getQueue() throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public java.lang.CharSequence getQueueTitle() throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public int getRatingType() throws android.os.RemoteException {
            return 0;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public int getRepeatMode() throws android.os.RemoteException {
            return 0;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public android.os.Bundle getSessionInfo() throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public int getShuffleMode() throws android.os.RemoteException {
            return 0;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public java.lang.String getTag() throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public android.support.v4.media.session.ParcelableVolumeInfo getVolumeAttributes() throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public boolean isCaptioningEnabled() throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public boolean isShuffleModeEnabledRemoved() throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public boolean isTransportControlEnabled() throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void next() throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void pause() throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void play() throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void playFromMediaId(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void playFromSearch(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void playFromUri(android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void prepare() throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void prepareFromMediaId(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void prepareFromSearch(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void prepareFromUri(android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void previous() throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void rate(android.support.v4.media.RatingCompat ratingCompat) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void rateWithExtras(android.support.v4.media.RatingCompat ratingCompat, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void registerCallbackListener(android.support.v4.media.session.IMediaControllerCallback iMediaControllerCallback) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void removeQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void removeQueueItemAt(int i) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void rewind() throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void seekTo(long j) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void sendCommand(java.lang.String str, android.os.Bundle bundle, android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void sendCustomAction(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public boolean sendMediaButton(android.view.KeyEvent keyEvent) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void setCaptioningEnabled(boolean z) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void setPlaybackSpeed(float f) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void setRepeatMode(int i) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void setShuffleMode(int i) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void setShuffleModeEnabledRemoved(boolean z) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void setVolumeTo(int i, int i2, java.lang.String str) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void skipToQueueItem(long j) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void stop() throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void unregisterCallbackListener(android.support.v4.media.session.IMediaControllerCallback iMediaControllerCallback) throws android.os.RemoteException {
        }
    }

    void addQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) throws android.os.RemoteException;

    void addQueueItemAt(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat, int i) throws android.os.RemoteException;

    void adjustVolume(int i, int i2, java.lang.String str) throws android.os.RemoteException;

    void fastForward() throws android.os.RemoteException;

    android.os.Bundle getExtras() throws android.os.RemoteException;

    long getFlags() throws android.os.RemoteException;

    android.app.PendingIntent getLaunchPendingIntent() throws android.os.RemoteException;

    android.support.v4.media.MediaMetadataCompat getMetadata() throws android.os.RemoteException;

    java.lang.String getPackageName() throws android.os.RemoteException;

    android.support.v4.media.session.PlaybackStateCompat getPlaybackState() throws android.os.RemoteException;

    java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> getQueue() throws android.os.RemoteException;

    java.lang.CharSequence getQueueTitle() throws android.os.RemoteException;

    int getRatingType() throws android.os.RemoteException;

    int getRepeatMode() throws android.os.RemoteException;

    android.os.Bundle getSessionInfo() throws android.os.RemoteException;

    int getShuffleMode() throws android.os.RemoteException;

    java.lang.String getTag() throws android.os.RemoteException;

    android.support.v4.media.session.ParcelableVolumeInfo getVolumeAttributes() throws android.os.RemoteException;

    boolean isCaptioningEnabled() throws android.os.RemoteException;

    boolean isShuffleModeEnabledRemoved() throws android.os.RemoteException;

    boolean isTransportControlEnabled() throws android.os.RemoteException;

    void next() throws android.os.RemoteException;

    void pause() throws android.os.RemoteException;

    void play() throws android.os.RemoteException;

    void playFromMediaId(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    void playFromSearch(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    void playFromUri(android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException;

    void prepare() throws android.os.RemoteException;

    void prepareFromMediaId(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    void prepareFromSearch(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    void prepareFromUri(android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException;

    void previous() throws android.os.RemoteException;

    void rate(android.support.v4.media.RatingCompat ratingCompat) throws android.os.RemoteException;

    void rateWithExtras(android.support.v4.media.RatingCompat ratingCompat, android.os.Bundle bundle) throws android.os.RemoteException;

    void registerCallbackListener(android.support.v4.media.session.IMediaControllerCallback iMediaControllerCallback) throws android.os.RemoteException;

    void removeQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) throws android.os.RemoteException;

    void removeQueueItemAt(int i) throws android.os.RemoteException;

    void rewind() throws android.os.RemoteException;

    void seekTo(long j) throws android.os.RemoteException;

    void sendCommand(java.lang.String str, android.os.Bundle bundle, android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws android.os.RemoteException;

    void sendCustomAction(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    boolean sendMediaButton(android.view.KeyEvent keyEvent) throws android.os.RemoteException;

    void setCaptioningEnabled(boolean z) throws android.os.RemoteException;

    void setPlaybackSpeed(float f) throws android.os.RemoteException;

    void setRepeatMode(int i) throws android.os.RemoteException;

    void setShuffleMode(int i) throws android.os.RemoteException;

    void setShuffleModeEnabledRemoved(boolean z) throws android.os.RemoteException;

    void setVolumeTo(int i, int i2, java.lang.String str) throws android.os.RemoteException;

    void skipToQueueItem(long j) throws android.os.RemoteException;

    void stop() throws android.os.RemoteException;

    void unregisterCallbackListener(android.support.v4.media.session.IMediaControllerCallback iMediaControllerCallback) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.support.v4.media.session.IMediaSession {
        static final int TRANSACTION_addQueueItem = 41;
        static final int TRANSACTION_addQueueItemAt = 42;
        static final int TRANSACTION_adjustVolume = 11;
        static final int TRANSACTION_fastForward = 22;
        static final int TRANSACTION_getExtras = 31;
        static final int TRANSACTION_getFlags = 9;
        static final int TRANSACTION_getLaunchPendingIntent = 8;
        static final int TRANSACTION_getMetadata = 27;
        static final int TRANSACTION_getPackageName = 6;
        static final int TRANSACTION_getPlaybackState = 28;
        static final int TRANSACTION_getQueue = 29;
        static final int TRANSACTION_getQueueTitle = 30;
        static final int TRANSACTION_getRatingType = 32;
        static final int TRANSACTION_getRepeatMode = 37;
        static final int TRANSACTION_getSessionInfo = 50;
        static final int TRANSACTION_getShuffleMode = 47;
        static final int TRANSACTION_getTag = 7;
        static final int TRANSACTION_getVolumeAttributes = 10;
        static final int TRANSACTION_isCaptioningEnabled = 45;
        static final int TRANSACTION_isShuffleModeEnabledRemoved = 38;
        static final int TRANSACTION_isTransportControlEnabled = 5;
        static final int TRANSACTION_next = 20;
        static final int TRANSACTION_pause = 18;
        static final int TRANSACTION_play = 13;
        static final int TRANSACTION_playFromMediaId = 14;
        static final int TRANSACTION_playFromSearch = 15;
        static final int TRANSACTION_playFromUri = 16;
        static final int TRANSACTION_prepare = 33;
        static final int TRANSACTION_prepareFromMediaId = 34;
        static final int TRANSACTION_prepareFromSearch = 35;
        static final int TRANSACTION_prepareFromUri = 36;
        static final int TRANSACTION_previous = 21;
        static final int TRANSACTION_rate = 25;
        static final int TRANSACTION_rateWithExtras = 51;
        static final int TRANSACTION_registerCallbackListener = 3;
        static final int TRANSACTION_removeQueueItem = 43;
        static final int TRANSACTION_removeQueueItemAt = 44;
        static final int TRANSACTION_rewind = 23;
        static final int TRANSACTION_seekTo = 24;
        static final int TRANSACTION_sendCommand = 1;
        static final int TRANSACTION_sendCustomAction = 26;
        static final int TRANSACTION_sendMediaButton = 2;
        static final int TRANSACTION_setCaptioningEnabled = 46;
        static final int TRANSACTION_setPlaybackSpeed = 49;
        static final int TRANSACTION_setRepeatMode = 39;
        static final int TRANSACTION_setShuffleMode = 48;
        static final int TRANSACTION_setShuffleModeEnabledRemoved = 40;
        static final int TRANSACTION_setVolumeTo = 12;
        static final int TRANSACTION_skipToQueueItem = 17;
        static final int TRANSACTION_stop = 19;
        static final int TRANSACTION_unregisterCallbackListener = 4;

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, android.support.v4.media.session.IMediaSession.DESCRIPTOR);
        }

        public static android.support.v4.media.session.IMediaSession asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof android.support.v4.media.session.IMediaSession)) {
                return (android.support.v4.media.session.IMediaSession) iInterfaceQueryLocalInterface;
            }
            return new android.support.v4.media.session.IMediaSession.Stub.Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    sendCommand(parcel.readString(), (android.os.Bundle) android.support.v4.media.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR), (android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper) android.support.v4.media.session.IMediaSession._Parcel.readTypedObject(parcel, android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    boolean zSendMediaButton = sendMediaButton((android.view.KeyEvent) android.support.v4.media.session.IMediaSession._Parcel.readTypedObject(parcel, android.view.KeyEvent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendMediaButton ? 1 : 0);
                    return true;
                case 3:
                    registerCallbackListener(android.support.v4.media.session.IMediaControllerCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    unregisterCallbackListener(android.support.v4.media.session.IMediaControllerCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    boolean zIsTransportControlEnabled = isTransportControlEnabled();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsTransportControlEnabled ? 1 : 0);
                    return true;
                case 6:
                    java.lang.String packageName = getPackageName();
                    parcel2.writeNoException();
                    parcel2.writeString(packageName);
                    return true;
                case 7:
                    java.lang.String tag = getTag();
                    parcel2.writeNoException();
                    parcel2.writeString(tag);
                    return true;
                case 8:
                    android.app.PendingIntent launchPendingIntent = getLaunchPendingIntent();
                    parcel2.writeNoException();
                    android.support.v4.media.session.IMediaSession._Parcel.writeTypedObject(parcel2, launchPendingIntent, 1);
                    return true;
                case 9:
                    long flags = getFlags();
                    parcel2.writeNoException();
                    parcel2.writeLong(flags);
                    return true;
                case 10:
                    android.support.v4.media.session.ParcelableVolumeInfo volumeAttributes = getVolumeAttributes();
                    parcel2.writeNoException();
                    android.support.v4.media.session.IMediaSession._Parcel.writeTypedObject(parcel2, volumeAttributes, 1);
                    return true;
                case 11:
                    adjustVolume(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    setVolumeTo(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    play();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    playFromMediaId(parcel.readString(), (android.os.Bundle) android.support.v4.media.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    playFromSearch(parcel.readString(), (android.os.Bundle) android.support.v4.media.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    playFromUri((android.net.Uri) android.support.v4.media.session.IMediaSession._Parcel.readTypedObject(parcel, android.net.Uri.CREATOR), (android.os.Bundle) android.support.v4.media.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    skipToQueueItem(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    pause();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    stop();
                    parcel2.writeNoException();
                    return true;
                case 20:
                    next();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    previous();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    fastForward();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    rewind();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    seekTo(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    rate((android.support.v4.media.RatingCompat) android.support.v4.media.session.IMediaSession._Parcel.readTypedObject(parcel, android.support.v4.media.RatingCompat.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    sendCustomAction(parcel.readString(), (android.os.Bundle) android.support.v4.media.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 27:
                    android.support.v4.media.MediaMetadataCompat metadata = getMetadata();
                    parcel2.writeNoException();
                    android.support.v4.media.session.IMediaSession._Parcel.writeTypedObject(parcel2, metadata, 1);
                    return true;
                case 28:
                    android.support.v4.media.session.PlaybackStateCompat playbackState = getPlaybackState();
                    parcel2.writeNoException();
                    android.support.v4.media.session.IMediaSession._Parcel.writeTypedObject(parcel2, playbackState, 1);
                    return true;
                case 29:
                    java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> queue = getQueue();
                    parcel2.writeNoException();
                    android.support.v4.media.session.IMediaSession._Parcel.writeTypedList(parcel2, queue, 1);
                    return true;
                case 30:
                    java.lang.CharSequence queueTitle = getQueueTitle();
                    parcel2.writeNoException();
                    if (queueTitle != null) {
                        parcel2.writeInt(1);
                        android.text.TextUtils.writeToParcel(queueTitle, parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 31:
                    android.os.Bundle extras = getExtras();
                    parcel2.writeNoException();
                    android.support.v4.media.session.IMediaSession._Parcel.writeTypedObject(parcel2, extras, 1);
                    return true;
                case 32:
                    int ratingType = getRatingType();
                    parcel2.writeNoException();
                    parcel2.writeInt(ratingType);
                    return true;
                case 33:
                    prepare();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    prepareFromMediaId(parcel.readString(), (android.os.Bundle) android.support.v4.media.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 35:
                    prepareFromSearch(parcel.readString(), (android.os.Bundle) android.support.v4.media.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 36:
                    prepareFromUri((android.net.Uri) android.support.v4.media.session.IMediaSession._Parcel.readTypedObject(parcel, android.net.Uri.CREATOR), (android.os.Bundle) android.support.v4.media.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 37:
                    int repeatMode = getRepeatMode();
                    parcel2.writeNoException();
                    parcel2.writeInt(repeatMode);
                    return true;
                case 38:
                    boolean zIsShuffleModeEnabledRemoved = isShuffleModeEnabledRemoved();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsShuffleModeEnabledRemoved ? 1 : 0);
                    return true;
                case 39:
                    setRepeatMode(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    setShuffleModeEnabledRemoved(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 41:
                    addQueueItem((android.support.v4.media.MediaDescriptionCompat) android.support.v4.media.session.IMediaSession._Parcel.readTypedObject(parcel, android.support.v4.media.MediaDescriptionCompat.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 42:
                    addQueueItemAt((android.support.v4.media.MediaDescriptionCompat) android.support.v4.media.session.IMediaSession._Parcel.readTypedObject(parcel, android.support.v4.media.MediaDescriptionCompat.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    removeQueueItem((android.support.v4.media.MediaDescriptionCompat) android.support.v4.media.session.IMediaSession._Parcel.readTypedObject(parcel, android.support.v4.media.MediaDescriptionCompat.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 44:
                    removeQueueItemAt(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 45:
                    boolean zIsCaptioningEnabled = isCaptioningEnabled();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsCaptioningEnabled ? 1 : 0);
                    return true;
                case 46:
                    setCaptioningEnabled(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 47:
                    int shuffleMode = getShuffleMode();
                    parcel2.writeNoException();
                    parcel2.writeInt(shuffleMode);
                    return true;
                case 48:
                    setShuffleMode(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 49:
                    setPlaybackSpeed(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 50:
                    android.os.Bundle sessionInfo = getSessionInfo();
                    parcel2.writeNoException();
                    android.support.v4.media.session.IMediaSession._Parcel.writeTypedObject(parcel2, sessionInfo, 1);
                    return true;
                case 51:
                    rateWithExtras((android.support.v4.media.RatingCompat) android.support.v4.media.session.IMediaSession._Parcel.readTypedObject(parcel, android.support.v4.media.RatingCompat.CREATOR), (android.os.Bundle) android.support.v4.media.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        private static class Proxy implements android.support.v4.media.session.IMediaSession {
            private android.os.IBinder mRemote;

            public java.lang.String getInterfaceDescriptor() {
                return android.support.v4.media.session.IMediaSession.DESCRIPTOR;
            }

            Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCommand(java.lang.String str, android.os.Bundle bundle, android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    android.support.v4.media.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    android.support.v4.media.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, resultReceiverWrapper, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean sendMediaButton(android.view.KeyEvent keyEvent) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    android.support.v4.media.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, keyEvent, 0);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void registerCallbackListener(android.support.v4.media.session.IMediaControllerCallback iMediaControllerCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaControllerCallback);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void unregisterCallbackListener(android.support.v4.media.session.IMediaControllerCallback iMediaControllerCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaControllerCallback);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isTransportControlEnabled() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.lang.String getPackageName() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.lang.String getTag() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.app.PendingIntent getLaunchPendingIntent() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (android.app.PendingIntent) android.support.v4.media.session.IMediaSession._Parcel.readTypedObject(parcelObtain2, android.app.PendingIntent.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public long getFlags() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.support.v4.media.session.ParcelableVolumeInfo getVolumeAttributes() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (android.support.v4.media.session.ParcelableVolumeInfo) android.support.v4.media.session.IMediaSession._Parcel.readTypedObject(parcelObtain2, android.support.v4.media.session.ParcelableVolumeInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void adjustVolume(int i, int i2, java.lang.String str) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setVolumeTo(int i, int i2, java.lang.String str) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.support.v4.media.MediaMetadataCompat getMetadata() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(27, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (android.support.v4.media.MediaMetadataCompat) android.support.v4.media.session.IMediaSession._Parcel.readTypedObject(parcelObtain2, android.support.v4.media.MediaMetadataCompat.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.support.v4.media.session.PlaybackStateCompat getPlaybackState() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(28, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (android.support.v4.media.session.PlaybackStateCompat) android.support.v4.media.session.IMediaSession._Parcel.readTypedObject(parcelObtain2, android.support.v4.media.session.PlaybackStateCompat.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> getQueue() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(29, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(android.support.v4.media.session.MediaSessionCompat.QueueItem.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.lang.CharSequence getQueueTitle() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(30, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (java.lang.CharSequence) android.support.v4.media.session.IMediaSession._Parcel.readTypedObject(parcelObtain2, android.text.TextUtils.CHAR_SEQUENCE_CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.os.Bundle getExtras() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(31, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (android.os.Bundle) android.support.v4.media.session.IMediaSession._Parcel.readTypedObject(parcelObtain2, android.os.Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRatingType() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(32, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isCaptioningEnabled() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(45, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRepeatMode() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(37, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isShuffleModeEnabledRemoved() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(38, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getShuffleMode() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(47, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    android.support.v4.media.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, mediaDescriptionCompat, 0);
                    this.mRemote.transact(41, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItemAt(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat, int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    android.support.v4.media.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, mediaDescriptionCompat, 0);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(42, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    android.support.v4.media.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, mediaDescriptionCompat, 0);
                    this.mRemote.transact(43, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItemAt(int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(44, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.os.Bundle getSessionInfo() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(50, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (android.os.Bundle) android.support.v4.media.session.IMediaSession._Parcel.readTypedObject(parcelObtain2, android.os.Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepare() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(33, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromMediaId(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    android.support.v4.media.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(34, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromSearch(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    android.support.v4.media.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(35, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromUri(android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    android.support.v4.media.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, uri, 0);
                    android.support.v4.media.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(36, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void play() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromMediaId(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    android.support.v4.media.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromSearch(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    android.support.v4.media.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromUri(android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    android.support.v4.media.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, uri, 0);
                    android.support.v4.media.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void skipToQueueItem(long j) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void pause() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void stop() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void next() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void previous() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(21, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void fastForward() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(22, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rewind() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    this.mRemote.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void seekTo(long j) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(24, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rate(android.support.v4.media.RatingCompat ratingCompat) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    android.support.v4.media.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, ratingCompat, 0);
                    this.mRemote.transact(25, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rateWithExtras(android.support.v4.media.RatingCompat ratingCompat, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    android.support.v4.media.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, ratingCompat, 0);
                    android.support.v4.media.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(51, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setPlaybackSpeed(float f) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeFloat(f);
                    this.mRemote.transact(49, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setCaptioningEnabled(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(46, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setRepeatMode(int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(39, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleModeEnabledRemoved(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(40, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleMode(int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(48, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCustomAction(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    android.support.v4.media.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(26, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(android.os.Parcel parcel, android.os.Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends android.os.Parcelable> void writeTypedObject(android.os.Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends android.os.Parcelable> void writeTypedList(android.os.Parcel parcel, java.util.List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                writeTypedObject(parcel, list.get(i2), i);
            }
        }
    }
}
