package androidx.datastore.core;

/* JADX INFO: compiled from: SharedCounter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/datastore/core/SharedCounter;", "", "mappedAddress", "", "(J)V", "getValue", "", "incrementAndGetValue", "Factory", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SharedCounter {

    /* JADX INFO: renamed from: Factory, reason: from kotlin metadata */
    public static final androidx.datastore.core.SharedCounter.Companion INSTANCE = new androidx.datastore.core.SharedCounter.Companion(null);
    private static final androidx.datastore.core.NativeSharedCounter nativeSharedCounter = new androidx.datastore.core.NativeSharedCounter();
    private final long mappedAddress;

    public /* synthetic */ SharedCounter(long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    private SharedCounter(long j) {
        this.mappedAddress = j;
    }

    public final int getValue() {
        return nativeSharedCounter.nativeGetCounterValue(this.mappedAddress);
    }

    public final int incrementAndGetValue() {
        return nativeSharedCounter.nativeIncrementAndGetCounterValue(this.mappedAddress);
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SharedCounter$Factory, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SharedCounter.android.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0002\b\fJ\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u0010\u0010\u001a\u00020\u0011R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Landroidx/datastore/core/SharedCounter$Factory;", "", "()V", "nativeSharedCounter", "Landroidx/datastore/core/NativeSharedCounter;", "getNativeSharedCounter$datastore_core_release", "()Landroidx/datastore/core/NativeSharedCounter;", "create", "Landroidx/datastore/core/SharedCounter;", "produceFile", "Lkotlin/Function0;", "Ljava/io/File;", "create$datastore_core_release", "createCounterFromFd", "pfd", "Landroid/os/ParcelFileDescriptor;", "loadLib", "", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.datastore.core.NativeSharedCounter getNativeSharedCounter$datastore_core_release() {
            return androidx.datastore.core.SharedCounter.nativeSharedCounter;
        }

        public final void loadLib() {
            java.lang.System.loadLibrary("datastore_shared_counter");
        }

        private final androidx.datastore.core.SharedCounter createCounterFromFd(android.os.ParcelFileDescriptor pfd) throws java.io.IOException {
            int fd = pfd.getFd();
            if (getNativeSharedCounter$datastore_core_release().nativeTruncateFile(fd) != 0) {
                throw new java.io.IOException("Failed to truncate counter file");
            }
            long jNativeCreateSharedCounter = getNativeSharedCounter$datastore_core_release().nativeCreateSharedCounter(fd);
            if (jNativeCreateSharedCounter < 0) {
                throw new java.io.IOException("Failed to mmap counter file");
            }
            return new androidx.datastore.core.SharedCounter(jNativeCreateSharedCounter, null);
        }

        public final androidx.datastore.core.SharedCounter create$datastore_core_release(kotlin.jvm.functions.Function0<? extends java.io.File> produceFile) throws java.lang.Throwable {
            android.os.ParcelFileDescriptor parcelFileDescriptorOpen;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceFile, "produceFile");
            try {
                parcelFileDescriptorOpen = android.os.ParcelFileDescriptor.open(produceFile.invoke(), 939524096);
                try {
                    androidx.datastore.core.SharedCounter sharedCounterCreateCounterFromFd = createCounterFromFd(parcelFileDescriptorOpen);
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    return sharedCounterCreateCounterFromFd;
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                parcelFileDescriptorOpen = null;
            }
        }
    }
}
