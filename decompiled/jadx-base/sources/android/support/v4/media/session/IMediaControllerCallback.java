package android.support.v4.media.session;

/* JADX INFO: loaded from: classes.dex */
public interface IMediaControllerCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.support.v4.media.session.IMediaControllerCallback";

    public static class Default implements android.support.v4.media.session.IMediaControllerCallback {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onCaptioningEnabledChanged(boolean z) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onEvent(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onExtrasChanged(android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onMetadataChanged(android.support.v4.media.MediaMetadataCompat mediaMetadataCompat) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onPlaybackStateChanged(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onQueueChanged(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> list) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onQueueTitleChanged(java.lang.CharSequence charSequence) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onRepeatModeChanged(int i) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onSessionDestroyed() throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onSessionReady() throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onShuffleModeChanged(int i) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onShuffleModeChangedRemoved(boolean z) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onVolumeInfoChanged(android.support.v4.media.session.ParcelableVolumeInfo parcelableVolumeInfo) throws android.os.RemoteException {
        }
    }

    void onCaptioningEnabledChanged(boolean z) throws android.os.RemoteException;

    void onEvent(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    void onExtrasChanged(android.os.Bundle bundle) throws android.os.RemoteException;

    void onMetadataChanged(android.support.v4.media.MediaMetadataCompat mediaMetadataCompat) throws android.os.RemoteException;

    void onPlaybackStateChanged(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat) throws android.os.RemoteException;

    void onQueueChanged(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> list) throws android.os.RemoteException;

    void onQueueTitleChanged(java.lang.CharSequence charSequence) throws android.os.RemoteException;

    void onRepeatModeChanged(int i) throws android.os.RemoteException;

    void onSessionDestroyed() throws android.os.RemoteException;

    void onSessionReady() throws android.os.RemoteException;

    void onShuffleModeChanged(int i) throws android.os.RemoteException;

    void onShuffleModeChangedRemoved(boolean z) throws android.os.RemoteException;

    void onVolumeInfoChanged(android.support.v4.media.session.ParcelableVolumeInfo parcelableVolumeInfo) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.support.v4.media.session.IMediaControllerCallback {
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
            attachInterface(this, android.support.v4.media.session.IMediaControllerCallback.DESCRIPTOR);
        }

        public static android.support.v4.media.session.IMediaControllerCallback asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(android.support.v4.media.session.IMediaControllerCallback.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof android.support.v4.media.session.IMediaControllerCallback)) {
                return (android.support.v4.media.session.IMediaControllerCallback) iInterfaceQueryLocalInterface;
            }
            return new android.support.v4.media.session.IMediaControllerCallback.Stub.Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(android.support.v4.media.session.IMediaControllerCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(android.support.v4.media.session.IMediaControllerCallback.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    onEvent(parcel.readString(), (android.os.Bundle) android.support.v4.media.session.IMediaControllerCallback._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    return true;
                case 2:
                    onSessionDestroyed();
                    return true;
                case 3:
                    onPlaybackStateChanged((android.support.v4.media.session.PlaybackStateCompat) android.support.v4.media.session.IMediaControllerCallback._Parcel.readTypedObject(parcel, android.support.v4.media.session.PlaybackStateCompat.CREATOR));
                    return true;
                case 4:
                    onMetadataChanged((android.support.v4.media.MediaMetadataCompat) android.support.v4.media.session.IMediaControllerCallback._Parcel.readTypedObject(parcel, android.support.v4.media.MediaMetadataCompat.CREATOR));
                    return true;
                case 5:
                    onQueueChanged(parcel.createTypedArrayList(android.support.v4.media.session.MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                case 6:
                    onQueueTitleChanged((java.lang.CharSequence) android.support.v4.media.session.IMediaControllerCallback._Parcel.readTypedObject(parcel, android.text.TextUtils.CHAR_SEQUENCE_CREATOR));
                    return true;
                case 7:
                    onExtrasChanged((android.os.Bundle) android.support.v4.media.session.IMediaControllerCallback._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    return true;
                case 8:
                    onVolumeInfoChanged((android.support.v4.media.session.ParcelableVolumeInfo) android.support.v4.media.session.IMediaControllerCallback._Parcel.readTypedObject(parcel, android.support.v4.media.session.ParcelableVolumeInfo.CREATOR));
                    return true;
                case 9:
                    onRepeatModeChanged(parcel.readInt());
                    return true;
                case 10:
                    onShuffleModeChangedRemoved(parcel.readInt() != 0);
                    return true;
                case 11:
                    onCaptioningEnabledChanged(parcel.readInt() != 0);
                    return true;
                case 12:
                    onShuffleModeChanged(parcel.readInt());
                    return true;
                case 13:
                    onSessionReady();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        private static class Proxy implements android.support.v4.media.session.IMediaControllerCallback {
            private android.os.IBinder mRemote;

            public java.lang.String getInterfaceDescriptor() {
                return android.support.v4.media.session.IMediaControllerCallback.DESCRIPTOR;
            }

            Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onEvent(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaControllerCallback.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    android.support.v4.media.session.IMediaControllerCallback._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onSessionDestroyed() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaControllerCallback.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onPlaybackStateChanged(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaControllerCallback.DESCRIPTOR);
                    android.support.v4.media.session.IMediaControllerCallback._Parcel.writeTypedObject(parcelObtain, playbackStateCompat, 0);
                    this.mRemote.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onMetadataChanged(android.support.v4.media.MediaMetadataCompat mediaMetadataCompat) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaControllerCallback.DESCRIPTOR);
                    android.support.v4.media.session.IMediaControllerCallback._Parcel.writeTypedObject(parcelObtain, mediaMetadataCompat, 0);
                    this.mRemote.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onQueueChanged(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> list) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaControllerCallback.DESCRIPTOR);
                    android.support.v4.media.session.IMediaControllerCallback._Parcel.writeTypedList(parcelObtain, list, 0);
                    this.mRemote.transact(5, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onQueueTitleChanged(java.lang.CharSequence charSequence) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaControllerCallback.DESCRIPTOR);
                    if (charSequence != null) {
                        parcelObtain.writeInt(1);
                        android.text.TextUtils.writeToParcel(charSequence, parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onExtrasChanged(android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaControllerCallback.DESCRIPTOR);
                    android.support.v4.media.session.IMediaControllerCallback._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(7, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onVolumeInfoChanged(android.support.v4.media.session.ParcelableVolumeInfo parcelableVolumeInfo) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaControllerCallback.DESCRIPTOR);
                    android.support.v4.media.session.IMediaControllerCallback._Parcel.writeTypedObject(parcelObtain, parcelableVolumeInfo, 0);
                    this.mRemote.transact(8, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onRepeatModeChanged(int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaControllerCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(9, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onShuffleModeChangedRemoved(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaControllerCallback.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(10, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onCaptioningEnabledChanged(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaControllerCallback.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(11, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onShuffleModeChanged(int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaControllerCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(12, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onSessionReady() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.media.session.IMediaControllerCallback.DESCRIPTOR);
                    this.mRemote.transact(13, parcelObtain, null, 1);
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
