package androidx.media3.datasource.cache;

/* JADX INFO: loaded from: classes.dex */
class CachedContentIndex {
    static final java.lang.String FILE_NAME_ATOMIC = "cached_content_index.exi";
    private static final int INCREMENTAL_METADATA_READ_LENGTH = 10485760;
    private final android.util.SparseArray<java.lang.String> idToKey;
    private final java.util.HashMap<java.lang.String, androidx.media3.datasource.cache.CachedContent> keyToContent;
    private final android.util.SparseBooleanArray newIds;
    private androidx.media3.datasource.cache.CachedContentIndex.Storage previousStorage;
    private final android.util.SparseBooleanArray removedIds;
    private androidx.media3.datasource.cache.CachedContentIndex.Storage storage;

    private interface Storage {
        void delete() throws java.io.IOException;

        boolean exists() throws java.io.IOException;

        void initialize(long j);

        void load(java.util.HashMap<java.lang.String, androidx.media3.datasource.cache.CachedContent> map, android.util.SparseArray<java.lang.String> sparseArray) throws java.io.IOException;

        void onRemove(androidx.media3.datasource.cache.CachedContent cachedContent, boolean z);

        void onUpdate(androidx.media3.datasource.cache.CachedContent cachedContent);

        void storeFully(java.util.HashMap<java.lang.String, androidx.media3.datasource.cache.CachedContent> map) throws java.io.IOException;

        void storeIncremental(java.util.HashMap<java.lang.String, androidx.media3.datasource.cache.CachedContent> map) throws java.io.IOException;
    }

    public static boolean isIndexFile(java.lang.String str) {
        return str.startsWith(FILE_NAME_ATOMIC);
    }

    public static void delete(androidx.media3.database.DatabaseProvider databaseProvider, long j) throws androidx.media3.database.DatabaseIOException {
        androidx.media3.datasource.cache.CachedContentIndex.DatabaseStorage.delete(databaseProvider, j);
    }

    public CachedContentIndex(androidx.media3.database.DatabaseProvider databaseProvider) {
        this(databaseProvider, null, null, false, false);
    }

    public CachedContentIndex(androidx.media3.database.DatabaseProvider databaseProvider, java.io.File file, byte[] bArr, boolean z, boolean z2) {
        androidx.media3.common.util.Assertions.checkState((databaseProvider == null && file == null) ? false : true);
        this.keyToContent = new java.util.HashMap<>();
        this.idToKey = new android.util.SparseArray<>();
        this.removedIds = new android.util.SparseBooleanArray();
        this.newIds = new android.util.SparseBooleanArray();
        androidx.media3.datasource.cache.CachedContentIndex.DatabaseStorage databaseStorage = databaseProvider != null ? new androidx.media3.datasource.cache.CachedContentIndex.DatabaseStorage(databaseProvider) : null;
        androidx.media3.datasource.cache.CachedContentIndex.LegacyStorage legacyStorage = file != null ? new androidx.media3.datasource.cache.CachedContentIndex.LegacyStorage(new java.io.File(file, FILE_NAME_ATOMIC), bArr, z) : null;
        if (databaseStorage == null || (legacyStorage != null && z2)) {
            this.storage = (androidx.media3.datasource.cache.CachedContentIndex.Storage) androidx.media3.common.util.Util.castNonNull(legacyStorage);
            this.previousStorage = databaseStorage;
        } else {
            this.storage = databaseStorage;
            this.previousStorage = legacyStorage;
        }
    }

    public void initialize(long j) throws java.io.IOException {
        androidx.media3.datasource.cache.CachedContentIndex.Storage storage;
        this.storage.initialize(j);
        androidx.media3.datasource.cache.CachedContentIndex.Storage storage2 = this.previousStorage;
        if (storage2 != null) {
            storage2.initialize(j);
        }
        if (!this.storage.exists() && (storage = this.previousStorage) != null && storage.exists()) {
            this.previousStorage.load(this.keyToContent, this.idToKey);
            this.storage.storeFully(this.keyToContent);
        } else {
            this.storage.load(this.keyToContent, this.idToKey);
        }
        androidx.media3.datasource.cache.CachedContentIndex.Storage storage3 = this.previousStorage;
        if (storage3 != null) {
            storage3.delete();
            this.previousStorage = null;
        }
    }

    public void store() throws java.io.IOException {
        this.storage.storeIncremental(this.keyToContent);
        int size = this.removedIds.size();
        for (int i = 0; i < size; i++) {
            this.idToKey.remove(this.removedIds.keyAt(i));
        }
        this.removedIds.clear();
        this.newIds.clear();
    }

