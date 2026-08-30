package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzo {
    private static final java.util.Map<com.google.android.gms.internal.nearby.zzn, com.google.android.gms.internal.nearby.zzo> zza = new androidx.collection.ArrayMap();
    private final java.util.Map<java.lang.String, java.util.Set<com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?>>> zzb = new androidx.collection.ArrayMap();
    private final java.util.Set<com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?>> zzc = new androidx.collection.ArraySet();
    private final java.util.Map<java.lang.String, java.lang.Object> zzd = new androidx.collection.ArrayMap();

    private zzo() {
    }

    public static synchronized com.google.android.gms.internal.nearby.zzo zza(com.google.android.gms.common.api.GoogleApi<?> googleApi, com.google.android.gms.common.api.Api.ApiOptions apiOptions) {
        com.google.android.gms.internal.nearby.zzn zznVar;
        java.util.Map<com.google.android.gms.internal.nearby.zzn, com.google.android.gms.internal.nearby.zzo> map;
        zznVar = new com.google.android.gms.internal.nearby.zzn(googleApi, null);
        map = zza;
        if (!map.containsKey(zznVar)) {
            map.put(zznVar, new com.google.android.gms.internal.nearby.zzo());
        }
        return map.get(zznVar);
    }

    private final java.lang.Object zzh(java.lang.String str) {
        if (!this.zzd.containsKey(str)) {
            this.zzd.put(str, new java.lang.Object());
        }
        return this.zzd.get(str);
    }

    public final synchronized <T> com.google.android.gms.common.api.internal.ListenerHolder<T> zzb(com.google.android.gms.common.api.GoogleApi googleApi, T t, java.lang.String str) {
        com.google.android.gms.common.api.internal.ListenerHolder<T> listenerHolderRegisterListener;
        listenerHolderRegisterListener = googleApi.registerListener(t, str);
        com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?> listenerKey = (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey) com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerHolderRegisterListener.getListenerKey(), "Key must not be null");
        java.util.Set<com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?>> arraySet = this.zzb.get(str);
        if (arraySet == null) {
            arraySet = new androidx.collection.ArraySet<>();
            this.zzb.put(str, arraySet);
        }
        arraySet.add(listenerKey);
        return listenerHolderRegisterListener;
    }

    public final synchronized com.google.android.gms.common.api.internal.ListenerHolder<java.lang.Object> zzc(com.google.android.gms.common.api.GoogleApi<?> googleApi, java.lang.String str, java.lang.String str2) {
        return zzb(googleApi, zzh(str), "connection");
    }

    public final synchronized com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<java.lang.Object> zzd(java.lang.String str, java.lang.String str2) {
        return com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(zzh(str), "connection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized com.google.android.gms.tasks.Task<java.lang.Void> zze(com.google.android.gms.common.api.GoogleApi<?> googleApi, com.google.android.gms.common.api.internal.RegistrationMethods<?, ?> registrationMethods) {
        com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?> listenerKey;
        listenerKey = (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey) com.google.android.gms.common.internal.Preconditions.checkNotNull(registrationMethods.register.getListenerKey(), "Key must not be null");
        this.zzc.add(listenerKey);
        return googleApi.doRegisterEventListener(registrationMethods).addOnFailureListener(new com.google.android.gms.internal.nearby.zzm(this, googleApi, listenerKey));
    }

    public final synchronized com.google.android.gms.tasks.Task<java.lang.Boolean> zzf(com.google.android.gms.common.api.GoogleApi<?> googleApi, com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?> listenerKey) {
        java.lang.String next;
        this.zzc.remove(listenerKey);
        java.util.Iterator<java.lang.String> it = this.zzb.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            java.util.Set<com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?>> set = this.zzb.get(next);
            if (set.contains(listenerKey)) {
                set.remove(listenerKey);
                break;
            }
        }
        if (next != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : this.zzd.entrySet()) {
                if (com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(entry.getValue(), next).equals(listenerKey)) {
                    this.zzd.remove(entry.getKey());
                    break;
                }
            }
        }
        return googleApi.doUnregisterEventListener(listenerKey);
    }

    public final synchronized com.google.android.gms.tasks.Task<java.lang.Void> zzg(com.google.android.gms.common.api.GoogleApi<?> googleApi, java.lang.String str) {
        androidx.collection.ArraySet arraySet = new androidx.collection.ArraySet();
        java.util.Set<com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?>> set = this.zzb.get(str);
        if (set == null) {
            return com.google.android.gms.tasks.Tasks.whenAll(arraySet);
        }
        for (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?> listenerKey : new androidx.collection.ArraySet(set)) {
            if (this.zzc.contains(listenerKey)) {
                arraySet.add(zzf(googleApi, listenerKey));
            }
        }
        this.zzb.remove(str);
        return com.google.android.gms.tasks.Tasks.whenAll(arraySet);
    }
}
