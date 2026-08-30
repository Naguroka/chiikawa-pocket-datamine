package com.bytedance.sdk.component.ldr.bg;

/* JADX INFO: loaded from: classes3.dex */
public interface ldr extends android.os.IInterface {
    int bg(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) throws android.os.RemoteException;

    int bg(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) throws android.os.RemoteException;

    java.lang.String bg(android.net.Uri uri) throws android.os.RemoteException;

    java.lang.String bg(android.net.Uri uri, android.content.ContentValues contentValues) throws android.os.RemoteException;

    java.util.Map bg(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) throws android.os.RemoteException;

    public static abstract class bg extends android.os.Binder implements com.bytedance.sdk.component.ldr.bg.ldr {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public bg() {
            attachInterface(this, "com.bytedance.sdk.component.log.impl.IListenerEventManager");
        }

        public static com.bytedance.sdk.component.ldr.bg.ldr bg(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof com.bytedance.sdk.component.ldr.bg.ldr)) {
                return (com.bytedance.sdk.component.ldr.bg.ldr) iInterfaceQueryLocalInterface;
            }
            return new com.bytedance.sdk.component.ldr.bg.ldr.bg.C0116bg(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                java.util.Map mapBg = bg(parcel.readInt() != 0 ? (android.net.Uri) android.net.Uri.CREATOR.createFromParcel(parcel) : null, parcel.createStringArray(), parcel.readString(), parcel.createStringArray(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeMap(mapBg);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                java.lang.String strBg = bg(parcel.readInt() != 0 ? (android.net.Uri) android.net.Uri.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeString(strBg);
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                java.lang.String strBg2 = bg(parcel.readInt() != 0 ? (android.net.Uri) android.net.Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (android.content.ContentValues) android.content.ContentValues.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeString(strBg2);
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                int iBg = bg(parcel.readInt() != 0 ? (android.net.Uri) android.net.Uri.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.createStringArray());
                parcel2.writeNoException();
                parcel2.writeInt(iBg);
                return true;
            }
            if (i != 5) {
                if (i == 1598968902) {
                    parcel2.writeString("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
            int iBg2 = bg(parcel.readInt() != 0 ? (android.net.Uri) android.net.Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (android.content.ContentValues) android.content.ContentValues.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.createStringArray());
            parcel2.writeNoException();
            parcel2.writeInt(iBg2);
            return true;
        }

        /* JADX INFO: renamed from: com.bytedance.sdk.component.ldr.bg.ldr$bg$bg, reason: collision with other inner class name */
        private static class C0116bg implements com.bytedance.sdk.component.ldr.bg.ldr {
            public static com.bytedance.sdk.component.ldr.bg.ldr bg;
            private android.os.IBinder IL;

            C0116bg(android.os.IBinder iBinder) {
                this.IL = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.IL;
            }

            @Override // com.bytedance.sdk.component.ldr.bg.ldr
            public java.util.Map bg(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringArray(strArr2);
                    parcelObtain.writeString(str2);
                    if (!this.IL.transact(1, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.component.ldr.bg.ldr.bg.bg() != null) {
                        return com.bytedance.sdk.component.ldr.bg.ldr.bg.bg().bg(uri, strArr, str, strArr2, str2);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.component.ldr.bg.ldr
            public java.lang.String bg(android.net.Uri uri) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.IL.transact(2, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.component.ldr.bg.ldr.bg.bg() != null) {
                        return com.bytedance.sdk.component.ldr.bg.ldr.bg.bg().bg(uri);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.component.ldr.bg.ldr
            public java.lang.String bg(android.net.Uri uri, android.content.ContentValues contentValues) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (contentValues != null) {
                        parcelObtain.writeInt(1);
                        contentValues.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.IL.transact(3, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.component.ldr.bg.ldr.bg.bg() != null) {
                        return com.bytedance.sdk.component.ldr.bg.ldr.bg.bg().bg(uri, contentValues);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.component.ldr.bg.ldr
            public int bg(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringArray(strArr);
                    if (!this.IL.transact(4, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.component.ldr.bg.ldr.bg.bg() != null) {
                        return com.bytedance.sdk.component.ldr.bg.ldr.bg.bg().bg(uri, str, strArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.component.ldr.bg.ldr
            public int bg(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (contentValues != null) {
                        parcelObtain.writeInt(1);
                        contentValues.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringArray(strArr);
                    if (!this.IL.transact(5, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.component.ldr.bg.ldr.bg.bg() != null) {
                        return com.bytedance.sdk.component.ldr.bg.ldr.bg.bg().bg(uri, contentValues, str, strArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static com.bytedance.sdk.component.ldr.bg.ldr bg() {
            return com.bytedance.sdk.component.ldr.bg.ldr.bg.C0116bg.bg;
        }
    }
}
