package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzet {
    private static final java.util.WeakHashMap<android.app.Activity, com.google.android.gms.internal.nearby.zzet> zza = new java.util.WeakHashMap<>();
    private final android.content.Context zzb;
    private final java.lang.ref.WeakReference<android.app.Activity> zzc;
    private final android.nfc.NfcAdapter zzd;
    private boolean zze = true;
    private boolean zzf;
    private boolean zzg;

    private zzet(android.app.Activity activity) {
        android.content.Context applicationContext = activity.getApplicationContext();
        this.zzb = applicationContext;
        java.lang.ref.WeakReference<android.app.Activity> weakReference = new java.lang.ref.WeakReference<>(activity);
        this.zzc = weakReference;
        this.zzd = android.nfc.NfcAdapter.getDefaultAdapter(applicationContext);
        activity.getApplication().registerActivityLifecycleCallbacks(new com.google.android.gms.internal.nearby.zzes(this, weakReference));
        android.util.Log.d("NearbyConnections", "NfcDispatcher created.");
    }

    public static synchronized com.google.android.gms.internal.nearby.zzet zza(android.app.Activity activity) {
        java.util.WeakHashMap<android.app.Activity, com.google.android.gms.internal.nearby.zzet> weakHashMap;
        weakHashMap = zza;
        if (!weakHashMap.containsKey(activity)) {
            weakHashMap.put(activity, new com.google.android.gms.internal.nearby.zzet(activity));
        }
        return weakHashMap.get(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        android.nfc.NfcAdapter nfcAdapter;
        android.util.Log.d("NearbyConnections", "Invalidating dispatch state.");
        if (!this.zze || !this.zzf) {
            android.util.Log.d("NearbyConnections", "Stopping NFC dispatching.");
            if (!this.zzg) {
                android.util.Log.d("NearbyConnections", "Can't stop NFC dispatching. Not dispatching.");
                return;
            }
            android.app.Activity activity = this.zzc.get();
            if (activity != null) {
                this.zzd.disableReaderMode(activity);
            }
            this.zzg = false;
            android.util.Log.d("NearbyConnections", "No longer dispatching NFC events");
            return;
        }
        android.util.Log.d("NearbyConnections", "Starting NFC dispatching.");
        if (this.zzg) {
            android.util.Log.d("NearbyConnections", "Can't start NFC dispatching. Already dispatching.");
            return;
        }
        if (!this.zzb.getPackageManager().hasSystemFeature("android.hardware.nfc") || androidx.core.content.ContextCompat.checkSelfPermission(this.zzb, "android.permission.NFC") != 0 || (nfcAdapter = this.zzd) == null || !nfcAdapter.isEnabled()) {
            android.util.Log.d("NearbyConnections", "Cannot dispatch NFC events. NFC is not supported.");
            return;
        }
        android.app.Activity activity2 = this.zzc.get();
        if (activity2 == null) {
            android.util.Log.d("NearbyConnections", "Cannot dispatch NFC events. Activity is gone.");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("presence", 100);
        this.zzd.enableReaderMode(activity2, new android.nfc.NfcAdapter.ReaderCallback(this) { // from class: com.google.android.gms.internal.nearby.zzer
            private final com.google.android.gms.internal.nearby.zzet zza;

            {
                this.zza = this;
            }

            @Override // android.nfc.NfcAdapter.ReaderCallback
            public final void onTagDiscovered(android.nfc.Tag tag) {
                this.zza.zzf(tag);
            }
        }, 385, bundle);
        this.zzg = true;
        android.util.Log.d("NearbyConnections", "Dispatching NFC events");
    }

    public final void zzb() {
        this.zzf = true;
        android.util.Log.d("NearbyConnections", "NFC discovery started.");
        zzg();
    }

    public final void zzc() {
        this.zzf = false;
        android.util.Log.d("NearbyConnections", "NFC discovery stopped.");
        zzg();
    }

    final /* bridge */ /* synthetic */ void zzf(android.nfc.Tag tag) {
        android.content.Intent intent = new android.content.Intent("android.nfc.action.TAG_DISCOVERED");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("android.nfc.extra.TAG", tag);
        this.zzb.sendBroadcast(intent);
        android.util.Log.d("NearbyConnections", "Dispatching discovered NFC tag");
    }
}
