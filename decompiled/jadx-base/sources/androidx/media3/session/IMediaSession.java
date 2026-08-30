package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public interface IMediaSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "androidx.media3.session.IMediaSession";

    public static class Default implements androidx.media3.session.IMediaSession {
        @Override // androidx.media3.session.IMediaSession
        public void addMediaItem(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void addMediaItemWithIndex(androidx.media3.session.IMediaController iMediaController, int i, int i2, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void addMediaItems(androidx.media3.session.IMediaController iMediaController, int i, android.os.IBinder iBinder) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void addMediaItemsWithIndex(androidx.media3.session.IMediaController iMediaController, int i, int i2, android.os.IBinder iBinder) throws android.os.RemoteException {
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // androidx.media3.session.IMediaSession
        public void clearMediaItems(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void connect(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void decreaseDeviceVolume(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void decreaseDeviceVolumeWithFlags(androidx.media3.session.IMediaController iMediaController, int i, int i2) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void flushCommandQueue(androidx.media3.session.IMediaController iMediaController) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void getChildren(androidx.media3.session.IMediaController iMediaController, int i, java.lang.String str, int i2, int i3, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void getItem(androidx.media3.session.IMediaController iMediaController, int i, java.lang.String str) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void getLibraryRoot(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void getSearchResult(androidx.media3.session.IMediaController iMediaController, int i, java.lang.String str, int i2, int i3, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void increaseDeviceVolume(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void increaseDeviceVolumeWithFlags(androidx.media3.session.IMediaController iMediaController, int i, int i2) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void moveMediaItem(androidx.media3.session.IMediaController iMediaController, int i, int i2, int i3) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void moveMediaItems(androidx.media3.session.IMediaController iMediaController, int i, int i2, int i3, int i4) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void onControllerResult(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void onCustomCommand(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle, android.os.Bundle bundle2) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void pause(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void play(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void prepare(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void release(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void removeMediaItem(androidx.media3.session.IMediaController iMediaController, int i, int i2) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void removeMediaItems(androidx.media3.session.IMediaController iMediaController, int i, int i2, int i3) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void replaceMediaItem(androidx.media3.session.IMediaController iMediaController, int i, int i2, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void replaceMediaItems(androidx.media3.session.IMediaController iMediaController, int i, int i2, int i3, android.os.IBinder iBinder) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void search(androidx.media3.session.IMediaController iMediaController, int i, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void seekBack(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void seekForward(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void seekTo(androidx.media3.session.IMediaController iMediaController, int i, long j) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void seekToDefaultPosition(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void seekToDefaultPositionWithMediaItemIndex(androidx.media3.session.IMediaController iMediaController, int i, int i2) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void seekToNext(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void seekToNextMediaItem(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void seekToPrevious(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void seekToPreviousMediaItem(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void seekToWithMediaItemIndex(androidx.media3.session.IMediaController iMediaController, int i, int i2, long j) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void setAudioAttributes(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle, boolean z) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void setDeviceMuted(androidx.media3.session.IMediaController iMediaController, int i, boolean z) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void setDeviceMutedWithFlags(androidx.media3.session.IMediaController iMediaController, int i, boolean z, int i2) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void setDeviceVolume(androidx.media3.session.IMediaController iMediaController, int i, int i2) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void setDeviceVolumeWithFlags(androidx.media3.session.IMediaController iMediaController, int i, int i2, int i3) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void setMediaItem(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void setMediaItemWithResetPosition(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle, boolean z) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void setMediaItemWithStartPosition(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle, long j) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void setMediaItems(androidx.media3.session.IMediaController iMediaController, int i, android.os.IBinder iBinder) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void setMediaItemsWithResetPosition(androidx.media3.session.IMediaController iMediaController, int i, android.os.IBinder iBinder, boolean z) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void setMediaItemsWithStartIndex(androidx.media3.session.IMediaController iMediaController, int i, android.os.IBinder iBinder, int i2, long j) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void setPlayWhenReady(androidx.media3.session.IMediaController iMediaController, int i, boolean z) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void setPlaybackParameters(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void setPlaybackSpeed(androidx.media3.session.IMediaController iMediaController, int i, float f) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void setPlaylistMetadata(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void setRating(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void setRatingWithMediaId(androidx.media3.session.IMediaController iMediaController, int i, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void setRepeatMode(androidx.media3.session.IMediaController iMediaController, int i, int i2) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void setShuffleModeEnabled(androidx.media3.session.IMediaController iMediaController, int i, boolean z) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void setTrackSelectionParameters(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void setVideoSurface(androidx.media3.session.IMediaController iMediaController, int i, android.view.Surface surface) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void setVolume(androidx.media3.session.IMediaController iMediaController, int i, float f) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void stop(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void subscribe(androidx.media3.session.IMediaController iMediaController, int i, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaSession
        public void unsubscribe(androidx.media3.session.IMediaController iMediaController, int i, java.lang.String str) throws android.os.RemoteException {
        }
    }

    void addMediaItem(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException;

    void addMediaItemWithIndex(androidx.media3.session.IMediaController iMediaController, int i, int i2, android.os.Bundle bundle) throws android.os.RemoteException;

    void addMediaItems(androidx.media3.session.IMediaController iMediaController, int i, android.os.IBinder iBinder) throws android.os.RemoteException;

    void addMediaItemsWithIndex(androidx.media3.session.IMediaController iMediaController, int i, int i2, android.os.IBinder iBinder) throws android.os.RemoteException;

    void clearMediaItems(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException;

    void connect(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException;

    void decreaseDeviceVolume(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException;

    void decreaseDeviceVolumeWithFlags(androidx.media3.session.IMediaController iMediaController, int i, int i2) throws android.os.RemoteException;

    void flushCommandQueue(androidx.media3.session.IMediaController iMediaController) throws android.os.RemoteException;

    void getChildren(androidx.media3.session.IMediaController iMediaController, int i, java.lang.String str, int i2, int i3, android.os.Bundle bundle) throws android.os.RemoteException;

    void getItem(androidx.media3.session.IMediaController iMediaController, int i, java.lang.String str) throws android.os.RemoteException;

    void getLibraryRoot(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException;

    void getSearchResult(androidx.media3.session.IMediaController iMediaController, int i, java.lang.String str, int i2, int i3, android.os.Bundle bundle) throws android.os.RemoteException;

    void increaseDeviceVolume(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException;

    void increaseDeviceVolumeWithFlags(androidx.media3.session.IMediaController iMediaController, int i, int i2) throws android.os.RemoteException;

    void moveMediaItem(androidx.media3.session.IMediaController iMediaController, int i, int i2, int i3) throws android.os.RemoteException;

    void moveMediaItems(androidx.media3.session.IMediaController iMediaController, int i, int i2, int i3, int i4) throws android.os.RemoteException;

    void onControllerResult(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException;

    void onCustomCommand(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle, android.os.Bundle bundle2) throws android.os.RemoteException;

    void pause(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException;

    void play(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException;

    void prepare(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException;

    void release(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException;

    void removeMediaItem(androidx.media3.session.IMediaController iMediaController, int i, int i2) throws android.os.RemoteException;

    void removeMediaItems(androidx.media3.session.IMediaController iMediaController, int i, int i2, int i3) throws android.os.RemoteException;

    void replaceMediaItem(androidx.media3.session.IMediaController iMediaController, int i, int i2, android.os.Bundle bundle) throws android.os.RemoteException;

    void replaceMediaItems(androidx.media3.session.IMediaController iMediaController, int i, int i2, int i3, android.os.IBinder iBinder) throws android.os.RemoteException;

    void search(androidx.media3.session.IMediaController iMediaController, int i, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    void seekBack(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException;

    void seekForward(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException;

    void seekTo(androidx.media3.session.IMediaController iMediaController, int i, long j) throws android.os.RemoteException;

    void seekToDefaultPosition(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException;

    void seekToDefaultPositionWithMediaItemIndex(androidx.media3.session.IMediaController iMediaController, int i, int i2) throws android.os.RemoteException;

    void seekToNext(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException;

    void seekToNextMediaItem(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException;

    void seekToPrevious(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException;

    void seekToPreviousMediaItem(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException;

    void seekToWithMediaItemIndex(androidx.media3.session.IMediaController iMediaController, int i, int i2, long j) throws android.os.RemoteException;

    void setAudioAttributes(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle, boolean z) throws android.os.RemoteException;

    void setDeviceMuted(androidx.media3.session.IMediaController iMediaController, int i, boolean z) throws android.os.RemoteException;

    void setDeviceMutedWithFlags(androidx.media3.session.IMediaController iMediaController, int i, boolean z, int i2) throws android.os.RemoteException;

    void setDeviceVolume(androidx.media3.session.IMediaController iMediaController, int i, int i2) throws android.os.RemoteException;

    void setDeviceVolumeWithFlags(androidx.media3.session.IMediaController iMediaController, int i, int i2, int i3) throws android.os.RemoteException;

    void setMediaItem(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException;

    void setMediaItemWithResetPosition(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle, boolean z) throws android.os.RemoteException;

    void setMediaItemWithStartPosition(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle, long j) throws android.os.RemoteException;

    void setMediaItems(androidx.media3.session.IMediaController iMediaController, int i, android.os.IBinder iBinder) throws android.os.RemoteException;

    void setMediaItemsWithResetPosition(androidx.media3.session.IMediaController iMediaController, int i, android.os.IBinder iBinder, boolean z) throws android.os.RemoteException;

    void setMediaItemsWithStartIndex(androidx.media3.session.IMediaController iMediaController, int i, android.os.IBinder iBinder, int i2, long j) throws android.os.RemoteException;

    void setPlayWhenReady(androidx.media3.session.IMediaController iMediaController, int i, boolean z) throws android.os.RemoteException;

    void setPlaybackParameters(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException;

    void setPlaybackSpeed(androidx.media3.session.IMediaController iMediaController, int i, float f) throws android.os.RemoteException;

    void setPlaylistMetadata(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException;

    void setRating(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException;

    void setRatingWithMediaId(androidx.media3.session.IMediaController iMediaController, int i, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    void setRepeatMode(androidx.media3.session.IMediaController iMediaController, int i, int i2) throws android.os.RemoteException;

    void setShuffleModeEnabled(androidx.media3.session.IMediaController iMediaController, int i, boolean z) throws android.os.RemoteException;

    void setTrackSelectionParameters(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException;

    void setVideoSurface(androidx.media3.session.IMediaController iMediaController, int i, android.view.Surface surface) throws android.os.RemoteException;

    void setVolume(androidx.media3.session.IMediaController iMediaController, int i, float f) throws android.os.RemoteException;

    void stop(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException;

    void subscribe(androidx.media3.session.IMediaController iMediaController, int i, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    void unsubscribe(androidx.media3.session.IMediaController iMediaController, int i, java.lang.String str) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements androidx.media3.session.IMediaSession {
        static final int TRANSACTION_addMediaItem = 3029;
        static final int TRANSACTION_addMediaItemWithIndex = 3030;
        static final int TRANSACTION_addMediaItems = 3031;
        static final int TRANSACTION_addMediaItemsWithIndex = 3032;
        static final int TRANSACTION_clearMediaItems = 3021;
        static final int TRANSACTION_connect = 3015;
        static final int TRANSACTION_decreaseDeviceVolume = 3005;
        static final int TRANSACTION_decreaseDeviceVolumeWithFlags = 3053;
        static final int TRANSACTION_flushCommandQueue = 3045;
        static final int TRANSACTION_getChildren = 4003;
        static final int TRANSACTION_getItem = 4002;
        static final int TRANSACTION_getLibraryRoot = 4001;
        static final int TRANSACTION_getSearchResult = 4005;
        static final int TRANSACTION_increaseDeviceVolume = 3004;
        static final int TRANSACTION_increaseDeviceVolumeWithFlags = 3052;
        static final int TRANSACTION_moveMediaItem = 3022;
        static final int TRANSACTION_moveMediaItems = 3023;
        static final int TRANSACTION_onControllerResult = 3014;
        static final int TRANSACTION_onCustomCommand = 3016;
        static final int TRANSACTION_pause = 3025;
        static final int TRANSACTION_play = 3024;
        static final int TRANSACTION_prepare = 3026;
        static final int TRANSACTION_release = 3035;
        static final int TRANSACTION_removeMediaItem = 3019;
        static final int TRANSACTION_removeMediaItems = 3020;
        static final int TRANSACTION_replaceMediaItem = 3055;
        static final int TRANSACTION_replaceMediaItems = 3056;
        static final int TRANSACTION_search = 4004;
        static final int TRANSACTION_seekBack = 3040;
        static final int TRANSACTION_seekForward = 3041;
        static final int TRANSACTION_seekTo = 3038;
        static final int TRANSACTION_seekToDefaultPosition = 3036;
        static final int TRANSACTION_seekToDefaultPositionWithMediaItemIndex = 3037;
        static final int TRANSACTION_seekToNext = 3047;
        static final int TRANSACTION_seekToNextMediaItem = 3043;
        static final int TRANSACTION_seekToPrevious = 3046;
        static final int TRANSACTION_seekToPreviousMediaItem = 3042;
        static final int TRANSACTION_seekToWithMediaItemIndex = 3039;
        static final int TRANSACTION_setAudioAttributes = 3057;
        static final int TRANSACTION_setDeviceMuted = 3006;
        static final int TRANSACTION_setDeviceMutedWithFlags = 3054;
        static final int TRANSACTION_setDeviceVolume = 3003;
        static final int TRANSACTION_setDeviceVolumeWithFlags = 3051;
        static final int TRANSACTION_setMediaItem = 3007;
        static final int TRANSACTION_setMediaItemWithResetPosition = 3009;
        static final int TRANSACTION_setMediaItemWithStartPosition = 3008;
        static final int TRANSACTION_setMediaItems = 3010;
        static final int TRANSACTION_setMediaItemsWithResetPosition = 3011;
        static final int TRANSACTION_setMediaItemsWithStartIndex = 3012;
        static final int TRANSACTION_setPlayWhenReady = 3013;
        static final int TRANSACTION_setPlaybackParameters = 3027;
        static final int TRANSACTION_setPlaybackSpeed = 3028;
        static final int TRANSACTION_setPlaylistMetadata = 3033;
        static final int TRANSACTION_setRating = 3050;
        static final int TRANSACTION_setRatingWithMediaId = 3049;
        static final int TRANSACTION_setRepeatMode = 3017;
        static final int TRANSACTION_setShuffleModeEnabled = 3018;
        static final int TRANSACTION_setTrackSelectionParameters = 3048;
        static final int TRANSACTION_setVideoSurface = 3044;
        static final int TRANSACTION_setVolume = 3002;
        static final int TRANSACTION_stop = 3034;
        static final int TRANSACTION_subscribe = 4006;
        static final int TRANSACTION_unsubscribe = 4007;

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, androidx.media3.session.IMediaSession.DESCRIPTOR);
        }

        public static androidx.media3.session.IMediaSession asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(androidx.media3.session.IMediaSession.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof androidx.media3.session.IMediaSession)) {
                return (androidx.media3.session.IMediaSession) iInterfaceQueryLocalInterface;
            }
            return new androidx.media3.session.IMediaSession.Stub.Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(androidx.media3.session.IMediaSession.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(androidx.media3.session.IMediaSession.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 3002:
                    setVolume(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                    return true;
                case 3003:
                    setDeviceVolume(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3004:
                    increaseDeviceVolume(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3005:
                    decreaseDeviceVolume(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3006:
                    setDeviceMuted(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case 3007:
                    setMediaItem(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    return true;
                case 3008:
                    setMediaItemWithStartPosition(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR), parcel.readLong());
                    return true;
                case 3009:
                    setMediaItemWithResetPosition(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR), parcel.readInt() != 0);
                    return true;
                case TRANSACTION_setMediaItems /* 3010 */:
                    setMediaItems(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case 3011:
                    setMediaItemsWithResetPosition(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                    return true;
                case 3012:
                    setMediaItemsWithStartIndex(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                    return true;
                case TRANSACTION_setPlayWhenReady /* 3013 */:
                    setPlayWhenReady(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case TRANSACTION_onControllerResult /* 3014 */:
                    onControllerResult(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    return true;
                case 3015:
                    connect(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    return true;
                case TRANSACTION_onCustomCommand /* 3016 */:
                    onCustomCommand(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR), (android.os.Bundle) androidx.media3.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    return true;
                case 3017:
                    setRepeatMode(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case TRANSACTION_setShuffleModeEnabled /* 3018 */:
                    setShuffleModeEnabled(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case TRANSACTION_removeMediaItem /* 3019 */:
                    removeMediaItem(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3020:
                    removeMediaItems(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 3021:
                    clearMediaItems(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3022:
                    moveMediaItem(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 3023:
                    moveMediaItems(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case TRANSACTION_play /* 3024 */:
                    play(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_pause /* 3025 */:
                    pause(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_prepare /* 3026 */:
                    prepare(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_setPlaybackParameters /* 3027 */:
                    setPlaybackParameters(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    return true;
                case TRANSACTION_setPlaybackSpeed /* 3028 */:
                    setPlaybackSpeed(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                    return true;
                case TRANSACTION_addMediaItem /* 3029 */:
                    addMediaItem(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    return true;
                case TRANSACTION_addMediaItemWithIndex /* 3030 */:
                    addMediaItemWithIndex(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    return true;
                case TRANSACTION_addMediaItems /* 3031 */:
                    addMediaItems(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case TRANSACTION_addMediaItemsWithIndex /* 3032 */:
                    addMediaItemsWithIndex(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case TRANSACTION_setPlaylistMetadata /* 3033 */:
                    setPlaylistMetadata(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    return true;
                case TRANSACTION_stop /* 3034 */:
                    stop(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_release /* 3035 */:
                    release(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_seekToDefaultPosition /* 3036 */:
                    seekToDefaultPosition(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_seekToDefaultPositionWithMediaItemIndex /* 3037 */:
                    seekToDefaultPositionWithMediaItemIndex(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case TRANSACTION_seekTo /* 3038 */:
                    seekTo(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readLong());
                    return true;
                case TRANSACTION_seekToWithMediaItemIndex /* 3039 */:
                    seekToWithMediaItemIndex(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readLong());
                    return true;
                case TRANSACTION_seekBack /* 3040 */:
                    seekBack(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_seekForward /* 3041 */:
                    seekForward(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_seekToPreviousMediaItem /* 3042 */:
                    seekToPreviousMediaItem(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_seekToNextMediaItem /* 3043 */:
                    seekToNextMediaItem(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_setVideoSurface /* 3044 */:
                    setVideoSurface(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (android.view.Surface) androidx.media3.session.IMediaSession._Parcel.readTypedObject(parcel, android.view.Surface.CREATOR));
                    return true;
                case TRANSACTION_flushCommandQueue /* 3045 */:
                    flushCommandQueue(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case TRANSACTION_seekToPrevious /* 3046 */:
                    seekToPrevious(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_seekToNext /* 3047 */:
                    seekToNext(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_setTrackSelectionParameters /* 3048 */:
                    setTrackSelectionParameters(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    return true;
                case TRANSACTION_setRatingWithMediaId /* 3049 */:
                    setRatingWithMediaId(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), (android.os.Bundle) androidx.media3.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    return true;
                case TRANSACTION_setRating /* 3050 */:
                    setRating(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    return true;
                case TRANSACTION_setDeviceVolumeWithFlags /* 3051 */:
                    setDeviceVolumeWithFlags(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case TRANSACTION_increaseDeviceVolumeWithFlags /* 3052 */:
                    increaseDeviceVolumeWithFlags(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case TRANSACTION_decreaseDeviceVolumeWithFlags /* 3053 */:
                    decreaseDeviceVolumeWithFlags(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case TRANSACTION_setDeviceMutedWithFlags /* 3054 */:
                    setDeviceMutedWithFlags(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt());
                    return true;
                case TRANSACTION_replaceMediaItem /* 3055 */:
                    replaceMediaItem(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    return true;
                case TRANSACTION_replaceMediaItems /* 3056 */:
                    replaceMediaItems(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case TRANSACTION_setAudioAttributes /* 3057 */:
                    setAudioAttributes(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR), parcel.readInt() != 0);
                    return true;
                default:
                    switch (i) {
                        case 4001:
                            getLibraryRoot(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                            return true;
                        case 4002:
                            getItem(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                            return true;
                        case 4003:
                            getChildren(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                            return true;
                        case 4004:
                            search(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), (android.os.Bundle) androidx.media3.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                            return true;
                        case 4005:
                            getSearchResult(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                            return true;
                        case 4006:
                            subscribe(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), (android.os.Bundle) androidx.media3.session.IMediaSession._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                            return true;
                        case 4007:
                            unsubscribe(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                            return true;
                        default:
                            return super.onTransact(i, parcel, parcel2, i2);
                    }
            }
        }

        private static class Proxy implements androidx.media3.session.IMediaSession {
            private android.os.IBinder mRemote;

            public java.lang.String getInterfaceDescriptor() {
                return androidx.media3.session.IMediaSession.DESCRIPTOR;
            }

            Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // androidx.media3.session.IMediaSession
            public void setVolume(androidx.media3.session.IMediaController iMediaController, int i, float f) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeFloat(f);
                    this.mRemote.transact(3002, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void setDeviceVolume(androidx.media3.session.IMediaController iMediaController, int i, int i2) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.mRemote.transact(3003, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void setDeviceVolumeWithFlags(androidx.media3.session.IMediaController iMediaController, int i, int i2, int i3) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_setDeviceVolumeWithFlags, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void increaseDeviceVolume(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(3004, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void increaseDeviceVolumeWithFlags(androidx.media3.session.IMediaController iMediaController, int i, int i2) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_increaseDeviceVolumeWithFlags, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void decreaseDeviceVolume(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(3005, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void decreaseDeviceVolumeWithFlags(androidx.media3.session.IMediaController iMediaController, int i, int i2) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_decreaseDeviceVolumeWithFlags, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void setDeviceMuted(androidx.media3.session.IMediaController iMediaController, int i, boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(3006, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void setDeviceMutedWithFlags(androidx.media3.session.IMediaController iMediaController, int i, boolean z, int i2) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i2);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_setDeviceMutedWithFlags, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void setAudioAttributes(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle, boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_setAudioAttributes, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void setMediaItem(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(3007, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void setMediaItemWithStartPosition(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle, long j) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(3008, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void setMediaItemWithResetPosition(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle, boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(3009, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void setMediaItems(androidx.media3.session.IMediaController iMediaController, int i, android.os.IBinder iBinder) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_setMediaItems, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void setMediaItemsWithResetPosition(androidx.media3.session.IMediaController iMediaController, int i, android.os.IBinder iBinder, boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(3011, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void setMediaItemsWithStartIndex(androidx.media3.session.IMediaController iMediaController, int i, android.os.IBinder iBinder, int i2, long j) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(3012, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void setPlayWhenReady(androidx.media3.session.IMediaController iMediaController, int i, boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_setPlayWhenReady, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void onControllerResult(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_onControllerResult, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void connect(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(3015, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void onCustomCommand(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle, android.os.Bundle bundle2) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    androidx.media3.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle2, 0);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_onCustomCommand, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void setRepeatMode(androidx.media3.session.IMediaController iMediaController, int i, int i2) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.mRemote.transact(3017, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void setShuffleModeEnabled(androidx.media3.session.IMediaController iMediaController, int i, boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_setShuffleModeEnabled, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void removeMediaItem(androidx.media3.session.IMediaController iMediaController, int i, int i2) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_removeMediaItem, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void removeMediaItems(androidx.media3.session.IMediaController iMediaController, int i, int i2, int i3) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    this.mRemote.transact(3020, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void clearMediaItems(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(3021, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void moveMediaItem(androidx.media3.session.IMediaController iMediaController, int i, int i2, int i3) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    this.mRemote.transact(3022, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void moveMediaItems(androidx.media3.session.IMediaController iMediaController, int i, int i2, int i3, int i4) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i4);
                    this.mRemote.transact(3023, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void replaceMediaItem(androidx.media3.session.IMediaController iMediaController, int i, int i2, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    androidx.media3.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_replaceMediaItem, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void replaceMediaItems(androidx.media3.session.IMediaController iMediaController, int i, int i2, int i3, android.os.IBinder iBinder) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_replaceMediaItems, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void play(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_play, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void pause(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_pause, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void prepare(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_prepare, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void setPlaybackParameters(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_setPlaybackParameters, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void setPlaybackSpeed(androidx.media3.session.IMediaController iMediaController, int i, float f) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeFloat(f);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_setPlaybackSpeed, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void addMediaItem(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_addMediaItem, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void addMediaItemWithIndex(androidx.media3.session.IMediaController iMediaController, int i, int i2, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    androidx.media3.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_addMediaItemWithIndex, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void addMediaItems(androidx.media3.session.IMediaController iMediaController, int i, android.os.IBinder iBinder) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_addMediaItems, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void addMediaItemsWithIndex(androidx.media3.session.IMediaController iMediaController, int i, int i2, android.os.IBinder iBinder) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_addMediaItemsWithIndex, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void setPlaylistMetadata(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_setPlaylistMetadata, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void stop(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_stop, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void release(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_release, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void seekToDefaultPosition(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_seekToDefaultPosition, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void seekToDefaultPositionWithMediaItemIndex(androidx.media3.session.IMediaController iMediaController, int i, int i2) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_seekToDefaultPositionWithMediaItemIndex, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void seekTo(androidx.media3.session.IMediaController iMediaController, int i, long j) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_seekTo, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void seekToWithMediaItemIndex(androidx.media3.session.IMediaController iMediaController, int i, int i2, long j) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_seekToWithMediaItemIndex, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void seekBack(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_seekBack, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void seekForward(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_seekForward, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void seekToPreviousMediaItem(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_seekToPreviousMediaItem, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void seekToNextMediaItem(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_seekToNextMediaItem, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void setVideoSurface(androidx.media3.session.IMediaController iMediaController, int i, android.view.Surface surface) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, surface, 0);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_setVideoSurface, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void flushCommandQueue(androidx.media3.session.IMediaController iMediaController) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_flushCommandQueue, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void seekToPrevious(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_seekToPrevious, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void seekToNext(androidx.media3.session.IMediaController iMediaController, int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_seekToNext, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void setTrackSelectionParameters(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_setTrackSelectionParameters, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void setRatingWithMediaId(androidx.media3.session.IMediaController iMediaController, int i, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    androidx.media3.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_setRatingWithMediaId, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void setRating(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(androidx.media3.session.IMediaSession.Stub.TRANSACTION_setRating, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void getLibraryRoot(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(4001, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void getItem(androidx.media3.session.IMediaController iMediaController, int i, java.lang.String str) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(4002, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void getChildren(androidx.media3.session.IMediaController iMediaController, int i, java.lang.String str, int i2, int i3, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    androidx.media3.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(4003, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void search(androidx.media3.session.IMediaController iMediaController, int i, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    androidx.media3.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(4004, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void getSearchResult(androidx.media3.session.IMediaController iMediaController, int i, java.lang.String str, int i2, int i3, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    androidx.media3.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(4005, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void subscribe(androidx.media3.session.IMediaController iMediaController, int i, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    androidx.media3.session.IMediaSession._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(4006, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaSession
            public void unsubscribe(androidx.media3.session.IMediaController iMediaController, int i, java.lang.String str) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(4007, parcelObtain, null, 1);
                } finally {
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
    }
}
