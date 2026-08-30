package com.unity3d.scar.adapter.common.signals;

/* JADX INFO: loaded from: classes6.dex */
public class SignalsStorage<T> {
    private final java.util.Map<java.lang.String, T> _queryInfoMap = new java.util.concurrent.ConcurrentHashMap();

    public T getQueryInfo(java.lang.String str) {
        return this._queryInfoMap.get(str);
    }

    public void put(java.lang.String str, T t) {
        this._queryInfoMap.put(str, t);
    }
}
