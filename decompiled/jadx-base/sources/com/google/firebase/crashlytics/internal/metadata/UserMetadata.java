package com.google.firebase.crashlytics.internal.metadata;

/* JADX INFO: loaded from: classes5.dex */
public class UserMetadata {
    public static final java.lang.String INTERNAL_KEYDATA_FILENAME = "internal-keys";
    public static final java.lang.String KEYDATA_FILENAME = "keys";
    public static final int MAX_ATTRIBUTES = 64;
    public static final int MAX_ATTRIBUTE_SIZE = 1024;
    public static final int MAX_INTERNAL_KEY_SIZE = 8192;
    public static final int MAX_ROLLOUT_ASSIGNMENTS = 128;
    public static final java.lang.String ROLLOUTS_STATE_FILENAME = "rollouts-state";
    public static final java.lang.String USERDATA_FILENAME = "user-data";
    private final com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers crashlyticsWorkers;
    private final com.google.firebase.crashlytics.internal.metadata.MetaDataStore metaDataStore;
    private java.lang.String sessionIdentifier;
    private final com.google.firebase.crashlytics.internal.metadata.UserMetadata.SerializeableKeysMap customKeys = new com.google.firebase.crashlytics.internal.metadata.UserMetadata.SerializeableKeysMap(false);
    private final com.google.firebase.crashlytics.internal.metadata.UserMetadata.SerializeableKeysMap internalKeys = new com.google.firebase.crashlytics.internal.metadata.UserMetadata.SerializeableKeysMap(true);
    private final com.google.firebase.crashlytics.internal.metadata.RolloutAssignmentList rolloutsState = new com.google.firebase.crashlytics.internal.metadata.RolloutAssignmentList(128);
    private final java.util.concurrent.atomic.AtomicMarkableReference<java.lang.String> userId = new java.util.concurrent.atomic.AtomicMarkableReference<>(null, false);

    public static java.lang.String readUserId(java.lang.String str, com.google.firebase.crashlytics.internal.persistence.FileStore fileStore) {
        return new com.google.firebase.crashlytics.internal.metadata.MetaDataStore(fileStore).readUserId(str);
    }

    public static com.google.firebase.crashlytics.internal.metadata.UserMetadata loadFromExistingSession(java.lang.String str, com.google.firebase.crashlytics.internal.persistence.FileStore fileStore, com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers crashlyticsWorkers) {
        com.google.firebase.crashlytics.internal.metadata.MetaDataStore metaDataStore = new com.google.firebase.crashlytics.internal.metadata.MetaDataStore(fileStore);
        com.google.firebase.crashlytics.internal.metadata.UserMetadata userMetadata = new com.google.firebase.crashlytics.internal.metadata.UserMetadata(str, fileStore, crashlyticsWorkers);
        userMetadata.customKeys.map.getReference().setKeys(metaDataStore.readKeyData(str, false));
        userMetadata.internalKeys.map.getReference().setKeys(metaDataStore.readKeyData(str, true));
        userMetadata.userId.set(metaDataStore.readUserId(str), false);
        userMetadata.rolloutsState.updateRolloutAssignmentList(metaDataStore.readRolloutsState(str));
        return userMetadata;
    }

    public UserMetadata(java.lang.String str, com.google.firebase.crashlytics.internal.persistence.FileStore fileStore, com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers crashlyticsWorkers) {
        this.sessionIdentifier = str;
        this.metaDataStore = new com.google.firebase.crashlytics.internal.metadata.MetaDataStore(fileStore);
        this.crashlyticsWorkers = crashlyticsWorkers;
    }

    public void setNewSession(final java.lang.String str) {
        synchronized (this.sessionIdentifier) {
            this.sessionIdentifier = str;
            final java.util.Map<java.lang.String, java.lang.String> keys = this.customKeys.getKeys();
            final java.util.List<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> rolloutAssignmentList = this.rolloutsState.getRolloutAssignmentList();
            this.crashlyticsWorkers.diskWrite.submit(new java.lang.Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.UserMetadata$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() throws java.lang.Throwable {
                    this.f$0.m846xeeb41fb7(str, keys, rolloutAssignmentList);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$setNewSession$0$com-google-firebase-crashlytics-internal-metadata-UserMetadata, reason: not valid java name */
    /* synthetic */ void m846xeeb41fb7(java.lang.String str, java.util.Map map, java.util.List list) throws java.lang.Throwable {
        if (getUserId() != null) {
            this.metaDataStore.writeUserData(str, getUserId());
        }
        if (!map.isEmpty()) {
            this.metaDataStore.writeKeyData(str, map);
        }
        if (list.isEmpty()) {
            return;
        }
        this.metaDataStore.writeRolloutState(str, list);
    }

    public java.lang.String getUserId() {
        return this.userId.getReference();
    }

    public void setUserId(java.lang.String str) {
        java.lang.String strSanitizeString = com.google.firebase.crashlytics.internal.metadata.KeysMap.sanitizeString(str, 1024);
        synchronized (this.userId) {
            if (com.google.firebase.crashlytics.internal.common.CommonUtils.nullSafeEquals(strSanitizeString, this.userId.getReference())) {
                return;
            }
            this.userId.set(strSanitizeString, true);
            this.crashlyticsWorkers.diskWrite.submit(new java.lang.Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.UserMetadata$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws java.lang.Throwable {
                    this.f$0.serializeUserDataIfNeeded();
                }
            });
        }
    }

    public java.util.Map<java.lang.String, java.lang.String> getCustomKeys(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map.isEmpty()) {
            return this.customKeys.getKeys();
        }
        java.util.HashMap map2 = new java.util.HashMap(this.customKeys.getKeys());
        int i = 0;
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            java.lang.String strSanitizeString = com.google.firebase.crashlytics.internal.metadata.KeysMap.sanitizeString(entry.getKey(), 1024);
            if (map2.size() < 64 || map2.containsKey(strSanitizeString)) {
                map2.put(strSanitizeString, com.google.firebase.crashlytics.internal.metadata.KeysMap.sanitizeString(entry.getValue(), 1024));
            } else {
                i++;
            }
        }
        if (i > 0) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024");
        }
        return java.util.Collections.unmodifiableMap(map2);
    }

