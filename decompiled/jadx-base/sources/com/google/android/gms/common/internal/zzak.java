package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzak {
    private static final android.net.Uri zza = new android.net.Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    static android.content.Intent zza(android.content.Context context, com.google.android.gms.common.internal.zzo zzoVar) throws com.google.android.gms.common.internal.zzai {
        android.os.Bundle bundleCall;
        java.lang.String strZzb = zzoVar.zzb();
        if (strZzb == null) {
            return new android.content.Intent().setComponent(zzoVar.zza());
        }
        android.content.Intent intent = null;
        if (zzoVar.zzd()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("serviceActionBundleKey", strZzb);
            try {
                android.content.ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(zza);
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new android.os.RemoteException("Failed to acquire ContentProviderClient");
                }
                try {
                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    if (bundleCall != null) {
                        android.content.Intent intent2 = (android.content.Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                        if (intent2 != null) {
                            intent = intent2;
                        } else {
                            android.app.PendingIntent pendingIntent = (android.app.PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                            if (pendingIntent != null) {
                                android.util.Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action " + strZzb + " but has possible resolution");
                                throw new com.google.android.gms.common.internal.zzai(new com.google.android.gms.common.ConnectionResult(25, pendingIntent));
                            }
                        }
                    }
                    if (intent == null) {
                        android.util.Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(strZzb));
                    }
                } catch (java.lang.Throwable th) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th;
                }
            } catch (android.os.RemoteException | java.lang.IllegalArgumentException e) {
                android.util.Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundleCall = null;
            }
        }
        return intent == null ? new android.content.Intent(strZzb).setPackage(zzoVar.zzc()) : intent;
    }
}
