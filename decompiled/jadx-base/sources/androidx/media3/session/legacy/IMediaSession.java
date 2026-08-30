package androidx.media3.session.legacy;

/* JADX INFO: loaded from: classes.dex */
public interface IMediaSession extends android.os.IInterface {
    void addQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat) throws android.os.RemoteException;

    void addQueueItemAt(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat, int i) throws android.os.RemoteException;

    void adjustVolume(int i, int i2, java.lang.String str) throws android.os.RemoteException;

    void fastForward() throws android.os.RemoteException;

    android.os.Bundle getExtras() throws android.os.RemoteException;

    long getFlags() throws android.os.RemoteException;

    android.app.PendingIntent getLaunchPendingIntent() throws android.os.RemoteException;

    androidx.media3.session.legacy.MediaMetadataCompat getMetadata() throws android.os.RemoteException;

    java.lang.String getPackageName() throws android.os.RemoteException;

    androidx.media3.session.legacy.PlaybackStateCompat getPlaybackState() throws android.os.RemoteException;

    java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> getQueue() throws android.os.RemoteException;

    java.lang.CharSequence getQueueTitle() throws android.os.RemoteException;

    int getRatingType() throws android.os.RemoteException;

    int getRepeatMode() throws android.os.RemoteException;

    android.os.Bundle getSessionInfo() throws android.os.RemoteException;

    int getShuffleMode() throws android.os.RemoteException;

    java.lang.String getTag() throws android.os.RemoteException;

    androidx.media3.session.legacy.ParcelableVolumeInfo getVolumeAttributes() throws android.os.RemoteException;

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

    void rate(androidx.media3.session.legacy.RatingCompat ratingCompat) throws android.os.RemoteException;

    void rateWithExtras(androidx.media3.session.legacy.RatingCompat ratingCompat, android.os.Bundle bundle) throws android.os.RemoteException;

    void registerCallbackListener(androidx.media3.session.legacy.IMediaControllerCallback iMediaControllerCallback) throws android.os.RemoteException;

    void removeQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat) throws android.os.RemoteException;

    void removeQueueItemAt(int i) throws android.os.RemoteException;

    void rewind() throws android.os.RemoteException;

    void seekTo(long j) throws android.os.RemoteException;

    void sendCommand(java.lang.String str, android.os.Bundle bundle, androidx.media3.session.legacy.MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws android.os.RemoteException;

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

    void unregisterCallbackListener(androidx.media3.session.legacy.IMediaControllerCallback iMediaControllerCallback) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements androidx.media3.session.legacy.IMediaSession {
        private static final java.lang.String DESCRIPTOR = "android.support.v4.media.session.IMediaSession";
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
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        public static androidx.media3.session.legacy.IMediaSession asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof androidx.media3.session.legacy.IMediaSession)) {
                return (androidx.media3.session.legacy.IMediaSession) iInterfaceQueryLocalInterface;
            }
            return new androidx.media3.session.legacy.IMediaSession.Stub.Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i == 1598968902) {
                ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeString("android.support.v4.media.session.IMediaSession");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    sendCommand(parcel.readString(), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? androidx.media3.session.legacy.MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel) : null);
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zSendMediaButton = sendMediaButton(parcel.readInt() != 0 ? (android.view.KeyEvent) android.view.KeyEvent.CREATOR.createFromParcel(parcel) : null);
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeInt(zSendMediaButton ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    registerCallbackListener(androidx.media3.session.legacy.IMediaControllerCallback.Stub.asInterface(parcel.readStrongBinder()));
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    unregisterCallbackListener(androidx.media3.session.legacy.IMediaControllerCallback.Stub.asInterface(parcel.readStrongBinder()));
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zIsTransportControlEnabled = isTransportControlEnabled();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeInt(zIsTransportControlEnabled ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    java.lang.String packageName = getPackageName();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeString(packageName);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    java.lang.String tag = getTag();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeString(tag);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    android.app.PendingIntent launchPendingIntent = getLaunchPendingIntent();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    if (launchPendingIntent != null) {
                        ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeInt(1);
                        launchPendingIntent.writeToParcel(parcel2, 1);
                    } else {
                        ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeInt(0);
                    }
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    long flags = getFlags();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeLong(flags);
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    androidx.media3.session.legacy.ParcelableVolumeInfo volumeAttributes = getVolumeAttributes();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    if (volumeAttributes != null) {
                        ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeInt(1);
                        volumeAttributes.writeToParcel(parcel2, 1);
                    } else {
                        ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeInt(0);
                    }
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    adjustVolume(parcel.readInt(), parcel.readInt(), parcel.readString());
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    setVolumeTo(parcel.readInt(), parcel.readInt(), parcel.readString());
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    play();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    playFromMediaId(parcel.readString(), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    playFromSearch(parcel.readString(), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    playFromUri(parcel.readInt() != 0 ? (android.net.Uri) android.net.Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    skipToQueueItem(parcel.readLong());
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    pause();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    stop();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    next();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    previous();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    fastForward();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    rewind();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    seekTo(parcel.readLong());
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    rate(parcel.readInt() != 0 ? androidx.media3.session.legacy.RatingCompat.CREATOR.createFromParcel(parcel) : null);
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    sendCustomAction(parcel.readString(), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    androidx.media3.session.legacy.MediaMetadataCompat metadata = getMetadata();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    if (metadata != null) {
                        ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeInt(1);
                        metadata.writeToParcel(parcel2, 1);
                    } else {
                        ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeInt(0);
                    }
                    return true;
                case 28:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    androidx.media3.session.legacy.PlaybackStateCompat playbackState = getPlaybackState();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    if (playbackState != null) {
                        ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeInt(1);
                        playbackState.writeToParcel(parcel2, 1);
                    } else {
                        ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeInt(0);
                    }
                    return true;
                case 29:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> queue = getQueue();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeTypedList(queue);
                    return true;
                case 30:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    java.lang.CharSequence queueTitle = getQueueTitle();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    if (queueTitle != null) {
                        ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeInt(1);
                        android.text.TextUtils.writeToParcel(queueTitle, parcel2, 1);
                    } else {
                        ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeInt(0);
                    }
                    return true;
                case 31:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    android.os.Bundle extras = getExtras();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    if (extras != null) {
                        ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeInt(1);
                        extras.writeToParcel(parcel2, 1);
                    } else {
                        ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeInt(0);
                    }
                    return true;
                case 32:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int ratingType = getRatingType();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeInt(ratingType);
                    return true;
                case 33:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    prepare();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    prepareFromMediaId(parcel.readString(), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    prepareFromSearch(parcel.readString(), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    prepareFromUri(parcel.readInt() != 0 ? (android.net.Uri) android.net.Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int repeatMode = getRepeatMode();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeInt(repeatMode);
                    return true;
                case 38:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zIsShuffleModeEnabledRemoved = isShuffleModeEnabledRemoved();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeInt(zIsShuffleModeEnabledRemoved ? 1 : 0);
                    return true;
                case 39:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    setRepeatMode(parcel.readInt());
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    setShuffleModeEnabledRemoved(parcel.readInt() != 0);
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    addQueueItem(parcel.readInt() != 0 ? androidx.media3.session.legacy.MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    addQueueItemAt(parcel.readInt() != 0 ? androidx.media3.session.legacy.MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    removeQueueItem(parcel.readInt() != 0 ? androidx.media3.session.legacy.MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    removeQueueItemAt(parcel.readInt());
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 45:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zIsCaptioningEnabled = isCaptioningEnabled();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeInt(zIsCaptioningEnabled ? 1 : 0);
                    return true;
                case 46:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    setCaptioningEnabled(parcel.readInt() != 0);
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int shuffleMode = getShuffleMode();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeInt(shuffleMode);
                    return true;
                case 48:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    setShuffleMode(parcel.readInt());
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 49:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    setPlaybackSpeed(parcel.readFloat());
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                case 50:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    android.os.Bundle sessionInfo = getSessionInfo();
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    if (sessionInfo != null) {
                        ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeInt(1);
                        sessionInfo.writeToParcel(parcel2, 1);
                    } else {
                        ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeInt(0);
                    }
                    return true;
                case 51:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    rateWithExtras(parcel.readInt() != 0 ? androidx.media3.session.legacy.RatingCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                    ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        private static class Proxy implements androidx.media3.session.legacy.IMediaSession {
            public static androidx.media3.session.legacy.IMediaSession sDefaultImpl;
            private android.os.IBinder mRemote;

            public java.lang.String getInterfaceDescriptor() {
                return "android.support.v4.media.session.IMediaSession";
            }

            Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void sendCommand(java.lang.String str, android.os.Bundle bundle, androidx.media3.session.legacy.MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (resultReceiverWrapper != null) {
                        parcelObtain.writeInt(1);
                        resultReceiverWrapper.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).sendCommand(str, bundle, resultReceiverWrapper);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public boolean sendMediaButton(android.view.KeyEvent keyEvent) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (keyEvent != null) {
                        parcelObtain.writeInt(1);
                        keyEvent.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        return ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).sendMediaButton(keyEvent);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void registerCallbackListener(androidx.media3.session.legacy.IMediaControllerCallback iMediaControllerCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongBinder(iMediaControllerCallback != null ? iMediaControllerCallback.asBinder() : null);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).registerCallbackListener(iMediaControllerCallback);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void unregisterCallbackListener(androidx.media3.session.legacy.IMediaControllerCallback iMediaControllerCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongBinder(iMediaControllerCallback != null ? iMediaControllerCallback.asBinder() : null);
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).unregisterCallbackListener(iMediaControllerCallback);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public boolean isTransportControlEnabled() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        return ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).isTransportControlEnabled();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public java.lang.String getPackageName() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        return ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).getPackageName();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public java.lang.String getTag() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.mRemote.transact(7, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        return ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).getTag();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public android.app.PendingIntent getLaunchPendingIntent() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.mRemote.transact(8, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        return ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).getLaunchPendingIntent();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (android.app.PendingIntent) android.app.PendingIntent.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public long getFlags() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.mRemote.transact(9, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        return ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).getFlags();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public androidx.media3.session.legacy.ParcelableVolumeInfo getVolumeAttributes() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.mRemote.transact(10, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        return ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).getVolumeAttributes();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? androidx.media3.session.legacy.ParcelableVolumeInfo.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void adjustVolume(int i, int i2, java.lang.String str) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(11, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).adjustVolume(i, i2, str);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void setVolumeTo(int i, int i2, java.lang.String str) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(12, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).setVolumeTo(i, i2, str);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public androidx.media3.session.legacy.MediaMetadataCompat getMetadata() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.mRemote.transact(27, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        return ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).getMetadata();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? androidx.media3.session.legacy.MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public androidx.media3.session.legacy.PlaybackStateCompat getPlaybackState() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.mRemote.transact(28, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        return ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).getPlaybackState();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? androidx.media3.session.legacy.PlaybackStateCompat.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> getQueue() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.mRemote.transact(29, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        return ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).getQueue();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(androidx.media3.session.legacy.MediaSessionCompat.QueueItem.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public java.lang.CharSequence getQueueTitle() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.mRemote.transact(30, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        return ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).getQueueTitle();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public android.os.Bundle getExtras() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.mRemote.transact(31, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        return ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).getExtras();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public int getRatingType() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.mRemote.transact(32, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        return ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).getRatingType();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public boolean isCaptioningEnabled() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.mRemote.transact(45, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        return ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).isCaptioningEnabled();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public int getRepeatMode() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.mRemote.transact(37, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        return ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).getRepeatMode();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public boolean isShuffleModeEnabledRemoved() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.mRemote.transact(38, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        return ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).isShuffleModeEnabledRemoved();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public int getShuffleMode() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.mRemote.transact(47, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        return ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).getShuffleMode();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void addQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (mediaDescriptionCompat != null) {
                        parcelObtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(41, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).addQueueItem(mediaDescriptionCompat);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void addQueueItemAt(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat, int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (mediaDescriptionCompat != null) {
                        parcelObtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(42, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).addQueueItemAt(mediaDescriptionCompat, i);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void removeQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (mediaDescriptionCompat != null) {
                        parcelObtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(43, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).removeQueueItem(mediaDescriptionCompat);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void removeQueueItemAt(int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(44, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).removeQueueItemAt(i);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public android.os.Bundle getSessionInfo() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.mRemote.transact(50, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        return ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).getSessionInfo();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void prepare() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.mRemote.transact(33, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).prepare();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void prepareFromMediaId(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(34, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).prepareFromMediaId(str, bundle);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void prepareFromSearch(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(35, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).prepareFromSearch(str, bundle);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void prepareFromUri(android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(36, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).prepareFromUri(uri, bundle);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void play() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.mRemote.transact(13, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).play();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void playFromMediaId(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(14, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).playFromMediaId(str, bundle);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void playFromSearch(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(15, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).playFromSearch(str, bundle);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void playFromUri(android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(16, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).playFromUri(uri, bundle);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void skipToQueueItem(long j) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeLong(j);
                    if (!this.mRemote.transact(17, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).skipToQueueItem(j);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void pause() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.mRemote.transact(18, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).pause();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void stop() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.mRemote.transact(19, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).stop();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void next() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.mRemote.transact(20, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).next();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void previous() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.mRemote.transact(21, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).previous();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void fastForward() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.mRemote.transact(22, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).fastForward();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void rewind() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.mRemote.transact(23, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).rewind();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void seekTo(long j) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeLong(j);
                    if (!this.mRemote.transact(24, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).seekTo(j);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void rate(androidx.media3.session.legacy.RatingCompat ratingCompat) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (ratingCompat != null) {
                        parcelObtain.writeInt(1);
                        ratingCompat.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(25, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).rate(ratingCompat);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void rateWithExtras(androidx.media3.session.legacy.RatingCompat ratingCompat, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (ratingCompat != null) {
                        parcelObtain.writeInt(1);
                        ratingCompat.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(51, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).rateWithExtras(ratingCompat, bundle);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void setPlaybackSpeed(float f) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeFloat(f);
                    if (!this.mRemote.transact(49, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).setPlaybackSpeed(f);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void setCaptioningEnabled(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (!this.mRemote.transact(46, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).setCaptioningEnabled(z);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void setRepeatMode(int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(39, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).setRepeatMode(i);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void setShuffleModeEnabledRemoved(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (!this.mRemote.transact(40, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).setShuffleModeEnabledRemoved(z);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void setShuffleMode(int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(48, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).setShuffleMode(i);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void sendCustomAction(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(26, parcelObtain, parcelObtain2, 0) && androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() != null) {
                        ((androidx.media3.session.legacy.IMediaSession) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl())).sendCustomAction(str, bundle);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(androidx.media3.session.legacy.IMediaSession iMediaSession) {
            if (androidx.media3.session.legacy.IMediaSession.Stub.Proxy.sDefaultImpl != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (iMediaSession == null) {
                return false;
            }
            androidx.media3.session.legacy.IMediaSession.Stub.Proxy.sDefaultImpl = iMediaSession;
            return true;
        }

        public static androidx.media3.session.legacy.IMediaSession getDefaultImpl() {
            return androidx.media3.session.legacy.IMediaSession.Stub.Proxy.sDefaultImpl;
        }
    }
}