    public java.util.Map<java.lang.String, java.lang.String> getCustomKeys() {
        return this.customKeys.getKeys();
    }

    public boolean setCustomKey(java.lang.String str, java.lang.String str2) {
        return this.customKeys.setKey(str, str2);
    }

    public void setCustomKeys(java.util.Map<java.lang.String, java.lang.String> map) {
        this.customKeys.setKeys(map);
    }

    public java.util.Map<java.lang.String, java.lang.String> getInternalKeys() {
        return this.internalKeys.getKeys();
    }

    public boolean setInternalKey(java.lang.String str, java.lang.String str2) {
        return this.internalKeys.setKey(str, str2);
    }

    public java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment> getRolloutsState() {
        return this.rolloutsState.getReportRolloutsState();
    }

    public boolean updateRolloutsState(java.util.List<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> list) {
        synchronized (this.rolloutsState) {
            if (!this.rolloutsState.updateRolloutAssignmentList(list)) {
                return false;
            }
            final java.util.List<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> rolloutAssignmentList = this.rolloutsState.getRolloutAssignmentList();
            this.crashlyticsWorkers.diskWrite.submit(new java.lang.Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.UserMetadata$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() throws java.lang.Throwable {
                    this.f$0.m847x8982b7e8(rolloutAssignmentList);
                }
            });
            return true;
        }
    }

    /* JADX INFO: renamed from: lambda$updateRolloutsState$1$com-google-firebase-crashlytics-internal-metadata-UserMetadata, reason: not valid java name */
    /* synthetic */ void m847x8982b7e8(java.util.List list) throws java.lang.Throwable {
        this.metaDataStore.writeRolloutState(this.sessionIdentifier, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serializeUserDataIfNeeded() throws java.lang.Throwable {
        boolean z;
        java.lang.String userId;
        synchronized (this.userId) {
            z = false;
            if (this.userId.isMarked()) {
                userId = getUserId();
                this.userId.set(userId, false);
                z = true;
            } else {
                userId = null;
            }
        }
        if (z) {
            this.metaDataStore.writeUserData(this.sessionIdentifier, userId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class SerializeableKeysMap {
        private final boolean isInternal;
        final java.util.concurrent.atomic.AtomicMarkableReference<com.google.firebase.crashlytics.internal.metadata.KeysMap> map;
        private final java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> queuedSerializer = new java.util.concurrent.atomic.AtomicReference<>(null);

        public SerializeableKeysMap(boolean z) {
            this.isInternal = z;
            this.map = new java.util.concurrent.atomic.AtomicMarkableReference<>(new com.google.firebase.crashlytics.internal.metadata.KeysMap(64, z ? 8192 : 1024), false);
        }

        public java.util.Map<java.lang.String, java.lang.String> getKeys() {
            return this.map.getReference().getKeys();
        }

        public boolean setKey(java.lang.String str, java.lang.String str2) {
            synchronized (this) {
                if (!this.map.getReference().setKey(str, str2)) {
                    return false;
                }
                java.util.concurrent.atomic.AtomicMarkableReference<com.google.firebase.crashlytics.internal.metadata.KeysMap> atomicMarkableReference = this.map;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                scheduleSerializationTaskIfNeeded();
                return true;
            }
        }

        public void setKeys(java.util.Map<java.lang.String, java.lang.String> map) {
            synchronized (this) {
                this.map.getReference().setKeys(map);
                java.util.concurrent.atomic.AtomicMarkableReference<com.google.firebase.crashlytics.internal.metadata.KeysMap> atomicMarkableReference = this.map;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
            }
            scheduleSerializationTaskIfNeeded();
        }

        private void scheduleSerializationTaskIfNeeded() {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.UserMetadata$SerializeableKeysMap$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws java.lang.Throwable {
                    this.f$0.m848xb9b680d3();
                }
            };
            if (kotlin.UByte$$ExternalSyntheticBackport0.m(this.queuedSerializer, null, runnable)) {
                com.google.firebase.crashlytics.internal.metadata.UserMetadata.this.crashlyticsWorkers.diskWrite.submit(runnable);
            }
        }

        /* JADX INFO: renamed from: lambda$scheduleSerializationTaskIfNeeded$0$com-google-firebase-crashlytics-internal-metadata-UserMetadata$SerializeableKeysMap, reason: not valid java name */
        /* synthetic */ void m848xb9b680d3() throws java.lang.Throwable {
            this.queuedSerializer.set(null);
            serializeIfMarked();
        }

        private void serializeIfMarked() throws java.lang.Throwable {
            java.util.Map<java.lang.String, java.lang.String> keys;
            synchronized (this) {
                if (this.map.isMarked()) {
                    keys = this.map.getReference().getKeys();
                    java.util.concurrent.atomic.AtomicMarkableReference<com.google.firebase.crashlytics.internal.metadata.KeysMap> atomicMarkableReference = this.map;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                } else {
                    keys = null;
                }
            }
            if (keys != null) {
                com.google.firebase.crashlytics.internal.metadata.UserMetadata.this.metaDataStore.writeKeyData(com.google.firebase.crashlytics.internal.metadata.UserMetadata.this.sessionIdentifier, keys, this.isInternal);
            }
        }
    }
}
