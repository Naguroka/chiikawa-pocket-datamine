package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
public class MultiInstanceInvalidationService extends android.app.Service {
    int mMaxClientId = 0;
    final java.util.HashMap<java.lang.Integer, java.lang.String> mClientNames = new java.util.HashMap<>();
    final android.os.RemoteCallbackList<androidx.room.IMultiInstanceInvalidationCallback> mCallbackList = new android.os.RemoteCallbackList<androidx.room.IMultiInstanceInvalidationCallback>() { // from class: androidx.room.MultiInstanceInvalidationService.1
        @Override // android.os.RemoteCallbackList
        public void onCallbackDied(androidx.room.IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, java.lang.Object obj) {
            androidx.room.MultiInstanceInvalidationService.this.mClientNames.remove(java.lang.Integer.valueOf(((java.lang.Integer) obj).intValue()));
        }
    };
    private final androidx.room.IMultiInstanceInvalidationService.Stub mBinder = new androidx.room.IMultiInstanceInvalidationService.Stub() { // from class: androidx.room.MultiInstanceInvalidationService.2
        @Override // androidx.room.IMultiInstanceInvalidationService
        public int registerCallback(androidx.room.IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, java.lang.String str) {
            if (str == null) {
                return 0;
            }
            synchronized (androidx.room.MultiInstanceInvalidationService.this.mCallbackList) {
                androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService = androidx.room.MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.mMaxClientId + 1;
                multiInstanceInvalidationService.mMaxClientId = i;
                if (androidx.room.MultiInstanceInvalidationService.this.mCallbackList.register(iMultiInstanceInvalidationCallback, java.lang.Integer.valueOf(i))) {
                    androidx.room.MultiInstanceInvalidationService.this.mClientNames.put(java.lang.Integer.valueOf(i), str);
                    return i;
                }
                androidx.room.MultiInstanceInvalidationService.this.mMaxClientId--;
                return 0;
            }
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public void unregisterCallback(androidx.room.IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i) {
            synchronized (androidx.room.MultiInstanceInvalidationService.this.mCallbackList) {
                androidx.room.MultiInstanceInvalidationService.this.mCallbackList.unregister(iMultiInstanceInvalidationCallback);
                androidx.room.MultiInstanceInvalidationService.this.mClientNames.remove(java.lang.Integer.valueOf(i));
            }
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public void broadcastInvalidation(int i, java.lang.String[] strArr) {
            synchronized (androidx.room.MultiInstanceInvalidationService.this.mCallbackList) {
                java.lang.String str = androidx.room.MultiInstanceInvalidationService.this.mClientNames.get(java.lang.Integer.valueOf(i));
                if (str == null) {
                    android.util.Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = androidx.room.MultiInstanceInvalidationService.this.mCallbackList.beginBroadcast();
                for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                    try {
                        int iIntValue = ((java.lang.Integer) androidx.room.MultiInstanceInvalidationService.this.mCallbackList.getBroadcastCookie(i2)).intValue();
                        java.lang.String str2 = androidx.room.MultiInstanceInvalidationService.this.mClientNames.get(java.lang.Integer.valueOf(iIntValue));
                        if (i != iIntValue && str.equals(str2)) {
                            try {
                                ((androidx.room.IMultiInstanceInvalidationCallback) androidx.room.MultiInstanceInvalidationService.this.mCallbackList.getBroadcastItem(i2)).onInvalidation(strArr);
                            } catch (android.os.RemoteException e) {
                                android.util.Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        androidx.room.MultiInstanceInvalidationService.this.mCallbackList.finishBroadcast();
                        throw th;
                    }
                }
                androidx.room.MultiInstanceInvalidationService.this.mCallbackList.finishBroadcast();
            }
        }
    };

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return this.mBinder;
    }
}
