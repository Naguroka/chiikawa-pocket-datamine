package com.google.common.hash;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.hash.ElementTypesAreNonnullByDefault
public final class Funnels {
    private Funnels() {
    }

    public static com.google.common.hash.Funnel<byte[]> byteArrayFunnel() {
        return com.google.common.hash.Funnels.ByteArrayFunnel.INSTANCE;
    }

    private enum ByteArrayFunnel implements com.google.common.hash.Funnel<byte[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public java.lang.String toString() {
            return "Funnels.byteArrayFunnel()";
        }

        @Override // com.google.common.hash.Funnel
        public void funnel(byte[] from, com.google.common.hash.PrimitiveSink into) {
            into.putBytes(from);
        }
    }

    public static com.google.common.hash.Funnel<java.lang.CharSequence> unencodedCharsFunnel() {
        return com.google.common.hash.Funnels.UnencodedCharsFunnel.INSTANCE;
    }

    private enum UnencodedCharsFunnel implements com.google.common.hash.Funnel<java.lang.CharSequence> {
        INSTANCE;

        @Override // java.lang.Enum
        public java.lang.String toString() {
            return "Funnels.unencodedCharsFunnel()";
        }

        @Override // com.google.common.hash.Funnel
        public void funnel(java.lang.CharSequence from, com.google.common.hash.PrimitiveSink into) {
            into.putUnencodedChars(from);
        }
    }

    public static com.google.common.hash.Funnel<java.lang.CharSequence> stringFunnel(java.nio.charset.Charset charset) {
        return new com.google.common.hash.Funnels.StringCharsetFunnel(charset);
    }

    private static class StringCharsetFunnel implements com.google.common.hash.Funnel<java.lang.CharSequence>, java.io.Serializable {
        private final java.nio.charset.Charset charset;

        StringCharsetFunnel(java.nio.charset.Charset charset) {
            this.charset = (java.nio.charset.Charset) com.google.common.base.Preconditions.checkNotNull(charset);
        }

        @Override // com.google.common.hash.Funnel
        public void funnel(java.lang.CharSequence from, com.google.common.hash.PrimitiveSink into) {
            into.putString(from, this.charset);
        }

        public java.lang.String toString() {
            return "Funnels.stringFunnel(" + this.charset.name() + ")";
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object o) {
            if (o instanceof com.google.common.hash.Funnels.StringCharsetFunnel) {
                return this.charset.equals(((com.google.common.hash.Funnels.StringCharsetFunnel) o).charset);
            }
            return false;
        }

        public int hashCode() {
            return com.google.common.hash.Funnels.StringCharsetFunnel.class.hashCode() ^ this.charset.hashCode();
        }

        java.lang.Object writeReplace() {
            return new com.google.common.hash.Funnels.StringCharsetFunnel.SerializedForm(this.charset);
        }

        private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
            throw new java.io.InvalidObjectException("Use SerializedForm");
        }

        private static class SerializedForm implements java.io.Serializable {
            private static final long serialVersionUID = 0;
            private final java.lang.String charsetCanonicalName;

            SerializedForm(java.nio.charset.Charset charset) {
                this.charsetCanonicalName = charset.name();
            }

            private java.lang.Object readResolve() {
                return com.google.common.hash.Funnels.stringFunnel(java.nio.charset.Charset.forName(this.charsetCanonicalName));
            }
        }
    }

    public static com.google.common.hash.Funnel<java.lang.Integer> integerFunnel() {
        return com.google.common.hash.Funnels.IntegerFunnel.INSTANCE;
    }

    private enum IntegerFunnel implements com.google.common.hash.Funnel<java.lang.Integer> {
        INSTANCE;

        @Override // java.lang.Enum
        public java.lang.String toString() {
            return "Funnels.integerFunnel()";
        }

        @Override // com.google.common.hash.Funnel
        public void funnel(java.lang.Integer from, com.google.common.hash.PrimitiveSink into) {
            into.putInt(from.intValue());
        }
    }

    public static <E> com.google.common.hash.Funnel<java.lang.Iterable<? extends E>> sequentialFunnel(com.google.common.hash.Funnel<E> elementFunnel) {
        return new com.google.common.hash.Funnels.SequentialFunnel(elementFunnel);
    }

    private static class SequentialFunnel<E> implements com.google.common.hash.Funnel<java.lang.Iterable<? extends E>>, java.io.Serializable {
        private final com.google.common.hash.Funnel<E> elementFunnel;

        SequentialFunnel(com.google.common.hash.Funnel<E> elementFunnel) {
            this.elementFunnel = (com.google.common.hash.Funnel) com.google.common.base.Preconditions.checkNotNull(elementFunnel);
        }

        @Override // com.google.common.hash.Funnel
        public void funnel(java.lang.Iterable<? extends E> from, com.google.common.hash.PrimitiveSink into) {
            java.util.Iterator<? extends E> it = from.iterator();
            while (it.hasNext()) {
                this.elementFunnel.funnel(it.next(), into);
            }
        }

        public java.lang.String toString() {
            return "Funnels.sequentialFunnel(" + this.elementFunnel + ")";
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object o) {
            if (o instanceof com.google.common.hash.Funnels.SequentialFunnel) {
                return this.elementFunnel.equals(((com.google.common.hash.Funnels.SequentialFunnel) o).elementFunnel);
            }
            return false;
        }

        public int hashCode() {
            return com.google.common.hash.Funnels.SequentialFunnel.class.hashCode() ^ this.elementFunnel.hashCode();
        }
    }

    public static com.google.common.hash.Funnel<java.lang.Long> longFunnel() {
        return com.google.common.hash.Funnels.LongFunnel.INSTANCE;
    }

    private enum LongFunnel implements com.google.common.hash.Funnel<java.lang.Long> {
        INSTANCE;

        @Override // java.lang.Enum
        public java.lang.String toString() {
            return "Funnels.longFunnel()";
        }

        @Override // com.google.common.hash.Funnel
        public void funnel(java.lang.Long from, com.google.common.hash.PrimitiveSink into) {
            into.putLong(from.longValue());
        }
    }

    public static java.io.OutputStream asOutputStream(com.google.common.hash.PrimitiveSink sink) {
        return new com.google.common.hash.Funnels.SinkAsStream(sink);
    }

    private static class SinkAsStream extends java.io.OutputStream {
        final com.google.common.hash.PrimitiveSink sink;

        SinkAsStream(com.google.common.hash.PrimitiveSink sink) {
            this.sink = (com.google.common.hash.PrimitiveSink) com.google.common.base.Preconditions.checkNotNull(sink);
        }

        @Override // java.io.OutputStream
        public void write(int b) {
            this.sink.putByte((byte) b);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bytes) {
            this.sink.putBytes(bytes);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bytes, int off, int len) {
            this.sink.putBytes(bytes, off, len);
        }

        public java.lang.String toString() {
            return "Funnels.asOutputStream(" + this.sink + ")";
        }
    }
}
