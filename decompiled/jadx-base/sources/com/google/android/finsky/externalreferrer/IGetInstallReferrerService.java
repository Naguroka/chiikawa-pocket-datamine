package com.google.android.finsky.externalreferrer;

/* JADX INFO: loaded from: classes4.dex */
public interface IGetInstallReferrerService extends android.os.IInterface {

    public static abstract class Stub extends com.google.android.a.b implements com.google.android.finsky.externalreferrer.IGetInstallReferrerService {

        public static class Proxy extends com.google.android.a.a implements com.google.android.finsky.externalreferrer.IGetInstallReferrerService {
            Proxy(android.os.IBinder iBinder) {
                super(iBinder);
            }

            @Override // com.google.android.finsky.externalreferrer.IGetInstallReferrerService
            public final android.os.Bundle c(android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelA = a();
                com.google.android.a.c.b(parcelA, bundle);
                android.os.Parcel parcelB = b(parcelA);
                android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.a.c.a(parcelB, android.os.Bundle.CREATOR);
                parcelB.recycle();
                return bundle2;
            }
        }

        public static com.google.android.finsky.externalreferrer.IGetInstallReferrerService b(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof com.google.android.finsky.externalreferrer.IGetInstallReferrerService ? (com.google.android.finsky.externalreferrer.IGetInstallReferrerService) iInterfaceQueryLocalInterface : new com.google.android.finsky.externalreferrer.IGetInstallReferrerService.Stub.Proxy(iBinder);
        }

        @Override // com.google.android.a.b
        protected final boolean a(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
            if (i != 1) {
                return false;
            }
            android.os.Bundle bundleC = c((android.os.Bundle) com.google.android.a.c.a(parcel, android.os.Bundle.CREATOR));
            parcel2.writeNoException();
            com.google.android.a.c.c(parcel2, bundleC);
            return true;
        }
    }

    android.os.Bundle c(android.os.Bundle bundle) throws android.os.RemoteException;
}
