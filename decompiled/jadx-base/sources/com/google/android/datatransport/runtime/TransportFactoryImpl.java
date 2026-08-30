package com.google.android.datatransport.runtime;

/* JADX INFO: loaded from: classes4.dex */
final class TransportFactoryImpl implements com.google.android.datatransport.TransportFactory {
    private final java.util.Set<com.google.android.datatransport.Encoding> supportedPayloadEncodings;
    private final com.google.android.datatransport.runtime.TransportContext transportContext;
    private final com.google.android.datatransport.runtime.TransportInternal transportInternal;

    TransportFactoryImpl(java.util.Set<com.google.android.datatransport.Encoding> set, com.google.android.datatransport.runtime.TransportContext transportContext, com.google.android.datatransport.runtime.TransportInternal transportInternal) {
        this.supportedPayloadEncodings = set;
        this.transportContext = transportContext;
        this.transportInternal = transportInternal;
    }

    @Override // com.google.android.datatransport.TransportFactory
    public <T> com.google.android.datatransport.Transport<T> getTransport(java.lang.String str, java.lang.Class<T> cls, com.google.android.datatransport.Transformer<T, byte[]> transformer) {
        return getTransport(str, cls, com.google.android.datatransport.Encoding.of("proto"), transformer);
    }

    @Override // com.google.android.datatransport.TransportFactory
    public <T> com.google.android.datatransport.Transport<T> getTransport(java.lang.String str, java.lang.Class<T> cls, com.google.android.datatransport.Encoding encoding, com.google.android.datatransport.Transformer<T, byte[]> transformer) {
        if (!this.supportedPayloadEncodings.contains(encoding)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("%s is not supported byt this factory. Supported encodings are: %s.", encoding, this.supportedPayloadEncodings));
        }
        return new com.google.android.datatransport.runtime.TransportImpl(this.transportContext, str, encoding, transformer, this.transportInternal);
    }
}
