package org.chromium.net;

/* JADX INFO: loaded from: classes6.dex */
public final class UploadDataProviders {

    private interface FileChannelProvider {
        java.nio.channels.FileChannel getChannel() throws java.io.IOException;
    }

    public static org.chromium.net.UploadDataProvider create(final java.io.File file) {
        return new org.chromium.net.UploadDataProviders.FileUploadProvider(new org.chromium.net.UploadDataProviders.FileChannelProvider() { // from class: org.chromium.net.UploadDataProviders.1
            @Override // org.chromium.net.UploadDataProviders.FileChannelProvider
            public java.nio.channels.FileChannel getChannel() throws java.io.IOException {
                return new java.io.FileInputStream(file).getChannel();
            }
        });
    }

    public static org.chromium.net.UploadDataProvider create(final android.os.ParcelFileDescriptor parcelFileDescriptor) {
        return new org.chromium.net.UploadDataProviders.FileUploadProvider(new org.chromium.net.UploadDataProviders.FileChannelProvider() { // from class: org.chromium.net.UploadDataProviders.2
            @Override // org.chromium.net.UploadDataProviders.FileChannelProvider
            public java.nio.channels.FileChannel getChannel() throws java.io.IOException {
                if (parcelFileDescriptor.getStatSize() != -1) {
                    return new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
                }
                parcelFileDescriptor.close();
                throw new java.lang.IllegalArgumentException("Not a file: " + parcelFileDescriptor);
            }
        });
    }

    public static org.chromium.net.UploadDataProvider create(java.nio.ByteBuffer byteBuffer) {
        return new org.chromium.net.UploadDataProviders.ByteBufferUploadProvider(byteBuffer.slice());
    }

    public static org.chromium.net.UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new org.chromium.net.UploadDataProviders.ByteBufferUploadProvider(java.nio.ByteBuffer.wrap(bArr, i, i2).slice());
    }

    public static org.chromium.net.UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }

    private static final class FileUploadProvider extends org.chromium.net.UploadDataProvider {
        private volatile java.nio.channels.FileChannel mChannel;
        private final java.lang.Object mLock;
        private final org.chromium.net.UploadDataProviders.FileChannelProvider mProvider;

        private FileUploadProvider(org.chromium.net.UploadDataProviders.FileChannelProvider fileChannelProvider) {
            this.mLock = new java.lang.Object();
            this.mProvider = fileChannelProvider;
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() throws java.io.IOException {
            return getChannel().size();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(org.chromium.net.UploadDataSink uploadDataSink, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            if (!byteBuffer.hasRemaining()) {
                throw new java.lang.IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            java.nio.channels.FileChannel channel = getChannel();
            int i = 0;
            while (i == 0) {
                int i2 = channel.read(byteBuffer);
                if (i2 == -1) {
                    break;
                } else {
                    i += i2;
                }
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(org.chromium.net.UploadDataSink uploadDataSink) throws java.io.IOException {
            getChannel().position(0L);
            uploadDataSink.onRewindSucceeded();
        }

        private java.nio.channels.FileChannel getChannel() throws java.io.IOException {
            if (this.mChannel == null) {
                synchronized (this.mLock) {
                    if (this.mChannel == null) {
                        this.mChannel = this.mProvider.getChannel();
                    }
                }
            }
            return this.mChannel;
        }

        @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            java.nio.channels.FileChannel fileChannel = this.mChannel;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }
    }

    private static final class ByteBufferUploadProvider extends org.chromium.net.UploadDataProvider {
        private final java.nio.ByteBuffer mUploadBuffer;

        private ByteBufferUploadProvider(java.nio.ByteBuffer byteBuffer) {
            this.mUploadBuffer = byteBuffer;
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return this.mUploadBuffer.limit();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(org.chromium.net.UploadDataSink uploadDataSink, java.nio.ByteBuffer byteBuffer) {
            if (!byteBuffer.hasRemaining()) {
                throw new java.lang.IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            if (byteBuffer.remaining() >= this.mUploadBuffer.remaining()) {
                byteBuffer.put(this.mUploadBuffer);
            } else {
                int iLimit = this.mUploadBuffer.limit();
                java.nio.ByteBuffer byteBuffer2 = this.mUploadBuffer;
                byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
                byteBuffer.put(this.mUploadBuffer);
                this.mUploadBuffer.limit(iLimit);
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(org.chromium.net.UploadDataSink uploadDataSink) {
            this.mUploadBuffer.position(0);
            uploadDataSink.onRewindSucceeded();
        }
    }

    private UploadDataProviders() {
    }
}
