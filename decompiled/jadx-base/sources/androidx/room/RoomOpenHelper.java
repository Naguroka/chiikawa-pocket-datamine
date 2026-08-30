package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
public class RoomOpenHelper extends androidx.sqlite.db.SupportSQLiteOpenHelper.Callback {
    private androidx.room.DatabaseConfiguration mConfiguration;
    private final androidx.room.RoomOpenHelper.Delegate mDelegate;
    private final java.lang.String mIdentityHash;
    private final java.lang.String mLegacyHash;

    public RoomOpenHelper(androidx.room.DatabaseConfiguration databaseConfiguration, androidx.room.RoomOpenHelper.Delegate delegate, java.lang.String str, java.lang.String str2) {
        super(delegate.version);
        this.mConfiguration = databaseConfiguration;
        this.mDelegate = delegate;
        this.mIdentityHash = str;
        this.mLegacyHash = str2;
    }

    public RoomOpenHelper(androidx.room.DatabaseConfiguration databaseConfiguration, androidx.room.RoomOpenHelper.Delegate delegate, java.lang.String str) {
        this(databaseConfiguration, delegate, "", str);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onConfigure(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        super.onConfigure(supportSQLiteDatabase);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onCreate(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        boolean zHasEmptySchema = hasEmptySchema(supportSQLiteDatabase);
        this.mDelegate.createAllTables(supportSQLiteDatabase);
        if (!zHasEmptySchema) {
            androidx.room.RoomOpenHelper.ValidationResult validationResultOnValidateSchema = this.mDelegate.onValidateSchema(supportSQLiteDatabase);
            if (!validationResultOnValidateSchema.isValid) {
                throw new java.lang.IllegalStateException("Pre-packaged database has an invalid schema: " + validationResultOnValidateSchema.expectedFoundMsg);
            }
        }
        updateIdentity(supportSQLiteDatabase);
        this.mDelegate.onCreate(supportSQLiteDatabase);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onUpgrade(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
        boolean z;
        java.util.List<androidx.room.migration.Migration> listFindMigrationPath;
        androidx.room.DatabaseConfiguration databaseConfiguration = this.mConfiguration;
        if (databaseConfiguration == null || (listFindMigrationPath = databaseConfiguration.migrationContainer.findMigrationPath(i, i2)) == null) {
            z = false;
        } else {
            this.mDelegate.onPreMigrate(supportSQLiteDatabase);
            java.util.Iterator<androidx.room.migration.Migration> it = listFindMigrationPath.iterator();
            while (it.hasNext()) {
                it.next().migrate(supportSQLiteDatabase);
            }
            androidx.room.RoomOpenHelper.ValidationResult validationResultOnValidateSchema = this.mDelegate.onValidateSchema(supportSQLiteDatabase);
            if (!validationResultOnValidateSchema.isValid) {
                throw new java.lang.IllegalStateException("Migration didn't properly handle: " + validationResultOnValidateSchema.expectedFoundMsg);
            }
            this.mDelegate.onPostMigrate(supportSQLiteDatabase);
            updateIdentity(supportSQLiteDatabase);
            z = true;
        }
        if (z) {
            return;
        }
        androidx.room.DatabaseConfiguration databaseConfiguration2 = this.mConfiguration;
        if (databaseConfiguration2 != null && !databaseConfiguration2.isMigrationRequired(i, i2)) {
            this.mDelegate.dropAllTables(supportSQLiteDatabase);
            this.mDelegate.createAllTables(supportSQLiteDatabase);
            return;
        }
        throw new java.lang.IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onDowngrade(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
        onUpgrade(supportSQLiteDatabase, i, i2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onOpen(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        super.onOpen(supportSQLiteDatabase);
        checkIdentity(supportSQLiteDatabase);
        this.mDelegate.onOpen(supportSQLiteDatabase);
        this.mConfiguration = null;
    }

    private void checkIdentity(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        if (hasRoomMasterTable(supportSQLiteDatabase)) {
            android.database.Cursor cursorQuery = supportSQLiteDatabase.query(new androidx.sqlite.db.SimpleSQLiteQuery(androidx.room.RoomMasterTable.READ_QUERY));
            try {
                java.lang.String string = cursorQuery.moveToFirst() ? cursorQuery.getString(0) : null;
                cursorQuery.close();
                if (!this.mIdentityHash.equals(string) && !this.mLegacyHash.equals(string)) {
                    throw new java.lang.IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
                return;
            } catch (java.lang.Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        androidx.room.RoomOpenHelper.ValidationResult validationResultOnValidateSchema = this.mDelegate.onValidateSchema(supportSQLiteDatabase);
        if (!validationResultOnValidateSchema.isValid) {
            throw new java.lang.IllegalStateException("Pre-packaged database has an invalid schema: " + validationResultOnValidateSchema.expectedFoundMsg);
        }
        this.mDelegate.onPostMigrate(supportSQLiteDatabase);
        updateIdentity(supportSQLiteDatabase);
    }

    private void updateIdentity(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        createMasterTableIfNotExists(supportSQLiteDatabase);
        supportSQLiteDatabase.execSQL(androidx.room.RoomMasterTable.createInsertQuery(this.mIdentityHash));
    }

    private void createMasterTableIfNotExists(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL(androidx.room.RoomMasterTable.CREATE_QUERY);
    }

    private static boolean hasRoomMasterTable(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        android.database.Cursor cursorQuery = supportSQLiteDatabase.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (cursorQuery.moveToFirst() && cursorQuery.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            cursorQuery.close();
        }
    }

    private static boolean hasEmptySchema(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        android.database.Cursor cursorQuery = supportSQLiteDatabase.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (cursorQuery.moveToFirst() && cursorQuery.getInt(0) == 0) {
                z = true;
            }
            return z;
        } finally {
            cursorQuery.close();
        }
    }

    public static abstract class Delegate {
        public final int version;

        protected abstract void createAllTables(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase);

        protected abstract void dropAllTables(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase);

        protected abstract void onCreate(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase);

        protected abstract void onOpen(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase);

        protected void onPostMigrate(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        protected void onPreMigrate(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public Delegate(int i) {
            this.version = i;
        }

        @java.lang.Deprecated
        protected void validateMigration(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            throw new java.lang.UnsupportedOperationException("validateMigration is deprecated");
        }

        protected androidx.room.RoomOpenHelper.ValidationResult onValidateSchema(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            validateMigration(supportSQLiteDatabase);
            return new androidx.room.RoomOpenHelper.ValidationResult(true, null);
        }
    }

    public static class ValidationResult {
        public final java.lang.String expectedFoundMsg;
        public final boolean isValid;

        public ValidationResult(boolean z, java.lang.String str) {
            this.isValid = z;
            this.expectedFoundMsg = str;
        }
    }
}
