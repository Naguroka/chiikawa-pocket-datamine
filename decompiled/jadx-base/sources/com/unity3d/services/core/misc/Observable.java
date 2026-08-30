package com.unity3d.services.core.misc;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Observable<T> {
    private final java.util.List<com.unity3d.services.core.misc.IObserver<T>> _observers = new java.util.ArrayList();

    public synchronized void registerObserver(com.unity3d.services.core.misc.IObserver<T> iObserver) {
        if (this._observers.contains(iObserver)) {
            return;
        }
        this._observers.add(iObserver);
    }

    public synchronized void unregisterObserver(com.unity3d.services.core.misc.IObserver<T> iObserver) {
        if (this._observers.contains(iObserver)) {
            this._observers.remove(iObserver);
        }
    }

    protected synchronized void notifyObservers(T t) {
        java.util.Iterator<com.unity3d.services.core.misc.IObserver<T>> it = this._observers.iterator();
        while (it.hasNext()) {
            it.next().updated(t);
        }
    }
}
