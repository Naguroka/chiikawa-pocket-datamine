package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzc {
    private final java.util.Map zza = java.util.Collections.synchronizedMap(new androidx.collection.ArrayMap());
    private int zzb = 0;
    private android.os.Bundle zzc;

    zzc() {
    }

    final com.google.android.gms.common.api.internal.LifecycleCallback zzc(java.lang.String str, java.lang.Class cls) {
        return (com.google.android.gms.common.api.internal.LifecycleCallback) cls.cast(this.zza.get(str));
    }

    final void zzd(java.lang.String str, com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback) {
        if (this.zza.containsKey(str)) {
            throw new java.lang.IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.zza.put(str, lifecycleCallback);
        if (this.zzb > 0) {
            new com.google.android.gms.internal.common.zzh(android.os.Looper.getMainLooper()).post(new com.google.android.gms.common.api.internal.zzb(this, lifecycleCallback, str));
        }
    }

    final void zze(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        java.util.Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    final void zzf(int i, int i2, android.content.Intent intent) {
        java.util.Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).onActivityResult(i, i2, intent);
        }
    }

    final void zzg(android.os.Bundle bundle) {
        this.zzb = 1;
        this.zzc = bundle;
        for (java.util.Map.Entry entry : this.zza.entrySet()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((java.lang.String) entry.getKey()) : null);
        }
    }

    final void zzh() {
        this.zzb = 5;
        java.util.Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).onDestroy();
        }
    }

    final void zzi() {
        this.zzb = 3;
        java.util.Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).onResume();
        }
    }

    final void zzj(android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (java.util.Map.Entry entry : this.zza.entrySet()) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            ((com.google.android.gms.common.api.internal.LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((java.lang.String) entry.getKey(), bundle2);
        }
    }

    final void zzk() {
        this.zzb = 2;
        java.util.Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).onStart();
        }
    }

    final void zzl() {
        this.zzb = 4;
        java.util.Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).onStop();
        }
    }

    final boolean zzm() {
        return this.zzb > 0;
    }

    final boolean zzn() {
        return this.zzb >= 2;
    }
}
