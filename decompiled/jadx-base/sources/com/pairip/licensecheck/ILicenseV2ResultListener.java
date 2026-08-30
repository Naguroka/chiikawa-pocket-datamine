package com.pairip.licensecheck;

/* JADX INFO: loaded from: classes2.dex */
public interface ILicenseV2ResultListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.vending.licensing.ILicenseV2ResultListener";

    void verifyLicense(int responseCode, android.os.Bundle responsePayload) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.pairip.licensecheck.ILicenseV2ResultListener {
        static final int TRANSACTION_VERIFY_LICENSE = 1;

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, com.pairip.licensecheck.ILicenseV2ResultListener.DESCRIPTOR);
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {
            if (code >= 1 && code <= 16777215) {
                data.enforceInterface(com.pairip.licensecheck.ILicenseV2ResultListener.DESCRIPTOR);
            }
            if (code == 1) {
                verifyLicense(data.readInt(), (android.os.Bundle) readTypedObject(data, android.os.Bundle.CREATOR));
            } else if (code == 1598968902) {
                reply.writeString(com.pairip.licensecheck.ILicenseV2ResultListener.DESCRIPTOR);
            } else {
                return super.onTransact(code, data, reply, flags);
            }
            return true;
        }

        private static <T> T readTypedObject(android.os.Parcel parcel, android.os.Parcelable.Creator<T> c) {
            if (parcel.readInt() != 0) {
                return c.createFromParcel(parcel);
            }
            return null;
        }
    }
}
