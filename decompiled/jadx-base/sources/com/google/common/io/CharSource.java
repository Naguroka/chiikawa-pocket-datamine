package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
public abstract class CharSource {
    public abstract java.io.Reader openStream() throws java.io.IOException;

    protected CharSource() {
    }

    public com.google.common.io.ByteSource asByteSource(java.nio.charset.Charset charset) {
        return new com.google.common.io.CharSource.AsByteSource(charset);
    }

    public java.io.BufferedReader openBufferedStream() throws java.io.IOException {
        java.io.Reader readerOpenStream = openStream();
        if (readerOpenStream instanceof java.io.BufferedReader) {
            return (java.io.BufferedReader) readerOpenStream;
        }
        return new java.io.BufferedReader(readerOpenStream);
    }

    public com.google.common.base.Optional<java.lang.Long> lengthIfKnown() {
        return com.google.common.base.Optional.absent();
    }

    public long length() throws java.lang.Throwable {
        com.google.common.base.Optional<java.lang.Long> optionalLengthIfKnown = lengthIfKnown();
        if (optionalLengthIfKnown.isPresent()) {
            return optionalLengthIfKnown.get().longValue();
        }
        com.google.common.io.Closer closerCreate = com.google.common.io.Closer.create();
        try {
            long jCountBySkipping = countBySkipping((java.io.Reader) closerCreate.register(openStream()));
            closerCreate.close();
            return jCountBySkipping;
        } catch (java.lang.Throwable th) {
            try {
                throw closerCreate.rethrow(th);
            } catch (java.lang.Throwable th2) {
                closerCreate.close();
                throw th2;
            }
        }
    }

    private long countBySkipping(java.io.Reader reader) throws java.io.IOException {
        long j = 0;
        while (true) {
            long jSkip = reader.skip(Long.MAX_VALUE);
            if (jSkip == 0) {
                return j;
            }
            j += jSkip;
        }
    }

