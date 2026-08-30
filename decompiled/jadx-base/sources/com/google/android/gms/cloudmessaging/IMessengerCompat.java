package com.google.android.gms.cloudmessaging;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes4.dex */
interface IMessengerCompat extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.google.android.gms.iid.IMessengerCompat";
    public static final int TRANSACTION_SEND = 1;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
    public static class Impl extends android.os.Binder implements com.google.android.gms.cloudmessaging.IMessengerCompat {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            throw null;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            throw null;
        }

        @Override // com.google.android.gms.cloudmessaging.IMessengerCompat
        public void send(android.os.Message message) throws android.os.RemoteException {
            throw null;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
    public static class Proxy implements com.google.android.gms.cloudmessaging.IMessengerCompat {
        private final android.os.IBinder zza;

        Proxy(android.os.IBinder iBinder) {
            this.zza = iBinder;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this.zza;
        }

        @Override // com.google.android.gms.cloudmessaging.IMessengerCompat
        public void send(android.os.Message message) throws android.os.RemoteException {
            android.os.Parcel parcelObtain = android.os.Parcel.obtain();
            parcelObtain.writeInterfaceToken(com.google.android.gms.cloudmessaging.IMessengerCompat.DESCRIPTOR);
            parcelObtain.writeInt(1);
            message.writeToParcel(parcelObtain, 0);
            try {
                this.zza.transact(1, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        }
    }

    void send(android.os.Message message) throws android.os.RemoteException;
}