    public androidx.media3.datasource.cache.CachedContent getOrAdd(java.lang.String str) {
        androidx.media3.datasource.cache.CachedContent cachedContent = this.keyToContent.get(str);
        return cachedContent == null ? addNew(str) : cachedContent;
    }

    public androidx.media3.datasource.cache.CachedContent get(java.lang.String str) {
        return this.keyToContent.get(str);
    }

    public java.util.Collection<androidx.media3.datasource.cache.CachedContent> getAll() {
        return java.util.Collections.unmodifiableCollection(this.keyToContent.values());
    }

    public int assignIdForKey(java.lang.String str) {
        return getOrAdd(str).id;
    }

    public java.lang.String getKeyForId(int i) {
        return this.idToKey.get(i);
    }

    public void maybeRemove(java.lang.String str) {
        androidx.media3.datasource.cache.CachedContent cachedContent = this.keyToContent.get(str);
        if (cachedContent != null && cachedContent.isEmpty() && cachedContent.isFullyUnlocked()) {
            this.keyToContent.remove(str);
            int i = cachedContent.id;
            boolean z = this.newIds.get(i);
            this.storage.onRemove(cachedContent, z);
            if (z) {
                this.idToKey.remove(i);
                this.newIds.delete(i);
            } else {
                this.idToKey.put(i, null);
                this.removedIds.put(i, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void removeEmpty() {
        com.google.common.collect.UnmodifiableIterator it = com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) this.keyToContent.keySet()).iterator();
        while (it.hasNext()) {
            maybeRemove((java.lang.String) it.next());
        }
    }

    public java.util.Set<java.lang.String> getKeys() {
        return this.keyToContent.keySet();
    }

    public void applyContentMetadataMutations(java.lang.String str, androidx.media3.datasource.cache.ContentMetadataMutations contentMetadataMutations) {
        androidx.media3.datasource.cache.CachedContent orAdd = getOrAdd(str);
        if (orAdd.applyMetadataMutations(contentMetadataMutations)) {
            this.storage.onUpdate(orAdd);
        }
    }

    public androidx.media3.datasource.cache.ContentMetadata getContentMetadata(java.lang.String str) {
        androidx.media3.datasource.cache.CachedContent cachedContent = get(str);
        return cachedContent != null ? cachedContent.getMetadata() : androidx.media3.datasource.cache.DefaultContentMetadata.EMPTY;
    }

    private androidx.media3.datasource.cache.CachedContent addNew(java.lang.String str) {
        int newId = getNewId(this.idToKey);
        androidx.media3.datasource.cache.CachedContent cachedContent = new androidx.media3.datasource.cache.CachedContent(newId, str);
        this.keyToContent.put(str, cachedContent);
        this.idToKey.put(newId, str);
        this.newIds.put(newId, true);
        this.storage.onUpdate(cachedContent);
        return cachedContent;
    }

    static int getNewId(android.util.SparseArray<java.lang.String> sparseArray) {
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt >= 0) {
            return iKeyAt;
        }
        while (i < size && i == sparseArray.keyAt(i)) {
            i++;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static androidx.media3.datasource.cache.DefaultContentMetadata readContentMetadata(java.io.DataInputStream dataInputStream) throws java.io.IOException {
        int i = dataInputStream.readInt();
        java.util.HashMap map = new java.util.HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            java.lang.String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                throw new java.io.IOException("Invalid value size: " + i3);
            }
            int iMin = java.lang.Math.min(i3, INCREMENTAL_METADATA_READ_LENGTH);
            byte[] bArrCopyOf = androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
            int i4 = 0;
            while (i4 != i3) {
                int i5 = i4 + iMin;
                bArrCopyOf = java.util.Arrays.copyOf(bArrCopyOf, i5);
                dataInputStream.readFully(bArrCopyOf, i4, iMin);
                iMin = java.lang.Math.min(i3 - i5, INCREMENTAL_METADATA_READ_LENGTH);
                i4 = i5;
            }
            map.put(utf, bArrCopyOf);
        }
        return new androidx.media3.datasource.cache.DefaultContentMetadata(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeContentMetadata(androidx.media3.datasource.cache.DefaultContentMetadata defaultContentMetadata, java.io.DataOutputStream dataOutputStream) throws java.io.IOException {
        java.util.Set<java.util.Map.Entry<java.lang.String, byte[]>> setEntrySet = defaultContentMetadata.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (java.util.Map.Entry<java.lang.String, byte[]> entry : setEntrySet) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    private static class LegacyStorage implements androidx.media3.datasource.cache.CachedContentIndex.Storage {
        private static final int FLAG_ENCRYPTED_INDEX = 1;
        private static final int VERSION = 2;
        private static final int VERSION_METADATA_INTRODUCED = 2;
        private final androidx.media3.common.util.AtomicFile atomicFile;
        private androidx.media3.datasource.cache.ReusableBufferedOutputStream bufferedOutputStream;
        private boolean changed;
        private final javax.crypto.Cipher cipher;
        private final boolean encrypt;
        private final java.security.SecureRandom random;
        private final javax.crypto.spec.SecretKeySpec secretKeySpec;

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void initialize(long j) {
        }

        public LegacyStorage(java.io.File file, byte[] bArr, boolean z) {
            javax.crypto.Cipher cipher;
            javax.crypto.spec.SecretKeySpec secretKeySpec;
            androidx.media3.common.util.Assertions.checkState((bArr == null && z) ? false : true);
            if (bArr != null) {
                androidx.media3.common.util.Assertions.checkArgument(bArr.length == 16);
                try {
                    cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5PADDING");
                    secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
                } catch (java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException e) {
                    throw new java.lang.IllegalStateException(e);
                }
            } else {
                androidx.media3.common.util.Assertions.checkArgument(!z);
                cipher = null;
                secretKeySpec = null;
            }
            this.encrypt = z;
            this.cipher = cipher;
            this.secretKeySpec = secretKeySpec;
            this.random = z ? new java.security.SecureRandom() : null;
            this.atomicFile = new androidx.media3.common.util.AtomicFile(file);
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public boolean exists() {
            return this.atomicFile.exists();
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void delete() {
            this.atomicFile.delete();
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void load(java.util.HashMap<java.lang.String, androidx.media3.datasource.cache.CachedContent> map, android.util.SparseArray<java.lang.String> sparseArray) {
            androidx.media3.common.util.Assertions.checkState(!this.changed);
            if (readFile(map, sparseArray)) {
                return;
            }
            map.clear();
            sparseArray.clear();
            this.atomicFile.delete();
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void storeFully(java.util.HashMap<java.lang.String, androidx.media3.datasource.cache.CachedContent> map) throws java.lang.Throwable {
            writeFile(map);
            this.changed = false;
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void storeIncremental(java.util.HashMap<java.lang.String, androidx.media3.datasource.cache.CachedContent> map) throws java.lang.Throwable {
            if (this.changed) {
                storeFully(map);
            }
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void onUpdate(androidx.media3.datasource.cache.CachedContent cachedContent) {
            this.changed = true;
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void onRemove(androidx.media3.datasource.cache.CachedContent cachedContent, boolean z) {
            this.changed = true;
        }

        private boolean readFile(java.util.HashMap<java.lang.String, androidx.media3.datasource.cache.CachedContent> map, android.util.SparseArray<java.lang.String> sparseArray) throws java.lang.Throwable {
            if (!this.atomicFile.exists()) {
                return true;
            }
            java.io.DataInputStream dataInputStream = null;
            try {
                java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(this.atomicFile.openRead());
                java.io.DataInputStream dataInputStream2 = new java.io.DataInputStream(bufferedInputStream);
                try {
                    int i = dataInputStream2.readInt();
                    if (i >= 0 && i <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            if (this.cipher != null) {
                                byte[] bArr = new byte[16];
                                dataInputStream2.readFully(bArr);
                                try {
                                    this.cipher.init(2, (java.security.Key) androidx.media3.common.util.Util.castNonNull(this.secretKeySpec), new javax.crypto.spec.IvParameterSpec(bArr));
                                    dataInputStream2 = new java.io.DataInputStream(new javax.crypto.CipherInputStream(bufferedInputStream, this.cipher));
                                } catch (java.security.InvalidAlgorithmParameterException e) {
                                    e = e;
                                    throw new java.lang.IllegalStateException(e);
                                } catch (java.security.InvalidKeyException e2) {
                                    e = e2;
                                    throw new java.lang.IllegalStateException(e);
                                }
                            } else {
                                androidx.media3.common.util.Util.closeQuietly(dataInputStream2);
                                return false;
                            }
                        } else if (this.encrypt) {
                            this.changed = true;
                        }
                        int i2 = dataInputStream2.readInt();
                        int iHashCachedContent = 0;
                        for (int i3 = 0; i3 < i2; i3++) {
                            androidx.media3.datasource.cache.CachedContent cachedContent = readCachedContent(i, dataInputStream2);
                            map.put(cachedContent.key, cachedContent);
                            sparseArray.put(cachedContent.id, cachedContent.key);
                            iHashCachedContent += hashCachedContent(cachedContent, i);
                        }
                        int i4 = dataInputStream2.readInt();
                        boolean z = dataInputStream2.read() == -1;
                        if (i4 == iHashCachedContent && z) {
                            androidx.media3.common.util.Util.closeQuietly(dataInputStream2);
                            return true;
                        }
                        androidx.media3.common.util.Util.closeQuietly(dataInputStream2);
                        return false;
                    }
                    androidx.media3.common.util.Util.closeQuietly(dataInputStream2);
                    return false;
                } catch (java.io.IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        androidx.media3.common.util.Util.closeQuietly(dataInputStream);
                    }
                    return false;
                } catch (java.lang.Throwable th) {
                    th = th;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        androidx.media3.common.util.Util.closeQuietly(dataInputStream);
                    }
                    throw th;
                }
            } catch (java.io.IOException unused2) {
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        }

        private void writeFile(java.util.HashMap<java.lang.String, androidx.media3.datasource.cache.CachedContent> map) throws java.lang.Throwable {
            java.io.DataOutputStream dataOutputStream = null;
            try {
                java.io.OutputStream outputStreamStartWrite = this.atomicFile.startWrite();
                androidx.media3.datasource.cache.ReusableBufferedOutputStream reusableBufferedOutputStream = this.bufferedOutputStream;
                if (reusableBufferedOutputStream == null) {
                    this.bufferedOutputStream = new androidx.media3.datasource.cache.ReusableBufferedOutputStream(outputStreamStartWrite);
                } else {
                    reusableBufferedOutputStream.reset(outputStreamStartWrite);
                }
                androidx.media3.datasource.cache.ReusableBufferedOutputStream reusableBufferedOutputStream2 = this.bufferedOutputStream;
                java.io.DataOutputStream dataOutputStream2 = new java.io.DataOutputStream(reusableBufferedOutputStream2);
                try {
                    dataOutputStream2.writeInt(2);
                    int iHashCachedContent = 0;
                    dataOutputStream2.writeInt(this.encrypt ? 1 : 0);
                    if (this.encrypt) {
                        byte[] bArr = new byte[16];
                        ((java.security.SecureRandom) androidx.media3.common.util.Util.castNonNull(this.random)).nextBytes(bArr);
                        dataOutputStream2.write(bArr);
                        try {
                            ((javax.crypto.Cipher) androidx.media3.common.util.Util.castNonNull(this.cipher)).init(1, (java.security.Key) androidx.media3.common.util.Util.castNonNull(this.secretKeySpec), new javax.crypto.spec.IvParameterSpec(bArr));
                            dataOutputStream2.flush();
                            dataOutputStream2 = new java.io.DataOutputStream(new javax.crypto.CipherOutputStream(reusableBufferedOutputStream2, this.cipher));
                        } catch (java.security.InvalidAlgorithmParameterException e) {
                            e = e;
                            throw new java.lang.IllegalStateException(e);
                        } catch (java.security.InvalidKeyException e2) {
                            e = e2;
                            throw new java.lang.IllegalStateException(e);
                        }
                    }
                    dataOutputStream2.writeInt(map.size());
                    for (androidx.media3.datasource.cache.CachedContent cachedContent : map.values()) {
                        writeCachedContent(cachedContent, dataOutputStream2);
                        iHashCachedContent += hashCachedContent(cachedContent, 2);
                    }
                    dataOutputStream2.writeInt(iHashCachedContent);
                    this.atomicFile.endWrite(dataOutputStream2);
                    androidx.media3.common.util.Util.closeQuietly(null);
                } catch (java.lang.Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    androidx.media3.common.util.Util.closeQuietly(dataOutputStream);
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        }

        private int hashCachedContent(androidx.media3.datasource.cache.CachedContent cachedContent, int i) {
            int i2;
            int iHashCode;
            int iHashCode2 = (cachedContent.id * 31) + cachedContent.key.hashCode();
            if (i < 2) {
                long contentLength = androidx.media3.datasource.cache.ContentMetadata.getContentLength(cachedContent.getMetadata());
                i2 = iHashCode2 * 31;
                iHashCode = (int) (contentLength ^ (contentLength >>> 32));
            } else {
                i2 = iHashCode2 * 31;
                iHashCode = cachedContent.getMetadata().hashCode();
            }
            return i2 + iHashCode;
        }

        private androidx.media3.datasource.cache.CachedContent readCachedContent(int i, java.io.DataInputStream dataInputStream) throws java.io.IOException {
            androidx.media3.datasource.cache.DefaultContentMetadata contentMetadata;
            int i2 = dataInputStream.readInt();
            java.lang.String utf = dataInputStream.readUTF();
            if (i >= 2) {
                contentMetadata = androidx.media3.datasource.cache.CachedContentIndex.readContentMetadata(dataInputStream);
            } else {
                long j = dataInputStream.readLong();
                androidx.media3.datasource.cache.ContentMetadataMutations contentMetadataMutations = new androidx.media3.datasource.cache.ContentMetadataMutations();
                androidx.media3.datasource.cache.ContentMetadataMutations.setContentLength(contentMetadataMutations, j);
                contentMetadata = androidx.media3.datasource.cache.DefaultContentMetadata.EMPTY.copyWithMutationsApplied(contentMetadataMutations);
            }
            return new androidx.media3.datasource.cache.CachedContent(i2, utf, contentMetadata);
        }

        private void writeCachedContent(androidx.media3.datasource.cache.CachedContent cachedContent, java.io.DataOutputStream dataOutputStream) throws java.io.IOException {
            dataOutputStream.writeInt(cachedContent.id);
            dataOutputStream.writeUTF(cachedContent.key);
            androidx.media3.datasource.cache.CachedContentIndex.writeContentMetadata(cachedContent.getMetadata(), dataOutputStream);
        }
    }

    private static final class DatabaseStorage implements androidx.media3.datasource.cache.CachedContentIndex.Storage {
        private static final java.lang.String[] COLUMNS = {"id", "key", "metadata"};
        private static final java.lang.String COLUMN_ID = "id";
        private static final int COLUMN_INDEX_ID = 0;
        private static final int COLUMN_INDEX_KEY = 1;
        private static final int COLUMN_INDEX_METADATA = 2;
        private static final java.lang.String COLUMN_KEY = "key";
        private static final java.lang.String COLUMN_METADATA = "metadata";
        private static final java.lang.String TABLE_PREFIX = "ExoPlayerCacheIndex";
        private static final java.lang.String TABLE_SCHEMA = "(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)";
        private static final int TABLE_VERSION = 1;
        private static final java.lang.String WHERE_ID_EQUALS = "id = ?";
        private final androidx.media3.database.DatabaseProvider databaseProvider;
        private java.lang.String hexUid;
        private final android.util.SparseArray<androidx.media3.datasource.cache.CachedContent> pendingUpdates = new android.util.SparseArray<>();
        private java.lang.String tableName;

        public static void delete(androidx.media3.database.DatabaseProvider databaseProvider, long j) throws androidx.media3.database.DatabaseIOException {
            delete(databaseProvider, java.lang.Long.toHexString(j));
        }

        public DatabaseStorage(androidx.media3.database.DatabaseProvider databaseProvider) {
            this.databaseProvider = databaseProvider;
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void initialize(long j) {
            java.lang.String hexString = java.lang.Long.toHexString(j);
            this.hexUid = hexString;
            this.tableName = getTableName(hexString);
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public boolean exists() throws androidx.media3.database.DatabaseIOException {
            try {
                return androidx.media3.database.VersionTable.getVersion(this.databaseProvider.getReadableDatabase(), 1, (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(this.hexUid)) != -1;
            } catch (android.database.SQLException e) {
                throw new androidx.media3.database.DatabaseIOException(e);
            }
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void delete() throws androidx.media3.database.DatabaseIOException {
            delete(this.databaseProvider, (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(this.hexUid));
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void load(java.util.HashMap<java.lang.String, androidx.media3.datasource.cache.CachedContent> map, android.util.SparseArray<java.lang.String> sparseArray) throws java.io.IOException {
            androidx.media3.common.util.Assertions.checkState(this.pendingUpdates.size() == 0);
            try {
                if (androidx.media3.database.VersionTable.getVersion(this.databaseProvider.getReadableDatabase(), 1, (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(this.hexUid)) != 1) {
                    android.database.sqlite.SQLiteDatabase writableDatabase = this.databaseProvider.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        initializeTable(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (java.lang.Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                android.database.Cursor cursor = getCursor();
                while (cursor.moveToNext()) {
                    try {
                        androidx.media3.datasource.cache.CachedContent cachedContent = new androidx.media3.datasource.cache.CachedContent(cursor.getInt(0), (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(cursor.getString(1)), androidx.media3.datasource.cache.CachedContentIndex.readContentMetadata(new java.io.DataInputStream(new java.io.ByteArrayInputStream(cursor.getBlob(2)))));
                        map.put(cachedContent.key, cachedContent);
                        sparseArray.put(cachedContent.id, cachedContent.key);
                    } catch (java.lang.Throwable th2) {
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (java.lang.Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
            } catch (android.database.sqlite.SQLiteException e) {
                map.clear();
                sparseArray.clear();
                throw new androidx.media3.database.DatabaseIOException(e);
            }
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void storeFully(java.util.HashMap<java.lang.String, androidx.media3.datasource.cache.CachedContent> map) throws java.io.IOException {
            try {
                android.database.sqlite.SQLiteDatabase writableDatabase = this.databaseProvider.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    initializeTable(writableDatabase);
                    java.util.Iterator<androidx.media3.datasource.cache.CachedContent> it = map.values().iterator();
                    while (it.hasNext()) {
                        addOrUpdateRow(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.pendingUpdates.clear();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (android.database.SQLException e) {
                throw new androidx.media3.database.DatabaseIOException(e);
            }
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void storeIncremental(java.util.HashMap<java.lang.String, androidx.media3.datasource.cache.CachedContent> map) throws java.io.IOException {
            if (this.pendingUpdates.size() == 0) {
                return;
            }
            try {
                android.database.sqlite.SQLiteDatabase writableDatabase = this.databaseProvider.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i = 0; i < this.pendingUpdates.size(); i++) {
                    try {
                        androidx.media3.datasource.cache.CachedContent cachedContentValueAt = this.pendingUpdates.valueAt(i);
                        if (cachedContentValueAt == null) {
                            deleteRow(writableDatabase, this.pendingUpdates.keyAt(i));
                        } else {
                            addOrUpdateRow(writableDatabase, cachedContentValueAt);
                        }
                    } catch (java.lang.Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.pendingUpdates.clear();
                writableDatabase.endTransaction();
            } catch (android.database.SQLException e) {
                throw new androidx.media3.database.DatabaseIOException(e);
            }
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void onUpdate(androidx.media3.datasource.cache.CachedContent cachedContent) {
            this.pendingUpdates.put(cachedContent.id, cachedContent);
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void onRemove(androidx.media3.datasource.cache.CachedContent cachedContent, boolean z) {
            if (z) {
                this.pendingUpdates.delete(cachedContent.id);
            } else {
                this.pendingUpdates.put(cachedContent.id, null);
            }
        }

        private android.database.Cursor getCursor() {
            return this.databaseProvider.getReadableDatabase().query((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(this.tableName), COLUMNS, null, null, null, null, null);
        }

        private void initializeTable(android.database.sqlite.SQLiteDatabase sQLiteDatabase) throws androidx.media3.database.DatabaseIOException {
            androidx.media3.database.VersionTable.setVersion(sQLiteDatabase, 1, (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(this.hexUid), 1);
            dropTable(sQLiteDatabase, (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(this.tableName));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.tableName + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }

        private void deleteRow(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i) {
            sQLiteDatabase.delete((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(this.tableName), WHERE_ID_EQUALS, new java.lang.String[]{java.lang.Integer.toString(i)});
        }

        private void addOrUpdateRow(android.database.sqlite.SQLiteDatabase sQLiteDatabase, androidx.media3.datasource.cache.CachedContent cachedContent) throws java.io.IOException {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            androidx.media3.datasource.cache.CachedContentIndex.writeContentMetadata(cachedContent.getMetadata(), new java.io.DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("id", java.lang.Integer.valueOf(cachedContent.id));
            contentValues.put("key", cachedContent.key);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(this.tableName), null, contentValues);
        }

        private static void delete(androidx.media3.database.DatabaseProvider databaseProvider, java.lang.String str) throws androidx.media3.database.DatabaseIOException {
            try {
                java.lang.String tableName = getTableName(str);
                android.database.sqlite.SQLiteDatabase writableDatabase = databaseProvider.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    androidx.media3.database.VersionTable.removeVersion(writableDatabase, 1, str);
                    dropTable(writableDatabase, tableName);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (android.database.SQLException e) {
                throw new androidx.media3.database.DatabaseIOException(e);
            }
        }

        private static void dropTable(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        private static java.lang.String getTableName(java.lang.String str) {
            return TABLE_PREFIX + str;
        }
    }
}
