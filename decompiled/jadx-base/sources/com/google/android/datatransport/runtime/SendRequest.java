package com.google.android.datatransport.runtime;

/* JADX INFO: loaded from: classes4.dex */
abstract class SendRequest {
    public abstract com.google.android.datatransport.Encoding getEncoding();

    abstract com.google.android.datatransport.Event<?> getEvent();

    abstract com.google.android.datatransport.Transformer<?, byte[]> getTransformer();

    public abstract com.google.android.datatransport.runtime.TransportContext getTransportContext();

    public abstract java.lang.String getTransportName();

    SendRequest() {
    }

    public byte[] getPayload() {
        return getTransformer().apply(getEvent().getPayload());
    }

    public static com.google.android.datatransport.runtime.SendRequest.Builder builder() {
        return new com.google.android.datatransport.runtime.AutoValue_SendRequest.Builder();
    }

    public static abstract class Builder {
        public abstract com.google.android.datatransport.runtime.SendRequest build();

        abstract com.google.android.datatransport.runtime.SendRequest.Builder setEncoding(com.google.android.datatransport.Encoding encoding);

        abstract com.google.android.datatransport.runtime.SendRequest.Builder setEvent(com.google.android.datatransport.Event<?> event);

        abstract com.google.android.datatransport.runtime.SendRequest.Builder setTransformer(com.google.android.datatransport.Transformer<?, byte[]> transformer);

        public abstract com.google.android.datatransport.runtime.SendRequest.Builder setTransportContext(com.google.android.datatransport.runtime.TransportContext transportContext);

        public abstract com.google.android.datatransport.runtime.SendRequest.Builder setTransportName(java.lang.String str);

        public <T> com.google.android.datatransport.runtime.SendRequest.Builder setEvent(com.google.android.datatransport.Event<T> event, com.google.android.datatransport.Encoding encoding, com.google.android.datatransport.Transformer<T, byte[]> transformer) {
            setEvent(event);
            setEncoding(encoding);
            setTransformer(transformer);
            return this;
        }
    }
}
