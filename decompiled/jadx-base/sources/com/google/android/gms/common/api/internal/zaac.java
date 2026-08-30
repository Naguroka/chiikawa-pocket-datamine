package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zaac {
    private final java.util.Map zaa = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());
    private final java.util.Map zab = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());

    private final void zah(boolean z, com.google.android.gms.common.api.Status status) {
        java.util.HashMap map;
        java.util.HashMap map2;
        synchronized (this.zaa) {
            map = new java.util.HashMap(this.zaa);
        }
        synchronized (this.zab) {
            map2 = new java.util.HashMap(this.zab);
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (z || ((java.lang.Boolean) entry.getValue()).booleanValue()) {
                ((com.google.android.gms.common.api.internal.BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (java.util.Map.Entry entry2 : map2.entrySet()) {
            if (z || ((java.lang.Boolean) entry2.getValue()).booleanValue()) {
                ((com.google.android.gms.tasks.TaskCompletionSource) entry2.getKey()).trySetException(new com.google.android.gms.common.api.ApiException(status));
            }
        }
    }

    final void zac(com.google.android.gms.common.api.internal.BasePendingResult basePendingResult, boolean z) {
        this.zaa.put(basePendingResult, java.lang.Boolean.valueOf(z));
        basePendingResult.addStatusListener(new com.google.android.gms.common.api.internal.zaaa(this, basePendingResult));
    }

    final void zad(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, boolean z) {
        this.zab.put(taskCompletionSource, java.lang.Boolean.valueOf(z));
        taskCompletionSource.getTask().addOnCompleteListener(new com.google.android.gms.common.api.internal.zaab(this, taskCompletionSource));
    }

    final void zae(int i, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        zah(true, new com.google.android.gms.common.api.Status(20, sb.toString()));
    }

    public final void zaf() {
        zah(false, com.google.android.gms.common.api.internal.GoogleApiManager.zaa);
    }

    final boolean zag() {
        return (this.zaa.isEmpty() && this.zab.isEmpty()) ? false : true;
    }
}
