package com.google.android.datatransport;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Event<T> {
    public abstract java.lang.Integer getCode();

    public abstract com.google.android.datatransport.EventContext getEventContext();

    public abstract T getPayload();

    public abstract com.google.android.datatransport.Priority getPriority();

    public abstract com.google.android.datatransport.ProductData getProductData();

    public static <T> com.google.android.datatransport.Event<T> ofData(int i, T t, com.google.android.datatransport.ProductData productData, com.google.android.datatransport.EventContext eventContext) {
        return new com.google.android.datatransport.AutoValue_Event(java.lang.Integer.valueOf(i), t, com.google.android.datatransport.Priority.DEFAULT, productData, eventContext);
    }

    public static <T> com.google.android.datatransport.Event<T> ofData(int i, T t, com.google.android.datatransport.ProductData productData) {
        return new com.google.android.datatransport.AutoValue_Event(java.lang.Integer.valueOf(i), t, com.google.android.datatransport.Priority.DEFAULT, productData, null);
    }

    public static <T> com.google.android.datatransport.Event<T> ofData(int i, T t, com.google.android.datatransport.EventContext eventContext) {
        return new com.google.android.datatransport.AutoValue_Event(java.lang.Integer.valueOf(i), t, com.google.android.datatransport.Priority.DEFAULT, null, eventContext);
    }

    public static <T> com.google.android.datatransport.Event<T> ofData(int i, T t) {
        return new com.google.android.datatransport.AutoValue_Event(java.lang.Integer.valueOf(i), t, com.google.android.datatransport.Priority.DEFAULT, null, null);
    }

    public static <T> com.google.android.datatransport.Event<T> ofData(T t, com.google.android.datatransport.ProductData productData, com.google.android.datatransport.EventContext eventContext) {
        return new com.google.android.datatransport.AutoValue_Event(null, t, com.google.android.datatransport.Priority.DEFAULT, productData, eventContext);
    }

    public static <T> com.google.android.datatransport.Event<T> ofData(T t, com.google.android.datatransport.ProductData productData) {
        return new com.google.android.datatransport.AutoValue_Event(null, t, com.google.android.datatransport.Priority.DEFAULT, productData, null);
    }

    public static <T> com.google.android.datatransport.Event<T> ofData(T t, com.google.android.datatransport.EventContext eventContext) {
        return new com.google.android.datatransport.AutoValue_Event(null, t, com.google.android.datatransport.Priority.DEFAULT, null, eventContext);
    }

    public static <T> com.google.android.datatransport.Event<T> ofData(T t) {
        return new com.google.android.datatransport.AutoValue_Event(null, t, com.google.android.datatransport.Priority.DEFAULT, null, null);
    }

    public static <T> com.google.android.datatransport.Event<T> ofTelemetry(int i, T t, com.google.android.datatransport.ProductData productData, com.google.android.datatransport.EventContext eventContext) {
        return new com.google.android.datatransport.AutoValue_Event(java.lang.Integer.valueOf(i), t, com.google.android.datatransport.Priority.VERY_LOW, productData, eventContext);
    }

    public static <T> com.google.android.datatransport.Event<T> ofTelemetry(int i, T t, com.google.android.datatransport.ProductData productData) {
        return new com.google.android.datatransport.AutoValue_Event(java.lang.Integer.valueOf(i), t, com.google.android.datatransport.Priority.VERY_LOW, productData, null);
    }

    public static <T> com.google.android.datatransport.Event<T> ofTelemetry(int i, T t, com.google.android.datatransport.EventContext eventContext) {
        return new com.google.android.datatransport.AutoValue_Event(java.lang.Integer.valueOf(i), t, com.google.android.datatransport.Priority.VERY_LOW, null, eventContext);
    }

    public static <T> com.google.android.datatransport.Event<T> ofTelemetry(int i, T t) {
        return new com.google.android.datatransport.AutoValue_Event(java.lang.Integer.valueOf(i), t, com.google.android.datatransport.Priority.VERY_LOW, null, null);
    }

    public static <T> com.google.android.datatransport.Event<T> ofTelemetry(T t, com.google.android.datatransport.ProductData productData, com.google.android.datatransport.EventContext eventContext) {
        return new com.google.android.datatransport.AutoValue_Event(null, t, com.google.android.datatransport.Priority.VERY_LOW, productData, eventContext);
    }

    public static <T> com.google.android.datatransport.Event<T> ofTelemetry(T t, com.google.android.datatransport.ProductData productData) {
        return new com.google.android.datatransport.AutoValue_Event(null, t, com.google.android.datatransport.Priority.VERY_LOW, productData, null);
    }

    public static <T> com.google.android.datatransport.Event<T> ofTelemetry(T t, com.google.android.datatransport.EventContext eventContext) {
        return new com.google.android.datatransport.AutoValue_Event(null, t, com.google.android.datatransport.Priority.VERY_LOW, null, eventContext);
    }

    public static <T> com.google.android.datatransport.Event<T> ofTelemetry(T t) {
        return new com.google.android.datatransport.AutoValue_Event(null, t, com.google.android.datatransport.Priority.VERY_LOW, null, null);
    }

    public static <T> com.google.android.datatransport.Event<T> ofUrgent(int i, T t, com.google.android.datatransport.ProductData productData, com.google.android.datatransport.EventContext eventContext) {
        return new com.google.android.datatransport.AutoValue_Event(java.lang.Integer.valueOf(i), t, com.google.android.datatransport.Priority.HIGHEST, productData, eventContext);
    }

    public static <T> com.google.android.datatransport.Event<T> ofUrgent(int i, T t, com.google.android.datatransport.ProductData productData) {
        return new com.google.android.datatransport.AutoValue_Event(java.lang.Integer.valueOf(i), t, com.google.android.datatransport.Priority.HIGHEST, productData, null);
    }

    public static <T> com.google.android.datatransport.Event<T> ofUrgent(int i, T t, com.google.android.datatransport.EventContext eventContext) {
        return new com.google.android.datatransport.AutoValue_Event(java.lang.Integer.valueOf(i), t, com.google.android.datatransport.Priority.HIGHEST, null, eventContext);
    }

    public static <T> com.google.android.datatransport.Event<T> ofUrgent(int i, T t) {
        return new com.google.android.datatransport.AutoValue_Event(java.lang.Integer.valueOf(i), t, com.google.android.datatransport.Priority.HIGHEST, null, null);
    }

    public static <T> com.google.android.datatransport.Event<T> ofUrgent(T t, com.google.android.datatransport.ProductData productData, com.google.android.datatransport.EventContext eventContext) {
        return new com.google.android.datatransport.AutoValue_Event(null, t, com.google.android.datatransport.Priority.HIGHEST, productData, eventContext);
    }

    public static <T> com.google.android.datatransport.Event<T> ofUrgent(T t, com.google.android.datatransport.ProductData productData) {
        return new com.google.android.datatransport.AutoValue_Event(null, t, com.google.android.datatransport.Priority.HIGHEST, productData, null);
    }

    public static <T> com.google.android.datatransport.Event<T> ofUrgent(T t, com.google.android.datatransport.EventContext eventContext) {
        return new com.google.android.datatransport.AutoValue_Event(null, t, com.google.android.datatransport.Priority.HIGHEST, null, eventContext);
    }

    public static <T> com.google.android.datatransport.Event<T> ofUrgent(T t) {
        return new com.google.android.datatransport.AutoValue_Event(null, t, com.google.android.datatransport.Priority.HIGHEST, null, null);
    }
}
