package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class BundleListRetriever extends android.os.Binder {
    private static final int REPLY_BREAK = 2;
    private static final int REPLY_CONTINUE = 1;
    private static final int REPLY_END_OF_LIST = 0;
    private static final int SUGGESTED_MAX_IPC_SIZE;
    private final com.google.common.collect.ImmutableList<android.os.Bundle> list;

    static {
        SUGGESTED_MAX_IPC_SIZE = androidx.media3.common.util.Util.SDK_INT >= 30 ? android.os.IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public BundleListRetriever(java.util.List<android.os.Bundle> list) {
        this.list = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
    }

    @Override // android.os.Binder
    protected boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.list.size();
        int i3 = parcel.readInt();
        while (i3 < size && parcel2.dataSize() < SUGGESTED_MAX_IPC_SIZE) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.list.get(i3));
            i3++;
        }
        parcel2.writeInt(i3 < size ? 2 : 0);
        return true;
    }

    public static com.google.common.collect.ImmutableList<android.os.Bundle> getList(android.os.IBinder iBinder) {
        if (iBinder instanceof androidx.media3.common.BundleListRetriever) {
            return ((androidx.media3.common.BundleListRetriever) iBinder).list;
        }
        return getListFromRemoteBinder(iBinder);
    }

    static com.google.common.collect.ImmutableList<android.os.Bundle> getListFromRemoteBinder(android.os.IBinder iBinder) {
        int i;
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        int i2 = 0;
        int i3 = 1;
        while (i3 != 0) {
            android.os.Parcel parcelObtain = android.os.Parcel.obtain();
            android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
            try {
                parcelObtain.writeInt(i2);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i = parcelObtain2.readInt();
                        if (i == 1) {
                            builder.add((android.os.Bundle) androidx.media3.common.util.Assertions.checkNotNull(parcelObtain2.readBundle()));
                            i2++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i3 = i;
                } catch (android.os.RemoteException e) {
                    throw new java.lang.RuntimeException(e);
                }
            } catch (java.lang.Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        return builder.build();
    }
}
