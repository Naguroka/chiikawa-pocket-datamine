package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
public abstract class ByteSource {
    public abstract java.io.InputStream openStream() throws java.io.IOException;

    protected ByteSource() {
    }

    public com.google.common.io.CharSource asCharSource(java.nio.charset.Charset charset) {
        return new com.google.common.io.ByteSource.AsCharSource(charset);
    }

    public java.io.InputStream openBufferedStream() throws java.io.IOException {
        java.io.InputStream inputStreamOpenStream = openStream();
        if (inputStreamOpenStream instanceof java.io.BufferedInputStream) {
            return (java.io.BufferedInputStream) inputStreamOpenStream;
        }
        return new java.io.BufferedInputStream(inputStreamOpenStream);
    }

    public com.google.common.io.ByteSource slice(long offset, long length) {
        return new com.google.common.io.ByteSource.SlicedByteSource(offset, length);
    }

    public boolean isEmpty() throws java.lang.Throwable {
        com.google.common.base.Optional<java.lang.Long> optionalSizeIfKnown = sizeIfKnown();
        if (optionalSizeIfKnown.isPresent()) {
            return optionalSizeIfKnown.get().longValue() == 0;
        }
        com.google.common.io.Closer closerCreate = com.google.common.io.Closer.create();
        try {
            boolean z = ((java.io.InputStream) closerCreate.register(openStream())).read() == -1;
            closerCreate.close();
            return z;
        } catch (java.lang.Throwable th) {
            try {
                throw closerCreate.rethrow(th);
            } catch (java.lang.Throwable th2) {
                closerCreate.close();
                throw th2;
            }
        }
    }

    public com.google.common.base.Optional<java.lang.Long> sizeIfKnown() {
        return com.google.common.base.Optional.absent();
    }