    public long copyTo(java.lang.Appendable appendable) throws java.lang.Throwable {
        com.google.common.base.Preconditions.checkNotNull(appendable);
        com.google.common.io.Closer closerCreate = com.google.common.io.Closer.create();
        try {
            long jCopy = com.google.common.io.CharStreams.copy((java.io.Reader) closerCreate.register(openStream()), appendable);
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

    public long copyTo(com.google.common.io.CharSink sink) throws java.lang.Throwable {
        com.google.common.base.Preconditions.checkNotNull(sink);
        com.google.common.io.Closer closerCreate = com.google.common.io.Closer.create();
        try {
            long jCopy = com.google.common.io.CharStreams.copy((java.io.Reader) closerCreate.register(openStream()), (java.io.Writer) closerCreate.register(sink.openStream()));
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

    public java.lang.String read() throws java.lang.Throwable {
        com.google.common.io.Closer closerCreate = com.google.common.io.Closer.create();
        try {
            java.lang.String string = com.google.common.io.CharStreams.toString((java.io.Reader) closerCreate.register(openStream()));
            closerCreate.close();
            return string;
        } catch (java.lang.Throwable th) {
            try {
                throw closerCreate.rethrow(th);
            } catch (java.lang.Throwable th2) {
                closerCreate.close();
                throw th2;
            }
        }
    }

    @javax.annotation.CheckForNull
    public java.lang.String readFirstLine() throws java.lang.Throwable {
        com.google.common.io.Closer closerCreate = com.google.common.io.Closer.create();
        try {
            java.lang.String line = ((java.io.BufferedReader) closerCreate.register(openBufferedStream())).readLine();
            closerCreate.close();
            return line;
        } catch (java.lang.Throwable th) {
            try {
                throw closerCreate.rethrow(th);
            } catch (java.lang.Throwable th2) {
                closerCreate.close();
                throw th2;
            }
        }
    }

    public com.google.common.collect.ImmutableList<java.lang.String> readLines() throws java.lang.Throwable {
        com.google.common.io.Closer closerCreate = com.google.common.io.Closer.create();
        try {
            java.io.BufferedReader bufferedReader = (java.io.BufferedReader) closerCreate.register(openBufferedStream());
            java.util.ArrayList arrayListNewArrayList = com.google.common.collect.Lists.newArrayList();
            while (true) {
                java.lang.String line = bufferedReader.readLine();
                if (line != null) {
                    arrayListNewArrayList.add(line);
                } else {
                    com.google.common.collect.ImmutableList<java.lang.String> immutableListCopyOf = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) arrayListNewArrayList);
                    closerCreate.close();
                    return immutableListCopyOf;
                }
            }
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
    public <T> T readLines(com.google.common.io.LineProcessor<T> lineProcessor) throws java.lang.Throwable {
        com.google.common.base.Preconditions.checkNotNull(lineProcessor);
        com.google.common.io.Closer closerCreate = com.google.common.io.Closer.create();
        try {
            T t = (T) com.google.common.io.CharStreams.readLines((java.io.Reader) closerCreate.register(openStream()), lineProcessor);
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

    public boolean isEmpty() throws java.lang.Throwable {
        com.google.common.base.Optional<java.lang.Long> optionalLengthIfKnown = lengthIfKnown();
        if (optionalLengthIfKnown.isPresent()) {
            return optionalLengthIfKnown.get().longValue() == 0;
        }
        com.google.common.io.Closer closerCreate = com.google.common.io.Closer.create();
        try {
            boolean z = ((java.io.Reader) closerCreate.register(openStream())).read() == -1;
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

    public static com.google.common.io.CharSource concat(java.lang.Iterable<? extends com.google.common.io.CharSource> sources) {
        return new com.google.common.io.CharSource.ConcatenatedCharSource(sources);
    }

    public static com.google.common.io.CharSource concat(java.util.Iterator<? extends com.google.common.io.CharSource> sources) {
        return concat(com.google.common.collect.ImmutableList.copyOf(sources));
    }

    public static com.google.common.io.CharSource concat(com.google.common.io.CharSource... sources) {
        return concat(com.google.common.collect.ImmutableList.copyOf(sources));
    }

    public static com.google.common.io.CharSource wrap(java.lang.CharSequence charSequence) {
        if (charSequence instanceof java.lang.String) {
            return new com.google.common.io.CharSource.StringCharSource((java.lang.String) charSequence);
        }
        return new com.google.common.io.CharSource.CharSequenceCharSource(charSequence);
    }

    public static com.google.common.io.CharSource empty() {
        return com.google.common.io.CharSource.EmptyCharSource.INSTANCE;
    }

    private final class AsByteSource extends com.google.common.io.ByteSource {
        final java.nio.charset.Charset charset;

        AsByteSource(java.nio.charset.Charset charset) {
            this.charset = (java.nio.charset.Charset) com.google.common.base.Preconditions.checkNotNull(charset);
        }

        @Override // com.google.common.io.ByteSource
        public com.google.common.io.CharSource asCharSource(java.nio.charset.Charset charset) {
            if (charset.equals(this.charset)) {
                return com.google.common.io.CharSource.this;
            }
            return super.asCharSource(charset);
        }

        @Override // com.google.common.io.ByteSource
        public java.io.InputStream openStream() throws java.io.IOException {
            return new com.google.common.io.ReaderInputStream(com.google.common.io.CharSource.this.openStream(), this.charset, 8192);
        }

        public java.lang.String toString() {
            return com.google.common.io.CharSource.this.toString() + ".asByteSource(" + this.charset + ")";
        }
    }

    private static class CharSequenceCharSource extends com.google.common.io.CharSource {
        private static final com.google.common.base.Splitter LINE_SPLITTER = com.google.common.base.Splitter.onPattern("\r\n|\n|\r");
        protected final java.lang.CharSequence seq;

        protected CharSequenceCharSource(java.lang.CharSequence seq) {
            this.seq = (java.lang.CharSequence) com.google.common.base.Preconditions.checkNotNull(seq);
        }

        @Override // com.google.common.io.CharSource
        public java.io.Reader openStream() {
            return new com.google.common.io.CharSequenceReader(this.seq);
        }

        @Override // com.google.common.io.CharSource
        public java.lang.String read() {
            return this.seq.toString();
        }

        @Override // com.google.common.io.CharSource
        public boolean isEmpty() {
            return this.seq.length() == 0;
        }

        @Override // com.google.common.io.CharSource
        public long length() {
            return this.seq.length();
        }

        @Override // com.google.common.io.CharSource
        public com.google.common.base.Optional<java.lang.Long> lengthIfKnown() {
            return com.google.common.base.Optional.of(java.lang.Long.valueOf(this.seq.length()));
        }

        private java.util.Iterator<java.lang.String> linesIterator() {
            return new com.google.common.collect.AbstractIterator<java.lang.String>() { // from class: com.google.common.io.CharSource.CharSequenceCharSource.1
                java.util.Iterator<java.lang.String> lines;

                {
                    this.lines = com.google.common.io.CharSource.CharSequenceCharSource.LINE_SPLITTER.split(com.google.common.io.CharSource.CharSequenceCharSource.this.seq).iterator();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                @javax.annotation.CheckForNull
                public java.lang.String computeNext() {
                    if (this.lines.hasNext()) {
                        java.lang.String next = this.lines.next();
                        if (this.lines.hasNext() || !next.isEmpty()) {
                            return next;
                        }
                    }
                    return endOfData();
                }
            };
        }

        @Override // com.google.common.io.CharSource
        @javax.annotation.CheckForNull
        public java.lang.String readFirstLine() {
            java.util.Iterator<java.lang.String> itLinesIterator = linesIterator();
            if (itLinesIterator.hasNext()) {
                return itLinesIterator.next();
            }
            return null;
        }

        @Override // com.google.common.io.CharSource
        public com.google.common.collect.ImmutableList<java.lang.String> readLines() {
            return com.google.common.collect.ImmutableList.copyOf(linesIterator());
        }

        @Override // com.google.common.io.CharSource
        @com.google.common.io.ParametricNullness
        public <T> T readLines(com.google.common.io.LineProcessor<T> processor) throws java.io.IOException {
            java.util.Iterator<java.lang.String> itLinesIterator = linesIterator();
            while (itLinesIterator.hasNext() && processor.processLine(itLinesIterator.next())) {
            }
            return processor.getResult();
        }

        public java.lang.String toString() {
            return "CharSource.wrap(" + com.google.common.base.Ascii.truncate(this.seq, 30, "...") + ")";
        }
    }

    private static class StringCharSource extends com.google.common.io.CharSource.CharSequenceCharSource {
        protected StringCharSource(java.lang.String seq) {
            super(seq);
        }

        @Override // com.google.common.io.CharSource.CharSequenceCharSource, com.google.common.io.CharSource
        public java.io.Reader openStream() {
            return new java.io.StringReader((java.lang.String) this.seq);
        }

        @Override // com.google.common.io.CharSource
        public long copyTo(java.lang.Appendable appendable) throws java.io.IOException {
            appendable.append(this.seq);
            return this.seq.length();
        }

        @Override // com.google.common.io.CharSource
        public long copyTo(com.google.common.io.CharSink sink) throws java.lang.Throwable {
            com.google.common.base.Preconditions.checkNotNull(sink);
            com.google.common.io.Closer closerCreate = com.google.common.io.Closer.create();
            try {
                ((java.io.Writer) closerCreate.register(sink.openStream())).write((java.lang.String) this.seq);
                long length = this.seq.length();
                closerCreate.close();
                return length;
            } catch (java.lang.Throwable th) {
                try {
                    throw closerCreate.rethrow(th);
                } catch (java.lang.Throwable th2) {
                    closerCreate.close();
                    throw th2;
                }
            }
        }
    }

    private static final class EmptyCharSource extends com.google.common.io.CharSource.StringCharSource {
        private static final com.google.common.io.CharSource.EmptyCharSource INSTANCE = new com.google.common.io.CharSource.EmptyCharSource();

        @Override // com.google.common.io.CharSource.CharSequenceCharSource
        public java.lang.String toString() {
            return "CharSource.empty()";
        }

        private EmptyCharSource() {
            super("");
        }
    }

    private static final class ConcatenatedCharSource extends com.google.common.io.CharSource {
        private final java.lang.Iterable<? extends com.google.common.io.CharSource> sources;

        ConcatenatedCharSource(java.lang.Iterable<? extends com.google.common.io.CharSource> sources) {
            this.sources = (java.lang.Iterable) com.google.common.base.Preconditions.checkNotNull(sources);
        }

        @Override // com.google.common.io.CharSource
        public java.io.Reader openStream() throws java.io.IOException {
            return new com.google.common.io.MultiReader(this.sources.iterator());
        }

        @Override // com.google.common.io.CharSource
        public boolean isEmpty() throws java.io.IOException {
            java.util.Iterator<? extends com.google.common.io.CharSource> it = this.sources.iterator();
            while (it.hasNext()) {
                if (!it.next().isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.CharSource
        public com.google.common.base.Optional<java.lang.Long> lengthIfKnown() {
            java.util.Iterator<? extends com.google.common.io.CharSource> it = this.sources.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                com.google.common.base.Optional<java.lang.Long> optionalLengthIfKnown = it.next().lengthIfKnown();
                if (!optionalLengthIfKnown.isPresent()) {
                    return com.google.common.base.Optional.absent();
                }
                jLongValue += optionalLengthIfKnown.get().longValue();
            }
            return com.google.common.base.Optional.of(java.lang.Long.valueOf(jLongValue));
        }

        @Override // com.google.common.io.CharSource
        public long length() throws java.io.IOException {
            java.util.Iterator<? extends com.google.common.io.CharSource> it = this.sources.iterator();
            long length = 0;
            while (it.hasNext()) {
                length += it.next().length();
            }
            return length;
        }

        public java.lang.String toString() {
            return "CharSource.concat(" + this.sources + ")";
        }
    }
}
