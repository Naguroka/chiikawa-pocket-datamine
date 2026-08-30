package android.support.customtabs;

/* JADX INFO: loaded from: classes.dex */
public interface ICustomTabsService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android$support$customtabs$ICustomTabsService".replace(kotlin.text.Typography.dollar, '.');

    public static class Default implements android.support.customtabs.ICustomTabsService {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public android.os.Bundle extraCommand(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean isEngagementSignalsApiAvailable(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean mayLaunchUrl(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, android.os.Bundle bundle, java.util.List<android.os.Bundle> list) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSession(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSessionWithExtras(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public int postMessage(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
            return 0;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean receiveFile(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, int i, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannel(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannelWithExtras(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean setEngagementSignalsCallback(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.IBinder iBinder, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean updateVisuals(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean validateRelationship(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, int i, android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean warmup(long j) throws android.os.RemoteException {
            return false;
        }
    }

    android.os.Bundle extraCommand(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    boolean isEngagementSignalsApiAvailable(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException;

    boolean mayLaunchUrl(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, android.os.Bundle bundle, java.util.List<android.os.Bundle> list) throws android.os.RemoteException;

    boolean newSession(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback) throws android.os.RemoteException;

    boolean newSessionWithExtras(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException;

    int postMessage(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    boolean receiveFile(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, int i, android.os.Bundle bundle) throws android.os.RemoteException;

    boolean requestPostMessageChannel(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri) throws android.os.RemoteException;

    boolean requestPostMessageChannelWithExtras(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException;

    boolean setEngagementSignalsCallback(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.IBinder iBinder, android.os.Bundle bundle) throws android.os.RemoteException;

    boolean updateVisuals(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException;

    boolean validateRelationship(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, int i, android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException;

    boolean warmup(long j) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.support.customtabs.ICustomTabsService {
        static final int TRANSACTION_extraCommand = 5;
        static final int TRANSACTION_isEngagementSignalsApiAvailable = 13;
        static final int TRANSACTION_mayLaunchUrl = 4;
        static final int TRANSACTION_newSession = 3;
        static final int TRANSACTION_newSessionWithExtras = 10;
        static final int TRANSACTION_postMessage = 8;
        static final int TRANSACTION_receiveFile = 12;
        static final int TRANSACTION_requestPostMessageChannel = 7;
        static final int TRANSACTION_requestPostMessageChannelWithExtras = 11;
        static final int TRANSACTION_setEngagementSignalsCallback = 14;
        static final int TRANSACTION_updateVisuals = 6;
        static final int TRANSACTION_validateRelationship = 9;
        static final int TRANSACTION_warmup = 2;

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static android.support.customtabs.ICustomTabsService asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof android.support.customtabs.ICustomTabsService)) {
                return (android.support.customtabs.ICustomTabsService) iInterfaceQueryLocalInterface;
            }
            return new android.support.customtabs.ICustomTabsService.Stub.Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            java.lang.String str = DESCRIPTOR;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    boolean zWarmup = warmup(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zWarmup ? 1 : 0);
                    return true;
                case 3:
                    boolean zNewSession = newSession(android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zNewSession ? 1 : 0);
                    return true;
                case 4:
                    boolean zMayLaunchUrl = mayLaunchUrl(android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (android.net.Uri) android.support.customtabs.ICustomTabsService._Parcel.readTypedObject(parcel, android.net.Uri.CREATOR), (android.os.Bundle) android.support.customtabs.ICustomTabsService._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR), parcel.createTypedArrayList(android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zMayLaunchUrl ? 1 : 0);
                    return true;
                case 5:
                    android.os.Bundle bundleExtraCommand = extraCommand(parcel.readString(), (android.os.Bundle) android.support.customtabs.ICustomTabsService._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    android.support.customtabs.ICustomTabsService._Parcel.writeTypedObject(parcel2, bundleExtraCommand, 1);
                    return true;
                case 6:
                    boolean zUpdateVisuals = updateVisuals(android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (android.os.Bundle) android.support.customtabs.ICustomTabsService._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zUpdateVisuals ? 1 : 0);
                    return true;
                case 7:
                    boolean zRequestPostMessageChannel = requestPostMessageChannel(android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (android.net.Uri) android.support.customtabs.ICustomTabsService._Parcel.readTypedObject(parcel, android.net.Uri.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRequestPostMessageChannel ? 1 : 0);
                    return true;
                case 8:
                    int iPostMessage = postMessage(android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), (android.os.Bundle) android.support.customtabs.ICustomTabsService._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iPostMessage);
                    return true;
                case 9:
                    boolean zValidateRelationship = validateRelationship(android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (android.net.Uri) android.support.customtabs.ICustomTabsService._Parcel.readTypedObject(parcel, android.net.Uri.CREATOR), (android.os.Bundle) android.support.customtabs.ICustomTabsService._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zValidateRelationship ? 1 : 0);
                    return true;
                case 10:
                    boolean zNewSessionWithExtras = newSessionWithExtras(android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (android.os.Bundle) android.support.customtabs.ICustomTabsService._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zNewSessionWithExtras ? 1 : 0);
                    return true;
                case 11:
                    boolean zRequestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (android.net.Uri) android.support.customtabs.ICustomTabsService._Parcel.readTypedObject(parcel, android.net.Uri.CREATOR), (android.os.Bundle) android.support.customtabs.ICustomTabsService._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRequestPostMessageChannelWithExtras ? 1 : 0);
                    return true;
                case 12:
                    boolean zReceiveFile = receiveFile(android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (android.net.Uri) android.support.customtabs.ICustomTabsService._Parcel.readTypedObject(parcel, android.net.Uri.CREATOR), parcel.readInt(), (android.os.Bundle) android.support.customtabs.ICustomTabsService._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zReceiveFile ? 1 : 0);
                    return true;
                case 13:
                    boolean zIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (android.os.Bundle) android.support.customtabs.ICustomTabsService._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsEngagementSignalsApiAvailable ? 1 : 0);
                    return true;
                case 14:
                    boolean engagementSignalsCallback = setEngagementSignalsCallback(android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readStrongBinder(), (android.os.Bundle) android.support.customtabs.ICustomTabsService._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(engagementSignalsCallback ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        private static class Proxy implements android.support.customtabs.ICustomTabsService {
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            public java.lang.String getInterfaceDescriptor() {
                return DESCRIPTOR;
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean warmup(long j) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean newSession(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean newSessionWithExtras(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    android.support.customtabs.ICustomTabsService._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean mayLaunchUrl(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, android.os.Bundle bundle, java.util.List<android.os.Bundle> list) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    android.support.customtabs.ICustomTabsService._Parcel.writeTypedObject(parcelObtain, uri, 0);
                    android.support.customtabs.ICustomTabsService._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    android.support.customtabs.ICustomTabsService._Parcel.writeTypedList(parcelObtain, list, 0);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public android.os.Bundle extraCommand(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeString(str);
                    android.support.customtabs.ICustomTabsService._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (android.os.Bundle) android.support.customtabs.ICustomTabsService._Parcel.readTypedObject(parcelObtain2, android.os.Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean updateVisuals(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    android.support.customtabs.ICustomTabsService._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean requestPostMessageChannel(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    android.support.customtabs.ICustomTabsService._Parcel.writeTypedObject(parcelObtain, uri, 0);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean requestPostMessageChannelWithExtras(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    android.support.customtabs.ICustomTabsService._Parcel.writeTypedObject(parcelObtain, uri, 0);
                    android.support.customtabs.ICustomTabsService._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public int postMessage(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    parcelObtain.writeString(str);
                    android.support.customtabs.ICustomTabsService._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean validateRelationship(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, int i, android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    parcelObtain.writeInt(i);
                    android.support.customtabs.ICustomTabsService._Parcel.writeTypedObject(parcelObtain, uri, 0);
                    android.support.customtabs.ICustomTabsService._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean receiveFile(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, int i, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    android.support.customtabs.ICustomTabsService._Parcel.writeTypedObject(parcelObtain, uri, 0);
                    parcelObtain.writeInt(i);
                    android.support.customtabs.ICustomTabsService._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean isEngagementSignalsApiAvailable(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    android.support.customtabs.ICustomTabsService._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean setEngagementSignalsCallback(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.IBinder iBinder, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    parcelObtain.writeStrongBinder(iBinder);
                    android.support.customtabs.ICustomTabsService._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
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
