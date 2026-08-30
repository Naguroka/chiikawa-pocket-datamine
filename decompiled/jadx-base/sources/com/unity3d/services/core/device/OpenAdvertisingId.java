package com.unity3d.services.core.device;

/* JADX INFO: loaded from: classes6.dex */
public class OpenAdvertisingId {
    private static final java.lang.String HW_DEVICE_NAME = "HUAWEI";
    private static final java.lang.String HW_OPEN_ADVERTISING_ID_SERVICE_NAME = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";
    private static com.unity3d.services.core.device.OpenAdvertisingId instance;
    private java.lang.String openAdvertisingIdentifier = null;
    private boolean limitedOpenAdTracking = false;

    private static com.unity3d.services.core.device.OpenAdvertisingId getInstance() {
        if (instance == null) {
            instance = new com.unity3d.services.core.device.OpenAdvertisingId();
        }
        return instance;
    }

    public static void init(android.content.Context context) {
        if (android.os.Build.MANUFACTURER.toUpperCase().equals(HW_DEVICE_NAME)) {
            getInstance().fetchOAId(context);
        }
    }

    public static java.lang.String getOpenAdvertisingTrackingId() {
        return getInstance().openAdvertisingIdentifier;
    }

    public static boolean getLimitedOpenAdTracking() {
        return getInstance().limitedOpenAdTracking;
    }

    private void fetchOAId(android.content.Context context) {
        com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingServiceConnection hWAdvertisingServiceConnection = new com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingServiceConnection();
        android.content.Intent intent = new android.content.Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        try {
            if (context.bindService(intent, hWAdvertisingServiceConnection, 1)) {
                try {
                    try {
                        com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo hWAdvertisingInfoCreate = com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo.HWAdvertisingInfoBinder.create(hWAdvertisingServiceConnection.getBinder());
                        this.openAdvertisingIdentifier = hWAdvertisingInfoCreate.getId();
                        this.limitedOpenAdTracking = hWAdvertisingInfoCreate.getEnabled(true);
                    } catch (java.lang.Exception e) {
                        com.unity3d.services.core.log.DeviceLog.exception("Couldn't get openAdvertising info", e);
                    }
                } finally {
                    context.unbindService(hWAdvertisingServiceConnection);
                }
            }
        } catch (java.lang.Exception e2) {
            com.unity3d.services.core.log.DeviceLog.exception("Couldn't bind to identifier service intent", e2);
        }
    }

    private interface HWAdvertisingInfo extends android.os.IInterface {
        boolean getEnabled(boolean z) throws android.os.RemoteException;

        java.lang.String getId() throws android.os.RemoteException;

        public static abstract class HWAdvertisingInfoBinder extends android.os.Binder implements com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo {
            public static com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo create(android.os.IBinder iBinder) {
                if (iBinder == null) {
                    return null;
                }
                android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(com.unity3d.services.core.device.OpenAdvertisingId.HW_OPEN_ADVERTISING_ID_SERVICE_NAME);
                if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo)) {
                    return (com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo) iInterfaceQueryLocalInterface;
                }
                return new com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo.HWAdvertisingInfoBinder.HWAdvertisingInfoImplementation(iBinder);
            }

            @Override // android.os.Binder
            public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
                if (i == 1) {
                    parcel.enforceInterface(com.unity3d.services.core.device.OpenAdvertisingId.HW_OPEN_ADVERTISING_ID_SERVICE_NAME);
                    java.lang.String id = getId();
                    parcel2.writeNoException();
                    parcel2.writeString(id);
                    return true;
                }
                if (i == 2) {
                    parcel.enforceInterface(com.unity3d.services.core.device.OpenAdvertisingId.HW_OPEN_ADVERTISING_ID_SERVICE_NAME);
                    boolean enabled = getEnabled(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(enabled ? 1 : 0);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }

            private static class HWAdvertisingInfoImplementation implements com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo {
                private final android.os.IBinder _binder;

                HWAdvertisingInfoImplementation(android.os.IBinder iBinder) {
                    this._binder = iBinder;
                }

                @Override // android.os.IInterface
                public android.os.IBinder asBinder() {
                    return this._binder;
                }

                @Override // com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo
                public java.lang.String getId() throws android.os.RemoteException {
                    android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                    android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(com.unity3d.services.core.device.OpenAdvertisingId.HW_OPEN_ADVERTISING_ID_SERVICE_NAME);
                        this._binder.transact(1, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        return parcelObtain2.readString();
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                }

                @Override // com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo
                public boolean getEnabled(boolean z) throws android.os.RemoteException {
                    android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                    android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(com.unity3d.services.core.device.OpenAdvertisingId.HW_OPEN_ADVERTISING_ID_SERVICE_NAME);
                        parcelObtain.writeInt(z ? 1 : 0);
                        this._binder.transact(2, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        return parcelObtain2.readInt() != 0;
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                }
            }
        }
    }

    private class HWAdvertisingServiceConnection implements android.content.ServiceConnection {
        private final java.util.concurrent.BlockingQueue<android.os.IBinder> _binderQueue;
        boolean _consumed;

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName componentName) {
        }

        private HWAdvertisingServiceConnection() {
            this._consumed = false;
            this._binderQueue = new java.util.concurrent.LinkedBlockingQueue();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            try {
                this._binderQueue.put(iBinder);
            } catch (java.lang.InterruptedException unused) {
                com.unity3d.services.core.log.DeviceLog.debug("Couldn't put service to binder que");
                java.lang.Thread.currentThread().interrupt();
            }
        }

        public android.os.IBinder getBinder() throws java.lang.InterruptedException {
            if (this._consumed) {
                throw new java.lang.IllegalStateException();
            }
            this._consumed = true;
            return this._binderQueue.take();
        }
    }
}
