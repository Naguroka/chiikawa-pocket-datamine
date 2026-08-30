package com.google.firebase.encoders;

/* JADX INFO: loaded from: classes5.dex */
public interface ObjectEncoderContext {
    com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, double d) throws java.io.IOException;

    com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, float f) throws java.io.IOException;

    com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, int i) throws java.io.IOException;

    com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, long j) throws java.io.IOException;

    com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, java.lang.Object obj) throws java.io.IOException;

    com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor fieldDescriptor, boolean z) throws java.io.IOException;

    @java.lang.Deprecated
    com.google.firebase.encoders.ObjectEncoderContext add(java.lang.String str, double d) throws java.io.IOException;

    @java.lang.Deprecated
    com.google.firebase.encoders.ObjectEncoderContext add(java.lang.String str, int i) throws java.io.IOException;

    @java.lang.Deprecated
    com.google.firebase.encoders.ObjectEncoderContext add(java.lang.String str, long j) throws java.io.IOException;

    @java.lang.Deprecated
    com.google.firebase.encoders.ObjectEncoderContext add(java.lang.String str, java.lang.Object obj) throws java.io.IOException;

    @java.lang.Deprecated
    com.google.firebase.encoders.ObjectEncoderContext add(java.lang.String str, boolean z) throws java.io.IOException;

    com.google.firebase.encoders.ObjectEncoderContext inline(java.lang.Object obj) throws java.io.IOException;

    com.google.firebase.encoders.ObjectEncoderContext nested(com.google.firebase.encoders.FieldDescriptor fieldDescriptor) throws java.io.IOException;

    com.google.firebase.encoders.ObjectEncoderContext nested(java.lang.String str) throws java.io.IOException;
}
