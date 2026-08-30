package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: loaded from: classes4.dex */
@javax.inject.Singleton
public class SQLiteEventStore implements com.google.android.datatransport.runtime.scheduling.persistence.EventStore, com.google.android.datatransport.runtime.synchronization.SynchronizationGuard, com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore {
    private static final int LOCK_RETRY_BACK_OFF_MILLIS = 50;
    private static final java.lang.String LOG_TAG = "SQLiteEventStore";
    static final int MAX_RETRIES = 16;
    private static final com.google.android.datatransport.Encoding PROTOBUF_ENCODING = com.google.android.datatransport.Encoding.of("proto");
    private final com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig config;
    private final com.google.android.datatransport.runtime.time.Clock monotonicClock;
    private final javax.inject.Provider<java.lang.String> packageName;
    private final com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager schemaManager;
    private final com.google.android.datatransport.runtime.time.Clock wallClock;

    interface Function<T, U> {
        U apply(T t);
    }

    interface Producer<T> {
        T produce();
    }

    @javax.inject.Inject
    SQLiteEventStore(com.google.android.datatransport.runtime.time.Clock clock, com.google.android.datatransport.runtime.time.Clock clock2, com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig eventStoreConfig, com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager schemaManager, @javax.inject.Named("PACKAGE_NAME") javax.inject.Provider<java.lang.String> provider) {
        this.schemaManager = schemaManager;
        this.wallClock = clock;
        this.monotonicClock = clock2;
        this.config = eventStoreConfig;
        this.packageName = provider;
    }

