package androidx.core.net;

/* JADX INFO: loaded from: classes.dex */
class DatagramSocketWrapper extends java.net.Socket {
    DatagramSocketWrapper(java.net.DatagramSocket datagramSocket, java.io.FileDescriptor fileDescriptor) throws java.net.SocketException {
        super(new androidx.core.net.DatagramSocketWrapper.DatagramSocketImplWrapper(datagramSocket, fileDescriptor));
    }

    private static class DatagramSocketImplWrapper extends java.net.SocketImpl {
        DatagramSocketImplWrapper(java.net.DatagramSocket datagramSocket, java.io.FileDescriptor fileDescriptor) {
            this.localport = datagramSocket.getLocalPort();
            this.fd = fileDescriptor;
        }

        @Override // java.net.SocketImpl
        protected void accept(java.net.SocketImpl socketImpl) throws java.io.IOException {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        protected int available() throws java.io.IOException {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        protected void bind(java.net.InetAddress inetAddress, int i) throws java.io.IOException {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        protected void close() throws java.io.IOException {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        protected void connect(java.lang.String str, int i) throws java.io.IOException {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        protected void connect(java.net.InetAddress inetAddress, int i) throws java.io.IOException {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        protected void create(boolean z) throws java.io.IOException {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        protected java.io.InputStream getInputStream() throws java.io.IOException {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        protected java.io.OutputStream getOutputStream() throws java.io.IOException {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        protected void listen(int i) throws java.io.IOException {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        protected void connect(java.net.SocketAddress socketAddress, int i) throws java.io.IOException {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        protected void sendUrgentData(int i) throws java.io.IOException {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.net.SocketOptions
        public java.lang.Object getOption(int i) throws java.net.SocketException {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.net.SocketOptions
        public void setOption(int i, java.lang.Object obj) throws java.net.SocketException {
            throw new java.lang.UnsupportedOperationException();
        }
    }
}
