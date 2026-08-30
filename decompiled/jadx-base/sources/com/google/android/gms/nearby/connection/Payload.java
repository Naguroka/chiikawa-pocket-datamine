package com.google.android.gms.nearby.connection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public class Payload {
    private final long zza;
    private final int zzb;
    private final byte[] zzc;
    private final com.google.android.gms.nearby.connection.Payload.File zzd;
    private final com.google.android.gms.nearby.connection.Payload.Stream zze;
    private long zzf;
    private boolean zzg;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    public static class File {
        private final java.io.File zza;
        private final android.os.ParcelFileDescriptor zzb;
        private final long zzc;
        private final android.net.Uri zzd;

        private File(java.io.File file, android.os.ParcelFileDescriptor parcelFileDescriptor, long j, android.net.Uri uri) {
            this.zza = file;
            this.zzb = parcelFileDescriptor;
            this.zzc = j;
            this.zzd = uri;
        }

        public static com.google.android.gms.nearby.connection.Payload.File zza(java.io.File file, android.os.ParcelFileDescriptor parcelFileDescriptor, long j, android.net.Uri uri) {
            return new com.google.android.gms.nearby.connection.Payload.File((java.io.File) com.google.android.gms.common.internal.Preconditions.checkNotNull(file, "Cannot create Payload.File from null java.io.File."), (android.os.ParcelFileDescriptor) com.google.android.gms.common.internal.Preconditions.checkNotNull(parcelFileDescriptor, "Cannot create Payload.File from null ParcelFileDescriptor."), j, (android.net.Uri) com.google.android.gms.common.internal.Preconditions.checkNotNull(uri, "Cannot create Payload.File from null Uri"));
        }

        public static com.google.android.gms.nearby.connection.Payload.File zzb(android.os.ParcelFileDescriptor parcelFileDescriptor) {
            return new com.google.android.gms.nearby.connection.Payload.File(null, (android.os.ParcelFileDescriptor) com.google.android.gms.common.internal.Preconditions.checkNotNull(parcelFileDescriptor, "Cannot create Payload.File from null ParcelFileDescriptor."), parcelFileDescriptor.getStatSize(), null);
        }

        @java.lang.Deprecated
        public java.io.File asJavaFile() {
            return this.zza;
        }

        public android.os.ParcelFileDescriptor asParcelFileDescriptor() {
            return this.zzb;
        }

        public android.net.Uri asUri() {
            return this.zzd;
        }

        @java.lang.Deprecated
        public void close() {
            com.google.android.gms.common.util.IOUtils.closeQuietly(this.zzb);
        }

        public long getSize() {
            return this.zzc;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    public static class Stream {
        private final android.os.ParcelFileDescriptor zza;
        private java.io.InputStream zzb;

        private Stream(android.os.ParcelFileDescriptor parcelFileDescriptor, java.io.InputStream inputStream) {
            this.zza = parcelFileDescriptor;
            this.zzb = inputStream;
        }

        public static com.google.android.gms.nearby.connection.Payload.Stream zza(java.io.InputStream inputStream) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(inputStream, "Cannot create Payload.Stream from null InputStream.");
            return new com.google.android.gms.nearby.connection.Payload.Stream(null, inputStream);
        }

        public static com.google.android.gms.nearby.connection.Payload.Stream zzb(android.os.ParcelFileDescriptor parcelFileDescriptor) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(parcelFileDescriptor, "Cannot create Payload.Stream from null ParcelFileDescriptor.");
            return new com.google.android.gms.nearby.connection.Payload.Stream(parcelFileDescriptor, null);
        }

        public java.io.InputStream asInputStream() {
            if (this.zzb == null) {
                this.zzb = new android.os.ParcelFileDescriptor.AutoCloseInputStream((android.os.ParcelFileDescriptor) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zza));
            }
            return this.zzb;
        }

        public android.os.ParcelFileDescriptor asParcelFileDescriptor() {
            return this.zza;
        }

        @java.lang.Deprecated
        public void close() {
            com.google.android.gms.common.util.IOUtils.closeQuietly(this.zza);
            com.google.android.gms.common.util.IOUtils.closeQuietly(this.zzb);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    public @interface Type {
        public static final int BYTES = 1;
        public static final int FILE = 2;
        public static final int STREAM = 3;
    }

    private Payload(long j, int i, byte[] bArr, com.google.android.gms.nearby.connection.Payload.File file, com.google.android.gms.nearby.connection.Payload.Stream stream) {
        this.zza = j;
        this.zzb = i;
        this.zzc = bArr;
        this.zzd = file;
        this.zze = stream;
    }

    public static com.google.android.gms.nearby.connection.Payload fromBytes(byte[] bArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr, "Cannot create a Payload from null bytes.");
        return zza(bArr, java.util.UUID.randomUUID().getLeastSignificantBits());
    }

    public static com.google.android.gms.nearby.connection.Payload fromFile(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        return zzb(com.google.android.gms.nearby.connection.Payload.File.zzb(parcelFileDescriptor), java.util.UUID.randomUUID().getLeastSignificantBits());
    }

    public static com.google.android.gms.nearby.connection.Payload fromStream(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        return zzc(com.google.android.gms.nearby.connection.Payload.Stream.zzb(parcelFileDescriptor), java.util.UUID.randomUUID().getLeastSignificantBits());
    }

    public static com.google.android.gms.nearby.connection.Payload zza(byte[] bArr, long j) {
        return new com.google.android.gms.nearby.connection.Payload(j, 1, bArr, null, null);
    }

    public static com.google.android.gms.nearby.connection.Payload zzb(com.google.android.gms.nearby.connection.Payload.File file, long j) {
        return new com.google.android.gms.nearby.connection.Payload(j, 2, null, file, null);
    }

    public static com.google.android.gms.nearby.connection.Payload zzc(com.google.android.gms.nearby.connection.Payload.Stream stream, long j) {
        return new com.google.android.gms.nearby.connection.Payload(j, 3, null, null, stream);
    }

    public byte[] asBytes() {
        return this.zzc;
    }

    public com.google.android.gms.nearby.connection.Payload.File asFile() {
        return this.zzd;
    }

    public com.google.android.gms.nearby.connection.Payload.Stream asStream() {
        return this.zze;
    }

    public void close() {
        com.google.android.gms.nearby.connection.Payload.File file = this.zzd;
        if (file != null) {
            file.close();
        }
        com.google.android.gms.nearby.connection.Payload.Stream stream = this.zze;
        if (stream != null) {
            stream.close();
        }
    }

    public long getId() {
        return this.zza;
    }

    public long getOffset() {
        return this.zzf;
    }

    public int getType() {
        return this.zzb;
    }

    public void setSensitive(boolean z) {
        this.zzg = z;
    }

    public final boolean zzd() {
        return this.zzg;
    }

    public void setOffset(long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("Payload offset must be positive or zero.");
        }
        if (getType() != 2 && getType() != 3) {
            throw new java.lang.IllegalArgumentException("Payload offset only support FILE or STREAM type.");
        }
        com.google.android.gms.nearby.connection.Payload.File file = this.zzd;
        if (file != null && j >= file.getSize()) {
            throw new java.lang.IllegalArgumentException("Payload offset should be smaller than the file size.");
        }
        this.zzf = j;
    }

    public static com.google.android.gms.nearby.connection.Payload fromFile(java.io.File file) throws java.io.FileNotFoundException {
        return zzb(com.google.android.gms.nearby.connection.Payload.File.zza(file, android.os.ParcelFileDescriptor.open(file, 268435456), file.length(), android.net.Uri.fromFile(file)), java.util.UUID.randomUUID().getLeastSignificantBits());
    }

    public static com.google.android.gms.nearby.connection.Payload fromStream(java.io.InputStream inputStream) {
        return zzc(com.google.android.gms.nearby.connection.Payload.Stream.zza(inputStream), java.util.UUID.randomUUID().getLeastSignificantBits());
    }
}