    public long size() throws java.lang.Throwable {
        com.google.common.base.Optional<java.lang.Long> optionalSizeIfKnown = sizeIfKnown();
        if (optionalSizeIfKnown.isPresent()) {
            return optionalSizeIfKnown.get().longValue();
        }
        com.google.common.io.Closer closerCreate = com.google.common.io.Closer.create();
        try {
            long jCountBySkipping = countBySkipping((java.io.InputStream) closerCreate.register(openStream()));
            closerCreate.close();
            return jCountBySkipping;
        } catch (java.io.IOException unused) {
            closerCreate.close();
            com.google.common.io.Closer closerCreate2 = com.google.common.io.Closer.create();
            try {
                long jExhaust = com.google.common.io.ByteStreams.exhaust((java.io.InputStream) closerCreate2.register(openStream()));
                closerCreate2.close();
                return jExhaust;
            } catch (java.lang.Throwable th) {
                try {
                    throw closerCreate2.rethrow(th);
                } catch (java.lang.Throwable th2) {
                    closerCreate2.close();
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            closerCreate.close();
            throw th3;
        }
    }

    private long countBySkipping(java.io.InputStream in) throws java.io.IOException {
        long j = 0;
        while (true) {
            long jSkipUpTo = com.google.common.io.ByteStreams.skipUpTo(in, 2147483647L);
            if (jSkipUpTo <= 0) {
                return j;
            }
            j += jSkipUpTo;
        }
    }

    public long copyTo(java.io.OutputStream output) throws java.lang.Throwable {
        com.google.common.base.Preconditions.checkNotNull(output);
        com.google.common.io.Closer closerCreate = com.google.common.io.Closer.create();
        try {
            long jCopy = com.google.common.io.ByteStreams.copy((java.io.InputStream) closerCreate.register(openStream()), output);
            closerCreate.close();
            return jCopy;
        } catch (java.lang.Throwable th) {
            try {
                throw closerCreate.rethrow(th);
            } catch (java.lang.Throwable th2) {
                closerCreate.close();
                throw th2;
            }
        }
    }

    public long copyTo(com.google.common.io.ByteSink sink) throws java.lang.Throwable {
        com.google.common.base.Preconditions.checkNotNull(sink);
        com.google.common.io.Closer closerCreate = com.google.common.io.Closer.create();
        try {
            long jCopy = com.google.common.io.ByteStreams.copy((java.io.InputStream) closerCreate.register(openStream()), (java.io.OutputStream) closerCreate.register(sink.openStream()));
            closerCreate.close();
            return jCopy;
        } catch (java.lang.Throwable th) {
            try {
                throw closerCreate.rethrow(th);
            } catch (java.lang.Throwable th2) {
                closerCreate.close();
                throw th2;
            }
        }
    }

    public byte[] read() throws java.lang.Throwable {
        byte[] byteArray;
        com.google.common.io.Closer closerCreate = com.google.common.io.Closer.create();
        try {
            java.io.InputStream inputStream = (java.io.InputStream) closerCreate.register(openStream());
            com.google.common.base.Optional<java.lang.Long> optionalSizeIfKnown = sizeIfKnown();
            if (optionalSizeIfKnown.isPresent()) {
                byteArray = com.google.common.io.ByteStreams.toByteArray(inputStream, optionalSizeIfKnown.get().longValue());
            } else {
                byteArray = com.google.common.io.ByteStreams.toByteArray(inputStream);
            }
            closerCreate.close();
            return byteArray;
        } catch (java.lang.Throwable th) {
            try {
                throw closerCreate.rethrow(th);
            } catch (java.lang.Throwable th2) {
                closerCreate.close();
                throw th2;
            }
        }
    }

    @com.google.common.io.ParametricNullness
    public <T> T read(com.google.common.io.ByteProcessor<T> byteProcessor) throws java.lang.Throwable {
        com.google.common.base.Preconditions.checkNotNull(byteProcessor);
        com.google.common.io.Closer closerCreate = com.google.common.io.Closer.create();
        try {
            T t = (T) com.google.common.io.ByteStreams.readBytes((java.io.InputStream) closerCreate.register(openStream()), byteProcessor);
            closerCreate.close();
            return t;
        } catch (java.lang.Throwable th) {
            try {
                throw closerCreate.rethrow(th);
            } catch (java.lang.Throwable th2) {
                closerCreate.close();
                throw th2;
            }
        }
    }

    public com.google.common.hash.HashCode hash(com.google.common.hash.HashFunction hashFunction) throws java.lang.Throwable {
        com.google.common.hash.Hasher hasherNewHasher = hashFunction.newHasher();
        copyTo(com.google.common.hash.Funnels.asOutputStream(hasherNewHasher));
        return hasherNewHasher.hash();
    }

    public boolean contentEquals(com.google.common.io.ByteSource other) throws java.lang.Throwable {
        int i;
        com.google.common.base.Preconditions.checkNotNull(other);
        byte[] bArrCreateBuffer = com.google.common.io.ByteStreams.createBuffer();
        byte[] bArrCreateBuffer2 = com.google.common.io.ByteStreams.createBuffer();
        com.google.common.io.Closer closerCreate = com.google.common.io.Closer.create();
        try {
            java.io.InputStream inputStream = (java.io.InputStream) closerCreate.register(openStream());
            java.io.InputStream inputStream2 = (java.io.InputStream) closerCreate.register(other.openStream());
            do {
                i = com.google.common.io.ByteStreams.read(inputStream, bArrCreateBuffer, 0, bArrCreateBuffer.length);
                if (i == com.google.common.io.ByteStreams.read(inputStream2, bArrCreateBuffer2, 0, bArrCreateBuffer2.length) && java.util.Arrays.equals(bArrCreateBuffer, bArrCreateBuffer2)) {
                }
                closerCreate.close();
                return false;
            } while (i == bArrCreateBuffer.length);
            closerCreate.close();
            return true;
        } catch (java.lang.Throwable th) {
            try {
                throw closerCreate.rethrow(th);
            } catch (java.lang.Throwable th2) {
                closerCreate.close();
                throw th2;
            }
        }
    }

    public static com.google.common.io.ByteSource concat(java.lang.Iterable<? extends com.google.common.io.ByteSource> sources) {
        return new com.google.common.io.ByteSource.ConcatenatedByteSource(sources);
    }

    public static com.google.common.io.ByteSource concat(java.util.Iterator<? extends com.google.common.io.ByteSource> sources) {
        return concat(com.google.common.collect.ImmutableList.copyOf(sources));
    }

    public static com.google.common.io.ByteSource concat(com.google.common.io.ByteSource... sources) {
        return concat(com.google.common.collect.ImmutableList.copyOf(sources));
    }

    public static com.google.common.io.ByteSource wrap(byte[] b) {
        return new com.google.common.io.ByteSource.ByteArrayByteSource(b);
    }

    public static com.google.common.io.ByteSource empty() {
        return com.google.common.io.ByteSource.EmptyByteSource.INSTANCE;
    }

    class AsCharSource extends com.google.common.io.CharSource {
        final java.nio.charset.Charset charset;

        AsCharSource(java.nio.charset.Charset charset) {
            this.charset = (java.nio.charset.Charset) com.google.common.base.Preconditions.checkNotNull(charset);
        }

        @Override // com.google.common.io.CharSource
        public com.google.common.io.ByteSource asByteSource(java.nio.charset.Charset charset) {
            if (charset.equals(this.charset)) {
                return com.google.common.io.ByteSource.this;
            }
            return super.asByteSource(charset);
        }

        @Override // com.google.common.io.CharSource
        public java.io.Reader openStream() throws java.io.IOException {
            return new java.io.InputStreamReader(com.google.common.io.ByteSource.this.openStream(), this.charset);
        }

        @Override // com.google.common.io.CharSource
        public java.lang.String read() throws java.io.IOException {
            return new java.lang.String(com.google.common.io.ByteSource.this.read(), this.charset);
        }

        public java.lang.String toString() {
            return com.google.common.io.ByteSource.this.toString() + ".asCharSource(" + this.charset + ")";
        }
    }

    private final class SlicedByteSource extends com.google.common.io.ByteSource {
        final long length;
        final long offset;

        SlicedByteSource(long offset, long length) {
            com.google.common.base.Preconditions.checkArgument(offset >= 0, "offset (%s) may not be negative", offset);
            com.google.common.base.Preconditions.checkArgument(length >= 0, "length (%s) may not be negative", length);
            this.offset = offset;
            this.length = length;
        }

        @Override // com.google.common.io.ByteSource
        public java.io.InputStream openStream() throws java.io.IOException {
            return sliceStream(com.google.common.io.ByteSource.this.openStream());
        }

        @Override // com.google.common.io.ByteSource
        public java.io.InputStream openBufferedStream() throws java.io.IOException {
            return sliceStream(com.google.common.io.ByteSource.this.openBufferedStream());
        }

        private java.io.InputStream sliceStream(java.io.InputStream in) throws java.lang.Throwable {
            long j = this.offset;
            if (j > 0) {
                try {
                    if (com.google.common.io.ByteStreams.skipUpTo(in, j) < this.offset) {
                        in.close();
                        return new java.io.ByteArrayInputStream(new byte[0]);
                    }
                } catch (java.lang.Throwable th) {
                    com.google.common.io.Closer closerCreate = com.google.common.io.Closer.create();
                    closerCreate.register(in);
                    try {
                        throw closerCreate.rethrow(th);
                    } catch (java.lang.Throwable th2) {
                        closerCreate.close();
                        throw th2;
                    }
                }
            }
            return com.google.common.io.ByteStreams.limit(in, this.length);
        }

        @Override // com.google.common.io.ByteSource
        public com.google.common.io.ByteSource slice(long offset, long length) {
            com.google.common.base.Preconditions.checkArgument(offset >= 0, "offset (%s) may not be negative", offset);
            com.google.common.base.Preconditions.checkArgument(length >= 0, "length (%s) may not be negative", length);
            long j = this.length - offset;
            if (j <= 0) {
                return com.google.common.io.ByteSource.empty();
            }
            return com.google.common.io.ByteSource.this.slice(this.offset + offset, java.lang.Math.min(length, j));
        }

        @Override // com.google.common.io.ByteSource
        public boolean isEmpty() throws java.io.IOException {
            return this.length == 0 || super.isEmpty();
        }

        @Override // com.google.common.io.ByteSource
        public com.google.common.base.Optional<java.lang.Long> sizeIfKnown() {
            com.google.common.base.Optional<java.lang.Long> optionalSizeIfKnown = com.google.common.io.ByteSource.this.sizeIfKnown();
            if (optionalSizeIfKnown.isPresent()) {
                long jLongValue = optionalSizeIfKnown.get().longValue();
                return com.google.common.base.Optional.of(java.lang.Long.valueOf(java.lang.Math.min(this.length, jLongValue - java.lang.Math.min(this.offset, jLongValue))));
            }
            return com.google.common.base.Optional.absent();
        }

        public java.lang.String toString() {
            return com.google.common.io.ByteSource.this.toString() + ".slice(" + this.offset + ", " + this.length + ")";
        }
    }

    private static class ByteArrayByteSource extends com.google.common.io.ByteSource {
        final byte[] bytes;
        final int length;
        final int offset;

        ByteArrayByteSource(byte[] bytes) {
            this(bytes, 0, bytes.length);
        }

        ByteArrayByteSource(byte[] bytes, int offset, int length) {
            this.bytes = bytes;
            this.offset = offset;
            this.length = length;
        }

        @Override // com.google.common.io.ByteSource
        public java.io.InputStream openStream() {
            return new java.io.ByteArrayInputStream(this.bytes, this.offset, this.length);
        }

        @Override // com.google.common.io.ByteSource
        public java.io.InputStream openBufferedStream() {
            return openStream();
        }

        @Override // com.google.common.io.ByteSource
        public boolean isEmpty() {
            return this.length == 0;
        }

        @Override // com.google.common.io.ByteSource
        public long size() {
            return this.length;
        }

        @Override // com.google.common.io.ByteSource
        public com.google.common.base.Optional<java.lang.Long> sizeIfKnown() {
            return com.google.common.base.Optional.of(java.lang.Long.valueOf(this.length));
        }

        @Override // com.google.common.io.ByteSource
        public byte[] read() {
            byte[] bArr = this.bytes;
            int i = this.offset;
            return java.util.Arrays.copyOfRange(bArr, i, this.length + i);
        }

        @Override // com.google.common.io.ByteSource
        @com.google.common.io.ParametricNullness
        public <T> T read(com.google.common.io.ByteProcessor<T> processor) throws java.io.IOException {
            processor.processBytes(this.bytes, this.offset, this.length);
            return processor.getResult();
        }

        @Override // com.google.common.io.ByteSource
        public long copyTo(java.io.OutputStream output) throws java.io.IOException {
            output.write(this.bytes, this.offset, this.length);
            return this.length;
        }

        @Override // com.google.common.io.ByteSource
        public com.google.common.hash.HashCode hash(com.google.common.hash.HashFunction hashFunction) throws java.io.IOException {
            return hashFunction.hashBytes(this.bytes, this.offset, this.length);
        }

        @Override // com.google.common.io.ByteSource
        public com.google.common.io.ByteSource slice(long offset, long length) {
            com.google.common.base.Preconditions.checkArgument(offset >= 0, "offset (%s) may not be negative", offset);
            com.google.common.base.Preconditions.checkArgument(length >= 0, "length (%s) may not be negative", length);
            long jMin = java.lang.Math.min(offset, this.length);
            return new com.google.common.io.ByteSource.ByteArrayByteSource(this.bytes, this.offset + ((int) jMin), (int) java.lang.Math.min(length, ((long) this.length) - jMin));
        }

        public java.lang.String toString() {
            return "ByteSource.wrap(" + com.google.common.base.Ascii.truncate(com.google.common.io.BaseEncoding.base16().encode(this.bytes, this.offset, this.length), 30, "...") + ")";
        }
    }

    private static final class EmptyByteSource extends com.google.common.io.ByteSource.ByteArrayByteSource {
        static final com.google.common.io.ByteSource.EmptyByteSource INSTANCE = new com.google.common.io.ByteSource.EmptyByteSource();

        @Override // com.google.common.io.ByteSource.ByteArrayByteSource
        public java.lang.String toString() {
            return "ByteSource.empty()";
        }

        EmptyByteSource() {
            super(new byte[0]);
        }

        @Override // com.google.common.io.ByteSource
        public com.google.common.io.CharSource asCharSource(java.nio.charset.Charset charset) {
            com.google.common.base.Preconditions.checkNotNull(charset);
            return com.google.common.io.CharSource.empty();
        }

        @Override // com.google.common.io.ByteSource.ByteArrayByteSource, com.google.common.io.ByteSource
        public byte[] read() {
            return this.bytes;
        }
    }

    private static final class ConcatenatedByteSource extends com.google.common.io.ByteSource {
        final java.lang.Iterable<? extends com.google.common.io.ByteSource> sources;

        ConcatenatedByteSource(java.lang.Iterable<? extends com.google.common.io.ByteSource> sources) {
            this.sources = (java.lang.Iterable) com.google.common.base.Preconditions.checkNotNull(sources);
        }

        @Override // com.google.common.io.ByteSource
        public java.io.InputStream openStream() throws java.io.IOException {
            return new com.google.common.io.MultiInputStream(this.sources.iterator());
        }

        @Override // com.google.common.io.ByteSource
        public boolean isEmpty() throws java.io.IOException {
            java.util.Iterator<? extends com.google.common.io.ByteSource> it = this.sources.iterator();
            while (it.hasNext()) {
                if (!it.next().isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.ByteSource
        public com.google.common.base.Optional<java.lang.Long> sizeIfKnown() {
            java.lang.Iterable<? extends com.google.common.io.ByteSource> iterable = this.sources;
            if (!(iterable instanceof java.util.Collection)) {
                return com.google.common.base.Optional.absent();
            }
            java.util.Iterator<? extends com.google.common.io.ByteSource> it = iterable.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                com.google.common.base.Optional<java.lang.Long> optionalSizeIfKnown = it.next().sizeIfKnown();
                if (!optionalSizeIfKnown.isPresent()) {
                    return com.google.common.base.Optional.absent();
                }
                jLongValue += optionalSizeIfKnown.get().longValue();
                if (jLongValue < 0) {
                    return com.google.common.base.Optional.of(Long.MAX_VALUE);
                }
            }
            return com.google.common.base.Optional.of(java.lang.Long.valueOf(jLongValue));
        }

        @Override // com.google.common.io.ByteSource
        public long size() throws java.io.IOException {
            java.util.Iterator<? extends com.google.common.io.ByteSource> it = this.sources.iterator();
            long size = 0;
            while (it.hasNext()) {
                size += it.next().size();
                if (size < 0) {
                    return Long.MAX_VALUE;
                }
            }
            return size;
        }

        public java.lang.String toString() {
            return "ByteSource.concat(" + this.sources + ")";
        }
    }
}
