package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class ListenerHolders {
    private final java.util.Set zaa = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    public static <L> com.google.android.gms.common.api.internal.ListenerHolder<L> createListenerHolder(L l, android.os.Looper looper, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(l, "Listener must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(looper, "Looper must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Listener type must not be null");
        return new com.google.android.gms.common.api.internal.ListenerHolder<>(looper, l, str);
    }

    public static <L> com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> createListenerKey(L l, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(l, "Listener must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Listener type must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Listener type must not be empty");
        return new com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<>(l, str);
    }

    public final com.google.android.gms.common.api.internal.ListenerHolder zaa(java.lang.Object obj, android.os.Looper looper, java.lang.String str) {
        java.util.Set set = this.zaa;
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolderCreateListenerHolder = createListenerHolder(obj, looper, "NO_TYPE");
        set.add(listenerHolderCreateListenerHolder);
        return listenerHolderCreateListenerHolder;
    }

    public final void zab() {
        java.util.Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.ListenerHolder) it.next()).clear();
        }
        this.zaa.clear();
    }

    public static <L> com.google.android.gms.common.api.internal.ListenerHolder<L> createListenerHolder(L l, java.util.concurrent.Executor executor, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(l, "Listener must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(executor, "Executor must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Listener type must not be null");
        return new com.google.android.gms.common.api.internal.ListenerHolder<>(executor, l, str);
    }
}
