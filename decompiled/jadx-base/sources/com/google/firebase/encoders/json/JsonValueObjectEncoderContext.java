package com.google.firebase.encoders.json;

/* JADX INFO: loaded from: classes5.dex */
final class JsonValueObjectEncoderContext implements com.google.firebase.encoders.ObjectEncoderContext, com.google.firebase.encoders.ValueEncoderContext {
    private final com.google.firebase.encoders.ObjectEncoder<java.lang.Object> fallbackEncoder;
    private final boolean ignoreNullValues;
    private final android.util.JsonWriter jsonWriter;
    private final java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> objectEncoders;
    private final java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> valueEncoders;
    private com.google.firebase.encoders.json.JsonValueObjectEncoderContext childContext = null;
    private boolean active = true;

    JsonValueObjectEncoderContext(java.io.Writer writer, java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> map, java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> map2, com.google.firebase.encoders.ObjectEncoder<java.lang.Object> objectEncoder, boolean z) {
        this.jsonWriter = new android.util.JsonWriter(writer);
        this.objectEncoders = map;
        this.valueEncoders = map2;
        this.fallbackEncoder = objectEncoder;
        this.ignoreNullValues = z;
    }

    private JsonValueObjectEncoderContext(com.google.firebase.encoders.json.JsonValueObjectEncoderContext jsonValueObjectEncoderContext) {
        this.jsonWriter = jsonValueObjectEncoderContext.jsonWriter;
        this.objectEncoders = jsonValueObjectEncoderContext.objectEncoders;
        this.valueEncoders = jsonValueObjectEncoderContext.valueEncoders;
        this.fallbackEncoder = jsonValueObjectEncoderContext.fallbackEncoder;
        this.ignoreNullValues = jsonValueObjectEncoderContext.ignoreNullValues;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(java.lang.String str, java.lang.Object obj) throws java.io.IOException {
        if (this.ignoreNullValues) {
            return internalAddIgnoreNullValues(str, obj);
        }
        return internalAdd(str, obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(java.lang.String str, double d) throws java.io.IOException {
        maybeUnNest();
        this.jsonWriter.name(str);
        return add(d);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(java.lang.String str, int i) throws java.io.IOException {
        maybeUnNest();
        this.jsonWriter.name(str);
        return add(i);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(java.lang.String str, long j) throws java.io.IOException {
        maybeUnNest();
        this.jsonWriter.name(str);
        return add(j);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(java.lang.String str, boolean z) throws java.io.IOException {
        maybeUnNest();
        this.jsonWriter.name(str);
        return add(z);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, java.lang.Object obj) throws java.io.IOException {
        return add(fieldDescriptor.getName(), obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, float f) throws java.io.IOException {
        return add(fieldDescriptor.getName(), f);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, double d) throws java.io.IOException {
        return add(fieldDescriptor.getName(), d);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, int i) throws java.io.IOException {
        return add(fieldDescriptor.getName(), i);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, long j) throws java.io.IOException {
        return add(fieldDescriptor.getName(), j);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, boolean z) throws java.io.IOException {
        return add(fieldDescriptor.getName(), z);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext inline(java.lang.Object obj) throws java.io.IOException {
        return add(obj, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext nested(java.lang.String str) throws java.io.IOException {
        maybeUnNest();
        this.childContext = new com.google.firebase.encoders.json.JsonValueObjectEncoderContext(this);
        this.jsonWriter.name(str);
        this.jsonWriter.beginObject();
        return this.childContext;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext nested(com.google.firebase.encoders.FieldDescriptor fieldDescriptor) throws java.io.IOException {
        return nested(fieldDescriptor.getName());
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(java.lang.String str) throws java.io.IOException {
        maybeUnNest();
        this.jsonWriter.value(str);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(float f) throws java.io.IOException {
        maybeUnNest();
        this.jsonWriter.value(f);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(double d) throws java.io.IOException {
        maybeUnNest();
        this.jsonWriter.value(d);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(int i) throws java.io.IOException {
        maybeUnNest();
        this.jsonWriter.value(i);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(long j) throws java.io.IOException {
        maybeUnNest();
        this.jsonWriter.value(j);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(boolean z) throws java.io.IOException {
        maybeUnNest();
        this.jsonWriter.value(z);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(byte[] bArr) throws java.io.IOException {
        maybeUnNest();
        if (bArr == null) {
            this.jsonWriter.nullValue();
        } else {
            this.jsonWriter.value(android.util.Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(java.lang.Object obj, boolean z) throws java.io.IOException {
        int i = 0;
        if (z && cannotBeInline(obj)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new com.google.firebase.encoders.EncodingException(java.lang.String.format("%s cannot be encoded inline", objArr));
        }
        if (obj == null) {
            this.jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof java.lang.Number) {
            this.jsonWriter.value((java.lang.Number) obj);
            return this;
        }
        if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return add((byte[]) obj);
            }
            this.jsonWriter.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    this.jsonWriter.value(iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    add(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.jsonWriter.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.jsonWriter.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof java.lang.Number[]) {
                for (java.lang.Number number : (java.lang.Number[]) obj) {
                    add((java.lang.Object) number, false);
                }
            } else {
                for (java.lang.Object obj2 : (java.lang.Object[]) obj) {
                    add(obj2, false);
                }
            }
            this.jsonWriter.endArray();
            return this;
        }
        if (obj instanceof java.util.Collection) {
            this.jsonWriter.beginArray();
            java.util.Iterator it = ((java.util.Collection) obj).iterator();
            while (it.hasNext()) {
                add(it.next(), false);
            }
            this.jsonWriter.endArray();
            return this;
        }
        if (obj instanceof java.util.Map) {
            this.jsonWriter.beginObject();
            for (java.util.Map.Entry entry : ((java.util.Map) obj).entrySet()) {
                java.lang.Object key = entry.getKey();
                try {
                    add((java.lang.String) key, entry.getValue());
                } catch (java.lang.ClassCastException e) {
                    throw new com.google.firebase.encoders.EncodingException(java.lang.String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                }
            }
            this.jsonWriter.endObject();
            return this;
        }
        com.google.firebase.encoders.ObjectEncoder<?> objectEncoder = this.objectEncoders.get(obj.getClass());
        if (objectEncoder != null) {
            return doEncode(objectEncoder, obj, z);
        }
        com.google.firebase.encoders.ValueEncoder<?> valueEncoder = this.valueEncoders.get(obj.getClass());
        if (valueEncoder != null) {
            valueEncoder.encode(obj, this);
            return this;
        }
        if (obj instanceof java.lang.Enum) {
            if (obj instanceof com.google.firebase.encoders.json.NumberedEnum) {
                add(((com.google.firebase.encoders.json.NumberedEnum) obj).getNumber());
            } else {
                add(((java.lang.Enum) obj).name());
            }
            return this;
        }
        return doEncode(this.fallbackEncoder, obj, z);
    }

    com.google.firebase.encoders.json.JsonValueObjectEncoderContext doEncode(com.google.firebase.encoders.ObjectEncoder<java.lang.Object> objectEncoder, java.lang.Object obj, boolean z) throws java.io.IOException {
        if (!z) {
            this.jsonWriter.beginObject();
        }
        objectEncoder.encode(obj, this);
        if (!z) {
            this.jsonWriter.endObject();
        }
        return this;
    }

    private boolean cannotBeInline(java.lang.Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof java.util.Collection) || (obj instanceof java.util.Date) || (obj instanceof java.lang.Enum) || (obj instanceof java.lang.Number);
    }

    void close() throws java.io.IOException {
        maybeUnNest();
        this.jsonWriter.flush();
    }

    private void maybeUnNest() throws java.io.IOException {
        if (!this.active) {
            throw new java.lang.IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        com.google.firebase.encoders.json.JsonValueObjectEncoderContext jsonValueObjectEncoderContext = this.childContext;
        if (jsonValueObjectEncoderContext != null) {
            jsonValueObjectEncoderContext.maybeUnNest();
            this.childContext.active = false;
            this.childContext = null;
            this.jsonWriter.endObject();
        }
    }

    private com.google.firebase.encoders.json.JsonValueObjectEncoderContext internalAdd(java.lang.String str, java.lang.Object obj) throws com.google.firebase.encoders.EncodingException, java.io.IOException {
        maybeUnNest();
        this.jsonWriter.name(str);
        if (obj == null) {
            this.jsonWriter.nullValue();
            return this;
        }
        return add(obj, false);
    }

    private com.google.firebase.encoders.json.JsonValueObjectEncoderContext internalAddIgnoreNullValues(java.lang.String str, java.lang.Object obj) throws com.google.firebase.encoders.EncodingException, java.io.IOException {
        if (obj == null) {
            return this;
        }
        maybeUnNest();
        this.jsonWriter.name(str);
        return add(obj, false);
    }
}
