package androidx.localbroadcastmanager.content;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class LocalBroadcastManager {
    private static final boolean DEBUG = false;
    static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final java.lang.String TAG = "LocalBroadcastManager";
    private static androidx.localbroadcastmanager.content.LocalBroadcastManager mInstance;
    private static final java.lang.Object mLock = new java.lang.Object();
    private final android.content.Context mAppContext;
    private final android.os.Handler mHandler;
    private final java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord>> mReceivers = new java.util.HashMap<>();
    private final java.util.HashMap<java.lang.String, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord>> mActions = new java.util.HashMap<>();
    private final java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.BroadcastRecord> mPendingBroadcasts = new java.util.ArrayList<>();

    private static final class ReceiverRecord {
        boolean broadcasting;
        boolean dead;
        final android.content.IntentFilter filter;
        final android.content.BroadcastReceiver receiver;

        ReceiverRecord(android.content.IntentFilter intentFilter, android.content.BroadcastReceiver broadcastReceiver) {
            this.filter = intentFilter;
            this.receiver = broadcastReceiver;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.receiver);
            sb.append(" filter=");
            sb.append(this.filter);
            if (this.dead) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private static final class BroadcastRecord {
        final android.content.Intent intent;
        final java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord> receivers;

        BroadcastRecord(android.content.Intent intent, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord> arrayList) {
            this.intent = intent;
            this.receivers = arrayList;
        }
    }

    public static androidx.localbroadcastmanager.content.LocalBroadcastManager getInstance(android.content.Context context) {
        androidx.localbroadcastmanager.content.LocalBroadcastManager localBroadcastManager;
        synchronized (mLock) {
            if (mInstance == null) {
                mInstance = new androidx.localbroadcastmanager.content.LocalBroadcastManager(context.getApplicationContext());
            }
            localBroadcastManager = mInstance;
        }
        return localBroadcastManager;
    }

    private LocalBroadcastManager(android.content.Context context) {
        this.mAppContext = context;
        this.mHandler = new android.os.Handler(context.getMainLooper()) { // from class: androidx.localbroadcastmanager.content.LocalBroadcastManager.1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message message) {
                if (message.what == 1) {
                    androidx.localbroadcastmanager.content.LocalBroadcastManager.this.executePendingBroadcasts();
                } else {
                    super.handleMessage(message);
                }
            }
        };
    }

    public void registerReceiver(android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter) {
        synchronized (this.mReceivers) {
            androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord receiverRecord = new androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord(intentFilter, broadcastReceiver);
            java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord> arrayList = this.mReceivers.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList<>(1);
                this.mReceivers.put(broadcastReceiver, arrayList);
            }
            arrayList.add(receiverRecord);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                java.lang.String action = intentFilter.getAction(i);
                java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord> arrayList2 = this.mActions.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList<>(1);
                    this.mActions.put(action, arrayList2);
                }
                arrayList2.add(receiverRecord);
            }
        }
    }

    public void unregisterReceiver(android.content.BroadcastReceiver broadcastReceiver) {
        synchronized (this.mReceivers) {
            java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord> arrayListRemove = this.mReceivers.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord receiverRecord = arrayListRemove.get(size);
                receiverRecord.dead = true;
                for (int i = 0; i < receiverRecord.filter.countActions(); i++) {
                    java.lang.String action = receiverRecord.filter.getAction(i);
                    java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord> arrayList = this.mActions.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord receiverRecord2 = arrayList.get(size2);
                            if (receiverRecord2.receiver == broadcastReceiver) {
                                receiverRecord2.dead = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.mActions.remove(action);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean sendBroadcast(android.content.Intent intent) {
        boolean z;
        java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord> arrayList;
        int i;
        java.lang.String str;
        boolean z2;
        java.lang.String str2;
        synchronized (this.mReceivers) {
            java.lang.String action = intent.getAction();
            java.lang.String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.mAppContext.getContentResolver());
            android.net.Uri data = intent.getData();
            java.lang.String scheme = intent.getScheme();
            java.util.Set<java.lang.String> categories = intent.getCategories();
            boolean z3 = true;
            java.lang.Object[] objArr = (intent.getFlags() & 8) != 0;
            if (objArr != false) {
                android.util.Log.v(TAG, "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord> arrayList2 = this.mActions.get(intent.getAction());
            if (arrayList2 != null) {
                if (objArr != false) {
                    android.util.Log.v(TAG, "Action list: " + arrayList2);
                }
                java.util.ArrayList arrayList3 = null;
                int i2 = 0;
                while (i2 < arrayList2.size()) {
                    androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord receiverRecord = arrayList2.get(i2);
                    if (objArr != false) {
                        android.util.Log.v(TAG, "Matching against filter " + receiverRecord.filter);
                    }
                    if (receiverRecord.broadcasting) {
                        if (objArr != false) {
                            android.util.Log.v(TAG, "  Filter's target already added");
                        }
                        arrayList = arrayList2;
                        i = i2;
                        str = action;
                        z2 = z3;
                    } else {
                        java.lang.String str3 = action;
                        arrayList = arrayList2;
                        i = i2;
                        str = action;
                        z2 = z3;
                        int iMatch = receiverRecord.filter.match(str3, strResolveTypeIfNeeded, scheme, data, categories, TAG);
                        if (iMatch >= 0) {
                            if (objArr != false) {
                                android.util.Log.v(TAG, "  Filter matched!  match=0x" + java.lang.Integer.toHexString(iMatch));
                            }
                            if (arrayList3 == null) {
                                arrayList3 = new java.util.ArrayList();
                            }
                            arrayList3.add(receiverRecord);
                            receiverRecord.broadcasting = z2;
                        } else if (objArr != false) {
                            if (iMatch == -4) {
                                str2 = "category";
                            } else if (iMatch == -3) {
                                str2 = "action";
                            } else if (iMatch != -2) {
                                str2 = iMatch != -1 ? "unknown reason" : "type";
                            } else {
                                str2 = "data";
                            }
                            android.util.Log.v(TAG, "  Filter did not match: " + str2);
                        }
                    }
                    i2 = i + 1;
                    z3 = z2;
                    arrayList2 = arrayList;
                    action = str;
                }
                boolean z4 = z3;
                if (arrayList3 != null) {
                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                        ((androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord) arrayList3.get(i3)).broadcasting = false;
                    }
                    this.mPendingBroadcasts.add(new androidx.localbroadcastmanager.content.LocalBroadcastManager.BroadcastRecord(intent, arrayList3));
                    if (!this.mHandler.hasMessages(z4 ? 1 : 0)) {
                        this.mHandler.sendEmptyMessage(z4 ? 1 : 0);
                    }
                    return z4;
                }
                z = false;
            } else {
                z = false;
            }
            return z;
        }
    }

    public void sendBroadcastSync(android.content.Intent intent) {
        if (sendBroadcast(intent)) {
            executePendingBroadcasts();
        }
    }

    void executePendingBroadcasts() {
        int size;
        androidx.localbroadcastmanager.content.LocalBroadcastManager.BroadcastRecord[] broadcastRecordArr;
        while (true) {
            synchronized (this.mReceivers) {
                size = this.mPendingBroadcasts.size();
                if (size <= 0) {
                    return;
                }
                broadcastRecordArr = new androidx.localbroadcastmanager.content.LocalBroadcastManager.BroadcastRecord[size];
                this.mPendingBroadcasts.toArray(broadcastRecordArr);
                this.mPendingBroadcasts.clear();
            }
            for (int i = 0; i < size; i++) {
                androidx.localbroadcastmanager.content.LocalBroadcastManager.BroadcastRecord broadcastRecord = broadcastRecordArr[i];
                int size2 = broadcastRecord.receivers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord receiverRecord = broadcastRecord.receivers.get(i2);
                    if (!receiverRecord.dead) {
                        receiverRecord.receiver.onReceive(this.mAppContext, broadcastRecord.intent);
                    }
                }
            }
        }
    }
}
