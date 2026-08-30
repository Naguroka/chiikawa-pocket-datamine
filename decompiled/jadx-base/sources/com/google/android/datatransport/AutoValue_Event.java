package com.google.android.datatransport;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_Event<T> extends com.google.android.datatransport.Event<T> {
    private final java.lang.Integer code;
    private final com.google.android.datatransport.EventContext eventContext;
    private final T payload;
    private final com.google.android.datatransport.Priority priority;
    private final com.google.android.datatransport.ProductData productData;

    AutoValue_Event(java.lang.Integer num, T t, com.google.android.datatransport.Priority priority, com.google.android.datatransport.ProductData productData, com.google.android.datatransport.EventContext eventContext) {
        this.code = num;
        if (t == null) {
            throw new java.lang.NullPointerException("Null payload");
        }
        this.payload = t;
        if (priority == null) {
            throw new java.lang.NullPointerException("Null priority");
        }
        this.priority = priority;
        this.productData = productData;
        this.eventContext = eventContext;
    }

    @Override // com.google.android.datatransport.Event
    public java.lang.Integer getCode() {
        return this.code;
    }

    @Override // com.google.android.datatransport.Event
    public T getPayload() {
        return this.payload;
    }

    @Override // com.google.android.datatransport.Event
    public com.google.android.datatransport.Priority getPriority() {
        return this.priority;
    }

    @Override // com.google.android.datatransport.Event
    public com.google.android.datatransport.ProductData getProductData() {
        return this.productData;
    }

    @Override // com.google.android.datatransport.Event
    public com.google.android.datatransport.EventContext getEventContext() {
        return this.eventContext;
    }

    public java.lang.String toString() {
        return "Event{code=" + this.code + ", payload=" + this.payload + ", priority=" + this.priority + ", productData=" + this.productData + ", eventContext=" + this.eventContext + "}";
    }

    public boolean equals(java.lang.Object obj) {
        com.google.android.datatransport.ProductData productData;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.Event)) {
            return false;
        }
        com.google.android.datatransport.Event event = (com.google.android.datatransport.Event) obj;
        java.lang.Integer num = this.code;
        if (num != null ? num.equals(event.getCode()) : event.getCode() == null) {
            if (this.payload.equals(event.getPayload()) && this.priority.equals(event.getPriority()) && ((productData = this.productData) != null ? productData.equals(event.getProductData()) : event.getProductData() == null)) {
                com.google.android.datatransport.EventContext eventContext = this.eventContext;
                if (eventContext == null) {
                    if (event.getEventContext() == null) {
                        return true;
                    }
                } else if (eventContext.equals(event.getEventContext())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        java.lang.Integer num = this.code;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.payload.hashCode()) * 1000003) ^ this.priority.hashCode()) * 1000003;
        com.google.android.datatransport.ProductData productData = this.productData;
        int iHashCode2 = (iHashCode ^ (productData == null ? 0 : productData.hashCode())) * 1000003;
        com.google.android.datatransport.EventContext eventContext = this.eventContext;
        return iHashCode2 ^ (eventContext != null ? eventContext.hashCode() : 0);
    }
}
