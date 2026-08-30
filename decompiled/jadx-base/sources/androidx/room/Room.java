package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
public class Room {
    private static final java.lang.String CURSOR_CONV_SUFFIX = "_CursorConverter";
    static final java.lang.String LOG_TAG = "ROOM";
    public static final java.lang.String MASTER_TABLE_NAME = "room_master_table";

    public static <T extends androidx.room.RoomDatabase> androidx.room.RoomDatabase.Builder<T> databaseBuilder(android.content.Context context, java.lang.Class<T> cls, java.lang.String str) {
        if (str == null || str.trim().length() == 0) {
            throw new java.lang.IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new androidx.room.RoomDatabase.Builder<>(context, cls, str);
    }

    public static <T extends androidx.room.RoomDatabase> androidx.room.RoomDatabase.Builder<T> inMemoryDatabaseBuilder(android.content.Context context, java.lang.Class<T> cls) {
        return new androidx.room.RoomDatabase.Builder<>(context, cls, null);
    }

    static <T, C> T getGeneratedImplementation(java.lang.Class<C> cls, java.lang.String str) {
        java.lang.String name = cls.getPackage().getName();
        java.lang.String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        java.lang.String str2 = canonicalName.replace('.', '_') + str;
        try {
            return (T) java.lang.Class.forName(name.isEmpty() ? str2 : name + "." + str2).newInstance();
        } catch (java.lang.ClassNotFoundException unused) {
            throw new java.lang.RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str2 + " does not exist");
        } catch (java.lang.IllegalAccessException unused2) {
            throw new java.lang.RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
        } catch (java.lang.InstantiationException unused3) {
            throw new java.lang.RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }

    @java.lang.Deprecated
    public Room() {
    }
}
