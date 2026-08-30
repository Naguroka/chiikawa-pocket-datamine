package com.bytedance.sdk.openadsdk;

/* JADX INFO: loaded from: classes4.dex */
public interface IListenerManager extends android.os.IInterface {

    public static class Default implements com.bytedance.sdk.openadsdk.IListenerManager {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void broadcastDialogListener(java.lang.String str, int i) throws android.os.RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void broadcastPermissionListener(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void executeAppOpenAdCallback(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void executeDisLikeClosedCallback(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void executeFullVideoCallback(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void executeRewardVideoCallback(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.String str3, int i2, java.lang.String str4) throws android.os.RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void registerAppOpenAdListener(java.lang.String str, com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws android.os.RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void registerDialogListener(java.lang.String str, com.bytedance.sdk.openadsdk.ICommonDialogListener iCommonDialogListener) throws android.os.RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void registerDisLikeClosedListener(java.lang.String str, com.bytedance.sdk.openadsdk.IDislikeClosedListener iDislikeClosedListener) throws android.os.RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void registerFullVideoListener(java.lang.String str, com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws android.os.RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void registerPermissionListener(java.lang.String str, com.bytedance.sdk.openadsdk.ICommonPermissionListener iCommonPermissionListener) throws android.os.RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void registerRewardVideoListener(java.lang.String str, com.bytedance.sdk.openadsdk.IRewardAdInteractionListener iRewardAdInteractionListener) throws android.os.RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void unregisterDisLikeClosedListener(java.lang.String str) throws android.os.RemoteException {
        }
    }

    void broadcastDialogListener(java.lang.String str, int i) throws android.os.RemoteException;

    void broadcastPermissionListener(java.lang.String str, java.lang.String str2) throws android.os.RemoteException;

    void executeAppOpenAdCallback(java.lang.String str, java.lang.String str2) throws android.os.RemoteException;

    void executeDisLikeClosedCallback(java.lang.String str, java.lang.String str2) throws android.os.RemoteException;

    void executeFullVideoCallback(java.lang.String str, java.lang.String str2) throws android.os.RemoteException;

    void executeRewardVideoCallback(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.String str3, int i2, java.lang.String str4) throws android.os.RemoteException;

    void registerAppOpenAdListener(java.lang.String str, com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws android.os.RemoteException;

    void registerDialogListener(java.lang.String str, com.bytedance.sdk.openadsdk.ICommonDialogListener iCommonDialogListener) throws android.os.RemoteException;

    void registerDisLikeClosedListener(java.lang.String str, com.bytedance.sdk.openadsdk.IDislikeClosedListener iDislikeClosedListener) throws android.os.RemoteException;

    void registerFullVideoListener(java.lang.String str, com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws android.os.RemoteException;

    void registerPermissionListener(java.lang.String str, com.bytedance.sdk.openadsdk.ICommonPermissionListener iCommonPermissionListener) throws android.os.RemoteException;

    void registerRewardVideoListener(java.lang.String str, com.bytedance.sdk.openadsdk.IRewardAdInteractionListener iRewardAdInteractionListener) throws android.os.RemoteException;

    void unregisterDisLikeClosedListener(java.lang.String str) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.bytedance.sdk.openadsdk.IListenerManager {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.IListenerManager");
        }

        public static com.bytedance.sdk.openadsdk.IListenerManager asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.IListenerManager");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof com.bytedance.sdk.openadsdk.IListenerManager)) {
                return (com.bytedance.sdk.openadsdk.IListenerManager) iInterfaceQueryLocalInterface;
            }
            return new com.bytedance.sdk.openadsdk.IListenerManager.Stub.bg(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i == 1598968902) {
                parcel2.writeString("com.bytedance.sdk.openadsdk.IListenerManager");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                    registerRewardVideoListener(parcel.readString(), com.bytedance.sdk.openadsdk.IRewardAdInteractionListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                    executeRewardVideoCallback(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                    registerFullVideoListener(parcel.readString(), com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                    executeFullVideoCallback(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                    registerDialogListener(parcel.readString(), com.bytedance.sdk.openadsdk.ICommonDialogListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                    broadcastDialogListener(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                    registerPermissionListener(parcel.readString(), com.bytedance.sdk.openadsdk.ICommonPermissionListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                    broadcastPermissionListener(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                    registerDisLikeClosedListener(parcel.readString(), com.bytedance.sdk.openadsdk.IDislikeClosedListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                    unregisterDisLikeClosedListener(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                    executeDisLikeClosedCallback(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                    registerAppOpenAdListener(parcel.readString(), com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                    executeAppOpenAdCallback(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        private static class bg implements com.bytedance.sdk.openadsdk.IListenerManager {
            public static com.bytedance.sdk.openadsdk.IListenerManager bg;
            private android.os.IBinder IL;

            bg(android.os.IBinder iBinder) {
                this.IL = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.IL;
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void registerRewardVideoListener(java.lang.String str, com.bytedance.sdk.openadsdk.IRewardAdInteractionListener iRewardAdInteractionListener) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iRewardAdInteractionListener != null ? iRewardAdInteractionListener.asBinder() : null);
                    if (!this.IL.transact(1, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IListenerManager.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IListenerManager.Stub.getDefaultImpl().registerRewardVideoListener(str, iRewardAdInteractionListener);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void executeRewardVideoCallback(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.String str3, int i2, java.lang.String str4) throws java.lang.Throwable {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str4);
                    try {
                        if (!this.IL.transact(2, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IListenerManager.Stub.getDefaultImpl() != null) {
                            com.bytedance.sdk.openadsdk.IListenerManager.Stub.getDefaultImpl().executeRewardVideoCallback(str, str2, z, i, str3, i2, str4);
                        } else {
                            parcelObtain2.readException();
                        }
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    } catch (java.lang.Throwable th) {
                        th = th;
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void registerFullVideoListener(java.lang.String str, com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iFullScreenVideoAdInteractionListener != null ? iFullScreenVideoAdInteractionListener.asBinder() : null);
                    if (!this.IL.transact(3, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IListenerManager.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IListenerManager.Stub.getDefaultImpl().registerFullVideoListener(str, iFullScreenVideoAdInteractionListener);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void executeFullVideoCallback(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (!this.IL.transact(4, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IListenerManager.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IListenerManager.Stub.getDefaultImpl().executeFullVideoCallback(str, str2);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void registerDialogListener(java.lang.String str, com.bytedance.sdk.openadsdk.ICommonDialogListener iCommonDialogListener) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iCommonDialogListener != null ? iCommonDialogListener.asBinder() : null);
                    if (!this.IL.transact(5, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IListenerManager.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IListenerManager.Stub.getDefaultImpl().registerDialogListener(str, iCommonDialogListener);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void broadcastDialogListener(java.lang.String str, int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    if (!this.IL.transact(6, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IListenerManager.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IListenerManager.Stub.getDefaultImpl().broadcastDialogListener(str, i);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void registerPermissionListener(java.lang.String str, com.bytedance.sdk.openadsdk.ICommonPermissionListener iCommonPermissionListener) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iCommonPermissionListener != null ? iCommonPermissionListener.asBinder() : null);
                    if (!this.IL.transact(7, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IListenerManager.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IListenerManager.Stub.getDefaultImpl().registerPermissionListener(str, iCommonPermissionListener);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void broadcastPermissionListener(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (!this.IL.transact(8, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IListenerManager.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IListenerManager.Stub.getDefaultImpl().broadcastPermissionListener(str, str2);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void registerDisLikeClosedListener(java.lang.String str, com.bytedance.sdk.openadsdk.IDislikeClosedListener iDislikeClosedListener) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iDislikeClosedListener != null ? iDislikeClosedListener.asBinder() : null);
                    if (!this.IL.transact(9, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IListenerManager.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IListenerManager.Stub.getDefaultImpl().registerDisLikeClosedListener(str, iDislikeClosedListener);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void unregisterDisLikeClosedListener(java.lang.String str) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcelObtain.writeString(str);
                    if (!this.IL.transact(10, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IListenerManager.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IListenerManager.Stub.getDefaultImpl().unregisterDisLikeClosedListener(str);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void executeDisLikeClosedCallback(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (!this.IL.transact(11, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IListenerManager.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IListenerManager.Stub.getDefaultImpl().executeDisLikeClosedCallback(str, str2);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void registerAppOpenAdListener(java.lang.String str, com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iAppOpenAdInteractionListener != null ? iAppOpenAdInteractionListener.asBinder() : null);
                    if (!this.IL.transact(12, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IListenerManager.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IListenerManager.Stub.getDefaultImpl().registerAppOpenAdListener(str, iAppOpenAdInteractionListener);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void executeAppOpenAdCallback(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (!this.IL.transact(13, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IListenerManager.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IListenerManager.Stub.getDefaultImpl().executeAppOpenAdCallback(str, str2);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(com.bytedance.sdk.openadsdk.IListenerManager iListenerManager) {
            if (com.bytedance.sdk.openadsdk.IListenerManager.Stub.bg.bg != null || iListenerManager == null) {
                return false;
            }
            com.bytedance.sdk.openadsdk.IListenerManager.Stub.bg.bg = iListenerManager;
            return true;
        }

        public static com.bytedance.sdk.openadsdk.IListenerManager getDefaultImpl() {
            return com.bytedance.sdk.openadsdk.IListenerManager.Stub.bg.bg;
        }
    }
}
