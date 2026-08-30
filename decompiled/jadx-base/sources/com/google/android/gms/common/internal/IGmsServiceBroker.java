package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface IGmsServiceBroker extends android.os.IInterface {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public static abstract class Stub extends android.os.Binder implements com.google.android.gms.common.internal.IGmsServiceBroker {
        public Stub() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:61:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:63:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:64:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:66:0x00ef  */
        @Override // android.os.Binder
        public final boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            com.google.android.gms.common.internal.IGmsCallbacks zzaaVar;
            if (i <= 0 || i > 16777215) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzaaVar = null;
            } else {
                android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                zzaaVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.IGmsCallbacks ? (com.google.android.gms.common.internal.IGmsCallbacks) iInterfaceQueryLocalInterface : new com.google.android.gms.common.internal.zzaa(strongBinder);
            }
            if (i == 46) {
                getService(zzaaVar, parcel.readInt() != 0 ? com.google.android.gms.common.internal.GetServiceRequest.CREATOR.createFromParcel(parcel) : null);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(parcel2);
                parcel2.writeNoException();
                return true;
            }
            if (i == 47) {
                if (parcel.readInt() != 0) {
                    com.google.android.gms.common.internal.zzal.CREATOR.createFromParcel(parcel);
                }
                throw new java.lang.UnsupportedOperationException();
            }
            parcel.readInt();
            if (i != 4) {
                parcel.readString();
                if (i == 1) {
                    parcel.readString();
                    parcel.createStringArray();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                } else if (i == 2 || i == 23 || i == 25 || i == 27) {
                    if (parcel.readInt() != 0) {
                    }
                } else if (i == 30) {
                    parcel.createStringArray();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                } else if (i == 34) {
                    parcel.readString();
                } else if (i != 41 && i != 43 && i != 37 && i != 38) {
                    switch (i) {
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                            if (parcel.readInt() != 0) {
                            }
                            break;
                        case 9:
                            parcel.readString();
                            parcel.createStringArray();
                            parcel.readString();
                            parcel.readStrongBinder();
                            parcel.readString();
                            if (parcel.readInt() != 0) {
                            }
                            break;
                        case 10:
                            parcel.readString();
                            parcel.createStringArray();
                            break;
                        case 19:
                            parcel.readStrongBinder();
                            if (parcel.readInt() != 0) {
                            }
                            break;
                        case 20:
                            parcel.createStringArray();
                            parcel.readString();
                            if (parcel.readInt() != 0) {
                            }
                            break;
                    }
                } else if (parcel.readInt() != 0) {
                }
            }
            throw new java.lang.UnsupportedOperationException();
        }
    }

    void getService(com.google.android.gms.common.internal.IGmsCallbacks iGmsCallbacks, com.google.android.gms.common.internal.GetServiceRequest getServiceRequest) throws android.os.RemoteException;
}
