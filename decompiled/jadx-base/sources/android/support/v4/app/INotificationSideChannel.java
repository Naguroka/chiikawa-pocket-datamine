package android.support.v4.app;

/* JADX INFO: loaded from: classes.dex */
public interface INotificationSideChannel extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.support.v4.app.INotificationSideChannel";

    public static class Default implements android.support.v4.app.INotificationSideChannel {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancel(java.lang.String str, int i, java.lang.String str2) throws android.os.RemoteException {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancelAll(java.lang.String str) throws android.os.RemoteException {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void notify(java.lang.String str, int i, java.lang.String str2, android.app.Notification notification) throws android.os.RemoteException {
        }
    }

    void cancel(java.lang.String str, int i, java.lang.String str2) throws android.os.RemoteException;

    void cancelAll(java.lang.String str) throws android.os.RemoteException;

    void notify(java.lang.String str, int i, java.lang.String str2, android.app.Notification notification) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.support.v4.app.INotificationSideChannel {
        static final int TRANSACTION_cancel = 2;
        static final int TRANSACTION_cancelAll = 3;
        static final int TRANSACTION_notify = 1;

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, android.support.v4.app.INotificationSideChannel.DESCRIPTOR);
        }

        public static android.support.v4.app.INotificationSideChannel asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(android.support.v4.app.INotificationSideChannel.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof android.support.v4.app.INotificationSideChannel)) {
                return (android.support.v4.app.INotificationSideChannel) iInterfaceQueryLocalInterface;
            }
            return new android.support.v4.app.INotificationSideChannel.Stub.Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(android.support.v4.app.INotificationSideChannel.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(android.support.v4.app.INotificationSideChannel.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                notify(parcel.readString(), parcel.readInt(), parcel.readString(), (android.app.Notification) android.support.v4.app.INotificationSideChannel._Parcel.readTypedObject(parcel, android.app.Notification.CREATOR));
            } else if (i == 2) {
                cancel(parcel.readString(), parcel.readInt(), parcel.readString());
            } else if (i == 3) {
                cancelAll(parcel.readString());
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        private static class Proxy implements android.support.v4.app.INotificationSideChannel {
            private android.os.IBinder mRemote;

            public java.lang.String getInterfaceDescriptor() {
                return android.support.v4.app.INotificationSideChannel.DESCRIPTOR;
            }

            Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void notify(java.lang.String str, int i, java.lang.String str2, android.app.Notification notification) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.app.INotificationSideChannel.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    android.support.v4.app.INotificationSideChannel._Parcel.writeTypedObject(parcelObtain, notification, 0);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void cancel(java.lang.String str, int i, java.lang.String str2) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.app.INotificationSideChannel.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void cancelAll(java.lang.String str) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(android.support.v4.app.INotificationSideChannel.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(3, parcelObtain, null, 1);
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
