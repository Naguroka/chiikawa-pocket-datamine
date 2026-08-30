package com.google.android.datatransport.runtime;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_SendRequest extends com.google.android.datatransport.runtime.SendRequest {
    private final com.google.android.datatransport.Encoding encoding;
    private final com.google.android.datatransport.Event<?> event;
    private final com.google.android.datatransport.Transformer<?, byte[]> transformer;
    private final com.google.android.datatransport.runtime.TransportContext transportContext;
    private final java.lang.String transportName;

    private AutoValue_SendRequest(com.google.android.datatransport.runtime.TransportContext transportContext, java.lang.String str, com.google.android.datatransport.Event<?> event, com.google.android.datatransport.Transformer<?, byte[]> transformer, com.google.android.datatransport.Encoding encoding) {
        this.transportContext = transportContext;
        this.transportName = str;
        this.event = event;
        this.transformer = transformer;
        this.encoding = encoding;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public com.google.android.datatransport.runtime.TransportContext getTransportContext() {
        return this.transportContext;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public java.lang.String getTransportName() {
        return this.transportName;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    com.google.android.datatransport.Event<?> getEvent() {
        return this.event;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    com.google.android.datatransport.Transformer<?, byte[]> getTransformer() {
        return this.transformer;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public com.google.android.datatransport.Encoding getEncoding() {
        return this.encoding;
    }

    public java.lang.String toString() {
        return "SendRequest{transportContext=" + this.transportContext + ", transportName=" + this.transportName + ", event=" + this.event + ", transformer=" + this.transformer + ", encoding=" + this.encoding + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.runtime.SendRequest)) {
            return false;
        }
        com.google.android.datatransport.runtime.SendRequest sendRequest = (com.google.android.datatransport.runtime.SendRequest) obj;
        return this.transportContext.equals(sendRequest.getTransportContext()) && this.transportName.equals(sendRequest.getTransportName()) && this.event.equals(sendRequest.getEvent()) && this.transformer.equals(sendRequest.getTransformer()) && this.encoding.equals(sendRequest.getEncoding());
    }

    public int hashCode() {
        return ((((((((this.transportContext.hashCode() ^ 1000003) * 1000003) ^ this.transportName.hashCode()) * 1000003) ^ this.event.hashCode()) * 1000003) ^ this.transformer.hashCode()) * 1000003) ^ this.encoding.hashCode();
    }

    static final class Builder extends com.google.android.datatransport.runtime.SendRequest.Builder {
        private com.google.android.datatransport.Encoding encoding;
        private com.google.android.datatransport.Event<?> event;
        private com.google.android.datatransport.Transformer<?, byte[]> transformer;
        private com.google.android.datatransport.runtime.TransportContext transportContext;
        private java.lang.String transportName;

        Builder() {
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public com.google.android.datatransport.runtime.SendRequest.Builder setTransportContext(com.google.android.datatransport.runtime.TransportContext transportContext) {
            if (transportContext == null) {
                throw new java.lang.NullPointerException("Null transportContext");
            }
            this.transportContext = transportContext;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public com.google.android.datatransport.runtime.SendRequest.Builder setTransportName(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null transportName");
            }
            this.transportName = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        com.google.android.datatransport.runtime.SendRequest.Builder setEvent(com.google.android.datatransport.Event<?> event) {
            if (event == null) {
                throw new java.lang.NullPointerException("Null event");
            }
            this.event = event;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        com.google.android.datatransport.runtime.SendRequest.Builder setTransformer(com.google.android.datatransport.Transformer<?, byte[]> transformer) {
            if (transformer == null) {
                throw new java.lang.NullPointerException("Null transformer");
            }
            this.transformer = transformer;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        com.google.android.datatransport.runtime.SendRequest.Builder setEncoding(com.google.android.datatransport.Encoding encoding) {
            if (encoding == null) {
                throw new java.lang.NullPointerException("Null encoding");
            }
            this.encoding = encoding;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public com.google.android.datatransport.runtime.SendRequest build() {
            java.lang.String str = this.transportContext == null ? " transportContext" : "";
            if (this.transportName == null) {
                str = str + " transportName";
            }
            if (this.event == null) {
                str = str + " event";
            }
            if (this.transformer == null) {
                str = str + " transformer";
            }
            if (this.encoding == null) {
                str = str + " encoding";
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:" + str);
            }
            return new com.google.android.datatransport.runtime.AutoValue_SendRequest(this.transportContext, this.transportName, this.event, this.transformer, this.encoding);
        }
    }
}