    android.database.sqlite.SQLiteDatabase getDb() {
        final com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager schemaManager = this.schemaManager;
        java.util.Objects.requireNonNull(schemaManager);
        return (android.database.sqlite.SQLiteDatabase) retryIfDbLocked(new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda2
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer
            public final java.lang.Object produce() {
                return schemaManager.getWritableDatabase();
            }
        }, new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda3
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.lambda$getDb$0((java.lang.Throwable) obj);
            }
        });
    }

    static /* synthetic */ android.database.sqlite.SQLiteDatabase lambda$getDb$0(java.lang.Throwable th) {
        throw new com.google.android.datatransport.runtime.synchronization.SynchronizationException("Timed out while trying to open db.", th);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent persist(final com.google.android.datatransport.runtime.TransportContext transportContext, final com.google.android.datatransport.runtime.EventInternal eventInternal) {
        com.google.android.datatransport.runtime.logging.Logging.d(LOG_TAG, "Storing event with priority=%s, name=%s for destination %s", transportContext.getPriority(), eventInternal.getTransportName(), transportContext.getBackendName());
        long jLongValue = ((java.lang.Long) inTransaction(new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda27
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f$0.m765x42ac2bf1(eventInternal, transportContext, (android.database.sqlite.SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent.create(jLongValue, transportContext, eventInternal);
    }

    /* JADX INFO: renamed from: lambda$persist$1$com-google-android-datatransport-runtime-scheduling-persistence-SQLiteEventStore, reason: not valid java name */
    /* synthetic */ java.lang.Long m765x42ac2bf1(com.google.android.datatransport.runtime.EventInternal eventInternal, com.google.android.datatransport.runtime.TransportContext transportContext, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (isStorageAtLimit()) {
            recordLogEventDropped(1L, com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.CACHE_FULL, eventInternal.getTransportName());
            return -1L;
        }
        long jEnsureTransportContext = ensureTransportContext(sQLiteDatabase, transportContext);
        int maxBlobByteSizePerRow = this.config.getMaxBlobByteSizePerRow();
        byte[] bytes = eventInternal.getEncodedPayload().getBytes();
        boolean z = bytes.length <= maxBlobByteSizePerRow;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("context_id", java.lang.Long.valueOf(jEnsureTransportContext));
        contentValues.put("transport_name", eventInternal.getTransportName());
        contentValues.put("timestamp_ms", java.lang.Long.valueOf(eventInternal.getEventMillis()));
        contentValues.put("uptime_ms", java.lang.Long.valueOf(eventInternal.getUptimeMillis()));
        contentValues.put("payload_encoding", eventInternal.getEncodedPayload().getEncoding().getName());
        contentValues.put("code", eventInternal.getCode());
        contentValues.put("num_attempts", (java.lang.Integer) 0);
        contentValues.put("inline", java.lang.Boolean.valueOf(z));
        contentValues.put("payload", z ? bytes : new byte[0]);
        contentValues.put("product_id", eventInternal.getProductId());
        contentValues.put("pseudonymous_id", eventInternal.getPseudonymousId());
        contentValues.put("experiment_ids_clear_blob", eventInternal.getExperimentIdsClear());
        contentValues.put("experiment_ids_encrypted_blob", eventInternal.getExperimentIdsEncrypted());
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            int iCeil = (int) java.lang.Math.ceil(((double) bytes.length) / ((double) maxBlobByteSizePerRow));
            for (int i = 1; i <= iCeil; i++) {
                byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bytes, (i - 1) * maxBlobByteSizePerRow, java.lang.Math.min(i * maxBlobByteSizePerRow, bytes.length));
                android.content.ContentValues contentValues2 = new android.content.ContentValues();
                contentValues2.put("event_id", java.lang.Long.valueOf(jInsert));
                contentValues2.put("sequence_num", java.lang.Integer.valueOf(i));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : eventInternal.getMetadata().entrySet()) {
            android.content.ContentValues contentValues3 = new android.content.ContentValues();
            contentValues3.put("event_id", java.lang.Long.valueOf(jInsert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return java.lang.Long.valueOf(jInsert);
    }

    private long ensureTransportContext(android.database.sqlite.SQLiteDatabase sQLiteDatabase, com.google.android.datatransport.runtime.TransportContext transportContext) {
        java.lang.Long transportContextId = getTransportContextId(sQLiteDatabase, transportContext);
        if (transportContextId != null) {
            return transportContextId.longValue();
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("backend_name", transportContext.getBackendName());
        contentValues.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, java.lang.Integer.valueOf(com.google.android.datatransport.runtime.util.PriorityMapping.toInt(transportContext.getPriority())));
        contentValues.put("next_request_ms", (java.lang.Integer) 0);
        if (transportContext.getExtras() != null) {
            contentValues.put("extras", android.util.Base64.encodeToString(transportContext.getExtras(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private java.lang.Long getTransportContextId(android.database.sqlite.SQLiteDatabase sQLiteDatabase, com.google.android.datatransport.runtime.TransportContext transportContext) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("backend_name = ? and priority = ?");
        java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(transportContext.getBackendName(), java.lang.String.valueOf(com.google.android.datatransport.runtime.util.PriorityMapping.toInt(transportContext.getPriority()))));
        if (transportContext.getExtras() != null) {
            sb.append(" and extras = ?");
            arrayList.add(android.util.Base64.encodeToString(transportContext.getExtras(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (java.lang.Long) tryWithCursor(sQLiteDatabase.query("transport_contexts", new java.lang.String[]{"_id"}, sb.toString(), (java.lang.String[]) arrayList.toArray(new java.lang.String[0]), null, null, null), new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda19
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.lambda$getTransportContextId$2((android.database.Cursor) obj);
            }
        });
    }

    static /* synthetic */ java.lang.Long lambda$getTransportContextId$2(android.database.Cursor cursor) {
        if (cursor.moveToNext()) {
            return java.lang.Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordFailure(java.lang.Iterable<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> iterable) {
        if (iterable.iterator().hasNext()) {
            final java.lang.String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + toIdList(iterable);
            final java.lang.String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            inTransaction(new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda16
                @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return this.f$0.m767x9f560649(str, str2, (android.database.sqlite.SQLiteDatabase) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$recordFailure$4$com-google-android-datatransport-runtime-scheduling-persistence-SQLiteEventStore, reason: not valid java name */
    /* synthetic */ java.lang.Object m767x9f560649(java.lang.String str, java.lang.String str2, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        tryWithCursor(sQLiteDatabase.rawQuery(str2, null), new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda5
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f$0.m766x70a49c2a((android.database.Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: renamed from: lambda$recordFailure$3$com-google-android-datatransport-runtime-scheduling-persistence-SQLiteEventStore, reason: not valid java name */
    /* synthetic */ java.lang.Object m766x70a49c2a(android.database.Cursor cursor) {
        while (cursor.moveToNext()) {
            recordLogEventDropped(cursor.getInt(0), com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordSuccess(java.lang.Iterable<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> iterable) {
        if (iterable.iterator().hasNext()) {
            getDb().compileStatement("DELETE FROM events WHERE _id in " + toIdList(iterable)).execute();
        }
    }

    private static java.lang.String toIdList(java.lang.Iterable<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> iterable) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        java.util.Iterator<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().getId());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public long getNextCallTime(com.google.android.datatransport.runtime.TransportContext transportContext) {
        return ((java.lang.Long) tryWithCursor(getDb().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new java.lang.String[]{transportContext.getBackendName(), java.lang.String.valueOf(com.google.android.datatransport.runtime.util.PriorityMapping.toInt(transportContext.getPriority()))}), new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda4
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.lambda$getNextCallTime$5((android.database.Cursor) obj);
            }
        })).longValue();
    }

    static /* synthetic */ java.lang.Long lambda$getNextCallTime$5(android.database.Cursor cursor) {
        if (cursor.moveToNext()) {
            return java.lang.Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public boolean hasPendingEventsFor(final com.google.android.datatransport.runtime.TransportContext transportContext) {
        return ((java.lang.Boolean) inTransaction(new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda26
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f$0.m760xca7e02ad(transportContext, (android.database.sqlite.SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    /* JADX INFO: renamed from: lambda$hasPendingEventsFor$6$com-google-android-datatransport-runtime-scheduling-persistence-SQLiteEventStore, reason: not valid java name */
    /* synthetic */ java.lang.Boolean m760xca7e02ad(com.google.android.datatransport.runtime.TransportContext transportContext, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        java.lang.Long transportContextId = getTransportContextId(sQLiteDatabase, transportContext);
        if (transportContextId == null) {
            return false;
        }
        return (java.lang.Boolean) tryWithCursor(getDb().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new java.lang.String[]{transportContextId.toString()}), new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda13
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(((android.database.Cursor) obj).moveToNext());
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordNextCallTime(final com.google.android.datatransport.runtime.TransportContext transportContext, final long j) {
        inTransaction(new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda6
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.lambda$recordNextCallTime$7(j, transportContext, (android.database.sqlite.SQLiteDatabase) obj);
            }
        });
    }

    static /* synthetic */ java.lang.Object lambda$recordNextCallTime$7(long j, com.google.android.datatransport.runtime.TransportContext transportContext, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("next_request_ms", java.lang.Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new java.lang.String[]{transportContext.getBackendName(), java.lang.String.valueOf(com.google.android.datatransport.runtime.util.PriorityMapping.toInt(transportContext.getPriority()))}) < 1) {
            contentValues.put("backend_name", transportContext.getBackendName());
            contentValues.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, java.lang.Integer.valueOf(com.google.android.datatransport.runtime.util.PriorityMapping.toInt(transportContext.getPriority())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public java.lang.Iterable<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> loadBatch(final com.google.android.datatransport.runtime.TransportContext transportContext) {
        return (java.lang.Iterable) inTransaction(new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda14
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f$0.m761x21bf8b6a(transportContext, (android.database.sqlite.SQLiteDatabase) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$loadBatch$8$com-google-android-datatransport-runtime-scheduling-persistence-SQLiteEventStore, reason: not valid java name */
    /* synthetic */ java.util.List m761x21bf8b6a(com.google.android.datatransport.runtime.TransportContext transportContext, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        java.util.List<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> listLoadEvents = loadEvents(sQLiteDatabase, transportContext, this.config.getLoadBatchSize());
        for (com.google.android.datatransport.Priority priority : com.google.android.datatransport.Priority.values()) {
            if (priority != transportContext.getPriority()) {
                int loadBatchSize = this.config.getLoadBatchSize() - listLoadEvents.size();
                if (loadBatchSize <= 0) {
                    break;
                }
                listLoadEvents.addAll(loadEvents(sQLiteDatabase, transportContext.withPriority(priority), loadBatchSize));
            }
        }
        return join(listLoadEvents, loadMetadata(sQLiteDatabase, listLoadEvents));
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public java.lang.Iterable<com.google.android.datatransport.runtime.TransportContext> loadActiveContexts() {
        return (java.lang.Iterable) inTransaction(new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda24
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.lambda$loadActiveContexts$10((android.database.sqlite.SQLiteDatabase) obj);
            }
        });
    }

    static /* synthetic */ java.util.List lambda$loadActiveContexts$10(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        return (java.util.List) tryWithCursor(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new java.lang.String[0]), new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda15
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.lambda$loadActiveContexts$9((android.database.Cursor) obj);
            }
        });
    }

    static /* synthetic */ java.util.List lambda$loadActiveContexts$9(android.database.Cursor cursor) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(com.google.android.datatransport.runtime.TransportContext.builder().setBackendName(cursor.getString(1)).setPriority(com.google.android.datatransport.runtime.util.PriorityMapping.valueOf(cursor.getInt(2))).setExtras(maybeBase64Decode(cursor.getString(3))).build());
        }
        return arrayList;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public int cleanUp() {
        final long time = this.wallClock.getTime() - this.config.getEventCleanUpAge();
        return ((java.lang.Integer) inTransaction(new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda9
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f$0.m759xf6f3aef7(time, (android.database.sqlite.SQLiteDatabase) obj);
            }
        })).intValue();
    }

    /* JADX INFO: renamed from: lambda$cleanUp$12$com-google-android-datatransport-runtime-scheduling-persistence-SQLiteEventStore, reason: not valid java name */
    /* synthetic */ java.lang.Integer m759xf6f3aef7(long j, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        java.lang.String[] strArr = {java.lang.String.valueOf(j)};
        tryWithCursor(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda17
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f$0.m758xc84244d8((android.database.Cursor) obj);
            }
        });
        return java.lang.Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: renamed from: lambda$cleanUp$11$com-google-android-datatransport-runtime-scheduling-persistence-SQLiteEventStore, reason: not valid java name */
    /* synthetic */ java.lang.Object m758xc84244d8(android.database.Cursor cursor) {
        while (cursor.moveToNext()) {
            recordLogEventDropped(cursor.getInt(0), com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.schemaManager.close();
    }

    public void clearDb() {
        inTransaction(new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.lambda$clearDb$13((android.database.sqlite.SQLiteDatabase) obj);
            }
        });
    }

    static /* synthetic */ java.lang.Object lambda$clearDb$13(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("events", null, new java.lang.String[0]);
        sQLiteDatabase.delete("transport_contexts", null, new java.lang.String[0]);
        return null;
    }

    private static byte[] maybeBase64Decode(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return android.util.Base64.decode(str, 0);
    }

    private java.util.List<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> loadEvents(android.database.sqlite.SQLiteDatabase sQLiteDatabase, final com.google.android.datatransport.runtime.TransportContext transportContext, int i) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Long transportContextId = getTransportContextId(sQLiteDatabase, transportContext);
        if (transportContextId == null) {
            return arrayList;
        }
        tryWithCursor(sQLiteDatabase.query("events", new java.lang.String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new java.lang.String[]{transportContextId.toString()}, null, null, null, java.lang.String.valueOf(i)), new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda8
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f$0.m764x1b337a6a(arrayList, transportContext, (android.database.Cursor) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: lambda$loadEvents$14$com-google-android-datatransport-runtime-scheduling-persistence-SQLiteEventStore, reason: not valid java name */
    /* synthetic */ java.lang.Object m764x1b337a6a(java.util.List list, com.google.android.datatransport.runtime.TransportContext transportContext, android.database.Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            com.google.android.datatransport.runtime.EventInternal.Builder uptimeMillis = com.google.android.datatransport.runtime.EventInternal.builder().setTransportName(cursor.getString(1)).setEventMillis(cursor.getLong(2)).setUptimeMillis(cursor.getLong(3));
            if (z) {
                uptimeMillis.setEncodedPayload(new com.google.android.datatransport.runtime.EncodedPayload(toEncoding(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                uptimeMillis.setEncodedPayload(new com.google.android.datatransport.runtime.EncodedPayload(toEncoding(cursor.getString(4)), readPayload(j)));
            }
            if (!cursor.isNull(6)) {
                uptimeMillis.setCode(java.lang.Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                uptimeMillis.setProductId(java.lang.Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                uptimeMillis.setPseudonymousId(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                uptimeMillis.setExperimentIdsClear(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                uptimeMillis.setExperimentIdsEncrypted(cursor.getBlob(11));
            }
            list.add(com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent.create(j, transportContext, uptimeMillis.build()));
        }
        return null;
    }

    private byte[] readPayload(long j) {
        return (byte[]) tryWithCursor(getDb().query("event_payloads", new java.lang.String[]{"bytes"}, "event_id = ?", new java.lang.String[]{java.lang.String.valueOf(j)}, null, null, "sequence_num"), new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda20
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.lambda$readPayload$15((android.database.Cursor) obj);
            }
        });
    }

    static /* synthetic */ byte[] lambda$readPayload$15(android.database.Cursor cursor) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            byte[] bArr2 = (byte[]) arrayList.get(i);
            java.lang.System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    private static com.google.android.datatransport.Encoding toEncoding(java.lang.String str) {
        if (str == null) {
            return PROTOBUF_ENCODING;
        }
        return com.google.android.datatransport.Encoding.of(str);
    }

    private java.util.Map<java.lang.Long, java.util.Set<com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Metadata>> loadMetadata(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.util.List<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> list) {
        final java.util.HashMap map = new java.util.HashMap();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).getId());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        tryWithCursor(sQLiteDatabase.query("event_metadata", new java.lang.String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda11
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.lambda$loadMetadata$16(map, (android.database.Cursor) obj);
            }
        });
        return map;
    }

    static /* synthetic */ java.lang.Object lambda$loadMetadata$16(java.util.Map map, android.database.Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j = cursor.getLong(0);
            java.util.Set hashSet = (java.util.Set) map.get(java.lang.Long.valueOf(j));
            if (hashSet == null) {
                hashSet = new java.util.HashSet();
                map.put(java.lang.Long.valueOf(j), hashSet);
            }
            hashSet.add(new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Metadata(cursor.getString(1), cursor.getString(2)));
        }
    }

    private java.util.List<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> join(java.util.List<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> list, java.util.Map<java.lang.Long, java.util.Set<com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Metadata>> map) {
        java.util.ListIterator<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent next = listIterator.next();
            if (map.containsKey(java.lang.Long.valueOf(next.getId()))) {
                com.google.android.datatransport.runtime.EventInternal.Builder builder = next.getEvent().toBuilder();
                for (com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Metadata metadata : map.get(java.lang.Long.valueOf(next.getId()))) {
                    builder.addMetadata(metadata.key, metadata.value);
                }
                listIterator.set(com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent.create(next.getId(), next.getTransportContext(), builder.build()));
            }
        }
        return list;
    }

    private <T> T retryIfDbLocked(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer<T> producer, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function<java.lang.Throwable, T> function) {
        long time = this.monotonicClock.getTime();
        while (true) {
            try {
                return producer.produce();
            } catch (android.database.sqlite.SQLiteDatabaseLockedException e) {
                if (this.monotonicClock.getTime() >= ((long) this.config.getCriticalSectionEnterTimeoutMs()) + time) {
                    return function.apply(e);
                }
                android.os.SystemClock.sleep(50L);
            }
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public void recordLogEventDropped(final long j, final com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason reason, final java.lang.String str) {
        inTransaction(new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.lambda$recordLogEventDropped$18(str, reason, j, (android.database.sqlite.SQLiteDatabase) obj);
            }
        });
    }

    static /* synthetic */ java.lang.Object lambda$recordLogEventDropped$18(java.lang.String str, com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason reason, long j, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (!((java.lang.Boolean) tryWithCursor(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new java.lang.String[]{str, java.lang.Integer.toString(reason.getNumber())}), new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda25
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(((android.database.Cursor) obj).getCount() > 0);
            }
        })).booleanValue()) {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", java.lang.Integer.valueOf(reason.getNumber()));
            contentValues.put("events_dropped_count", java.lang.Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new java.lang.String[]{str, java.lang.Integer.toString(reason.getNumber())});
        }
        return null;
    }

    private com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason convertToReason(int i) {
        if (i == com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.REASON_UNKNOWN.getNumber()) {
            return com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.REASON_UNKNOWN;
        }
        if (i == com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.MESSAGE_TOO_OLD.getNumber()) {
            return com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.MESSAGE_TOO_OLD;
        }
        if (i == com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.CACHE_FULL.getNumber()) {
            return com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.CACHE_FULL;
        }
        if (i == com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.PAYLOAD_TOO_BIG.getNumber()) {
            return com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.PAYLOAD_TOO_BIG;
        }
        if (i == com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.MAX_RETRIES_REACHED.getNumber()) {
            return com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.MAX_RETRIES_REACHED;
        }
        if (i == com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.INVALID_PAYLOD.getNumber()) {
            return com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.INVALID_PAYLOD;
        }
        if (i == com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.SERVER_ERROR.getNumber()) {
            return com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.SERVER_ERROR;
        }
        com.google.android.datatransport.runtime.logging.Logging.d(LOG_TAG, "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", java.lang.Integer.valueOf(i));
        return com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.REASON_UNKNOWN;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public com.google.android.datatransport.runtime.firebase.transport.ClientMetrics loadClientMetrics() {
        final com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder builderNewBuilder = com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.newBuilder();
        final java.util.HashMap map = new java.util.HashMap();
        final java.lang.String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (com.google.android.datatransport.runtime.firebase.transport.ClientMetrics) inTransaction(new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda21
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f$0.m763xdd9aea28(str, map, builderNewBuilder, (android.database.sqlite.SQLiteDatabase) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$loadClientMetrics$20$com-google-android-datatransport-runtime-scheduling-persistence-SQLiteEventStore, reason: not valid java name */
    /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.ClientMetrics m763xdd9aea28(java.lang.String str, final java.util.Map map, final com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder builder, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        return (com.google.android.datatransport.runtime.firebase.transport.ClientMetrics) tryWithCursor(sQLiteDatabase.rawQuery(str, new java.lang.String[0]), new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda23
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f$0.m762xda5bcb7e(map, builder, (android.database.Cursor) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$loadClientMetrics$19$com-google-android-datatransport-runtime-scheduling-persistence-SQLiteEventStore, reason: not valid java name */
    /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.ClientMetrics m762xda5bcb7e(java.util.Map map, com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder builder, android.database.Cursor cursor) {
        while (cursor.moveToNext()) {
            java.lang.String string = cursor.getString(0);
            com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason reasonConvertToReason = convertToReason(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new java.util.ArrayList());
            }
            ((java.util.List) map.get(string)).add(com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.newBuilder().setReason(reasonConvertToReason).setEventsDroppedCount(j).build());
        }
        populateLogSourcesMetrics(builder, map);
        return builder.setWindow(getTimeWindow()).setGlobalMetrics(getGlobalMetrics()).setAppNamespace(this.packageName.get()).build();
    }

    private void populateLogSourcesMetrics(com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder builder, java.util.Map<java.lang.String, java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogEventDropped>> map) {
        for (java.util.Map.Entry<java.lang.String, java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogEventDropped>> entry : map.entrySet()) {
            builder.addLogSourceMetrics(com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics.newBuilder().setLogSource(entry.getKey()).setLogEventDroppedList(entry.getValue()).build());
        }
    }

    private com.google.android.datatransport.runtime.firebase.transport.TimeWindow getTimeWindow() {
        final long time = this.wallClock.getTime();
        return (com.google.android.datatransport.runtime.firebase.transport.TimeWindow) inTransaction(new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda22
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.lambda$getTimeWindow$22(time, (android.database.sqlite.SQLiteDatabase) obj);
            }
        });
    }

    static /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.TimeWindow lambda$getTimeWindow$22(final long j, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        return (com.google.android.datatransport.runtime.firebase.transport.TimeWindow) tryWithCursor(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new java.lang.String[0]), new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda18
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.lambda$getTimeWindow$21(j, (android.database.Cursor) obj);
            }
        });
    }

    static /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.TimeWindow lambda$getTimeWindow$21(long j, android.database.Cursor cursor) {
        cursor.moveToNext();
        return com.google.android.datatransport.runtime.firebase.transport.TimeWindow.newBuilder().setStartMs(cursor.getLong(0)).setEndMs(j).build();
    }

    private com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics getGlobalMetrics() {
        return com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics.newBuilder().setStorageMetrics(com.google.android.datatransport.runtime.firebase.transport.StorageMetrics.newBuilder().setCurrentCacheSizeBytes(getByteSize()).setMaxCacheSizeBytes(com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.DEFAULT.getMaxStorageSizeInBytes()).build()).build();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public void resetClientMetrics() {
        inTransaction(new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda7
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f$0.m768x18ea3bd6((android.database.sqlite.SQLiteDatabase) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$resetClientMetrics$23$com-google-android-datatransport-runtime-scheduling-persistence-SQLiteEventStore, reason: not valid java name */
    /* synthetic */ java.lang.Object m768x18ea3bd6(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.wallClock.getTime()).execute();
        return null;
    }

    private void ensureBeginTransaction(final android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        retryIfDbLocked(new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda10
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer
            public final java.lang.Object produce() {
                return com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.lambda$ensureBeginTransaction$24(sQLiteDatabase);
            }
        }, new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda12
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.lambda$ensureBeginTransaction$25((java.lang.Throwable) obj);
            }
        });
    }

    static /* synthetic */ java.lang.Object lambda$ensureBeginTransaction$24(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    static /* synthetic */ java.lang.Object lambda$ensureBeginTransaction$25(java.lang.Throwable th) {
        throw new com.google.android.datatransport.runtime.synchronization.SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard
    public <T> T runCriticalSection(com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection<T> criticalSection) {
        android.database.sqlite.SQLiteDatabase db = getDb();
        ensureBeginTransaction(db);
        try {
            T tExecute = criticalSection.execute();
            db.setTransactionSuccessful();
            return tExecute;
        } finally {
            db.endTransaction();
        }
    }

    <T> T inTransaction(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function<android.database.sqlite.SQLiteDatabase, T> function) {
        android.database.sqlite.SQLiteDatabase db = getDb();
        db.beginTransaction();
        try {
            T tApply = function.apply(db);
            db.setTransactionSuccessful();
            return tApply;
        } finally {
            db.endTransaction();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class Metadata {
        final java.lang.String key;
        final java.lang.String value;

        private Metadata(java.lang.String str, java.lang.String str2) {
            this.key = str;
            this.value = str2;
        }
    }

    private boolean isStorageAtLimit() {
        return getPageCount() * getPageSize() >= this.config.getMaxStorageSizeInBytes();
    }

    long getByteSize() {
        return getPageCount() * getPageSize();
    }

    private long getPageSize() {
        return getDb().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private long getPageCount() {
        return getDb().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    static <T> T tryWithCursor(android.database.Cursor cursor, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function<android.database.Cursor, T> function) {
        try {
            return function.apply(cursor);
        } finally {
            cursor.close();
        }
    }
}
