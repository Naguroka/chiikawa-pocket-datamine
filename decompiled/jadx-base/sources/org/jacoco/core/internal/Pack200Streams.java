package org.jacoco.core.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class Pack200Streams {
    public static java.io.InputStream unpack(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.util.jar.JarOutputStream jarOutputStream = new java.util.jar.JarOutputStream(byteArrayOutputStream);
        try {
            java.lang.Class.forName("java.util.jar.Pack200$Unpacker").getMethod("unpack", java.io.InputStream.class, java.util.jar.JarOutputStream.class).invoke(java.lang.Class.forName("java.util.jar.Pack200").getMethod("newUnpacker", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]), new org.jacoco.core.internal.Pack200Streams.NoCloseInput(inputStream), jarOutputStream);
            jarOutputStream.finish();
            return new java.io.ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        } catch (java.lang.ClassNotFoundException e) {
            throw newIOException(e);
        } catch (java.lang.IllegalAccessException e2) {
            throw newIOException(e2);
        } catch (java.lang.NoSuchMethodException e3) {
            throw newIOException(e3);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            throw newIOException(e4.getCause());
        }
    }

    public static void pack(byte[] bArr, java.io.OutputStream outputStream) throws java.io.IOException {
        java.util.jar.JarInputStream jarInputStream = new java.util.jar.JarInputStream(new java.io.ByteArrayInputStream(bArr));
        try {
            java.lang.Class.forName("java.util.jar.Pack200$Packer").getMethod("pack", java.util.jar.JarInputStream.class, java.io.OutputStream.class).invoke(java.lang.Class.forName("java.util.jar.Pack200").getMethod("newPacker", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]), jarInputStream, outputStream);
        } catch (java.lang.ClassNotFoundException e) {
            throw newIOException(e);
        } catch (java.lang.IllegalAccessException e2) {
            throw newIOException(e2);
        } catch (java.lang.NoSuchMethodException e3) {
            throw newIOException(e3);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            throw newIOException(e4.getCause());
        }
    }

    private static java.io.IOException newIOException(java.lang.Throwable th) {
        java.io.IOException iOException = new java.io.IOException();
        iOException.initCause(th);
        return iOException;
    }

    private static class NoCloseInput extends java.io.FilterInputStream {
        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
        }

        protected NoCloseInput(java.io.InputStream inputStream) {
            super(inputStream);
        }
    }

    private Pack200Streams() {
    }
}
