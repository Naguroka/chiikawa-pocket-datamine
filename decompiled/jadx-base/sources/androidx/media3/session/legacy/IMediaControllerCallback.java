package androidx.media3.session.legacy;

/* JADX INFO: loaded from: classes.dex */
public interface IMediaControllerCallback extends android.os.IInterface {
    void onCaptioningEnabledChanged(boolean z) throws android.os.RemoteException;

    void onEvent(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    void onExtrasChanged(android.os.Bundle bundle) throws android.os.RemoteException;

    void onMetadataChanged(androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat) throws android.os.RemoteException;

    void onPlaybackStateChanged(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat) throws android.os.RemoteException;

    void onQueueChanged(java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> list) throws android.os.RemoteException;

    void onQueueTitleChanged(java.lang.CharSequence charSequence) throws android.os.RemoteException;

    void onRepeatModeChanged(int i) throws android.os.RemoteException;

    void onSessionDestroyed() throws android.os.RemoteException;

    void onSessionReady() throws android.os.RemoteException;

    void onShuffleModeChanged(int i) throws android.os.RemoteException;

    void onShuffleModeChangedRemoved(boolean z) throws android.os.RemoteException;

    void onVolumeInfoChanged(androidx.media3.session.legacy.ParcelableVolumeInfo parcelableVolumeInfo) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements androidx.media3.session.legacy.IMediaControllerCallback {
        private static final java.lang.String DESCRIPTOR = "android.support.v4.media.session.IMediaControllerCallback";
        static final int TRANSACTION_onCaptioningEnabledChanged = 11;
        static final int TRANSACTION_onEvent = 1;
        static final int TRANSACTION_onExtrasChanged = 7;
        static final int TRANSACTION_onMetadataChanged = 4;
        static final int TRANSACTION_onPlaybackStateChanged = 3;
        static final int TRANSACTION_onQueueChanged = 5;
        static final int TRANSACTION_onQueueTitleChanged = 6;
        static final int TRANSACTION_onRepeatModeChanged = 9;
        static final int TRANSACTION_onSessionDestroyed = 2;
        static final int TRANSACTION_onSessionReady = 13;
        static final int TRANSACTION_onShuffleModeChanged = 12;
        static final int TRANSACTION_onShuffleModeChangedRemoved = 10;
        static final int TRANSACTION_onVolumeInfoChanged = 8;

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        public static androidx.media3.session.legacy.IMediaControllerCallback asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof androidx.media3.session.legacy.IMediaControllerCallback)) {
                return (androidx.media3.session.legacy.IMediaControllerCallback) iInterfaceQueryLocalInterface;
            }
            return new androidx.media3.session.legacy.IMediaControllerCallback.Stub.Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i == 1598968902) {
                ((android.os.Parcel) androidx.media3.common.util.Assertions.checkNotNull(parcel2)).writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    onEvent(parcel.readString(), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    onSessionDestroyed();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    onPlaybackStateChanged(parcel.readInt() != 0 ? androidx.media3.session.legacy.PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    onMetadataChanged(parcel.readInt() != 0 ? androidx.media3.session.legacy.MediaMetadataCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    onQueueChanged(parcel.createTypedArrayList(androidx.media3.session.legacy.MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    onQueueTitleChanged(parcel.readInt() != 0 ? (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    onExtrasChanged(parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    onVolumeInfoChanged(parcel.readInt() != 0 ? androidx.media3.session.legacy.ParcelableVolumeInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    onRepeatModeChanged(parcel.readInt());
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    onShuffleModeChangedRemoved(parcel.readInt() != 0);
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    onCaptioningEnabledChanged(parcel.readInt() != 0);
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    onShuffleModeChanged(parcel.readInt());
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    onSessionReady();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        private static class Proxy implements androidx.media3.session.legacy.IMediaControllerCallback {
            public static androidx.media3.session.legacy.IMediaControllerCallback sDefaultImpl;
            private android.os.IBinder mRemote;

            public java.lang.String getInterfaceDescriptor() {
                return "android.support.v4.media.session.IMediaControllerCallback";
            }

            Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onEvent(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, parcelObtain, null, 1) || androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    ((androidx.media3.session.legacy.IMediaControllerCallback) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl())).onEvent(str, bundle);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onSessionDestroyed() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (this.mRemote.transact(2, parcelObtain, null, 1) || androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    ((androidx.media3.session.legacy.IMediaControllerCallback) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl())).onSessionDestroyed();
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onPlaybackStateChanged(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        parcelObtain.writeInt(1);
                        playbackStateCompat.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(3, parcelObtain, null, 1) || androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    ((androidx.media3.session.legacy.IMediaControllerCallback) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl())).onPlaybackStateChanged(playbackStateCompat);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onMetadataChanged(androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (mediaMetadataCompat != null) {
                        parcelObtain.writeInt(1);
                        mediaMetadataCompat.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(4, parcelObtain, null, 1) || androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    ((androidx.media3.session.legacy.IMediaControllerCallback) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl())).onMetadataChanged(mediaMetadataCompat);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onQueueChanged(java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> list) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcelObtain.writeTypedList(list);
                    if (this.mRemote.transact(5, parcelObtain, null, 1) || androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    ((androidx.media3.session.legacy.IMediaControllerCallback) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl())).onQueueChanged(list);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onQueueTitleChanged(java.lang.CharSequence charSequence) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (charSequence != null) {
                        parcelObtain.writeInt(1);
                        android.text.TextUtils.writeToParcel(charSequence, parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(6, parcelObtain, null, 1) || androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    ((androidx.media3.session.legacy.IMediaControllerCallback) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl())).onQueueTitleChanged(charSequence);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onExtrasChanged(android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(7, parcelObtain, null, 1) || androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    ((androidx.media3.session.legacy.IMediaControllerCallback) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl())).onExtrasChanged(bundle);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onVolumeInfoChanged(androidx.media3.session.legacy.ParcelableVolumeInfo parcelableVolumeInfo) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcelableVolumeInfo != null) {
                        parcelObtain.writeInt(1);
                        parcelableVolumeInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(8, parcelObtain, null, 1) || androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    ((androidx.media3.session.legacy.IMediaControllerCallback) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl())).onVolumeInfoChanged(parcelableVolumeInfo);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onRepeatModeChanged(int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(9, parcelObtain, null, 1) || androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    ((androidx.media3.session.legacy.IMediaControllerCallback) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl())).onRepeatModeChanged(i);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onShuffleModeChangedRemoved(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (this.mRemote.transact(10, parcelObtain, null, 1) || androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    ((androidx.media3.session.legacy.IMediaControllerCallback) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl())).onShuffleModeChangedRemoved(z);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onCaptioningEnabledChanged(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (this.mRemote.transact(11, parcelObtain, null, 1) || androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    ((androidx.media3.session.legacy.IMediaControllerCallback) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl())).onCaptioningEnabledChanged(z);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onShuffleModeChanged(int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(12, parcelObtain, null, 1) || androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    ((androidx.media3.session.legacy.IMediaControllerCallback) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl())).onShuffleModeChanged(i);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onSessionReady() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (this.mRemote.transact(13, parcelObtain, null, 1) || androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    ((androidx.media3.session.legacy.IMediaControllerCallback) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl())).onSessionReady();
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(androidx.media3.session.legacy.IMediaControllerCallback iMediaControllerCallback) {
            if (androidx.media3.session.legacy.IMediaControllerCallback.Stub.Proxy.sDefaultImpl != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (iMediaControllerCallback == null) {
                return false;
            }
            androidx.media3.session.legacy.IMediaControllerCallback.Stub.Proxy.sDefaultImpl = iMediaControllerCallback;
            return true;
        }

        public static androidx.media3.session.legacy.IMediaControllerCallback getDefaultImpl() {
            return androidx.media3.session.legacy.IMediaControllerCallback.Stub.Proxy.sDefaultImpl;
        }
    }
}
