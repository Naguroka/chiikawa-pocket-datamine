package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public interface IMediaController extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "androidx.media3.session.IMediaController";

    public static class Default implements androidx.media3.session.IMediaController {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // androidx.media3.session.IMediaController
        public void onAvailableCommandsChangedFromPlayer(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaController
        public void onAvailableCommandsChangedFromSession(int i, android.os.Bundle bundle, android.os.Bundle bundle2) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaController
        public void onChildrenChanged(int i, java.lang.String str, int i2, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaController
        public void onConnected(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaController
        public void onCustomCommand(int i, android.os.Bundle bundle, android.os.Bundle bundle2) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaController
        public void onDisconnected(int i) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaController
        public void onError(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaController
        public void onExtrasChanged(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaController
        public void onLibraryResult(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaController
        public void onPeriodicSessionPositionInfoChanged(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaController
        public void onPlayerInfoChanged(int i, android.os.Bundle bundle, boolean z) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaController
        public void onPlayerInfoChangedWithExclusions(int i, android.os.Bundle bundle, android.os.Bundle bundle2) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaController
        public void onRenderedFirstFrame(int i) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaController
        public void onSearchResultChanged(int i, java.lang.String str, int i2, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaController
        public void onSessionActivityChanged(int i, android.app.PendingIntent pendingIntent) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaController
        public void onSessionResult(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // androidx.media3.session.IMediaController
        public void onSetCustomLayout(int i, java.util.List<android.os.Bundle> list) throws android.os.RemoteException {
        }
    }

    void onAvailableCommandsChangedFromPlayer(int i, android.os.Bundle bundle) throws android.os.RemoteException;

    void onAvailableCommandsChangedFromSession(int i, android.os.Bundle bundle, android.os.Bundle bundle2) throws android.os.RemoteException;

    void onChildrenChanged(int i, java.lang.String str, int i2, android.os.Bundle bundle) throws android.os.RemoteException;

    void onConnected(int i, android.os.Bundle bundle) throws android.os.RemoteException;

    void onCustomCommand(int i, android.os.Bundle bundle, android.os.Bundle bundle2) throws android.os.RemoteException;

    void onDisconnected(int i) throws android.os.RemoteException;

    void onError(int i, android.os.Bundle bundle) throws android.os.RemoteException;

    void onExtrasChanged(int i, android.os.Bundle bundle) throws android.os.RemoteException;

    void onLibraryResult(int i, android.os.Bundle bundle) throws android.os.RemoteException;

    void onPeriodicSessionPositionInfoChanged(int i, android.os.Bundle bundle) throws android.os.RemoteException;

    void onPlayerInfoChanged(int i, android.os.Bundle bundle, boolean z) throws android.os.RemoteException;

    void onPlayerInfoChangedWithExclusions(int i, android.os.Bundle bundle, android.os.Bundle bundle2) throws android.os.RemoteException;

    void onRenderedFirstFrame(int i) throws android.os.RemoteException;

    void onSearchResultChanged(int i, java.lang.String str, int i2, android.os.Bundle bundle) throws android.os.RemoteException;

    void onSessionActivityChanged(int i, android.app.PendingIntent pendingIntent) throws android.os.RemoteException;

    void onSessionResult(int i, android.os.Bundle bundle) throws android.os.RemoteException;

    void onSetCustomLayout(int i, java.util.List<android.os.Bundle> list) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements androidx.media3.session.IMediaController {
        static final int TRANSACTION_onAvailableCommandsChangedFromPlayer = 3009;
        static final int TRANSACTION_onAvailableCommandsChangedFromSession = 3010;
        static final int TRANSACTION_onChildrenChanged = 4001;
        static final int TRANSACTION_onConnected = 3001;
        static final int TRANSACTION_onCustomCommand = 3005;
        static final int TRANSACTION_onDisconnected = 3006;
        static final int TRANSACTION_onError = 3015;
        static final int TRANSACTION_onExtrasChanged = 3012;
        static final int TRANSACTION_onLibraryResult = 3003;
        static final int TRANSACTION_onPeriodicSessionPositionInfoChanged = 3008;
        static final int TRANSACTION_onPlayerInfoChanged = 3007;
        static final int TRANSACTION_onPlayerInfoChangedWithExclusions = 3013;
        static final int TRANSACTION_onRenderedFirstFrame = 3011;
        static final int TRANSACTION_onSearchResultChanged = 4002;
        static final int TRANSACTION_onSessionActivityChanged = 3014;
        static final int TRANSACTION_onSessionResult = 3002;
        static final int TRANSACTION_onSetCustomLayout = 3004;

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, androidx.media3.session.IMediaController.DESCRIPTOR);
        }

        public static androidx.media3.session.IMediaController asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(androidx.media3.session.IMediaController.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof androidx.media3.session.IMediaController)) {
                return (androidx.media3.session.IMediaController) iInterfaceQueryLocalInterface;
            }
            return new androidx.media3.session.IMediaController.Stub.Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(androidx.media3.session.IMediaController.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(androidx.media3.session.IMediaController.DESCRIPTOR);
                return true;
            }
            if (i == 4001) {
                onChildrenChanged(parcel.readInt(), parcel.readString(), parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
            } else if (i != 4002) {
                switch (i) {
                    case 3001:
                        onConnected(parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                        break;
                    case 3002:
                        onSessionResult(parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                        break;
                    case 3003:
                        onLibraryResult(parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                        break;
                    case 3004:
                        onSetCustomLayout(parcel.readInt(), parcel.createTypedArrayList(android.os.Bundle.CREATOR));
                        break;
                    case 3005:
                        onCustomCommand(parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                        break;
                    case 3006:
                        onDisconnected(parcel.readInt());
                        break;
                    case 3007:
                        onPlayerInfoChanged(parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR), parcel.readInt() != 0);
                        break;
                    case 3008:
                        onPeriodicSessionPositionInfoChanged(parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                        break;
                    case 3009:
                        onAvailableCommandsChangedFromPlayer(parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                        break;
                    case TRANSACTION_onAvailableCommandsChangedFromSession /* 3010 */:
                        onAvailableCommandsChangedFromSession(parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                        break;
                    case 3011:
                        onRenderedFirstFrame(parcel.readInt());
                        break;
                    case 3012:
                        onExtrasChanged(parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                        break;
                    case TRANSACTION_onPlayerInfoChangedWithExclusions /* 3013 */:
                        onPlayerInfoChangedWithExclusions(parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                        break;
                    case TRANSACTION_onSessionActivityChanged /* 3014 */:
                        onSessionActivityChanged(parcel.readInt(), (android.app.PendingIntent) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.app.PendingIntent.CREATOR));
                        break;
                    case 3015:
                        onError(parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                        break;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                onSearchResultChanged(parcel.readInt(), parcel.readString(), parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
            }
            return true;
        }

        private static class Proxy implements androidx.media3.session.IMediaController {
            private android.os.IBinder mRemote;

            public java.lang.String getInterfaceDescriptor() {
                return androidx.media3.session.IMediaController.DESCRIPTOR;
            }

            Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // androidx.media3.session.IMediaController
            public void onConnected(int i, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(3001, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onSessionResult(int i, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(3002, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onLibraryResult(int i, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(3003, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onSetCustomLayout(int i, java.util.List<android.os.Bundle> list) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaController._Parcel.writeTypedList(parcelObtain, list, 0);
                    this.mRemote.transact(3004, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onCustomCommand(int i, android.os.Bundle bundle, android.os.Bundle bundle2) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle2, 0);
                    this.mRemote.transact(3005, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onDisconnected(int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(3006, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onPlayerInfoChanged(int i, android.os.Bundle bundle, boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(3007, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onPlayerInfoChangedWithExclusions(int i, android.os.Bundle bundle, android.os.Bundle bundle2) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle2, 0);
                    this.mRemote.transact(androidx.media3.session.IMediaController.Stub.TRANSACTION_onPlayerInfoChangedWithExclusions, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onPeriodicSessionPositionInfoChanged(int i, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(3008, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onAvailableCommandsChangedFromPlayer(int i, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(3009, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onAvailableCommandsChangedFromSession(int i, android.os.Bundle bundle, android.os.Bundle bundle2) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle2, 0);
                    this.mRemote.transact(androidx.media3.session.IMediaController.Stub.TRANSACTION_onAvailableCommandsChangedFromSession, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onRenderedFirstFrame(int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(3011, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onExtrasChanged(int i, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(3012, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onSessionActivityChanged(int i, android.app.PendingIntent pendingIntent) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, pendingIntent, 0);
                    this.mRemote.transact(androidx.media3.session.IMediaController.Stub.TRANSACTION_onSessionActivityChanged, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onError(int i, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(3015, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onChildrenChanged(int i, java.lang.String str, int i2, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i2);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(4001, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onSearchResultChanged(int i, java.lang.String str, int i2, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i2);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(4002, parcelObtain, null, 1);
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
