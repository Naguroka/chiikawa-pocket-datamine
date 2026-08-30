package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class GooglePlayServicesClient {

    public static final class GooglePlayServicesInfo {
        private final java.lang.String gpsAdid;
        private final java.lang.Boolean trackingEnabled;

        public GooglePlayServicesInfo(java.lang.String str, java.lang.Boolean bool) {
            this.gpsAdid = str;
            this.trackingEnabled = bool;
        }

        public java.lang.String getGpsAdid() {
            return this.gpsAdid;
        }

        public java.lang.Boolean isTrackingEnabled() {
            return this.trackingEnabled;
        }
    }

    public static final class a implements android.content.ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f81a;
        public boolean b = false;
        public final java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> c = new java.util.concurrent.LinkedBlockingQueue<>(1);

        public a(long j) {
            this.f81a = j;
        }

        public final android.os.IBinder a() {
            if (this.b) {
                throw new java.lang.IllegalStateException();
            }
            this.b = true;
            return this.c.poll(this.f81a, java.util.concurrent.TimeUnit.MILLISECONDS);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            try {
                this.c.put(iBinder);
            } catch (java.lang.InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(android.content.ComponentName componentName) {
        }
    }

    public static com.adjust.sdk.GooglePlayServicesClient.GooglePlayServicesInfo getGooglePlayServicesInfo(android.content.Context context, long j) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            throw new java.lang.IllegalStateException("Google Play Services info can't be accessed from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        com.adjust.sdk.GooglePlayServicesClient.a aVar = new com.adjust.sdk.GooglePlayServicesClient.a(j);
        android.content.Intent intent = new android.content.Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, aVar, 1)) {
                throw new java.io.IOException("Google Play connection failed");
            }
            try {
                android.os.IBinder iBinderA = aVar.a();
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    iBinderA.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    java.lang.String string = parcelObtain2.readString();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    android.os.Parcel parcelObtain3 = android.os.Parcel.obtain();
                    android.os.Parcel parcelObtain4 = android.os.Parcel.obtain();
                    try {
                        parcelObtain3.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        parcelObtain3.writeInt(1);
                        iBinderA.transact(2, parcelObtain3, parcelObtain4, 0);
                        parcelObtain4.readException();
                        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(parcelObtain4.readInt() != 0);
                        parcelObtain4.recycle();
                        parcelObtain3.recycle();
                        com.adjust.sdk.GooglePlayServicesClient.GooglePlayServicesInfo googlePlayServicesInfo = new com.adjust.sdk.GooglePlayServicesClient.GooglePlayServicesInfo(string, boolValueOf != null ? java.lang.Boolean.valueOf(!boolValueOf.booleanValue()) : null);
                        context.unbindService(aVar);
                        return googlePlayServicesInfo;
                    } catch (java.lang.Throwable th) {
                        parcelObtain4.recycle();
                        parcelObtain3.recycle();
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            } catch (java.lang.Exception e) {
                throw e;
            }
        } catch (java.lang.Throwable th3) {
            context.unbindService(aVar);
            throw th3;
        }
    }
}
